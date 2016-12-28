package me.morgancentral99.extra.block;

import me.morgancentral99.extra.Main;
import me.morgancentral99.extra.proxy.ClientProxy;
import me.morgancentral99.extra.render.IItemModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBase extends Block implements IItemModel {
	
	protected String name;
	
	ClientProxy c;
	
	public BlockBase(String name,Material material, float Hardness, float resistence) {
		super(material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ExtraStuffTab);
		setHardness(Hardness);
		setResistance(resistence);
	}
	
	public BlockBase(String name) {
		this(name, Material.ROCK, 0.5f, 0.5f);
	}

	@Override
	public void registerItemModel(Item itemBlock) {
	 c.registerItemRenderer(itemBlock, 0, name);
		
	}

}
