package c8;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.PlaybackException;
import io.bidmachine.media3.datasource.FileDataSource;
import io.bidmachine.media3.datasource.HttpDataSource$HttpDataSourceException;
import io.bidmachine.media3.datasource.HttpDataSource$InvalidContentTypeException;
import io.bidmachine.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import io.bidmachine.media3.datasource.UdpDataSource;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.drm.DefaultDrmSessionManager;
import io.bidmachine.media3.exoplayer.drm.DrmSession;
import io.bidmachine.media3.exoplayer.drm.UnsupportedDrmException;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: MediaMetricsListener.java */
/* JADX INFO: loaded from: classes4.dex */
public final class z1 implements c8.b, a2.a {
    private int A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4998a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a2 f5000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PlaybackSession f5001d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f5007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PlaybackMetrics.Builder f5008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5009l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PlaybackException f5012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f5013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f5014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f5015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private u7.q f5016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private u7.q f5017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private u7.q f5018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f5019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f5020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f5021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f5022y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f5023z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f4999b = x7.b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u7.d0.c f5003f = new u7.d0.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u7.d0.b f5004g = new u7.d0.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashMap<String, Long> f5006i = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f5005h = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f5002e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5010m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5011n = 0;

    /* JADX INFO: compiled from: MediaMetricsListener.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5025b;

        public a(int i10, int i11) {
            this.f5024a = i10;
            this.f5025b = i11;
        }
    }

    /* JADX INFO: compiled from: MediaMetricsListener.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u7.q f5026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5028c;

        public b(u7.q qVar, int i10, String str) {
            this.f5026a = qVar;
            this.f5027b = i10;
            this.f5028c = str;
        }
    }

    private z1(Context context, PlaybackSession playbackSession) {
        this.f4998a = context.getApplicationContext();
        this.f5001d = playbackSession;
        t1 t1Var = new t1();
        this.f5000c = t1Var;
        t1Var.f(this);
    }

    private boolean D0(b bVar) {
        return bVar != null && bVar.f5028c.equals(this.f5000c.a());
    }

    public static z1 E0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new z1(context, mediaMetricsManager.createPlaybackSession());
    }

    private void F0() {
        PlaybackMetrics.Builder builder = this.f5008k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f5008k.setVideoFramesDropped(this.f5022y);
            this.f5008k.setVideoFramesPlayed(this.f5023z);
            Long l10 = this.f5005h.get(this.f5007j);
            this.f5008k.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f5006i.get(this.f5007j);
            this.f5008k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f5008k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f5008k.build();
            this.f4999b.execute(new Runnable() { // from class: c8.u1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4965a.P0(playbackMetricsBuild);
                }
            });
        }
        this.f5008k = null;
        this.f5007j = null;
        this.A = 0;
        this.f5022y = 0;
        this.f5023z = 0;
        this.f5016s = null;
        this.f5017t = null;
        this.f5018u = null;
        this.B = false;
    }

    private static int G0(int i10) {
        switch (x7.l0.b0(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static u7.l H0(com.google.common.collect.u<u7.h0.a> uVar) {
        u7.l lVar;
        com.google.common.collect.c1<u7.h0.a> it = uVar.iterator();
        while (it.hasNext()) {
            u7.h0.a next = it.next();
            for (int i10 = 0; i10 < next.f26173a; i10++) {
                if (next.g(i10) && (lVar = next.b(i10).f26256s) != null) {
                    return lVar;
                }
            }
        }
        return null;
    }

    private static int I0(u7.l lVar) {
        for (int i10 = 0; i10 < lVar.f26196d; i10++) {
            UUID uuid = lVar.e(i10).f26198b;
            if (uuid.equals(u7.f.f26062d)) {
                return 3;
            }
            if (uuid.equals(u7.f.f26063e)) {
                return 2;
            }
            if (uuid.equals(u7.f.f26061c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a J0(PlaybackException playbackException, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (playbackException.f17926a == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z11 = exoPlaybackException.f18065j == 1;
            i10 = exoPlaybackException.f18069n;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th = (Throwable) x7.a.e(playbackException.getCause());
        if (!(th instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new a(13, x7.l0.c0(((MediaCodecRenderer.DecoderInitializationException) th).f19216d));
            }
            if (th instanceof MediaCodecDecoderException) {
                return new a(14, ((MediaCodecDecoderException) th).f19177c);
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th).f18108a);
            }
            if (th instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th).f18113a);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(G0(errorCode), errorCode);
        }
        if (th instanceof HttpDataSource$InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource$InvalidResponseCodeException) th).f18036d);
        }
        if ((th instanceof HttpDataSource$InvalidContentTypeException) || (th instanceof ParserException)) {
            return new a(z10 ? 10 : 11, 0);
        }
        if ((th instanceof HttpDataSource$HttpDataSourceException) || (th instanceof UdpDataSource.UdpDataSourceException)) {
            if (x7.w.e(context).g() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            if (cause instanceof UnknownHostException) {
                return new a(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new a(7, 0);
            }
            return ((th instanceof HttpDataSource$HttpDataSourceException) && ((HttpDataSource$HttpDataSourceException) th).f18034c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.f17926a == 1002) {
            return new a(21, 0);
        }
        if (!(th instanceof DrmSession.DrmSessionException)) {
            if (!(th instanceof FileDataSource.FileDataSourceException) || !(th.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) x7.a.e(th.getCause())).getCause();
            return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th2 = (Throwable) x7.a.e(th.getCause());
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            int iC0 = x7.l0.c0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
            return new a(G0(iC0), iC0);
        }
        if (x7.l0.f28136a >= 23 && (th2 instanceof MediaDrmResetException)) {
            return new a(27, 0);
        }
        if (th2 instanceof NotProvisionedException) {
            return new a(24, 0);
        }
        if (th2 instanceof DeniedByServerException) {
            return new a(29, 0);
        }
        if (th2 instanceof UnsupportedDrmException) {
            return new a(23, 0);
        }
        return th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0);
    }

    private static Pair<String, String> K0(String str) {
        String[] strArrM1 = x7.l0.m1(str, "-");
        return Pair.create(strArrM1[0], strArrM1.length >= 2 ? strArrM1[1] : null);
    }

    private static int M0(Context context) {
        switch (x7.w.e(context).g()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int N0(u7.s sVar) {
        u7.s.h hVar = sVar.f26302b;
        if (hVar == null) {
            return 0;
        }
        int iA0 = x7.l0.A0(hVar.f26394a, hVar.f26395b);
        if (iA0 == 0) {
            return 3;
        }
        if (iA0 != 1) {
            return iA0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int O0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(PlaybackMetrics playbackMetrics) {
        this.f5001d.reportPlaybackMetrics(playbackMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(NetworkEvent networkEvent) {
        this.f5001d.reportNetworkEvent(networkEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(PlaybackErrorEvent playbackErrorEvent) {
        this.f5001d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(PlaybackStateEvent playbackStateEvent) {
        this.f5001d.reportPlaybackStateEvent(playbackStateEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(TrackChangeEvent trackChangeEvent) {
        this.f5001d.reportTrackChangeEvent(trackChangeEvent);
    }

    private void U0(c8.b.C0096b c0096b) {
        for (int i10 = 0; i10 < c0096b.d(); i10++) {
            int iB = c0096b.b(i10);
            c8.b.a aVarC = c0096b.c(iB);
            if (iB == 0) {
                this.f5000c.c(aVarC);
            } else if (iB == 11) {
                this.f5000c.b(aVarC, this.f5009l);
            } else {
                this.f5000c.d(aVarC);
            }
        }
    }

    private void V0(long j10) {
        int iM0 = M0(this.f4998a);
        if (iM0 != this.f5011n) {
            this.f5011n = iM0;
            final NetworkEvent networkEventBuild = new NetworkEvent.Builder().setNetworkType(iM0).setTimeSinceCreatedMillis(j10 - this.f5002e).build();
            this.f4999b.execute(new Runnable() { // from class: c8.x1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4985a.Q0(networkEventBuild);
                }
            });
        }
    }

    private void W0(long j10) {
        PlaybackException playbackException = this.f5012o;
        if (playbackException == null) {
            return;
        }
        a aVarJ0 = J0(playbackException, this.f4998a, this.f5020w == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f5002e).setErrorCode(aVarJ0.f5024a).setSubErrorCode(aVarJ0.f5025b).setException(playbackException).build();
        this.f4999b.execute(new Runnable() { // from class: c8.w1
            @Override // java.lang.Runnable
            public final void run() {
                this.f4978a.R0(playbackErrorEventBuild);
            }
        });
        this.B = true;
        this.f5012o = null;
    }

    private void X0(u7.y yVar, c8.b.C0096b c0096b, long j10) {
        if (yVar.R() != 2) {
            this.f5019v = false;
        }
        if (yVar.a() == null) {
            this.f5021x = false;
        } else if (c0096b.a(10)) {
            this.f5021x = true;
        }
        int iF1 = f1(yVar);
        if (this.f5010m != iF1) {
            this.f5010m = iF1;
            this.B = true;
            final PlaybackStateEvent playbackStateEventBuild = new PlaybackStateEvent.Builder().setState(this.f5010m).setTimeSinceCreatedMillis(j10 - this.f5002e).build();
            this.f4999b.execute(new Runnable() { // from class: c8.y1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4992a.S0(playbackStateEventBuild);
                }
            });
        }
    }

    private void Y0(u7.y yVar, c8.b.C0096b c0096b, long j10) {
        if (c0096b.a(2)) {
            u7.h0 h0VarM = yVar.m();
            boolean zC = h0VarM.c(2);
            boolean zC2 = h0VarM.c(1);
            boolean zC3 = h0VarM.c(3);
            if (zC || zC2 || zC3) {
                if (!zC) {
                    d1(j10, null, 0);
                }
                if (!zC2) {
                    Z0(j10, null, 0);
                }
                if (!zC3) {
                    b1(j10, null, 0);
                }
            }
        }
        if (D0(this.f5013p)) {
            b bVar = this.f5013p;
            u7.q qVar = bVar.f5026a;
            if (qVar.f26260w != -1) {
                d1(j10, qVar, bVar.f5027b);
                this.f5013p = null;
            }
        }
        if (D0(this.f5014q)) {
            b bVar2 = this.f5014q;
            Z0(j10, bVar2.f5026a, bVar2.f5027b);
            this.f5014q = null;
        }
        if (D0(this.f5015r)) {
            b bVar3 = this.f5015r;
            b1(j10, bVar3.f5026a, bVar3.f5027b);
            this.f5015r = null;
        }
    }

    private void Z0(long j10, u7.q qVar, int i10) {
        if (Objects.equals(this.f5017t, qVar)) {
            return;
        }
        if (this.f5017t == null && i10 == 0) {
            i10 = 1;
        }
        this.f5017t = qVar;
        e1(0, j10, qVar, i10);
    }

    private void a1(u7.y yVar, c8.b.C0096b c0096b) {
        u7.l lVarH0;
        if (c0096b.a(0)) {
            c8.b.a aVarC = c0096b.c(0);
            if (this.f5008k != null) {
                c1(aVarC.f4790b, aVarC.f4792d);
            }
        }
        if (c0096b.a(2) && this.f5008k != null && (lVarH0 = H0(yVar.m().a())) != null) {
            ((PlaybackMetrics.Builder) x7.l0.i(this.f5008k)).setDrmType(I0(lVarH0));
        }
        if (c0096b.a(1011)) {
            this.A++;
        }
    }

    private void b1(long j10, u7.q qVar, int i10) {
        if (Objects.equals(this.f5018u, qVar)) {
            return;
        }
        if (this.f5018u == null && i10 == 0) {
            i10 = 1;
        }
        this.f5018u = qVar;
        e1(2, j10, qVar, i10);
    }

    private void c1(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.f5008k;
        if (bVar == null || (iB = d0Var.b(bVar.f19684a)) == -1) {
            return;
        }
        d0Var.f(iB, this.f5004g);
        d0Var.n(this.f5004g.f26020c, this.f5003f);
        builder.setStreamType(N0(this.f5003f.f26037c));
        u7.d0.c cVar = this.f5003f;
        if (cVar.f26047m != -9223372036854775807L && !cVar.f26045k && !cVar.f26043i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f5003f.d());
        }
        builder.setPlaybackType(this.f5003f.f() ? 2 : 1);
        this.B = true;
    }

    private void d1(long j10, u7.q qVar, int i10) {
        if (Objects.equals(this.f5016s, qVar)) {
            return;
        }
        if (this.f5016s == null && i10 == 0) {
            i10 = 1;
        }
        this.f5016s = qVar;
        e1(1, j10, qVar, i10);
    }

    private void e1(int i10, long j10, u7.q qVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f5002e);
        if (qVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(O0(i11));
            String str = qVar.f26251n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = qVar.f26252o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = qVar.f26248k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = qVar.f26247j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = qVar.f26259v;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = qVar.f26260w;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = qVar.E;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = qVar.F;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = qVar.f26241d;
            if (str4 != null) {
                Pair<String, String> pairK0 = K0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairK0.first);
                Object obj = pairK0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = qVar.f26261x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f4999b.execute(new Runnable() { // from class: c8.v1
            @Override // java.lang.Runnable
            public final void run() {
                this.f4971a.T0(trackChangeEventBuild);
            }
        });
    }

    private int f1(u7.y yVar) {
        int iR = yVar.R();
        if (this.f5019v) {
            return 5;
        }
        if (this.f5021x) {
            return 13;
        }
        if (iR == 4) {
            return 11;
        }
        if (iR == 2) {
            int i10 = this.f5010m;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (yVar.D()) {
                return yVar.t() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iR == 3) {
            if (yVar.D()) {
                return yVar.t() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iR != 1 || this.f5010m == 0) {
            return this.f5010m;
        }
        return 12;
    }

    @Override // c8.a2.a
    public void B(c8.b.a aVar, String str) {
        io.bidmachine.media3.exoplayer.source.r.b bVar = aVar.f4792d;
        if (bVar == null || !bVar.b()) {
            F0();
            this.f5007j = str;
            this.f5008k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.7.1");
            c1(aVar.f4790b, aVar.f4792d);
        }
    }

    @Override // c8.b
    public void H(c8.b.a aVar, int i10, long j10, long j11) {
        io.bidmachine.media3.exoplayer.source.r.b bVar = aVar.f4792d;
        if (bVar != null) {
            String strE = this.f5000c.e(aVar.f4790b, (io.bidmachine.media3.exoplayer.source.r.b) x7.a.e(bVar));
            Long l10 = this.f5006i.get(strE);
            Long l11 = this.f5005h.get(strE);
            this.f5006i.put(strE, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f5005h.put(strE, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    public LogSessionId L0() {
        return this.f5001d.getSessionId();
    }

    @Override // c8.b
    public void N(c8.b.a aVar, u7.y.e eVar, u7.y.e eVar2, int i10) {
        if (i10 == 1) {
            this.f5019v = true;
        }
        this.f5009l = i10;
    }

    @Override // c8.b
    public void S(c8.b.a aVar, b8.b bVar) {
        this.f5022y += bVar.f4134g;
        this.f5023z += bVar.f4132e;
    }

    @Override // c8.b
    public void X(c8.b.a aVar, n8.j jVar) {
        if (aVar.f4792d == null) {
            return;
        }
        b bVar = new b((u7.q) x7.a.e(jVar.f22788c), jVar.f22789d, this.f5000c.e(aVar.f4790b, (io.bidmachine.media3.exoplayer.source.r.b) x7.a.e(aVar.f4792d)));
        int i10 = jVar.f22787b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f5014q = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f5015r = bVar;
                return;
            }
        }
        this.f5013p = bVar;
    }

    @Override // c8.b
    public void a(c8.b.a aVar, PlaybackException playbackException) {
        this.f5012o = playbackException;
    }

    @Override // c8.b
    public void g0(c8.b.a aVar, u7.l0 l0Var) {
        b bVar = this.f5013p;
        if (bVar != null) {
            u7.q qVar = bVar.f5026a;
            if (qVar.f26260w == -1) {
                this.f5013p = new b(qVar.b().B0(l0Var.f26206a).d0(l0Var.f26207b).N(), bVar.f5027b, bVar.f5028c);
            }
        }
    }

    @Override // c8.b
    public void i0(c8.b.a aVar, n8.i iVar, n8.j jVar, IOException iOException, boolean z10) {
        this.f5020w = jVar.f22786a;
    }

    @Override // c8.b
    public void u(u7.y yVar, c8.b.C0096b c0096b) {
        if (c0096b.d() == 0) {
            return;
        }
        U0(c0096b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a1(yVar, c0096b);
        W0(jElapsedRealtime);
        Y0(yVar, c0096b, jElapsedRealtime);
        V0(jElapsedRealtime);
        X0(yVar, c0096b, jElapsedRealtime);
        if (c0096b.a(1028)) {
            this.f5000c.g(c0096b.c(1028));
        }
    }

    @Override // c8.a2.a
    public void z(c8.b.a aVar, String str, boolean z10) {
        io.bidmachine.media3.exoplayer.source.r.b bVar = aVar.f4792d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f5007j)) {
            F0();
        }
        this.f5005h.remove(str);
        this.f5006i.remove(str);
    }

    @Override // c8.a2.a
    public void i(c8.b.a aVar, String str) {
    }

    @Override // c8.a2.a
    public void C(c8.b.a aVar, String str, String str2) {
    }
}
