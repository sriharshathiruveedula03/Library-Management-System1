package practice3;
import javax.swing.*;
public class GUI
{
	public static void main(String[] args)
	{
		
		JFrame k=new JFrame();
		JButton p=new JButton("Submit");
		JRadioButton l=new JRadioButton("hi"); 
		JTextField g=new JTextField("harsha"); 
		JCheckBox f=new JCheckBox("true");
		
		String a[]= {"win","lose"};
		JComboBox<Object> d=new JComboBox<Object>(a);
	
		d.setBounds(800, 400, 330, 40);
		f.setBounds(400, 300, 250, 60);
		p.setBounds(600, 500, 100, 40);
		l.setBounds(100, 300, 400, 50);
		g.setBounds(500, 600, 200, 80);
		
		
		k.add(d);
		k.add(f);
		k.add(g);
		k.add(l);
		k.add(p);
		
		k.setSize(300, 400);
		k.setLayout(null);
		k.setVisible(true);
	}

}
