package com.teamfractal.fractalcoppery.items;

import eu.pb4.polymer.api.item.PolymerItem;
import eu.pb4.polymer.api.resourcepack.PolymerModelData;
import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class CopperSwordItem extends SwordItem implements PolymerItem {
    private final PolymerModelData copperSwordTex = PolymerRPUtils.requestModel(Items.IRON_SWORD, new Identifier("fractal_coppery", "item/copper_sword"));

    public CopperSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        new TranslatableText("item.fractal_coppery.copper_sword");
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return Items.IRON_SWORD;
    }
}
