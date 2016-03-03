package com.travis;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.standard.PrinterName;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;


public class ZebraEPL2JNLP {

	ZebraEPL2JNLP(String args) {    

	    // Create a new JFrame container. 
	    JFrame jfrm = new JFrame("A Simple Swing Application"); 
	 
	    // Give the frame an initial size. 
	    jfrm.setSize(275, 100); 
	 
	    // Terminate the program when the user closes the application. 
	    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 
	    // Create a text-based label. 
	    JLabel jlab = new JLabel("Printing...");
	 
	    // Add the label to the content pane. 
	    jfrm.add(jlab); 
	 
	    // Display the frame. 
	    jfrm.setVisible(true);
	    
//	    try {
//	    	Thread.sleep(1000);
//	    } catch (Exception e) {
//	    }
	    
	    
		
		


		

		
		
		System.setSecurityManager( null );
		//local zebra printing test 
		try {
			PrintService psZebra = null;
			String sPrinterName = null;
			PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
			for (int i = 0; i < services.length; i++) {
				PrintServiceAttribute attr = services[i].getAttribute(PrinterName.class);
	
				sPrinterName = ((PrinterName)attr).getValue();
		
				if (sPrinterName.toLowerCase().indexOf("zebra") >= 0) {
					psZebra = services[i];
					break;
				}
			}
			
			
			if (psZebra == null) {
				System.out.println("Zebra printer is not found. Please consult system department for further assistance.");
				
				String message = "Zebra printer is not found. Please consult system department for further assistance.";
				JOptionPane pane = new JOptionPane(message);
				JDialog dialog = pane.createDialog(new JFrame(), "Dilaog");
				dialog.show();
				
				return;
			}
//			System.out.println("Found printer: " + sPrinterName);
			
			
			ArrayList<String> barCodes = splitTokenizer(args, "@");
			for (String barCode : barCodes) {
				
				ArrayList<String> splitStr = splitTokenizer(barCode, ";");
				
				String newAddress1 = "";
				String newAddress2 = "";
				String newAddress3 = "";
				String newPostal = "";
				String changed = "";
				String redirectedByShipper = "";
				String redirectedByConsignee = "";
				String redirectedByName = "";
				String terminalNum = "";
				String referenceNum = "";

				String serviceType = "";
				String pickupShipperNum = "";

				String trackingNo = "";
				String s = ""; 
				
				newAddress1 = splitStr.get(0);
				newAddress2 = splitStr.get(1);
				newAddress3 = splitStr.get(2);
				newPostal = splitStr.get(3);
				changed = splitStr.get(4);
				redirectedByShipper = splitStr.get(5);
				redirectedByConsignee = splitStr.get(6);
				redirectedByName = splitStr.get(7);
				terminalNum = splitStr.get(8);
				referenceNum = splitStr.get(9);

				serviceType = splitStr.get(10);
				pickupShipperNum = splitStr.get(11);

				if (serviceType != null) {
					trackingNo = trackingNo + serviceType.trim().toUpperCase();
				}
				if (referenceNum != null) {
					trackingNo = trackingNo + readableFormatBySpace(referenceNum.trim(), 3);
				}
				if (pickupShipperNum != null && pickupShipperNum.trim().length() > 0 ) {
					trackingNo = trackingNo + " (" + pickupShipperNum.trim() + ")";
				}

//				String s = ""; 
//				s=s+"N\r\n";
//				s=s+"Q380,24\r\n";
//				s=s+"R203,20\r\n";
//				s=s+"S2\r\n";
//				s=s+"A0,0,0,2,3,2,N,\"00-0000-00\"\r\n";
//					s=s+"B8,140,0,UA0,2,3,100,B,\"00000000000\"\r\n";
//					s=s+"B10,260,0,3,2,4,50,N,\"00-0000-00\"\r\n";
//				s=s+"P1\r\n";
				

					s=s+"N\r\n";
					s=s+"I8,4,002\r\n"; //French Canadian
//					s=s+"I7,3,033\r\n"; //French 
//					s=s+"UP\r\n";
//					s=s+"Q380,24\r\n";
//					s=s+"R203,20\r\n";
//					s=s+"S2\r\n";

					s=s+"q800\r\n"; 
//					s=s+"A150,50,0,2,2,2,N,\"ADDRESS CORRECTION\"\r\n";
//					s=s+"A150,100,0,2,2,2,N,\"REVISION DE L’ADRESSE\"\r\n";
//					s=s+"A150,100,0,2,2,2,N,\"REVISION DE L\u2019ADRESSE\"\r\n";

					s=s+"A150,50,0,3,2,2,N,\"ADDRESS CORRECTION\"\r\n";
					s=s+"A150,100,0,3,2,2,N,\"REVISION DE LADRESSE\"\r\n";

					s=s+"A50,150,0,3,0,0,N,\"Canpar Tracking No/Code a barres:\"\r\n";
					s=s+"A100,200,0,3,0,0,N,\"" + trackingNo + "\"\r\n";
					
					if ( changed != null &&  changed.equalsIgnoreCase("true")) {
						s=s+"A50,250,0,3,0,0,N,\"CORRECTED/CORRIGE\"\r\n";
						s=s+"A50,3000,0,3,0,0,N,\"NAME/NOM:\"\r\n";
//						g.drawString("CORRECTED/CORRIGÉ", xstart, ystart + inc * yincrease); //2
//						inc++;
//						g.drawString("NAME/NOM: ", xstart, ystart + inc * yincrease); //3
					} else if ( redirectedByShipper != null &&  redirectedByShipper.equalsIgnoreCase("true")) {
						s=s+"A50,250,0,3,0,0,N,\"REDIRECTED BY: SHIPPER/REEXP PAR EXPEDITEUR\"\r\n";
						s=s+"A50,300,0,3,0,0,N,\"NAME/NOM:" + redirectedByName + "\"\r\n";
//						g.drawString("REDIRECTED BY: SHIPPER/RÉEXP PAR EXPÉDITEUR", xstart, ystart + inc * yincrease); //2
//						inc++;
//						g.drawString("NAME/NOM: " + redirectedByName, xstart, ystart + inc * yincrease); //3
					} else if ( redirectedByConsignee != null &&  redirectedByConsignee.equalsIgnoreCase("true")) {
						s=s+"A50,250,0,3,0,0,N,\"REDIRECTED BY: CONSIGNEE/REEXP PAR DESTINATAIRE\"\r\n";
						s=s+"A50,300,0,3,0,0,N,\"NAME/NOM:" + redirectedByName + "\"\r\n";
//						g.drawString("REDIRECTED BY: CONSIGNEE/RÉEXP PAR DESTINATAIRE", xstart, ystart + inc * yincrease); //2
//						inc++;
//						g.drawString("NAME/NOM: " + redirectedByName, xstart, ystart + inc * yincrease); //3
					} else {
						s=s+"A50,250,0,3,0,0,N,\"REDIRECTED BY/REEXP PAR: TERMINAL\"\r\n";
						s=s+"A50,300,0,3,0,0,N,\"NAME/NOM:\"\r\n";
//						g.drawString("REDIRECTED BY/RÉEXP PAR: TERMINAL", xstart, ystart + inc * yincrease); //2
//						inc++;
//						g.drawString("NAME/NOM: ", xstart, ystart + inc * yincrease); //3
					}

					
					s=s+"A50,350,0,3,0,0,N,\"LOCATION/LOCATION:    [Canpar Terminal #" + terminalNum + "]\"\r\n";

					s=s+"LO50,400,700,1\r\n";

					s=s+"A50,470,0,3,0,0,N,\"TO/A :\"\r\n";
					s=s+"A100,500,0,3,0,0,N,\"" + newAddress1 + "\"\r\n";
					s=s+"A100,530,0,3,0,0,N,\"" + newAddress2 + "\"\r\n";
					s=s+"A100,560,0,3,0,0,N,\"" + newAddress3 + "\"\r\n";
					
					s=s+"A400,650,0,5,0,0,N,\"" + newPostal.toUpperCase().substring(0,3) + " " + newPostal.toUpperCase().substring(3, newPostal.trim().length() ) + "\"\r\n";
					s=s+"P1\r\n";

//					g.drawString(newPostal.toUpperCase().substring(0,3) + "  " + newPostal.toUpperCase().substring(3, newPostal.trim().length() ), xstart + 500, ystart + inc * yincrease); //14

					DocPrintJob job = psZebra.createPrintJob();

					byte[] by = s.getBytes("UTF-8");
					DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;

					Doc doc = new SimpleDoc(by, flavor, null);
					
					job.print(doc, null);
					
					s="";
					
					
					
					
			} //for (String barCode : barCodes) {
	

			
			
		System.out.println("completed printing " + sPrinterName);
		
//		} catch (PrintException e) {
		} catch (Exception e) {	
			e.printStackTrace();
		}
	    
	    System.exit(0);

	}    

		
//		System.setSecurityManager( null );
//		//local zebra printing test 
//		try {
//			PrintService psZebra = null;
//			String sPrinterName = null;
//			PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
//			for (int i = 0; i < services.length; i++) {
//				PrintServiceAttribute attr = services[i].getAttribute(PrinterName.class);
//	
//				sPrinterName = ((PrinterName)attr).getValue();
//		
//				if (sPrinterName.toLowerCase().indexOf("zebra") >= 0) {
//					psZebra = services[i];
//					break;
//				}
//			}
//			
//			
//			if (psZebra == null) {
//				System.out.println("Zebra printer is not found.");
//				return;
//			}
//			
//			System.out.println("Found printer: " + sPrinterName);
//			DocPrintJob job = psZebra.createPrintJob();
//	
////		String s = ""; 
////		s=s+"N\r\n";
////		s=s+"Q380,24\r\n";
////		s=s+"R203,20\r\n";
////		s=s+"S2\r\n";
////		s=s+"A0,0,0,2,3,2,N,\"00-0000-00\"\r\n";
////			s=s+"B8,140,0,UA0,2,3,100,B,\"00000000000\"\r\n";
////			s=s+"B10,260,0,3,2,4,50,N,\"00-0000-00\"\r\n";
////		s=s+"P1\r\n";
//		
//
//			String s = ""; 
//			s=s+"N\r\n";
//			s=s+"I8,4,033\r\n";
//			s=s+"UP\r\n";
////			s=s+"Q380,24\r\n";
////			s=s+"R203,20\r\n";
////			s=s+"S2\r\n";
//
//			s=s+"q800\r\n"; 
////			s=s+"A150,50,0,2,2,2,N,\"ADDRESS CORRECTION\"\r\n";
//////			s=s+"A150,100,0,2,2,2,N,\"REVISION DE L’ADRESSE\"\r\n";
////			s=s+"A150,100,0,2,2,2,N,\"REVISION DE L\u2019ADRESSE\"\r\n";
//
//			s=s+"A150,50,0,4,0,0,N,\"ADDRESS CORRECTION\"\r\n";
//			s=s+"A150,100,0,4,0,0,N,\"REVISION DE L’ADRESSE\"\r\n";
//
//			s=s+"A50,150,0,3,0,0,N,\"Canpar Tracking No/Code à barres:...\"\r\n";
//			s=s+"A50,200,0,3,0,0,N,\"REDIRECTED BY: CONSIGNEE/RÉEXP PAR DESTINATAIRE...\"\r\n";
//			s=s+"A50,250,0,3,0,0,N,\"NAME/NOM:...\"\r\n";
//			s=s+"A50,300,0,3,0,0,N,\"LOCATION/LOCATION:    [Canpar Terminal #...\"\r\n";
//
//			s=s+"LO50,350,700,1\r\n";
//
//			s=s+"A50,420,0,3,0,0,N,\"TO/À :\"\r\n";
//			s=s+"A100,450,0,3,0,0,N,\"Address1...\"\r\n";
//			s=s+"A100,480,0,3,0,0,N,\"Address2...\"\r\n";
//			s=s+"A100,510,0,3,0,0,N,\"Address3...\"\r\n";
//			
//			s=s+"A400,600,0,5,0,0,N,\"L5C 4R9\"\r\n";
//			s=s+"P1\r\n";
//
//			
//		byte[] by = s.getBytes();
//		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
//
//		Doc doc = new SimpleDoc(by, flavor, null);
//		
//		job.print(doc, null);
//		
//		System.out.println("completed printing " + sPrinterName);
//		
//		} catch (PrintException e) {
//			
//			e.printStackTrace();
//		}

		
		

