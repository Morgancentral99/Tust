package me.morgancentral99.extra.creativetab;

import me.morgancentral99.extra.Refrences;
import me.morgancentral99.extra.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs{
	
	public CreativeTab() {
		super(Refrences.MODID);
		
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.EnderIngot;
	}

}
