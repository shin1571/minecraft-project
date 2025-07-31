package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.item.*;

public class SilverSword extends SwordItem {
    public SilverSword(Tier tier,int damage,float speed,Properties properties){
        super(tier,damage,speed,properties);
    }
    private static Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_COMBAT);
    public static Item INSTANCE =new SilverSword(Tiers.STONE,20,20,properties).setRegistryName(BaseMod.MODID,"silversword");
}
