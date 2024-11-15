
import javax.swing.JOptionPane;

public class GUI {

    public static void main(String[] args) {
        
        String name;
		int age;
		double height;
		
		name = JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null,"Hello"+name);
		
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
		
		
		JOptionPane.showMessageDialog(null,"You are "+age+" years old");
		JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");

    }
}
