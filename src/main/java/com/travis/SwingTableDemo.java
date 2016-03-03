package com.travis;

//This program simply displays a table. It does not 
//handle any table events. See "Handle Table Events" 
//for information on table events. 
 
import java.awt.*;    
import java.awt.event.*;    
import javax.swing.*;    
import javax.swing.event.*; 
import javax.swing.table.*; 

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


class SwingTableDemo implements ActionListener {  
 
	String[] headings = { "Name", "Customer ID", 
                     "Order #", "Status" }; 

Object[][] data = { 
 { "Tom", new Integer(34723), "T-01023", "Shipped" }, 
 { "Wendy", new Integer(67263), "W-43Z88", "Shipped" }, 
 { "Steve", new Integer(97854), "S-98301", "Back Ordered" }, 
 { "Adam", new Integer(70851), "A-19287", "Pending" }, 
 { "Larry", new Integer(40952), "L-18567", "Shipped" }, 
 { "Mark", new Integer(88992), "M-22345", "Cancelled" }, 
 { "Terry", new Integer(67492), "T-18269", "Back Ordered" } 
}; 

JTable jtabOrders; 

JRadioButton jrbRows; 
JRadioButton jrbColumns; 
JRadioButton jrbCells; 

JCheckBox jcbSingle; 

SwingTableDemo() {    

 // Create a new JFrame container.    
 JFrame jfrm = new JFrame("JTable Demo");  
 
 // Specify FlowLayout for the layout manager.    
 jfrm.setLayout(new FlowLayout());    
 
 // Give the frame an initial size.    
 jfrm.setSize(460, 180);    
 
 // Terminate the program when the user closes the application.    
 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 
 // Create a table that displays order data. 
 jtabOrders = new JTable(data, headings); 

 // Wrap the table in a scroll pane. 
 JScrollPane jscrlp = new JScrollPane(jtabOrders); 

 // Set the scrollable viewport size. 
 jtabOrders.setPreferredScrollableViewportSize( 
             new Dimension(420, 62)); 

 // Create the radio buttons that determine 
 // what type of selections are allowed. 
 jrbRows = new JRadioButton("Select Rows", true); 
 jrbColumns = new JRadioButton("Select Columns"); 
 jrbCells = new JRadioButton("Select Cells"); 

 // Add the radio buttons to a group. 
 ButtonGroup bg = new ButtonGroup(); 
 bg.add(jrbRows); 
 bg.add(jrbColumns); 
 bg.add(jrbCells); 

 // Radio button events are handled in common by the 
 // actionPerformed() method implemented by TableDemo. 
 jrbRows.addActionListener(this); 
 jrbColumns.addActionListener(this); 
 jrbCells.addActionListener(this); 

 // Create the Single Selection Mode check box. 
 // When checked, only single selections are allowed. 
 jcbSingle = new JCheckBox("Single Selection Mode"); 

 // Add item listener for jcbSingle. 
 jcbSingle.addItemListener(new ItemListener() { 

   public void itemStateChanged(ItemEvent ie) { 
     if(jcbSingle.isSelected())  
       // Allow single selections. 
       jtabOrders.setSelectionMode( 
                    ListSelectionModel.SINGLE_SELECTION); 
     else 
       // Allow multiple selections. 
       jtabOrders.setSelectionMode( 
                    ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); 
   } 
 }); 

 // Add the components to the content pane.  
 jfrm.add(jscrlp); 
 jfrm.add(jrbRows); 
 jfrm.add(jrbColumns); 
 jfrm.add(jrbCells); 
 jfrm.add(jcbSingle); 

 // Display the frame.    
 jfrm.setVisible(true);    
}    

// This handles the row, column, and cell selection buttons. 
public void actionPerformed(ActionEvent ie) { 

 // See which button is selected. 
 if(jrbRows.isSelected()) { 
   // Enable row selection. 
   jtabOrders.setColumnSelectionAllowed(false); 
   jtabOrders.setRowSelectionAllowed(true); 
 } 
 else if(jrbColumns.isSelected()) { 
   // Enable column selection. 
   jtabOrders.setColumnSelectionAllowed(true); 
   jtabOrders.setRowSelectionAllowed(false); 
 } 
 else { 
   // Enable cell selection. 
   jtabOrders.setCellSelectionEnabled(true); 
 } 

} 
 
public static void main(String args[]) {    
 // Create the frame on the event dispatching thread.
	
//	 String message = "William Shakespeare was born\n\n"
//	         + args[0] + "..." + args[1];
//	    JOptionPane pane = new JOptionPane(message);
//	    JDialog dialog = pane.createDialog(new JFrame(), "Dilaog");
//	    dialog.show();
	 
	
 SwingUtilities.invokeLater(new Runnable() {    
   public void run() {    
     new SwingTableDemo();    
   }    
 });
 

 
}    
}

