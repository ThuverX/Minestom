package net.minestom.server.entity.type;

import net.minestom.server.entity.Entity;
import net.minestom.server.entity.EntityCreature;
import net.minestom.server.entity.EntityType;
import net.minestom.server.network.packet.PacketWriter;
import net.minestom.server.utils.Position;

import java.util.function.Consumer;

public class EntityGuardian extends EntityCreature {

    private boolean retractingSpikes;
    private Entity target;

    public EntityGuardian(Position spawnPosition) {
        super(EntityType.GUARDIAN, spawnPosition);
        setBoundingBox(0.85f, 0.85f, 0.85f);
    }

    @Override
    public Consumer<PacketWriter> getMetadataConsumer() {
        return packet -> {
            super.getMetadataConsumer().accept(packet);
            fillMetadataIndex(packet, 15);
            fillMetadataIndex(packet, 16);
        };
    }

    @Override
    protected void fillMetadataIndex(PacketWriter packet, int index) {
        super.fillMetadataIndex(packet, index);
        if (index == 15) {
            packet.writeByte((byte) 15);
            packet.writeByte(METADATA_BOOLEAN);
            packet.writeBoolean(retractingSpikes);
        } else if (index == 16) {
            packet.writeByte((byte) 16);
            packet.writeByte(METADATA_VARINT);
            packet.writeVarInt(target == null ? 0 : target.getEntityId());
        }
    }

    public boolean isRetractingSpikes() {
        return retractingSpikes;
    }

    public void setRetractingSpikes(boolean retractingSpikes) {
        this.retractingSpikes = retractingSpikes;
    }

    public Entity getTarget() {
        return target;
    }

    public void setTarget(Entity target) {
        this.target = target;
    }
}
