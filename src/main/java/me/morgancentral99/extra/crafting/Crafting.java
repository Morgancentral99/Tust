package me.morgancentral99.extra.crafting;

import me.morgancentral99.extra.block.ModBlock;
import me.morgancentral99.extra.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafting {

	public static void initCrafting() {
		GameRegistry.addRecipe(new ItemStack(ModBlock.EnderBlock), "xxx", "xxx", "xxx", 'x', ModItems.EnderIngot);
		GameRegistry.addSmelting(Items.ENDER_PEARL, new ItemStack(ModItems.EnderIngot), 50.0F);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.EnderIngot, 9), ModBlock.EnderBlock);
	}
	

}
