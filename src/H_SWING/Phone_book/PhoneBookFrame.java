package H_SWING.Phone_book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Aleksandr_Svibovich on 12/5/2018.
 */
public class PhoneBookFrame extends JFrame {
    private JLabel contactName;
    private JLabel contactNumber;
    private JLabel result;
    private JTextField nameField;
    private JTextField number;
    private JCheckBox ignoreCase;
    private JRadioButton exact;
    private JRadioButton startsWith;
    private JRadioButton endsWith;
    private HashMap<String, String> phoneBook = new HashMap<>();
    private JLabel searchOption = new JLabel("Search Options:");


    public PhoneBookFrame() {
        fillPhoneBook();
        setLayout(new GridLayout(0, 1));

        contactName = new JLabel("Name");
        nameField = new JTextField(12);
        contactNumber = new JLabel("Number");
        number = new JTextField(11);
        result = new JLabel("");



        exact = new JRadioButton("Exact", true);
        startsWith = new JRadioButton("Starts with");
        endsWith = new JRadioButton("Ends with");
        ignoreCase = new JCheckBox("Ignore case");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(exact);
        buttonGroup.add(startsWith);
        buttonGroup.add(endsWith);


<<<<<<< HEAD
        resultPanel.add(result);

        add(panelInput,BorderLayout.NORTH);
        add(panelBoxRadio,BorderLayout.CENTER);
        add(resultPanel,BorderLayout.SOUTH);
=======
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ignoreCase.isSelected()) {
                    String fromUI = nameField.getText().toLowerCase();
                    number.setText(phoneBook.get(fromUI));
                } else {
                    number.setText(phoneBook.get(nameField.getText()));
                }

            }
        });

        number.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
                    String name = pair.getValue();
                    if (number.getText().equals(name)) {
                        nameField.setText(pair.getKey());
                    }
                }

            }
        });

        add(contactName);
        add(nameField);
        add(contactNumber);
        add(number);

        add(searchOption);
        add(ignoreCase);
        add(exact);
        add(startsWith);
        add(endsWith);

>>>>>>> 8eda2ae4a93b3116245d3e0519ef9e00d96ea876

    }

    private void fillPhoneBook() {
        phoneBook.put("vasja", "8-800-555-35-25");
        phoneBook.put("stas", "8-858-555-35-25");
        phoneBook.put("koljan", "8-965-555-12-00");
        phoneBook.put("dom", "8-900-512-78-14");
        phoneBook.put("toljan", "8-905-322-34-36");
        phoneBook.put("blatnoi", "8-965-555-77-77");
        phoneBook.put("blatnoi", "8-999-555-66-66");
        phoneBook.put("vasja", "8-987-654-32-10");

    }
}
