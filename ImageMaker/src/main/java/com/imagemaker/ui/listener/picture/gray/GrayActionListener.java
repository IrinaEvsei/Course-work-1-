package com.imagemaker.ui.listener.picture.gray;

import com.imagemaker.ui.component.forms.ImageMakerMainFrameHandler;
import com.imagemaker.ui.component.forms.ImagePanel;
import com.imagemaker.ui.utils.MessageDialogUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GrayActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            GrayActionHelper.createGrayImage(ImagePanel.getImage());
        } catch (Exception ex) {
            MessageDialogUtils.showErrorMessage(ImageMakerMainFrameHandler.getInstance().getRootPane(), "Произошла ошибка");
            ImagePanel.resetImage();
        }
    }
}


