package com.leonard.xxtemplatexx.settings;

import com.google.gson.JsonObject;
import com.leonard.xxtemplatexx.Template;
import net.labymod.settings.elements.BooleanElement;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.HeaderElement;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class Settings {
    private boolean enabled;

    public void loadConfig() {
        // Load config
        this.enabled = this.getConfig().has("enabled") && this.getConfig().get("enabled").getAsBoolean();
    }
    public void fillSettings(List<SettingsElement> settings) {
        // Fill settings
        settings.add(new HeaderElement("Template"));
        BooleanElement enabledElement = new BooleanElement("Aktiviert?", new ControlElement.IconData("labymod/textures/buttons/accept.png"), (value) -> {
            this.enabled = value;
            this.getConfig().addProperty("enabled", value);
            this.saveConfig();
        }, this.enabled);
        settings.add(enabledElement);
        settings.add(new HeaderElement(" "));
    }
    public void saveConfig() {
        Template.getInstance().saveConfig();
    }
    public JsonObject getConfig() {
        return Template.getInstance().getConfig();
    }
    public boolean getEnabled() {
        return this.enabled;
    }
}

