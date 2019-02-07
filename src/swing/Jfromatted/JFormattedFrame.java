package swing.Jfromatted;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by Aleksandr_Svibovich on 12/11/2018.
 */
public class JFormattedFrame extends JFrame {
    NumberFormat nf;
    DateFormat df;

    JLabel emploID = new JLabel("Employee ID");
    JLabel monthlySalare = new JLabel("Monthly Salary");
    JLabel dateHired = new JLabel("Date Hired");

    JButton showUpdates = new JButton("Show Updates");

    JFormattedTextField salary;
    JFormattedTextField hired;
    JFormattedTextField id;

    JLabel lab = new JLabel("");

    public JFormattedFrame() {
        setLayout(new GridLayout(8, 1));
        try {
            MaskFormatter maskFormatter = new MaskFormatter("****");
            id = new JFormattedTextField(maskFormatter);
        } catch (ParseException e) {
            System.out.println("Invalid format");
            return;
        }

        id.setColumns(15);
        id.setValue("24-895");
        id.setFocusLostBehavior(JFormattedTextField.COMMIT_OR_REVERT);

        nf = NumberFormat.getCurrencyInstance();
        nf.setMaximumIntegerDigits(5);
        nf.setMinimumFractionDigits(2);


        salary = new JFormattedTextField(nf);
        salary.setColumns(15);
        salary.setValue(new Integer(7000));
        // поведение при потери фокуса
        salary.setFocusLostBehavior(JFormattedTextField.REVERT);

        df = DateFormat.getDateInstance();
        hired = new JFormattedTextField(df);
        hired.setColumns(15);
        hired.setValue(new Date());

        hired.setFocusLostBehavior(JFormattedTextField.PERSIST);

        id.addPropertyChangeListener("Value", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                lab.setText("Employee ID was changed");
            }
        });

        salary.addPropertyChangeListener("value", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                lab.setText("Salary was changed");
            }
        });

        hired.addPropertyChangeListener("value", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                lab.setText("Hired date was changed");
            }
        });

        showUpdates.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("<html> Employee ID: " +
                id.getValue() +
                "<br> Salary: " +
                salary.getValue() +
                "<br>Hired date: " +
                hired.getValue());
            }
        });

        add(emploID);
        add(id);
        add(monthlySalare);
        add(salary);
        add(dateHired);
        add(hired);
        add(showUpdates);
        add(lab);

    }
}
