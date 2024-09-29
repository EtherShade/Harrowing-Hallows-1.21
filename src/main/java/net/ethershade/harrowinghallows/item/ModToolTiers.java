package net.ethershade.harrowinghallows.item;

import net.ethershade.harrowinghallows.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier STYXITE = new ForgeTier(1400, 4, 3f, 20,
            ModTags.Blocks.NEEDS_STYXITE_TOOL, () -> Ingredient.of(ModItems.STYXITE_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_STYXITE_TOOL);
}
