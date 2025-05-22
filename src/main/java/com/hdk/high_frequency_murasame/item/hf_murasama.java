package com.hdk.high_frequency_murasame.item;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.*;
import com.hdk.high_frequency_murasame.client.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class hf_murasama extends SwordItem{
    public hf_murasama(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }
    // 无限耐久：物品不会被消耗
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false; // 禁止耐久损耗
    }
    @Override
    public boolean isEnchantable(@NotNull ItemStack stack) {
        return true;
    }
    // 控制可接受的附魔类型
    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return enchantment.category == EnchantmentCategory.WEAPON;
    }
    // 设置附魔强度（影响附魔等级）
    @Override
    public int getEnchantmentValue() {
        return 10; // 原版钻石剑为 10
    }


}