/**
  * Rahnel Hans A. Kaamiño, ITCC A
  * October 28, 2020
  */
  
  import java.awt.*;
  import java.awt.event.*;
  import javax.swing.*;
  
  class calculator implements ActionListener{
	  JFrame frame;
	  JTextField t1;
	  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,equal,clear,addition,subtraction,multiplication,divide;
	  Font f;
	  
	  static double a=0,b=0,result=0;
	  static int operator=0;
  
		/** constructor **/
	public calculator() {
		frame = new JFrame("My Calculator");
		frame.setSize(670,480);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f = new Font("TAHOMA",Font.BOLD,16);
		
		t1 = new JTextField(20);
		t1.setBounds(10,10,620,50);
		t1.setHorizontalAlignment(JTextField.RIGHT);
		frame.add(t1);
		t1.setEditable(false);
		
		
		b1 = new JButton("1");
		b1.setFont(f);
		
		b2 = new JButton("2");
		b2.setFont(f);
		
		b3 = new JButton("3");
		b3.setFont(f);
		
		b4 = new JButton("4");
		b4.setFont(f);
		
		b5 = new JButton("5");
		b5.setFont(f);
		
		b6 = new JButton("6");
		b6.setFont(f);
		
		b7 = new JButton("7");
		b7.setFont(f);
		
		b8 = new JButton("8");
		b8.setFont(f);
		
		b9 = new JButton("9");
		b9.setFont(f);
		
		b10 = new JButton("0");
		b10.setFont(f);
		
		b11 = new JButton(".");
		b11.setFont(f);
		
		b12 = new JButton("00");
		b12.setFont(f);
		
		equal = new JButton("=");
		equal.setFont(f);
		
		clear = new JButton("Clear");
		clear.setFont(f);
		
		addition = new JButton("+");
		addition.setFont(f);
		
		subtraction = new JButton("-");
		subtraction.setFont(f);
		
		multiplication = new JButton("*");
		multiplication.setFont(f);
		
		divide = new JButton("/");
		divide.setFont(f);
		
			/** Setting positions **/
		b7.setBounds(10,80,70,60);
		b8.setBounds(120,80,70,60);
		b9.setBounds(230,80,70,60);
		b4.setBounds(10,170,70,60);
		b5.setBounds(120,170,70,60);
		b6.setBounds(230,170,70,60);
		b1.setBounds(10,260,70,60);
		b2.setBounds(120,260,70,60);
		b3.setBounds(230,260,70,60);
		b10.setBounds(10,350,70,60);
		b11.setBounds(230,350,70,60);
		b12.setBounds(120,350,70,60);
		equal.setBounds(450,350,170,60);
		clear.setBounds(450,80,177,60);
		addition.setBounds(450,260,70,60);
		subtraction.setBounds(560,260,70,60);
		multiplication.setBounds(450,170,70,60);
		divide.setBounds(560,170,70,60);
		
			/** Adding to JFrame **/
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(b10);
		frame.add(b11);
		frame.add(b12);
		frame.add(equal);
		frame.add(clear);
		frame.add(addition);
		frame.add(subtraction);
		frame.add(multiplication);
		frame.add(divide);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		equal.addActionListener(this);
		clear.addActionListener(this);
		addition.addActionListener(this);
		subtraction.addActionListener(this);
		multiplication.addActionListener(this);
		divide.addActionListener(this);
		
		frame.setVisible(true);
	}	
		/** Performed actionListener **/
  public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1)
			t1.setText(t1.getText().concat("1"));
		
		if(e.getSource()==b2)
			t1.setText(t1.getText().concat("2"));
		
		if(e.getSource()==b3)
			t1.setText(t1.getText().concat("3"));
		
		if(e.getSource()==b4)
			t1.setText(t1.getText().concat("4"));
		
		if(e.getSource()==b5)
			t1.setText(t1.getText().concat("5"));
		
		if(e.getSource()==b6)
			t1.setText(t1.getText().concat("6"));
		
		if(e.getSource()==b7)
			t1.setText(t1.getText().concat("7"));
		
		if(e.getSource()==b8)
			t1.setText(t1.getText().concat("8"));
		
		if(e.getSource()==b9)
			t1.setText(t1.getText().concat("9"));
		
		if(e.getSource()==b10)
			t1.setText(t1.getText().concat("0"));
		
		if(e.getSource()==b11)
			t1.setText(t1.getText().concat("."));
		
		if(e.getSource()==b12)
			t1.setText(t1.getText().concat("00"));
		
		if(e.getSource()==clear)
			t1.setText("");
		
		/** Functions with Try and Catch Exceptions**/
		try{
		if(e.getSource()==addition) {
			a=Double.parseDouble(t1.getText());
			operator = 1;
			t1.setText("");
		}
		}catch(NumberFormatException f){
				t1.setText("Error");
				System.out.println(t1);
		}
		try{
		if(e.getSource()==subtraction) {
			a=Double.parseDouble(t1.getText());
			operator = 2;
			t1.setText("");
		}
		}catch(NumberFormatException f){
				t1.setText("Error");
				System.out.println(t1);
		}
		try{
		if(e.getSource()==multiplication) {
			a=Double.parseDouble(t1.getText());
			operator = 3;
			t1.setText("");
		}
		}catch(NumberFormatException f){
				t1.setText("Error");
				System.out.println(t1);
		}
		try {
		if(e.getSource()==divide) {
			a=Double.parseDouble(t1.getText());
			operator = 4;
			t1.setText("");
		}
		}catch(NumberFormatException f){
				t1.setText("Error");
				System.out.println(t1);
  }
		if(e.getSource()==equal) {
			b=Double.parseDouble(t1.getText());
			switch(operator) {
				case 1: result = a+b;
					break;
				case 2: result = a-b;
					break;
				case 3: result = a*b;
					break;
				case 4: result = a/b;
					break;
					
				default: result = 0;
			}
				t1.setText(""+result);
		}	
		
  }
  

		/** Main Program **/
  public static void main(String args[]){
	  
	  new calculator();
	 
	}
  }
  
	