
// base model for item class

package com.coledelong.star_wars_mod.items;

import com.coledelong.star_wars_mod.Main;
import com.coledelong.star_wars_mod.init.ModItems;
import com.coledelong.star_wars_mod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase (String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS); // change as is appropriate
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
