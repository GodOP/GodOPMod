package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.BOTH)
@CommandParameters(description = "Create an alert", usage = "/<command> <message>")
public class Command_alert extends FreedomCommand
{

    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        String prefix = "&4&lALERT&8:";
        
        if (args.length == 0)
        {
            return false;
        }
        
        String message = prefix + StringUtils.join(args, " ");
        FUtil.bcastMsg(FUtil.colorize(message));
        
        return true;
    }
}
