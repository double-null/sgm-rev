package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: MapEntryLite.java */
/* JADX INFO: loaded from: classes.dex */
public class i0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<K, V> f2194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f2195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f2196c;

    /* JADX INFO: compiled from: MapEntryLite.java */
    static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p1.b f2197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f2198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p1.b f2199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f2200d;

        public a(p1.b bVar, K k10, p1.b bVar2, V v10) {
            this.f2197a = bVar;
            this.f2198b = k10;
            this.f2199c = bVar2;
            this.f2200d = v10;
        }
    }

    private i0(p1.b bVar, K k10, p1.b bVar2, V v10) {
        this.f2194a = new a<>(bVar, k10, bVar2, v10);
        this.f2195b = k10;
        this.f2196c = v10;
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return s.d(aVar.f2197a, 1, k10) + s.d(aVar.f2199c, 2, v10);
    }

    public static <K, V> i0<K, V> d(p1.b bVar, K k10, p1.b bVar2, V v10) {
        return new i0<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        s.A(codedOutputStream, aVar.f2197a, 1, k10);
        s.A(codedOutputStream, aVar.f2199c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.U(i10) + CodedOutputStream.C(b(this.f2194a, k10, v10));
    }

    a<K, V> c() {
        return this.f2194a;
    }
}
