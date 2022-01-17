package me.apesander.main.itemdroppers;

import me.apesander.main.code.RandomNum;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class BadItemDropper {
    public void dropAnItem(Block block, Location l, Player player) {
        DropIntializer idrops = new DropIntializer();
        World world = block.getWorld();
        int ironid = new RandomNum().getNum(1, 11);
        switch (ironid) {
            case 1:
                world.dropItemNaturally(l, idrops.dirt);
                break;
            case 2:
                world.dropItemNaturally(l, idrops.planks);
                break;
            case 3:
            case 8:
            case 7:
            case 6:
                player.sendMessage(ChatColor.AQUA + "Too bad!");
                break;
            case 4:
                world.dropItemNaturally(l, idrops.diorite);
                break;
            case 5:
                world.dropItemNaturally(l, idrops.sand);
                break;
            case 9:
                world.dropItemNaturally(l, idrops.rottenflesh);
                break;
            case 10:
                world.dropItemNaturally(l, idrops.poppy);
                break;
        }
    }
}
