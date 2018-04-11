import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainGE extends JFrame {

		private JTextArea textarea = new JTextArea();
		private String[] options = {"Select category..", "Jewellery", "Stock", "Valuable"};
		private JComboBox<String> c1 = new JComboBox<String>(options);
		private List<Valuable> valuableRegister = new ArrayList<>();
	
	public MainGE() {
		super("Valuables collection");
		
		JPanel north = new JPanel();
		north.add(new JLabel(""));
		add(north, BorderLayout.NORTH);
		
		JPanel east = new JPanel();
		east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
		east.setBorder(new EmptyBorder(80, 10, 10, 10));
		east.add(new JLabel("Sort by:"));
		ButtonGroup b1 = new ButtonGroup();
		JRadioButton radioName = new JRadioButton("Name");
		radioName.addActionListener(new sortByNameListener());
		JRadioButton radioValue = new JRadioButton("Value");
		radioValue.addActionListener(new sortByValueListener());
		JButton demo = new JButton("Demo");
		demo.addActionListener(new demo());
		b1.add(radioName);
		b1.add(radioValue);
		east.add(radioName);
		east.add(radioValue);
		east.add(demo);
		add(east, BorderLayout.EAST);
		
		JPanel south = new JPanel();
		JLabel newItem = new JLabel("New:");
		south.add(newItem);
		c1.addActionListener(new comboListener());
		south.add(c1);
		JButton show= new JButton("Show");
		show.addActionListener(new showListener());
		south.add(show);
		JButton mCrash = new JButton("Market crash");
		mCrash.addActionListener(new nullifyListener());
		south.add(mCrash);
		add(south, BorderLayout.SOUTH);
		
		textarea.setEditable(false);
		JScrollPane scroll = new JScrollPane(textarea);
		add(scroll, BorderLayout.CENTER);
		
		setSize(600, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void printList() {
		textarea.setText("");
		for (Valuable v : valuableRegister) {
			textarea.append(v + "\n");
		}
	}
	
	private class comboListener implements ActionListener{
		public void actionPerformed(ActionEvent ave) {
			if(c1.getSelectedIndex() == 1) {
				try {
					JForm j1 = new JForm();
					int svar = JOptionPane.showConfirmDialog(MainGE.this, j1, "New jewellery item", JOptionPane.OK_CANCEL_OPTION);

					if (svar != JOptionPane.OK_OPTION)
						return;
					String name = j1.getName();
					int gemstones = j1.getGemstones();
					boolean golden = j1.getGolden();
					valuableRegister.add(new Jewellery(name, gemstones, golden));
				}
				catch(NumberFormatException e){
					JOptionPane.showMessageDialog(MainGE.this, "Wrong input!");
				}
			}
			else if(c1.getSelectedIndex() == 2) {
				try {
					SForm s1 = new SForm();
					int svar = JOptionPane.showConfirmDialog(MainGE.this, s1, "New stock", JOptionPane.OK_CANCEL_OPTION);

					if (svar != JOptionPane.OK_OPTION)
						return;
					String name = s1.getName();
					int amount = s1.getAmount();
					int price = s1.getPrice();
					valuableRegister.add(new Stock(name, amount, price));
				}
				catch(NumberFormatException e){
					JOptionPane.showMessageDialog(MainGE.this, "Wrong input!");
				}
			}
			else if(c1.getSelectedIndex() == 3) {
				try {
					AForm a1 = new AForm();
					int svar = JOptionPane.showConfirmDialog(MainGE.this, a1, "New apparatus", JOptionPane.OK_CANCEL_OPTION);

					if (svar != JOptionPane.OK_OPTION)
						return;
					String name = a1.getName();
					int price = a1.getPrice();
					int wear = a1.getWear();
					valuableRegister.add(new Apparatus(name, price, wear));
				}
				catch(NumberFormatException e){
					JOptionPane.showMessageDialog(MainGE.this, "Wrong input!");
				}
			}
		}
	}
	
	private class showListener implements ActionListener {
		public void actionPerformed(ActionEvent ave) {
			printList();
		}
	}
	
	private class nullifyListener implements ActionListener{
		public void actionPerformed(ActionEvent ave) {
			for (Valuable v : valuableRegister) {
				if (v instanceof Stock) {((Stock) v).setPrice(0);}	
			}
			printList();
		}
	}
	
	private class sortByNameListener implements ActionListener {
		public void actionPerformed(ActionEvent ave) {
			valuableRegister.sort((v1, v2) -> v1.getName().compareTo(v2.getName()));
			printList();
		}
	}
	
	private class sortByValueListener implements ActionListener{
		public void actionPerformed(ActionEvent ave) {
			valuableRegister.sort(new ValueComp());
			printList();
		}
	}
	
	private class ValueComp implements Comparator<Valuable>{
		public int compare(Valuable v1, Valuable v2) {
			if(v1.getRealValue() > v2.getRealValue()) {return -1;}
			else if(v1.getRealValue() == v2.getRealValue()) {return 0;}
			else {return 1;}
		}
	}
	
	private class demo implements ActionListener {
		int x = 0;
		public void actionPerformed(ActionEvent ave) {	 
			 if (x++ == 0) {
				valuableRegister.add(new Jewellery("Necklace", 4, true));
			 	valuableRegister.add(new Jewellery("Ring", 15, true));
			 	valuableRegister.add(new Jewellery("Ring", 15, false));
			 
			 	valuableRegister.add(new Stock("Apple", 500, 100));
			 	valuableRegister.add(new Stock("DOW", 30, 80));
			 	valuableRegister.add(new Stock("BTC", 2, 7000));
			 
			 	valuableRegister.add(new Apparatus("iPhone", 500, 7));
			 	valuableRegister.add(new Apparatus("MBP", 2000, 8));
			 	valuableRegister.add(new Apparatus("ThinkPad", 4500, 10));
			 	
			 }
		}
	}
}