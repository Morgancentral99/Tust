package me.morgancentral99.extra.render;

import me.morgancentral99.extra.Refrences;
import me.morgancentral99.extra.block.CauldronTileEntity;
import me.morgancentral99.extra.block.ModBlock;
import me.morgancentral99.extra.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	
	public static void registerItemRenderer() {
		reg(ModItems.EnderIngot);
	//	regBlock(ModBlock.EnderBlock);
		//regBlock(ModBlock.Caldron);
	//	TileEntitySpecialRenderer<CauldronTileEntity> dt = new CauldronTileEntity(Minecraft.getMinecraft().getRenderManager());
	//	reg(ModItems.enderpickaxe);
	}
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Refrences.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void regBlock(Block block) {
		Item item = Item.getItemFromBlock(block);
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	public void renderItem(Item itemRender) {
		reg(itemRender);
	}

}
