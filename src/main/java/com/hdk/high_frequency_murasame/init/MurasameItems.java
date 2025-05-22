package com.hdk.high_frequency_murasame.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.hdk.high_frequency_murasame.item.*;
public class MurasameItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "high_frequency_murasame");



    public static final RegistryObject<Item> hf_murasama =
            ITEMS.register("hf_murasama",
            () -> new hf_murasama(
                    Tiers.NETHERITE,
                    7,
                    -3.1F,
                    new Item.Properties()
            )
    );


}
