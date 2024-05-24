import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;  
class Student extends JFrame implements ActionListener
{
	JFrame f= new JFrame("Student");
	JButton B1,B2,B3,B4;
	JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10;
	JTextField TSno,TName,TAge,TPhone,TEmail;
	JComboBox CmbDep,CmbDistrict,CmbStates,CmbGender;
	JTextArea TAddrs;
	Icon i1=new ImageIcon("images//OK.png");
    Icon i2=new ImageIcon("images//Cancel.png");
	public Student()
	{
		f.setTitle ("Personal Information");
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	
		JPanel jpan1;
		jpan1= new JPanel(new GridLayout(0,2));
		
		L1=new JLabel("Sno");
		L2=new JLabel("SName");
		L3=new JLabel("Gender");
		L4=new JLabel("Age");
		L5=new JLabel("Department");
		L6=new JLabel("Phone");
		L7=new JLabel("Email");
		L8=new JLabel("Address");
		L9=new JLabel("State");
		L10=new JLabel("District");
		
		TSno = new JTextField (10);
		TName = new JTextField (10);
		TAge = new JTextField (5);
		TPhone = new JTextField (5);
		TEmail = new JTextField (5);

		CmbGender=new JComboBox();
		CmbGender.addItem("Male");
		CmbGender.addItem("Female");
		CmbGender.addItem("Transgender");		
		CmbDep=new JComboBox();
		CmbDep.addItem("CSE");
		CmbDep.addItem("IT");
		CmbDep.addItem("ECE");
		CmbDep.addItem("MECH");
		CmbDep.addItem("EEE");
		CmbDep.addItem("Civil");
		CmbDep.addItem("BTech");
		CmbDep.addItem("BE AI");
		CmbDep.addItem("BE E&I");
		CmbDep.addItem("BE CSBS");
		CmbDep.addItem("BE CSD");
	
		CmbDistrict=new JComboBox();
		CmbDistrict.addItem("Erode");
		CmbDistrict.addItem("Salem");
		CmbDistrict.addItem("Coimbatore");
		CmbDistrict.addItem("Tirupur");
		CmbDistrict.addItem("Karur");
		CmbDistrict.addItem("Namakkal");
		CmbDistrict.addItem("Trichy");
		
		CmbStates=new JComboBox();
		CmbStates.addItem("Tamilnadu");
		CmbStates.addItem("Kerala");
		CmbStates.addItem("Karnataka");
		CmbStates.addItem("Gujarat");
		CmbStates.addItem("Telungana");
		CmbStates.addItem("Andraprades");
		CmbStates.addItem("Delhi");

		TAddrs=new JTextArea();
		
		jpan1.add(L1);
		jpan1.add(TSno);

		jpan1.add(L2);
		jpan1.add(TName);

		jpan1.add(L3);
		jpan1.add(CmbGender);
		
		jpan1.add(L4);
		jpan1.add(TAge);

		jpan1.add(L5);
		jpan1.add(CmbDep);

		jpan1.add(L6);
		jpan1.add(TPhone);

		jpan1.add(L7);
		jpan1.add(TEmail);

		jpan1.add(L8);
		jpan1.add(TAddrs);

		jpan1.add(L9);
		jpan1.add(CmbStates);

		jpan1.add(L10);
		jpan1.add(CmbDistrict);


		B1 = new JButton ("Show");
		B1.setMnemonic ('h');
		B1.addActionListener(this);
		jpan1.add(B1);

		B2 = new JButton ("Save",i1);
		B2.setMnemonic ('S');
		B2.addActionListener(this);
		jpan1.add (B2);

		B3 = new JButton ("Update");
		B3.setMnemonic ('U');
		B3.addActionListener(this);
		jpan1.add (B3);

		B4 = new JButton ("Delete",i2);
		B4.setMnemonic ('D');
		B4.addActionListener(this);
		jpan1.add (B4); 

		f.add(jpan1,BorderLayout.CENTER);
		f.setSize(500,700);
		f.setVisible(true);
	}

public void actionPerformed (ActionEvent e)
{
	if (e.getSource ()== B1)
      {
		Show();
      }
	else if (e.getSource () == B2)
	  {
		SaveData();
	  }
	else if (e.getSource () == B3)
	  {
		Update();
	  }
	else if (e.getSource () == B4)
	  {
		Delete();
	  }

}
public void Show()
{	

		String res=JOptionPane.showInputDialog(f,"Search Student","Enter the RegNo to Find");
		JOptionPane.showMessageDialog(f,"The the value is " +res,"Show",JOptionPane.ERROR_MESSAGE);
}
public void Update()
{	

		String res=JOptionPane.showInputDialog(f,"Search Student","Enter the RegNo to Update");
		JOptionPane.showMessageDialog(f,"The the value is " +res,"Update",JOptionPane.INFORMATION_MESSAGE);
}
public void SaveData()
{
		JOptionPane.showMessageDialog(f,"Data Saved....","Save to Database",JOptionPane.PLAIN_MESSAGE);
}
public void Delete()
{
		int s=JOptionPane.showConfirmDialog(f,"Are you sure ? Do you want to Delete ?","Delete",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(s==0)
			JOptionPane.showMessageDialog(f,"Yes Selected","Delete Conformation",JOptionPane.ERROR_MESSAGE);
		else if(s==1)
			JOptionPane.showMessageDialog(f,"No Selected","Delete Conformation",JOptionPane.WARNING_MESSAGE);
		else if(s==2)
			JOptionPane.showMessageDialog(f,"Cancel Selected","Delete Conformation",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(f,"Operation Cancelled ","Delete Conformation",JOptionPane.ERROR_MESSAGE);
}		
public static void main (String a [])
{
	new Student();
}
}