package com.idtech.item;

import com.idtech.BaseMod;
import com.idtech.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.DefaultedRegistry;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber
public class ItemMod {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BaseMod.MODID);

    //BASIC ITEMS
    //  public static final RegistryObject<Item> STRUCTURE_GEL = ITEMS.register("",() -> ItemUtils.buildBasicItem("structuregel", CreativeModeTab.TAB_MISC));
    public static final RegistryObject<Item> GEL_ORE = ITEMS.register("gelore", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silveringot", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("rawsilver", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));


    //TOOLS
    public static final RegistryObject<Item> TELEPORT_ROD = ITEMS.register("teleportrod3d", () ->
            new TeleportRodItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    //FOOD
    public static final FoodProperties HAMBURGER_PROPS = new FoodProperties.Builder().nutrition(14).saturationMod(1f).build();
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).food(HAMBURGER_PROPS)));
    public static final FoodProperties TOMATO_PROPS = new FoodProperties.Builder().nutrition(14).saturationMod(1f).build();
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).food(TOMATO_PROPS)));
    public static final FoodProperties CHEESE_PROPS = new FoodProperties.Builder().nutrition(14).saturationMod(1f).build();
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).food(CHEESE_PROPS)));
    public static final FoodProperties CHEESEBURGER_PROPS = new FoodProperties.Builder().nutrition(14).saturationMod(1f).build();
    public static final RegistryObject<Item> CHEESEBURGER = ITEMS.register("cheeseburger", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).food(CHEESEBURGER_PROPS)));
    public static final FoodProperties SAUSAGE_PROPS = new FoodProperties.Builder().nutrition(14).saturationMod(1f).build();
    public static final RegistryObject<Item> SAUSAGE = ITEMS.register("sausage", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).food(SAUSAGE_PROPS)));
    public static final FoodProperties PATTY_PROPS = new FoodProperties.Builder().nutrition(14).saturationMod(1f).build();
    public static final RegistryObject<Item> PATTY = ITEMS.register("patty", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).food(PATTY_PROPS)));
    public static final FoodProperties HOTDOG_PROPS = new FoodProperties.Builder().nutrition(14).saturationMod(1f).build();
    public static final RegistryObject<Item> HOTDOG = ITEMS.register("hotdog", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).food(HOTDOG_PROPS)));
    public static final FoodProperties COKE_PROPS = new FoodProperties.Builder().nutrition(14).saturationMod(1f).build();
    public static final RegistryObject<Item> COKE = ITEMS.register("coke", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).food(COKE_PROPS)));
    public static final FoodProperties SPRITE_PROPS = new FoodProperties.Builder().nutrition(14).saturationMod(1f).build();
    public static final RegistryObject<Item> SPRITE = ITEMS.register("sprite", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).food(SPRITE_PROPS)));



    public static void register(IEventBus eventBus ) {


        //BASIC ITEMS
        ITEMS.register(eventBus);

        // ARMOR
    }
}







