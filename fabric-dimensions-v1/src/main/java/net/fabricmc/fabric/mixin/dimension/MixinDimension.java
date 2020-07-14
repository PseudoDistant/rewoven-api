package net.fabricmc.fabric.mixin.dimension;

import java.util.HashMap;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.dimension.Dimension;

@Mixin(Dimension.class)
public class MixinDimension {

	private static final HashMap<Integer, Dimension> FABRIC_DIMENSIONS = new HashMap<>();

	@Inject(at = @At("TAIL"), method = "getById")
	private static void getFabricDimensionById(int id, CallbackInfoReturnable<Dimension> cir){

		cir.setReturnValue(FABRIC_DIMENSIONS.get(id));
	}
}
