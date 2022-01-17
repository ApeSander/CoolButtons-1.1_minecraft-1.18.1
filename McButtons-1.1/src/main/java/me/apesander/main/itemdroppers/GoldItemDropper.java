package me.apesander.main.itemdroppers;

import me.apesander.main.code.RandomNum;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class GoldItemDropper {
    public void dropAnItem(Block block, Location l, Player player) {
        DropIntializer idrops = new DropIntializer();
        World world = block.getWorld();
        int ironid = new RandomNum().getNum(1, 9);
        switch (ironid) {
            case 1:
                world.dropItemNaturally(l, idrops.spyglass);
                break;
            case 2:
                world.dropItemNaturally(l, idrops.helmet2);
                break;
            case 3:
                player.sendMessage(ChatColor.AQUA + "Too bad!");
                break;
            case 4:
                world.dropItemNaturally(l, idrops.head);
                break;
            case 5:
                world.dropItemNaturally(l, idrops.wood);
                break;
            case 6:
                world.dropItemNaturally(l, idrops.carpet);
                break;
            case 7:
                world.dropItemNaturally(l, idrops.netherbrick);
                break;
            case 8:
                world.dropItemNaturally(l, idrops.sword);
                break;
        }
    }
}
