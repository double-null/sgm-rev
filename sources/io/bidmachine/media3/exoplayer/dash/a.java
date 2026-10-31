package io.bidmachine.media3.exoplayer.dash;

import c8.b2;
import java.util.List;
import o8.i;
import q8.q;
import r8.k;
import s9.r;
import z7.o;

/* JADX INFO: compiled from: DashChunkSource.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a extends i {
    void g(q qVar);

    void i(f8.c cVar, int i10);

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.dash.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DashChunkSource.java */
    public interface InterfaceC0322a {
        a e(k kVar, f8.c cVar, e8.b bVar, int i10, int[] iArr, q qVar, int i11, long j10, boolean z10, List<u7.q> list, f.c cVar2, o oVar, b2 b2Var, r8.e eVar);

        default InterfaceC0322a a(r.a aVar) {
            return this;
        }

        default InterfaceC0322a b(int i10) {
            return this;
        }

        default InterfaceC0322a c(boolean z10) {
            return this;
        }

        default u7.q d(u7.q qVar) {
            return qVar;
        }
    }
}
