package com.travis;

//Handle selection and model change events for a JTable. 

import java.awt.*;    
import java.awt.event.*;    
import javax.swing.*;    
import javax.swing.event.*; 
import javax.swing.table.*; 
     
class SwingTableEventDemo implements ActionListener, ListSelectionListener {  
    
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
 
  JLabel jlab; 
  JLabel jlab2; 
 
  TableModel tm; 
 
  SwingTableEventDemo() {    
 
    // Create a new JFrame container.    
    JFrame jfrm = new JFrame("JTable Event Demo");  
    
    // Specify FlowLayout for the layout manager.    
    jfrm.setLayout(new FlowLayout());    
    
    // Give the frame an initial size.    
    jfrm.setSize(460, 220);    
    
    // Terminate the program when the user closes the application.    
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    
    // Create a label that will display a selection.  
    jlab = new JLabel();   
    jlab.setPreferredSize(new Dimension(400, 20)); 
 
    // Create a label that will display changes to a cell.  
    jlab2 = new JLabel(); 
    jlab2.setPreferredSize(new Dimension(400, 20)); 
 
    // Create a table that displays order data. 
    jtabOrders = new JTable(data, headings); 
 
    // Wrap the table in a scroll pane. 
    JScrollPane jscrlp = new JScrollPane(jtabOrders); 
 
    // Set the scrollable viewport size. 
    jtabOrders.setPreferredScrollableViewportSize( 
                  new Dimension(420, 62)); 
 
    // Get the list selection model for rows. 
    ListSelectionModel rowSelMod = jtabOrders.getSelectionModel(); 
 
    // Get the list selection model for columns.  
    ListSelectionModel colSelMod = 
        jtabOrders.getColumnModel().getSelectionModel(); 
 
    // Listen for selection events. 
    rowSelMod.addListSelectionListener(this); 
    colSelMod.addListSelectionListener(this); 
 
    // Get the table model. 
    tm = jtabOrders.getModel(); 
 
    // Add a table model listener. This listens for 
    // changes to a cell's data. 
    tm.addTableModelListener(new TableModelListener() { 
 
      public void tableChanged(TableModelEvent tme) { 
        // If a cell's data changed, report it. 
        if(tme.getType() == TableModelEvent.UPDATE) { 
          jlab2.setText("Cell " + tme.getFirstRow() + ", " + 
                        tme.getColumn() + " changed." + 
                        " The new value: " +  
                        tm.getValueAt(tme.getFirstRow(), 
                                      tme.getColumn())); 
          }  
        } 
    }); 
 
 
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
    // actionPerformed() method implemented by TableEventDemo. 
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
          // Return to the default selection mode, which 
          // allows multiple interval selections. 
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
 
    jfrm.add(jlab); 
    jfrm.add(jlab2); 
  
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
      jcbSingle.setSelected(true); 
      jtabOrders.setSelectionMode( 
                   ListSelectionModel.SINGLE_SELECTION); 
    } 
 
  } 
 
  // Handle selection events by displaying the indices 
  // of the selected elements. All indices are relative 
  // to the view. (See Options and Alternatives for  
  // details on converting view indices to model indices.) 
  public void valueChanged(ListSelectionEvent le) {   
    String str; 
 
    // Determine what has been selected. 
    if(jrbRows.isSelected()) { 
 
      str = "Selected Row(s): "; 
 
      // Get a list of all selected rows. 
      int[] rows = jtabOrders.getSelectedRows(); 
 
      // Create a string that contains the indices of the selected rows. 
      for(int i=0; i < rows.length; i++) 
        str += rows[i] + " "; 
  
    } else if(jrbColumns.isSelected()) { 
 
      str = "Selected Column(s): "; 
  
      // Get a list of all selected columns. 
      int[] cols = jtabOrders.getSelectedColumns(); 
 
      // Create a string that contains the indices of the selected columns. 
      for(int i=0; i < cols.length; i++) 
        str += cols[i] + " "; 
  
    } else { 
      str = "Selected Cell: (View Relative) " +  
             jtabOrders.getSelectedRow() + ", " + 
             jtabOrders.getSelectedColumn(); 
    } 
 
    // Display the indices. 
    jlab.setText(str); 
  }    
 
  public static void main(String args[]) {    
    // Create the frame on the event dispatching thread.    
    SwingUtilities.invokeLater(new Runnable() {    
      public void run() {    
        new SwingTableEventDemo();    
      }    
    });    
  }    
}
