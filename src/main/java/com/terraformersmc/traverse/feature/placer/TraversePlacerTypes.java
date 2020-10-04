package com.terraformersmc.traverse.feature.placer;

import com.terraformersmc.terraform.placer.PlacerTypes;
import com.terraformersmc.traverse.feature.placer.FallenTrunkPlacer;
import com.terraformersmc.traverse.feature.placer.NoneFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class TraversePlacerTypes {
	public static final FoliagePlacerType<NoneFoliagePlacer> NONE_FOLIAGE_PLACER = PlacerTypes.registerFoliagePlacer("traverse:none", NoneFoliagePlacer.CODEC);
	public static final TrunkPlacerType<FallenTrunkPlacer> FALLEN_TRUNK_PLACER = PlacerTypes.registerTrunkPlacer("traverse:fallen", FallenTrunkPlacer.CODEC);

}
