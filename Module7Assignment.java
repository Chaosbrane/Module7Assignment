import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Module7Assignment {
    public static void main(String[] args) {
        JFrame registration = new JFrame("User Registration");
        registration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registration.setSize(300, 300);
        registration.setLayout(new GridLayout(5, 2));

        JLabel namePrompt = new JLabel("Name");
        JTextField nameField = new JTextField();

        JLabel emailPrompt = new JLabel("Email");
        JTextField emailField = new JTextField();

        JLabel passwordPrompt = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField();

        JButton submit = new JButton("Register");
        JButton cancel = new JButton("Cancel");

        User user = new User();

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set user data
                user.SetName(nameField.getText());
                user.SetEmail(emailField.getText());
                user.SetPassword(new String(passwordField.getPassword()));

                JOptionPane.showMessageDialog(registration, "Registration Successful!\nName: " + user.GetName() + "\nEmail: " + user.GetEmail());
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the fields
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
            }
        });

        registration.add(namePrompt);
        registration.add(nameField);
        registration.add(emailPrompt);
        registration.add(emailField);
        registration.add(passwordPrompt);
        registration.add(passwordField);
        registration.add(submit);
        registration.add(cancel);
        registration.setVisible(true);
    }
}

