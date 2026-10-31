package com.google.gson.internal.bind;

import g4.f;
import g4.s;
import g4.t;
import i4.h;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i4.c f12347a;

    private static final class a<E> extends s<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s<E> f12348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h<? extends Collection<E>> f12349b;

        public a(f fVar, Type type, s<E> sVar, h<? extends Collection<E>> hVar) {
            this.f12348a = new c(fVar, sVar, type);
            this.f12349b = hVar;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            Collection<E> collectionA = this.f12349b.a();
            aVar.b();
            while (aVar.p()) {
                collectionA.add(this.f12348a.b(aVar));
            }
            aVar.k();
            return collectionA;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.u();
                return;
            }
            cVar.e();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f12348a.d(cVar, it.next());
            }
            cVar.k();
        }
    }

    public CollectionTypeAdapterFactory(i4.c cVar) {
        this.f12347a = cVar;
    }

    @Override // g4.t
    public <T> s<T> a(f fVar, l4.a<T> aVar) {
        Type typeE = aVar.e();
        Class<? super T> clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = i4.b.h(typeE, clsC);
        return new a(fVar, typeH, fVar.l(l4.a.b(typeH)), this.f12347a.a(aVar));
    }
}
