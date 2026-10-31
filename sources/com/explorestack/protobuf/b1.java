package com.explorestack.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaFull.java */
/* JADX INFO: loaded from: classes.dex */
class b1 implements a1 {
    b1() {
    }

    private static <K, V> int a(int i10, Object obj, Object obj2) {
        int iX = 0;
        if (obj == null) {
            return 0;
        }
        Map<K, V> mapJ = ((y0) obj).j();
        w0 w0Var = (w0) obj2;
        if (mapJ.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapJ.entrySet()) {
            iX += CodedOutputStream.X(i10) + CodedOutputStream.E(x0.b(w0Var.k(), entry.getKey(), entry.getValue()));
        }
        return iX;
    }

    private static <K, V> Object b(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        y0<K, V> y0Var2 = (y0) obj2;
        if (!y0Var.n()) {
            y0Var.g();
        }
        y0Var.p(y0Var2);
        return y0Var;
    }

    @Override // com.explorestack.protobuf.a1
    public Map<?, ?> forMapData(Object obj) {
        return ((y0) obj).j();
    }

    @Override // com.explorestack.protobuf.a1
    public x0.b<?, ?> forMapMetadata(Object obj) {
        return ((w0) obj).k();
    }

    @Override // com.explorestack.protobuf.a1
    public Map<?, ?> forMutableMapData(Object obj) {
        return ((y0) obj).m();
    }

    @Override // com.explorestack.protobuf.a1
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return a(i10, obj, obj2);
    }

    @Override // com.explorestack.protobuf.a1
    public boolean isImmutable(Object obj) {
        return !((y0) obj).n();
    }

    @Override // com.explorestack.protobuf.a1
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // com.explorestack.protobuf.a1
    public Object newMapField(Object obj) {
        return y0.q((w0) obj);
    }

    @Override // com.explorestack.protobuf.a1
    public Object toImmutable(Object obj) {
        ((y0) obj).o();
        return obj;
    }
}
