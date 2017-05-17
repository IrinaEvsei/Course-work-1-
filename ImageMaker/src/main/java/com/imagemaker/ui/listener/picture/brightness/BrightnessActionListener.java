package com.imagemaker.ui.listener.picture.brightness;

import com.imagemaker.ui.component.forms.ImageMakerMainFrameHandler;
import com.imagemaker.ui.component.forms.ImagePanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSlider;

public class BrightnessActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50,25);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        ImageMakerMainFrameHandler.getInstance().add(slider, BorderLayout.SOUTH);
        ImageMakerMainFrameHandler.getInstance().setVisible(true);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {

                BrightnessActionHelper.changeBrightness((slider.getValue()) / 10, ImagePanel.getImage());
            }
        });
    }
}


