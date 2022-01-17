package me.apesander.main.code;

import me.apesander.main.itemdroppers.*;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.type.Switch;
import org.bukkit.entity.Player;

public class BlockGetter {
    public void getBlockBelow(Block block, Location location, Player player) {
        final Switch button = (Switch) block.getBlockData();
        BlockFace face = button.getFacing();
        switch (button.getFace()) {
            case FLOOR:
                face = BlockFace.UP;
                break;
            case CEILING:
                face = BlockFace.DOWN;
                break;
        }
        final Block behind = block.getRelative(face.getOppositeFace());
        Material m = behind.getType();
        Location l = behind.getLocation();
        if (m == Material.IRON_BLOCK || m == Material.GOLD_BLOCK || m == Material.EMERALD_BLOCK ||
                m == Material.DIAMOND_BLOCK || m == Material.NETHERITE_BLOCK ) {
            switch (behind.getType()) {
                case IRON_BLOCK:
                    new IronItemDropper().dropAnItem(block, l, player);
                    break;
                case GOLD_BLOCK:
                    new GoldItemDropper().dropAnItem(block, l, player);
                    break;
                case EMERALD_BLOCK:
                    new EmeraldItemDropper().dropAnItem(block, l, player);
                    break;
                case DIAMOND_BLOCK:
                case NETHERITE_BLOCK:
                    new DiamondAndNetheriteItemDropper().dropAnItem(block, l, player);
                    break;

            }

        } else {
            new BadItemDropper().dropAnItem(block, l, player);
        }
    }
}
