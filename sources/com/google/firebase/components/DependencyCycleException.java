package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<x2.c<?>> f11931a;

    public DependencyCycleException(List<x2.c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f11931a = list;
    }
}
