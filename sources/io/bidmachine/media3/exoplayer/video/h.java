package io.bidmachine.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdError;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.u;
import com.google.common.util.concurrent.g0;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.h2;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil;
import io.bidmachine.media3.exoplayer.source.r;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;
import u7.d0;
import u7.l0;
import u7.q;
import u7.w;
import x7.c0;
import x7.h0;

/* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
public class h extends MediaCodecRenderer implements n.b {

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static final int[] f19854u1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static boolean f19855v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static boolean f19856w1;
    private final Context F0;
    private final boolean G0;
    private final p.a H0;
    private final int I0;
    private final boolean J0;
    private final n K0;
    private final n.a L0;
    private final io.bidmachine.media3.exoplayer.video.a M0;
    private final long N0;
    private final PriorityQueue<Long> O0;
    private e P0;
    private boolean Q0;
    private boolean R0;
    private VideoSink S0;
    private boolean T0;
    private List<Object> U0;
    private Surface V0;
    private t8.b W0;
    private c0 X0;
    private boolean Y0;
    private int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f19857a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private long f19858b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f19859c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f19860d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f19861e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private long f19862f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f19863g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private long f19864h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private l0 f19865i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private l0 f19866j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int f19867k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private boolean f19868l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private int f19869m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    f f19870n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private t8.h f19871o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private long f19872p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private long f19873q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private boolean f19874r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private boolean f19875s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private int f19876t1;

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    class b implements VideoSink.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.media3.exoplayer.mediacodec.h f19878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f19879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f19880c;

        b(io.bidmachine.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
            this.f19878a = hVar;
            this.f19879b = i10;
            this.f19880c = j10;
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.b
        public void a(long j10) {
            h.this.N2(this.f19878a, this.f19879b, this.f19880c, j10);
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.b
        public void b() {
            h.this.a3(this.f19878a, this.f19879b, this.f19880c);
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    private static final class c {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f19882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19883b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.mediacodec.h.b f19885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f19886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f19887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Handler f19888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private p f19889h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f19890i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private VideoSink f19892k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f19893l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.mediacodec.l f19884c = io.bidmachine.media3.exoplayer.mediacodec.l.f19301a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f19891j = 30.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f19894m = -9223372036854775807L;

        public d(Context context) {
            this.f19882a = context;
            this.f19885d = io.bidmachine.media3.exoplayer.mediacodec.h.b.a(context);
        }

        public h m() {
            x7.a.g(!this.f19883b);
            Handler handler = this.f19888g;
            x7.a.g((handler == null && this.f19889h == null) || !(handler == null || this.f19889h == null));
            this.f19883b = true;
            return new h(this);
        }

        public d n(long j10) {
            this.f19894m = j10;
            return this;
        }

        public d o(boolean z10) {
            this.f19893l = z10;
            return this;
        }

        public d p(long j10) {
            this.f19886e = j10;
            return this;
        }

        public d q(io.bidmachine.media3.exoplayer.mediacodec.h.b bVar) {
            this.f19885d = bVar;
            return this;
        }

        public d r(boolean z10) {
            this.f19887f = z10;
            return this;
        }

        public d s(Handler handler) {
            this.f19888g = handler;
            return this;
        }

        public d t(p pVar) {
            this.f19889h = pVar;
            return this;
        }

        public d u(int i10) {
            this.f19890i = i10;
            return this;
        }

        public d v(io.bidmachine.media3.exoplayer.mediacodec.l lVar) {
            this.f19884c = lVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    protected static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19897c;

        public e(int i10, int i11, int i12) {
            this.f19895a = i10;
            this.f19896b = i11;
            this.f19897c = i12;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    private final class f implements io.bidmachine.media3.exoplayer.mediacodec.h.d, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f19898a;

        public f(io.bidmachine.media3.exoplayer.mediacodec.h hVar) {
            Handler handlerB = x7.l0.B(this);
            this.f19898a = handlerB;
            hVar.h(this, handlerB);
        }

        private void b(long j10) {
            h hVar = h.this;
            if (this != hVar.f19870n1 || hVar.O0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                h.this.K2();
                return;
            }
            try {
                h.this.J2(j10);
            } catch (ExoPlaybackException e10) {
                h.this.N1(e10);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.h.d
        public void a(io.bidmachine.media3.exoplayer.mediacodec.h hVar, long j10, long j11) {
            if (x7.l0.f28136a >= 30) {
                b(j10);
            } else {
                this.f19898a.sendMessageAtFrontOfQueue(Message.obtain(this.f19898a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(x7.l0.r1(message.arg1, message.arg2));
            return true;
        }
    }

    protected h(d dVar) {
        super(2, dVar.f19885d, dVar.f19884c, dVar.f19887f, dVar.f19891j);
        Context applicationContext = dVar.f19882a.getApplicationContext();
        this.F0 = applicationContext;
        this.I0 = dVar.f19890i;
        this.S0 = dVar.f19892k;
        this.H0 = new p.a(dVar.f19888g, dVar.f19889h);
        this.G0 = this.S0 == null;
        this.K0 = new n(applicationContext, this, dVar.f19886e);
        this.L0 = new n.a();
        this.J0 = j2();
        this.X0 = c0.f28098c;
        this.Z0 = 1;
        this.f19857a1 = 0;
        this.f19865i1 = l0.f26202e;
        this.f19869m1 = 0;
        this.f19866j1 = null;
        this.f19867k1 = -1000;
        this.f19872p1 = -9223372036854775807L;
        this.f19873q1 = -9223372036854775807L;
        this.M0 = dVar.f19893l ? new io.bidmachine.media3.exoplayer.video.a() : null;
        this.O0 = new PriorityQueue<>();
        this.N0 = dVar.f19894m != -9223372036854775807L ? -dVar.f19894m : -9223372036854775807L;
    }

    private void A2() {
        if (!this.K0.i() || this.V0 == null) {
            return;
        }
        I2();
    }

    private void B2() {
        int i10 = this.f19863g1;
        if (i10 != 0) {
            this.H0.B(this.f19862f1, i10);
            this.f19862f1 = 0L;
            this.f19863g1 = 0;
        }
    }

    private void C2(l0 l0Var) {
        if (l0Var.equals(l0.f26202e) || l0Var.equals(this.f19866j1)) {
            return;
        }
        this.f19866j1 = l0Var;
        this.H0.D(l0Var);
    }

    private void D2() {
        Surface surface = this.V0;
        if (surface == null || !this.Y0) {
            return;
        }
        this.H0.A(surface);
    }

    private void E2() {
        l0 l0Var = this.f19866j1;
        if (l0Var != null) {
            this.H0.D(l0Var);
        }
    }

    private void F2(MediaFormat mediaFormat) {
        if (this.S0 == null || x7.l0.H0(this.F0)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void G2() {
        int i10;
        io.bidmachine.media3.exoplayer.mediacodec.h hVarO0;
        if (!this.f19868l1 || (i10 = x7.l0.f28136a) < 23 || (hVarO0 = O0()) == null) {
            return;
        }
        this.f19870n1 = new f(hVarO0);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            hVarO0.c(bundle);
        }
    }

    private void H2(long j10, long j11, q qVar) {
        t8.h hVar = this.f19871o1;
        if (hVar != null) {
            hVar.a(j10, j11, qVar, T0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        this.H0.A(this.V0);
        this.Y0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        M1();
    }

    private void L2(io.bidmachine.media3.exoplayer.mediacodec.h hVar, int i10, long j10, q qVar) {
        long jG = this.L0.g();
        long jF = this.L0.f();
        if (X2() && jG == this.f19864h1) {
            a3(hVar, i10, j10);
        } else {
            H2(j10, jG, qVar);
            O2(hVar, i10, j10, jG);
        }
        g3(jF);
        this.f19864h1 = jG;
    }

    private void M2() {
        t8.b bVar = this.W0;
        if (bVar != null) {
            bVar.release();
            this.W0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2(io.bidmachine.media3.exoplayer.mediacodec.h hVar, int i10, long j10, long j11) {
        O2(hVar, i10, j10, j11);
    }

    private static void P2(io.bidmachine.media3.exoplayer.mediacodec.h hVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        hVar.c(bundle);
    }

    private void Q2(Object obj) throws ExoPlaybackException {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.V0 == surface) {
            if (surface != null) {
                E2();
                D2();
                return;
            }
            return;
        }
        this.V0 = surface;
        if (this.S0 == null) {
            this.K0.q(surface);
        }
        this.Y0 = false;
        int iK = k();
        io.bidmachine.media3.exoplayer.mediacodec.h hVarO0 = O0();
        if (hVarO0 != null && this.S0 == null) {
            io.bidmachine.media3.exoplayer.mediacodec.j jVar = (io.bidmachine.media3.exoplayer.mediacodec.j) x7.a.e(Q0());
            boolean zV2 = v2(jVar);
            if (x7.l0.f28136a < 23 || !zV2 || this.Q0) {
                E1();
                m1();
            } else {
                R2(hVarO0, u2(jVar));
            }
        }
        if (surface != null) {
            E2();
        } else {
            this.f19866j1 = null;
            VideoSink videoSink = this.S0;
            if (videoSink != null) {
                videoSink.v();
            }
        }
        if (iK == 2) {
            VideoSink videoSink2 = this.S0;
            if (videoSink2 != null) {
                videoSink2.z(true);
            } else {
                this.K0.e(true);
            }
        }
        G2();
    }

    private void R2(io.bidmachine.media3.exoplayer.mediacodec.h hVar, Surface surface) {
        int i10 = x7.l0.f28136a;
        if (i10 >= 23 && surface != null) {
            S2(hVar, surface);
        } else {
            if (i10 < 35) {
                throw new IllegalStateException();
            }
            i2(hVar);
        }
    }

    private static int b3(Context context, io.bidmachine.media3.exoplayer.mediacodec.l lVar, q qVar) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10 = 0;
        if (!w.t(qVar.f26252o)) {
            return i2.v(0);
        }
        boolean z11 = qVar.f26256s != null;
        List<io.bidmachine.media3.exoplayer.mediacodec.j> listQ2 = q2(context, lVar, qVar, z11, false);
        if (z11 && listQ2.isEmpty()) {
            listQ2 = q2(context, lVar, qVar, false, false);
        }
        if (listQ2.isEmpty()) {
            return i2.v(1);
        }
        if (!MediaCodecRenderer.W1(qVar)) {
            return i2.v(2);
        }
        io.bidmachine.media3.exoplayer.mediacodec.j jVar = listQ2.get(0);
        boolean zO = jVar.o(qVar);
        if (!zO) {
            int i11 = 1;
            while (true) {
                if (i11 >= listQ2.size()) {
                    z10 = true;
                    break;
                }
                io.bidmachine.media3.exoplayer.mediacodec.j jVar2 = listQ2.get(i11);
                if (jVar2.o(qVar)) {
                    z10 = false;
                    zO = true;
                    jVar = jVar2;
                    break;
                }
                i11++;
            }
        } else {
            z10 = true;
            break;
        }
        int i12 = zO ? 4 : 3;
        int i13 = jVar.r(qVar) ? 16 : 8;
        int i14 = jVar.f19295h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (x7.l0.f28136a >= 26 && "video/dolby-vision".equals(qVar.f26252o) && !c.a(context)) {
            i15 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (zO) {
            List<io.bidmachine.media3.exoplayer.mediacodec.j> listQ3 = q2(context, lVar, qVar, z11, true);
            if (!listQ3.isEmpty()) {
                io.bidmachine.media3.exoplayer.mediacodec.j jVar3 = MediaCodecUtil.n(listQ3, qVar).get(0);
                if (jVar3.o(qVar) && jVar3.r(qVar)) {
                    i10 = 32;
                }
            }
        }
        return i2.r(i12, i13, i10, i14, i15);
    }

    private void c3() {
        io.bidmachine.media3.exoplayer.mediacodec.h hVarO0 = O0();
        if (hVarO0 != null && x7.l0.f28136a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f19867k1));
            hVarO0.c(bundle);
        }
    }

    private void e3(long j10) {
        int i10 = 0;
        while (true) {
            Long lPeek = this.O0.peek();
            if (lPeek == null || lPeek.longValue() >= j10) {
                break;
            }
            i10++;
            this.O0.poll();
        }
        d3(i10, 0);
    }

    private void f3(r.b bVar) {
        d0 d0VarD0 = d0();
        if (d0VarD0.q()) {
            this.f19873q1 = -9223372036854775807L;
        } else {
            this.f19873q1 = d0VarD0.h(((r.b) x7.a.e(bVar)).f19684a, new d0.b()).j();
        }
    }

    private static boolean j2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    public static int n2(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar) {
        int i10 = qVar.f26259v;
        int i11 = qVar.f26260w;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        String str = (String) x7.a.e(qVar.f26252o);
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairI = MediaCodecUtil.i(qVar);
            if (pairI == null) {
                str = "video/hevc";
            } else {
                int iIntValue = ((Integer) pairI.first).intValue();
                if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                    str = "video/avc";
                } else if (iIntValue == 1024) {
                    str = "video/av01";
                } else {
                    str = "video/hevc";
                }
            }
        }
        str.hashCode();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return s2(i10 * i11, 2);
            case "video/hevc":
                return Math.max(2097152, s2(i10 * i11, 2));
            case "video/avc":
                String str2 = Build.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Build.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && jVar.f19294g)))) {
                    return -1;
                }
                return s2(x7.l0.k(i10, 16) * x7.l0.k(i11, 16) * 16 * 16, 2);
            case "video/x-vnd.on2.vp9":
                return s2(i10 * i11, 4);
            default:
                return -1;
        }
    }

    private static Point o2(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar) {
        int i10 = qVar.f26260w;
        int i11 = qVar.f26259v;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f19854u1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            int i15 = z10 ? i14 : i13;
            if (!z10) {
                i13 = i14;
            }
            Point pointC = jVar.c(i15, i13);
            float f11 = qVar.f26261x;
            if (pointC != null && jVar.u(pointC.x, pointC.y, f11)) {
                return pointC;
            }
        }
        return null;
    }

    private static List<io.bidmachine.media3.exoplayer.mediacodec.j> q2(Context context, io.bidmachine.media3.exoplayer.mediacodec.l lVar, q qVar, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        String str = qVar.f26252o;
        if (str == null) {
            return u.H();
        }
        if (x7.l0.f28136a >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List<io.bidmachine.media3.exoplayer.mediacodec.j> listG = MediaCodecUtil.g(lVar, qVar, z10, z11);
            if (!listG.isEmpty()) {
                return listG;
            }
        }
        return MediaCodecUtil.m(lVar, qVar, z10, z11);
    }

    protected static int r2(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar) {
        if (qVar.f26253p == -1) {
            return n2(jVar, qVar);
        }
        int size = qVar.f26255r.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += qVar.f26255r.get(i10).length;
        }
        return qVar.f26253p + length;
    }

    private static int s2(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private Surface u2(io.bidmachine.media3.exoplayer.mediacodec.j jVar) {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            return videoSink.a();
        }
        Surface surface = this.V0;
        if (surface != null) {
            return surface;
        }
        if (Y2(jVar)) {
            return null;
        }
        x7.a.g(Z2(jVar));
        t8.b bVar = this.W0;
        if (bVar != null && bVar.f25622a != jVar.f19294g) {
            M2();
        }
        if (this.W0 == null) {
            this.W0 = t8.b.c(this.F0, jVar.f19294g);
        }
        return this.W0;
    }

    private boolean v2(io.bidmachine.media3.exoplayer.mediacodec.j jVar) {
        Surface surface;
        return this.S0 != null || ((surface = this.V0) != null && surface.isValid()) || Y2(jVar) || Z2(jVar);
    }

    private boolean w2(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.f18059f < Z();
    }

    private boolean x2(DecoderInputBuffer decoderInputBuffer) {
        if (n() || decoderInputBuffer.m() || this.f19873q1 == -9223372036854775807L) {
            return true;
        }
        return this.f19873q1 - (decoderInputBuffer.f18059f - Y0()) <= 100000;
    }

    private void z2() {
        if (this.f19859c1 > 0) {
            long jElapsedRealtime = V().elapsedRealtime();
            this.H0.n(this.f19859c1, jElapsedRealtime - this.f19858b1);
            this.f19859c1 = 0;
            this.f19858b1 = jElapsedRealtime;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean A1(long j10, long j11, io.bidmachine.media3.exoplayer.mediacodec.h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, q qVar) throws ExoPlaybackException {
        x7.a.e(hVar);
        long jY0 = j12 - Y0();
        e3(j12);
        if (this.S0 != null) {
            if (!z10 || z11) {
                return this.S0.r(m2() + j12, z11, new b(hVar, i10, jY0));
            }
            a3(hVar, i10, jY0);
            return true;
        }
        int iC = this.K0.c(j12, j10, j11, Z0(), z10, z11, this.L0);
        if (iC == 0) {
            long jNanoTime = V().nanoTime();
            H2(jY0, jNanoTime, qVar);
            N2(hVar, i10, jY0, jNanoTime);
            g3(this.L0.f());
            return true;
        }
        if (iC == 1) {
            L2((io.bidmachine.media3.exoplayer.mediacodec.h) x7.a.i(hVar), i10, jY0, qVar);
            return true;
        }
        if (iC == 2) {
            k2(hVar, i10, jY0);
            g3(this.L0.f());
            return true;
        }
        if (iC == 3) {
            a3(hVar, i10, jY0);
            g3(this.L0.f());
            return true;
        }
        if (iC == 4 || iC == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iC));
    }

    @Override // io.bidmachine.media3.exoplayer.video.n.b
    public boolean C(long j10, long j11) {
        return W2(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException C0(Throwable th, io.bidmachine.media3.exoplayer.mediacodec.j jVar) {
        return new MediaCodecVideoDecoderException(th, jVar, this.V0);
    }

    @Override // io.bidmachine.media3.exoplayer.video.n.b
    public boolean E(long j10, long j11, long j12, boolean z10, boolean z11) throws ExoPlaybackException {
        if (this.N0 != -9223372036854775807L) {
            this.f19875s1 = ((j11 > (Z() + 200000) ? 1 : (j11 == (Z() + 200000) ? 0 : -1)) > 0) && j10 < this.N0;
        }
        return U2(j10, j12, z10) && y2(j11, z11);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void F1() {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.g();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void G1() {
        super.G1();
        this.O0.clear();
        this.f19875s1 = false;
        this.f19861e1 = 0;
        this.f19876t1 = 0;
        io.bidmachine.media3.exoplayer.video.a aVar = this.M0;
        if (aVar != null) {
            aVar.c();
        }
    }

    protected void J2(long j10) throws ExoPlaybackException {
        Z1(j10);
        C2(this.f19865i1);
        this.f19212z0.f4132e++;
        A2();
        v1(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h2
    public void L(float f10, float f11) throws ExoPlaybackException {
        super.L(f10, f11);
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.u(f10);
        } else {
            this.K0.r(f10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.video.n.b
    public boolean M(long j10, long j11, boolean z10) {
        return V2(j10, j11, z10);
    }

    protected void O2(io.bidmachine.media3.exoplayer.mediacodec.h hVar, int i10, long j10, long j11) {
        h0.a("releaseOutputBuffer");
        hVar.l(i10, j11);
        h0.b();
        this.f19212z0.f4132e++;
        this.f19860d1 = 0;
        if (this.S0 == null) {
            C2(this.f19865i1);
            A2();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int P0(DecoderInputBuffer decoderInputBuffer) {
        return (x7.l0.f28136a >= 34 && this.f19868l1 && w2(decoderInputBuffer)) ? 32 : 0;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean Q1(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (x2(decoderInputBuffer) || decoderInputBuffer.s()) {
            return false;
        }
        boolean zW2 = w2(decoderInputBuffer);
        if ((!zW2 && !this.f19875s1) || decoderInputBuffer.i()) {
            return false;
        }
        if (decoderInputBuffer.n()) {
            decoderInputBuffer.g();
            if (zW2) {
                this.f19212z0.f4131d++;
            } else if (this.f19875s1) {
                this.O0.add(Long.valueOf(decoderInputBuffer.f18059f));
                this.f19876t1++;
            }
            return true;
        }
        if (this.M0 != null && ((io.bidmachine.media3.exoplayer.mediacodec.j) x7.a.e(Q0())).f19289b.equals("video/av01") && (byteBuffer = decoderInputBuffer.f18057d) != null) {
            boolean z10 = zW2 || this.f19876t1 <= 0;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer.flip();
            int iD = this.M0.d(byteBufferAsReadOnlyBuffer, z10);
            boolean z11 = ((e) x7.a.e(this.P0)).f19897c + iD < byteBufferAsReadOnlyBuffer.capacity();
            if (iD != byteBufferAsReadOnlyBuffer.limit() && z11) {
                ((ByteBuffer) x7.a.e(decoderInputBuffer.f18057d)).position(iD);
                if (zW2) {
                    this.f19212z0.f4131d++;
                } else if (this.f19875s1) {
                    this.O0.add(Long.valueOf(decoderInputBuffer.f18059f));
                    this.f19876t1++;
                }
                return true;
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean R0() {
        return this.f19868l1 && x7.l0.f28136a < 23;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean R1(io.bidmachine.media3.exoplayer.mediacodec.j jVar) {
        return v2(jVar);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float S0(float f10, q qVar, q[] qVarArr) {
        float fMax = -1.0f;
        for (q qVar2 : qVarArr) {
            float f11 = qVar2.f26261x;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    protected void S2(io.bidmachine.media3.exoplayer.mediacodec.h hVar, Surface surface) {
        hVar.j(surface);
    }

    public void T2(List<Object> list) {
        this.U0 = list;
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.l(list);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<io.bidmachine.media3.exoplayer.mediacodec.j> U0(io.bidmachine.media3.exoplayer.mediacodec.l lVar, q qVar, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.n(q2(this.F0, lVar, qVar, z10, this.f19868l1), qVar);
    }

    protected boolean U2(long j10, long j11, boolean z10) {
        return j10 < -500000 && !z10;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int V1(io.bidmachine.media3.exoplayer.mediacodec.l lVar, q qVar) throws MediaCodecUtil.DecoderQueryException {
        return b3(this.F0, lVar, qVar);
    }

    protected boolean V2(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    protected boolean W2(long j10, long j11) {
        return j10 < -30000 && j11 > 100000;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected io.bidmachine.media3.exoplayer.mediacodec.h.a X0(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar, MediaCrypto mediaCrypto, float f10) {
        String str = jVar.f19290c;
        e eVarP2 = p2(jVar, qVar, b0());
        this.P0 = eVarP2;
        MediaFormat mediaFormatT2 = t2(qVar, str, eVarP2, f10, this.J0, this.f19868l1 ? this.f19869m1 : 0);
        Surface surfaceU2 = u2(jVar);
        F2(mediaFormatT2);
        return io.bidmachine.media3.exoplayer.mediacodec.h.a.b(jVar, mediaFormatT2, qVar, surfaceU2, mediaCrypto);
    }

    protected boolean X2() {
        return true;
    }

    protected boolean Y2(io.bidmachine.media3.exoplayer.mediacodec.j jVar) {
        return x7.l0.f28136a >= 35 && jVar.f19298k;
    }

    protected boolean Z2(io.bidmachine.media3.exoplayer.mediacodec.j jVar) {
        return x7.l0.f28136a >= 23 && !this.f19868l1 && !h2(jVar.f19288a) && (!jVar.f19294g || t8.b.b(this.F0));
    }

    protected void a3(io.bidmachine.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
        h0.a("skipVideoBuffer");
        hVar.o(i10, false);
        h0.b();
        this.f19212z0.f4133f++;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h2
    public boolean b() {
        VideoSink videoSink;
        return super.b() && ((videoSink = this.S0) == null || videoSink.b());
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void c1(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.R0) {
            ByteBuffer byteBuffer = (ByteBuffer) x7.a.e(decoderInputBuffer.f18060g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        P2((io.bidmachine.media3.exoplayer.mediacodec.h) x7.a.e(O0()), bArr);
                    }
                }
            }
        }
    }

    protected void d3(int i10, int i11) {
        b8.b bVar = this.f19212z0;
        bVar.f4135h += i10;
        int i12 = i10 + i11;
        bVar.f4134g += i12;
        this.f19859c1 += i12;
        int i13 = this.f19860d1 + i12;
        this.f19860d1 = i13;
        bVar.f4136i = Math.max(i13, bVar.f4136i);
        int i14 = this.I0;
        if (i14 <= 0 || this.f19859c1 < i14) {
            return;
        }
        z2();
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public void f() {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.f();
        } else {
            this.K0.a();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void f0() {
        this.f19866j1 = null;
        this.f19873q1 = -9223372036854775807L;
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.s();
        } else {
            this.K0.g();
        }
        G2();
        this.Y0 = false;
        this.f19870n1 = null;
        try {
            super.f0();
        } finally {
            this.H0.m(this.f19212z0);
            this.H0.D(l0.f26202e);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void g0(boolean z10, boolean z11) throws ExoPlaybackException {
        super.g0(z10, z11);
        boolean z12 = W().f4175b;
        x7.a.g((z12 && this.f19869m1 == 0) ? false : true);
        if (this.f19868l1 != z12) {
            this.f19868l1 = z12;
            E1();
        }
        this.H0.o(this.f19212z0);
        if (!this.T0) {
            if (this.U0 != null && this.S0 == null) {
                i iVarH = new i.b(this.F0, this.K0).i(V()).h();
                iVarH.P(1);
                this.S0 = iVarH.C(0);
            }
            this.T0 = true;
        }
        VideoSink videoSink = this.S0;
        if (videoSink == null) {
            this.K0.o(V());
            this.K0.h(z11);
            return;
        }
        videoSink.w(new a(), g0.a());
        t8.h hVar = this.f19871o1;
        if (hVar != null) {
            this.S0.A(hVar);
        }
        if (this.V0 != null && !this.X0.equals(c0.f28098c)) {
            this.S0.y(this.V0, this.X0);
        }
        this.S0.t(this.f19857a1);
        this.S0.u(a1());
        List<Object> list = this.U0;
        if (list != null) {
            this.S0.l(list);
        }
        this.S0.o(z11);
        h2.a aVarB1 = b1();
        if (aVarB1 != null) {
            this.S0.e(aVarB1);
        }
    }

    protected void g2(VideoSink videoSink, int i10, q qVar) {
        List<Object> listH = this.U0;
        if (listH == null) {
            listH = u.H();
        }
        videoSink.d(i10, qVar, listH);
    }

    protected void g3(long j10) {
        this.f19212z0.a(j10);
        this.f19862f1 += j10;
        this.f19863g1++;
    }

    @Override // io.bidmachine.media3.exoplayer.h2, io.bidmachine.media3.exoplayer.i2
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h2
    public boolean h() {
        boolean zH = super.h();
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            return videoSink.n(zH);
        }
        if (zH && (O0() == null || this.f19868l1)) {
            return true;
        }
        return this.K0.d(zH);
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void h0() {
        super.h0();
    }

    protected boolean h2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!f19855v1) {
                f19856w1 = l2();
                f19855v1 = true;
            }
        }
        return f19856w1;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h2
    public void i(long j10, long j11) throws ExoPlaybackException {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            try {
                videoSink.i(j10, j11);
            } catch (VideoSink.VideoSinkException e10) {
                throw T(e10, e10.f19834a, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.i(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void i0(long j10, boolean z10) throws ExoPlaybackException {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            if (!z10) {
                videoSink.x(true);
            }
            this.S0.h(Z0(), m2());
            this.f19874r1 = true;
        }
        super.i0(j10, z10);
        if (this.S0 == null) {
            this.K0.m();
        }
        if (z10) {
            VideoSink videoSink2 = this.S0;
            if (videoSink2 != null) {
                videoSink2.z(false);
            } else {
                this.K0.e(false);
            }
        }
        G2();
        this.f19860d1 = 0;
    }

    protected void i2(io.bidmachine.media3.exoplayer.mediacodec.h hVar) {
        hVar.f();
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void j0() {
        super.j0();
        VideoSink videoSink = this.S0;
        if (videoSink == null || !this.G0) {
            return;
        }
        videoSink.release();
    }

    protected void k2(io.bidmachine.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
        h0.a("dropVideoBuffer");
        hVar.o(i10, false);
        h0.b();
        d3(0, 1);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void l0() {
        try {
            super.l0();
        } finally {
            this.T0 = false;
            this.f19872p1 = -9223372036854775807L;
            M2();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void m0() {
        super.m0();
        this.f19859c1 = 0;
        this.f19858b1 = V().elapsedRealtime();
        this.f19862f1 = 0L;
        this.f19863g1 = 0;
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.p();
        } else {
            this.K0.k();
        }
    }

    protected long m2() {
        return -this.f19872p1;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void n0() {
        z2();
        B2();
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.k();
        } else {
            this.K0.l();
        }
        super.n0();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h
    protected void o0(q[] qVarArr, long j10, long j11, r.b bVar) throws ExoPlaybackException {
        super.o0(qVarArr, j10, j11, bVar);
        if (this.f19872p1 == -9223372036854775807L) {
            this.f19872p1 = j10;
        }
        f3(bVar);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean o1(q qVar) throws ExoPlaybackException {
        VideoSink videoSink = this.S0;
        if (videoSink == null || videoSink.isInitialized()) {
            return true;
        }
        try {
            return this.S0.m(qVar);
        } catch (VideoSink.VideoSinkException e10) {
            throw T(e10, qVar, 7000);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void p1(Exception exc) {
        x7.r.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.H0.C(exc);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void q1(String str, io.bidmachine.media3.exoplayer.mediacodec.h.a aVar, long j10, long j11) {
        this.H0.k(str, j10, j11);
        this.Q0 = h2(str);
        this.R0 = ((io.bidmachine.media3.exoplayer.mediacodec.j) x7.a.e(Q0())).p();
        G2();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void r1(String str) {
        this.H0.l(str);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected b8.c s1(b8.u uVar) throws ExoPlaybackException {
        b8.c cVarS1 = super.s1(uVar);
        this.H0.p((q) x7.a.e(uVar.f4168b), cVarS1);
        return cVarS1;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void t1(q qVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        io.bidmachine.media3.exoplayer.mediacodec.h hVarO0 = O0();
        if (hVarO0 != null) {
            hVarO0.g(this.Z0);
        }
        if (this.f19868l1) {
            i10 = qVar.f26259v;
            integer = qVar.f26260w;
        } else {
            x7.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            i10 = integer2;
        }
        float f10 = qVar.f26263z;
        int i11 = qVar.f26262y;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f19865i1 = new l0(i10, integer, f10);
        VideoSink videoSink = this.S0;
        if (videoSink == null || !this.f19874r1) {
            this.K0.p(qVar.f26261x);
        } else {
            g2(videoSink, 1, qVar.b().B0(i10).d0(integer).q0(f10).N());
        }
        this.f19874r1 = false;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void v1(long j10) {
        super.v1(j10);
        if (this.f19868l1) {
            return;
        }
        this.f19861e1--;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected b8.c w0(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar, q qVar2) {
        b8.c cVarE = jVar.e(qVar, qVar2);
        int i10 = cVarE.f4149e;
        e eVar = (e) x7.a.e(this.P0);
        if (qVar2.f26259v > eVar.f19895a || qVar2.f26260w > eVar.f19896b) {
            i10 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (r2(jVar, qVar2) > eVar.f19897c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new b8.c(jVar.f19288a, qVar, qVar2, i11 != 0 ? 0 : cVarE.f4148d, i11);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w1() {
        super.w1();
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.g();
            this.S0.h(Z0(), m2());
        } else {
            this.K0.j();
        }
        this.f19874r1 = true;
        G2();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void x1(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        ByteBuffer byteBuffer;
        if (this.M0 != null && ((io.bidmachine.media3.exoplayer.mediacodec.j) x7.a.e(Q0())).f19289b.equals("video/av01") && (byteBuffer = decoderInputBuffer.f18057d) != null) {
            this.M0.b(byteBuffer);
        }
        this.f19876t1 = 0;
        boolean z10 = this.f19868l1;
        if (!z10) {
            this.f19861e1++;
        }
        if (x7.l0.f28136a >= 23 || !z10) {
            return;
        }
        J2(decoderInputBuffer.f18059f);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void y1(h2.a aVar) {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.e(aVar);
        }
    }

    protected boolean y2(long j10, boolean z10) throws ExoPlaybackException {
        int iS0 = s0(j10);
        if (iS0 == 0) {
            return false;
        }
        if (z10) {
            b8.b bVar = this.f19212z0;
            int i10 = bVar.f4131d + iS0;
            bVar.f4131d = i10;
            bVar.f4133f += this.f19861e1;
            bVar.f4131d = i10 + this.O0.size();
        } else {
            this.f19212z0.f4137j++;
            d3(iS0 + this.O0.size(), this.f19861e1);
        }
        L0();
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.x(false);
        }
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer, io.bidmachine.media3.exoplayer.h, io.bidmachine.media3.exoplayer.f2.b
    public void z(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            Q2(obj);
            return;
        }
        if (i10 == 7) {
            t8.h hVar = (t8.h) x7.a.e(obj);
            this.f19871o1 = hVar;
            VideoSink videoSink = this.S0;
            if (videoSink != null) {
                videoSink.A(hVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) x7.a.e(obj)).intValue();
            if (this.f19869m1 != iIntValue) {
                this.f19869m1 = iIntValue;
                if (this.f19868l1) {
                    E1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            this.Z0 = ((Integer) x7.a.e(obj)).intValue();
            io.bidmachine.media3.exoplayer.mediacodec.h hVarO0 = O0();
            if (hVarO0 != null) {
                hVarO0.g(this.Z0);
                return;
            }
            return;
        }
        if (i10 == 5) {
            int iIntValue2 = ((Integer) x7.a.e(obj)).intValue();
            this.f19857a1 = iIntValue2;
            VideoSink videoSink2 = this.S0;
            if (videoSink2 != null) {
                videoSink2.t(iIntValue2);
                return;
            } else {
                this.K0.n(iIntValue2);
                return;
            }
        }
        if (i10 == 13) {
            T2((List) x7.a.e(obj));
            return;
        }
        if (i10 == 14) {
            c0 c0Var = (c0) x7.a.e(obj);
            if (c0Var.b() == 0 || c0Var.a() == 0) {
                return;
            }
            this.X0 = c0Var;
            VideoSink videoSink3 = this.S0;
            if (videoSink3 != null) {
                videoSink3.y((Surface) x7.a.i(this.V0), c0Var);
                return;
            }
            return;
        }
        if (i10 == 16) {
            this.f19867k1 = ((Integer) x7.a.e(obj)).intValue();
            c3();
        } else {
            if (i10 != 17) {
                super.z(i10, obj);
                return;
            }
            Surface surface = this.V0;
            Q2(null);
            ((h) x7.a.e(obj)).z(1, surface);
        }
    }

    private static boolean l2() {
        byte b10;
        int i10 = x7.l0.f28136a;
        byte b11 = 7;
        if (i10 <= 28) {
            String str = Build.DEVICE;
            str.hashCode();
            switch (str.hashCode()) {
                case -1339091551:
                    b10 = !str.equals("dangal") ? (byte) -1 : (byte) 0;
                    break;
                case -1220081023:
                    b10 = !str.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                    break;
                case -1220066608:
                    b10 = !str.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                    break;
                case -1012436106:
                    b10 = !str.equals(sRGQSqxgxlS.snO) ? (byte) -1 : (byte) 3;
                    break;
                case -760312546:
                    b10 = !str.equals("aquaman") ? (byte) -1 : (byte) 4;
                    break;
                case -64886864:
                    b10 = !str.equals("magnolia") ? (byte) -1 : (byte) 5;
                    break;
                case 3415681:
                    b10 = !str.equals("once") ? (byte) -1 : (byte) 6;
                    break;
                case 825323514:
                    b10 = !str.equals("machuca") ? (byte) -1 : (byte) 7;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
            }
        }
        if (i10 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.hashCode();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i10 <= 26) {
                    String str3 = Build.DEVICE;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b11 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b11 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b11 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b11 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b11 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b11 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b11 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b11 = -1;
                            }
                            break;
                        case -1936688066:
                            b11 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b11 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b11 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b11 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b11 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b11 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b11 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b11 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b11 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b11 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b11 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b11 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b11 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b11 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b11 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b11 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b11 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b11 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b11 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b11 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b11 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b11 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b11 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b11 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b11 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b11 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b11 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b11 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b11 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b11 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b11 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b11 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b11 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b11 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b11 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b11 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b11 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b11 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b11 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b11 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b11 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b11 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b11 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b11 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b11 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b11 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b11 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b11 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b11 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b11 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b11 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b11 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b11 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b11 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b11 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b11 = !str3.equals("1713") ? (byte) -1 : Utf8.REPLACEMENT_BYTE;
                            break;
                        case 1514185:
                            b11 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b11 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b11 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b11 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b11 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b11 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b11 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b11 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b11 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b11 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b11 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b11 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b11 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b11 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b11 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b11 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b11 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b11 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b11 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b11 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b11 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b11 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b11 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b11 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b11 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b11 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b11 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b11 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b11 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b11 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b11 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b11 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b11 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b11 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b11 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b11 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b11 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b11 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b11 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b11 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b11 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b11 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b11 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b11 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b11 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b11 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b11 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b11 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b11 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b11 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b11 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b11 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b11 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b11 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b11 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b11 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b11 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b11 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b11 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b11 = !str3.equals(EFLCCdIRcb.XJBaGfMO) ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b11 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b11 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b11 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b11 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b11 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b11 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b11 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b11 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b11 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b11 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b11 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b11 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b11 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b11 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b11 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b11 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    switch (b11) {
                        default:
                            str2.hashCode();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case INVALID_METRICS_ENDPOINT_VALUE:
                        case 126:
                        case 127:
                        case 128:
                        case EMPTY_TPAT_ERROR_VALUE:
                        case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                        case STORE_REGION_CODE_ERROR_VALUE:
                        case INVALID_CONFIG_RESPONSE_VALUE:
                        case PRIVACY_URL_ERROR_VALUE:
                        case TPAT_RETRY_FAILED_VALUE:
                        case CONFIG_REFRESH_FAILED_VALUE:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    protected e p2(io.bidmachine.media3.exoplayer.mediacodec.j jVar, q qVar, q[] qVarArr) {
        int iN2;
        int iMax = qVar.f26259v;
        int iMax2 = qVar.f26260w;
        int iR2 = r2(jVar, qVar);
        if (qVarArr.length == 1) {
            if (iR2 != -1 && (iN2 = n2(jVar, qVar)) != -1) {
                iR2 = Math.min((int) (iR2 * 1.5f), iN2);
            }
            return new e(iMax, iMax2, iR2);
        }
        int length = qVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            q qVarN = qVarArr[i10];
            if (qVar.C != null && qVarN.C == null) {
                qVarN = qVarN.b().T(qVar.C).N();
            }
            if (jVar.e(qVar, qVarN).f4148d != 0) {
                int i11 = qVarN.f26259v;
                z10 |= i11 == -1 || qVarN.f26260w == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, qVarN.f26260w);
                iR2 = Math.max(iR2, r2(jVar, qVarN));
            }
        }
        if (z10) {
            x7.r.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointO2 = o2(jVar, qVar);
            if (pointO2 != null) {
                iMax = Math.max(iMax, pointO2.x);
                iMax2 = Math.max(iMax2, pointO2.y);
                iR2 = Math.max(iR2, n2(jVar, qVar.b().B0(iMax).d0(iMax2).N()));
                x7.r.h("MediaCodecVideoRenderer", KBBdKxoAiHo.IMxIscmePoLhvkZ + iMax + "x" + iMax2);
            }
        }
        return new e(iMax, iMax2, iR2);
    }

    protected MediaFormat t2(q qVar, String str, e eVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> pairI;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(oqHAiWkeGzWld.ZBopjqsSgDT, str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, qVar.f26259v);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, qVar.f26260w);
        x7.u.e(mediaFormat, qVar.f26255r);
        x7.u.c(mediaFormat, "frame-rate", qVar.f26261x);
        x7.u.d(mediaFormat, "rotation-degrees", qVar.f26262y);
        x7.u.b(mediaFormat, qVar.C);
        if ("video/dolby-vision".equals(qVar.f26252o) && (pairI = MediaCodecUtil.i(qVar)) != null) {
            x7.u.d(mediaFormat, Scopes.PROFILE, ((Integer) pairI.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f19895a);
        mediaFormat.setInteger("max-height", eVar.f19896b);
        x7.u.d(mediaFormat, "max-input-size", eVar.f19897c);
        int i11 = x7.l0.f28136a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f19867k1));
        }
        return mediaFormat;
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    class a implements VideoSink.a {
        a() {
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.a
        public void a(VideoSink videoSink) {
            if (h.this.V0 != null) {
                h.this.d3(0, 1);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.a
        public void b(VideoSink videoSink) {
            if (h.this.V0 != null) {
                h.this.I2();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.video.VideoSink.a
        public void c(VideoSink videoSink, l0 l0Var) {
        }
    }
}
