import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String quantity = JOptionPane.showInputDialog("How old are you?");
int age = Integer.parseInt(quantity);
if(age < 18) {
	JOptionPane.showMessageDialog(null, "Get older first");
}
if(age > 18) {
	JOptionPane.showMessageDialog(null, "who will be the next president?");
}
}
}
