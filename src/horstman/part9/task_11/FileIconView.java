package horstman.part9.task_11;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileView;
import java.io.File;

public class FileIconView extends FileView {
    private FileFilter filter;
    private Icon icon;

    public FileIconView(FileNameExtensionFilter filter, ImageIcon imageIcon) {
        this.filter = filter;
        this.icon = imageIcon;
    }

    public Icon getIcon(File f) {
        if (!f.isDirectory() && filter.accept(f)) {
            return icon;
        } else {
            return null;
        }
    }
}
