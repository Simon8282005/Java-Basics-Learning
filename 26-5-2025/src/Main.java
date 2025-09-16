import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Please enter first interger: ");
        String num2 = JOptionPane.showInputDialog("Please enter second integer: ");

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        try {
            int result = number1 / number2;
            JOptionPane.showMessageDialog(null, String.format("Result: %d", result), "Result for calculation"
                    , JOptionPane.INFORMATION_MESSAGE);
        } catch (ArithmeticException a) {
            JOptionPane.showMessageDialog(null, String.format("Result: %s", a), "Result for calculation"
                    , JOptionPane.WARNING_MESSAGE);
        }

    }
}