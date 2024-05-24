import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Login implements ActionListener
{
	JFrame f= new JFrame("Login");
	JButton B1,B2;
	JLabel L1,L2;
	JTextField TUser;
	JPasswordField TPass;
	public Login()
	{
		f.setTitle ("Login");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel jpan1 = (JPanel) getContentPane ();
		//JPanel jpan2 = (JPanel) getContentPane ();
		//jpan1.setLayout (new GridLayout(3,1));
		JPanel jpan1;
		jpan1= new JPanel(new GridLayout(3,1));
		
		L1=new JLabel("User Name");
		L2=new JLabel("Password");

		TUser = new JTextField (15);
		TPass= new JPasswordField(15);

		jpan1.add(L1);
		jpan1.add(TUser);

		jpan1.add(L2);
		jpan1.add(TPass);

		B1 = new JButton ("Login");
		B1.setMnemonic ('L');
		B1.addActionListener(this);
		jpan1.add(B1);

		B2 = new JButton ("Cancel");
		B2.setMnemonic ('C');
		B2.addActionListener(this);
		jpan1.add (B2);

 		f.add(jpan1,BorderLayout.CENTER);
		f.setSize(300,200);
		f.setVisible(true);
	}

public void actionPerformed (ActionEvent e)
{
	if (e.getSource ()== B1)
      {
		LoginMe();
      }
	else if (e.getSource () == B2)
	  {
		System.exit (0);
	  }
}
public void LoginMe()
{
		//JOptionPane.showMessageDialog(this,"User Name : " + TUser.getText()+ " Password : " + TPass.getText(),"Login Details",JOptionPane.WARNING_MESSAGE);
	if((TUser.getText().equals("CSC")) && (TPass.getText().equals("Jey")))
	{
		f.dispose();
		new Main1();			
	}
	else
		JOptionPane.showMessageDialog(f,"The user name or password you entered is incorrect" ,"Login Details",JOptionPane.WARNING_MESSAGE);


}
public static void main(String a[])
{
	new Login ();
}

}