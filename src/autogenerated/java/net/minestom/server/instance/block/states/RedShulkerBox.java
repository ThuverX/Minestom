package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class RedShulkerBox {
	public static void initStates() {
		RED_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9362, "facing=north"));
		RED_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9363, "facing=east"));
		RED_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9364, "facing=south"));
		RED_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9365, "facing=west"));
		RED_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9366, "facing=up"));
		RED_SHULKER_BOX.addBlockAlternative(new BlockAlternative((short) 9367, "facing=down"));
	}
}
