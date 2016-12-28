package me.morgancentral99.extra.block;

import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class CauldronTileEntity  {
	
	public static final String DISPLAY_TABLE_FACING = "facing";
	
	private EnumFacing facing;
	
	/* Constructors */
	
	public CauldronTileEntity() {
		super();
		this.facing = EnumFacing.NORTH;
	}
	
	/* Custom Methods */
	
	public EnumFacing getFacing() {
		return this.facing;
	}
	
	public void setFacing(EnumFacing newFacing) {
		this.facing = newFacing;
		
	}
	

	



}
