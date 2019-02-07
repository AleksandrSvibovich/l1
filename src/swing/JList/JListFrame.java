package swing.JList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/10/2018.
 */
public class JListFrame extends JFrame {
    public JListFrame() {
        setLayout(new GridLayout(3,1));
        JPanel panel = new JPanel();
        JLabel label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        String[] listText = new String[]{"My", "Name", "Is", "My", "Name", "Are"};
        JList list = new JList(listText);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(120, 90));

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = list.getSelectedIndex();
                if(index>=0){
                    label.setText( list.getSelectedValue().toString());
                }else {
                    label.setText("Empty ");
                }
            }
        });

        panel.add(scrollPane);

        add(panel,BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
    }
}
