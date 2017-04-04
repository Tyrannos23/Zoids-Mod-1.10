package zoids.Main.proxy;

import zoids.Main.Mobs.MobRegistry;
import zoids.Main.init.ZoidBlocks;
import zoids.Main.init.ZoidItems;
import zoids.Main.init.ZoidTools;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders() {
		ZoidItems.registerRenders();
		ZoidTools.registerRenders();
		ZoidBlocks.registerRenders();
		
		MobRegistry.register();
	}

}
