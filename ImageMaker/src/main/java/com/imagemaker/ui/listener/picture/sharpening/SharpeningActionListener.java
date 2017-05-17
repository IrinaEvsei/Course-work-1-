package com.imagemaker.ui.listener.picture.sharpening;

import com.imagemaker.ui.component.forms.ImagePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class SharpeningActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        BufferedImage image = SharpeningActionHelper.createSharpenImage(ImagePanel.getImage());
        ImagePanel.setImage(image);
    }
}
