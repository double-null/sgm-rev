package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes4.dex */
final class f1 {
    private static final f1 INSTANCE = new f1();
    private final ConcurrentMap<Class<?>, l1<?>> schemaCache = new ConcurrentHashMap();
    private final m1 schemaFactory = new k0();

    private f1() {
    }

    public static f1 getInstance() {
        return INSTANCE;
    }

    int getTotalSchemaSize() {
        int schemaSize = 0;
        for (l1<?> l1Var : this.schemaCache.values()) {
            if (l1Var instanceof v0) {
                schemaSize += ((v0) l1Var).getSchemaSize();
            }
        }
        return schemaSize;
    }

    <T> boolean isInitialized(T t10) {
        return schemaFor(t10).isInitialized(t10);
    }

    public <T> void makeImmutable(T t10) {
        schemaFor(t10).makeImmutable(t10);
    }

    public <T> void mergeFrom(T t10, j1 j1Var) throws IOException {
        mergeFrom(t10, j1Var, p.getEmptyRegistry());
    }

    public l1<?> registerSchema(Class<?> cls, l1<?> l1Var) {
        a0.checkNotNull(cls, "messageType");
        a0.checkNotNull(l1Var, "schema");
        return this.schemaCache.putIfAbsent(cls, l1Var);
    }

    public l1<?> registerSchemaOverride(Class<?> cls, l1<?> l1Var) {
        a0.checkNotNull(cls, "messageType");
        a0.checkNotNull(l1Var, "schema");
        return this.schemaCache.put(cls, l1Var);
    }

    public <T> l1<T> schemaFor(Class<T> cls) {
        a0.checkNotNull(cls, "messageType");
        l1<T> l1Var = (l1) this.schemaCache.get(cls);
        if (l1Var != null) {
            return l1Var;
        }
        l1<T> l1VarCreateSchema = this.schemaFactory.createSchema(cls);
        l1<T> l1Var2 = (l1<T>) registerSchema(cls, l1VarCreateSchema);
        return l1Var2 != null ? l1Var2 : l1VarCreateSchema;
    }

    public <T> void writeTo(T t10, y1 y1Var) throws IOException {
        schemaFor(t10).writeTo(t10, y1Var);
    }

    public <T> void mergeFrom(T t10, j1 j1Var, p pVar) throws IOException {
        schemaFor(t10).mergeFrom(t10, j1Var, pVar);
    }

    public <T> l1<T> schemaFor(T t10) {
        return schemaFor((Class) t10.getClass());
    }
}
