import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.applet.*;
/*<applet code="Calculator.java" width="500" height="300"> </applet>*/
public class Calculator extends Applet {
	// CREATTING LABEL,BUTTON & TEXTFIELD
	Label l1,l2,l3;
	Button b1,b2,b3,b4,d;
	TextField t1,t2;
	public void init()
	{
		setBackground(Color.green);
		//INITIALIZING THE OBJECTS
		
		l1=new Label("First Number");
		l2=new Label("Second Number");
		l3=new Label("Result");
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
                d=new Button("Powered by Deepak Yadav");
		t1=new TextField();
		t2=new TextField();
		setLayout(null);
		//POSIONING THE COMPONANT
		
		l1.setBounds(0,10,100,30);
		t1.setBounds(100,10,100,30);
		l2.setBounds(200,10,100,30);
		t2.setBounds(300,10,100,30);
		b1.setBounds(50,50,30,30);
		b2.setBounds(150,50,30,30);
		b3.setBounds(250,50,30,30);
		b4.setBounds(350,50,30,30);
                d.setBounds(150,260,160,40);
		l3.setBounds(200,100,150,30);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
                add(d);
		add(t1);
		add(t2);
		b1.addActionListener(new MyCode1());
		b2.addActionListener(new MyCode2());
		b3.addActionListener(new MyCode3());
		b4.addActionListener(new MyCode4());
	}
	public class MyCode1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b=0,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a+b;
			l3.setText("Summation is "+c);
		}
	}
	public class MyCode2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b=0,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a-b;
			l3.setText("Substraction is "+c);
		}
	}
	public class MyCode3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b=0,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a*b;
			l3.setText("Product is "+c);
		}
	}
	public class MyCode4 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b=0,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a/b;
			l3.setText("Quotient is "+c);
		}
	}

}
