package p8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b8.u;
import io.bidmachine.media3.decoder.DecoderException;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.extractor.text.SubtitleDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import s9.k;
import s9.l;
import s9.o;
import s9.p;
import u7.q;
import u7.w;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: TextRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends io.bidmachine.media3.exoplayer.h implements Handler.Callback {
    private p A;
    private int B;
    private final Handler C;
    private final h D;
    private final u E;
    private boolean F;
    private boolean G;
    private q H;
    private long I;
    private long J;
    private boolean K;
    private IOException L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final s9.b f23513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f23514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f23515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final g f23516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f23517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private l f23519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private o f23520y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p f23521z;

    public i(h hVar, Looper looper) {
        this(hVar, looper, g.f23511a);
    }

    private void A0() {
        this.f23517v = true;
        l lVarB = this.f23516u.b((q) x7.a.e(this.H));
        this.f23519x = lVarB;
        lVarB.d(Z());
    }

    private void B0(w7.b bVar) {
        this.D.k(bVar.f27580a);
        this.D.s(bVar);
    }

    private static boolean C0(q qVar) {
        return Objects.equals(qVar.f26252o, "application/x-media3-cues");
    }

    private boolean D0(long j10) {
        if (this.F || q0(this.E, this.f23514s, 0) != -4) {
            return false;
        }
        if (this.f23514s.j()) {
            this.F = true;
            return false;
        }
        this.f23514s.r();
        ByteBuffer byteBuffer = (ByteBuffer) x7.a.e(this.f23514s.f18057d);
        s9.e eVarA = this.f23513r.a(this.f23514s.f18059f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f23514s.g();
        return this.f23515t.d(eVarA, j10);
    }

    private void E0() {
        this.f23520y = null;
        this.B = -1;
        p pVar = this.f23521z;
        if (pVar != null) {
            pVar.p();
            this.f23521z = null;
        }
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.p();
            this.A = null;
        }
    }

    private void F0() {
        E0();
        ((l) x7.a.e(this.f23519x)).release();
        this.f23519x = null;
        this.f23518w = 0;
    }

    private void G0(long j10) {
        boolean zD0 = D0(j10);
        long jC = this.f23515t.c(this.I);
        if (jC == Long.MIN_VALUE && this.F && !zD0) {
            this.G = true;
        }
        if (jC != Long.MIN_VALUE && jC <= j10) {
            zD0 = true;
        }
        if (zD0) {
            com.google.common.collect.u<w7.a> uVarA = this.f23515t.a(j10);
            long jB = this.f23515t.b(j10);
            K0(new w7.b(uVarA, x0(jB)));
            this.f23515t.e(jB);
        }
        this.I = j10;
    }

    private void H0(long j10) throws DecoderException {
        boolean z10;
        this.I = j10;
        if (this.A == null) {
            ((l) x7.a.e(this.f23519x)).b(j10);
            try {
                this.A = ((l) x7.a.e(this.f23519x)).a();
            } catch (SubtitleDecoderException e10) {
                y0(e10);
                return;
            }
        }
        if (k() != 2) {
            return;
        }
        if (this.f23521z != null) {
            long jW0 = w0();
            z10 = false;
            while (jW0 <= j10) {
                this.B++;
                jW0 = w0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        p pVar = this.A;
        if (pVar != null) {
            if (pVar.j()) {
                if (!z10 && w0() == Long.MAX_VALUE) {
                    if (this.f23518w == 2) {
                        I0();
                    } else {
                        E0();
                        this.G = true;
                    }
                }
            } else if (pVar.f147b <= j10) {
                p pVar2 = this.f23521z;
                if (pVar2 != null) {
                    pVar2.p();
                }
                this.B = pVar.a(j10);
                this.f23521z = pVar;
                this.A = null;
                z10 = true;
            }
        }
        if (z10) {
            x7.a.e(this.f23521z);
            K0(new w7.b(this.f23521z.b(j10), x0(v0(j10))));
        }
        if (this.f23518w == 2) {
            return;
        }
        while (!this.F) {
            try {
                o oVarE = this.f23520y;
                if (oVarE == null) {
                    oVarE = ((l) x7.a.e(this.f23519x)).e();
                    if (oVarE == null) {
                        return;
                    } else {
                        this.f23520y = oVarE;
                    }
                }
                if (this.f23518w == 1) {
                    oVarE.o(4);
                    ((l) x7.a.e(this.f23519x)).c(oVarE);
                    this.f23520y = null;
                    this.f23518w = 2;
                    return;
                }
                int iQ0 = q0(this.E, oVarE, 0);
                if (iQ0 == -4) {
                    if (oVarE.j()) {
                        this.F = true;
                        this.f23517v = false;
                    } else {
                        q qVar = this.E.f4168b;
                        if (qVar == null) {
                            return;
                        }
                        oVarE.f25339j = qVar.f26257t;
                        oVarE.r();
                        this.f23517v &= !oVarE.l();
                    }
                    if (!this.f23517v) {
                        ((l) x7.a.e(this.f23519x)).c(oVarE);
                        this.f23520y = null;
                    }
                } else if (iQ0 == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                y0(e11);
                return;
            }
        }
    }

    private void I0() {
        F0();
        A0();
    }

    private void K0(w7.b bVar) {
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, bVar).sendToTarget();
        } else {
            B0(bVar);
        }
    }

    private void t0() {
        x7.a.h(this.K || Objects.equals(this.H.f26252o, "application/cea-608") || Objects.equals(this.H.f26252o, "application/x-mp4-cea-608") || Objects.equals(this.H.f26252o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.H.f26252o + " samples (expected application/x-media3-cues).");
    }

    private void u0() {
        K0(new w7.b(com.google.common.collect.u.H(), x0(this.I)));
    }

    private long v0(long j10) {
        int iA = this.f23521z.a(j10);
        if (iA == 0 || this.f23521z.d() == 0) {
            return this.f23521z.f147b;
        }
        if (iA != -1) {
            return this.f23521z.c(iA - 1);
        }
        p pVar = this.f23521z;
        return pVar.c(pVar.d() - 1);
    }

    private long w0() {
        if (this.B == -1) {
            return Long.MAX_VALUE;
        }
        x7.a.e(this.f23521z);
        if (this.B >= this.f23521z.d()) {
            return Long.MAX_VALUE;
        }
        return this.f23521z.c(this.B);
    }

    private long x0(long j10) {
        x7.a.g(j10 != -9223372036854775807L);
        return j10 - c0();
    }

    private void y0(SubtitleDecoderException subtitleDecoderException) {
        r.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.H, subtitleDecoderException);
        u0();
        I0();
    }

    private static boolean z0(k kVar, long j10) {
        return kVar == null || kVar.c(kVar.d() - 1) <= j10;
    }

    public void J0(long j10) {
        x7.a.g(D());
        this.J = j10;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public int a(q qVar) {
        if (C0(qVar) || this.f23516u.a(qVar)) {
            return i2.v(qVar.N == 0 ? 4 : 2);
        }
        return w.s(qVar.f26252o) ? i2.v(1) : i2.v(0);
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean b() {
        return this.G;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void f0() {
        this.H = null;
        this.J = -9223372036854775807L;
        u0();
        this.I = -9223372036854775807L;
        if (this.f23519x != null) {
            F0();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h2, io.bidmachine.media3.exoplayer.i2
    public String getName() {
        return "TextRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean h() {
        if (this.H == null) {
            return true;
        }
        if (this.L == null) {
            try {
                A();
            } catch (IOException e10) {
                this.L = e10;
            }
        }
        if (this.L != null) {
            if (C0((q) x7.a.e(this.H))) {
                return ((a) x7.a.e(this.f23515t)).c(this.I) != Long.MIN_VALUE;
            }
            if (this.G || (this.F && z0(this.f23521z, this.I) && z0(this.A, this.I) && this.f23520y != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        B0((w7.b) message.obj);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public void i(long j10, long j11) throws DecoderException {
        if (D()) {
            long j12 = this.J;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                E0();
                this.G = true;
            }
        }
        if (this.G) {
            return;
        }
        if (C0((q) x7.a.e(this.H))) {
            x7.a.e(this.f23515t);
            G0(j10);
        } else {
            t0();
            H0(j10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void i0(long j10, boolean z10) {
        this.I = j10;
        a aVar = this.f23515t;
        if (aVar != null) {
            aVar.clear();
        }
        u0();
        this.F = false;
        this.G = false;
        this.J = -9223372036854775807L;
        q qVar = this.H;
        if (qVar == null || C0(qVar)) {
            return;
        }
        if (this.f23518w != 0) {
            I0();
            return;
        }
        E0();
        l lVar = (l) x7.a.e(this.f23519x);
        lVar.flush();
        lVar.d(Z());
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void o0(q[] qVarArr, long j10, long j11, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        q qVar = qVarArr[0];
        this.H = qVar;
        if (C0(qVar)) {
            this.f23515t = this.H.K == 1 ? new e() : new f();
            return;
        }
        t0();
        if (this.f23519x != null) {
            this.f23518w = 1;
        } else {
            A0();
        }
    }

    public i(h hVar, Looper looper, g gVar) {
        super(3);
        this.D = (h) x7.a.e(hVar);
        this.C = looper == null ? null : l0.z(looper, this);
        this.f23516u = gVar;
        this.f23513r = new s9.b();
        this.f23514s = new DecoderInputBuffer(1);
        this.E = new u();
        this.J = -9223372036854775807L;
        this.I = -9223372036854775807L;
        this.K = false;
    }
}
