import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SForm extends JPanel{
		private JTextField stockName = new JTextField(15);
		private JTextField amount = new JTextField(3);
		private JTextField price = new JTextField(4);
		
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
