package com.teamfractal.fractalcoppery;

import com.teamfractal.fractalcoppery.items.*;
import eu.pb4.polymer.api.item.PolymerItemGroup;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ToolMaterials;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static eu.pb4.polymer.api.resourcepack.PolymerRPUtils.addAssetSource;
import static eu.pb4.polymer.api.resourcepack.PolymerRPUtils.markAsRequired;

public class FractalCoppery implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("fractal_coppery");
	public static final PolymerItemGroup ITEM_GROUP = PolymerItemGroup.create(
			new Identifier("fractal_coppery", "main"),
			new TranslatableText("fractal_coppery.main"));
	public static CopperSwordItem COPPER_SWORD = new CopperSwordItem(ToolMaterials.IRON, (int) 2.5, -2.4F, new FabricItemSettings().group(ITEM_GROUP));
	public static CopperPickaxeItem COPPER_PICKAXE = new CopperPickaxeItem(ToolMaterials.IRON, (int) 0.5, -2.8F, new FabricItemSettings().group(ITEM_GROUP));
	public static CopperAxeItem COPPER_AXE = new CopperAxeItem(ToolMaterials.IRON, (int) 5.5, -3.1F, new FabricItemSettings().group(ITEM_GROUP));
	public static CopperShovelItem COPPER_SHOVEL = new CopperShovelItem(ToolMaterials.IRON, 1, -3.0F, new FabricItemSettings().group(ITEM_GROUP));
	public static CopperHoeItem COPPER_HOE = new CopperHoeItem(ToolMaterials.IRON, (int) -2.5, -1.0F, new FabricItemSettings().group(ITEM_GROUP));

	@Override
	public void onInitialize() {
		addAssetSource("fractal_coppery");
		markAsRequired();
		LOGGER.info("how do u feel if u have nothing installed but have copper tools with textures while playing a server lol");
		Registry.register(Registry.ITEM, new Identifier("fractal_coppery", "copper_sword"), COPPER_SWORD);
		Registry.register(Registry.ITEM, new Identifier("fractal_coppery", "copper_pickaxe"), COPPER_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("fractal_coppery", "copper_axe"), COPPER_AXE);
		Registry.register(Registry.ITEM, new Identifier("fractal_coppery", "copper_shovel"), COPPER_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("fractal_coppery", "copper_hoe"), COPPER_HOE);
	}
}
