package com.imagemaker;

import com.imagemaker.ui.component.forms.ImagePanel;

import javax.swing.*;

public class ImageZoom extends JFrame{
    private JFrame frame;
    private ImagePanel imagePanel;
    private Double zoom = new Double(0.4);
    SpinnerModel num = new SpinnerNumberModel(0.8, 0.1, 1.6, 0.02);
    public ImageZoom() {
        super("JSpinner");
        JSpinner spinDouble = new JSpinner(num);
        JPanel contents = new JPanel();
        contents.add(spinDouble);
        setContentPane(contents);
        setSize(500, 90);
        setVisible(true);
    }
}
