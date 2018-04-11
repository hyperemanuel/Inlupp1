import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class JForm extends JPanel{
		private JTextField jewName = new JTextField(10);
		private JTextField gemstones = new JTextField(3);
		private JCheckBox goldenBox = new JCheckBox("Gold");
		
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