import java.net.*;  
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class ServerGUI extends JFrame implements ActionListener
{   JFrame f;
	String s1,s2;
	ServerSocket SS;
	DataInputStream din;
	DataOutputStream dout;
	Socket Sok;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;

	public ServerGUI()
	{
		try 
		{
		    f=new JFrame("Net Chat");
		    Color cnt=new Color(50,120,0); //RGB(red,Green,Bluee) value range from 0-255
		    Color txt=new Color(255,255,255);
		    Font Txtfont = new Font("Arial", Font.BOLD, 20);

			f.setTitle("Network Chat Server");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel jp = (JPanel) getContentPane();
			jp.setBackground(Color.GREEN);

			//jp.setLayout (new GridLayout(3,0));
			//jp.setLayout (new FlowLayout());
			jp.setLayout (null);

			l1=new JLabel("Message From Client");
			l1.setBounds(0,10,400,50); //setBounds(x Position, Y position,Width,Height)

			l2=new JLabel("Send Message To Client");
			l2.setBounds(0,110,400,50);

			t1=new JTextField(25);
			t1.setBounds(150,10,400,50);
			t1.setBackground(cnt);
			t1.setForeground(txt);
			t1.setFont(Txtfont);

			t2=new JTextField(25);
			t2.setBounds(150,110,400,50);
			t2.setBackground(cnt);
			t2.setForeground(txt);
			t2.setFont(Txtfont);

			b1=new JButton("Send Messgae");
			b1.setBounds(0,200,200,50);
			b1.setBackground(Color.ORANGE);
			b1.addActionListener(this);

			b2=new JButton("Receive Client");
			b2.setBounds(350,200,200,50);
			b2.setBackground(Color.ORANGE);
			b2.addActionListener(this);

			jp.add(l1);
			jp.add(t1);
			jp.add(l2);
			jp.add(t2);
			jp.add(b1);
			jp.add(b2);
			f.add(jp);
			s1="";
			s2="";
			f.setSize(600,300);
			f.setVisible(true);
			SS=new ServerSocket(4000); 
			Sok=SS.accept(); 
			din=new DataInputStream(Sok.getInputStream());  
			dout=new DataOutputStream(Sok.getOutputStream());
			
			}
			catch(Exception e)
			{
				System.out.print("\nStartup Error : "+ e.getMessage());
				e.printStackTrace();
			}

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			SendMsg();
		else if(e.getSource()==b2)
			ReceiveMsg();
	}
	public void SendMsg()
	{
		try
		{
			s2=t2.getText();  
			dout.writeUTF(s2);  
			dout.flush(); 
		}
		catch(Exception e)
		{
			System.out.print("Error : "+e.getMessage());
		}
	}	
	public void ReceiveMsg()
	{
		try 
		{
			s1=din.readUTF();  
			//System.out.println("client says: "+s1);  
			t1.setText(s1);
			 
		}
		catch(Exception e)
		{
			System.out.print("Error : "+ e.getMessage());
		}
	}
 public static void main(String a[])throws Exception
  { 
   new ServerGUI();	
	//din.close();  
	//SS.close();  
	//Sok.close();  
  }
}  