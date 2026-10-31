package com.explorestack.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
class c1 implements a1 {
    c1() {
    }

    private static <K, V> int a(int i10, Object obj, Object obj2) {
        z0 z0Var = (z0) obj;
        x0 x0Var = (x0) obj2;
        int iA = 0;
        if (z0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : z0Var.entrySet()) {
            iA += x0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> z0<K, V> b(Object obj, Object obj2) {
        z0<K, V> z0VarB = (z0) obj;
        z0<K, V> z0Var = (z0) obj2;
        if (!z0Var.isEmpty()) {
            if (!z0VarB.w()) {
                z0VarB = z0VarB.B();
            }
            z0VarB.z(z0Var);
        }
        return z0VarB;
    }

    @Override // com.explorestack.protobuf.a1
    public Map<?, ?> forMapData(Object obj) {
        return (z0) obj;
    }

    @Override // com.explorestack.protobuf.a1
    public x0.b<?, ?> forMapMetadata(Object obj) {
        return ((x0) obj).c();
    }

    @Override // com.explorestack.protobuf.a1
    public Map<?, ?> forMutableMapData(Object obj) {
        return (z0) obj;
    }

    @Override // com.explorestack.protobuf.a1
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return a(i10, obj, obj2);
    }

    @Override // com.explorestack.protobuf.a1
    public boolean isImmutable(Object obj) {
        return !((z0) obj).w();
    }

    @Override // com.explorestack.protobuf.a1
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // com.explorestack.protobuf.a1
    public Object newMapField(Object obj) {
        return z0.p().B();
    }

    @Override // com.explorestack.protobuf.a1
    public Object toImmutable(Object obj) {
        ((z0) obj).x();
        return obj;
    }
}
