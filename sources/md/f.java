package md;

import java.io.Serializable;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: XorWowRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends d implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f22265i = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22271h;

    /* JADX INFO: compiled from: XorWowRandom.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public f(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f22266c = i10;
        this.f22267d = i11;
        this.f22268e = i12;
        this.f22269f = i13;
        this.f22270g = i14;
        this.f22271h = i15;
        int i16 = i10 | i11 | i12 | i13 | i14;
        if (!(i16 != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i17 = 0; i17 < 64; i17++) {
            f();
        }
    }

    @Override // md.d
    public int c(int i10) {
        return e.b(f(), i10);
    }

    @Override // md.d
    public int f() {
        int i10 = this.f22266c;
        int i11 = i10 ^ (i10 >>> 2);
        this.f22266c = this.f22267d;
        this.f22267d = this.f22268e;
        this.f22268e = this.f22269f;
        int i12 = this.f22270g;
        this.f22269f = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f22270g = i13;
        int i14 = this.f22271h + 362437;
        this.f22271h = i14;
        return i13 + i14;
    }

    public f(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }
}
