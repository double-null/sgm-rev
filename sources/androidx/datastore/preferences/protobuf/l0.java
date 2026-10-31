package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
final class l0 implements k0 {
    l0() {
    }

    private static <K, V> int a(int i10, Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        i0 i0Var = (i0) obj2;
        int iA = 0;
        if (j0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : j0Var.entrySet()) {
            iA += i0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> j0<K, V> b(Object obj, Object obj2) {
        j0<K, V> j0VarX = (j0) obj;
        j0<K, V> j0Var = (j0) obj2;
        if (!j0Var.isEmpty()) {
            if (!j0VarX.t()) {
                j0VarX = j0VarX.x();
            }
            j0VarX.w(j0Var);
        }
        return j0VarX;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Map<?, ?> forMapData(Object obj) {
        return (j0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public i0.a<?, ?> forMapMetadata(Object obj) {
        return ((i0) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Map<?, ?> forMutableMapData(Object obj) {
        return (j0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return a(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public boolean isImmutable(Object obj) {
        return !((j0) obj).t();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Object newMapField(Object obj) {
        return j0.n().x();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Object toImmutable(Object obj) {
        ((j0) obj).v();
        return obj;
    }
}
