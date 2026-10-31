package com.explorestack.protobuf;

import com.explorestack.protobuf.e0.c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchema.java */
/* JADX INFO: loaded from: classes.dex */
abstract class z<T extends e0.c<T>> {
    z() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(y yVar, MessageLite messageLite, int i10);

    abstract e0<T> c(Object obj);

    abstract e0<T> d(Object obj);

    abstract boolean e(MessageLite messageLite);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(y1 y1Var, Object obj, y yVar, e0<T> e0Var, UB ub2, t2<UT, UB> t2Var) throws IOException;

    abstract void h(y1 y1Var, Object obj, y yVar, e0<T> e0Var) throws IOException;

    abstract void i(ByteString byteString, Object obj, y yVar, e0<T> e0Var) throws IOException;

    abstract void j(e3 e3Var, Map.Entry<?, ?> entry) throws IOException;
}
