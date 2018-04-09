import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainGE extends JFrame {

		JTextArea textarea = new JTextArea();
	
	public MainGE() {
		super("Hello.");
		
		JPanel north = new JPanel();
		north.add(new JLabel("Valuable"));
		add(north, BorderLayout.NORTH);
		
		JPanel east = new JPanel();
		east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
		east.setBorder(new EmptyBorder(350, 10, 10, 10));
		east.add(new JLabel("Group by:"));
		ButtonGroup b1 = new ButtonGroup();
		JRadioButton radioName = new JRadioButton("Name");
		JRadioButton radioValue = new JRadioButton("Value");
		b1.add(radioName);
		b1.add(radioValue);
		east.add(radioName);
		east.add(radioValue);
		add(east, BorderLayout.EAST);
		
		JPanel south = new JPanel();
		JLabel newItem = new JLabel("New:");
		south.add(newItem);
		JComboBox<String> c1 = new JComboBox<>();
		c1.addItem("Select category..");
		c1.addItem("Jewellery");
		c1.addItem("Stock");
		c1.addItem("Apparatus");
		south.add(c1);
		JButton show= new JButton("Show");
		south.add(show);
		JButton mCrash = new JButton("Market crash");
		south.add(mCrash);
		add(south, BorderLayout.SOUTH);
		
		textarea.setText("Absolutely");
		textarea.setEditable(false);
		JScrollPane scroll = new JScrollPane(textarea);
		add(scroll, BorderLayout.CENTER);
		
		setSize(500, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
}