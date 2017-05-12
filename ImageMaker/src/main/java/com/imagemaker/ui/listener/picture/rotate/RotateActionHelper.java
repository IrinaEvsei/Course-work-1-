package com.imagemaker.ui.listener.picture.rotate;


import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class RotateActionHelper {

    public static BufferedImage rotate(BufferedImage img,double degrees)throws IOException
    {
        BufferedImage newImage = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());

        AffineTransform tx = new AffineTransform();
        tx.rotate(Math.toRadians(degrees), img.getWidth() / 2, img.getHeight() / 2);

        Graphics2D g2 = newImage.createGraphics();
        g2.drawImage(img, tx, null);

        img=newImage;
        g2.dispose();
        return img;
    }
}
