package com.imagemaker.ui.listener;

import com.imagemaker.ui.component.forms.AboutFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AboutActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        AboutFrame about = new AboutFrame();
        about.setVisible(true);
    }
}
