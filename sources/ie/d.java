package ie;

import fe.m;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface d {

    /* JADX INFO: compiled from: Encoding.kt */
    public static final class a {
        public static boolean a(d dVar, he.f descriptor, int i10) {
            t.f(descriptor, "descriptor");
            return true;
        }
    }

    void A(he.f fVar, int i10, String str);

    <T> void E(he.f fVar, int i10, m<? super T> mVar, T t10);

    void F(he.f fVar, int i10, char c10);

    void c(he.f fVar);

    void e(he.f fVar, int i10, float f10);

    void h(he.f fVar, int i10, int i11);

    void i(he.f fVar, int i10, byte b10);

    void j(he.f fVar, int i10, boolean z10);

    void k(he.f fVar, int i10, double d10);

    <T> void o(he.f fVar, int i10, m<? super T> mVar, T t10);

    void p(he.f fVar, int i10, long j10);

    void s(he.f fVar, int i10, short s10);

    f t(he.f fVar, int i10);

    boolean w(he.f fVar, int i10);
}
