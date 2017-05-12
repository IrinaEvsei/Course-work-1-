package com.imagemaker.ui.listener.picture.blur;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class BlurActionHelper {

    public static BufferedImage createBlurredImage(BufferedImage img) {

        BufferedImage newimg = new BufferedImage(img.getWidth(null), img.getHeight(null),BufferedImage.TYPE_INT_BGR);

        Graphics g = newimg.getGraphics();
        g.drawImage(img, 455, 255, null);

        float[] blurKernel = {
                1 / 9f, 1 / 9f, 1 / 9f,
                1 / 9f, 1 / 9f, 1 / 9f,
                1 / 9f, 1 / 9f, 1 / 9f
        };

        BufferedImageOp blur = new ConvolveOp(new Kernel(3, 3, blurKernel));
        img = blur.filter(img, new BufferedImage(img.getWidth(), img.getHeight(), img.getType()));
        g.dispose();
        return img;
    }
}
