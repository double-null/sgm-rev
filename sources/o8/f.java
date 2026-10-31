package o8;

import c8.b2;
import java.io.IOException;
import java.util.List;
import s9.r;
import v8.o0;
import v8.q;

/* JADX INFO: compiled from: ChunkExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public interface f {

    /* JADX INFO: compiled from: ChunkExtractor.java */
    public interface b {
        o0 e(int i10, int i11);
    }

    boolean a(q qVar) throws IOException;

    v8.g b();

    u7.q[] c();

    void d(b bVar, long j10, long j11);

    void release();

    /* JADX INFO: compiled from: ChunkExtractor.java */
    public interface a {
        f e(int i10, u7.q qVar, boolean z10, List<u7.q> list, o0 o0Var, b2 b2Var);

        default a a(r.a aVar) {
            return this;
        }

        default a b(int i10) {
            return this;
        }

        default a c(boolean z10) {
            return this;
        }

        default u7.q d(u7.q qVar) {
            return qVar;
        }
    }
}
