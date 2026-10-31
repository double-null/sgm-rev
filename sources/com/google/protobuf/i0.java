package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ListFieldSchema.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class i0 {
    private static final i0 FULL_INSTANCE;
    private static final i0 LITE_INSTANCE;

    /* JADX INFO: compiled from: ListFieldSchema.java */
    private static final class b extends i0 {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> getList(Object obj, long j10) {
            return (List) v1.getObject(obj, j10);
        }

        @Override // com.google.protobuf.i0
        void makeImmutableListAt(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) v1.getObject(obj, j10);
            if (list instanceof h0) {
                objUnmodifiableList = ((h0) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof d1) && (list instanceof a0.i)) {
                    a0.i iVar = (a0.i) list;
                    if (iVar.isModifiable()) {
                        iVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            v1.putObject(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.protobuf.i0
        <E> void mergeListsAt(Object obj, Object obj2, long j10) {
            List list = getList(obj2, j10);
            List listMutableListAt = mutableListAt(obj, j10, list.size());
            int size = listMutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(list);
            }
            if (size > 0) {
                list = listMutableListAt;
            }
            v1.putObject(obj, j10, list);
        }

        @Override // com.google.protobuf.i0
        <L> List<L> mutableListAt(Object obj, long j10) {
            return mutableListAt(obj, j10, 10);
        }

        private static <L> List<L> mutableListAt(Object obj, long j10, int i10) {
            Object obj2;
            List<L> listMutableCopyWithCapacity2;
            List<L> list = getList(obj, j10);
            if (list.isEmpty()) {
                if (list instanceof h0) {
                    listMutableCopyWithCapacity2 = new g0(i10);
                } else {
                    listMutableCopyWithCapacity2 = ((list instanceof d1) && (list instanceof a0.i)) ? ((a0.i) list).mutableCopyWithCapacity2(i10) : new ArrayList<>(i10);
                }
                v1.putObject(obj, j10, listMutableCopyWithCapacity2);
                return listMutableCopyWithCapacity2;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i10);
                arrayList.addAll(list);
                v1.putObject(obj, j10, arrayList);
                obj2 = arrayList;
            } else {
                if (!(list instanceof u1)) {
                    if (!(list instanceof d1) || !(list instanceof a0.i)) {
                        return list;
                    }
                    a0.i iVar = (a0.i) list;
                    if (iVar.isModifiable()) {
                        return list;
                    }
                    a0.i iVarMutableCopyWithCapacity2 = iVar.mutableCopyWithCapacity2(list.size() + i10);
                    v1.putObject(obj, j10, iVarMutableCopyWithCapacity2);
                    return iVarMutableCopyWithCapacity2;
                }
                g0 g0Var = new g0(list.size() + i10);
                g0Var.addAll((u1) list);
                v1.putObject(obj, j10, g0Var);
                obj2 = g0Var;
            }
            return (List<L>) obj2;
        }
    }

    /* JADX INFO: compiled from: ListFieldSchema.java */
    private static final class c extends i0 {
        private c() {
            super();
        }

        static <E> a0.i<E> getProtobufList(Object obj, long j10) {
            return (a0.i) v1.getObject(obj, j10);
        }

        @Override // com.google.protobuf.i0
        void makeImmutableListAt(Object obj, long j10) {
            getProtobufList(obj, j10).makeImmutable();
        }

        @Override // com.google.protobuf.i0
        <E> void mergeListsAt(Object obj, Object obj2, long j10) {
            a0.i protobufList = getProtobufList(obj, j10);
            a0.i protobufList2 = getProtobufList(obj2, j10);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            v1.putObject(obj, j10, protobufList2);
        }

        @Override // com.google.protobuf.i0
        <L> List<L> mutableListAt(Object obj, long j10) {
            a0.i protobufList = getProtobufList(obj, j10);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            a0.i iVarMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            v1.putObject(obj, j10, iVarMutableCopyWithCapacity2);
            return iVarMutableCopyWithCapacity2;
        }
    }

    static {
        FULL_INSTANCE = new b();
        LITE_INSTANCE = new c();
    }

    private i0() {
    }

    static i0 full() {
        return FULL_INSTANCE;
    }

    static i0 lite() {
        return LITE_INSTANCE;
    }

    abstract void makeImmutableListAt(Object obj, long j10);

    abstract <L> void mergeListsAt(Object obj, Object obj2, long j10);

    abstract <L> List<L> mutableListAt(Object obj, long j10);
}
