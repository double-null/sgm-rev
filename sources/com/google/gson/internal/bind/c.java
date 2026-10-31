package com.google.gson.internal.bind;

import g4.f;
import g4.s;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
final class c<T> extends s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f12454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s<T> f12455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f12456c;

    c(f fVar, s<T> sVar, Type type) {
        this.f12454a = fVar;
        this.f12455b = sVar;
        this.f12456c = type;
    }

    private Type e(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    @Override // g4.s
    public T b(m4.a aVar) throws IOException {
        return this.f12455b.b(aVar);
    }

    @Override // g4.s
    public void d(m4.c cVar, T t10) throws IOException {
        s<T> sVarL = this.f12455b;
        Type typeE = e(this.f12456c, t10);
        if (typeE != this.f12456c) {
            sVarL = this.f12454a.l(l4.a.b(typeE));
            if (sVarL instanceof ReflectiveTypeAdapterFactory.b) {
                s<T> sVar = this.f12455b;
                if (!(sVar instanceof ReflectiveTypeAdapterFactory.b)) {
                    sVarL = sVar;
                }
            }
        }
        sVarL.d(cVar, t10);
    }
}
