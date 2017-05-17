package com.imagemaker.ui.listener.picture.zoomOut;

import com.imagemaker.ui.component.forms.ImagePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class ZoomOutActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        BufferedImage image = ZoomOutActionHelper.createZoomOutImage(ImagePanel.getImage());
        ImagePanel.setImage(image);
    }
}
