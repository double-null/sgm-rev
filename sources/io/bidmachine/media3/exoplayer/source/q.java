package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.exoplayer.k1;
import java.io.IOException;

/* JADX INFO: compiled from: MediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
public interface q extends g0 {

    /* JADX INFO: compiled from: MediaPeriod.java */
    public interface a extends g0.a<q> {
        void e(q qVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0
    long b();

    @Override // io.bidmachine.media3.exoplayer.source.g0
    boolean c(k1 k1Var);

    long d(long j10, b8.a0 a0Var);

    @Override // io.bidmachine.media3.exoplayer.source.g0
    long f();

    @Override // io.bidmachine.media3.exoplayer.source.g0
    void g(long j10);

    long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10);

    @Override // io.bidmachine.media3.exoplayer.source.g0
    boolean isLoading();

    long j(long j10);

    long k();

    void l(a aVar, long j10);

    void q() throws IOException;

    n8.x t();

    void u(long j10, boolean z10);
}
