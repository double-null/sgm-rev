package com.explorestack.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Schema.java */
/* JADX INFO: loaded from: classes.dex */
interface b2<T> {
    void a(T t10, y1 y1Var, y yVar) throws IOException;

    void b(T t10, byte[] bArr, int i10, int i11, g.b bVar) throws IOException;

    void c(T t10, e3 e3Var) throws IOException;

    boolean equals(T t10, T t11);

    int getSerializedSize(T t10);

    int hashCode(T t10);

    boolean isInitialized(T t10);

    void makeImmutable(T t10);

    void mergeFrom(T t10, T t11);

    T newInstance();
}
