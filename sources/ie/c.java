package ie;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: compiled from: Decoding.kt */
    public static final class a {
        public static int a(c cVar, he.f descriptor) {
            t.f(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, he.f fVar, int i10, fe.c cVar2, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return cVar.F(fVar, i10, cVar2, obj);
        }
    }

    <T> T D(he.f fVar, int i10, fe.c<? extends T> cVar, T t10);

    byte E(he.f fVar, int i10);

    <T> T F(he.f fVar, int i10, fe.c<? extends T> cVar, T t10);

    le.c a();

    void c(he.f fVar);

    int e(he.f fVar);

    int f(he.f fVar);

    float j(he.f fVar, int i10);

    String l(he.f fVar, int i10);

    e m(he.f fVar, int i10);

    double n(he.f fVar, int i10);

    char o(he.f fVar, int i10);

    boolean p(he.f fVar, int i10);

    boolean q();

    int x(he.f fVar, int i10);

    long y(he.f fVar, int i10);

    short z(he.f fVar, int i10);
}
