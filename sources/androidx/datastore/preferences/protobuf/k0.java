package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchema.java */
/* JADX INFO: loaded from: classes.dex */
interface k0 {
    Map<?, ?> forMapData(Object obj);

    i0.a<?, ?> forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i10, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
