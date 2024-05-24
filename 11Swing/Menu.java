import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class Menu extends JPanel implements ActionListener, MenuListener
{
	JTextField text1;
	JPanel jpan;
	JWindow win1;

	public Menu (JFrame frm)
	{
	    JMenuBar bar = new JMenuBar ();
		setBackground (Color.lightGray);
		setLayout ( new BorderLayout());
	    setDoubleBuffered (true);

		win1 = new JWindow();
		win1.setBounds (100,100,400,200);
		jpan = (JPanel) win1.getContentPane ();
		win1.setBackground (Color.black);

	    JMenu mnu ;
		mnu = new JMenu ("File");
		mnu.addMenuListener (this);

	   JMenuItem itm ;
		itm = new JMenuItem ("New");
		itm.setMnemonic('N');
		itm.addActionListener (this);
		itm.setActionCommand ("New");
		mnu.add (itm);

		itm = new JMenuItem ("Open");
		itm.setMnemonic('O');
		itm.addActionListener (this);
		itm.setActionCommand ("Open");
		mnu.add (itm);

		itm = new JMenuItem ("Save");
		itm.setMnemonic('S');
		itm.addActionListener (this);
		itm.setActionCommand ("Save");
		mnu.add (itm);

		itm = new JMenuItem ("Exit");
		itm.setMnemonic('x');
		itm.addActionListener (this);
		itm.setActionCommand ("Exit");
		mnu.add (itm);

		bar.add (mnu);

		mnu = new JMenu ("Edit");
		mnu.addMenuListener (this);

		itm = new JMenuItem ("Cut");
		itm.setMnemonic('C');
		itm.addActionListener (this);
		itm.setActionCommand ("Cut");
		mnu.add (itm);

		itm = new JMenuItem ("Copy");
		itm.setMnemonic('o');
		itm.addActionListener (this);
		itm.setActionCommand ("Copy");
		mnu.add (itm);

		itm = new JMenuItem ("Paste");
		itm.setMnemonic('P');
		itm.addActionListener (this);
		itm.setActionCommand ("Paste");
		mnu.add (itm);

		itm = new JMenuItem ("Undo");
		itm.setMnemonic('U');
		itm.addActionListener (this);
		itm.setActionCommand ("Undo");
		mnu.add (itm);

		bar.add (mnu);

	frm.setJMenuBar (bar);
	text1 = new JTextField (5);
	text1.addActionListener (this);
	text1.setActionCommand ("Text Field Activated");
	jpan.add (text1,"North");
	}

	public void actionPerformed (ActionEvent e)
	{
		String msg;
		msg = e.getActionCommand ();
		text1.setText ("Your Selction is : "+msg);
		if (msg.equals("Exit"))
			System.exit (0);
		else if (msg.equals("Open"))
			{
	  			jpan.setLayout (new GridLayout (10,15));
	    		JFileChooser jfc ;
	    		jfc = new JFileChooser();
                jpan.add (jfc);
                win1.setSize (850,400);
                win1.setVisible(true);
            }
    	 }
	public void menuSelected (MenuEvent e)
	{
		text1.setText ("Menu Selected");
	}

	public void menuDeselected (MenuEvent e)
	{
		text1.setText ("Menu Deselected");
	}
	public void menuCanceled (MenuEvent e)
	{
		text1.setText ("Menu Canceled");
	}
	public Dimension getPreferredSize ()
	{
		return new Dimension (1024,768);
	}
	public static void main (String a [])
	{
		JFrame f1 = new JFrame ("Menu Sample");
		Menu m1 = new Menu (f1);

		f1.setBackground (Color.cyan);
		f1.setForeground (Color.red);
		f1.getContentPane().add(m1,"Center");
		f1.setSize (m1.getPreferredSize ());
		f1.setVisible (true);
	}
}