package com.imagemaker.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(1);
    }
}
