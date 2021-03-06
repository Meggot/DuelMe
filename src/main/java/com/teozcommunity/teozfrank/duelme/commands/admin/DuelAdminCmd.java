package com.teozcommunity.teozfrank.duelme.commands.admin;

import com.teozcommunity.teozfrank.duelme.commands.SubCmd;
import com.teozcommunity.teozfrank.duelme.main.DuelMe;
import com.teozcommunity.teozfrank.duelme.util.DuelArena;
import org.bukkit.command.CommandSender;

/**
 * Created by frank on 13/12/13.
 */
public abstract class DuelAdminCmd extends SubCmd {

    public DuelAdminCmd(DuelMe plugin, String mainPerm) {
        super(plugin, mainPerm);
    }

    public abstract void run(DuelArena duelArena,CommandSender sender, String subCmd, String[] args);
}
