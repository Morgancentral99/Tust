package me.morgancentral99.extra.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EnderIngot extends Item {
	
	public EnderIngot(String name) {
		super();

		this.setUnlocalizedName(name);
	    this.setCreativeTab(CreativeTabs.MATERIALS);
		this.setRegistryName(name);
	}

}
