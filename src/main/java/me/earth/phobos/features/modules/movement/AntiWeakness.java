package me.earth.phobos.features.modules.movement;

import me.earth.phobos.features.modules.Module;
import net.minecraft.potion.Potion;

import java.util.Objects;

public class AntiWeakness
        extends Module {
    public AntiWeakness() {
        super("AntiWeakness", "Only Client side lol", Module.Category.MOVEMENT, false, false, false);
    }

    @Override
    public void onUpdate() {
        if (AntiLevitate.mc.player.isPotionActive(Objects.requireNonNull(Potion.getPotionFromResourceLocation("weakness")))) {
            AntiLevitate.mc.player.removeActivePotionEffect(Potion.getPotionFromResourceLocation("weakness"));
        }
    }
}

