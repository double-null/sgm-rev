package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ListFieldSchema.java */
/* JADX INFO: loaded from: classes.dex */
abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s0 f10795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s0 f10796b;

    /* JADX INFO: compiled from: ListFieldSchema.java */
    private static final class b extends s0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?> f10797c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) z2.G(obj, j10);
        }

        private static <L> List<L> g(Object obj, long j10, int i10) {
            Object obj2;
            List<L> listMutableCopyWithCapacity2;
            List<L> listF = f(obj, j10);
            if (listF.isEmpty()) {
                if (listF instanceof r0) {
                    listMutableCopyWithCapacity2 = new q0(i10);
                } else {
                    listMutableCopyWithCapacity2 = ((listF instanceof t1) && (listF instanceof l0.j)) ? ((l0.j) listF).mutableCopyWithCapacity2(i10) : new ArrayList<>(i10);
                }
                z2.X(obj, j10, listMutableCopyWithCapacity2);
                return listMutableCopyWithCapacity2;
            }
            if (f10797c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i10);
                arrayList.addAll(listF);
                z2.X(obj, j10, arrayList);
                obj2 = arrayList;
            } else {
                if (!(listF instanceof y2)) {
                    if (!(listF instanceof t1) || !(listF instanceof l0.j)) {
                        return listF;
                    }
                    l0.j jVar = (l0.j) listF;
                    if (jVar.isModifiable()) {
                        return listF;
                    }
                    l0.j jVarMutableCopyWithCapacity2 = jVar.mutableCopyWithCapacity2(listF.size() + i10);
                    z2.X(obj, j10, jVarMutableCopyWithCapacity2);
                    return jVarMutableCopyWithCapacity2;
                }
                q0 q0Var = new q0(listF.size() + i10);
                q0Var.addAll((y2) listF);
                z2.X(obj, j10, q0Var);
                obj2 = q0Var;
            }
            return (List<L>) obj2;
        }

        @Override // com.explorestack.protobuf.s0
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) z2.G(obj, j10);
            if (list instanceof r0) {
                objUnmodifiableList = ((r0) list).getUnmodifiableView();
            } else {
                if (f10797c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof t1) && (list instanceof l0.j)) {
                    l0.j jVar = (l0.j) list;
                    if (jVar.isModifiable()) {
                        jVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            z2.X(obj, j10, objUnmodifiableList);
        }

        @Override // com.explorestack.protobuf.s0
        <E> void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            z2.X(obj, j10, listF);
        }

        @Override // com.explorestack.protobuf.s0
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* JADX INFO: compiled from: ListFieldSchema.java */
    private static final class c extends s0 {
        private c() {
            super();
        }

        static <E> l0.j<E> f(Object obj, long j10) {
            return (l0.j) z2.G(obj, j10);
        }

        @Override // com.explorestack.protobuf.s0
        void c(Object obj, long j10) {
            f(obj, j10).makeImmutable();
        }

        @Override // com.explorestack.protobuf.s0
        <E> void d(Object obj, Object obj2, long j10) {
            l0.j jVarF = f(obj, j10);
            l0.j jVarF2 = f(obj2, j10);
            int size = jVarF.size();
            int size2 = jVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!jVarF.isModifiable()) {
                    jVarF = jVarF.mutableCopyWithCapacity2(size2 + size);
                }
                jVarF.addAll(jVarF2);
            }
            if (size > 0) {
                jVarF2 = jVarF;
            }
            z2.X(obj, j10, jVarF2);
        }

        @Override // com.explorestack.protobuf.s0
        <L> List<L> e(Object obj, long j10) {
            l0.j jVarF = f(obj, j10);
            if (jVarF.isModifiable()) {
                return jVarF;
            }
            int size = jVarF.size();
            l0.j jVarMutableCopyWithCapacity2 = jVarF.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            z2.X(obj, j10, jVarMutableCopyWithCapacity2);
            return jVarMutableCopyWithCapacity2;
        }
    }

    static {
        f10795a = new b();
        f10796b = new c();
    }

    private s0() {
    }

    static s0 a() {
        return f10795a;
    }

    static s0 b() {
        return f10796b;
    }

    abstract void c(Object obj, long j10);

    abstract <L> void d(Object obj, Object obj2, long j10);

    abstract <L> List<L> e(Object obj, long j10);
}
