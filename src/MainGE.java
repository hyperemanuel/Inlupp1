import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainGE extends JFrame {

		JTextField field = new JTextField(8);
		JLabel greet = new JLabel(" ");
	
	public MainGE() {
		super("Hello.");
		
		JPanel north = new JPanel();
		north.add(new JLabel("North"));
		add(north, BorderLayout.NORTH);
		
		JPanel east = new JPanel();
		JButton b1 = new JButton("Greet");
		east.add(b1);
		add(east, BorderLayout.EAST);
		b1.addActionListener(ave -> greet.setText("Hello " + field.getText() + "! "));
		
		JPanel south = new JPanel();
		south.add(greet);
		add(south, BorderLayout.SOUTH);
		
		JPanel west = new JPanel();
		JLabel jl1= new JLabel("Name:");
		west.add(jl1);
		add(west, BorderLayout.WEST);
		
		JPanel center = new JPanel();
		center.add(field);
		add(center, BorderLayout.CENTER);
		
		setSize(500, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}