package io.bidmachine.media3.exoplayer;

import java.io.IOException;

/* JADX INFO: compiled from: Renderer.java */
/* JADX INFO: loaded from: classes4.dex */
public interface h2 extends f2.b {

    /* JADX INFO: compiled from: Renderer.java */
    public interface a {
        void a();

        void b();
    }

    void A() throws IOException;

    boolean D();

    default long G(long j10, long j11) {
        return 10000L;
    }

    void I(u7.d0 d0Var);

    i2 J();

    void O(u7.q[] qVarArr, n8.s sVar, long j10, long j11, io.bidmachine.media3.exoplayer.source.r.b bVar) throws ExoPlaybackException;

    long P();

    void Q(long j10) throws ExoPlaybackException;

    b8.w R();

    boolean b();

    void d();

    int g();

    String getName();

    boolean h();

    void i(long j10, long j11) throws ExoPlaybackException;

    n8.s j();

    int k();

    boolean n();

    void q();

    void reset();

    void start() throws ExoPlaybackException;

    void stop();

    void x(int i10, c8.b2 b2Var, x7.h hVar);

    void y(b8.y yVar, u7.q[] qVarArr, n8.s sVar, long j10, boolean z10, boolean z11, long j11, long j12, io.bidmachine.media3.exoplayer.source.r.b bVar) throws ExoPlaybackException;

    default void f() {
    }

    default void release() {
    }

    default void L(float f10, float f11) throws ExoPlaybackException {
    }
}
