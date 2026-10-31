package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import b8.u;
import c8.b2;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import d8.t;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.drm.DrmSession;
import io.bidmachine.media3.exoplayer.h2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import x7.f0;
import x7.h0;
import x7.l0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaCodecRenderer extends io.bidmachine.media3.exoplayer.h {
    private static final byte[] E0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final ArrayDeque<d> A;
    private d A0;
    private final t B;
    private long B0;
    private u7.q C;
    private boolean C0;
    private u7.q D;
    private boolean D0;
    private DrmSession E;
    private DrmSession F;
    private h2.a G;
    private MediaCrypto H;
    private long I;
    private float J;
    private float K;
    private h L;
    private u7.q M;
    private MediaFormat N;
    private boolean O;
    private float P;
    private ArrayDeque<j> Q;
    private DecoderInitializationException R;
    private j S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private long f19178a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f19179b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f19180c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f19181d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f19182e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ByteBuffer f19183f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f19184g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f19185h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f19186i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f19187j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f19188k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f19189l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f19190m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f19191n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f19192o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f19193p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f19194q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h.b f19195r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f19196r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final l f19197s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private long f19198s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f19199t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private long f19200t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f19201u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f19202u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final DecoderInputBuffer f19203v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f19204v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final DecoderInputBuffer f19205w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f19206w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final DecoderInputBuffer f19207x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f19208x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final f f19209y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private ExoPlaybackException f19210y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final MediaCodec.BufferInfo f19211z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    protected b8.b f19212z0;

    private static final class b {
        public static void a(h.a aVar, b2 b2Var) {
            LogSessionId logSessionIdA = b2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f19282b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    private final class c implements h.c {
        private c() {
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.h.c
        public void a() {
            if (MediaCodecRenderer.this.G != null) {
                MediaCodecRenderer.this.G.b();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.h.c
        public void b() {
            if (MediaCodecRenderer.this.G != null) {
                MediaCodecRenderer.this.G.b();
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f19219e = new d(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f0<u7.q> f19223d = new f0<>();

        public d(long j10, long j11, long j12) {
            this.f19220a = j10;
            this.f19221b = j11;
            this.f19222c = j12;
        }
    }

    public MediaCodecRenderer(int i10, h.b bVar, l lVar, boolean z10, float f10) {
        super(i10);
        this.f19195r = bVar;
        this.f19197s = (l) x7.a.e(lVar);
        this.f19199t = z10;
        this.f19201u = f10;
        this.f19203v = DecoderInputBuffer.t();
        this.f19205w = new DecoderInputBuffer(0);
        this.f19207x = new DecoderInputBuffer(2);
        f fVar = new f();
        this.f19209y = fVar;
        this.f19211z = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = -9223372036854775807L;
        this.A = new ArrayDeque<>();
        this.A0 = d.f19219e;
        fVar.q(0);
        fVar.f18057d.order(ByteOrder.nativeOrder());
        this.B = new t();
        this.P = -1.0f;
        this.T = 0;
        this.f19190m0 = 0;
        this.f19181d0 = -1;
        this.f19182e0 = -1;
        this.f19180c0 = -9223372036854775807L;
        this.f19198s0 = -9223372036854775807L;
        this.f19200t0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.f19178a0 = -9223372036854775807L;
        this.f19191n0 = 0;
        this.f19192o0 = 0;
        this.f19212z0 = new b8.b();
    }

    private static boolean A0(j jVar) {
        String str = jVar.f19288a;
        int i10 = l0.f28136a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && jVar.f19294g);
    }

    private static boolean B0(String str) {
        return l0.f28136a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void B1() {
        this.f19196r0 = true;
        MediaFormat mediaFormatE = ((h) x7.a.e(this.L)).e();
        if (this.T != 0 && mediaFormatE.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 32 && mediaFormatE.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 32) {
            this.Y = true;
        } else {
            this.N = mediaFormatE;
            this.O = true;
        }
    }

    private boolean C1(int i10) throws ExoPlaybackException {
        u uVarX = X();
        this.f19203v.g();
        int iQ0 = q0(uVarX, this.f19203v, i10 | 4);
        if (iQ0 == -5) {
            s1(uVarX);
            return true;
        }
        if (iQ0 != -4 || !this.f19203v.j()) {
            return false;
        }
        this.f19202u0 = true;
        z1();
        return false;
    }

    private void D0() {
        this.f19188k0 = false;
        this.f19209y.g();
        this.f19207x.g();
        this.f19187j0 = false;
        this.f19186i0 = false;
        this.B.d();
    }

    private void D1() throws ExoPlaybackException {
        E1();
        m1();
    }

    private boolean E0() {
        if (this.f19193p0) {
            this.f19191n0 = 1;
            if (this.V) {
                this.f19192o0 = 3;
                return false;
            }
            this.f19192o0 = 1;
        }
        return true;
    }

    private void F0() throws ExoPlaybackException {
        if (!this.f19193p0) {
            D1();
        } else {
            this.f19191n0 = 1;
            this.f19192o0 = 3;
        }
    }

    private boolean G0() throws ExoPlaybackException {
        if (this.f19193p0) {
            this.f19191n0 = 1;
            if (this.V) {
                this.f19192o0 = 3;
                return false;
            }
            this.f19192o0 = 2;
        } else {
            Y1();
        }
        return true;
    }

    private boolean H0(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        boolean zA1;
        int iN;
        h hVar = (h) x7.a.e(this.L);
        if (!d1()) {
            if (this.W && this.f19194q0) {
                try {
                    iN = hVar.n(this.f19211z);
                } catch (IllegalStateException unused) {
                    z1();
                    if (this.f19204v0) {
                        E1();
                    }
                    return false;
                }
            } else {
                iN = hVar.n(this.f19211z);
            }
            if (iN < 0) {
                if (iN == -2) {
                    B1();
                    return true;
                }
                if (this.Z && (this.f19202u0 || this.f19191n0 == 2)) {
                    z1();
                }
                long j12 = this.f19178a0;
                if (j12 != -9223372036854775807L && j12 + 100 < V().currentTimeMillis()) {
                    z1();
                }
                return false;
            }
            if (this.Y) {
                this.Y = false;
                hVar.o(iN, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f19211z;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                z1();
                return false;
            }
            this.f19182e0 = iN;
            ByteBuffer byteBufferP = hVar.p(iN);
            this.f19183f0 = byteBufferP;
            if (byteBufferP != null) {
                byteBufferP.position(this.f19211z.offset);
                ByteBuffer byteBuffer = this.f19183f0;
                MediaCodec.BufferInfo bufferInfo2 = this.f19211z;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.f19184g0 = this.f19211z.presentationTimeUs < Z();
            long j13 = this.f19200t0;
            this.f19185h0 = j13 != -9223372036854775807L && j13 <= this.f19211z.presentationTimeUs;
            Z1(this.f19211z.presentationTimeUs);
        }
        if (this.W && this.f19194q0) {
            try {
                ByteBuffer byteBuffer2 = this.f19183f0;
                int i10 = this.f19182e0;
                MediaCodec.BufferInfo bufferInfo3 = this.f19211z;
                z10 = false;
                try {
                    zA1 = A1(j10, j11, hVar, byteBuffer2, i10, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.f19184g0, this.f19185h0, (u7.q) x7.a.e(this.D));
                } catch (IllegalStateException unused2) {
                    z1();
                    if (this.f19204v0) {
                        E1();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.f19183f0;
            int i11 = this.f19182e0;
            MediaCodec.BufferInfo bufferInfo4 = this.f19211z;
            zA1 = A1(j10, j11, hVar, byteBuffer3, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f19184g0, this.f19185h0, (u7.q) x7.a.e(this.D));
        }
        if (zA1) {
            v1(this.f19211z.presentationTimeUs);
            boolean z11 = (this.f19211z.flags & 4) != 0 ? true : z10;
            if (!z11 && this.f19194q0 && this.f19185h0) {
                this.f19178a0 = V().currentTimeMillis();
            }
            J1();
            if (!z11) {
                return true;
            }
            z1();
        }
        return z10;
    }

    private boolean I0(j jVar, u7.q qVar, DrmSession drmSession, DrmSession drmSession2) throws ExoPlaybackException {
        a8.b bVarD;
        a8.b bVarD2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (bVarD = drmSession2.d()) != null && (bVarD2 = drmSession.d()) != null && bVarD.getClass().equals(bVarD2.getClass())) {
            if (!(bVarD instanceof g8.l)) {
                return false;
            }
            if (!drmSession2.a().equals(drmSession.a()) || l0.f28136a < 23) {
                return true;
            }
            UUID uuid = u7.f.f26063e;
            if (!uuid.equals(drmSession.a()) && !uuid.equals(drmSession2.a())) {
                if (jVar.f19294g) {
                    return false;
                }
                return drmSession2.k() == 2 || ((drmSession2.k() == 3 || drmSession2.k() == 4) && drmSession2.h((String) x7.a.e(qVar.f26252o)));
            }
        }
        return true;
    }

    private void I1() {
        this.f19181d0 = -1;
        this.f19205w.f18057d = null;
    }

    private boolean J0() throws ExoPlaybackException {
        int i10;
        if (this.L == null || (i10 = this.f19191n0) == 2 || this.f19202u0) {
            return false;
        }
        if (i10 == 0 && S1()) {
            F0();
        }
        h hVar = (h) x7.a.e(this.L);
        if (this.f19181d0 < 0) {
            int iM = hVar.m();
            this.f19181d0 = iM;
            if (iM < 0) {
                return false;
            }
            this.f19205w.f18057d = hVar.i(iM);
            this.f19205w.g();
        }
        if (this.f19191n0 == 1) {
            if (!this.Z) {
                this.f19194q0 = true;
                hVar.b(this.f19181d0, 0, 0, 0L, 4);
                I1();
            }
            this.f19191n0 = 2;
            return false;
        }
        if (this.X) {
            this.X = false;
            ByteBuffer byteBuffer = (ByteBuffer) x7.a.e(this.f19205w.f18057d);
            byte[] bArr = E0;
            byteBuffer.put(bArr);
            hVar.b(this.f19181d0, 0, bArr.length, 0L, 0);
            I1();
            this.f19193p0 = true;
            return true;
        }
        if (this.f19190m0 == 1) {
            for (int i11 = 0; i11 < ((u7.q) x7.a.e(this.M)).f26255r.size(); i11++) {
                ((ByteBuffer) x7.a.e(this.f19205w.f18057d)).put(this.M.f26255r.get(i11));
            }
            this.f19190m0 = 2;
        }
        int iPosition = ((ByteBuffer) x7.a.e(this.f19205w.f18057d)).position();
        u uVarX = X();
        try {
            int iQ0 = q0(uVarX, this.f19205w, 0);
            if (iQ0 == -3) {
                if (n()) {
                    this.f19200t0 = this.f19198s0;
                }
                return false;
            }
            if (iQ0 == -5) {
                if (this.f19190m0 == 2) {
                    this.f19205w.g();
                    this.f19190m0 = 1;
                }
                s1(uVarX);
                return true;
            }
            if (this.f19205w.j()) {
                this.f19200t0 = this.f19198s0;
                if (this.f19190m0 == 2) {
                    this.f19205w.g();
                    this.f19190m0 = 1;
                }
                this.f19202u0 = true;
                if (!this.f19193p0) {
                    z1();
                    return false;
                }
                if (!this.Z) {
                    this.f19194q0 = true;
                    hVar.b(this.f19181d0, 0, 0, 0L, 4);
                    I1();
                }
                return false;
            }
            if (!this.f19193p0 && !this.f19205w.l()) {
                this.f19205w.g();
                if (this.f19190m0 == 2) {
                    this.f19190m0 = 1;
                }
                return true;
            }
            if (Q1(this.f19205w)) {
                return true;
            }
            boolean zS = this.f19205w.s();
            if (zS) {
                this.f19205w.f18056c.b(iPosition);
            }
            long j10 = this.f19205w.f18059f;
            if (this.f19206w0) {
                if (this.A.isEmpty()) {
                    this.A0.f19223d.a(j10, (u7.q) x7.a.e(this.C));
                } else {
                    this.A.peekLast().f19223d.a(j10, (u7.q) x7.a.e(this.C));
                }
                this.f19206w0 = false;
            }
            this.f19198s0 = Math.max(this.f19198s0, j10);
            if (n() || this.f19205w.m()) {
                this.f19200t0 = this.f19198s0;
            }
            this.f19205w.r();
            if (this.f19205w.i()) {
                c1(this.f19205w);
            }
            x1(this.f19205w);
            int iP0 = P0(this.f19205w);
            if (zS) {
                ((h) x7.a.e(hVar)).a(this.f19181d0, 0, this.f19205w.f18056c, j10, iP0);
            } else {
                ((h) x7.a.e(hVar)).b(this.f19181d0, 0, ((ByteBuffer) x7.a.e(this.f19205w.f18057d)).limit(), j10, iP0);
            }
            I1();
            this.f19193p0 = true;
            this.f19190m0 = 0;
            this.f19212z0.f4130c++;
            return true;
        } catch (DecoderInputBuffer.InsufficientCapacityException e10) {
            p1(e10);
            C1(0);
            K0();
            return true;
        }
    }

    private void J1() {
        this.f19182e0 = -1;
        this.f19183f0 = null;
    }

    private void K0() {
        try {
            ((h) x7.a.i(this.L)).flush();
        } finally {
            G1();
        }
    }

    private void K1(DrmSession drmSession) {
        DrmSession.c(this.E, drmSession);
        this.E = drmSession;
    }

    private void L1(d dVar) {
        this.A0 = dVar;
        long j10 = dVar.f19222c;
        if (j10 != -9223372036854775807L) {
            this.C0 = true;
            u1(j10);
        }
    }

    private List<j> N0(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        u7.q qVar = (u7.q) x7.a.e(this.C);
        List<j> listU0 = U0(this.f19197s, qVar, z10);
        if (listU0.isEmpty() && z10) {
            listU0 = U0(this.f19197s, qVar, false);
            if (!listU0.isEmpty()) {
                x7.r.h("MediaCodecRenderer", "Drm session requires secure decoder for " + qVar.f26252o + ", but no secure decoder available. Trying to proceed with " + listU0 + ".");
            }
        }
        return listU0;
    }

    private void O1(DrmSession drmSession) {
        DrmSession.c(this.F, drmSession);
        this.F = drmSession;
    }

    private boolean P1(long j10) {
        return this.I == -9223372036854775807L || V().elapsedRealtime() - j10 < this.I;
    }

    protected static boolean W1(u7.q qVar) {
        int i10 = qVar.N;
        return i10 == 0 || i10 == 2;
    }

    private boolean X1(u7.q qVar) throws ExoPlaybackException {
        if (l0.f28136a >= 23 && this.L != null && this.f19192o0 != 3 && k() != 0) {
            float fS0 = S0(this.K, (u7.q) x7.a.e(qVar), b0());
            float f10 = this.P;
            if (f10 == fS0) {
                return true;
            }
            if (fS0 == -1.0f) {
                F0();
                return false;
            }
            if (f10 == -1.0f && fS0 <= this.f19201u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fS0);
            ((h) x7.a.e(this.L)).c(bundle);
            this.P = fS0;
        }
        return true;
    }

    private void Y1() throws ExoPlaybackException {
        a8.b bVarD = ((DrmSession) x7.a.e(this.F)).d();
        if (bVarD instanceof g8.l) {
            try {
                ((MediaCrypto) x7.a.e(this.H)).setMediaDrmSession(((g8.l) bVarD).f15530b);
            } catch (MediaCryptoException e10) {
                throw T(e10, this.C, 6006);
            }
        }
        K1(this.F);
        this.f19191n0 = 0;
        this.f19192o0 = 0;
    }

    private boolean d1() {
        return this.f19182e0 >= 0;
    }

    private boolean e1() {
        if (!this.f19209y.A()) {
            return true;
        }
        long jZ = Z();
        return k1(jZ, this.f19209y.y()) == k1(jZ, this.f19207x.f18059f);
    }

    private void f1(u7.q qVar) {
        D0();
        String str = qVar.f26252o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f19209y.B(32);
        } else {
            this.f19209y.B(1);
        }
        this.f19186i0 = true;
    }

    private void g1(j jVar, MediaCrypto mediaCrypto) throws Exception {
        u7.q qVar = (u7.q) x7.a.e(this.C);
        String str = jVar.f19288a;
        int i10 = l0.f28136a;
        float fS0 = i10 < 23 ? -1.0f : S0(this.K, qVar, b0());
        float f10 = fS0 > this.f19201u ? fS0 : -1.0f;
        long jElapsedRealtime = V().elapsedRealtime();
        h.a aVarX0 = X0(jVar, qVar, mediaCrypto, f10);
        if (i10 >= 31) {
            b.a(aVarX0, a0());
        }
        try {
            h0.a("createCodec:" + str);
            h hVarB = this.f19195r.b(aVarX0);
            this.L = hVarB;
            this.f19179b0 = hVarB.d(new c());
            h0.b();
            long jElapsedRealtime2 = V().elapsedRealtime();
            if (!jVar.o(qVar)) {
                x7.r.h("MediaCodecRenderer", l0.G("Format exceeds selected codec's capabilities [%s, %s]", u7.q.i(qVar), str));
            }
            this.S = jVar;
            this.P = f10;
            this.M = qVar;
            this.T = x0(str);
            this.U = B0(str);
            this.V = y0(str);
            this.W = z0(str);
            this.Z = A0(jVar) || R0();
            if (((h) x7.a.e(this.L)).k()) {
                this.f19189l0 = true;
                this.f19190m0 = 1;
                this.X = this.T != 0;
            }
            if (k() == 2) {
                this.f19180c0 = V().elapsedRealtime() + 1000;
            }
            this.f19212z0.f4128a++;
            q1(str, aVarX0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            h0.b();
            throw th;
        }
    }

    private boolean h1() throws ExoPlaybackException {
        x7.a.g(this.H == null);
        DrmSession drmSession = this.E;
        a8.b bVarD = drmSession.d();
        if (g8.l.f15528d && (bVarD instanceof g8.l)) {
            int iK = drmSession.k();
            if (iK == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) x7.a.e(drmSession.getError());
                throw T(drmSessionException, this.C, drmSessionException.f18558a);
            }
            if (iK != 4) {
                return false;
            }
        }
        if (bVarD == null) {
            return drmSession.getError() != null;
        }
        if (bVarD instanceof g8.l) {
            g8.l lVar = (g8.l) bVarD;
            try {
                this.H = new MediaCrypto(lVar.f15529a, lVar.f15530b);
            } catch (MediaCryptoException e10) {
                throw T(e10, this.C, 6006);
            }
        }
        return true;
    }

    private boolean k1(long j10, long j11) {
        u7.q qVar;
        return j11 < j10 && !((qVar = this.D) != null && Objects.equals(qVar.f26252o, "audio/opus") && v8.h0.g(j10, j11));
    }

    private static boolean l1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void n1(MediaCrypto mediaCrypto, boolean z10) throws ExoPlaybackException, DecoderInitializationException {
        u7.q qVar = (u7.q) x7.a.e(this.C);
        if (this.Q == null) {
            try {
                List<j> listN0 = N0(z10);
                ArrayDeque<j> arrayDeque = new ArrayDeque<>();
                this.Q = arrayDeque;
                if (this.f19199t) {
                    arrayDeque.addAll(listN0);
                } else if (!listN0.isEmpty()) {
                    this.Q.add(listN0.get(0));
                }
                this.R = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(qVar, e10, z10, -49998);
            }
        }
        if (this.Q.isEmpty()) {
            throw new DecoderInitializationException(qVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) x7.a.e(this.Q);
        while (this.L == null) {
            j jVar = (j) x7.a.e((j) arrayDeque2.peekFirst());
            if (!o1(qVar) || !R1(jVar)) {
                return;
            }
            try {
                g1(jVar, mediaCrypto);
            } catch (Exception e11) {
                x7.r.i("MediaCodecRenderer", "Failed to initialize decoder: " + jVar, e11);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(qVar, e11, z10, jVar);
                p1(decoderInitializationException);
                if (this.R == null) {
                    this.R = decoderInitializationException;
                } else {
                    this.R = this.R.e(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.R;
                }
            }
        }
        this.Q = null;
    }

    private void u0() throws ExoPlaybackException {
        x7.a.g(!this.f19202u0);
        u uVarX = X();
        this.f19207x.g();
        do {
            this.f19207x.g();
            int iQ0 = q0(uVarX, this.f19207x, 0);
            if (iQ0 == -5) {
                s1(uVarX);
                return;
            }
            if (iQ0 == -4) {
                if (!this.f19207x.j()) {
                    this.f19198s0 = Math.max(this.f19198s0, this.f19207x.f18059f);
                    if (n() || this.f19205w.m()) {
                        this.f19200t0 = this.f19198s0;
                    }
                    if (this.f19206w0) {
                        u7.q qVar = (u7.q) x7.a.e(this.C);
                        this.D = qVar;
                        if (Objects.equals(qVar.f26252o, "audio/opus") && !this.D.f26255r.isEmpty()) {
                            this.D = this.D.b().Z(v8.h0.f(this.D.f26255r.get(0))).N();
                        }
                        t1(this.D, null);
                        this.f19206w0 = false;
                    }
                    this.f19207x.r();
                    u7.q qVar2 = this.D;
                    if (qVar2 != null && Objects.equals(qVar2.f26252o, "audio/opus")) {
                        if (this.f19207x.i()) {
                            DecoderInputBuffer decoderInputBuffer = this.f19207x;
                            decoderInputBuffer.f18055b = this.D;
                            c1(decoderInputBuffer);
                        }
                        if (v8.h0.g(Z(), this.f19207x.f18059f)) {
                            this.B.a(this.f19207x, this.D.f26255r);
                        }
                    }
                    if (!e1()) {
                        break;
                    }
                } else {
                    this.f19202u0 = true;
                    this.f19200t0 = this.f19198s0;
                    return;
                }
            } else {
                if (iQ0 != -3) {
                    throw new IllegalStateException();
                }
                if (n()) {
                    this.f19200t0 = this.f19198s0;
                    return;
                }
                return;
            }
        } while (this.f19209y.v(this.f19207x));
        this.f19187j0 = true;
    }

    private boolean v0(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        x7.a.g(!this.f19204v0);
        if (this.f19209y.A()) {
            f fVar = this.f19209y;
            if (!A1(j10, j11, null, fVar.f18057d, this.f19182e0, 0, fVar.z(), this.f19209y.x(), k1(Z(), this.f19209y.y()), this.f19209y.j(), (u7.q) x7.a.e(this.D))) {
                return false;
            }
            v1(this.f19209y.y());
            this.f19209y.g();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.f19202u0) {
            this.f19204v0 = true;
            return z10;
        }
        if (this.f19187j0) {
            x7.a.g(this.f19209y.v(this.f19207x));
            this.f19187j0 = z10;
        }
        if (this.f19188k0) {
            if (this.f19209y.A()) {
                return true;
            }
            D0();
            this.f19188k0 = z10;
            m1();
            if (!this.f19186i0) {
                return z10;
            }
        }
        u0();
        if (this.f19209y.A()) {
            this.f19209y.r();
        }
        if (this.f19209y.A() || this.f19202u0 || this.f19188k0) {
            return true;
        }
        return z10;
    }

    private int x0(String str) {
        int i10 = l0.f28136a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Build.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Build.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean y0(String str) {
        return l0.f28136a <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private static boolean z0(String str) {
        return l0.f28136a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private void z1() throws ExoPlaybackException {
        int i10 = this.f19192o0;
        if (i10 == 1) {
            K0();
            return;
        }
        if (i10 == 2) {
            K0();
            Y1();
        } else if (i10 == 3) {
            D1();
        } else {
            this.f19204v0 = true;
            F1();
        }
    }

    protected abstract boolean A1(long j10, long j11, h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, u7.q qVar) throws ExoPlaybackException;

    protected MediaCodecDecoderException C0(Throwable th, j jVar) {
        return new MediaCodecDecoderException(th, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void E1() {
        try {
            h hVar = this.L;
            if (hVar != null) {
                hVar.release();
                this.f19212z0.f4129b++;
                r1(((j) x7.a.e(this.S)).f19288a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.H = null;
                K1(null);
                H1();
            }
        } catch (Throwable th) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.H = null;
                K1(null);
                H1();
            }
        }
    }

    protected abstract void F1() throws ExoPlaybackException;

    @Override // io.bidmachine.media3.exoplayer.h2
    public final long G(long j10, long j11) {
        return V0(j10, j11, this.f19179b0);
    }

    protected void G1() {
        I1();
        J1();
        this.f19180c0 = -9223372036854775807L;
        this.f19194q0 = false;
        this.f19178a0 = -9223372036854775807L;
        this.f19193p0 = false;
        this.X = false;
        this.Y = false;
        this.f19184g0 = false;
        this.f19185h0 = false;
        this.f19198s0 = -9223372036854775807L;
        this.f19200t0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.f19191n0 = 0;
        this.f19192o0 = 0;
        this.f19190m0 = this.f19189l0 ? 1 : 0;
    }

    protected void H1() {
        G1();
        this.f19210y0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.f19196r0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.Z = false;
        this.f19179b0 = false;
        this.f19189l0 = false;
        this.f19190m0 = 0;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public void L(float f10, float f11) throws ExoPlaybackException {
        this.J = f10;
        this.K = f11;
        X1(this.M);
    }

    protected final boolean L0() throws ExoPlaybackException {
        boolean zM0 = M0();
        if (zM0) {
            m1();
        }
        return zM0;
    }

    protected boolean M0() {
        if (this.L == null) {
            return false;
        }
        int i10 = this.f19192o0;
        if (i10 == 3 || ((this.U && !this.f19196r0) || (this.V && this.f19194q0))) {
            E1();
            return true;
        }
        if (i10 == 2) {
            int i11 = l0.f28136a;
            x7.a.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    Y1();
                } catch (ExoPlaybackException e10) {
                    x7.r.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    E1();
                    return true;
                }
            }
        }
        K0();
        return false;
    }

    protected final void M1() {
        this.f19208x0 = true;
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.i2
    public final int N() {
        return 8;
    }

    protected final void N1(ExoPlaybackException exoPlaybackException) {
        this.f19210y0 = exoPlaybackException;
    }

    protected final h O0() {
        return this.L;
    }

    protected int P0(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected final j Q0() {
        return this.S;
    }

    protected boolean Q1(DecoderInputBuffer decoderInputBuffer) {
        if (!T1(decoderInputBuffer)) {
            return false;
        }
        decoderInputBuffer.g();
        this.f19212z0.f4131d++;
        return true;
    }

    protected boolean R0() {
        return false;
    }

    protected boolean R1(j jVar) {
        return true;
    }

    protected abstract float S0(float f10, u7.q qVar, u7.q[] qVarArr);

    protected boolean S1() {
        return false;
    }

    protected final MediaFormat T0() {
        return this.N;
    }

    protected boolean T1(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    protected abstract List<j> U0(l lVar, u7.q qVar, boolean z10) throws MediaCodecUtil.DecoderQueryException;

    protected boolean U1(u7.q qVar) {
        return false;
    }

    protected long V0(long j10, long j11, boolean z10) {
        return super.G(j10, j11);
    }

    protected abstract int V1(l lVar, u7.q qVar) throws MediaCodecUtil.DecoderQueryException;

    protected long W0() {
        return this.f19200t0;
    }

    protected abstract h.a X0(j jVar, u7.q qVar, MediaCrypto mediaCrypto, float f10);

    protected final long Y0() {
        return this.A0.f19222c;
    }

    protected final long Z0() {
        return this.A0.f19221b;
    }

    protected final void Z1(long j10) throws ExoPlaybackException {
        boolean z10;
        u7.q qVarJ = this.A0.f19223d.j(j10);
        if (qVarJ == null && this.C0 && this.N != null) {
            qVarJ = this.A0.f19223d.i();
        }
        if (qVarJ != null) {
            this.D = qVarJ;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.O && this.D != null)) {
            t1((u7.q) x7.a.e(this.D), this.N);
            this.O = false;
            this.C0 = false;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final int a(u7.q qVar) throws ExoPlaybackException {
        try {
            return V1(this.f19197s, qVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw T(e10, qVar, 4002);
        }
    }

    protected float a1() {
        return this.J;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean b() {
        return this.f19204v0;
    }

    protected final h2.a b1() {
        return this.G;
    }

    protected abstract void c1(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    @Override // io.bidmachine.media3.exoplayer.h
    protected void f0() {
        this.C = null;
        L1(d.f19219e);
        this.A.clear();
        M0();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void g0(boolean z10, boolean z11) throws ExoPlaybackException {
        this.f19212z0 = new b8.b();
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean h() {
        return this.C != null && (e0() || d1() || (this.f19180c0 != -9223372036854775807L && V().elapsedRealtime() < this.f19180c0));
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public void i(long j10, long j11) throws ExoPlaybackException {
        boolean z10 = false;
        if (this.f19208x0) {
            this.f19208x0 = false;
            z1();
        }
        ExoPlaybackException exoPlaybackException = this.f19210y0;
        if (exoPlaybackException != null) {
            this.f19210y0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f19204v0) {
                F1();
                return;
            }
            if (this.C != null || C1(2)) {
                m1();
                if (this.f19186i0) {
                    h0.a("bypassRender");
                    while (v0(j10, j11)) {
                    }
                    h0.b();
                } else if (this.L != null) {
                    long jElapsedRealtime = V().elapsedRealtime();
                    h0.a("drainAndFeed");
                    while (H0(j10, j11) && P1(jElapsedRealtime)) {
                    }
                    while (J0() && P1(jElapsedRealtime)) {
                    }
                    h0.b();
                } else {
                    this.f19212z0.f4131d += s0(j10);
                    C1(1);
                }
                this.f19212z0.c();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw T(e10, this.C, l0.b0(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            if (!l1(e11)) {
                throw e11;
            }
            p1(e11);
            if ((e11 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                E1();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionC0 = C0(e11, Q0());
            throw U(mediaCodecDecoderExceptionC0, this.C, z10, mediaCodecDecoderExceptionC0.f19177c == 1101 ? 4006 : 4003);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void i0(long j10, boolean z10) throws ExoPlaybackException {
        this.f19202u0 = false;
        this.f19204v0 = false;
        this.f19208x0 = false;
        if (this.f19186i0) {
            this.f19209y.g();
            this.f19207x.g();
            this.f19187j0 = false;
            this.B.d();
        } else {
            L0();
        }
        if (this.A0.f19223d.l() > 0) {
            this.f19206w0 = true;
        }
        this.A0.f19223d.c();
        this.A.clear();
    }

    protected final boolean i1() {
        return this.f19186i0;
    }

    protected final boolean j1(u7.q qVar) {
        return this.F == null && U1(qVar);
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void l0() {
        try {
            D0();
            E1();
        } finally {
            O1(null);
        }
    }

    protected final void m1() throws ExoPlaybackException {
        u7.q qVar;
        if (this.L != null || this.f19186i0 || (qVar = this.C) == null) {
            return;
        }
        if (j1(qVar)) {
            f1(qVar);
            return;
        }
        K1(this.F);
        if (this.E == null || h1()) {
            try {
                DrmSession drmSession = this.E;
                n1(this.H, drmSession != null && (drmSession.k() == 3 || this.E.k() == 4) && this.E.h((String) x7.a.i(qVar.f26252o)));
            } catch (DecoderInitializationException e10) {
                throw T(e10, qVar, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.H;
        if (mediaCrypto == null || this.L != null) {
            return;
        }
        mediaCrypto.release();
        this.H = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r5 >= r1) goto L15;
     */
    @Override // io.bidmachine.media3.exoplayer.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void o0(u7.q[] r13, long r14, long r16, io.bidmachine.media3.exoplayer.source.r.b r18) throws io.bidmachine.media3.exoplayer.ExoPlaybackException {
        /*
            r12 = this;
            r0 = r12
            io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d r1 = r0.A0
            long r1 = r1.f19222c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L27
            io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d r1 = new io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.L1(r1)
            boolean r1 = r0.D0
            if (r1 == 0) goto L6c
            r12.w1()
            goto L6c
        L27:
            java.util.ArrayDeque<io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r1 = r0.A
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5c
            long r1 = r0.f19198s0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L3f
            long r5 = r0.B0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L5c
        L3f:
            io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d r1 = new io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.L1(r1)
            io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d r1 = r0.A0
            long r1 = r1.f19222c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L6c
            r12.w1()
            goto L6c
        L5c:
            java.util.ArrayDeque<io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r1 = r0.A
            io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d r9 = new io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            long r3 = r0.f19198s0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer.o0(u7.q[], long, long, io.bidmachine.media3.exoplayer.source.r$b):void");
    }

    protected boolean o1(u7.q qVar) throws ExoPlaybackException {
        return true;
    }

    protected abstract void p1(Exception exc);

    protected abstract void q1(String str, h.a aVar, long j10, long j11);

    protected abstract void r1(String str);

    /* JADX WARN: Code duplicated, block: B:74:0x00f6  */
    protected b8.c s1(u uVar) throws ExoPlaybackException {
        int i10;
        boolean z10 = true;
        this.f19206w0 = true;
        u7.q qVarN = (u7.q) x7.a.e(uVar.f4168b);
        String str = qVarN.f26252o;
        if (str == null) {
            throw T(new IllegalArgumentException("Sample MIME type is null."), qVarN, 4005);
        }
        if (Objects.equals(str, "video/av01") && !qVarN.f26255r.isEmpty()) {
            qVarN = qVarN.b().g0(null).N();
        }
        u7.q qVar = qVarN;
        O1(uVar.f4167a);
        this.C = qVar;
        if (this.f19186i0) {
            this.f19188k0 = true;
            return null;
        }
        h hVar = this.L;
        if (hVar == null) {
            this.Q = null;
            m1();
            return null;
        }
        j jVar = (j) x7.a.e(this.S);
        u7.q qVar2 = (u7.q) x7.a.e(this.M);
        if (I0(jVar, qVar, this.E, this.F)) {
            F0();
            return new b8.c(jVar.f19288a, qVar2, qVar, 0, 128);
        }
        boolean z11 = this.F != this.E;
        x7.a.g(!z11 || l0.f28136a >= 23);
        b8.c cVarW0 = w0(jVar, qVar2, qVar);
        int i11 = cVarW0.f4148d;
        if (i11 != 0) {
            i10 = 16;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (X1(qVar)) {
                        this.M = qVar;
                        if (z11 && !G0()) {
                            i10 = 2;
                        }
                    }
                } else if (X1(qVar)) {
                    this.f19189l0 = true;
                    this.f19190m0 = 1;
                    int i12 = this.T;
                    if (i12 != 2 && (i12 != 1 || qVar.f26259v != qVar2.f26259v || qVar.f26260w != qVar2.f26260w)) {
                        z10 = false;
                    }
                    this.X = z10;
                    this.M = qVar;
                    if (z11 && !G0()) {
                        i10 = 2;
                    }
                }
            } else if (X1(qVar)) {
                this.M = qVar;
                if (!z11 ? !E0() : !G0()) {
                    i10 = 2;
                }
            }
            return (cVarW0.f4148d != 0 || (this.L == hVar && this.f19192o0 != 3)) ? cVarW0 : new b8.c(jVar.f19288a, qVar2, qVar, 0, i10);
        }
        F0();
        i10 = 0;
        if (cVarW0.f4148d != 0) {
        }
    }

    protected abstract void t1(u7.q qVar, MediaFormat mediaFormat) throws ExoPlaybackException;

    protected void v1(long j10) {
        this.B0 = j10;
        while (!this.A.isEmpty() && j10 >= this.A.peek().f19220a) {
            L1((d) x7.a.e(this.A.poll()));
            w1();
        }
    }

    protected abstract b8.c w0(j jVar, u7.q qVar, u7.q qVar2);

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.f2.b
    public void z(int i10, Object obj) throws ExoPlaybackException {
        if (i10 != 11) {
            super.z(i10, obj);
            return;
        }
        h2.a aVar = (h2.a) x7.a.e((h2.a) obj);
        this.G = aVar;
        y1(aVar);
    }

    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f19215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f19216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DecoderInitializationException f19217e;

        public DecoderInitializationException(u7.q qVar, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + qVar, th, qVar.f26252o, z10, null, c(i10), null);
        }

        private static String c(int i10) {
            return "io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException e(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f19213a, this.f19214b, this.f19215c, this.f19216d, decoderInitializationException);
        }

        public DecoderInitializationException(u7.q qVar, Throwable th, boolean z10, j jVar) {
            this("Decoder init failed: " + jVar.f19288a + ", " + qVar, th, qVar.f26252o, z10, jVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z10, j jVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.f19213a = str2;
            this.f19214b = z10;
            this.f19215c = jVar;
            this.f19216d = str3;
            this.f19217e = decoderInitializationException;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void m0() {
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void n0() {
    }

    protected void w1() {
    }

    protected void u1(long j10) {
    }

    protected void x1(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    protected void y1(h2.a aVar) {
    }
}
