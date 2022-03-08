package net.acticraft.actikitpvp;

import net.acticraft.actikitpvp.Commands.RSDisable;
import org.bukkit.plugin.java.JavaPlugin;

public final class ActiKitPVP extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("rsd").setExecutor(new RSDisable());

    }

    @Override
    public void onDisable() {

    }
}
