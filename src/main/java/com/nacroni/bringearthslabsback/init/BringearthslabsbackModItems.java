
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.nacroni.bringearthslabsback.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.nacroni.bringearthslabsback.BringearthslabsbackMod;

public class BringearthslabsbackModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BringearthslabsbackMod.MODID);
	public static final RegistryObject<Item> PETRIFIED_DIRT_SLAB = block(BringearthslabsbackModBlocks.PETRIFIED_DIRT_SLAB);
	public static final RegistryObject<Item> DIRT_SLAB = block(BringearthslabsbackModBlocks.DIRT_SLAB);
	public static final RegistryObject<Item> GRASS_SLAB = block(BringearthslabsbackModBlocks.GRASS_SLAB);
	public static final RegistryObject<Item> PETRIFIED_GRASS_SLAB = block(BringearthslabsbackModBlocks.PETRIFIED_GRASS_SLAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
