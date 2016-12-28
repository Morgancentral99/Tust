package me.morgancentral99.extra.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Caldron extends BlockBase{
	
	protected static final AxisAlignedBB TABLE_AABB = new AxisAlignedBB(0F, 0F, 0F, 1F, (1F / 16) * 15, 1F);

	public Caldron(String name, Material material, float hardness, float resistance) {
		super(name, material, hardness, resistance);
	}

	
	public CauldronTileEntity createNewTileEntity(World worldIn, int meta) {
		return new CauldronTileEntity();
	}
	
	@Override @SideOnly(Side.CLIENT) public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}
	
	@Override public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return TABLE_AABB;
	}
	
	@Override public boolean isFullBlock(IBlockState state) {
		return false;
	}
	



}
