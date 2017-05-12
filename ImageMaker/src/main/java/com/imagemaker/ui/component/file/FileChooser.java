package com.imagemaker.ui.component.file;



import com.imagemaker.ui.listener.file.OpenFileChooserListener;
import com.imagemaker.ui.listener.file.SaveFileChooserListener;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser extends JFileChooser {

    public static final FileNameExtensionFilter FILTER_JPG = new FileNameExtensionFilter("*.JPG", "jpg");
    public static final FileNameExtensionFilter FILTER_PNG = new FileNameExtensionFilter("*.PNG", "png");

    public FileChooser(boolean openDialog) {
        super();
        buildComponent(openDialog);
    }

    private void buildComponent(boolean openDialog) {
        addChoosableFileFilter(FILTER_JPG);
        addChoosableFileFilter(FILTER_PNG);
        if (openDialog){
            addActionListener(new OpenFileChooserListener());
        }else {
            addActionListener(new SaveFileChooserListener());
        }

    }
}
