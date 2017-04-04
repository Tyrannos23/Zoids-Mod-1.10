package zoids.Main.CreativeTabs;

import zoids.Main.init.ZoidTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabZoidTools extends CreativeTabs {

	public TabZoidTools() {
		super("ZoidTools");
	}

	@Override
	public Item getTabIconItem() {
		return ZoidTools.MetalZiPickaxe;
	}

}
