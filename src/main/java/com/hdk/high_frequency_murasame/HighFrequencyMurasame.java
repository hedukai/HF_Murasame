package com.hdk.high_frequency_murasame;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.hdk.high_frequency_murasame.init.*;





@SuppressWarnings("removal")
@Mod(HighFrequencyMurasame.MOD_ID)
public class HighFrequencyMurasame
{
    public static final String MOD_ID = "high_frequency_murasame";
    public HighFrequencyMurasame() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MurasameEffects.EFFECTS.register(bus);      //buff
        MinecraftForge.EVENT_BUS.register(this);    //事件
        MurasameEntities.register(bus);      //实体
        bus.addListener(MurasameAnimations::registerAnimations);    //动画
        MurasameItems.ITEMS.register(bus);   //物品注册表

    }
}
