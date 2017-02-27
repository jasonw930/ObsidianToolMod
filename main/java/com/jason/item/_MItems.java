package com.jason.item;

import com.jason.creativetabs._MCreativeTabs;
import com.jason.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class _MItems {
	
	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial MaterialObsidian = EnumHelper.addToolMaterial("MaterialObsidian", 3, 2000, 14.0f, 4.5f, 10);
	
	//items
	public static Item ItemObsidianStick;
	public static Item ItemDimBlazeRod;
	public static Item ItemObsiditeIngot;
	public static Item ItemRawObsidianOre;
	public static Item ItemObsidianOre;
	public static Item ItemToolCore;
	//tools
	public static Item ToolObsidianSword;
	public static Item ToolObsidianPickaxe;
	public static Item ToolObsidianAxe;
	public static Item ToolObsidianSpade;
	public static Item ToolObsidianHoe;
	
	public static void initializeItem(){
		//items
		ItemObsidianStick = new Item().setUnlocalizedName("ItemObsidianStick").setCreativeTab(_MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":ItemObsidianStick");
		ItemDimBlazeRod = new Item().setUnlocalizedName("ItemDimBlazeRod").setCreativeTab(_MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":ItemDimBlazeRod");
		ItemObsiditeIngot = new Item().setUnlocalizedName("ItemObsiditeIngot").setCreativeTab(_MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":ItemObsiditeIngot");
		ItemRawObsidianOre = new Item().setUnlocalizedName("ItemRawObsidianOre").setCreativeTab(_MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":ItemRawObsidianOre");
		ItemObsidianOre = new Item().setUnlocalizedName("ItemObsidianOre").setCreativeTab(_MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":ItemObsidianOre");
		ItemToolCore = new Item().setUnlocalizedName("ItemToolCore").setCreativeTab(_MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":ItemToolCore");
		//tools
		ToolObsidianSword = new ToolObsidianSword(MaterialObsidian).setUnlocalizedName("ToolObsidianSword").setCreativeTab(_MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":ToolObsidianSword");;
		ToolObsidianPickaxe = new ToolObsidianPickaxe(MaterialObsidian).setUnlocalizedName("ToolObsidianPickaxe").setCreativeTab(_MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":ToolObsidianPickaxe");
		ToolObsidianAxe = new ToolObsidianAxe(MaterialObsidian).setUnlocalizedName("ToolObsidianAxe").setCreativeTab(_MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":ToolObsidianAxe");;
		ToolObsidianSpade = new ToolObsidianSpade(MaterialObsidian).setUnlocalizedName("ToolObsidianSpade").setCreativeTab(_MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":ToolObsidianSpade");
		ToolObsidianHoe = new ToolObsidianHoe(MaterialObsidian).setUnlocalizedName("ToolObsidianHoe").setCreativeTab(_MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":ToolObsidianHoe");
	}
	
	public static void registerItem(){
		//items
		GameRegistry.registerItem(ItemObsidianStick, ItemObsidianStick.getUnlocalizedName());
		GameRegistry.registerItem(ItemDimBlazeRod, ItemDimBlazeRod.getUnlocalizedName());
		GameRegistry.registerItem(ItemObsiditeIngot, ItemObsiditeIngot.getUnlocalizedName());
		GameRegistry.registerItem(ItemRawObsidianOre, ItemRawObsidianOre.getUnlocalizedName());
		GameRegistry.registerItem(ItemObsidianOre, ItemObsidianOre.getUnlocalizedName());
		GameRegistry.registerItem(ItemToolCore, ItemToolCore.getUnlocalizedName());
		//tools
		GameRegistry.registerItem(ToolObsidianSword, ToolObsidianSword.getUnlocalizedName());
		GameRegistry.registerItem(ToolObsidianPickaxe, ToolObsidianPickaxe.getUnlocalizedName());
		GameRegistry.registerItem(ToolObsidianAxe, ToolObsidianAxe.getUnlocalizedName());
		GameRegistry.registerItem(ToolObsidianSpade, ToolObsidianSpade.getUnlocalizedName());
		GameRegistry.registerItem(ToolObsidianHoe, ToolObsidianHoe.getUnlocalizedName());
	}
	
}
