package horstman.part9.task_11;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ImageViewFrame extends JFrame {
    private static final int WEIDTH = 300;
    private static final int HEIGHT = 400;
    private JLabel label;
    private JFileChooser chooser;

    public ImageViewFrame(){
        setSize(WEIDTH,HEIGHT);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu file = new JMenu("File");
        menuBar.add(file);

        JMenuItem open = new JMenuItem("Open");
        file.add(open);
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooser.setCurrentDirectory(new File("."));
                int result = chooser.showOpenDialog(ImageViewFrame.this);

                if(result==JFileChooser.APPROVE_OPTION){
                    String name = chooser.getSelectedFile().getPath();
                    label.setIcon(new ImageIcon(name));
                    pack();
                }
            }
        });

        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        label = new JLabel();
        add(label);


        chooser = new JFileChooser();


//        final ExtensionFileFilter filter = new ExtensionFileFilter();
//        filter.addExtension("jpg");
//        filter.addExtension("jpeg");
//        filter.addExtension("gif");
//        filter.addExtension("txt");


        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpeg", "jpg", "gif");
        chooser.setFileFilter(filter);

        chooser.setAccessory(new ImagePreviewer(chooser));
        chooser.setFileView(new FileIconView(filter,new ImageIcon("palette.gif")));
    }
}
