package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.world.item.*;

public class SilverShovel extends ShovelItem  {
    public SilverShovel(Tier tier, int damage, float speed, Properties properties){
    super(tier,damage,speed,properties);
}
    private static Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_TOOLS);
    public static Item INSTANCE =new SilverShovel(Tiers.STONE,20,20,properties).setRegistryName(BaseMod.MODID,"silvershovel");

}