package com.imagemaker.ui.listener.picture.gray;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GrayActionHelper {

    public static void createGrayImage(BufferedImage image)throws IOException
    {

        int w=0,h=0,width,height;
        width=image.getWidth();
        height=image.getHeight();
        for(w = 0; w <width ; w++)
        {
            for(h = 0 ; h <height ; h++)
            {
                // BufferedImage.getRGB() saves the colour of the pixel as a single integer.
                // use Color(int) to grab the RGB values individually.
                Color color = new Color(image.getRGB(w, h));
                // get the luminosity value as an integer
                int luminosity = (int) (0.2126 * color.getRed() + 0.7152 * color.getGreen() + 0.0722 * color.getBlue());
                // create a new Color object using the luminosity colour as the red, green and blue
                // colour values
                Color lum = new Color(luminosity, luminosity, luminosity);

                // set the pixel at that position to the new Color object using Color.getRGB().
                image.setRGB(w, h, lum.getRGB());
            }
        }

    }
}
