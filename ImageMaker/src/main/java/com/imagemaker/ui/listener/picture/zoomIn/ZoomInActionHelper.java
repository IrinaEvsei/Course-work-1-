package com.imagemaker.ui.listener.picture.zoomIn;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ZoomInActionHelper {
    public static BufferedImage createZoomInImage(BufferedImage img) {
        int newImageWidth = img.getWidth()*2;
        int newImageHeight = img.getHeight()*2;
        BufferedImage zoomInImage = new BufferedImage(newImageWidth , newImageHeight, img.getType());
        Graphics2D g = zoomInImage.createGraphics();
        g.drawImage(img, 0, 0, newImageWidth , newImageHeight , null);
        g.dispose();

        return zoomInImage;
    }
}
