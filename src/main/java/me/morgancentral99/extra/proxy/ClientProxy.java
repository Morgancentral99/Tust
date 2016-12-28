package me.morgancentral99.extra.proxy;

import me.morgancentral99.extra.Refrences;
import me.morgancentral99.extra.block.ModBlock;
import me.morgancentral99.extra.items.ModItems;
import me.morgancentral99.extra.render.ItemRenderRegister;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	
	public void preInit() {
		ModItems.createItems();
		ModBlock.init();
		ItemRenderRegister.registerItemRenderer();
	}
	public void init() {
		
	}
	public void postInit() {
		
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Refrences.MODID + ":" + id, "inventory"));
	}

	
    
}
