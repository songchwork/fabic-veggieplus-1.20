package net.song.veggieplus;

import net.fabricmc.api.ModInitializer;

import net.song.veggieplus.block.ModBlocks;
import net.song.veggieplus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VeggiePlus implements ModInitializer {
	public static final String MODID = "veggieplus";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}