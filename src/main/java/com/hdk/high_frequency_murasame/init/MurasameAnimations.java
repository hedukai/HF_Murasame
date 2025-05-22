package com.hdk.high_frequency_murasame.init;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import yesman.epicfight.api.animation.types.StaticAnimation;
import yesman.epicfight.api.forgeevent.AnimationRegistryEvent;
import yesman.epicfight.gameasset.Armatures;
import yesman.epicfight.model.armature.HumanoidArmature;

public class MurasameAnimations {
    public static StaticAnimation WATERFOWL_DANCING_WILDLY;


    @SubscribeEvent
    public static void registerAnimations(AnimationRegistryEvent event) {
        event.getRegistryMap().put("hdk_mod", MurasameAnimations::build);
    }
    //动画写下面
    private static void build() {
        HumanoidArmature biped = Armatures.BIPED;



    }


}
