package com.imagemaker.ui.utils;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class MessageDialogUtils {

    public static void showErrorMessage(JComponent component, String message){
        JOptionPane.showMessageDialog(component, message);
    }
}
