package me.apesander.main.code;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ButtonPressEvent implements Listener {
    @EventHandler
    public void onButtonPress(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        Action action = event.getAction();
        Location location = block.getLocation();

        //checks if player clicked the right mousebutton.
        if (action == Action.RIGHT_CLICK_BLOCK) {
            if (!block.isBlockIndirectlyPowered() && !player.isSneaking()) {
                if (block.getType().equals(Material.STONE_BUTTON) || block.getType().equals(Material.POLISHED_BLACKSTONE_BUTTON) ||
                        block.getType().equals(Material.OAK_BUTTON) || block.getType().equals(Material.SPRUCE_BUTTON) ||
                        block.getType().equals(Material.BIRCH_BUTTON) || block.getType().equals(Material.JUNGLE_BUTTON) ||
                        block.getType().equals(Material.ACACIA_BUTTON) || block.getType().equals(Material.DARK_OAK_BUTTON) ||
                        block.getType().equals(Material.CRIMSON_BUTTON) || block.getType().equals(Material.WARPED_BUTTON)) {
                    new BlockGetter().getBlockBelow(block, location, player);
                }
            } else if (player.isSneaking()){
                player.sendMessage(ChatColor.AQUA + "Don't be sneaky!");
            }
        }
    }
}