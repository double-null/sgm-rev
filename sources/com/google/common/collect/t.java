package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: ImmutableEntry.java */
/* JADX INFO: loaded from: classes4.dex */
class t<K, V> extends e<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final K f11695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final V f11696b;

    t(K k10, V v10) {
        this.f11695a = k10;
        this.f11696b = v10;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final K getKey() {
        return this.f11695a;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final V getValue() {
        return this.f11696b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
