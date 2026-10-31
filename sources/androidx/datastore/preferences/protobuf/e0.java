package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: ListFieldSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
final class e0 implements d0 {
    e0() {
    }

    static <E> y.i<E> d(Object obj, long j10) {
        return (y.i) n1.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void a(Object obj, long j10) {
        d(obj, j10).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public <E> void b(Object obj, Object obj2, long j10) {
        y.i iVarD = d(obj, j10);
        y.i iVarD2 = d(obj2, j10);
        int size = iVarD.size();
        int size2 = iVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!iVarD.isModifiable()) {
                iVarD = iVarD.mutableCopyWithCapacity(size2 + size);
            }
            iVarD.addAll(iVarD2);
        }
        if (size > 0) {
            iVarD2 = iVarD;
        }
        n1.O(obj, j10, iVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public <L> List<L> c(Object obj, long j10) {
        y.i iVarD = d(obj, j10);
        if (iVarD.isModifiable()) {
            return iVarD;
        }
        int size = iVarD.size();
        y.i iVarMutableCopyWithCapacity = iVarD.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        n1.O(obj, j10, iVarMutableCopyWithCapacity);
        return iVarMutableCopyWithCapacity;
    }
}
