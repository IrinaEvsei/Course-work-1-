package com.imagemaker.ui.listener.picture.sharpening;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class SharpeningActionHelper {

    public static BufferedImage createSharpenImage(BufferedImage img) {

        BufferedImage newimg = new BufferedImage(img.getWidth(null), img.getHeight(null),BufferedImage.TYPE_INT_BGR);

        Graphics g = newimg.getGraphics();
        g.drawImage(img, 455, 255, null);

        float[] sharpKernel = {0.0f, -1.0f, 0.0f,
                -1.0f, 5.0f, -1.0f,
                0.0f, -1.0f, 0.0f};

        BufferedImageOp blur = new ConvolveOp(new Kernel(3, 3, sharpKernel));
        img = blur.filter(img, new BufferedImage(img.getWidth(), img.getHeight(), img.getType()));
        g.dispose();
        return img;
    }
}
