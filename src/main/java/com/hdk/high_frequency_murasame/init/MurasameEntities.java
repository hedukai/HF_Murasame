package com.hdk.high_frequency_murasame.init;

import com.hdk.high_frequency_murasame.HighFrequencyMurasame;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class MurasameEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "high_frequency_murasame");
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }




}
