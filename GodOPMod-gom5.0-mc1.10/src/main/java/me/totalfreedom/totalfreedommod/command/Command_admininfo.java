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
@CommandParameters(description = "Information on how to apply", usage = "/<command>", aliases = "ai, apply")
public class Command_admininfo extends FreedomCommand
{

    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&m--&b&m]&7&m---&r &cGodOP &7&m---&b&m[&8&m--"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7SO you want to become an administrator?"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Well applications are currently&8: &a&lOPENED"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Make sure you meet the requirements!"));
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6http://godop.boards.net/"));
 

        return true;
    }
}
