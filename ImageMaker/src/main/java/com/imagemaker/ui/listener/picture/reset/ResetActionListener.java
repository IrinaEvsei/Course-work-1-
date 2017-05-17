package com.imagemaker.ui.listener.picture.reset;

import com.imagemaker.ui.component.forms.ImagePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ImagePanel.resetImage();
    }
}


