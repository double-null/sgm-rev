package v8;

/* JADX INFO: compiled from: SingleSampleSeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27384b;

    public m0(long j10) {
        this(j10, 0L);
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        return new j0.a(new k0(j10, this.f27384b));
    }

    @Override // v8.j0
    public boolean h() {
        return true;
    }

    @Override // v8.j0
    public long k() {
        return this.f27383a;
    }

    public m0(long j10, long j11) {
        this.f27383a = j10;
        this.f27384b = j11;
    }
}
