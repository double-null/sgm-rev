package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import g4.f;
import g4.l;
import g4.o;
import g4.s;
import g4.t;
import i4.e;
import i4.h;
import i4.k;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i4.c f12353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f12354b;

    private final class a<K, V> extends s<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s<K> f12355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s<V> f12356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h<? extends Map<K, V>> f12357c;

        public a(f fVar, Type type, s<K> sVar, Type type2, s<V> sVar2, h<? extends Map<K, V>> hVar) {
            this.f12355a = new c(fVar, sVar, type);
            this.f12356b = new c(fVar, sVar2, type2);
            this.f12357c = hVar;
        }

        private String e(l lVar) {
            if (!lVar.h()) {
                if (lVar.f()) {
                    return "null";
                }
                throw new AssertionError();
            }
            o oVarD = lVar.d();
            if (oVarD.s()) {
                return String.valueOf(oVarD.o());
            }
            if (oVarD.q()) {
                return Boolean.toString(oVarD.i());
            }
            if (oVarD.t()) {
                return oVarD.p();
            }
            throw new AssertionError();
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(m4.a aVar) throws IOException {
            m4.b bVarL = aVar.L();
            if (bVarL == m4.b.NULL) {
                aVar.H();
                return null;
            }
            Map<K, V> mapA = this.f12357c.a();
            if (bVarL == m4.b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.p()) {
                    aVar.b();
                    K kB = this.f12355a.b(aVar);
                    if (mapA.put(kB, this.f12356b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + kB);
                    }
                    aVar.k();
                }
                aVar.k();
            } else {
                aVar.c();
                while (aVar.p()) {
                    e.f15953a.a(aVar);
                    K kB2 = this.f12355a.b(aVar);
                    if (mapA.put(kB2, this.f12356b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + kB2);
                    }
                }
                aVar.n();
            }
            return mapA;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.u();
                return;
            }
            if (!MapTypeAdapterFactory.this.f12354b) {
                cVar.f();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.s(String.valueOf(entry.getKey()));
                    this.f12356b.d(cVar, entry.getValue());
                }
                cVar.n();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                l lVarC = this.f12355a.c(entry2.getKey());
                arrayList.add(lVarC);
                arrayList2.add(entry2.getValue());
                z10 |= lVarC.e() || lVarC.g();
            }
            if (!z10) {
                cVar.f();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.s(e((l) arrayList.get(i10)));
                    this.f12356b.d(cVar, (V) arrayList2.get(i10));
                    i10++;
                }
                cVar.n();
                return;
            }
            cVar.e();
            int size2 = arrayList.size();
            while (i10 < size2) {
                cVar.e();
                k.b((l) arrayList.get(i10), cVar);
                this.f12356b.d(cVar, (V) arrayList2.get(i10));
                cVar.k();
                i10++;
            }
            cVar.k();
        }
    }

    public MapTypeAdapterFactory(i4.c cVar, boolean z10) {
        this.f12353a = cVar;
        this.f12354b = z10;
    }

    private s<?> b(f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f12401f : fVar.l(l4.a.b(type));
    }

    @Override // g4.t
    public <T> s<T> a(f fVar, l4.a<T> aVar) {
        Type typeE = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] typeArrJ = i4.b.j(typeE, i4.b.k(typeE));
        return new a(fVar, typeArrJ[0], b(fVar, typeArrJ[0]), typeArrJ[1], fVar.l(l4.a.b(typeArrJ[1])), this.f12353a.a(aVar));
    }
}
