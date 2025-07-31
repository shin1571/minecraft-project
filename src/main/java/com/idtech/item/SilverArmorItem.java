package com.idtech.item;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

import javax.annotation.Nullable;

public class SilverArmorItem extends ArmorItem {
    public SilverArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);

    }

    private static Properties properties = new Properties().tab(CreativeModeTab.TAB_COMBAT);
    public static final Item HELM = new SilverArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, properties).setRegistryName("silverhelm");
    public static final Item CHEST = new SilverArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, properties).setRegistryName("silverchest");
    public static final Item LEGS = new SilverArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, properties).setRegistryName("silverlegs");
    public static final Item BOOTS = new SilverArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, properties).setRegistryName("silverboots");


    @Nullable @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot,String type) {
        if (slot == EquipmentSlot.LEGS){
            return "examplemod:textures/models/armor/silver_armor_layer_2.png";
        }
        return "examplemod:textures/models/armor/silver_armor_layer_1.png";
    }
}