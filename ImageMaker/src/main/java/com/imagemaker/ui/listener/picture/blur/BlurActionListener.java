package com.imagemaker.ui.listener.picture.blur;

import com.imagemaker.ui.component.forms.ImagePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class BlurActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        BufferedImage image = BlurActionHelper.createBlurredImage(ImagePanel.getImage());
        ImagePanel.setImage(image);
    }
}