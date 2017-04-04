package zoids.Main.CreativeTabs;

import zoids.Main.init.ZoidBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabZoidBlocks extends CreativeTabs {

	public TabZoidBlocks() {
		super("ZoidBlocks");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ZoidBlocks.ZiSand);
	}

}
