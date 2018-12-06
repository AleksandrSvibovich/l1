package H_SWING.Phone_book;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

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
    private HashMap<String,String> phoneBook = new HashMap<>();


    public PhoneBookFrame(){
        fillPhoneBook();
        setLayout(new GridLayout());

        JPanel panelInput = new JPanel();
        JPanel panelBoxRadio = new JPanel();
        JPanel resultPanel = new JPanel();

        contactName = new JLabel("Name");
        nameField = new JTextField(12);
        contactNumber = new JLabel("Number");
        number = new JTextField(11);
        result = new JLabel("aaaaaaaaaaa");

        panelInput.add(contactName);
        panelInput.add(nameField);
        panelInput.add(contactNumber);
        panelInput.add(number);


        exact = new JRadioButton("Exact");
        startsWith = new JRadioButton("Starts with");
        endsWith = new JRadioButton("Ends with");
        ignoreCase = new JCheckBox("Ignore case");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(exact);
        buttonGroup.add(startsWith);
        buttonGroup.add(endsWith);

        panelBoxRadio.add(ignoreCase);
        panelBoxRadio.add(exact);
        panelBoxRadio.add(startsWith);
        panelBoxRadio.add(endsWith);

        resultPanel.add(result);

        add(panelInput,BorderLayout.NORTH);
        add(panelBoxRadio,BorderLayout.CENTER);
        add(resultPanel,BorderLayout.SOUTH);

    }

    private void fillPhoneBook() {
        phoneBook.put("Vasja","8-800-555-35-25");
        phoneBook.put("Stas","8-858-555-35-25");
        phoneBook.put("Koljan","8-965-555-12-00");
        phoneBook.put("Dom","8-900-512-78-14");
        phoneBook.put("toljan","8-905-322-34-36");
        phoneBook.put("Blatnoi","8-965-555-77-77");
        phoneBook.put("blatnoi","8-999-555-66-66");
        phoneBook.put("Vasja","8-987-654-32-10");

    }
}
