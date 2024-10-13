package com.directi.training.ocp.exercise;

public interface IResource {
    int allocate();
    void free(int resourceId);
}
