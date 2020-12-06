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
	
	public static final Item HILT = new ItemBase("hilt");
	public static final Item HAND_GRIP = new ItemBase("hand_grip");
	public static final Item BLADE_EMITTER = new ItemBase("blade_emitter");
	public static final Item ACTIVATOR_SWITCH = new ItemBase("activator_switch");
	
	public static final Item KYBER_CRYSTAL_GREEN = new ItemBase("kyber_crystal_green");
	public static final Item KYBER_CRYSTAL_ORIGINAL_BLUE = new ItemBase("kyber_crystal_original_blue");
	public static final Item KYBER_CRYSTAL_YOUNGLING_BLUE = new ItemBase("kyber_crystal_youngling_blue");
	public static final Item KYBER_CRYSTAL_PURPLE = new ItemBase("kyber_crystal_purple");
	public static final Item KYBER_CRYSTAL_RED = new ItemBase("kyber_crystal_red");
	
	// Tools
	public static final ItemSword LIGHTSABER_GREEN = new Lightsaber("lightsaber_green", LIGHTSABER_MATERIAL);
	public static final ItemSword LIGHTSABER_ORIGINAL_BLUE = new Lightsaber("lightsaber_original_blue", LIGHTSABER_MATERIAL);
	public static final ItemSword LIGHTSABER_YOUNGLING_BLUE = new Lightsaber("lightsaber_youngling_blue", LIGHTSABER_MATERIAL);
	public static final ItemSword LIGHTSABER_PURPLE = new Lightsaber("lightsaber_purple", LIGHTSABER_MATERIAL);
	public static final ItemSword LIGHTSABER_RED = new Lightsaber("lightsaber_red", LIGHTSABER_MATERIAL);
	
}
