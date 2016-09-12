package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.BOTH)
@CommandParameters(description = "Clears the server chat", usage = "/<command>", aliases = "cc")
public class Command_clearchat extends FreedomCommand
{

    @Override
    protected boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        for (int i = 0; i <= 98; i++) {
        FUtil.bcastMsg("");
        }
        FUtil.bcastMsg(ChatColor.RED + "[Staff] " + ChatColor.BLUE + sender.getName() + ChatColor.GRAY + " cleared " + ChatColor.GREEN + "[GLOBAL] " + ChatColor.GRAY + "chat.");
        return true;
    }
    
}