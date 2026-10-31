package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x2.m;
import x2.o;

/* JADX INFO: compiled from: CycleDetector.java */
/* JADX INFO: loaded from: classes4.dex */
class c {

    /* JADX INFO: compiled from: CycleDetector.java */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x2.c<?> f11939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<b> f11940b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<b> f11941c = new HashSet();

        b(x2.c<?> cVar) {
            this.f11939a = cVar;
        }

        void a(b bVar) {
            this.f11940b.add(bVar);
        }

        void b(b bVar) {
            this.f11941c.add(bVar);
        }

        x2.c<?> c() {
            return this.f11939a;
        }

        Set<b> d() {
            return this.f11940b;
        }

        boolean e() {
            return this.f11940b.isEmpty();
        }

        boolean f() {
            return this.f11941c.isEmpty();
        }

        void g(b bVar) {
            this.f11941c.remove(bVar);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.components.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CycleDetector.java */
    private static class C0149c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o<?> f11942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f11943b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C0149c)) {
                return false;
            }
            C0149c c0149c = (C0149c) obj;
            return c0149c.f11942a.equals(this.f11942a) && c0149c.f11943b == this.f11943b;
        }

        public int hashCode() {
            return ((this.f11942a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f11943b).hashCode();
        }

        private C0149c(o<?> oVar, boolean z10) {
            this.f11942a = oVar;
            this.f11943b = z10;
        }
    }

    static void a(List<x2.c<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<x2.c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<x2.c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (m mVar : bVar.c().g()) {
                            if (mVar.e() && (set = (Set) map.get(new C0149c(mVar.c(), mVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            x2.c<?> next = it.next();
            b bVar3 = new b(next);
            for (o<? super Object> oVar : next.j()) {
                C0149c c0149c = new C0149c(oVar, !next.p());
                if (!map.containsKey(c0149c)) {
                    map.put(c0149c, new HashSet());
                }
                Set set2 = (Set) map.get(c0149c);
                if (!set2.isEmpty() && !c0149c.f11943b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", oVar));
                }
                set2.add(bVar3);
            }
        }
    }
}
