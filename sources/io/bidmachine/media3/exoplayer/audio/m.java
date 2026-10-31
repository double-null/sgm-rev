package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import b8.w;
import com.adjust.sdk.Constants;
import com.google.common.collect.u;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.h2;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import u7.q;
import u7.x;
import v8.r0;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
public class m extends MediaCodecRenderer implements w {
    private final Context F0;
    private final e.a G0;
    private final AudioSink H0;
    private final k8.c I0;
    private int J0;
    private boolean K0;
    private boolean L0;
    private q M0;
    private q N0;
    private long O0;
    private boolean P0;
    private boolean Q0;
    private boolean R0;
    private int S0;
    private boolean T0;
    private long U0;
    private boolean V0;

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    private static final class b {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    private final class c implements AudioSink.b {
        private c() {
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void a(boolean z10) {
            m.this.G0.I(z10);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void b(Exception exc) {
            r.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            m.this.G0.n(exc);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void c(long j10) {
            m.this.G0.H(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void d(AudioSink.a aVar) {
            m.this.G0.p(aVar);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void e(AudioSink.a aVar) {
            m.this.G0.o(aVar);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void f() {
            m.this.R0 = true;
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void g() {
            h2.a aVarB1 = m.this.b1();
            if (aVarB1 != null) {
                aVarB1.a();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void h(int i10, long j10, long j11) {
            m.this.G0.J(i10, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void i() {
            m.this.k0();
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void j() {
            m.this.n2();
        }

        @Override // io.bidmachine.media3.exoplayer.audio.AudioSink.b
        public void k() {
            h2.a aVarB1 = m.this.b1();
            if (aVarB1 != null) {
                aVarB1.b();
            }
        }
    }

    public m(Context context, io.bidmachine.media3.exoplayer.mediacodec.h.b bVar, io.bidmachine.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, e eVar, AudioSink audioSink) {
        this(context, bVar, lVar, z10, handler, eVar, audioSink, l0.f28136a >= 35 ? new k8.c() : null);
    }

    private static boolean f2(String str) {
        if (l0.f28136a < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean g2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean h2() {
        if (l0.f28136a == 23) {
            String str = Build.MODEL;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int i2(q qVar) {
        d dVarU = this.H0.u(qVar);
        if (!dVarU.f18232a) {
            return 0;
        }
        int i10 = dVarU.f18233b ? 1536 : 512;
        return dVarU.f18234c ? i10 | 2048 : i10;
    }

    private int j2(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(jVar.f19288a) || (i10 = l0.f28136a) >= 24 || (i10 == 23 && l0.K0(this.F0))) {
            return qVar.f26253p;
        }
        return -1;
    }

    private static List<io.bidmachine.media3.exoplayer.mediacodec.j> l2(io.bidmachine.media3.exoplayer.mediacodec.l lVar, q qVar, boolean z10, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        io.bidmachine.media3.exoplayer.mediacodec.j jVarP;
        if (qVar.f26252o == null) {
            return u.H();
        }
        return (!audioSink.a(qVar) || (jVarP = MediaCodecUtil.p()) == null) ? MediaCodecUtil.m(lVar, qVar, z10, false) : u.I(jVarP);
    }

    private void o2(int i10) {
        k8.c cVar;
        this.H0.p(i10);
        if (l0.f28136a < 35 || (cVar = this.I0) == null) {
            return;
        }
        cVar.e(i10);
    }

    private void p2() {
        io.bidmachine.media3.exoplayer.mediacodec.h hVarO0 = O0();
        if (hVarO0 != null && l0.f28136a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.S0));
            hVarO0.c(bundle);
        }
    }

    private void q2() {
        long jA = this.H0.A(b());
        if (jA != Long.MIN_VALUE) {
            if (!this.P0) {
                jA = Math.max(this.O0, jA);
            }
            this.O0 = jA;
            this.P0 = false;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean A1(long j10, long j11, io.bidmachine.media3.exoplayer.mediacodec.h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, q qVar) throws ExoPlaybackException {
        x7.a.e(byteBuffer);
        this.U0 = -9223372036854775807L;
        if (this.N0 != null && (i11 & 2) != 0) {
            ((io.bidmachine.media3.exoplayer.mediacodec.h) x7.a.e(hVar)).o(i10, false);
            return true;
        }
        if (z10) {
            if (hVar != null) {
                hVar.o(i10, false);
            }
            this.f19212z0.f4133f += i12;
            this.H0.E();
            return true;
        }
        try {
            if (!this.H0.w(byteBuffer, j12, i12)) {
                this.U0 = j12;
                return false;
            }
            if (hVar != null) {
                hVar.o(i10, false);
            }
            this.f19212z0.f4132e += i12;
            return true;
        } catch (AudioSink.InitializationException e10) {
            throw U(e10, this.M0, e10.f18109b, (!i1() || W().f4174a == 0) ? 5001 : 5004);
        } catch (AudioSink.WriteException e11) {
            throw U(e11, qVar, e11.f18114b, (!i1() || W().f4174a == 0) ? 5002 : 5003);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void F1() throws ExoPlaybackException {
        try {
            this.H0.y();
            if (W0() != -9223372036854775807L) {
                this.U0 = W0();
            }
            this.V0 = true;
        } catch (AudioSink.WriteException e10) {
            throw U(e10, e10.f18115c, e10.f18114b, i1() ? 5003 : 5002);
        }
    }

    @Override // b8.w
    public long K() {
        if (k() == 2) {
            q2();
        }
        return this.O0;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float S0(float f10, q qVar, q[] qVarArr) {
        int iMax = -1;
        for (q qVar2 : qVarArr) {
            int i10 = qVar2.F;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<io.bidmachine.media3.exoplayer.mediacodec.j> U0(io.bidmachine.media3.exoplayer.mediacodec.l lVar, q qVar, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.n(l2(lVar, qVar, z10, this.H0), qVar);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean U1(q qVar) {
        if (W().f4174a != 0) {
            int iI2 = i2(qVar);
            if ((iI2 & 512) != 0) {
                if (W().f4174a == 2 || (iI2 & 1024) != 0) {
                    return true;
                }
                if (qVar.H == 0 && qVar.I == 0) {
                    return true;
                }
            }
        }
        return this.H0.a(qVar);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected long V0(long j10, long j11, boolean z10) {
        if (this.U0 == -9223372036854775807L) {
            return super.V0(j10, j11, z10);
        }
        long jQ = this.H0.q();
        if (!this.V0 && jQ == -9223372036854775807L) {
            return super.V0(j10, j11, z10);
        }
        long jMin = this.U0 - j10;
        if (jQ != -9223372036854775807L) {
            jMin = Math.min(jQ, jMin);
        }
        long jS0 = (long) ((jMin / (e() != null ? e().f26518a : 1.0f)) / 2.0f);
        if (this.T0) {
            jS0 -= l0.S0(V().elapsedRealtime()) - j11;
        }
        return Math.max(10000L, jS0);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int V1(io.bidmachine.media3.exoplayer.mediacodec.l lVar, q qVar) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        boolean z10;
        if (!u7.w.o(qVar.f26252o)) {
            return i2.v(0);
        }
        boolean z11 = true;
        boolean z12 = qVar.N != 0;
        boolean zW1 = MediaCodecRenderer.W1(qVar);
        int i11 = 8;
        if (!zW1 || (z12 && MediaCodecUtil.p() == null)) {
            i10 = 0;
        } else {
            int iI2 = i2(qVar);
            if (this.H0.a(qVar)) {
                return i2.s(4, 8, 32, iI2);
            }
            i10 = iI2;
        }
        if ("audio/raw".equals(qVar.f26252o) && !this.H0.a(qVar)) {
            return i2.v(1);
        }
        if (!this.H0.a(l0.j0(2, qVar.E, qVar.F))) {
            return i2.v(1);
        }
        List<io.bidmachine.media3.exoplayer.mediacodec.j> listL2 = l2(lVar, qVar, false, this.H0);
        if (listL2.isEmpty()) {
            return i2.v(1);
        }
        if (!zW1) {
            return i2.v(2);
        }
        io.bidmachine.media3.exoplayer.mediacodec.j jVar = listL2.get(0);
        boolean zO = jVar.o(qVar);
        if (!zO) {
            int i12 = 1;
            while (true) {
                if (i12 >= listL2.size()) {
                    z10 = true;
                    z11 = zO;
                    break;
                }
                io.bidmachine.media3.exoplayer.mediacodec.j jVar2 = listL2.get(i12);
                if (jVar2.o(qVar)) {
                    z10 = false;
                    jVar = jVar2;
                    break;
                }
                i12++;
            }
        } else {
            z10 = true;
            z11 = zO;
            break;
        }
        int i13 = z11 ? 4 : 3;
        if (z11 && jVar.r(qVar)) {
            i11 = 16;
        }
        return i2.F(i13, i11, 32, jVar.f19295h ? 64 : 0, z10 ? 128 : 0, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected io.bidmachine.media3.exoplayer.mediacodec.h.a X0(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar, MediaCrypto mediaCrypto, float f10) {
        this.J0 = k2(jVar, qVar, b0());
        this.K0 = f2(jVar.f19288a);
        this.L0 = g2(jVar.f19288a);
        MediaFormat mediaFormatM2 = m2(qVar, jVar.f19290c, this.J0, f10);
        this.N0 = "audio/raw".equals(jVar.f19289b) && !"audio/raw".equals(qVar.f26252o) ? qVar : null;
        return io.bidmachine.media3.exoplayer.mediacodec.h.a.a(jVar, mediaFormatM2, qVar, mediaCrypto, this.I0);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h2
    public boolean b() {
        return super.b() && this.H0.b();
    }

    @Override // b8.w
    public void c(x xVar) {
        this.H0.c(xVar);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void c1(DecoderInputBuffer decoderInputBuffer) {
        q qVar;
        if (l0.f28136a < 29 || (qVar = decoderInputBuffer.f18055b) == null || !Objects.equals(qVar.f26252o, "audio/opus") || !i1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) x7.a.e(decoderInputBuffer.f18060g);
        int i10 = ((q) x7.a.e(decoderInputBuffer.f18055b)).H;
        if (byteBuffer.remaining() == 8) {
            this.H0.z(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // b8.w
    public x e() {
        return this.H0.e();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void f0() {
        this.Q0 = true;
        this.M0 = null;
        this.U0 = -9223372036854775807L;
        this.V0 = false;
        try {
            this.H0.flush();
            try {
                super.f0();
            } finally {
                this.G0.s(this.f19212z0);
            }
        } catch (Throwable th) {
            try {
                super.f0();
                throw th;
            } finally {
                this.G0.s(this.f19212z0);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void g0(boolean z10, boolean z11) throws ExoPlaybackException {
        super.g0(z10, z11);
        this.G0.t(this.f19212z0);
        if (W().f4175b) {
            this.H0.F();
        } else {
            this.H0.s();
        }
        this.H0.v(a0());
        this.H0.C(V());
    }

    @Override // io.bidmachine.media3.exoplayer.h2, io.bidmachine.media3.exoplayer.i2
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h2
    public boolean h() {
        return this.H0.o() || super.h();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void i0(long j10, boolean z10) throws ExoPlaybackException {
        super.i0(j10, z10);
        this.H0.flush();
        this.O0 = j10;
        this.U0 = -9223372036854775807L;
        this.V0 = false;
        this.R0 = false;
        this.P0 = true;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void j0() {
        k8.c cVar;
        this.H0.release();
        if (l0.f28136a < 35 || (cVar = this.I0) == null) {
            return;
        }
        cVar.c();
    }

    protected int k2(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar, q[] qVarArr) {
        int iJ2 = j2(jVar, qVar);
        if (qVarArr.length == 1) {
            return iJ2;
        }
        for (q qVar2 : qVarArr) {
            if (jVar.e(qVar, qVar2).f4148d != 0) {
                iJ2 = Math.max(iJ2, j2(jVar, qVar2));
            }
        }
        return iJ2;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void l0() {
        this.R0 = false;
        this.U0 = -9223372036854775807L;
        this.V0 = false;
        try {
            super.l0();
        } finally {
            if (this.Q0) {
                this.Q0 = false;
                this.H0.reset();
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void m0() {
        super.m0();
        this.H0.n();
        this.T0 = true;
    }

    protected MediaFormat m2(q qVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", qVar.E);
        mediaFormat.setInteger("sample-rate", qVar.F);
        x7.u.e(mediaFormat, qVar.f26255r);
        x7.u.d(mediaFormat, "max-input-size", i10);
        int i11 = l0.f28136a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !h2()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(qVar.f26252o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.H0.D(l0.j0(4, qVar.E, qVar.F)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.S0));
        }
        return mediaFormat;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void n0() {
        q2();
        this.T0 = false;
        this.H0.pause();
        super.n0();
    }

    protected void n2() {
        this.P0 = true;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void p1(Exception exc) {
        r.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.G0.m(exc);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void q1(String str, io.bidmachine.media3.exoplayer.mediacodec.h.a aVar, long j10, long j11) {
        this.G0.q(str, j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void r1(String str) {
        this.G0.r(str);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected b8.c s1(b8.u uVar) throws ExoPlaybackException {
        q qVar = (q) x7.a.e(uVar.f4168b);
        this.M0 = qVar;
        b8.c cVarS1 = super.s1(uVar);
        this.G0.u(qVar, cVarS1);
        return cVarS1;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void t1(q qVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iI0;
        int i10;
        q qVar2 = this.N0;
        int[] iArrA = null;
        if (qVar2 != null) {
            qVar = qVar2;
        } else if (O0() != null) {
            x7.a.e(mediaFormat);
            if ("audio/raw".equals(qVar.f26252o)) {
                iI0 = qVar.G;
            } else if (l0.f28136a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iI0 = mediaFormat.containsKey("v-bits-per-sample") ? l0.i0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iI0 = mediaFormat.getInteger("pcm-encoding");
            }
            q qVarN = new q.b().u0("audio/raw").o0(iI0).Z(qVar.H).a0(qVar.I).n0(qVar.f26249l).X(qVar.f26250m).f0(qVar.f26238a).h0(qVar.f26239b).i0(qVar.f26240c).j0(qVar.f26241d).w0(qVar.f26242e).s0(qVar.f26243f).R(mediaFormat.getInteger("channel-count")).v0(mediaFormat.getInteger("sample-rate")).N();
            if (this.K0 && qVarN.E == 6 && (i10 = qVar.E) < 6) {
                iArrA = new int[i10];
                for (int i11 = 0; i11 < qVar.E; i11++) {
                    iArrA[i11] = i11;
                }
            } else if (this.L0) {
                iArrA = r0.a(qVarN.E);
            }
            qVar = qVarN;
        }
        try {
            if (l0.f28136a >= 29) {
                if (!i1() || W().f4174a == 0) {
                    this.H0.r(0);
                } else {
                    this.H0.r(W().f4174a);
                }
            }
            this.H0.H(qVar, 0, iArrA);
        } catch (AudioSink.ConfigurationException e10) {
            throw T(e10, e10.f18107a, 5001);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void u1(long j10) {
        this.H0.B(j10);
    }

    @Override // b8.w
    public boolean w() {
        boolean z10 = this.R0;
        this.R0 = false;
        return z10;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected b8.c w0(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar, q qVar2) {
        b8.c cVarE = jVar.e(qVar, qVar2);
        int i10 = cVarE.f4149e;
        if (j1(qVar2)) {
            i10 |= 32768;
        }
        if (j2(jVar, qVar2) > this.J0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new b8.c(jVar.f19288a, qVar, qVar2, i11 != 0 ? 0 : cVarE.f4148d, i11);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w1() {
        super.w1();
        this.H0.E();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.f2.b
    public void z(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 2) {
            this.H0.setVolume(((Float) x7.a.e(obj)).floatValue());
            return;
        }
        if (i10 == 3) {
            this.H0.x((u7.c) x7.a.e((u7.c) obj));
            return;
        }
        if (i10 == 6) {
            this.H0.G((u7.d) x7.a.e((u7.d) obj));
            return;
        }
        if (i10 == 12) {
            if (l0.f28136a >= 23) {
                b.a(this.H0, obj);
            }
        } else if (i10 == 16) {
            this.S0 = ((Integer) x7.a.e(obj)).intValue();
            p2();
        } else if (i10 == 9) {
            this.H0.I(((Boolean) x7.a.e(obj)).booleanValue());
        } else if (i10 != 10) {
            super.z(i10, obj);
        } else {
            o2(((Integer) x7.a.e(obj)).intValue());
        }
    }

    public m(Context context, io.bidmachine.media3.exoplayer.mediacodec.h.b bVar, io.bidmachine.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, e eVar, AudioSink audioSink, k8.c cVar) {
        super(1, bVar, lVar, z10, 44100.0f);
        this.F0 = context.getApplicationContext();
        this.H0 = audioSink;
        this.I0 = cVar;
        this.S0 = -1000;
        this.G0 = new e.a(handler, eVar);
        this.U0 = -9223372036854775807L;
        audioSink.t(new c());
    }

    @Override // io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.h2
    public w R() {
        return this;
    }
}
