package md;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public static final d a(long j10) {
        return new f((int) j10, (int) (j10 >> 32));
    }

    public static final int b(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
