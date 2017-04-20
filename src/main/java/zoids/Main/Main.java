package zoids.Main;

import zoids.Main.CreativeTabs.TabZoidBlocks;
import zoids.Main.CreativeTabs.TabZoidItems;
import zoids.Main.CreativeTabs.TabZoidTools;
import zoids.Main.Mobs.MobRegistry;
import zoids.Main.init.ZoidBlocks;
import zoids.Main.init.ZoidItems;
import zoids.Main.init.ZoidTools;
import zoids.Main.proxy.CommonProxy;
import zoids.Main.util.Utils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs blocks = new TabZoidBlocks();
	public static final CreativeTabs items = new TabZoidItems();
	public static final CreativeTabs tools = new TabZoidTools();
	

	@Mod.Instance(Reference.MODID)
	public static Main instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.NAME + " is Mobilizing!");
		ZoidItems.init();
		ZoidTools.init();
		ZoidBlocks.init();
		MobRegistry.register();
		ZoidItems.register();
		ZoidTools.register();
		ZoidBlocks.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		System.out.println(Reference.NAME + " has entered the battlefield!");
	}
	
}
