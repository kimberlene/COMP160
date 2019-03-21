/** lab 19
  * Kimberlene Sharma
  * program to add three functioning JRadioButtons which give 3 typefaces
  **/

//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
  private JLabel saying;
  private JCheckBox bold, italic;
  private JRadioButton courier, timesNewRoman, helvetica;
  private int style = Font.PLAIN;
  private String typeFace = "Helvetica";
  
  private String fstring = "";
  
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and some check boxes that
  //  control the style of the label's font.
  //-----------------------------------------------------------------
  public StyleOptionsPanel()
  {
    saying = new JLabel ("Say it with style!");
    saying.setFont (new Font (typeFace, style, 20));
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.cyan);
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.cyan);
    
    courier = new JRadioButton("Courier");
    courier.setBackground(Color.cyan);
    timesNewRoman = new JRadioButton("Times New Roman");
    timesNewRoman.setBackground(Color.cyan);
    helvetica = new JRadioButton("Helvetica");
    helvetica.setBackground(Color.cyan);
    
    JPanel fontPanel = new JPanel();
    fontPanel.setPreferredSize(new Dimension(300,200));
    fontPanel.setBackground(Color.cyan);
    fontPanel.add (saying);
    fontPanel.add (bold);
    fontPanel.add (italic);
    fontPanel.add (courier);
    fontPanel.add (timesNewRoman);
    fontPanel.add (helvetica);
    
    fontPanel.setLayout( new GridLayout (6,1));
                        
    StyleListener listener = new StyleListener();
    bold.addItemListener (listener);
    italic.addItemListener (listener);
    
    
    ButtonListener listener1 = new ButtonListener();
    ButtonGroup fontGroup = new ButtonGroup();
    fontGroup.add(courier);
    fontGroup.add(timesNewRoman);
    fontGroup.add(helvetica);
    courier.addActionListener(listener1);
    timesNewRoman.addActionListener(listener1);
    helvetica.addActionListener(listener1);
    
    add (fontPanel);
    
    
  }
  
  
  
  
  //*****************************************************************
  //  Represents the listener for both check boxes.
  //*****************************************************************
  private class StyleListener implements ItemListener
  {
    //--------------------------------------------------------------
    //  Updates the style of the label font style.
    //--------------------------------------------------------------
    public void itemStateChanged (ItemEvent event)
    {
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style = Font.BOLD;
      
      if (italic.isSelected())
        style = Font.ITALIC;
      
      
      saying.setFont (new Font (typeFace, style, 20));
    }
  }
  
  private class ButtonListener implements ActionListener{
    public void actionPerformed (ActionEvent event){
      Object source = event.getSource();
      
      if(source == courier)
        typeFace = "Courier";
      
      if(source == timesNewRoman)
        typeFace = "Times New Roman";
      
      if(source == helvetica)
        typeFace = "Helvetica";
      
      
      System.out.println(typeFace);
      saying.setFont(new Font(typeFace, style, 20));
      
    }
  }
}



