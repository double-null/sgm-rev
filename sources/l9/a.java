package l9;

import x7.a0;

/* JADX INFO: compiled from: PrivateCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f21877c;

    private a(long j10, byte[] bArr, long j11) {
        this.f21875a = j11;
        this.f21876b = j10;
        this.f21877c = bArr;
    }

    static a d(a0 a0Var, int i10, long j10) {
        long J = a0Var.J();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        return new a(J, bArr, j10);
    }

    @Override // l9.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f21875a + ", identifier= " + this.f21876b + " }";
    }
}
