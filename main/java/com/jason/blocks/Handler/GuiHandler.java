package com.jason.blocks.Handler;

import com.jason.blocks._MBlocks;
import com.jason.blocks.Container.ContainerAdvancedCraftingTable;
import com.jason.blocks.Gui.GuiAdvancedCraftingTable;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		
		if(ID == _MBlocks.guiIdAdvancedCraftingTable) {
			return ID == _MBlocks.guiIdAdvancedCraftingTable && world.getBlock(x, y, z) == _MBlocks.BlockAdvancedCraftingTable ? new ContainerAdvancedCraftingTable(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		
		if(ID == _MBlocks.guiIdAdvancedCraftingTable) {
			return ID == _MBlocks.guiIdAdvancedCraftingTable && world.getBlock(x, y, z) == _MBlocks.BlockAdvancedCraftingTable ? new GuiAdvancedCraftingTable(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

}
