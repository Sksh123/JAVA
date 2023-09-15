 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCalculator extends JFrame implements ActionListener {

    private JTextField numField;
    private JButton calcBtn;
    private JLabel resultLabel;

    public FactorialCalculator() {
        super("Factorial Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel numLabel = new JLabel("Enter a Number: ");
        numField = new JTextField(10);
        panel.add(numLabel);
        panel.add(numField);

        calcBtn = new JButton("Calculate");
        calcBtn.addActionListener(this);
        panel.add(calcBtn);

        resultLabel = new JLabel("Factorial: ");
        panel.add(resultLabel);

        setContentPane(panel);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(numField.getText());
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        resultLabel.setText("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        new FactorialCalculator();
    }
}
