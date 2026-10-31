package v8;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: Extractor.java */
/* JADX INFO: loaded from: classes4.dex */
public interface p {
    void a(long j10, long j11);

    void c(r rVar);

    boolean e(q qVar) throws IOException;

    default List<n0> i() {
        return com.google.common.collect.u.H();
    }

    int l(q qVar, i0 i0Var) throws IOException;

    void release();

    default p f() {
        return this;
    }
}
