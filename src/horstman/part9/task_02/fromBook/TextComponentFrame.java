package horstman.part9.task_02.fromBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr_Svibovich on 10/17/2018.
 */
public class TextComponentFrame extends JFrame {
    public static final int TEXTAREA_ROWS = 8;
    public static final int TEXTAREA_COLUMN = 20;

    public TextComponentFrame(){
        final JTextField textField = new JTextField();
        final JPasswordField passwordField = new JPasswordField();

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2,2));
        northPanel.add(new JLabel("User name: ", SwingConstants.LEFT));
        northPanel.add(textField);
        northPanel.add(new JLabel("Password: ",SwingConstants.LEFT));
        northPanel.add(passwordField);

        add(northPanel,BorderLayout.NORTH);

        final JTextArea textArea = new JTextArea(TEXTAREA_ROWS,TEXTAREA_COLUMN);
        JScrollPane jScrollPane = new JScrollPane(textArea);

        add(jScrollPane,BorderLayout.CENTER);

        // ввод кнопки для заполнения текстовой области текстом

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,2));
        JLabel label = new JLabel(" Test ",SwingConstants.LEFT);
        southPanel.add(label);
        JButton button = new JButton("Insert");
        southPanel.add(button);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("User name:" + textField.getText() + '\n' + "Password: " + passwordField.getPassword() + '\n' + passwordField.getEchoChar());
            }
        });


        // check boxes adding
        JCheckBox bold = new JCheckBox("Bold");
        JCheckBox italic = new JCheckBox("Italic");

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode = 0;
                if(bold.isSelected()){
                    mode += Font.BOLD;
                }
                if(italic.isSelected()){
                    mode += Font.ITALIC;
                }
                label.setFont(new Font("Serif",mode, 14));
            }
        };

        bold.addActionListener(listener);
        italic.addActionListener(listener);

        southPanel.add(bold);
        southPanel.add(italic);

        add(southPanel,BorderLayout.SOUTH);
        pack();

    }
}
