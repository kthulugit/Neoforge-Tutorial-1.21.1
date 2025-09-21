package net.kthulu.mytutorialmod.item;

import net.kthulu.mytutorialmod.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier FLINT = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_FLINT_TOOL,
            128, 4f, 1f, 5, () -> Ingredient.of(Items.FLINT));
}
