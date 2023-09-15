import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    private JButton addBtn, subBtn, mulBtn, divBtn, equalBtn;
    private JTextField numField1, numField2, resultField;

    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel numLabel1 = new JLabel("First Number: ");
        numField1 = new JTextField(10);
        panel.add(numLabel1);
        panel.add(numField1);

        JLabel numLabel2 = new JLabel("Second Number: ");
        numField2 = new JTextField(10);

        panel.add(numLabel2);
        panel.add(numField2);

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        equalBtn = new JButton("=");
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        equalBtn.addActionListener(this);
        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(mulBtn);
        panel.add(divBtn);
        panel.add(equalBtn);

        JLabel resultLabel = new JLabel("Result: ");
        resultField = new JTextField(10);
        resultField.setEditable(false);
        panel.add(resultLabel);
        panel.add(resultField);

        setContentPane(panel);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());
        double result = 0;

        if (e.getSource() == addBtn) {
            result = num1 + num2;
        } else if (e.getSource() == subBtn) {
            result = num1 - num2;
        } else if (e.getSource() == mulBtn) {
            result = num1 * num2;
        } else if (e.getSource() == divBtn) {
            result = num1 / num2;
        } else if (e.getSource() == equalBtn) {
            resultField.setText(String.valueOf(result));
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
