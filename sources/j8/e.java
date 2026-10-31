package j8;

import android.graphics.Bitmap;
import b8.u;
import io.bidmachine.media3.decoder.DecoderException;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.h;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.exoplayer.image.ImageDecoderException;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import pb.vBC.NyXuoef;
import u7.q;
import x7.h0;

/* JADX INFO: compiled from: ImageRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
public class e extends h {
    private int A;
    private q B;
    private c C;
    private DecoderInputBuffer D;
    private ImageOutput E;
    private Bitmap F;
    private boolean G;
    private b H;
    private b I;
    private int J;
    private boolean K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c.a f20681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f20682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayDeque<a> f20683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f20685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f20686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f20687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f20688y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f20689z;

    /* JADX INFO: compiled from: ImageRenderer.java */
    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f20690c = new a(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f20691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20692b;

        public a(long j10, long j11) {
            this.f20691a = j10;
            this.f20692b = j11;
        }
    }

    /* JADX INFO: compiled from: ImageRenderer.java */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f20693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f20694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f20695c;

        public b(int i10, long j10) {
            this.f20693a = i10;
            this.f20694b = j10;
        }

        public long a() {
            return this.f20694b;
        }

        public Bitmap b() {
            return this.f20695c;
        }

        public int c() {
            return this.f20693a;
        }

        public boolean d() {
            return this.f20695c != null;
        }

        public void e(Bitmap bitmap) {
            this.f20695c = bitmap;
        }
    }

    public e(c.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f20681r = aVar;
        this.E = x0(imageOutput);
        this.f20682s = DecoderInputBuffer.t();
        this.f20686w = a.f20690c;
        this.f20683t = new ArrayDeque<>();
        this.f20688y = -9223372036854775807L;
        this.f20687x = -9223372036854775807L;
        this.f20689z = 0;
        this.A = 1;
    }

    private void A0(long j10, DecoderInputBuffer decoderInputBuffer) {
        boolean z10 = true;
        if (decoderInputBuffer.j()) {
            this.G = true;
            return;
        }
        b bVar = new b(this.J, decoderInputBuffer.f18059f);
        this.I = bVar;
        this.J++;
        if (!this.G) {
            long jA = bVar.a();
            boolean z11 = jA - 30000 <= j10 && j10 <= 30000 + jA;
            b bVar2 = this.H;
            boolean z12 = bVar2 != null && bVar2.a() <= j10 && j10 < jA;
            boolean zY0 = y0((b) x7.a.i(this.I));
            if (!z11 && !z12 && !zY0) {
                z10 = false;
            }
            this.G = z10;
            if (z12 && !z11) {
                return;
            }
        }
        this.H = this.I;
        this.I = null;
    }

    private boolean B0() throws ExoPlaybackException {
        if (!C0()) {
            return false;
        }
        if (!this.K) {
            return true;
        }
        if (!t0((q) x7.a.e(this.B))) {
            throw T(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.B, 4005);
        }
        c cVar = this.C;
        if (cVar != null) {
            cVar.release();
        }
        this.C = this.f20681r.b();
        this.K = false;
        return true;
    }

    private void D0(long j10) {
        this.f20687x = j10;
        while (!this.f20683t.isEmpty() && j10 >= this.f20683t.peek().f20691a) {
            this.f20686w = this.f20683t.removeFirst();
        }
    }

    private void F0() {
        this.D = null;
        this.f20689z = 0;
        this.f20688y = -9223372036854775807L;
        c cVar = this.C;
        if (cVar != null) {
            cVar.release();
            this.C = null;
        }
    }

    private void G0(ImageOutput imageOutput) {
        this.E = x0(imageOutput);
    }

    private boolean H0() {
        boolean z10 = k() == 2;
        int i10 = this.A;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private boolean t0(q qVar) {
        int iA = this.f20681r.a(qVar);
        return iA == i2.v(4) || iA == i2.v(3);
    }

    private Bitmap u0(int i10) {
        x7.a.i(this.F);
        int width = this.F.getWidth() / ((q) x7.a.i(this.B)).L;
        int height = this.F.getHeight() / ((q) x7.a.i(this.B)).M;
        int i11 = this.B.L;
        return Bitmap.createBitmap(this.F, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean v0(long j10, long j11) throws ImageDecoderException, ExoPlaybackException {
        if (this.F != null && this.H == null) {
            return false;
        }
        if (this.A == 0 && k() != 2) {
            return false;
        }
        if (this.F == null) {
            x7.a.i(this.C);
            d dVarA = this.C.a();
            if (dVarA == null) {
                return false;
            }
            if (((d) x7.a.i(dVarA)).j()) {
                if (this.f20689z == 3) {
                    F0();
                    x7.a.i(this.B);
                    B0();
                } else {
                    ((d) x7.a.i(dVarA)).p();
                    if (this.f20683t.isEmpty()) {
                        this.f20685v = true;
                    }
                }
                return false;
            }
            x7.a.j(dVarA.f20680e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.F = dVarA.f20680e;
            ((d) x7.a.i(dVarA)).p();
        }
        if (!this.G || this.F == null || this.H == null) {
            return false;
        }
        x7.a.i(this.B);
        q qVar = this.B;
        int i10 = qVar.L;
        boolean z10 = ((i10 == 1 && qVar.M == 1) || i10 == -1 || qVar.M == -1) ? false : true;
        if (!this.H.d()) {
            b bVar = this.H;
            bVar.e(z10 ? u0(bVar.c()) : (Bitmap) x7.a.i(this.F));
        }
        if (!E0(j10, j11, (Bitmap) x7.a.i(this.H.b()), this.H.a())) {
            return false;
        }
        D0(((b) x7.a.i(this.H)).a());
        this.A = 3;
        if (!z10 || ((b) x7.a.i(this.H)).c() == (((q) x7.a.i(this.B)).M * ((q) x7.a.i(this.B)).L) - 1) {
            this.F = null;
        }
        this.H = this.I;
        this.I = null;
        return true;
    }

    private boolean w0(long j10) throws DecoderException {
        if (this.G && this.H != null) {
            return false;
        }
        u uVarX = X();
        c cVar = this.C;
        if (cVar == null || this.f20689z == 3 || this.f20684u) {
            return false;
        }
        if (this.D == null) {
            DecoderInputBuffer decoderInputBufferE = cVar.e();
            this.D = decoderInputBufferE;
            if (decoderInputBufferE == null) {
                return false;
            }
        }
        if (this.f20689z == 2) {
            x7.a.i(this.D);
            this.D.o(4);
            ((c) x7.a.i(this.C)).f(this.D);
            this.D = null;
            this.f20689z = 3;
            return false;
        }
        int iQ0 = q0(uVarX, this.D, 0);
        if (iQ0 == -5) {
            this.B = (q) x7.a.i(uVarX.f4168b);
            this.K = true;
            this.f20689z = 2;
            return true;
        }
        if (iQ0 != -4) {
            if (iQ0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.D.r();
        ByteBuffer byteBuffer = this.D.f18057d;
        boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((DecoderInputBuffer) x7.a.i(this.D)).j();
        if (z10) {
            ((c) x7.a.i(this.C)).f((DecoderInputBuffer) x7.a.i(this.D));
            this.J = 0;
        }
        A0(j10, (DecoderInputBuffer) x7.a.i(this.D));
        if (((DecoderInputBuffer) x7.a.i(this.D)).j()) {
            this.f20684u = true;
            this.D = null;
            return false;
        }
        this.f20688y = Math.max(this.f20688y, ((DecoderInputBuffer) x7.a.i(this.D)).f18059f);
        if (z10) {
            this.D = null;
        } else {
            ((DecoderInputBuffer) x7.a.i(this.D)).g();
        }
        return !this.G;
    }

    private static ImageOutput x0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f19085a : imageOutput;
    }

    private boolean y0(b bVar) {
        return ((q) x7.a.i(this.B)).L == -1 || this.B.M == -1 || bVar.c() == (((q) x7.a.i(this.B)).M * this.B.L) - 1;
    }

    private void z0(int i10) {
        this.A = Math.min(this.A, i10);
    }

    protected boolean C0() throws ExoPlaybackException {
        return true;
    }

    protected boolean E0(long j10, long j11, Bitmap bitmap, long j12) throws ExoPlaybackException {
        long j13 = j12 - j10;
        if (!H0() && j13 >= 30000) {
            return false;
        }
        this.E.onImageAvailable(j12 - this.f20686w.f20692b, bitmap);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public int a(q qVar) {
        return this.f20681r.a(qVar);
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean b() {
        return this.f20685v;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void f0() {
        this.B = null;
        this.f20686w = a.f20690c;
        this.f20683t.clear();
        F0();
        this.E.a();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void g0(boolean z10, boolean z11) throws ExoPlaybackException {
        this.A = z11 ? 1 : 0;
    }

    @Override // io.bidmachine.media3.exoplayer.h2, io.bidmachine.media3.exoplayer.i2
    public String getName() {
        return "ImageRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean h() {
        int i10 = this.A;
        return i10 == 3 || (i10 == 0 && this.G);
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void i0(long j10, boolean z10) throws ExoPlaybackException {
        z0(1);
        this.f20685v = false;
        this.f20684u = false;
        this.F = null;
        this.H = null;
        this.I = null;
        this.G = false;
        this.D = null;
        c cVar = this.C;
        if (cVar != null) {
            cVar.flush();
        }
        this.f20683t.clear();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void j0() {
        F0();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void l0() {
        F0();
        z0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // io.bidmachine.media3.exoplayer.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void o0(u7.q[] r5, long r6, long r8, io.bidmachine.media3.exoplayer.source.r.b r10) throws io.bidmachine.media3.exoplayer.ExoPlaybackException {
        /*
            r4 = this;
            super.o0(r5, r6, r8, r10)
            j8.e$a r5 = r4.f20686w
            long r5 = r5.f20692b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L36
            java.util.ArrayDeque<j8.e$a> r5 = r4.f20683t
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L29
            long r5 = r4.f20688y
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L36
            long r2 = r4.f20687x
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L29
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            goto L36
        L29:
            java.util.ArrayDeque<j8.e$a> r5 = r4.f20683t
            j8.e$a r6 = new j8.e$a
            long r0 = r4.f20688y
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L3d
        L36:
            j8.e$a r5 = new j8.e$a
            r5.<init>(r0, r8)
            r4.f20686w = r5
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.e.o0(u7.q[], long, long, io.bidmachine.media3.exoplayer.source.r$b):void");
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.f2.b
    public void z(int i10, Object obj) throws ExoPlaybackException {
        if (i10 != 15) {
            super.z(i10, obj);
        } else {
            G0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public void i(long j10, long j11) throws ExoPlaybackException {
        if (this.f20685v) {
            return;
        }
        if (this.B == null) {
            u uVarX = X();
            this.f20682s.g();
            int iQ0 = q0(uVarX, this.f20682s, 2);
            if (iQ0 != -5) {
                if (iQ0 == -4) {
                    x7.a.g(this.f20682s.j());
                    this.f20684u = true;
                    this.f20685v = true;
                    return;
                }
                return;
            }
            this.B = (q) x7.a.i(uVarX.f4168b);
            this.K = true;
        }
        if (this.C != null || B0()) {
            try {
                h0.a(NyXuoef.vNkAz);
                while (v0(j10, j11)) {
                }
                while (w0(j10)) {
                }
                h0.b();
            } catch (ImageDecoderException e10) {
                throw T(e10, null, 4003);
            }
        }
    }
}
