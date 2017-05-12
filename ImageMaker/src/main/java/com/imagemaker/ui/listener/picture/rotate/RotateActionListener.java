package com.imagemaker.ui.listener.picture.rotate;

import com.imagemaker.ui.component.forms.ImageMakerMainFrameHandler;
import com.imagemaker.ui.component.forms.ImagePanel;
import com.imagemaker.ui.utils.MessageDialogUtils;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class RotateActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 360,0);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(10);
        slider.setValue(0);
        ImageMakerMainFrameHandler.getInstance().add(slider, BorderLayout.SOUTH);
        ImageMakerMainFrameHandler.getInstance().setVisible(true);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                try
                {
                    ImagePanel.setImage(RotateActionHelper.rotate(ImagePanel.getCopyImage(), slider.getValue()));

                }
                catch(Exception ei)
                {
                    MessageDialogUtils.showErrorMessage(ImageMakerMainFrameHandler.getInstance().getRootPane(), "Произошла ошибка");
                    ImagePanel.resetImage();
                }
            }
        });

    }
}


