package me.morgancentral99.extra;

import me.morgancentral99.extra.block.ModBlock;
import me.morgancentral99.extra.crafting.Crafting;
import me.morgancentral99.extra.creativetab.CreativeTab;
import me.morgancentral99.extra.items.ModItems;
import me.morgancentral99.extra.proxy.CommonProxy;
import me.morgancentral99.extra.render.ItemRenderRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrences.MODID, name = Refrences.MODNAME, version = Refrences.VERSION)
public class Main {
	
	public static final CreativeTab ExtraStuffTab = new CreativeTab();
	
	public static CommonProxy proxy;
	
	@Instance
	public static Main instance = new Main();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("Executed INIT");
    	ModItems.createItems();
    	ModBlock.init();
	}
	@EventHandler
	public void init(FMLInitializationEvent e) {
    	ItemRenderRegister.registerItemRenderer();
    	ItemRenderRegister.registerItemRenderer();
    	Crafting.initCrafting();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		//cp.postInit();
	}
	

}
