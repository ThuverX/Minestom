package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class MossyStoneBrickSlab {
	public static void initStates() {
		MOSSY_STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10801, "type=top", "waterlogged=true"));
		MOSSY_STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10802, "type=top", "waterlogged=false"));
		MOSSY_STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10803, "type=bottom", "waterlogged=true"));
		MOSSY_STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10804, "type=bottom", "waterlogged=false"));
		MOSSY_STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10805, "type=double", "waterlogged=true"));
		MOSSY_STONE_BRICK_SLAB.addBlockAlternative(new BlockAlternative((short) 10806, "type=double", "waterlogged=false"));
	}
}
