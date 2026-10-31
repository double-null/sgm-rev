package com.google.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes4.dex */
class o0 implements n0 {
    o0() {
    }

    private static <K, V> int getSerializedSizeLite(int i10, Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        l0 l0Var = (l0) obj2;
        int iComputeMessageSize = 0;
        if (m0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : m0Var.entrySet()) {
            iComputeMessageSize += l0Var.computeMessageSize(i10, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    private static <K, V> m0<K, V> mergeFromLite(Object obj, Object obj2) {
        m0<K, V> m0VarMutableCopy = (m0) obj;
        m0<K, V> m0Var = (m0) obj2;
        if (!m0Var.isEmpty()) {
            if (!m0VarMutableCopy.isMutable()) {
                m0VarMutableCopy = m0VarMutableCopy.mutableCopy();
            }
            m0VarMutableCopy.mergeFrom(m0Var);
        }
        return m0VarMutableCopy;
    }

    @Override // com.google.protobuf.n0
    public Map<?, ?> forMapData(Object obj) {
        return (m0) obj;
    }

    @Override // com.google.protobuf.n0
    public l0.b<?, ?> forMapMetadata(Object obj) {
        return ((l0) obj).getMetadata();
    }

    @Override // com.google.protobuf.n0
    public Map<?, ?> forMutableMapData(Object obj) {
        return (m0) obj;
    }

    @Override // com.google.protobuf.n0
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return getSerializedSizeLite(i10, obj, obj2);
    }

    @Override // com.google.protobuf.n0
    public boolean isImmutable(Object obj) {
        return !((m0) obj).isMutable();
    }

    @Override // com.google.protobuf.n0
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    @Override // com.google.protobuf.n0
    public Object newMapField(Object obj) {
        return m0.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.n0
    public Object toImmutable(Object obj) {
        ((m0) obj).makeImmutable();
        return obj;
    }
}
