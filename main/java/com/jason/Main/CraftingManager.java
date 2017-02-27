package com.jason.Main;

import com.jason.blocks._MBlocks;
import com.jason.item._MItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	
	public static void addCraftingRec(){
		//items
		GameRegistry.addRecipe(new ItemStack(_MItems.ItemDimBlazeRod, 1), new Object[]{" X ","XYX"," X ", 'X', Items.coal, 'Y', Blocks.coal_block});
		GameRegistry.addRecipe(new ItemStack(_MBlocks.BlockCompressedObsidian, 1), new Object[]{"XXX","XXX","XXX", 'X', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(_MItems.ItemObsidianStick, 1), new Object[]{" X "," Y "," X ", 'X', Items.blaze_rod, 'Y', _MBlocks.BlockCompressedObsidian});
		GameRegistry.addRecipe(new ItemStack(_MItems.ItemRawObsidianOre, 1), new Object[]{"XYX","YZY","XYX", 'X', Blocks.obsidian, 'Y', Items.blaze_powder, 'Z', _MBlocks.BlockCompressedObsidian});
		GameRegistry.addRecipe(new ItemStack(_MItems.ItemToolCore, 1), new Object[]{"XYX","ZXZ","XYX", 'X', _MItems.ItemObsiditeIngot, 'Y', Items.blaze_powder, 'Z', Blocks.coal_block});
		//tools
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolObsidianSword, 1), new Object[]{" XX","XYX","ZX ", 'X', _MItems.ItemObsidianOre, 'Y', _MItems.ItemToolCore, 'Z', _MItems.ItemObsidianStick});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolObsidianPickaxe, 1), new Object[]{"XXX"," Y "," Z ", 'X', _MItems.ItemObsidianOre, 'Y', _MItems.ItemToolCore, 'Z', _MItems.ItemObsidianStick});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolObsidianAxe, 1), new Object[]{"XX ","XY "," Z ", 'X', _MItems.ItemObsidianOre, 'Y', _MItems.ItemToolCore, 'Z', _MItems.ItemObsidianStick});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolObsidianSpade, 1), new Object[]{" X "," Y "," Z ", 'X', _MItems.ItemObsidianOre, 'Y', _MItems.ItemToolCore, 'Z', _MItems.ItemObsidianStick});
		GameRegistry.addRecipe(new ItemStack(_MItems.ToolObsidianHoe, 1), new Object[]{"XX "," Y "," Z ", 'X', _MItems.ItemObsidianOre, 'Y', _MItems.ItemToolCore, 'Z', _MItems.ItemObsidianStick});
	}
	
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(_MItems.ItemDimBlazeRod, new ItemStack(Items.blaze_rod, 1), 1.0f);
		GameRegistry.addSmelting(_MBlocks.BlockObsiditeOre, new ItemStack(_MItems.ItemObsiditeIngot, 1), 2.0f);
		GameRegistry.addSmelting(_MItems.ItemRawObsidianOre, new ItemStack(_MItems.ItemObsidianOre, 1), 2.0f);
	}
}
