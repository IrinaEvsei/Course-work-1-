package com.imagemaker.ui.listener;

import com.imagemaker.ui.component.forms.ImageMakerMainFrameHandler;
import com.imagemaker.ui.component.file.FileChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveFileActionListener implements ActionListener {

    public SaveFileActionListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FileChooser fileChooser = new FileChooser(false);
        fileChooser.showSaveDialog(ImageMakerMainFrameHandler.getInstance());
    }
}
