package com.imagemaker.ui.component.forms;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutFrame extends JFrame {
    private static final String ABOUT_TITLE = "About";

    public AboutFrame() throws HeadlessException {
        super(ABOUT_TITLE);
        buildComponent();
    }

    private void buildComponent() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Developed by Irina Evsei");
        panel.add(label);
        add(panel);
        setSize(300, 300);
        setLocation(400, 200);
    }
}
