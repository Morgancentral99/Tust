package me.morgancentral99.extra.items.tools.ender;

import net.minecraft.item.ItemPickaxe;

public class EnderPickaxe extends ItemPickaxe {

	public EnderPickaxe(String Name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Name);
		this.setRegistryName(Name);
	}

}
