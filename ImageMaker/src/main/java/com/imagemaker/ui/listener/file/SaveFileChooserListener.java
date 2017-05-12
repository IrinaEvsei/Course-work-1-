package com.imagemaker.ui.listener.file;


import com.imagemaker.ui.component.file.FileChooser;
import com.imagemaker.ui.component.forms.ImageMakerMainFrameHandler;
import com.imagemaker.ui.component.forms.ImagePanel;
import com.imagemaker.ui.utils.MessageDialogUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class SaveFileChooserListener implements ActionListener {

    public SaveFileChooserListener() {
        super();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            FileChooser fileChooser = (FileChooser) e.getSource();
            if (JFileChooser.APPROVE_SELECTION.equals(e.getActionCommand())) {
                File file = fileChooser.getSelectedFile();
                if (fileChooser.getFileFilter() == FileChooser.FILTER_JPG) {
                    ImageIO.write(ImagePanel.getImage(), "jpg", new File(file.getPath() + ".jpg"));
                } else if (fileChooser.getFileFilter() == FileChooser.FILTER_PNG) {
                    ImageIO.write(ImagePanel.getImage(), "png", new File(file.getPath() + ".png"));
                }
            }
        } catch (Exception ex) {
            MessageDialogUtils.showErrorMessage(ImageMakerMainFrameHandler.getInstance().getRootPane(), "Произошла ошибка при открытии файла");
        }

    }



}
