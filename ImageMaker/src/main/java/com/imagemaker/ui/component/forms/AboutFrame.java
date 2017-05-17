package com.imagemaker.ui.component.forms;

import java.awt.*;
import javax.swing.*;

public class AboutFrame extends JFrame {
    private static final String ABOUT_TITLE = "About";
    ImageIcon iconOpen = new ImageIcon(ClassLoader.getSystemResource("img/logo.jpg"));

    public AboutFrame() throws HeadlessException {
        super(ABOUT_TITLE);
        buildComponent();
    }

    private void buildComponent() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("<html>ImageMaker was written by <b>Irina Evsei</b>." +
                "<br><br>ImageMaker uses <ul>" +
                "<li>the Swing library" +
                "<li>the Apache Maven framework");


        ImageIcon logo = new ImageIcon(iconOpen.getImage().getScaledInstance(150, 150, 1));

        JLabel jLabel = new JLabel("", logo, JLabel.LEFT);

        panel.add(jLabel);
        panel.add(label);

        add(panel);
        setSize(300, 320);
        setLocation(500, 200);
    }
}