package net.acticraft.actikitpvp.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RSDisable implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.setResourcePack("https://www.dropbox.com/s/qkjyttsac7394vy/sssa.zip?dl=1");


        return true;
    }
}
