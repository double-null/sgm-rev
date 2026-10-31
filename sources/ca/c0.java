package ca;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;

/* JADX INFO: compiled from: PsExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements v8.p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v8.u f5057l = new v8.u() { // from class: ca.b0
        @Override // v8.u
        public final v8.p[] g() {
            return c0.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.g0 f5058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f5059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.a0 f5060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f5061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z f5066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private v8.r f5067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5068k;

    /* JADX INFO: compiled from: PsExtractor.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f5069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x7.g0 f5070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x7.z f5071c = new x7.z(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f5073e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5074f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f5075g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f5076h;

        public a(m mVar, x7.g0 g0Var) {
            this.f5069a = mVar;
            this.f5070b = g0Var;
        }

        private void b() {
            this.f5071c.r(8);
            this.f5072d = this.f5071c.g();
            this.f5073e = this.f5071c.g();
            this.f5071c.r(6);
            this.f5075g = this.f5071c.h(8);
        }

        private void c() {
            this.f5076h = 0L;
            if (this.f5072d) {
                this.f5071c.r(4);
                long jH = ((long) this.f5071c.h(3)) << 30;
                this.f5071c.r(1);
                long jH2 = jH | ((long) (this.f5071c.h(15) << 15));
                this.f5071c.r(1);
                long jH3 = jH2 | ((long) this.f5071c.h(15));
                this.f5071c.r(1);
                if (!this.f5074f && this.f5073e) {
                    this.f5071c.r(4);
                    long jH4 = ((long) this.f5071c.h(3)) << 30;
                    this.f5071c.r(1);
                    long jH5 = jH4 | ((long) (this.f5071c.h(15) << 15));
                    this.f5071c.r(1);
                    long jH6 = jH5 | ((long) this.f5071c.h(15));
                    this.f5071c.r(1);
                    this.f5070b.b(jH6);
                    this.f5074f = true;
                }
                this.f5076h = this.f5070b.b(jH3);
            }
        }

        public void a(x7.a0 a0Var) throws ParserException {
            a0Var.l(this.f5071c.f28202a, 0, 3);
            this.f5071c.p(0);
            b();
            a0Var.l(this.f5071c.f28202a, 0, this.f5075g);
            this.f5071c.p(0);
            c();
            this.f5069a.f(this.f5076h, 4);
            this.f5069a.c(a0Var);
            this.f5069a.e(false);
        }

        public void d() {
            this.f5074f = false;
            this.f5069a.b();
        }
    }

    public c0() {
        this(new x7.g0(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v8.p[] d() {
        return new v8.p[]{new c0()};
    }

    private void g(long j10) {
        if (this.f5068k) {
            return;
        }
        this.f5068k = true;
        if (this.f5061d.c() == -9223372036854775807L) {
            this.f5067j.h(new v8.j0.b(this.f5061d.c()));
            return;
        }
        z zVar = new z(this.f5061d.d(), this.f5061d.c(), j10);
        this.f5066i = zVar;
        this.f5067j.h(zVar.b());
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        boolean z10 = this.f5058a.f() == -9223372036854775807L;
        if (!z10) {
            long jD = this.f5058a.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f5058a.i(j11);
        }
        z zVar = this.f5066i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f5059b.size(); i10++) {
            this.f5059b.valueAt(i10).d();
        }
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        this.f5067j = rVar;
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        byte[] bArr = new byte[14];
        qVar.n(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qVar.g(bArr[13] & 7);
        qVar.n(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // v8.p
    public int l(v8.q qVar, v8.i0 i0Var) throws IOException {
        m nVar;
        x7.a.i(this.f5067j);
        long length = qVar.getLength();
        if ((length != -1) && !this.f5061d.e()) {
            return this.f5061d.g(qVar, i0Var);
        }
        g(length);
        z zVar = this.f5066i;
        if (zVar != null && zVar.d()) {
            return this.f5066i.c(qVar, i0Var);
        }
        qVar.d();
        long jF = length != -1 ? length - qVar.f() : -1L;
        if ((jF != -1 && jF < 4) || !qVar.b(this.f5060c.e(), 0, 4, true)) {
            return -1;
        }
        this.f5060c.W(0);
        int iQ = this.f5060c.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            qVar.n(this.f5060c.e(), 0, 10);
            this.f5060c.W(9);
            qVar.k((this.f5060c.H() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            qVar.n(this.f5060c.e(), 0, 2);
            this.f5060c.W(0);
            qVar.k(this.f5060c.P() + 6);
            return 0;
        }
        if (((iQ & (-256)) >> 8) != 1) {
            qVar.k(1);
            return 0;
        }
        int i10 = iQ & 255;
        a aVar = this.f5059b.get(i10);
        if (!this.f5062e) {
            if (aVar == null) {
                if (i10 == 189) {
                    nVar = new c("video/mp2p");
                    this.f5063f = true;
                    this.f5065h = qVar.getPosition();
                } else if ((i10 & Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE) == 192) {
                    nVar = new t("video/mp2p");
                    this.f5063f = true;
                    this.f5065h = qVar.getPosition();
                } else if ((i10 & 240) == 224) {
                    nVar = new n("video/mp2p");
                    this.f5064g = true;
                    this.f5065h = qVar.getPosition();
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.d(this.f5067j, new l0.d(i10, UserVerificationMethods.USER_VERIFY_HANDPRINT));
                    aVar = new a(nVar, this.f5058a);
                    this.f5059b.put(i10, aVar);
                }
            }
            if (qVar.getPosition() > ((this.f5063f && this.f5064g) ? this.f5065h + 8192 : 1048576L)) {
                this.f5062e = true;
                this.f5067j.r();
            }
        }
        qVar.n(this.f5060c.e(), 0, 2);
        this.f5060c.W(0);
        int iP = this.f5060c.P() + 6;
        if (aVar == null) {
            qVar.k(iP);
        } else {
            this.f5060c.S(iP);
            qVar.readFully(this.f5060c.e(), 0, iP);
            this.f5060c.W(6);
            aVar.a(this.f5060c);
            x7.a0 a0Var = this.f5060c;
            a0Var.V(a0Var.b());
        }
        return 0;
    }

    public c0(x7.g0 g0Var) {
        this.f5058a = g0Var;
        this.f5060c = new x7.a0(4096);
        this.f5059b = new SparseArray<>();
        this.f5061d = new a0();
    }

    @Override // v8.p
    public void release() {
    }
}
