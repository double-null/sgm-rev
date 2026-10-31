package com.explorestack.protobuf;

import be.LNO.fzLzfW;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes2.dex */
final class v1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v1 f10831c = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, b2<?>> f10833b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f10832a = new v0();

    private v1() {
    }

    public static v1 a() {
        return f10831c;
    }

    public <T> void b(T t10, y1 y1Var, y yVar) throws IOException {
        e(t10).a(t10, y1Var, yVar);
    }

    public <T> b2<T> d(Class<T> cls) {
        l0.b(cls, "messageType");
        b2<T> b2Var = (b2) this.f10833b.get(cls);
        if (b2Var != null) {
            return b2Var;
        }
        b2<T> b2VarCreateSchema = this.f10832a.createSchema(cls);
        b2<T> b2Var2 = (b2<T>) c(cls, b2VarCreateSchema);
        return b2Var2 != null ? b2Var2 : b2VarCreateSchema;
    }

    public <T> b2<T> e(T t10) {
        return d(t10.getClass());
    }

    public b2<?> c(Class<?> cls, b2<?> b2Var) {
        l0.b(cls, "messageType");
        l0.b(b2Var, fzLzfW.FSb);
        return this.f10833b.putIfAbsent(cls, b2Var);
    }
}
