package zoids.Main.CreativeTabs;

import zoids.Main.init.ZoidBlocks;
import zoids.Main.init.ZoidItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabZoidItems extends CreativeTabs {
	
	public TabZoidItems() {
		super("ZoidItems");
	}

	@Override
	public Item getTabIconItem() {
		return ZoidItems.ZoidMagnite;
	}

}
