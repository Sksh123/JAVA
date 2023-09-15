import java.awt.*;
import java.awt.event.*;

public class LoginGUI extends Frame implements ActionListener {
    private Label usernameLabel, passwordLabel, resultLabel;
    private TextField usernameField, passwordField;
    private Button loginButton;

    public LoginGUI() {
        // Set the title of the window
        setTitle("Login Application");

        // Create a panel to hold the components
        Panel panel = new Panel(new GridLayout(3, 2));

        // Create labels for the username and password fields
        usernameLabel = new Label("Username:");
        passwordLabel = new Label("Password:");

        // Create text fields for the username and password
        usernameField = new TextField(20);
        passwordField = new TextField(20);
        passwordField.setEchoChar('*'); // Mask the password with '*'

        // Create a button to initiate login
        loginButton = new Button("Login");

        // Create a label to display the login result
        resultLabel = new Label();

        // Add the components to the panel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        panel.add(resultLabel);

        // Add the panel to the window
        add(panel);

        // Set the size of the window
        setSize(400, 150);

        // Add an action listener to the login button
        loginButton.addActionListener(this);

        // Make the window visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the username and password from the text fields
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Check if the username and password are correct
        if (username.equals("admin") && password.equals("password")) {
            // Display the user information
            resultLabel.setText("Login successful. Welcome " + username + "!");
        } else {
            // Display an error message
            resultLabel.setText("Wrong username or password.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the LoginGUI class
        new LoginGUI();
    }
}
