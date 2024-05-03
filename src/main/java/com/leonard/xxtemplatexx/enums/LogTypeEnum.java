package com.leonard.xxtemplatexx.enums;

public enum LogTypeEnum {
    NEUTRAL("[TemplateAddon]"),
    DISCORD("[TemplateAddon-Discord]"),
    MINECRAFT("[TemplateAddon-Minecraft]"),
    ERROR("[TemplateAddon-Error"),
    FILEMANAGER("[TemplateAddon-FileManager]");

    private String prefix;

    LogTypeEnum(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }
}
