package net.fabricmc.fabric.api.dimension.v1;

import java.util.HashMap;

import net.minecraft.world.dimension.Dimension;

public class FabricDimensions {

	private static final HashMap<Integer, Dimension> FABRIC_DIMENSIONS = new HashMap<>();

	public static void registerDimension(Dimension dimension){
		FABRIC_DIMENSIONS.put(0, dimension);
	}

}
