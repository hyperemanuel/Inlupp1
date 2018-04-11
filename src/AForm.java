import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AForm extends JPanel{
		private JTextField aName = new JTextField(15);
		private JTextField price = new JTextField(4);
		private JTextField wear = new JTextField(2);
		
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
		
		public String getName() {
			return aName.getText();
		}
		
		public int getPrice() {
			return Integer.parseInt(price.getText());
		}
		
		public int getWear() {
			return Integer.parseInt(wear.getText());
		}
		
	}