package com.imagemaker.ui.component.toolbar;


import com.imagemaker.ui.listener.ExitActionListener;
import com.imagemaker.ui.listener.OpenFileActionListener;
import com.imagemaker.ui.listener.SaveFileActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class ImageMakerToolBar extends JToolBar {

    ImageIcon iconOpen = new ImageIcon(ClassLoader.getSystemResource("img/icon/open.png"));
    ImageIcon iconSave = new ImageIcon(ClassLoader.getSystemResource("img/icon/save.png"));
    ImageIcon iconExit = new ImageIcon(ClassLoader.getSystemResource("img/icon/cancel.png"));

    public ImageMakerToolBar() {
        super("ToolBar",HORIZONTAL);

        JButton openButton=new JButton(iconOpen);
        openButton.setToolTipText("Open");
        openButton.addActionListener(new OpenFileActionListener());

        JButton saveButton=new JButton(iconSave);
        saveButton.setToolTipText("Save");
        saveButton.addActionListener(new SaveFileActionListener());

        JButton exitButton=new JButton(iconExit);
        exitButton.setToolTipText("Exit");
        exitButton.addActionListener(new ExitActionListener());


        add(openButton);
        add(saveButton);
        add(exitButton);

    }
}
