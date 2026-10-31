package p9;

import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import x7.a0;

/* JADX INFO: compiled from: TrackFragment.java */
/* JADX INFO: loaded from: classes4.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f23685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23690f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23696l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f23698n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f23701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23702r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f23691g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f23692h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f23693i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f23694j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f23695k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f23697m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f23699o = new a0();

    public void a(v8.q qVar) throws IOException {
        qVar.readFully(this.f23699o.e(), 0, this.f23699o.g());
        this.f23699o.W(0);
        this.f23700p = false;
    }

    public void b(a0 a0Var) {
        a0Var.l(this.f23699o.e(), 0, this.f23699o.g());
        this.f23699o.W(0);
        this.f23700p = false;
    }

    public long c(int i10) {
        return this.f23694j[i10];
    }

    public void d(int i10) {
        this.f23699o.S(i10);
        this.f23696l = true;
        this.f23700p = true;
    }

    public void e(int i10, int i11) {
        this.f23689e = i10;
        this.f23690f = i11;
        if (this.f23692h.length < i10) {
            this.f23691g = new long[i10];
            this.f23692h = new int[i10];
        }
        if (this.f23693i.length < i11) {
            int i12 = (i11 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
            this.f23693i = new int[i12];
            this.f23694j = new long[i12];
            this.f23695k = new boolean[i12];
            this.f23697m = new boolean[i12];
        }
    }

    public void f() {
        this.f23689e = 0;
        this.f23701q = 0L;
        this.f23702r = false;
        this.f23696l = false;
        this.f23700p = false;
        this.f23698n = null;
    }

    public boolean g(int i10) {
        return this.f23696l && this.f23697m[i10];
    }
}
