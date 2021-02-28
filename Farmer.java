package com.exercises;
import javax.swing.*;
import java.awt.event.*;


public class Farmer implements ActionListener
{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
	JLabel[] labels = new JLabel[10];
	JLabel label1,format1,label2,format2,buyer,price;
	
	JTextField[] texts = new JTextField[5];
	JTextField text1,text2,text3,res1,res2;

	JButton add = new JButton();
	JButton clr = new JButton();
	JButton find = new JButton();
	
	String product;
	int quantity;
	
	int cottonQuantity = 0, chilliQuantity = 0;
	
	int buyer1cotton = 4675, buyer1chilli = 8500;
	int buyer2cotton = 4200, buyer2chilli = 8987;
	int buyer3cotton = 3500, buyer3chilli = 11500;
	
	int price1,price2,price3;

	Farmer()
	{
		frame.setTitle("Farmer Assistance Application");
	    frame.setSize(580, 490);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(panel); 
	    panel.setLayout(null);
	    
        label1 = new JLabel("Product: ");
	    label1.setBounds(40,20,200,25);
	    panel.add(label1);
	    
	    text1 = new JTextField(20);
	    text1.setBounds(160,20,100,25);
	    panel.add(text1);
	    
	    format1 = new JLabel("Enter in Format :: e.g COTTON, CHILLI");
	    format1.setBounds(280,20,250,25);
	    panel.add(format1);
	    
	    label2 = new JLabel("Quantity: ");
	    label2.setBounds(40,50,200,25);
	    panel.add(label2);
	    
	    text2 = new JTextField(20);
	    text2.setBounds(160,50,100,25);
	    panel.add(text2);
	    
	    format2 = new JLabel("Enter in Format :: e.g 100 Units: Quintal");
	    format2.setBounds(280,50,250,25);
	    panel.add(format2);
	    
	    text3 = new JTextField(20);
	    text3.setBounds(160,140,280,35);
	    panel.add(text3);

	    //Add an expense button
	    add = new JButton("Add");
	    add.setBounds(160,100,80,25);
	    add.setFocusable(false);
	    panel.add(add);
	    add.addActionListener(this);
	    
	    //Add a clear button
	    clr = new JButton("Clear");
	    clr.setBounds(260,100,80,25);
	    clr.setFocusable(false);
	    panel.add(clr);
	    clr.addActionListener(this);
	    
	    
	    //Add a total expense calculation button
	    find = new JButton("Find Best Buyer");
	    find.setBounds(40,220,130,25);//
	    find.setFocusable(false);
	    panel.add(find);
	    find.addActionListener(this);

  
	    //Result display fields
	    buyer = new JLabel("Buyer Name: ");
	    buyer.setBounds(40,260,150,25);
	    panel.add(buyer);
	    
	    res1 = new JTextField(100);
	    res1.setBounds(40,290,400,25);
	    panel.add(res1);
	    
	    price = new JLabel("Best Price: ");
	    price.setBounds(40,330,100,25);
	    panel.add(price);
	    
	    res2 = new JTextField(100);
	    res2.setBounds(40,360,400,25);
	    panel.add(res2);
 
	    frame.setVisible(true);
	}
	public static void main(String[] args) 
	{   
		Farmer f = new Farmer();
	}
    
	public void actionPerformed(ActionEvent e) {
	
		//add button
    if (e.getSource() == add)
    {
    	product = text1.getText();
    	quantity = Integer.parseInt(text2.getText());
    	
    	if (product.equals("COTTON"))
    		cottonQuantity += quantity;
    	
    	if (product.equals("CHILLI"))
    		chilliQuantity += quantity;
    	
    	text3.setText("Cotton Quantity is: " + cottonQuantity + " and Chilli Quantity is: "+ chilliQuantity);
    	text1.setText("");
    	text2.setText("");
    }
    
    //clear button
    if (e.getSource() == clr)
    {
    	text1.setText("");
    	text2.setText("");
    	text3.setText("");
    	res1.setText("");
    	res2.setText("");
	
    }
    //calculate button
    if (e.getSource() == find)
    {
   
    	price1 = buyer1cotton * cottonQuantity + buyer1chilli * chilliQuantity;
    	price2 = buyer2cotton * cottonQuantity + buyer2chilli * chilliQuantity;
    	price3 = buyer3cotton * cottonQuantity + buyer3chilli * chilliQuantity;
    	
        if(price1 > price2 && price1 > price3)
        {
            res1.setText("Buyer 1");
            res2.setText(""+ price1);
        }
        else if(price2 > price3)
        {
            res1.setText("Buyer 2");
            res2.setText(""+ price2);
        }
        else
        {
            res1.setText("Buyer 3");
            res2.setText(""+ price3);
        }
     
    }
	
	}
}

