package com.imagemaker.ui.component.forms;

import com.imagemaker.ui.utils.MessageDialogUtils;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImagePanel extends Component {
    static BufferedImage image;
    static BufferedImage copyImage;

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        repaint();
    }

    public ImagePanel(File img) {
        try {
            image = ImageIO.read(img);
            copyImage = image;
        } catch (Exception ex) {
            MessageDialogUtils.showErrorMessage(ImageMakerMainFrameHandler.getInstance().getRootPane(), "Произошла ошибка при открытии файла");
        }

    }

    public static BufferedImage getImage() {
        return image;
    }



    public static void setImage(BufferedImage img) {
        ImagePanel.image = img;
    }

    public static BufferedImage getCopyImage() {
        return copyImage;
    }

    public static void setCopyImage(BufferedImage copyImage) {
        ImagePanel.copyImage = copyImage;
    }

    public static void resetImage(){
        image = copyImage;
    }


}

