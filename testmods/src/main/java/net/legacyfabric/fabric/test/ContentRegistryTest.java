package net.legacyfabric.fabric.test;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.legacyfabric.fabric.api.content.registry.v1.ItemRegistry;

public class ContentRegistryTest implements ModInitializer {
	public static final Item TestItem = new Item().setItemGroup(ItemGroup.MISC).setMaxCount(16);
	@Override
	public void onInitialize() {
		ItemRegistry.register(new Identifier("testmod" , "testitem"), ContentRegistryTest.TestItem);
		System.out.println("TEEEEEEEEEEESSSSSSSSSSSSS!!!!!!!!!!");
	}
}
