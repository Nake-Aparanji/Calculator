//import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class calculator  extends Frame implements ActionListener
{
	Frame f;
	Panel p;
	GridLayout g;

	String s1;
	String s2;
	String s3;
	String s4;
	String s5;
	int a,n;
    //int x1=0,x2=0;

	TextField t1;

	Button b0;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b10;
	Button b11;
	Button b_add;
	Button b_sub;
	Button b_mul;
	Button b_div;
	calculator()
	{
		f=new Frame("calculator");
		p=new Panel();
		f.setLayout(new FlowLayout());

		b0=new Button("0");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("=");
		b11=new Button("C");
		b_add=new Button("+");
		b_sub=new Button("-");
		b_mul=new Button("*");
		b_div=new Button("/");

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b_add.addActionListener(this);
		b_sub.addActionListener(this);
		b_mul.addActionListener(this);
		b_div.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);

		t1 =new TextField("",10);
		f.add(t1);

		g = new GridLayout(4,4,10,20);
		p.setLayout(g);
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b_add);
		p.add(b_sub);
		p.add(b_mul);
		p.add(b_div);
		p.add(b10);
		p.add(b11);

		f.add(p);

		/*setLayout(g);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b_add);
		add(b_sub);
		add(b_mul);
		add(b_div);*/

		f.setVisible(true);
		//setTitle("calculator");
		f.setSize(400,400);
	}

	public void actionPerformed(ActionEvent e)
	{try
		{
			if(e.getSource()==b0)
        {
            s1=t1.getText();
            s2 = "0";
            s3 = s1+s2;
            t1.setText(s3);
        }
        if(e.getSource()==b1)
        {
            s1=t1.getText();
            s2 = "1";
            s3 = s1+s2;
            t1.setText(s3);
        }
        if(e.getSource()==b2)
        {
            s1=t1.getText();
            s2 = "2";
            s3 = s1+s2;
            t1.setText(s3);
        }if(e.getSource()==b3)
        {
            s1=t1.getText();
            s2 = "3";
            s3 = s1+s2;
            t1.setText(s3);
        }
        if(e.getSource()==b4)
        {
            s1=t1.getText();
            s2 = "4";
            s3 = s1+s2;
            t1.setText(s3);
        }
        if(e.getSource()==b5)
        {
            s1=t1.getText();
            s2 = "5";
            s3 = s1+s2;
            t1.setText(s3);
        }
        if(e.getSource()==b6)
        {
            s1=t1.getText();
            s2 = "6";
            s3 = s1+s2;
            t1.setText(s3);
        }
        if(e.getSource()==b7)
        {
            s1=t1.getText();
            s2 = "7";
            s3 = s1+s2;
            t1.setText(s3);
        }
        if(e.getSource()==b8)
        {
            s1=t1.getText();
            s2 = "8";
            s3 = s1+s2;
            t1.setText(s3);
        }
        if(e.getSource()==b9)
        {
            s1=t1.getText();
            s2 = "9";
            s3 = s1+s2;
            t1.setText(s3);
        }
        if(e.getSource()==b_add)
        {
            if(t1.getText().equals(""))
                {
                    s2="+";
                    t1.setText(s2);
                }
                else
                {
                    s4=t1.getText();
                    t1.setText("");
                    //t1.setText("+");
                    a=1;
                    //x1=1;        
                }
        }
        if(e.getSource()==b_sub)
        {
                if(t1.getText().equals(""))
                {
                    s2="-";
                    t1.setText(s2);
                }
                else
                {
                    s4=t1.getText();
                    t1.setText("");
                    //t1.setText("-");
                    a=2;     
                    //x2=2;   
                }
            
        }
        if(e.getSource()==b_mul)
        {
            s4=t1.getText();
            t1.setText("");
 			a=3;
        }
        if(e.getSource()==b_div)
        {
            s4=t1.getText();
            t1.setText("");
 			a=4;
        }
        if(e.getSource()==b11)
        {
            t1.setText("");
        }
        if(e.getSource()==b10)
        {
            s5= t1.getText();
            if(a==1)
            {
                n = Integer.parseInt(s4)+Integer.parseInt(s5);
                t1.setText(String.valueOf(n));
            }
            else if(a==2)
            {
                n = Integer.parseInt(s4)-Integer.parseInt(s5);
                t1.setText(String.valueOf(n));
            }
            else if(a==3)
            {
                n = Integer.parseInt(s4)*Integer.parseInt(s5);
                t1.setText(String.valueOf(n));
            }
            else if(a==4)
            {
                int x=Integer.parseInt(s5);
                if(x==0)
                {
                    t1.setText("infinite");
                }
                else
                {
                    n = Integer.parseInt(s4)/Integer.parseInt(s5);
                    t1.setText(String.valueOf(n));    
                }
                
            }
            else if(a==5)
            {
                t1.setText(s5);
            }
        }
		}
		catch(Exception ei)
		{
			System.out.println(ei);	
		}
	}
	public static void main(String args[])
	{
		new calculator();
	}
}

//More to do - 
//deleting a digit
//enter a no. and press =
//show the data above
