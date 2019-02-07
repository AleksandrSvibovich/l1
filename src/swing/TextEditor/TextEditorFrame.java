package swing.TextEditor;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr_Svibovich on 12/12/2018.
 */
public class TextEditorFrame extends JFrame {
    private JTextArea mainArea;
    private JScrollPane scrollPane;
    private JLabel searchFor;
    private JLabel fileName;
    private JLabel currentSize;
    private JTextField search;
    private JTextField name;
    private JButton findFromTop;
    private JButton findNext;
    private JButton saveFile;
    private JButton load;
    private int positionX = 0;

    public TextEditorFrame() {

        mainArea = new JTextArea();
        scrollPane = new JScrollPane(mainArea);
        scrollPane.setPreferredSize(new Dimension(270, 160));


        searchFor = new JLabel("Search For: ");
        searchFor.setPreferredSize(new Dimension(100, 10));
        search = new JTextField("new", 15);

        findFromTop = new JButton("Find From Top");
        findFromTop.setHorizontalAlignment(SwingConstants.LEFT);
        findNext = new JButton("Find Next");

        findFromTop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                find();
            }
        });

        findNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                find();
            }
        });

        fileName = new JLabel("Filename: ");
        fileName.setPreferredSize(new Dimension(100, 10));
        name = new JTextField("sample.java", 15);

        saveFile = new JButton("Save File");
        saveFile.setHorizontalAlignment(SwingConstants.LEFT);
        load = new JButton("Load");

        saveFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });

        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                load();
            }
        });

        currentSize = new JLabel("Current size: 0");
        currentSize.setPreferredSize(new Dimension(150, 10));
        currentSize.setHorizontalAlignment(SwingConstants.CENTER);
        mainArea.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                positionX = mainArea.getCaretPosition();
                currentSize.setText("Current size: " + positionX);
            }
        });

        setLayout(new FlowLayout());

        add(scrollPane);
        add(searchFor);
        add(search);
        add(findFromTop);
        add(findNext);
        add(fileName);
        add(name);
        add(saveFile);
        add(load);
        add(currentSize);
    }

    private void load() {
        currentSize.setText("load");
    }

    private void save() {
        currentSize.setText("save");
    }

    private void find() {
        String originText = mainArea.getText();
        String searchable = search.getText();
        if (originText.contains(searchable)) {
            positionX = originText.indexOf(searchable);
            mainArea.setCaretPosition(positionX);
            mainArea.requestFocusInWindow();
        }
    }
}
