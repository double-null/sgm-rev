package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes.dex */
abstract class k1<T, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f2214a = 100;

    k1() {
    }

    private final void l(B b10, d1 d1Var, int i10) throws IOException {
        while (d1Var.getFieldNumber() != Integer.MAX_VALUE && m(b10, d1Var, i10)) {
        }
    }

    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    abstract void d(B b10, int i10, g gVar);

    abstract void e(B b10, int i10, long j10);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t10);

    abstract int i(T t10);

    abstract void j(Object obj);

    abstract T k(T t10, T t11);

    final boolean m(B b10, d1 d1Var, int i10) throws IOException {
        int tag = d1Var.getTag();
        int iA = p1.a(tag);
        int iB = p1.b(tag);
        if (iB == 0) {
            e(b10, iA, d1Var.readInt64());
            return true;
        }
        if (iB == 1) {
            b(b10, iA, d1Var.readFixed64());
            return true;
        }
        if (iB == 2) {
            d(b10, iA, d1Var.readBytes());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.g();
            }
            a(b10, iA, d1Var.readFixed32());
            return true;
        }
        B bN = n();
        int iC = p1.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f2214a) {
            throw InvalidProtocolBufferException.o();
        }
        l(bN, d1Var, i11);
        if (iC != d1Var.getTag()) {
            throw InvalidProtocolBufferException.c();
        }
        c(b10, iA, r(bN));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b10);

    abstract void p(Object obj, T t10);

    abstract boolean q(d1 d1Var);

    abstract T r(B b10);

    abstract void s(T t10, q1 q1Var) throws IOException;

    abstract void t(T t10, q1 q1Var) throws IOException;
}
