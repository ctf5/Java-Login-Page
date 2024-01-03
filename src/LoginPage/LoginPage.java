package LoginPage;

import javax.swing.*;
import java.awt.*;

public class LoginPage {
    private JTextField textField1;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton button1;

    private JFrame frame;

    public LoginPage(){
        frame = new JFrame("User Login Page Frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 250));
        frame.setResizable(false);
        //Now add the Panel
        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
