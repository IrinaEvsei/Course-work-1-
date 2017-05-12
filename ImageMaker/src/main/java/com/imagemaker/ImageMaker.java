package com.imagemaker;

import com.imagemaker.ui.component.forms.ImageMakerMainFrame;
import com.imagemaker.ui.component.forms.ImageMakerMainFrameHandler;

public class ImageMaker {

    public static void main(String[] args){
        ImageMakerMainFrame frame = ImageMakerMainFrameHandler.getInstance();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
