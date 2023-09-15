import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    private JTextField nameField, rollNoField, emailField, phoneField;
    private JRadioButton maleBtn, femaleBtn;
    private ButtonGroup genderGroup;
    private JComboBox<String> courseComboBox;
    private JButton submitBtn;

    public StudentRegistrationForm() {
        super("Student Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(20);
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel rollNoLabel = new JLabel("Roll No.: ");
        rollNoField = new JTextField(10);
        panel.add(rollNoLabel);
        panel.add(rollNoField);

        JLabel emailLabel = new JLabel("Email: ");
        emailField = new JTextField(20);
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel phoneLabel = new JLabel("Phone: ");
        phoneField = new JTextField(10);
        panel.add(phoneLabel);
        panel.add(phoneField);

        JLabel genderLabel = new JLabel("Gender: ");
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);
        panel.add(genderLabel);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);
        panel.add(genderPanel);

        JLabel courseLabel = new JLabel("Course: ");
        String[] courses = {"B.Tech", "B.E.", "B.Sc", "B.Com", "B.A."};
        courseComboBox = new JComboBox<String>(courses);
        panel.add(courseLabel);
        panel.add(courseComboBox);

        submitBtn = new JButton("Submit");
        submitBtn.addActionListener(this);
        panel.add(submitBtn);

        setContentPane(panel);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String rollNo = rollNoField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String gender = maleBtn.isSelected() ? "Male" : "Female";
        String course = (String) courseComboBox.getSelectedItem();

        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\n" +
                "Roll No.: " + rollNo + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Gender: " + gender + "\n" +
                "Course: " + course,
                "Registration Details",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
