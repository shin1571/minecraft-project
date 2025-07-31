package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

import javax.annotation.Nullable;

public class CustomArmorItem extends ArmorItem {
    private static Properties properties = new Properties().tab(CreativeModeTab.TAB_MISC);
    private static ArmorMaterial customMaterial = ArmorMaterials.IRON;
    public static final Item CUSTOMHELM= new CustomArmorItem(customMaterial,EquipmentSlot.HEAD,properties).setRegistryName(BaseMod.MODID,"customhelm");

    public CustomArmorItem(ArmorMaterial customMaterial, EquipmentSlot slot, Properties properties) {
        super(customMaterial, slot, properties);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if(slot == EquipmentSlot.LEGS){
            return "examplemod:textures/models/armor/custom_armor_layer_2.png";
        }else{
            return "examplemod:textures/models/armor/custom_armor_layer_1.png";
        }
    }
}