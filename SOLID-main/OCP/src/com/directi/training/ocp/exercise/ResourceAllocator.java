package com.directi.training.ocp.exercise;

import java.util.HashMap;
import java.util.Map;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    private final Map<ResourceType, IResource> resourceMap;

    public ResourceAllocator() {
        resourceMap = new HashMap<>();
        resourceMap.put(ResourceType.TIME_SLOT, new TimeSlotResource());
        resourceMap.put(ResourceType.SPACE_SLOT, new SpaceSlotResource());
    }

    public int allocate(ResourceType resourceType) {
        IResource resource = resourceMap.get(resourceType);
        if (resource != null) {
            return resource.allocate();
        } else {
            System.out.println("ERREUR : Tentative d'allocation d'une ressource invalide");
            return INVALID_RESOURCE_ID;
        }
    }

    public void free(ResourceType resourceType, int resourceId) {
        IResource resource = resourceMap.get(resourceType);
        if (resource != null) {
            resource.free(resourceId);
        } else {
            System.out.println("ERREUR : tentative de libération d'une ressource invalide");
        }
    }
}
