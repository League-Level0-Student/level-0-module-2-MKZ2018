import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String quantity = JOptionPane.showInputDialog("How tall are you in inches?");
int heightnum = Integer.parseInt(quantity);
if (heightnum > 48) {
	JOptionPane.showMessageDialog(null, "you can go on the rollercoaster");
}
if (heightnum < 48) {
	JOptionPane.showMessageDialog(null, "grow taller first");
}
}
}
