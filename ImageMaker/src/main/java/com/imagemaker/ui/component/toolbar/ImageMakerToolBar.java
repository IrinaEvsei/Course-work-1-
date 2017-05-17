package com.imagemaker.ui.component.toolbar;

import com.imagemaker.ui.listener.ExitActionListener;
import com.imagemaker.ui.listener.OpenFileActionListener;
import com.imagemaker.ui.listener.SaveFileActionListener;
import com.imagemaker.ui.listener.picture.blur.BlurActionListener;
import com.imagemaker.ui.listener.picture.brightness.BrightnessActionListener;
import com.imagemaker.ui.listener.picture.gray.GrayActionListener;
import com.imagemaker.ui.listener.picture.negative.NegativeActionListener;
import com.imagemaker.ui.listener.picture.reset.ResetActionListener;
import com.imagemaker.ui.listener.picture.rotate.RotateActionListener;
import com.imagemaker.ui.listener.picture.sharpening.SharpeningActionListener;
import com.imagemaker.ui.listener.picture.zoomIn.ZoomInActionListener;
import com.imagemaker.ui.listener.picture.zoomOut.ZoomOutActionListener;

import javax.swing.*;

public class ImageMakerToolBar extends JToolBar {

    ImageIcon iconOpen = new ImageIcon(ClassLoader.getSystemResource("img/icon/open.png"));
    ImageIcon iconSave = new ImageIcon(ClassLoader.getSystemResource("img/icon/save.png"));
    ImageIcon iconZoomIn = new ImageIcon(ClassLoader.getSystemResource("img/icon/zoomIn.png"));
    ImageIcon iconZoomOut = new ImageIcon(ClassLoader.getSystemResource("img/icon/zoomOut.png"));
    ImageIcon iconRotate = new ImageIcon(ClassLoader.getSystemResource("img/icon/rotate.png"));
    ImageIcon iconBrightness = new ImageIcon(ClassLoader.getSystemResource("img/icon/brightness.png"));
    ImageIcon iconNegative = new ImageIcon(ClassLoader.getSystemResource("img/icon/negative.png"));
    ImageIcon iconGrayscale = new ImageIcon(ClassLoader.getSystemResource("img/icon/grayscale.png"));
    ImageIcon iconSharpening = new ImageIcon(ClassLoader.getSystemResource("img/icon/sharpening.png"));
    ImageIcon iconBlur = new ImageIcon(ClassLoader.getSystemResource("img/icon/blur.png"));
    ImageIcon iconReset = new ImageIcon(ClassLoader.getSystemResource("img/icon/reset.png"));
    ImageIcon iconExit = new ImageIcon(ClassLoader.getSystemResource("img/icon/cancel.png"));

    public ImageMakerToolBar() {
        super("ToolBar",HORIZONTAL);

        JButton openButton = new JButton(iconOpen);
        openButton.setToolTipText("Open");
        openButton.addActionListener(new OpenFileActionListener());

        JButton saveButton = new JButton(iconSave);
        saveButton.setToolTipText("Save");
        saveButton.addActionListener(new SaveFileActionListener());

        JButton zoomInButton = new JButton(iconZoomIn);
        zoomInButton.setToolTipText("Zoom In");
        zoomInButton.addActionListener(new ZoomInActionListener());

        JButton zoomOutButton = new JButton(iconZoomOut);
        zoomOutButton.setToolTipText("Zoom Out");
        zoomOutButton.addActionListener(new ZoomOutActionListener());

        JButton rotateButton = new JButton(iconRotate);
        rotateButton.setToolTipText("Rotate");
        rotateButton.addActionListener(new RotateActionListener());

        JButton brightnessButton = new JButton(iconBrightness);
        brightnessButton.setToolTipText("Brightness");
        brightnessButton.addActionListener(new BrightnessActionListener());

        JButton negativeButton = new JButton(iconNegative);
        negativeButton.setToolTipText("Negative");
        negativeButton.addActionListener(new NegativeActionListener());

        JButton grayscaleButton = new JButton(iconGrayscale);
        grayscaleButton.setToolTipText("Grayscale");
        grayscaleButton.addActionListener(new GrayActionListener());

        JButton sharpeningButton = new JButton(iconSharpening);
        sharpeningButton.setToolTipText("Sharpening");
        sharpeningButton.addActionListener(new SharpeningActionListener());

        JButton blurButton = new JButton(iconBlur);
        blurButton.setToolTipText("Blur");
        blurButton.addActionListener(new BlurActionListener());

        JButton resetButton = new JButton(iconReset);
        resetButton.setToolTipText("Reset");
        resetButton.addActionListener(new ResetActionListener());

        JButton exitButton = new JButton(iconExit);
        exitButton.setToolTipText("Exit");
        exitButton.addActionListener(new ExitActionListener());

        add(openButton);
        add(saveButton);
        addSeparator();
        add(zoomInButton);
        add(zoomOutButton);
        add(rotateButton);
        addSeparator();
        add(brightnessButton);
        add(negativeButton);
        add(grayscaleButton);
        add(sharpeningButton);
        add(blurButton);
        addSeparator();
        add(resetButton);
        addSeparator();
        add(exitButton);
    }
}
