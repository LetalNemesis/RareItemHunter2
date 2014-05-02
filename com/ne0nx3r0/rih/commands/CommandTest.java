package com.ne0nx3r0.rih.commands;

import com.ne0nx3r0.rih.RareItemHunterPlugin;
import com.ne0nx3r0.rih.entities.BossEntityChicken;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_7_R3.CraftWorld;
import org.bukkit.entity.Player;

class CommandTest extends RareItemHunterCommand{

    public CommandTest(RareItemHunterPlugin plugin) {
        super("t","","Testing command","rih.tester");
    }
    
    @Override
    boolean execute(CommandSender cs, String[] args) {
        if(cs instanceof Player){
            Player player = (Player) cs;
            
            this.spawnCustomEntity(player.getLocation());
        }
        
        return true;
    }
    public void spawnCustomEntity(Location loc){
        net.minecraft.server.v1_7_R3.World nmsWorld = ((CraftWorld) loc.getWorld()).getHandle();
        
        BossEntityChicken customZombie = new BossEntityChicken(nmsWorld);
        
        customZombie.setPosition(loc.getX(), loc.getY(), loc.getZ());
        
        nmsWorld.addEntity(customZombie);
    }
}
