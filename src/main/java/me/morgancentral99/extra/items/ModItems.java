package me.morgancentral99.extra.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item EnderIngot;
	
	//public static Item enderpickaxe;
	//Tools
	//public static ToolMaterial enderpick = EnumHelper.addToolMaterial("enderpick", 3, 100000, 12.0F, 1.0F, 22);
	
	public static void createItems() {
		
		//Items
		GameRegistry.register(EnderIngot = new EnderIngot("enderingot"));
		
		//Tools
	//	GameRegistry.register(enderpickaxe = new EnderPickaxe("enderpickaxe", enderpick));
		
		//crafting
	//	GameRegistry.addRecipe(new ItemStack(enderpickaxe), new Object[] {
	//			"###", " I ", " I ", '#', EnderIngot, 'I', Items.STICK});
	}

}
