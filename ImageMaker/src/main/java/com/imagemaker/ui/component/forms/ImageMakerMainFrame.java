package com.imagemaker.ui.component.forms;

import com.imagemaker.ui.component.menu.ImageMakerMenu;
import com.imagemaker.ui.component.toolbar.ImageMakerToolBar;
import com.imagemaker.ui.utils.BuildInformation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class ImageMakerMainFrame extends JFrame{

    ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("img/logo.jpg"));

    static ImagePanel imagePanel;

    public ImageMakerMainFrame() throws HeadlessException {
        super();
        buildComponent();
    }

    private void buildComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(BuildInformation.getWindowFixTitle());
        setIconImage(logo.getImage());
        setSize(new Dimension(900, 500));
        setResizable(false);
        setLocation(200, 100);

        ImageMakerMenu menu = new ImageMakerMenu();
        setJMenuBar(menu);

        ImageMakerToolBar toolBar = new ImageMakerToolBar();
        getContentPane().add(toolBar, BorderLayout.NORTH);
    }

    public void openImage(File file)
    {
        JInternalFrame imageFrame = new JInternalFrame(file.getName(), true, true);
        imagePanel = new ImagePanel(file);
        imageFrame.getContentPane().add(imagePanel);
        imageFrame.setVisible(true);
        imageFrame.pack();
        this.add(imageFrame);
    }

    public static BufferedImage getImage() {
        if (imagePanel != null) {
            return imagePanel.getImage();
        }
        return null;
    }
}
