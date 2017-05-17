package com.imagemaker.ui.component.forms;

public class ImageMakerMainFrameHandler {

    private static ImageMakerMainFrame instance;

    public static ImageMakerMainFrame getInstance() {
        if (instance == null) {
            instance = new ImageMakerMainFrame();
        }
        return instance;
    }
}
