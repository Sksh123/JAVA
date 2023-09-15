import java.awt.*;
import java.awt.event.*;

public class AWTLayoutExample extends Frame implements ActionListener {

    private Button northButton, southButton, eastButton, westButton, centerButton;

    public AWTLayoutExample() {
        // Set the title of the window
        setTitle("Java AWT Layout Example");

        // Create a panel to hold the components
        Panel panel = new Panel();

        // Set the layout manager for the panel
        panel.setLayout(new BorderLayout());

        // Create some buttons to add to the panel
        northButton = new Button("North");
        southButton = new Button("South");
        eastButton = new Button("East");
        westButton = new Button("West");
        centerButton = new Button("Center");

        // Add the buttons to the panel
        panel.add(northButton, BorderLayout.NORTH);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(eastButton, BorderLayout.EAST);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(centerButton, BorderLayout.CENTER);

        // Add the panel to the window
        add(panel);

        // Set the size of the window
        setSize(300, 300);

        // Add action listeners to the buttons
        northButton.addActionListener(this);
        southButton.addActionListener(this);
        eastButton.addActionListener(this);
        westButton.addActionListener(this);
        centerButton.addActionListener(this);

        // Make the window visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the source of the event
        Object source = e.getSource();

        // Display a message based on which button was clicked
        if (source == northButton) {
            System.out.println("North button clicked.");
        } else if (source == southButton) {
            System.out.println("South button clicked.");
        } else if (source == eastButton) {
            System.out.println("East button clicked.");
        } else if (source == westButton) {
            System.out.println("West button clicked.");
        } else if (source == centerButton) {
            System.out.println("Center button clicked.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the AWTLayoutExample class
        new AWTLayoutExample();
    }
}
