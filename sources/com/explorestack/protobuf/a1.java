package com.explorestack.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchema.java */
/* JADX INFO: loaded from: classes.dex */
interface a1 {
    Map<?, ?> forMapData(Object obj);

    x0.b<?, ?> forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i10, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
