package horstman.part9.task_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordChooser extends JPanel {

    private JTextField username;
    private JPasswordField passwordField;
    private JButton okButton;
    private boolean ok;
    private JDialog dialog;

    public PasswordChooser(){
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        panel.add(new Label("User name"));
        panel.add(username = new JTextField(""));
        panel.add(new Label("Password"));
        panel.add(passwordField = new JPasswordField(""));
        add(panel,BorderLayout.CENTER);

        okButton = new JButton("Ok");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ok = true;
                dialog.setVisible(false);
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel,BorderLayout.SOUTH);


    }

    public void setUser(User u){
        username.setText(u.getName());
    }

    public User getUser(){
        return new User(username.getText(), passwordField.getPassword());
    }

    public boolean showDialog(Component parent, String title){
        ok = false;

        Frame owner = null;
        if(parent instanceof Frame) owner = (Frame) parent;
        else owner = (Frame) SwingUtilities.getAncestorOfClass(Frame.class,parent);

        if (dialog==null || dialog.getOwner() != owner){
            dialog = new JDialog(owner,true);
            dialog.add(this);
            dialog.getRootPane().setDefaultButton(okButton);
            dialog.pack();
        }
        dialog.setTitle(title);
        dialog.setVisible(true);
        return ok;
    }

}
