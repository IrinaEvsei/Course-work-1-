package com.imagemaker.ui.listener.picture.negative;

import java.awt.image.BufferedImage;

public class NegativeActionHelper {

    public static BufferedImage getNegativeImage(BufferedImage img) {
        int w1 = img.getWidth();
        int h1 = img.getHeight();
        // int value[][] = new int[w1][h1];
        BufferedImage neg = new BufferedImage(w1, h1, 1);
        int value, alpha, r, g, b;
        for (int i = 0; i < w1; i++) {
            for (int j = 0; j < h1; j++) {
                value = img.getRGB(i, j); // store value
                alpha = getAlpha(value);
                r = 255 - getRed(value);
                g = 255 - getGreen(value);
                b = 255 - getBlue(value);

                value = createRGB(alpha, r, g, b);
                neg.setRGB(i, j, value);
            }
        }
        return neg;
    }

    public static int createRGB(int alpha, int r, int g, int b) {
        int rgb = (alpha << 24) + (r << 16) + (g << 8) + b;
        return rgb;
    }

    public static int getAlpha(int rgb) {
        return (rgb >> 24) & 0xFF;
    }

    public static int getRed(int rgb) {
        return (rgb >> 16) & 0xFF;
    }

    public static int getGreen(int rgb) {
        return (rgb >> 8) & 0xFF;
    }

    public static int getBlue(int rgb) {
        return rgb & 0xFF;
    }
}
