package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Schema.java */
/* JADX INFO: loaded from: classes.dex */
interface e1<T> {
    void a(T t10, d1 d1Var, n nVar) throws IOException;

    void b(T t10, q1 q1Var) throws IOException;

    boolean equals(T t10, T t11);

    int getSerializedSize(T t10);

    int hashCode(T t10);

    boolean isInitialized(T t10);

    void makeImmutable(T t10);

    void mergeFrom(T t10, T t11);

    T newInstance();
}
