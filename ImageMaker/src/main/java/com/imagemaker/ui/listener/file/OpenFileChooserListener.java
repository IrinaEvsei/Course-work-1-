package com.imagemaker.ui.listener.file;


import com.imagemaker.ui.component.file.FileChooser;
import com.imagemaker.ui.component.forms.ImageMakerMainFrameHandler;
import com.imagemaker.ui.utils.MessageDialogUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

public class OpenFileChooserListener implements ActionListener {

    public OpenFileChooserListener() {
        super();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            FileChooser fileChooser = (FileChooser) e.getSource();
            if (JFileChooser.APPROVE_SELECTION.equals(e.getActionCommand())){
                File file = fileChooser.getSelectedFile();
                ImageMakerMainFrameHandler.getInstance().openImage(file);
            }
        } catch (Exception ex) {
            MessageDialogUtils.showErrorMessage(ImageMakerMainFrameHandler.getInstance().getRootPane(), "Произошла ошибка при открытии файла");
        }
        }


}
