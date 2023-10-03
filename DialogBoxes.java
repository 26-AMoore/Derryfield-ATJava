import javax.swing.JOptionPane;
public class DialogBoxes {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your first name: ");
        String answer = JOptionPane.showInputDialog("Pick a random number: ");
        int num1 = Integer.parseInt(answer);
        answer = JOptionPane.showInputDialog("Pick a random number: ");
        int num2 = Integer.parseInt(answer);
        JOptionPane.showMessageDialog(null,"Your name is "+name+" and the two numbers you chose add up to "+num1+num2);

    }
}
