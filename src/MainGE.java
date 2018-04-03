import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainGE extends JFrame {

		JTextField field = new JTextField(8);
		JLabel greet = new JLabel();
	
	public MainGE() {
		
		super("Hello.");
		setLayout(new FlowLayout());
		add(new JLabel("Name:"));
		add(field);
		JButton button = new JButton("Greet");
		button.addActionListener(ave -> greet.setText("Hello " + field.getText() + "! "));
		add(button);
		add(greet);
		setSize(400, 100);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}


