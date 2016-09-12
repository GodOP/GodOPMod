package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.TotalFreedomMod;
import me.totalfreedom.totalfreedommod.config.ConfigEntry;
import me.totalfreedom.totalfreedommod.config.MainConfig;
import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FLog;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/*
 * See https://github.com/TotalFreedom/License - This file may not be edited or removed.
 */
@CommandPermissions(level = Rank.OP, source = SourceType.BOTH)
@CommandParameters(description = "Information about the GodOPMod", usage = "/<command>", aliases = "gopmod, gom, gopm")
public class Command_godopmod extends FreedomCommand
{

    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&m--&b&m]&7&m---&r &cGodOP &7&m---&b&m[&8&m--"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7This mod was made by the following developer(s)&8:"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&eXGreenPlayz12&7, &eheroguy42"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5GOPM &7was forked with &5TFM"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6www.godop.me"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6http://godop.boards.net/"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6play.godop.me"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&m--&b&m]&7&m---&r &cGodOP &7&m---&b&m[&8&m--"));    

        return true;
    }
}
