package com.ne0nx3r0.rih.property.properties;

import com.ne0nx3r0.rih.property.RareItemProperty;
import com.ne0nx3r0.rih.property.PropertyCostType;
import com.ne0nx3r0.rih.property.PropertyType;
import com.ne0nx3r0.util.ParticleEffect;
import org.bukkit.entity.Player;

public class HeartFX extends RareItemProperty
{
    public HeartFX()
    {
        super(
            PropertyType.HEARTS_FX.ordinal(),
            "Hearts FX",
            "While worn as armor or a helmet shows a visual hearts effect around you",
            PropertyCostType.AUTOMATIC,
            3,
            1
        );
    }

    @Override
    public void applyEffectToPlayer(Player player, int level)
    {	
        ParticleEffect.HEART.display(
            player.getLocation().add(0,1.5,0), //center
            0.4F, //offsetX
            0.75F, //offsetY
            0.4F, //offsetZ
            0.1F, //speed
            8 // amount of particles
        );
    }
}
