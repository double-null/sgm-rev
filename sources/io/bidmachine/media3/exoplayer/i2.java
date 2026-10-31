package io.bidmachine.media3.exoplayer;

/* JADX INFO: compiled from: RendererCapabilities.java */
/* JADX INFO: loaded from: classes4.dex */
public interface i2 {

    /* JADX INFO: compiled from: RendererCapabilities.java */
    public interface a {
        void a(h2 h2Var);
    }

    static int B(int i10) {
        return i10 & 3584;
    }

    static int F(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    static int H(int i10) {
        return i10 & 64;
    }

    static int S(int i10) {
        return i10 & 7;
    }

    static int o(int i10) {
        return i10 & 384;
    }

    static boolean p(int i10, boolean z10) {
        int iS = S(i10);
        return iS == 4 || (z10 && iS == 3);
    }

    static int r(int i10, int i11, int i12, int i13, int i14) {
        return F(i10, i11, i12, i13, i14, 0);
    }

    static int s(int i10, int i11, int i12, int i13) {
        return F(i10, i11, i12, 0, 128, i13);
    }

    static int t(int i10) {
        return i10 & 32;
    }

    static int u(int i10) {
        return i10 & 24;
    }

    static int v(int i10) {
        return s(i10, 0, 0, 0);
    }

    int N() throws ExoPlaybackException;

    int a(u7.q qVar) throws ExoPlaybackException;

    int g();

    String getName();

    default void m() {
    }

    default void l(a aVar) {
    }
}
