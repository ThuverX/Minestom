package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class DragonWallHead {
	public static void initStates() {
		DRAGON_WALL_HEAD.addBlockAlternative(new BlockAlternative((short) 6606, "facing=north"));
		DRAGON_WALL_HEAD.addBlockAlternative(new BlockAlternative((short) 6607, "facing=south"));
		DRAGON_WALL_HEAD.addBlockAlternative(new BlockAlternative((short) 6608, "facing=west"));
		DRAGON_WALL_HEAD.addBlockAlternative(new BlockAlternative((short) 6609, "facing=east"));
	}
}
