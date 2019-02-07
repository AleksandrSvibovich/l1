package horstman.part9.task_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataExchange  extends JFrame {

    public static final int TEXT_ROWS = 10;
    public static final int TEXT_COLUMN = 20;
    private PasswordChooser dialog = null;
    private JTextArea textArea;

    public DataExchange(){
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem connect = new JMenuItem("Connect");
        JMenuItem exit = new JMenuItem("Exit");

        connect.addActionListener(new ConnectAction());

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        fileMenu.add(connect);
        fileMenu.add(exit);

        textArea = new JTextArea(TEXT_ROWS,TEXT_COLUMN);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        pack();


    }
    private class ConnectAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(dialog == null){
                dialog = new PasswordChooser();
            }

            dialog.setUser(new User("youname", null));

            if (dialog.showDialog(DataExchange.this,"Connect")){
                User u = dialog.getUser();
                textArea.append("user name = " + u.getName() + ", password = "
                        + (new String(u.getPassword()))+ "\n");
            }
        }
    }
}
