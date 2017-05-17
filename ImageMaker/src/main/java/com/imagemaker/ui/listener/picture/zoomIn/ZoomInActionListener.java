package com.imagemaker.ui.listener.picture.zoomIn;

import com.imagemaker.ui.component.forms.ImagePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class ZoomInActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        BufferedImage image = ZoomInActionHelper.createZoomInImage(ImagePanel.getImage());
        ImagePanel.setImage(image);
    }
}


