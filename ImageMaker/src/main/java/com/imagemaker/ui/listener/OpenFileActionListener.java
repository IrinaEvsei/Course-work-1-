package com.imagemaker.ui.listener;

import com.imagemaker.ui.component.forms.ImageMakerMainFrameHandler;
import com.imagemaker.ui.component.file.FileChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenFileActionListener implements ActionListener {

    public OpenFileActionListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FileChooser fileChooser = new FileChooser(true);
        fileChooser.showOpenDialog(ImageMakerMainFrameHandler.getInstance());
    }
}

