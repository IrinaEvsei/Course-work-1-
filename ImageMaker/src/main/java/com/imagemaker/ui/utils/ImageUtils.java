package com.imagemaker.ui.utils;


import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class ImageUtils {

    public static BufferedImage scaleImage(BufferedImage image, double panelWidth){
        if (image == null){
            return null;
        }
        double widthScale = calculateImageScale(image.getWidth(), panelWidth);

        int scaledWidth = (int) (image.getWidth() * widthScale);
        int scaledHeight = (int) (image.getHeight() * widthScale);

        BufferedImage newImage = scaledImage(image, scaledWidth, scaledHeight);

        return newImage;
    }

    private static double calculateImageScale(double imageWidth, double frameWidth){
        if(imageWidth < frameWidth){
            return 1;
        }else{
            return frameWidth/imageWidth;
        }
    }

    private static BufferedImage scaledImage(BufferedImage image, int scaledWidth, int scaledHeight) {
        Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

        BufferedImage newImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_RGB);
        newImage.createGraphics().drawImage(scaledImage, 0, 0, Color.WHITE, null);

        return newImage;
    }
}
