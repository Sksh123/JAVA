import java.awt.*;
import java.awt.event.*;

public class MenuExample extends Frame {
    MenuBar menuBar;
    Menu menuA, menuB;
    MenuItem upItem, downItem, resetItem;

    public MenuExample() {
        super("Menu Example");

        // Create the menu bar
        menuBar = new MenuBar();

        // Create the menus
        menuA = new Menu("Menu A");
        menuB = new Menu("Menu B");

        // Create the menu items
        upItem = new MenuItem("Up");
        downItem = new MenuItem("Down");
        resetItem = new MenuItem("Reset");

        // Add the menu items to the menus
        menuA.add(upItem);
        menuA.add(downItem);
        menuB.add(resetItem);

        // Add the menus to the menu bar
        menuBar.add(menuA);
        menuBar.add(menuB);

        // Set the menu bar to the frame
        setMenuBar(menuBar);

        // Add a listener to handle menu item clicks
        MenuItemListener listener = new MenuItemListener();
        upItem.addActionListener(listener);
        downItem.addActionListener(listener);
        resetItem.addActionListener(listener);

        // Set the size of the frame and make it visible
        setSize(300, 200);
        setVisible(true);
    }

    // A listener to handle menu item clicks
    private class MenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            // Handle each menu item based on its command string
            if (command.equals("Up")) {
                System.out.println("Up clicked");
            } else if (command.equals("Down")) {
                System.out.println("Down clicked");
            } else if (command.equals("Reset")) {
                System.out.println("Reset clicked");
            }
        }
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
