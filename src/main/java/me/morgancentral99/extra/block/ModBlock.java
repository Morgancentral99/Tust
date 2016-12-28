package me.morgancentral99.extra.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlock {
	
	//private HashMap<Block, Class> registerList = new HashMap<Block, Class>();
	
	public static Block EnderBlock;
	
	public static me.morgancentral99.extra.block.Caldron Caldron;
	
	//@SuppressWarnings("deprecation")
	public static void init() {
		System.out.println("RegisteredBlocks!");
		GameRegistry.register(EnderBlock = new EnderBlock("enderblock", Material.IRON, 5.0F, 0.5F));
		GameRegistry.register(Caldron = new Caldron("customblock", Material.WOOD, 5.0F, 0.5F));
	
	}
	
	


}