	public static void main(String[] args) {

		String message = "Zebra Testing...\n\n" + args[0]; // + ",,," + args[1];
		
		JOptionPane pane = new JOptionPane(message);
		JDialog dialog = pane.createDialog(new JFrame(), "Dilaog");
		dialog.show();

//		SwingUtilities.invokeLater(new Runnable() {    
//			public void run() {    
//				new ZebraTest(args[0]);    
//			}    
//		});

		new ZebraEPL2JNLP(args[0]);
		//String test = "1290 CENTRAL PKY W; ;MISSISSAUGA ON;L5C4R9;false;false;true;true;TRAVISS;422;1855090733;K;42299001@500-1290 CENTRAL PKY W; ;MISSISSAUGA ON;L5C4R8;true;false;false;false;TRAVIS;422;1855090741;K;42299001";
		//new ZebraTest(test);
		
	} //public static void main(String[] args) {


	public ArrayList<String> splitTokenizer(String str, String tokenizer) {
		
		ArrayList<String> splited = new ArrayList<String>();
		
		StringTokenizer strToken = new StringTokenizer(str, tokenizer); //","
		while (strToken.hasMoreElements()){
			splited.add(strToken.nextToken());
		}		
		
		return splited;
	}
	
	
	public static String readableFormatBySpace(String original, int number) {
		
		 //1. input validation
		 if ( number <= 1 ) return original;
		 if ( original == null || original.trim().length() < number  ) return original;
		 
		 String nweFormat = "";
		 
		 int size = original.length();
		 int total = size / number;
		 int i = 0;
		 int remainder = 0;
		 remainder = size - (total * number);
	
		 /*
		 if ( size % 3 == 0  ) {
			 total = size / 3;
		 } else {
			 total = size / 3 + 1;
		 }
		  */
	
		 //2. add up as much as you can
		 for (i=0; i<total;i++) {
			 nweFormat = nweFormat + " " + original.substring(i*number, i*number+number);
		 }
		 
		 //3. add up remainder
		 if ( remainder > 0 ) {
			 nweFormat = nweFormat + " " + original.substring(total * number);
		 }
			 
//		 System.out.println( nweFormat.trim() );
		 
			  
		return nweFormat.trim();
	} //public static String readableFormatBySpace(String original, int number) {

	
}
	

