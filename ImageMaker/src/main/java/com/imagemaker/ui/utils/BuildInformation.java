package com.imagemaker.ui.utils;


public class BuildInformation {

    public static final String VERSION_NUMBER = "0.1";
    private static String fixTitle = "Image Maker ";

    public static String getWindowFixTitle() {
        return fixTitle + BuildInformation.VERSION_NUMBER;
    }
}
