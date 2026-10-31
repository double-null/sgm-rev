package com.explorestack.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes.dex */
abstract class t2<T, B> {
    t2() {
    }

    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    abstract void d(B b10, int i10, ByteString byteString);

    abstract void e(B b10, int i10, long j10);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t10);

    abstract int i(T t10);

    abstract void j(Object obj);

    abstract T k(T t10, T t11);

    final void l(B b10, y1 y1Var) throws IOException {
        while (y1Var.getFieldNumber() != Integer.MAX_VALUE && m(b10, y1Var)) {
        }
    }

    final boolean m(B b10, y1 y1Var) throws IOException {
        int tag = y1Var.getTag();
        int iA = c3.a(tag);
        int iB = c3.b(tag);
        if (iB == 0) {
            e(b10, iA, y1Var.readInt64());
            return true;
        }
        if (iB == 1) {
            b(b10, iA, y1Var.readFixed64());
            return true;
        }
        if (iB == 2) {
            d(b10, iA, y1Var.readBytes());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            a(b10, iA, y1Var.readFixed32());
            return true;
        }
        B bN = n();
        int iC = c3.c(iA, 4);
        l(bN, y1Var);
        if (iC != y1Var.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c(b10, iA, r(bN));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b10);

    abstract void p(Object obj, T t10);

    abstract boolean q(y1 y1Var);

    abstract T r(B b10);

    abstract void s(T t10, e3 e3Var) throws IOException;

    abstract void t(T t10, e3 e3Var) throws IOException;
}
