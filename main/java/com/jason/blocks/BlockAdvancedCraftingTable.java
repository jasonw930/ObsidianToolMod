package com.jason.blocks;

import com.jason.Main.MainRegistry;
import com.jason.creativetabs._MCreativeTabs;
import com.jason.lib.RefStrings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockAdvancedCraftingTable extends Block{

	@SideOnly(Side.CLIENT)
	private IIcon BlockAdvancedCraftingTableTop;
	
	public BlockAdvancedCraftingTable() {
		super(Material.wood);
		
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(_MCreativeTabs.TabBlocks);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata) {
		return side == 1 ? this.BlockAdvancedCraftingTableTop : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(RefStrings.MODID + ":" + "BlockAdvancedCraftingTableSide");
		this.BlockAdvancedCraftingTableTop = iconRegister.registerIcon(RefStrings.MODID + ":" + "BlockAdvancedCraftingTableTop");
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		if (!player.isSneaking()) {
			player.openGui(MainRegistry.instance, _MBlocks.guiIdAdvancedCraftingTable, world, x, y, z);
			return true;
		}else{
			return false;
		}
	}
}
