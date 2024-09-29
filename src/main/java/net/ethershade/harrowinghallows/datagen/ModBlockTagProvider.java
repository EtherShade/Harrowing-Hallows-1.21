package net.ethershade.harrowinghallows.datagen;

import net.ethershade.harrowinghallows.HarrowingHallows;
import net.ethershade.harrowinghallows.block.ModBlocks;
import net.ethershade.harrowinghallows.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HarrowingHallows.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STYXITE_BLOCK.get())
                .add(ModBlocks.RAW_STYXITE_BLOCK.get())
                .add(ModBlocks.STYXITE_ORE.get())
                .add(ModBlocks.STYXITE_DEEPSLATE_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL);

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.STYXITE_BLOCK.get())
                .add(ModBlocks.RAW_STYXITE_BLOCK.get())
                .add(ModBlocks.STYXITE_ORE.get())
                .add(ModBlocks.STYXITE_DEEPSLATE_ORE.get());

        tag(BlockTags.FENCES);
        tag(BlockTags.FENCE_GATES);
        tag(BlockTags.WALLS);

        tag(ModTags.Blocks.NEEDS_STYXITE_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_STYXITE_TOOL);
    }
}
