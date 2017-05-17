package com.imagemaker.ui.listener.picture.brightness;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class BrightnessActionHelper {

    public static void changeBrightness(int increasingFactor, BufferedImage img) {

        //size of input image
        int w = img.getWidth();
        int h = img.getHeight();
        //Pixel by pixel navigation loop
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                //get the RGB component of input imge pixel
                Color color = new Color(img.getRGB(i, j));
                int r, g, b;
                //change the value of each component
                r = color.getRed() + increasingFactor;
                g = color.getGreen() + increasingFactor;
                b = color.getBlue() + increasingFactor;
                //r,g,b values which are out of the range 0 to 255 should set to 0 or 255
                if (r >= 256) {
                    r = 255;
                } else if (r < 0) {
                    r = 0;
                }

                if (g >= 256) {
                    g = 255;
                } else if (g < 0) {
                    g = 0;
                }

                if (b >= 256) {
                    b = 255;
                } else if (b < 0) {
                    b = 0;
                }

                //set output image pixel component
                img.setRGB(i, j, new Color(r, g, b).getRGB());
            }
        }
    }
}
