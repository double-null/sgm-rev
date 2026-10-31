package s9;

import java.util.List;

/* JADX INFO: compiled from: SubtitleOutputBuffer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends a8.e implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f25340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25341f;

    @Override // s9.k
    public int a(long j10) {
        return ((k) x7.a.e(this.f25340e)).a(j10 - this.f25341f);
    }

    @Override // s9.k
    public List<w7.a> b(long j10) {
        return ((k) x7.a.e(this.f25340e)).b(j10 - this.f25341f);
    }

    @Override // s9.k
    public long c(int i10) {
        return ((k) x7.a.e(this.f25340e)).c(i10) + this.f25341f;
    }

    @Override // s9.k
    public int d() {
        return ((k) x7.a.e(this.f25340e)).d();
    }

    @Override // a8.e, a8.a
    public void g() {
        super.g();
        this.f25340e = null;
    }

    public void q(long j10, k kVar, long j11) {
        this.f147b = j10;
        this.f25340e = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f25341f = j10;
    }
}
