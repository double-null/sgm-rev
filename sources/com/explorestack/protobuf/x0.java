package com.explorestack.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: compiled from: MapEntryLite.java */
/* JADX INFO: loaded from: classes.dex */
public class x0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<K, V> f10862a;

    /* JADX INFO: compiled from: MapEntryLite.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10863a;

        static {
            int[] iArr = new int[c3.b.values().length];
            f10863a = iArr;
            try {
                iArr[c3.b.f10264m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10863a[c3.b.f10267p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10863a[c3.b.f10263l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: MapEntryLite.java */
    static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c3.b f10864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f10865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c3.b f10866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f10867d;

        public b(c3.b bVar, K k10, c3.b bVar2, V v10) {
            this.f10864a = bVar;
            this.f10865b = k10;
            this.f10866c = bVar2;
            this.f10867d = v10;
        }
    }

    static <K, V> int b(b<K, V> bVar, K k10, V v10) {
        return e0.n(bVar.f10864a, 1, k10) + e0.n(bVar.f10866c, 2, v10);
    }

    static <K, V> Map.Entry<K, V> d(n nVar, b<K, V> bVar, y yVar) throws IOException {
        Object objE = bVar.f10865b;
        Object objE2 = bVar.f10867d;
        while (true) {
            int iK = nVar.K();
            if (iK == 0) {
                break;
            }
            if (iK == c3.c(1, bVar.f10864a.c())) {
                objE = e(nVar, yVar, bVar.f10864a, objE);
            } else if (iK == c3.c(2, bVar.f10866c.c())) {
                objE2 = e(nVar, yVar, bVar.f10866c, objE2);
            } else if (!nVar.O(iK)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objE, objE2);
    }

    static <T> T e(n nVar, y yVar, c3.b bVar, T t10) throws IOException {
        int i10 = a.f10863a[bVar.ordinal()];
        if (i10 == 1) {
            MessageLite.Builder builder = ((MessageLite) t10).toBuilder();
            nVar.B(builder, yVar);
            return (T) builder.buildPartial();
        }
        if (i10 == 2) {
            return (T) Integer.valueOf(nVar.t());
        }
        if (i10 != 3) {
            return (T) e0.M(nVar, bVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static <K, V> void f(CodedOutputStream codedOutputStream, b<K, V> bVar, K k10, V v10) throws IOException {
        e0.Q(codedOutputStream, bVar.f10864a, 1, k10);
        e0.Q(codedOutputStream, bVar.f10866c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.X(i10) + CodedOutputStream.E(b(this.f10862a, k10, v10));
    }

    b<K, V> c() {
        return this.f10862a;
    }
}
