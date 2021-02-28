package com.exercises;
import javax.swing.*;
import java.awt.event.*;


public class ExpenseTracker implements ActionListener
{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
	JLabel[] labels = new JLabel[10];
	JLabel label1,format1,label2,format2,label3,format3,resLabel1,resLabel2,resLabel3;
	
	JTextField[] texts = new JTextField[5];
	JTextField text1,text2,text3,res1,res2,res3;

	JButton add = new JButton();
	JButton clr = new JButton();
	JButton calc = new JButton();
	
	int aSpent = 0, bSpent =0, cSpent =0, dSpent = 0;
	int aPaid = 0, bPaid = 0, cPaid =0, dPaid= 0;
	int aTotal = 0, bTotal = 0,cTotal = 0, dTotal = 0;
	
	String spentBy;
	int amount;

	ExpenseTracker()
	{
		frame.setTitle("Simple Expense Tracker");
	    frame.setSize(580, 490);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(panel); 
	    panel.setLayout(null);
	    
        label1 = new JLabel("Amount Spent By: ");
	    label1.setBounds(40,20,200,25);
	    panel.add(label1);
	    
	    text1 = new JTextField(20);
	    text1.setBounds(160,20,100,25);
	    panel.add(text1);
	    
	    format1 = new JLabel("Enter in Format :: e.g A");
	    format1.setBounds(280,20,200,25);
	    panel.add(format1);
	    
	    label2 = new JLabel("Amount Spent: ");
	    label2.setBounds(40,50,200,25);
	    panel.add(label2);
	    
	    text2 = new JTextField(20);
	    text2.setBounds(160,50,100,25);
	    panel.add(text2);
	    
	    format2 = new JLabel("Enter in Format :: e.g 100");
	    format2.setBounds(280,50,200,25);
	    panel.add(format2);
	    
	    label3 = new JLabel("Amount Spent For: ");
	    label3.setBounds(40,80,200,25);
	    panel.add(label3);
	    
	    text3 = new JTextField(20);
	    text3.setBounds(160,80,100,25);
	    panel.add(text3);
	    
	    format3 = new JLabel("Enter in Format :: e.g A,B,C,D");
	    format3.setBounds(280,80,200,25);//x,y,width,height
	    panel.add(format3);

	    //Add an expense button
	    add = new JButton("Add");
	    add.setBounds(160,140,80,25);
	    add.setFocusable(false);
	    panel.add(add);
	    add.addActionListener(this);
	    
	    //Add a clear button
	    clr = new JButton("Clear");
	    clr.setBounds(260,140,80,25);
	    clr.setFocusable(false);
	    panel.add(clr);
	    clr.addActionListener(this);
	    
	    
	    //Add a total expense calculation button
	    calc = new JButton("Total Expense");
	    calc.setBounds(40,180,130,25);//
	    calc.setFocusable(false);
	    panel.add(calc);
	    calc.addActionListener(this);

  
	    //Result display fields
	    resLabel1 = new JLabel("Spendings by all: ");
	    resLabel1.setBounds(40,220,150,25);
	    panel.add(resLabel1);
	    
	    res1 = new JTextField(100);
	    res1.setBounds(40,250,400,25);
	    panel.add(res1);
	    
	    resLabel2 = new JLabel("Payments made: ");
	    resLabel2.setBounds(40,290,100,25);
	    panel.add(resLabel2);
	    
	    res2 = new JTextField(100);
	    res2.setBounds(40,320,400,25);
	    panel.add(res2);
	    
	    resLabel3 = new JLabel("Total Expenses: ");
	    resLabel3.setBounds(40,360,100,25);
	    panel.add(resLabel3);
	    
	    res3 = new JTextField(100);
	    res3.setBounds(40,390,400,25);
	    panel.add(res3);
 
	    frame.setVisible(true);
	}
	public static void main(String[] args) 
	{   
		ExpenseTracker et = new ExpenseTracker();
	}
    
	public void actionPerformed(ActionEvent e) {
	
		//add button
    if (e.getSource() == add)
    {
    	spentBy= text1.getText();
    	amount = Integer.parseInt(text2.getText());
    	String[] str = text3.getText().split(",");
        for (String alpha : str) 
        {   
        	
            if (alpha.equals("A"))
            {
            	aSpent += amount/str.length;
            	continue;
            }
            if (alpha.equals("B"))
            {
            	bSpent += amount/str.length;
            	continue;
            }
            if (alpha.equals("C"))
            {
            	cSpent += amount/str.length;
            	continue;
            }
            if (alpha.equals("D"))
            {
            	dSpent += amount/str.length;
            	continue;
            }           
        }
        
        
        
        if (spentBy.equals("A"))
        	aPaid += amount;
        if (spentBy.equals("B"))
        	bPaid += amount;
        if (spentBy.equals("C"))
        	cPaid += amount;
        if (spentBy.equals("D"))
        	dPaid += amount;
        
        aTotal = aPaid - aSpent;
        bTotal = bPaid - bSpent;
        cTotal = cPaid - cSpent;
        dTotal = dPaid - dSpent;
        
    	text1.setText("");
    	text2.setText("");
    	text3.setText("");
    }
    
    //clear button
    if (e.getSource() == clr)
    {
    	text1.setText("");
    	text2.setText("");
    	text3.setText("");
	
    }
    //calculate button
    if (e.getSource() == calc)
    {
    	
     String k0,k1,k2,k3 ;
     k0 = k1 = k2 = k3 =  " must get ";
     if (aTotal < 0)
    	 k0 = " gives ";
     if (bTotal < 0)
    	 k1 = " gives ";
     if (cTotal < 0)
    	 k2 = " gives ";
     if (dTotal < 0)
    	 k3 = " gives ";
     
     res1.setText(" A spent: " + aSpent + " B spent: " + cSpent + " C spent: " + cSpent + " D spent: " + dSpent);	
     res2.setText(" A paid: " + aPaid + " B paid: " + bPaid + " C paid: " + cPaid + " D paid: " + dPaid);
     res3.setText(" A" + k0 + Math.abs(aTotal) + ", B" + k1 +  Math.abs(bTotal) + ", C" + k2 + Math.abs(cTotal)  + ", D" + k3 + Math.abs(dTotal));
    }
	
	}
}
