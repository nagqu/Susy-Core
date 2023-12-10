package supersymmetry.common.metatileentities.multi.electric;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import net.minecraft.util.ResourceLocation;
import supersymmetry.api.recipes.SuSyRecipeMaps;

import javax.annotation.Nonnull;


public class MetaTileEntityResearchComputer extends RecipeMapMultiblockController {

    // adds multi to a recipe map
    public MetaTileEntityResearchComputer (ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, SuSyRecipeMaps.RESEARCH_COMPUTER_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityResearchComputer(metaTileEntityId);
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                //
                .build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) { return Textures.COMPUTER_CASING; }

    @Nonnull
    @Override
    protected ICubeRenderer getFrontOverlay() { return Textures.HPCA_OVERLAY; }
}
