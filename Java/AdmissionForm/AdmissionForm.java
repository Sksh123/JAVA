import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdmissionForm extends Frame {
    private Label nameLabel;
    private TextField nameTextField;
    private Label ageLabel;
    private TextField ageTextField;
    private Button submitButton;

    public AdmissionForm() {
        // Set frame properties
        setTitle("Admission Form");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Create form components
        nameLabel = new Label("Name:");
        nameTextField = new TextField(20);
        ageLabel = new Label("Age:");
        ageTextField = new TextField(3);
        submitButton = new Button("Submit");

        // Add submit button click listener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                int age;
                
                try {
                    age = Integer.parseInt(ageTextField.getText());
                } catch (NumberFormatException ex) {
                    // Handle the case where age is not a valid integer
                    MessageBox.show("Invalid Age", "Please enter a valid age.");
                    return; // Don't proceed further
                }

                // Do something with the submitted data, e.g., validate and save to a database

                // Show a confirmation dialog
                MessageBox.show("Form Submitted", "Name: " + name + "\nAge: " + age);
            }
        });

        // Add components to the frame
        add(nameLabel);
        add(nameTextField);
        add(ageLabel);
        add(ageTextField);
        add(submitButton);

        // Show the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        AdmissionForm form = new AdmissionForm();
    }
}

class MessageBox {
    public static void show(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
