package com.leonard.xxtemplatexx.utils;

import com.leonard.xxtemplatexx.enums.LogTypeEnum;
import net.labymod.main.LabyMod;

public class LogHelper {
    private static final String prefix = "[TemplateAddon]";
    public void logMessage(String message, LogTypeEnum logType) {

        System.out.println(" ");
        System.out.println(logType + " " + message);
        System.out.println(" ");
    }
    public void displayMessage(String message) {
        LabyMod.getInstance().displayMessageInChat(prefix + " " + message);
    }
}
