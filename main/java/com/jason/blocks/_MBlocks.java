package com.jason.blocks;

//import com.jason.blocks.tileentity.BlockObsidianFurnaceTileEntity;
import com.jason.creativetabs._MCreativeTabs;
import com.jason.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class _MBlocks {

	public static void mainRegistry(){
		initializeBlock();
		registerBlock();
	}
	
	//blocks
	public static Block BlockCompressedObsidian;
	public static Block BlockObsiditeOre;
	
	public static Block BlockAdvancedCraftingTable;
	public static final int guiIdAdvancedCraftingTable = 1;

	
	
	public static void initializeBlock(){
		BlockCompressedObsidian = new BlockCompressedObsidian(Material.rock).setBlockName("BlockCompressedObsidian").setCreativeTab(_MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":BlockCompressedObsidian").setHardness(25.0f);
		BlockObsiditeOre = new BlockObsiditeOre(Material.rock).setBlockName("BlockObsiditeOre").setCreativeTab(_MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":BlockObsiditeOre").setHardness(10.0f);
		
		BlockAdvancedCraftingTable = new BlockAdvancedCraftingTable().setBlockName("BlockAdvancedCraftingTable").setCreativeTab(_MCreativeTabs.TabBlocks);
		
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(BlockCompressedObsidian, BlockCompressedObsidian.getUnlocalizedName());
		GameRegistry.registerBlock(BlockObsiditeOre, BlockObsiditeOre.getUnlocalizedName());
		
		GameRegistry.registerBlock(BlockAdvancedCraftingTable, BlockAdvancedCraftingTable.getUnlocalizedName());

	}
	
}
