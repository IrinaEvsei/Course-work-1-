package com.imagemaker.ui.component.menu;

import com.imagemaker.ui.listener.AboutActionListener;
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

import javax.swing.*;

public class ImageMakerMenu extends JMenuBar {

    ImageIcon iconOpen = new ImageIcon(ClassLoader.getSystemResource("img/icon/open.png"));
    ImageIcon iconSave = new ImageIcon(ClassLoader.getSystemResource("img/icon/save.png"));
    ImageIcon iconExit = new ImageIcon(ClassLoader.getSystemResource("img/icon/cancel.png"));


    public ImageMakerMenu() {
        JMenu fileMenu = fileMenu();
        JMenu pictureMenu = pictureMenu();
        JMenu view = viewMenu();
        JMenu help = helpMenu();

        add(fileMenu);
        add(pictureMenu);
        add(view);
        add(help);
    }

    private JMenu fileMenu() {
        JMenu fileMenu = new JMenu("File");

        JMenuItem open = new JMenuItem("Open", iconOpen);
        open.addActionListener(new OpenFileActionListener());

        JMenuItem save = new JMenuItem("Save", iconSave);
        save.addActionListener(new SaveFileActionListener());

        JMenuItem exit = new JMenuItem("Exit", iconExit);
        exit.addActionListener(new ExitActionListener());


        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        return fileMenu;
    }

    private JMenu pictureMenu() {
        JMenu picture = new JMenu("Picture");
        JMenu effects = new JMenu("Effects");

        JMenuItem reset = new JMenuItem("Reset Image");
        reset.addActionListener(new ResetActionListener());

        JMenuItem grayScale = new JMenuItem("Grayscale");
        grayScale.addActionListener(new GrayActionListener());

        JMenuItem negative = new JMenuItem("Negative");
        negative.addActionListener(new NegativeActionListener());

        JMenuItem brightness = new JMenuItem("Brightness");
        brightness.addActionListener(new BrightnessActionListener());

        JMenuItem sharpen = new JMenuItem("Sharpening");
        sharpen.addActionListener(new SharpeningActionListener());

        JMenuItem rotation = new JMenuItem("Rotation");
        rotation.addActionListener(new RotateActionListener());


        JMenuItem blur = new JMenuItem("Blur");
        blur.addActionListener(new BlurActionListener());


        effects.add(grayScale);
        effects.add(negative);
        effects.add(sharpen);
        effects.add(blur);
        effects.add(rotation);
        effects.add(brightness);


        picture.add(effects);
        picture.add(reset);
        return picture;
    }

    private JMenu viewMenu() {
        JMenu view = new JMenu("View");

        JMenuItem zoomIn = new JMenuItem("Zoom In");
        //zoomIn.addActionListener(new ZoomInActionListener();

        JMenuItem zoomOut = new JMenuItem("Zoom Out");
        //zoomOut.addActionListener(new ZoomOutActionListener();

        view.add(zoomIn);
        view.add(zoomOut);

        return view;
    }

    private JMenu helpMenu() {
        JMenu help = new JMenu("Help");

        JMenuItem about = new JMenuItem("About us");
        about.addActionListener(new AboutActionListener());

        help.add(about);

        return help;
    }
}
