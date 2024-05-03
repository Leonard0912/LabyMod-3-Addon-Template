package com.leonard.xxtemplatexx;

import com.leonard.xxtemplatexx.enums.LogTypeEnum;
import com.leonard.xxtemplatexx.listener.TickListener;
import com.leonard.xxtemplatexx.settings.Settings;
import com.leonard.xxtemplatexx.utils.LogHelper;
import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class Template extends LabyModAddon {

    private static Template instance;
    private static LogHelper logHelper;
    private static Settings settings;

    @Override
    public void onEnable() {
        instance = this;
        logHelper.logMessage("Template enabled", LogTypeEnum.NEUTRAL);
        this.getApi().registerForgeListener(new TickListener());
    }

    @Override
    public void loadConfig() {
        settings.loadConfig();
        logHelper.logMessage("Config loaded...", LogTypeEnum.NEUTRAL);
    }

    @Override
    protected void fillSettings(List<SettingsElement> list) {
        settings.fillSettings(list);
        logHelper.logMessage("Settings filled...", LogTypeEnum.NEUTRAL);
    }

    public static Template getInstance() {
        return instance;
    }
    public static LogHelper getLogHelper() {
        return logHelper;
    }
    public static Settings getSettings() {
        return settings;
    }
}
