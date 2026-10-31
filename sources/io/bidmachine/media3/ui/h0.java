package io.bidmachine.media3.ui;

/* JADX INFO: compiled from: TimeBar.java */
/* JADX INFO: loaded from: classes4.dex */
public interface h0 {

    /* JADX INFO: compiled from: TimeBar.java */
    public interface a {
        void J(h0 h0Var, long j10);

        void K(h0 h0Var, long j10);

        void R(h0 h0Var, long j10, boolean z10);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i10);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
