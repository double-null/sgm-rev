package ie;

import fe.m;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface f {
    d B(he.f fVar, int i10);

    void D(int i10);

    void G(String str);

    le.c a();

    d b(he.f fVar);

    void f(double d10);

    void g(byte b10);

    void l(he.f fVar, int i10);

    void m(long j10);

    f n(he.f fVar);

    <T> void q(m<? super T> mVar, T t10);

    void r();

    void u(short s10);

    void v(boolean z10);

    void x(float f10);

    void y(char c10);

    void z();

    /* JADX INFO: compiled from: Encoding.kt */
    public static final class a {
        public static d a(f fVar, he.f descriptor, int i10) {
            t.f(descriptor, "descriptor");
            return fVar.b(descriptor);
        }

        public static <T> void c(f fVar, m<? super T> serializer, T t10) {
            t.f(serializer, "serializer");
            if (serializer.getDescriptor().b()) {
                fVar.q(serializer, t10);
            } else if (t10 == null) {
                fVar.r();
            } else {
                fVar.z();
                fVar.q(serializer, t10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void d(f fVar, m<? super T> serializer, T t10) {
            t.f(serializer, "serializer");
            serializer.serialize(fVar, t10);
        }

        public static void b(f fVar) {
        }
    }
}
