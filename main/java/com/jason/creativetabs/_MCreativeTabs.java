package com.jason.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class _MCreativeTabs {
	
	public static CreativeTabs TabBlocks;
	public static CreativeTabs TabItems;
	public static CreativeTabs TabTools;
	
	public static void initializeTabs(){
		TabBlocks = new TabBlocks("TabBlocks");
		TabItems = new TabItems("TabItems");
		TabTools = new TabTools("TabTools");
	}
}
