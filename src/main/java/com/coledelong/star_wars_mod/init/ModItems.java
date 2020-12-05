package com.coledelong.star_wars_mod.init;

import java.util.List;

import com.coledelong.star_wars_mod.items.ItemBase;
import com.coledelong.star_wars_mod.items.Lightsaber;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	// Materials
	public static final ToolMaterial LIGHTSABER_MATERIAL = EnumHelper.addToolMaterial("lightsaber_material", 4, Integer.MAX_VALUE, 40.0F, 100.0F, 40);
	
	// Items
	public static final List<Item> ITEMS = new ArrayList<Item>();	
	
	// Tools
	public static final ItemSword LIGHTSABER_GREEN = new Lightsaber("lightsaber_green", LIGHTSABER_MATERIAL);
	public static final ItemSword LIGHTSABER_ORIGINAL_BLUE = new Lightsaber("lightsaber_original_blue", LIGHTSABER_MATERIAL);
	public static final ItemSword LIGHTSABER_YOUNGLING_BLUE = new Lightsaber("lightsaber_youngling_blue", LIGHTSABER_MATERIAL);
	public static final ItemSword LIGHTSABER_PURPLE = new Lightsaber("lightsaber_purple", LIGHTSABER_MATERIAL);
	public static final ItemSword LIGHTSABER_RED = new Lightsaber("lightsaber_red", LIGHTSABER_MATERIAL);
	
}
