package p9;

/* JADX INFO: compiled from: Track.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u7.q f23674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f23676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long[] f23677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f23678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u[] f23679l;

    public t(int i10, int i11, long j10, long j11, long j12, long j13, u7.q qVar, int i12, u[] uVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f23668a = i10;
        this.f23669b = i11;
        this.f23670c = j10;
        this.f23671d = j11;
        this.f23672e = j12;
        this.f23673f = j13;
        this.f23674g = qVar;
        this.f23675h = i12;
        this.f23679l = uVarArr;
        this.f23678k = i13;
        this.f23676i = jArr;
        this.f23677j = jArr2;
    }

    public t a(u7.q qVar) {
        return new t(this.f23668a, this.f23669b, this.f23670c, this.f23671d, this.f23672e, this.f23673f, qVar, this.f23675h, this.f23679l, this.f23678k, this.f23676i, this.f23677j);
    }

    public u b(int i10) {
        u[] uVarArr = this.f23679l;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i10];
    }
}
