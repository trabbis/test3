package com.travis;

import java.io.*;
import java.awt.*;
import java.awt.print.*;
import javax.print.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class ZebraEPL2 implements Printable{
	public ZebraEPL2() {
	/* Use the preEdefined flavor for a Printable from an
	* InputStream */
	DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
	/* Specify the type of the output stream */
	String psMimeType =
	DocFlavor.BYTE_ARRAY.POSTSCRIPT.getMimeType();
	/* Locate factory which can export a GIF image stream as
	Postscript */
	StreamPrintServiceFactory[] factories =
	StreamPrintServiceFactory.lookupStreamPrintServiceFactories(flavor, psMimeType);
	
	if (factories.length == 0) {
		System.err.println("No suitable factories");
		System.exit(0);
	} else {
		System.out.println("selected printer..." + factories[0].getClass());
	}
	
	try {
	/* Create a file for the exported postscript */
	FileOutputStream fos = new FileOutputStream("out.txt");
	/* Create a Stream printer for Postscript */
	StreamPrintService sps = factories[0].getPrintService(fos);
	/* Create and call a Print Job */
	DocPrintJob pj = sps.createPrintJob();
	PrintRequestAttributeSet
	aset = new HashPrintRequestAttributeSet();
	Doc doc = new SimpleDoc(this, flavor, null);
	pj.print(doc, aset);
	fos.close();
	} catch (PrintException pe) {
	System.err.println(pe);
	} catch (IOException ie) {
	System.err.println(ie);
	}
	}
	
	
	
	
	public int print(Graphics g,PageFormat pf,int pageIndex) {
		if (pageIndex == 0) {
		Graphics2D g2d= (Graphics2D)g;
		g2d.translate(pf.getImageableX(), pf.getImageableY());
		g2d.setColor(Color.black);
		g2d.drawString("example string", 250, 250);
		g2d.fillRect(0, 0, 200, 200);
		return Printable.PAGE_EXISTS;
		} else {
		return Printable.NO_SUCH_PAGE;
		}
		}
	
		public static void main(String args[]) {
//			Print2DtoStream sp = new Print2DtoStream();
			testZebra();
			
		}


		public static void testZebra1() {
			try {
		    // for desktop and tabletop printers
		    Socket clientSocket=new Socket("127.0.0.1",6101);

		    DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream() );
		    //The data being sent in the lines below illustrate CPCL  one can change the data for the corresponding 
		    //language being used (ZPL, EPL)   
		  
			String s = ""; 
			s=s+"N\r\n";
			s=s+"Q380,24\r\n";
			s=s+"R203,20\r\n";
			s=s+"S2\r\n";
			s=s+"A60,0,0,2,3,2,N,\"00-0000-00\"\r\n";
 			s=s+"B8,140,0,UA0,2,3,100,B,\"00000000000\"\r\n";
 			s=s+"B10,260,0,3,2,4,50,N,\"00-0000-00\"\r\n";
			s=s+"P1\r\n";
		    
		    
		    outToServer.writeBytes(s);

		    clientSocket.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}


		public static void testZebra() {
			try {
				PrintService psZebra = null;
				String sPrinterName = null;
				PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
				for (int i = 0; i < services.length; i++) {
					PrintServiceAttribute attr = services[i].getAttribute(PrinterName.class);
		//			System.out.println("selected printer..." + services[0].getName());
		
					sPrinterName = ((PrinterName)attr).getValue();
			
					if (sPrinterName.toLowerCase().indexOf("zebra") >= 0) {
						psZebra = services[i];
						break;
					}
				}
				
				
				if (psZebra == null) {
					System.out.println("Zebra printer is not found.");
					return;
				}
				
				System.out.println("Found printer: " + sPrinterName);
				DocPrintJob job = psZebra.createPrintJob();
		
				/*
			//String s = "^XA^FO5,40^BY3^B3,,30^FD123ABC^XZ"; // good 
//				String s = "^XA\n^FO5,40^BY3^B3,,\n30^FD123ABC\n^XZ"; // '\n' does not hurt
//				String s = "N" + "A50,0,0,1,1,1,N,\nExample 1\n" + "P1";
				String s = "N\nB10,10,0,3,3,7,200,B,\"998152-002\"\nP1";
				
				byte[] by = s.getBytes();
				DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
			// MIME type = "application/octet-stream", 
			// print data representation class name = "[B" (byte array).
				Doc doc = new SimpleDoc(by, flavor, null);
				job.print(doc, null);
			*/
			
				/*
			String s = ""; 
			s=s+"N\r\n";
			s=s+"Q380,24\r\n";
			s=s+"R203,20\r\n";
			s=s+"S2\r\n";
			s=s+"A60,0,0,2,3,2,N,\"00-0000-00\"\r\n";
 			s=s+"B8,140,0,UA0,2,3,100,B,\"00000000000\"\r\n";
 			s=s+"B10,260,0,3,2,4,50,N,\"00-0000-00\"\r\n";
			s=s+"P1\r\n";
			*/
				
					

				String s = ""; 
//				s=s+"N\r\n";
//				s=s+"Q380,24\r\n";
//				s=s+"R203,20\r\n";
//				s=s+"S2\r\n";
//				s=s+"A60,0,0,2,3,2,N,\"00-0000-00\"\r\n";
//	 			s=s+"B8,140,0,UA0,2,3,100,B,\"00000000000\"\r\n";
//	 			s=s+"B10,260,0,3,2,4,50,N,\"00-0000-00\"\r\n";
//				s=s+"P1\r\n";
				
				s=s+"N\r\n";
				s=s+"I8,A,002\r\n"; //French Canadian
//				s=s+"i4\r\n"; //Korean
//				s=s+"I7,3,033\r\n"; //French 
//				s=s+"UP\r\n";
//				s=s+"Q380,24\r\n";
//				s=s+"R203,20\r\n";
//				s=s+"S2\r\n";

				s=s+"q800\r\n"; 
//				s=s+"A150,50,0,2,2,2,N,\"ADDRESS CORRECTION\"\r\n";
//				s=s+"A150,100,0,2,2,2,N,\"REVISION DE L’ADRESSE\"\r\n";
//				s=s+"A150,100,0,2,2,2,N,\"REVISION DE L\u2019ADRESSE\"\r\n";

				s=s+"A150,50,0,3,2,2,N,\"CORRECTED/CORRIGÉ\"\r\n";
				s=s+"A150,100,0,3,2,2,N,\"REVISION DE L'ADRESSE\"\r\n";
//				s=s+"A150,200,0,3,2,2,N,\"BOîTE PAS\"\r\n";
//				s=s+"A150,300,0,3,2,2,N,\"Code à barres\"\r\n";
//				s=s+"A150,400,0,3,2,2,N,\"TO/À\"\r\n";
				s=s+"A150,200,0,3,2,2,N,\"à â ä æ ç é è ê ë\"\r\n";
				s=s+"A150,300,0,3,2,2,N,\"î ï ô œ ù û ü « €\"\r\n";
				s=s+"P1\r\n";

				//à â ä æ ç é è ê ë î ï ô œ ù û ü « €
				
//				L’ADRESSE
				
				
//	            PrintService service = PrintServiceLookup.lookupDefaultPrintService();
//	            System.out.println(service +" supports :");
//	            DocFlavor[] flavors = service.getSupportedDocFlavors() ;
//	            for (int i = 0; i < flavors.length; i++) {
//	                 System.out.println("\t" +flavors[i]);
//	            }
	            
//			StringReader reader = new StringReader(s);
				
			byte[] by = s.getBytes();

			DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
//			DocFlavor flavor = DocFlavor.READER.TEXT_PLAIN;
//			DocFlavor flavor = DocFlavor.STRING.TEXT_PLAIN;
//			DocFlavor flavor = DocFlavor.BYTE_ARRAY.TEXT_PLAIN_UTF_8;
 
			Doc doc = new SimpleDoc(by, flavor, null);
//			Doc doc = new SimpleDoc(reader, flavor, null);
//			Doc doc = new SimpleDoc(new CharArrayReader(new char[]{'É'}), 
//			          DocFlavor.READER.TEXT_PLAIN, null);
			
			job.print(doc, null);
			System.out.println("completed printing " + sPrinterName);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} // testZebra() 



}
