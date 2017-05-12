package com.imagemaker.ui.listener.picture.negative;

import com.imagemaker.ui.component.forms.ImagePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;


public class NegativeActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        BufferedImage image = NegativeActionHelper.getNegativeImage(ImagePanel.getImage());
        ImagePanel.setImage(image);
    }
}


