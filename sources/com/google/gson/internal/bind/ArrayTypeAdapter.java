package com.google.gson.internal.bind;

import g4.f;
import g4.s;
import g4.t;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ArrayTypeAdapter<E> extends s<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f12344c = new t() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // g4.t
        public <T> s<T> a(f fVar, l4.a<T> aVar) {
            Type typeE = aVar.e();
            if (!(typeE instanceof GenericArrayType) && (!(typeE instanceof Class) || !((Class) typeE).isArray())) {
                return null;
            }
            Type typeG = i4.b.g(typeE);
            return new ArrayTypeAdapter(fVar, fVar.l(l4.a.b(typeG)), i4.b.k(typeG));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<E> f12345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s<E> f12346b;

    public ArrayTypeAdapter(f fVar, s<E> sVar, Class<E> cls) {
        this.f12346b = new c(fVar, sVar, cls);
        this.f12345a = cls;
    }

    @Override // g4.s
    public Object b(m4.a aVar) throws IOException {
        if (aVar.L() == m4.b.NULL) {
            aVar.H();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.p()) {
            arrayList.add(this.f12346b.b(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f12345a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // g4.s
    public void d(m4.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.u();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f12346b.d(cVar, (E) Array.get(obj, i10));
        }
        cVar.k();
    }
}
