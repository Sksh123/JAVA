import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginBtn, cancelBtn;

    public LoginScreen() {
        super("Login Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField(20);
        panel.add(usernameLabel);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(20);
        panel.add(passwordLabel);
        panel.add(passwordField);

        loginBtn = new JButton("Login");
        loginBtn.addActionListener(this);
        panel.add(loginBtn);

        cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(this);
        panel.add(cancelBtn);

        setContentPane(panel);
        pack();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this,
                        "Login Successful!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Invalid Username or Password!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == cancelBtn) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}
