package com.imagemaker.ui.listener.picture.zoomOut;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ZoomOutActionHelper {
    public static BufferedImage createZoomOutImage(BufferedImage img) {
        int newImageWidth1 = img.getWidth()/2;
        int newImageHeight1 = img.getHeight()/2;
        BufferedImage zoomInImage1 = new BufferedImage(newImageWidth1 , newImageHeight1, img.getType());
        Graphics2D g = zoomInImage1.createGraphics();
        g.drawImage(img, 0, 0, newImageWidth1 , newImageHeight1 , null);
        g.dispose();

        return zoomInImage1;
    }
}
