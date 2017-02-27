package com.jason.creativetabs;

import com.jason.blocks._MBlocks;
import com.jason.item._MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabTools extends CreativeTabs {

	public TabTools(String arg0) {
		super(arg0);
	}

	@Override
	public Item getTabIconItem() {
		return _MItems.ItemObsidianStick;
	}

}
