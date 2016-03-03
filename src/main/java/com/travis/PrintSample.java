package com.travis;



import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
 
 
public class PrintSample  implements Printable {
 
   static JTextArea textarea = new JTextArea(10,40);
   static JFrame   window = new JFrame("Print Sample");
 
  public static  void main(String args[])   {
 
    final Container cp = window.getContentPane();
    JButton buttonLPT = new JButton("Use LPT1");
    JButton buttonPA = new JButton("Use PrintAll");
    JButton buttonPJ = new JButton("Use Printable");
    LayoutManager lm = new FlowLayout(FlowLayout.CENTER, 20,20);
 
    // fill in text to display (and later print)
    textarea.append("Text here is going to be printed.\n");
    textarea.append("Next line to be output.\n");
    textarea.append("The end\n");
    textarea.setEditable(false);
 
     // set up layout and fill in sample
     cp.setLayout(lm);
     cp.add(new JScrollPane(textarea));
     cp.add(buttonLPT);
     cp.add(buttonPA);
     cp.add(buttonPJ);
 
     // add the button press response for buttons
     buttonLPT.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           printLPT();
        }
        });
 
     buttonPA.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           printPrintAll();
        }
     });
 
     buttonPJ.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           printPrinterJob();
        }
      });
 
     // set up WindowListener to close the program
     window.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
     }
    });
 
    window.setSize(475,300);
    window.setVisible(true);                  // frame starts out invisible
 
   }
 
 
   // PrintJob and printAll implementation
   static void printPrintAll()  {
 
      PrintJob printjob = window.getToolkit().getPrintJob(window, "test", null);
 
      if (printjob != null) {
 
         Graphics printgraphics = printjob.getGraphics();          // get a graphics object that will draw to the next page.
         if (printgraphics != null) {                               // if user selects cancel on the print dialog, printgraphics will be null
            printgraphics.translate(100,100);                      // move the origin of the drawing area so there is a margin
            textarea.printAll(printgraphics);                       // output the text
            printgraphics.dispose();                                // the page is sent to the printer when dispose is called
         }
         printjob.end();                                                                  // ends the printjob and does any necessary cleanup
      }   // end if printjob
   }
 
 
   // PrinterJob implementation
   static void printPrinterJob() {
 
      PrinterJob printerjob = PrinterJob.getPrinterJob();            // get a printer job object
 
      // set the characteristics of the job to be printed - use setPageable and book if
      // outputing a document. Use setPrintable for "simple" printing - all pages formatted the same
      printerjob.setPrintable(new PrintSample());
 
      try {
         printerjob.print();            // print the page(s)  (this method with call the page painters)
      } catch (PrinterException exception) {
         System.err.println("Printing error: " + exception);
      }
  }
 
 
  // Use LPT1 as file implementation
  static void printLPT() {
     String strText = null;         // text string to output
     int lineStart;                 // start index of line in textarea
     int lineEnd;                   // end index of line in textarea
     int lineNumber;                // line number currently outputing
     int lineCount;                 // number of lines in textbox
 
      try {
               FileOutputStream os = new FileOutputStream("LPT1");
               PrintStream ps = new PrintStream(os);
 
              // get the text from the textarea one line at a time
              // in order for it to be output as it appears in the textbox
              lineNumber = 0;
              lineCount = textarea.getLineCount();
              strText = textarea.getText();
              while (lineNumber < lineCount) {
 
                // parse off each line
                 lineStart = textarea.getLineStartOffset(lineNumber);
                 lineEnd = textarea.getLineEndOffset(lineNumber);
                 strText = textarea.getText(lineStart, lineEnd-lineStart);
                 // output the text via ps.println
                ps.println(strText);
                 lineNumber = lineNumber + 1;
              }
 
              ps.print("\f");             // form feed - print will stay in buffer if this is omitted
              ps.close();
      } catch(Exception exception) {
            System.out.println("Printing error:" + exception);
     }
 
  }
 
 
 
   // print  - draw the page
   // Parameters:    graphics - context in which to draw the page
   //                pageFormat - size and orientation of page being drawn
   //               pageIndex - zero-based index position of the  page in the print job
   //
   public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
      throws PrinterException {
 
       String strText =null;    // text string to output
      int lineStart;           // start index of line in textarea
       int lineEnd;             // end index of line in textarea
       int lineNumber;          // current line in textarea
       int lineCount;           // total number of lines in textarea
 
       if (pageIndex >= 1 ) return Printable.NO_SUCH_PAGE;
 
       // move the drawing origin to the imageable area ( makes sure its drawn where the printer can )
       graphics.translate((int)(pageFormat.getImageableX()), (int)(pageFormat.getImageableY()));
       graphics.setColor(Color.black);
 
       // get the text from the textarea one line at a time
       lineNumber = 0;
 
       lineCount = textarea.getLineCount();
       strText = textarea.getText();
       while (lineNumber < lineCount) {
          try {
             lineStart = textarea.getLineStartOffset(lineNumber);
             lineEnd = textarea.getLineEndOffset(lineNumber);
             strText = textarea.getText(lineStart, lineEnd-lineStart);
          } catch( Exception exception) {
             System.out.println("Printing error:" + exception);                  // have to catch BadLocationException
          }
 
          // determine drawing location of each successive line
          graphics.drawString(strText,0,(lineNumber + 1) *20);
          lineNumber = lineNumber + 1;
        }
 
        return Printable.PAGE_EXISTS;                      // page was drawn successfully (return NO_SUCH_PAGE if not)
   }
 
 
 
}
 
 
 
