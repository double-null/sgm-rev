package o8;

import u7.q;

/* JADX INFO: compiled from: BaseMediaChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f23138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f23139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f23140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f23141n;

    public a(z7.d dVar, z7.g gVar, q qVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(dVar, gVar, qVar, i10, obj, j10, j11, j14);
        this.f23138k = j12;
        this.f23139l = j13;
    }

    public final int h(int i10) {
        return ((int[]) x7.a.i(this.f23141n))[i10];
    }

    protected final c i() {
        return (c) x7.a.i(this.f23140m);
    }

    public void j(c cVar) {
        this.f23140m = cVar;
        this.f23141n = cVar.a();
    }
}
