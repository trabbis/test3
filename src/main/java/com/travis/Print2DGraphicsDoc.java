package com.travis;

/*
* Copyright 2001 Sun Microsystems, Inc. All Rights Reserved.
*
* This software is the proprietary information of
* Sun Microsystems, Inc.
* Use is subject to license terms.
*
*/
import java.io.*;
import java.awt.*;
import java.net.*;
import java.awt.image.*;
import java.awt.print.*;
import javax.print.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;
public class Print2DGraphicsDoc implements Printable {

	public Print2DGraphicsDoc() {
		/*
		 * Construct the print request specification. The print data is a Printable
		 * object. the request additonally specifies a job name, 2 copies, and landscape
		 * orientation of the media.
		 */
		DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
//		aset.add(OrientationRequested.LANDSCAPE);
//		aset.add(MediaSizeName.ISO_A4);
		
		aset.add(new Copies(1));
		aset.add(new JobName("My job", null));
		/* locate a print service that can handle the request */
		PrintService[] services = PrintServiceLookup.lookupPrintServices(flavor, aset);
		
		if (services.length > 0) {
			System.out.println("selected printer..." + services[0].getName());
			/* create a print job for the chosen service */
			DocPrintJob pj = services[0].createPrintJob();
			try {
				/*
				 * Create a Doc object to hold the print data.
				 */
				Doc doc = new PrintableDoc(this);
				/* print the doc as specified */
				pj.print(doc, aset);
			
				System.out.println("ended printing...");
				/*
				 * Do not explicitly call System.exit() when print returns. Printing can be
				 * asynchronous so may be executing in a separate thread. If you want to
				 * explicitly exit the VM, use a print job listener to be notified when it
				 * is safe to do so.
				 */
			} catch (PrintException e) {
				System.err.println(e);
			}
			

			
		}
	} //	public Print2DGraphicsDoc() {

	
	
	public int print(Graphics g1,PageFormat pf,int pageIndex) {
		if (pageIndex == 0) {
			/*
			Graphics2D g2d= (Graphics2D)g;
			g2d.translate(pf.getImageableX(), pf.getImageableY());
			g2d.setColor(Color.BLACK);
			g2d.drawString("example string", 50, 50);
			g2d.fillRect(0, 0, 200, 200);
			*/
			String newAddress1 = "newAddress1";
			
			Graphics2D g= (Graphics2D)g1;
			g.setColor(java.awt.Color.WHITE);
			g.fillRect(0, 0, 4 * 300, 6 * 300);
			g.setColor(java.awt.Color.BLACK);
			
			g.drawLine(1, 1, 4 * 300, 1);
			g.drawLine(1, 1, 1, 6 * 300);
			g.drawLine(1, 6 * 300 - 2, 4 * 300, 6 * 300 - 2);
			g.drawLine(4 * 300 - 2, 1, 4 * 300 - 2, 6 * 300);
			

//			g.rotate(Math.toRadians(90));
//			g.drawString("ADDRESS CORRECTIONS/ADDRESS CORRECTIONS IN FRENCH", 300, -300);
//			barcode.draw(g, 500, -700);
			g.setFont(new java.awt.Font(("ARIAL"), java.awt.Font.BOLD, 10));
//			g.drawString("ADDRESS CORRECTION IN FRENCH", -170, 100);
			g.drawString("ADDRESS CORRECTION IN FRENCH", 10, 10);

			/*
			g.setFont(new java.awt.Font(("ARIAL"), java.awt.Font.BOLD, 10));
			g.drawString("REDIRECTED BY: ", -170, 200);
			g.drawString("EMPLOYEE B", -110, 200);
			
			g.drawString("NAME: ", -170, 300);
			g.drawString(newAddress1, -110, 300);
*/

			g.dispose();
//			javax.imageio.ImageIO.write(img, "PNG", response.getOutputStream());
			
			return Printable.PAGE_EXISTS;
		} else {
			return Printable.NO_SUCH_PAGE;
		}
	}
	
	
	public static void main(String arg[]) {
		Print2DGraphicsDoc sp = new Print2DGraphicsDoc();
	}
	
	class PrintableDoc implements Doc {
		private Printable printable;
		
		public PrintableDoc(Printable printable) {
			this.printable = printable;
		}
		public DocFlavor getDocFlavor() {
			return DocFlavor.SERVICE_FORMATTED.PRINTABLE;
		}
		public DocAttributeSet getAttributes() {
			return null;
		}
		public Object getPrintData() throws IOException {
			return printable;
		}
		public Reader getReaderForText() throws IOException {
			return null;
		}
		public InputStream getStreamForBytes() throws IOException {
			return null;
		}
	} //	class PrintableDoc implements Doc {

	
} //public class Print2DGraphicsDoc implements Printable {

	
