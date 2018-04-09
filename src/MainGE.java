import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainGE extends JFrame {

		JTextArea textarea = new JTextArea();
		String[] options = {"Select category..", "Jewellery", "Stock", "Valuable"};
		JComboBox<String> c1 = new JComboBox<String>(options);
	
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

	class jewelleryListener implements ActionListener{
		public void actionPerformed(ActionEvent ave) {
			
		}
	}

	class JForm extends JPanel{
		JTextField jewName = new JTextField(10);
		JTextField gemstones = new JTextField(3);
		JCheckBox goldenBox = new JCheckBox("Gold");
		
		JForm(){
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			JPanel r1 = new JPanel();
			r1.add(new JLabel("Name:"));
			r1.add(jewName);
			add(r1);
			JPanel r2 = new JPanel();
			r2.add(new JLabel("Gemstones:"));
			r2.add(gemstones);
			add(r2);
			add(goldenBox);
		}
		public String getName() {
			return jewName.getText();
		}
		public int getGemstones() {
			return Integer.parseInt(gemstones.getText());
		}
		public boolean getGolden() {
			return goldenBox.isSelected();
		}
}
	
	class stockListener implements ActionListener{
		public void actionPerformed(ActionEvent ave) {
			
		}
	}
	
	class SForm extends JPanel{
		JTextField stockName = new JTextField(15);
		JTextField amount = new JTextField(3);
		JTextField price = new JTextField(4);
		
		SForm(){
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			JPanel r1 =new JPanel();
			r1.add(new JLabel("Name:"));
			r1.add(stockName);
			add(r1);
			JPanel r2 = new JPanel();
			r2.add(new JLabel("Amount:"));
			r2.add(amount);
			add(r2);
			JPanel r3 = new JPanel();
			r3.add(new JLabel("Price:"));
			r3.add(price);
			add(r3);
		}
		
		public String getName() {
			return stockName.getText();
		}
		
		public int getAmount() {
			return Integer.parseInt(amount.getText());
		}
		
		public int getPrice() {
			return Integer.parseInt(price.getText());
		}
	}
	
	class AForm extends JPanel{
		JTextField aName = new JTextField(15);
		JTextField price = new JTextField(4);
		JTextField wear = new JTextField(2);
		
		AForm(){
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			JPanel r1 =new JPanel();
			r1.add(new JLabel("Name:"));
			r1.add(aName);
			add(r1);
			JPanel r2 = new JPanel();
			r2.add(new JLabel("Amount:"));
			r2.add(price);
			add(r2);
			JPanel r3 = new JPanel();
			r3.add(new JLabel("Price:"));
			r3.add(wear);
			add(r3);
		}
		
	}
	
	
	