import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main1 extends JFrame implements ActionListener
{
	JFrame f= new JFrame("Main");
	JButton B1,B2,B3,B4;
	JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10;
	JTextField TSno,TName,TM1,TM2,TM3,TM4,TM5,TTot,TAvg,TRes;
	public Main1()
	{
		f.setTitle ("Sudent Iformation");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel jpan1;
		jpan1= new JPanel(new GridLayout(12,2));
		
		L1=new JLabel("Sno");
		L2=new JLabel("SName");
		L3=new JLabel("Tamil");
		L4=new JLabel("English");
		L5=new JLabel("Maths");
		L6=new JLabel("Science");
		L7=new JLabel("SScience");
		L8=new JLabel("Total");
		L9=new JLabel("Average");
		L10=new JLabel("Result");


		TSno = new JTextField (5);
		TName = new JTextField (10);
		TM1 = new JTextField (5);
		TM2 = new JTextField (5);
		TM3 = new JTextField (5);
		TM4 = new JTextField (5);
		TM5 = new JTextField (5);
		TTot = new JTextField (5);
		TAvg = new JTextField (5);
		TRes = new JTextField (5);

		jpan1.add(L1);
		jpan1.add(TSno);

		jpan1.add(L2);
		jpan1.add(TName);

		jpan1.add(L3);
		jpan1.add(TM1);

		jpan1.add(L4);
		jpan1.add(TM2);

		jpan1.add(L5);
		jpan1.add(TM3);

		jpan1.add(L6);
		jpan1.add(TM4);

		jpan1.add(L7);
		jpan1.add(TM5);

		jpan1.add(L8);
		jpan1.add(TTot);

		jpan1.add(L9);
		jpan1.add(TAvg);

		jpan1.add(L10);
		jpan1.add(TRes);


		B1 = new JButton ("Calc");
		B1.setMnemonic ('C');
		B1.addActionListener(this);
		jpan1.add(B1);

		B2 = new JButton ("Save");
		B2.setMnemonic ('S');
		B2.addActionListener(this);
		jpan1.add (B2);

		B3 = new JButton ("Update");
		B3.setMnemonic ('U');
		B3.addActionListener(this);
		jpan1.add (B3);

		B4 = new JButton ("Delete");
		B4.setMnemonic ('D');
		B4.addActionListener(this);
		jpan1.add (B4); 

		f.add(jpan1,BorderLayout.CENTER);
		f.setSize(450,900);
		f.setVisible(true);
	}

public void actionPerformed (ActionEvent e)
{
	if (e.getSource ()== B1)
      {
		Calc();
      }
	else if (e.getSource () == B2)
	  {
		SaveData();
	  }
	else if (e.getSource () == B3)
	  {
		System.exit (0);
	  }
	else if (e.getSource () == B4)
	  {
		System.exit (0);
	  }

}
public void Calc()
{	int m1=Integer.parseInt(TM1.getText());
	int m2=Integer.parseInt(TM2.getText());
	int m3=Integer.parseInt(TM3.getText());
	int m4=Integer.parseInt(TM4.getText());
	int m5=Integer.parseInt(TM5.getText());
	int T=m1+m2+m3+m4+m5;
	float A=(float)T/5.0f;
	TTot.setText(Integer.toString(T));
	TAvg.setText(Float.toString(A));
	if((m1>=35)&&(m2>=35)&&(m3>=35)&&(m4>=35)&&(m5>=35))
		TRes.setText("Pass");
	else
		TRes.setText("Fail");

	
		//JOptionPane.showMessageDialog(this,"User Name : " + TUser.getText()+ " Password : " + TPass.getText(),"Login Details",JOptionPane.WARNING_MESSAGE);
}
public void SaveData()
{
	JOptionPane.showMessageDialog(f,"Data Saved....","Save to Database",JOptionPane.WARNING_MESSAGE);
}
public static void main (String a [])
{
	new Main1();
}

}