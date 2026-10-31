package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import c8.b2;
import com.google.common.collect.c1;
import com.google.common.collect.u;
import d8.s;
import d8.v;
import io.bidmachine.media3.common.audio.AudioProcessor;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.audio.DefaultAudioSink;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u7.q;
import u7.w;
import u7.x;
import v8.f0;
import v8.h0;
import x7.l0;
import x7.r;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static boolean f18122l0 = false;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Object f18123m0 = new Object();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static ScheduledExecutorService f18124n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static int f18125o0;
    private k A;
    private u7.c B;
    private j C;
    private j D;
    private x E;
    private boolean F;
    private ByteBuffer G;
    private int H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private boolean N;
    private boolean O;
    private long P;
    private float Q;
    private ByteBuffer R;
    private int S;
    private ByteBuffer T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18126a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private u7.d f18127a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7.e f18128b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.audio.c f18129b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18130c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f18131c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.audio.h f18132d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f18133d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o f18134e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private long f18135e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u<AudioProcessor> f18136f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f18137f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u<AudioProcessor> f18138g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f18139g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.audio.g f18140h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Looper f18141h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque<j> f18142i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private long f18143i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f18144j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private long f18145j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f18146k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Handler f18147k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private n f18148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l<AudioSink.InitializationException> f18149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l<AudioSink.WriteException> f18150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f18151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d f18152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ExoPlayer.a f18153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f18154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b2 f18155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AudioSink.b f18156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private h f18157u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h f18158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private io.bidmachine.media3.common.audio.a f18159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private AudioTrack f18160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.audio.a f18161y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.audio.b f18162z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private static final class b {
        public static long a(AudioTrack audioTrack, h hVar) {
            return hVar.f18177c == 0 ? hVar.d(audioTrack.getBufferSizeInFrames()) : l0.h1(audioTrack.getBufferSizeInFrames(), 1000000L, io.bidmachine.media3.exoplayer.audio.k.d(hVar.f18181g), RoundingMode.DOWN);
        }

        public static void b(AudioTrack audioTrack, io.bidmachine.media3.exoplayer.audio.c cVar) {
            audioTrack.setPreferredDevice(cVar == null ? null : cVar.f18230a);
        }
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, b2 b2Var) {
            LogSessionId logSessionIdA = b2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface d {
        io.bidmachine.media3.exoplayer.audio.d a(q qVar, u7.c cVar);
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f18163a = new io.bidmachine.media3.exoplayer.audio.k.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public interface f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f18164a = new io.bidmachine.media3.exoplayer.audio.l();

        AudioTrack a(AudioSink.a aVar, u7.c cVar, int i10);
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f18165a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v7.e f18167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f18169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18170f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private d f18173i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ExoPlayer.a f18174j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.audio.a f18166b = io.bidmachine.media3.exoplayer.audio.a.f18206c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e f18171g = e.f18163a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f f18172h = f.f18164a;

        public g(Context context) {
            this.f18165a = context;
        }

        public DefaultAudioSink j() {
            x7.a.g(!this.f18170f);
            this.f18170f = true;
            if (this.f18167c == null) {
                this.f18167c = new i(new AudioProcessor[0]);
            }
            if (this.f18173i == null) {
                this.f18173i = new io.bidmachine.media3.exoplayer.audio.i(this.f18165a);
            }
            return new DefaultAudioSink(this);
        }

        public g k(boolean z10) {
            this.f18169e = z10;
            return this;
        }

        public g l(boolean z10) {
            this.f18168d = z10;
            return this;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f18175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f18180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f18181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f18182h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final io.bidmachine.media3.common.audio.a f18183i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f18184j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f18185k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f18186l;

        public h(q qVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, io.bidmachine.media3.common.audio.a aVar, boolean z10, boolean z11, boolean z12) {
            this.f18175a = qVar;
            this.f18176b = i10;
            this.f18177c = i11;
            this.f18178d = i12;
            this.f18179e = i13;
            this.f18180f = i14;
            this.f18181g = i15;
            this.f18182h = i16;
            this.f18183i = aVar;
            this.f18184j = z10;
            this.f18185k = z11;
            this.f18186l = z12;
        }

        public AudioSink.a a() {
            return new AudioSink.a(this.f18181g, this.f18179e, this.f18180f, this.f18186l, this.f18177c == 1, this.f18182h);
        }

        public boolean b(h hVar) {
            return hVar.f18177c == this.f18177c && hVar.f18181g == this.f18181g && hVar.f18179e == this.f18179e && hVar.f18180f == this.f18180f && hVar.f18178d == this.f18178d && hVar.f18184j == this.f18184j && hVar.f18185k == this.f18185k;
        }

        public h c(int i10) {
            return new h(this.f18175a, this.f18176b, this.f18177c, this.f18178d, this.f18179e, this.f18180f, this.f18181g, i10, this.f18183i, this.f18184j, this.f18185k, this.f18186l);
        }

        public long d(long j10) {
            return l0.e1(j10, this.f18179e);
        }

        public long e(long j10) {
            return l0.e1(j10, this.f18175a.F);
        }

        public boolean f() {
            return this.f18177c == 1;
        }
    }

    public static class i implements v7.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioProcessor[] f18187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f18188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.bidmachine.media3.common.audio.d f18189c;

        public i(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new v(), new io.bidmachine.media3.common.audio.d());
        }

        @Override // v7.e
        public long a(long j10) {
            return this.f18189c.c() ? this.f18189c.h(j10) : j10;
        }

        @Override // v7.e
        public AudioProcessor[] b() {
            return this.f18187a;
        }

        @Override // v7.e
        public x c(x xVar) {
            this.f18189c.j(xVar.f26518a);
            this.f18189c.i(xVar.f26519b);
            return xVar;
        }

        @Override // v7.e
        public long d() {
            return this.f18188b.u();
        }

        @Override // v7.e
        public boolean e(boolean z10) {
            this.f18188b.D(z10);
            return z10;
        }

        public i(AudioProcessor[] audioProcessorArr, v vVar, io.bidmachine.media3.common.audio.d dVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f18187a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f18188b = vVar;
            this.f18189c = dVar;
            audioProcessorArr2[audioProcessorArr.length] = vVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = dVar;
        }
    }

    private static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f18190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f18193d;

        private j(x xVar, long j10, long j11) {
            this.f18190a = xVar;
            this.f18191b = j10;
            this.f18192c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f18194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.bidmachine.media3.exoplayer.audio.b f18195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f18196c = new AudioRouting.OnRoutingChangedListener() { // from class: io.bidmachine.media3.exoplayer.audio.j
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f18283a.b(audioRouting);
            }
        };

        public k(AudioTrack audioTrack, io.bidmachine.media3.exoplayer.audio.b bVar) {
            this.f18194a = audioTrack;
            this.f18195b = bVar;
            audioTrack.addOnRoutingChangedListener(this.f18196c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f18196c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f18195b.i(routedDevice);
        }

        public void c() {
            this.f18194a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) x7.a.e(this.f18196c));
            this.f18196c = null;
        }
    }

    private static final class l<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f18197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f18198b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f18199c = -9223372036854775807L;

        public void a() {
            this.f18197a = null;
            this.f18198b = -9223372036854775807L;
            this.f18199c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f18197a == null) {
                return false;
            }
            return DefaultAudioSink.Y() || SystemClock.elapsedRealtime() < this.f18199c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void c(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f18197a == null) {
                this.f18197a = t10;
            }
            if (this.f18198b == -9223372036854775807L && !DefaultAudioSink.Y()) {
                this.f18198b = 200 + jElapsedRealtime;
            }
            long j10 = this.f18198b;
            if (j10 == -9223372036854775807L || jElapsedRealtime < j10) {
                this.f18199c = jElapsedRealtime + 50;
                return;
            }
            T t11 = this.f18197a;
            if (t11 != t10) {
                t11.addSuppressed(t10);
            }
            T t12 = this.f18197a;
            a();
            throw t12;
        }
    }

    private final class m implements io.bidmachine.media3.exoplayer.audio.g.a {
        private m() {
        }

        @Override // io.bidmachine.media3.exoplayer.audio.g.a
        public void a(int i10, long j10) {
            if (DefaultAudioSink.this.f18156t != null) {
                DefaultAudioSink.this.f18156t.h(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f18135e0);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.audio.g.a
        public void b(long j10) {
            r.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.g.a
        public void c(long j10) {
            if (DefaultAudioSink.this.f18156t != null) {
                DefaultAudioSink.this.f18156t.c(j10);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.audio.g.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.V() + ", " + DefaultAudioSink.this.W();
            if (DefaultAudioSink.f18122l0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            r.h("DefaultAudioSink", str);
        }

        @Override // io.bidmachine.media3.exoplayer.audio.g.a
        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.V() + ", " + DefaultAudioSink.this.W();
            if (DefaultAudioSink.f18122l0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            r.h("DefaultAudioSink", str);
        }
    }

    private final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f18201a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f18202b;

        class a extends AudioTrack.StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f18204a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f18204a = defaultAudioSink;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(DefaultAudioSink.this.f18160x) && DefaultAudioSink.this.f18156t != null && DefaultAudioSink.this.X) {
                    DefaultAudioSink.this.f18156t.k();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f18160x)) {
                    DefaultAudioSink.this.W = true;
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f18160x) && DefaultAudioSink.this.f18156t != null && DefaultAudioSink.this.X) {
                    DefaultAudioSink.this.f18156t.k();
                }
            }
        }

        public n() {
            this.f18202b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f18201a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new s(handler), this.f18202b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f18202b);
            this.f18201a.removeCallbacksAndMessages(null);
        }
    }

    private void L(long j10) {
        x xVarC;
        if (w0()) {
            xVarC = x.f26515d;
        } else {
            xVarC = u0() ? this.f18128b.c(this.E) : x.f26515d;
            this.E = xVarC;
        }
        x xVar = xVarC;
        this.F = u0() ? this.f18128b.e(this.F) : false;
        this.f18142i.add(new j(xVar, Math.max(0L, j10), this.f18158v.d(W())));
        t0();
        AudioSink.b bVar = this.f18156t;
        if (bVar != null) {
            bVar.a(this.F);
        }
    }

    private long M(long j10) {
        while (!this.f18142i.isEmpty() && j10 >= this.f18142i.getFirst().f18192c) {
            this.D = this.f18142i.remove();
        }
        j jVar = this.D;
        long j11 = j10 - jVar.f18192c;
        long jG0 = l0.g0(j11, jVar.f18190a.f26518a);
        if (!this.f18142i.isEmpty()) {
            j jVar2 = this.D;
            return jVar2.f18191b + jG0 + jVar2.f18193d;
        }
        long jA = this.f18128b.a(j11);
        j jVar3 = this.D;
        long j12 = jVar3.f18191b + jA;
        jVar3.f18193d = jA - jG0;
        return j12;
    }

    private long N(long j10) {
        long jD = this.f18128b.d();
        long jD2 = j10 + this.f18158v.d(jD);
        long j11 = this.f18143i0;
        if (jD > j11) {
            long jD3 = this.f18158v.d(jD - j11);
            this.f18143i0 = jD;
            X(jD3);
        }
        return jD2;
    }

    private AudioTrack O(AudioSink.a aVar, u7.c cVar, int i10, q qVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = this.f18154r.a(aVar, cVar, i10);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, aVar.f18117b, aVar.f18118c, aVar.f18116a, qVar, aVar.f18120e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new AudioSink.InitializationException(0, aVar.f18117b, aVar.f18118c, aVar.f18116a, qVar, aVar.f18120e, e10);
        }
    }

    private AudioTrack P(h hVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackO = O(hVar.a(), this.B, this.Z, hVar.f18175a);
            ExoPlayer.a aVar = this.f18153q;
            if (aVar != null) {
                aVar.C(c0(audioTrackO));
            }
            return audioTrackO;
        } catch (AudioSink.InitializationException e10) {
            AudioSink.b bVar = this.f18156t;
            if (bVar != null) {
                bVar.b(e10);
            }
            throw e10;
        }
    }

    private AudioTrack Q() throws AudioSink.InitializationException {
        try {
            return P((h) x7.a.e(this.f18158v));
        } catch (AudioSink.InitializationException e10) {
            h hVar = this.f18158v;
            if (hVar.f18182h > 1000000) {
                h hVarC = hVar.c(1000000);
                try {
                    AudioTrack audioTrackP = P(hVarC);
                    this.f18158v = hVarC;
                    return audioTrackP;
                } catch (AudioSink.InitializationException e11) {
                    e10.addSuppressed(e11);
                    f0();
                    throw e10;
                }
            }
            f0();
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    private void R(long j10) throws Exception {
        int iX0;
        AudioSink.b bVar;
        if (this.T == null || this.f18150n.b()) {
            return;
        }
        int iRemaining = this.T.remaining();
        boolean z10 = true;
        if (this.f18131c0) {
            x7.a.g(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f18133d0;
            } else {
                this.f18133d0 = j10;
            }
            iX0 = y0(this.f18160x, this.T, iRemaining, j10);
        } else {
            iX0 = x0(this.f18160x, this.T, iRemaining);
        }
        this.f18135e0 = SystemClock.elapsedRealtime();
        if (iX0 < 0) {
            if (!a0(iX0)) {
                z10 = false;
            } else if (W() <= 0) {
                if (c0(this.f18160x)) {
                    f0();
                } else {
                    z10 = false;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iX0, this.f18158v.f18175a, z10);
            AudioSink.b bVar2 = this.f18156t;
            if (bVar2 != null) {
                bVar2.b(writeException);
            }
            if (!writeException.f18114b || this.f18126a == null) {
                this.f18150n.c(writeException);
                return;
            } else {
                this.f18161y = io.bidmachine.media3.exoplayer.audio.a.f18206c;
                throw writeException;
            }
        }
        this.f18150n.a();
        if (c0(this.f18160x)) {
            if (this.L > 0) {
                this.f18139g0 = false;
            }
            if (this.X && (bVar = this.f18156t) != null && iX0 < iRemaining && !this.f18139g0) {
                bVar.g();
            }
        }
        int i10 = this.f18158v.f18177c;
        if (i10 == 0) {
            this.K += (long) iX0;
        }
        if (iX0 == iRemaining) {
            if (i10 != 0) {
                x7.a.g(this.T == this.R);
                this.L += ((long) this.M) * ((long) this.S);
            }
            this.T = null;
        }
    }

    private boolean S() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f18159w.f()) {
            R(Long.MIN_VALUE);
            return this.T == null;
        }
        this.f18159w.h();
        l0(Long.MIN_VALUE);
        return this.f18159w.e() && ((byteBuffer = this.T) == null || !byteBuffer.hasRemaining());
    }

    private static int T(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        x7.a.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int U(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return h0.h(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = f0.m(l0.P(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int iB = v8.b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return v8.b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return v8.c.e(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
                    break;
            }
            return v8.b.e(byteBuffer);
        }
        return v8.o.f(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long V() {
        h hVar = this.f18158v;
        return hVar.f18177c == 0 ? this.I / ((long) hVar.f18176b) : this.J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long W() {
        h hVar = this.f18158v;
        return hVar.f18177c == 0 ? l0.l(this.K, hVar.f18178d) : this.L;
    }

    private void X(long j10) {
        this.f18145j0 += j10;
        if (this.f18147k0 == null) {
            this.f18147k0 = new Handler(Looper.myLooper());
        }
        this.f18147k0.removeCallbacksAndMessages(null);
        this.f18147k0.postDelayed(new Runnable() { // from class: d8.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f13395a.h0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Y() {
        boolean z10;
        synchronized (f18123m0) {
            z10 = f18125o0 > 0;
        }
        return z10;
    }

    private boolean Z() throws AudioSink.InitializationException {
        io.bidmachine.media3.exoplayer.audio.b bVar;
        b2 b2Var;
        if (this.f18149m.b()) {
            return false;
        }
        AudioTrack audioTrackQ = Q();
        this.f18160x = audioTrackQ;
        if (c0(audioTrackQ)) {
            m0(this.f18160x);
            h hVar = this.f18158v;
            if (hVar.f18185k) {
                AudioTrack audioTrack = this.f18160x;
                q qVar = hVar.f18175a;
                audioTrack.setOffloadDelayPadding(qVar.H, qVar.I);
            }
        }
        int i10 = l0.f28136a;
        if (i10 >= 31 && (b2Var = this.f18155s) != null) {
            c.a(this.f18160x, b2Var);
        }
        this.Z = this.f18160x.getAudioSessionId();
        io.bidmachine.media3.exoplayer.audio.g gVar = this.f18140h;
        AudioTrack audioTrack2 = this.f18160x;
        h hVar2 = this.f18158v;
        gVar.s(audioTrack2, hVar2.f18177c == 2, hVar2.f18181g, hVar2.f18178d, hVar2.f18182h);
        s0();
        int i11 = this.f18127a0.f26007a;
        if (i11 != 0) {
            this.f18160x.attachAuxEffect(i11);
            this.f18160x.setAuxEffectSendLevel(this.f18127a0.f26008b);
        }
        io.bidmachine.media3.exoplayer.audio.c cVar = this.f18129b0;
        if (cVar != null && i10 >= 23) {
            b.b(this.f18160x, cVar);
            io.bidmachine.media3.exoplayer.audio.b bVar2 = this.f18162z;
            if (bVar2 != null) {
                bVar2.i(this.f18129b0.f18230a);
            }
        }
        if (i10 >= 24 && (bVar = this.f18162z) != null) {
            this.A = new k(this.f18160x, bVar);
        }
        this.O = true;
        AudioSink.b bVar3 = this.f18156t;
        if (bVar3 != null) {
            bVar3.e(this.f18158v.a());
        }
        return true;
    }

    private static boolean a0(int i10) {
        return (l0.f28136a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean b0() {
        return this.f18160x != null;
    }

    private static boolean c0(AudioTrack audioTrack) {
        return l0.f28136a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(AudioTrack audioTrack, final AudioSink.b bVar, Handler handler, final AudioSink.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: d8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.d(aVar);
                    }
                });
            }
            synchronized (f18123m0) {
                int i10 = f18125o0 - 1;
                f18125o0 = i10;
                if (i10 == 0) {
                    f18124n0.shutdown();
                    f18124n0 = null;
                }
            }
        } catch (Throwable th) {
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: d8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.d(aVar);
                    }
                });
            }
            synchronized (f18123m0) {
                int i11 = f18125o0 - 1;
                f18125o0 = i11;
                if (i11 == 0) {
                    f18124n0.shutdown();
                    f18124n0 = null;
                }
                throw th;
            }
        }
    }

    private void f0() {
        if (this.f18158v.f()) {
            this.f18137f0 = true;
        }
    }

    private ByteBuffer g0(ByteBuffer byteBuffer) {
        if (this.f18158v.f18177c != 0) {
            return byteBuffer;
        }
        int iF = (int) l0.F(l0.S0(20L), this.f18158v.f18179e);
        long jW = W();
        if (jW >= iF) {
            return byteBuffer;
        }
        h hVar = this.f18158v;
        return d8.u.a(byteBuffer, hVar.f18181g, hVar.f18178d, (int) jW, iF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        if (this.f18145j0 >= 300000) {
            this.f18156t.f();
            this.f18145j0 = 0L;
        }
    }

    private void i0() {
        if (this.f18162z == null && this.f18126a != null) {
            this.f18141h0 = Looper.myLooper();
            io.bidmachine.media3.exoplayer.audio.b bVar = new io.bidmachine.media3.exoplayer.audio.b(this.f18126a, new io.bidmachine.media3.exoplayer.audio.b.f() { // from class: d8.p
                @Override // io.bidmachine.media3.exoplayer.audio.b.f
                public final void a(io.bidmachine.media3.exoplayer.audio.a aVar) {
                    this.f13392a.j0(aVar);
                }
            }, this.B, this.f18129b0);
            this.f18162z = bVar;
            this.f18161y = bVar.g();
        }
        x7.a.e(this.f18161y);
    }

    private void k0() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.f18140h.g(W());
        if (c0(this.f18160x)) {
            this.W = false;
        }
        this.f18160x.stop();
        this.H = 0;
    }

    private void l0(long j10) throws Exception {
        R(j10);
        if (this.T != null) {
            return;
        }
        if (!this.f18159w.f()) {
            ByteBuffer byteBuffer = this.R;
            if (byteBuffer != null) {
                r0(byteBuffer);
                R(j10);
                return;
            }
            return;
        }
        while (!this.f18159w.e()) {
            do {
                ByteBuffer byteBufferD = this.f18159w.d();
                if (byteBufferD.hasRemaining()) {
                    r0(byteBufferD);
                    R(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.R;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f18159w.i(this.R);
                    }
                }
            } while (this.T == null);
            return;
        }
    }

    private void m0(AudioTrack audioTrack) {
        if (this.f18148l == null) {
            this.f18148l = new n();
        }
        this.f18148l.a(audioTrack);
    }

    private static void n0(final AudioTrack audioTrack, final AudioSink.b bVar, final AudioSink.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f18123m0) {
            if (f18124n0 == null) {
                f18124n0 = l0.U0("ExoPlayer:AudioTrackReleaseThread");
            }
            f18125o0++;
            f18124n0.schedule(new Runnable() { // from class: d8.o
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultAudioSink.e0(audioTrack, bVar, handler, aVar);
                }
            }, 20L, TimeUnit.MILLISECONDS);
        }
    }

    private void o0() {
        this.I = 0L;
        this.J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.f18139g0 = false;
        this.M = 0;
        this.D = new j(this.E, 0L, 0L);
        this.P = 0L;
        this.C = null;
        this.f18142i.clear();
        this.R = null;
        this.S = 0;
        this.T = null;
        this.V = false;
        this.U = false;
        this.W = false;
        this.G = null;
        this.H = 0;
        this.f18134e.n();
        t0();
    }

    private void p0(x xVar) {
        j jVar = new j(xVar, -9223372036854775807L, -9223372036854775807L);
        if (b0()) {
            this.C = jVar;
        } else {
            this.D = jVar;
        }
    }

    private void q0() {
        if (b0()) {
            try {
                this.f18160x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f26518a).setPitch(this.E.f26519b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                r.i("DefaultAudioSink", "Failed to set playback params", e10);
            }
            x xVar = new x(this.f18160x.getPlaybackParams().getSpeed(), this.f18160x.getPlaybackParams().getPitch());
            this.E = xVar;
            this.f18140h.t(xVar.f26518a);
        }
    }

    private void r0(ByteBuffer byteBuffer) {
        x7.a.g(this.T == null);
        if (byteBuffer.hasRemaining()) {
            this.T = g0(byteBuffer);
        }
    }

    private void s0() {
        if (b0()) {
            this.f18160x.setVolume(this.Q);
        }
    }

    private void t0() {
        io.bidmachine.media3.common.audio.a aVar = this.f18158v.f18183i;
        this.f18159w = aVar;
        aVar.b();
    }

    private boolean u0() {
        if (!this.f18131c0) {
            h hVar = this.f18158v;
            if (hVar.f18177c == 0 && !v0(hVar.f18175a.G)) {
                return true;
            }
        }
        return false;
    }

    private boolean v0(int i10) {
        return this.f18130c && l0.F0(i10);
    }

    private boolean w0() {
        h hVar = this.f18158v;
        return hVar != null && hVar.f18184j && l0.f28136a >= 23;
    }

    private static int x0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int y0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (l0.f28136a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.G == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.G = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.G.putInt(1431633921);
        }
        if (this.H == 0) {
            this.G.putInt(4, i10);
            this.G.putLong(8, j10 * 1000);
            this.G.position(0);
            this.H = i10;
        }
        int iRemaining = this.G.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.G, iRemaining, 1);
            if (iWrite < 0) {
                this.H = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iX0 = x0(audioTrack, byteBuffer, i10);
        if (iX0 < 0) {
            this.H = 0;
            return iX0;
        }
        this.H -= iX0;
        return iX0;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public long A(boolean z10) {
        if (!b0() || this.O) {
            return Long.MIN_VALUE;
        }
        return N(M(Math.min(this.f18140h.c(), this.f18158v.d(W()))));
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void C(x7.h hVar) {
        this.f18140h.u(hVar);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public int D(q qVar) {
        i0();
        if (!"audio/raw".equals(qVar.f26252o)) {
            return this.f18161y.j(qVar, this.B) ? 2 : 0;
        }
        if (l0.G0(qVar.G)) {
            int i10 = qVar.G;
            return (i10 == 2 || (this.f18130c && i10 == 4)) ? 2 : 1;
        }
        r.h("DefaultAudioSink", "Invalid PCM encoding: " + qVar.G);
        return 0;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void E() {
        this.N = true;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void F() {
        x7.a.g(this.Y);
        if (this.f18131c0) {
            return;
        }
        this.f18131c0 = true;
        flush();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void G(u7.d dVar) {
        if (this.f18127a0.equals(dVar)) {
            return;
        }
        int i10 = dVar.f26007a;
        float f10 = dVar.f26008b;
        AudioTrack audioTrack = this.f18160x;
        if (audioTrack != null) {
            if (this.f18127a0.f26007a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f18160x.setAuxEffectSendLevel(f10);
            }
        }
        this.f18127a0 = dVar;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void H(q qVar, int i10, int[] iArr) throws AudioSink.ConfigurationException {
        io.bidmachine.media3.common.audio.a aVar;
        int iK0;
        int iK1;
        boolean z10;
        int i11;
        int iIntValue;
        int i12;
        boolean z11;
        int i13;
        int iA;
        i0();
        if ("audio/raw".equals(qVar.f26252o)) {
            x7.a.a(l0.G0(qVar.G));
            iK0 = l0.k0(qVar.G, qVar.E);
            u.a aVar2 = new u.a();
            if (v0(qVar.G)) {
                aVar2.k(this.f18138g);
            } else {
                aVar2.k(this.f18136f);
                aVar2.j(this.f18128b.b());
            }
            io.bidmachine.media3.common.audio.a aVar3 = new io.bidmachine.media3.common.audio.a(aVar2.m());
            if (aVar3.equals(this.f18159w)) {
                aVar3 = this.f18159w;
            }
            this.f18134e.o(qVar.H, qVar.I);
            this.f18132d.m(iArr);
            try {
                AudioProcessor.a aVarA = aVar3.a(new AudioProcessor.a(qVar));
                int i14 = aVarA.f17938c;
                int i15 = aVarA.f17936a;
                int iM = l0.M(aVarA.f17937b);
                i13 = 0;
                z10 = false;
                iK1 = l0.k0(i14, aVarA.f17937b);
                aVar = aVar3;
                i11 = i15;
                iIntValue = iM;
                z11 = this.f18144j;
                i12 = i14;
            } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                throw new AudioSink.ConfigurationException(e10, qVar);
            }
        } else {
            io.bidmachine.media3.common.audio.a aVar4 = new io.bidmachine.media3.common.audio.a(u.H());
            int i16 = qVar.F;
            io.bidmachine.media3.exoplayer.audio.d dVarU = this.f18146k != 0 ? u(qVar) : io.bidmachine.media3.exoplayer.audio.d.f18231d;
            if (this.f18146k == 0 || !dVarU.f18232a) {
                Pair<Integer, Integer> pairH = this.f18161y.h(qVar, this.B);
                if (pairH == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + qVar, qVar);
                }
                int iIntValue2 = ((Integer) pairH.first).intValue();
                aVar = aVar4;
                iK0 = -1;
                iK1 = -1;
                z10 = false;
                i11 = i16;
                iIntValue = ((Integer) pairH.second).intValue();
                i12 = iIntValue2;
                z11 = this.f18144j;
                i13 = 2;
            } else {
                int iF = w.f((String) x7.a.e(qVar.f26252o), qVar.f26248k);
                int iM2 = l0.M(qVar.E);
                aVar = aVar4;
                i13 = 1;
                z11 = true;
                iK0 = -1;
                iK1 = -1;
                i11 = i16;
                z10 = dVarU.f18233b;
                i12 = iF;
                iIntValue = iM2;
            }
        }
        if (i12 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i13 + ") for: " + qVar, qVar);
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i13 + ") for: " + qVar, qVar);
        }
        int i17 = qVar.f26247j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(qVar.f26252o) && i17 == -1) {
            i17 = 768000;
        }
        int i18 = i17;
        if (i10 != 0) {
            iA = i10;
        } else {
            iA = this.f18151o.a(T(i11, iIntValue, i12), i12, i13, iK1 != -1 ? iK1 : 1, i11, i18, z11 ? 8.0d : 1.0d);
        }
        this.f18137f0 = false;
        h hVar = new h(qVar, iK0, i13, iK1, i11, iIntValue, i12, iA, aVar, z11, z10, this.f18131c0);
        if (b0()) {
            this.f18157u = hVar;
        } else {
            this.f18158v = hVar;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void I(boolean z10) {
        this.F = z10;
        p0(w0() ? x.f26515d : this.E);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean a(q qVar) {
        return D(qVar) != 0;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean b() {
        return !b0() || (this.U && !o());
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void c(x xVar) {
        this.E = new x(l0.o(xVar.f26518a, 0.1f, 8.0f), l0.o(xVar.f26519b, 0.1f, 8.0f));
        if (w0()) {
            q0();
        } else {
            p0(xVar);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public x e() {
        return this.E;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void flush() {
        k kVar;
        if (b0()) {
            o0();
            if (this.f18140h.i()) {
                this.f18160x.pause();
            }
            if (c0(this.f18160x)) {
                ((n) x7.a.e(this.f18148l)).b(this.f18160x);
            }
            AudioSink.a aVarA = this.f18158v.a();
            h hVar = this.f18157u;
            if (hVar != null) {
                this.f18158v = hVar;
                this.f18157u = null;
            }
            this.f18140h.q();
            if (l0.f28136a >= 24 && (kVar = this.A) != null) {
                kVar.c();
                this.A = null;
            }
            n0(this.f18160x, this.f18156t, aVarA);
            this.f18160x = null;
        }
        this.f18150n.a();
        this.f18149m.a();
        this.f18143i0 = 0L;
        this.f18145j0 = 0L;
        Handler handler = this.f18147k0;
        if (handler != null) {
            ((Handler) x7.a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    public void j0(io.bidmachine.media3.exoplayer.audio.a aVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f18141h0;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
        }
        io.bidmachine.media3.exoplayer.audio.a aVar2 = this.f18161y;
        if (aVar2 == null || aVar.equals(aVar2)) {
            return;
        }
        this.f18161y = aVar;
        AudioSink.b bVar = this.f18156t;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void n() {
        this.X = true;
        if (b0()) {
            this.f18140h.v();
            this.f18160x.play();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean o() {
        return b0() && !(l0.f28136a >= 29 && this.f18160x.isOffloadedPlayback() && this.W) && this.f18140h.h(W());
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void p(int i10) {
        if (this.Z != i10) {
            this.Z = i10;
            this.Y = i10 != 0;
            flush();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.X = false;
        if (b0()) {
            if (this.f18140h.p() || c0(this.f18160x)) {
                this.f18160x.pause();
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public long q() {
        if (!b0()) {
            return -9223372036854775807L;
        }
        if (l0.f28136a >= 23) {
            return b.a(this.f18160x, this.f18158v);
        }
        h hVar = this.f18158v;
        return l0.h1(this.f18158v.f18182h, 1000000L, hVar.f18177c == 0 ? ((long) hVar.f18179e) * ((long) hVar.f18178d) : io.bidmachine.media3.exoplayer.audio.k.d(hVar.f18181g), RoundingMode.DOWN);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void r(int i10) {
        x7.a.g(l0.f28136a >= 29);
        this.f18146k = i10;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void release() {
        io.bidmachine.media3.exoplayer.audio.b bVar = this.f18162z;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        c1<AudioProcessor> it = this.f18136f.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        c1<AudioProcessor> it2 = this.f18138g.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        io.bidmachine.media3.common.audio.a aVar = this.f18159w;
        if (aVar != null) {
            aVar.j();
        }
        this.X = false;
        this.f18137f0 = false;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void s() {
        if (this.f18131c0) {
            this.f18131c0 = false;
            flush();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f18129b0 = audioDeviceInfo == null ? null : new io.bidmachine.media3.exoplayer.audio.c(audioDeviceInfo);
        io.bidmachine.media3.exoplayer.audio.b bVar = this.f18162z;
        if (bVar != null) {
            bVar.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f18160x;
        if (audioTrack != null) {
            b.b(audioTrack, this.f18129b0);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void setVolume(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            s0();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void t(AudioSink.b bVar) {
        this.f18156t = bVar;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public io.bidmachine.media3.exoplayer.audio.d u(q qVar) {
        return this.f18137f0 ? io.bidmachine.media3.exoplayer.audio.d.f18231d : this.f18152p.a(qVar, this.B);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void v(b2 b2Var) {
        this.f18155s = b2Var;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public boolean w(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.R;
        x7.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f18157u != null) {
            if (!S()) {
                return false;
            }
            if (this.f18157u.b(this.f18158v)) {
                this.f18158v = this.f18157u;
                this.f18157u = null;
                AudioTrack audioTrack = this.f18160x;
                if (audioTrack != null && c0(audioTrack) && this.f18158v.f18185k) {
                    if (this.f18160x.getPlayState() == 3) {
                        this.f18160x.setOffloadEndOfStream();
                        this.f18140h.a();
                    }
                    AudioTrack audioTrack2 = this.f18160x;
                    q qVar = this.f18158v.f18175a;
                    audioTrack2.setOffloadDelayPadding(qVar.H, qVar.I);
                    this.f18139g0 = true;
                }
            } else {
                k0();
                if (o()) {
                    return false;
                }
                flush();
            }
            L(j10);
        }
        if (!b0()) {
            try {
                if (!Z()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e10) {
                if (e10.f18109b) {
                    throw e10;
                }
                this.f18149m.c(e10);
                return false;
            }
        }
        this.f18149m.a();
        if (this.O) {
            this.P = Math.max(0L, j10);
            this.N = false;
            this.O = false;
            if (w0()) {
                q0();
            }
            L(j10);
            if (this.X) {
                n();
            }
        }
        if (!this.f18140h.k(W())) {
            return false;
        }
        if (this.R == null) {
            x7.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f18158v;
            if (hVar.f18177c != 0 && this.M == 0) {
                int iU = U(hVar.f18181g, byteBuffer);
                this.M = iU;
                if (iU == 0) {
                    return true;
                }
            }
            if (this.C != null) {
                if (!S()) {
                    return false;
                }
                L(j10);
                this.C = null;
            }
            long jE = this.P + this.f18158v.e(V() - this.f18134e.m());
            if (!this.N && Math.abs(jE - j10) > 200000) {
                AudioSink.b bVar = this.f18156t;
                if (bVar != null) {
                    bVar.b(new AudioSink.UnexpectedDiscontinuityException(j10, jE));
                }
                this.N = true;
            }
            if (this.N) {
                if (!S()) {
                    return false;
                }
                long j11 = j10 - jE;
                this.P += j11;
                this.N = false;
                L(j10);
                AudioSink.b bVar2 = this.f18156t;
                if (bVar2 != null && j11 != 0) {
                    bVar2.j();
                }
            }
            if (this.f18158v.f18177c == 0) {
                this.I += (long) byteBuffer.remaining();
            } else {
                this.J += ((long) this.M) * ((long) i10);
            }
            this.R = byteBuffer;
            this.S = i10;
        }
        l0(j10);
        if (!this.R.hasRemaining()) {
            this.R = null;
            this.S = 0;
            return true;
        }
        if (!this.f18140h.j(W())) {
            return false;
        }
        r.h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void x(u7.c cVar) {
        if (this.B.equals(cVar)) {
            return;
        }
        this.B = cVar;
        if (this.f18131c0) {
            return;
        }
        io.bidmachine.media3.exoplayer.audio.b bVar = this.f18162z;
        if (bVar != null) {
            bVar.h(cVar);
        }
        flush();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void y() throws AudioSink.WriteException {
        if (!this.U && b0() && S()) {
            k0();
            this.U = true;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.AudioSink
    public void z(int i10, int i11) {
        h hVar;
        AudioTrack audioTrack = this.f18160x;
        if (audioTrack == null || !c0(audioTrack) || (hVar = this.f18158v) == null || !hVar.f18185k) {
            return;
        }
        this.f18160x.setOffloadDelayPadding(i10, i11);
    }

    private DefaultAudioSink(g gVar) {
        Context context = gVar.f18165a;
        this.f18126a = context;
        this.B = u7.c.f25984g;
        this.f18161y = context != null ? null : gVar.f18166b;
        this.f18128b = gVar.f18167c;
        this.f18130c = gVar.f18168d;
        this.f18144j = l0.f28136a >= 23 && gVar.f18169e;
        this.f18146k = 0;
        this.f18151o = gVar.f18171g;
        this.f18152p = (d) x7.a.e(gVar.f18173i);
        this.f18140h = new io.bidmachine.media3.exoplayer.audio.g(new m());
        io.bidmachine.media3.exoplayer.audio.h hVar = new io.bidmachine.media3.exoplayer.audio.h();
        this.f18132d = hVar;
        o oVar = new o();
        this.f18134e = oVar;
        this.f18136f = u.N(new io.bidmachine.media3.common.audio.e(), hVar, oVar);
        this.f18138g = u.N(new io.bidmachine.media3.exoplayer.audio.n(), hVar, oVar);
        this.Q = 1.0f;
        this.Z = 0;
        this.f18127a0 = new u7.d(0, 0.0f);
        x xVar = x.f26515d;
        this.D = new j(xVar, 0L, 0L);
        this.E = xVar;
        this.F = false;
        this.f18142i = new ArrayDeque<>();
        this.f18149m = new l<>();
        this.f18150n = new l<>();
        this.f18153q = gVar.f18174j;
        this.f18154r = gVar.f18172h;
    }
}
