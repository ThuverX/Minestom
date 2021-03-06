package net.minestom.server.instance;

import net.minestom.server.storage.StorageFolder;
import net.minestom.server.utils.validate.Check;
import net.minestom.server.world.DimensionType;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class InstanceManager {

    private Set<Instance> instances = Collections.synchronizedSet(new HashSet<>());

    public InstanceContainer createInstanceContainer(InstanceContainer instanceContainer) {
        this.instances.add(instanceContainer);
        return instanceContainer;
    }

    public InstanceContainer createInstanceContainer(DimensionType dimensionType, StorageFolder storageFolder) {
        InstanceContainer instance = new InstanceContainer(UUID.randomUUID(), dimensionType, storageFolder);
        return createInstanceContainer(instance);
    }

    public InstanceContainer createInstanceContainer(StorageFolder storageFolder) {
        return createInstanceContainer(DimensionType.OVERWORLD, storageFolder);
    }

    public InstanceContainer createInstanceContainer(DimensionType dimensionType) {
        return createInstanceContainer(dimensionType, null);
    }

    public InstanceContainer createInstanceContainer() {
        return createInstanceContainer(DimensionType.OVERWORLD);
    }

    public SharedInstance createSharedInstance(SharedInstance sharedInstance) {
        final InstanceContainer instanceContainer = sharedInstance.getInstanceContainer();
        Check.notNull(instanceContainer, "SharedInstance needs to have an InstanceContainer to be created!");

        instanceContainer.addSharedInstance(sharedInstance);
        this.instances.add(sharedInstance);
        return sharedInstance;
    }

    public SharedInstance createSharedInstance(InstanceContainer instanceContainer) {
        Check.notNull(instanceContainer, "Instance container cannot be null when creating a SharedInstance!");

        final SharedInstance sharedInstance = new SharedInstance(UUID.randomUUID(), instanceContainer);
        return createSharedInstance(sharedInstance);
    }

    public Set<Instance> getInstances() {
        return Collections.unmodifiableSet(instances);
    }

}
