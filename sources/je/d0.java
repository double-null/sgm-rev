package je;

/* JADX INFO: compiled from: ElementMarker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f20880e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long[] f20881f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.f f20882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.p<he.f, Integer, Boolean> f20883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f20885d;

    /* JADX INFO: compiled from: ElementMarker.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(he.f descriptor, id.p<? super he.f, ? super Integer, Boolean> readIfAbsent) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(readIfAbsent, "readIfAbsent");
        this.f20882a = descriptor;
        this.f20883b = readIfAbsent;
        int iE = descriptor.e();
        if (iE <= 64) {
            this.f20884c = iE != 64 ? (-1) << iE : 0L;
            this.f20885d = f20881f;
        } else {
            this.f20884c = 0L;
            this.f20885d = e(iE);
        }
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f20885d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f20885d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f20885d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (this.f20883b.invoke(this.f20882a, Integer.valueOf(i13)).booleanValue()) {
                    this.f20885d[i10] = j10;
                    return i13;
                }
            }
            this.f20885d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[kotlin.collections.o.B(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f20884c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iE = this.f20882a.e();
        do {
            long j10 = this.f20884c;
            if (j10 == -1) {
                if (iE > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f20884c |= 1 << iNumberOfTrailingZeros;
        } while (!this.f20883b.invoke(this.f20882a, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
