package org.example;

import io.github.eikefs.minecraft.lib.api.mapper.ConfigMapper;
import me.bristermitten.pdm.PluginDependencyManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginDependencyManager.of(this).loadAllDependencies().whenComplete(($, throwable) -> {
            // Code deps stuff here

            ConfigMapper.map(getDataFolder(), "org.example");
        });
    }

}
