package ue;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27058c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f27060b = new int[10];

    /* JADX INFO: compiled from: Settings.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public final int a(int i10) {
        return this.f27060b[i10];
    }

    public final int b() {
        if ((this.f27059a & 2) != 0) {
            return this.f27060b[1];
        }
        return -1;
    }

    public final int c() {
        return (this.f27059a & 128) != 0 ? this.f27060b[7] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final int d() {
        if ((this.f27059a & 16) != 0) {
            return this.f27060b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        return (this.f27059a & 32) != 0 ? this.f27060b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f27059a) != 0;
    }

    public final void g(l other) {
        t.f(other, "other");
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
            i10 = i11;
        }
    }

    public final l h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f27060b;
            if (i10 < iArr.length) {
                this.f27059a = (1 << i10) | this.f27059a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f27059a);
    }
}
