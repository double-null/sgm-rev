package ie;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface e {

    /* JADX INFO: compiled from: Decoding.kt */
    public static final class a {
        public static <T> T a(e eVar, fe.c<? extends T> deserializer) {
            t.f(deserializer, "deserializer");
            return deserializer.deserialize(eVar);
        }
    }

    String A();

    boolean B();

    <T> T C(fe.c<? extends T> cVar);

    byte G();

    int H(he.f fVar);

    le.c a();

    c b(he.f fVar);

    int h();

    Void i();

    long k();

    e r(he.f fVar);

    short s();

    float t();

    double u();

    boolean v();

    char w();
}
