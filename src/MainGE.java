import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainGE extends JFrame implements ActionListener {

		JTextField field = new JTextField(8);
		JLabel greet = new JLabel();
	
	public MainGE() {
		
		super("Hello.");
		setLayout(new FlowLayout());
		add(new JLabel("Name:"));
		add(field);
		JButton button = new JButton("Greet");
		button.addActionListener(this);
		add(button);
		add(greet);
		setSize(400, 100);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ave) {
		String name = field.getText();
		greet.setText("Hello " + name + "! ");
	}
}


