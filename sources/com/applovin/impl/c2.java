package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.share.internal.ShareConstants;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class c2 extends y1 implements AppLovinCommunicatorSubscriber {
    private final d2 N;
    private MediaPlayer O;
    private final View P;
    protected final AppLovinVideoView Q;
    protected final com.applovin.impl.a R;
    protected final com.applovin.impl.adview.g S;
    protected k0 T;
    protected final ImageView U;
    protected final ProgressBar V;
    protected ProgressBar W;
    protected ImageView X;
    private final d Y;
    private final Handler Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Handler f6224a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected final c1 f6225b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected final c1 f6226c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final boolean f6227d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected boolean f6228e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected long f6229f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f6230g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f6231h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected boolean f6232i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f6233j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final AtomicBoolean f6234k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final AtomicBoolean f6235l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f6236m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private long f6237n0;

    /* JADX INFO: loaded from: classes.dex */
    class a implements c1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6238a;

        a(int i10) {
            this.f6238a = i10;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            c2 c2Var = c2.this;
            if (c2Var.T != null) {
                long seconds = ((long) this.f6238a) - TimeUnit.MILLISECONDS.toSeconds(c2Var.Q.getCurrentPosition());
                if (seconds <= 0) {
                    c2.this.f9116w = true;
                } else if (c2.this.P()) {
                    c2.this.T.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return c2.this.P();
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class b implements c1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f6240a;

        b(Integer num) {
            this.f6240a = num;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            c2 c2Var = c2.this;
            if (c2Var.f6232i0) {
                c2Var.V.setVisibility(8);
            } else {
                c2.this.V.setProgress((int) ((c2Var.Q.getCurrentPosition() / c2.this.f6229f0) * this.f6240a.intValue()));
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !c2.this.f6232i0;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class c implements c1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f6243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f6244c;

        c(long j10, Integer num, Long l10) {
            this.f6242a = j10;
            this.f6243b = num;
            this.f6244c = l10;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            c2.this.W.setProgress((int) ((c2.this.f9112s / this.f6242a) * this.f6243b.intValue()));
            c2.this.f9112s += this.f6244c.longValue();
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return c2.this.f9112s < this.f6242a;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class d implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private d() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            c2.this.a(motionEvent);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.p pVar = c2.this.f9096c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.f9096c.a("AppLovinFullscreenActivity", "Video completed");
            }
            c2.this.f6233j0 = true;
            c2 c2Var = c2.this;
            if (!c2Var.f9114u) {
                c2Var.R();
            } else if (c2Var.h()) {
                c2.this.A();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            c2.this.g("Video view error (" + i10 + "," + i11 + ")");
            c2.this.Q.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            com.applovin.impl.sdk.p pVar = c2.this.f9096c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.f9096c.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i10 + ", " + i11 + ")");
            }
            if (i10 == 701) {
                c2.this.Q();
                return false;
            }
            if (i10 != 3) {
                if (i10 != 702) {
                    return false;
                }
                c2.this.E();
                return false;
            }
            c2.this.f6225b0.b();
            c2 c2Var = c2.this;
            if (c2Var.S != null) {
                c2Var.O();
            }
            c2.this.E();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            c2.this.O = mediaPlayer;
            mediaPlayer.setOnInfoListener(c2.this.Y);
            mediaPlayer.setOnErrorListener(c2.this.Y);
            float f10 = !c2.this.f6228e0 ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            c2.this.f9115v = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            c2.this.d(mediaPlayer.getDuration());
            c2.this.N();
            com.applovin.impl.sdk.p pVar = c2.this.f9096c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.f9096c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + c2.this.O);
            }
        }

        /* synthetic */ d(c2 c2Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class e implements View.OnClickListener {
        private e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c2 c2Var = c2.this;
            if (view == c2Var.S) {
                c2Var.S();
                return;
            }
            if (view == c2Var.U) {
                c2Var.T();
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.f9096c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ e(c2 c2Var, a aVar) {
            this();
        }
    }

    public c2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.N = new d2(this.f9094a, this.f9097d, this.f9095b);
        a aVar = null;
        this.X = null;
        d dVar = new d(this, aVar);
        this.Y = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.Z = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f6224a0 = handler2;
        c1 c1Var = new c1(handler, this.f9095b);
        this.f6225b0 = c1Var;
        this.f6226c0 = new c1(handler2, this.f9095b);
        boolean zD0 = this.f9094a.D0();
        this.f6227d0 = zD0;
        this.f6228e0 = q7.e(this.f9095b);
        this.f6231h0 = -1;
        this.f6234k0 = new AtomicBoolean();
        this.f6235l0 = new AtomicBoolean();
        this.f6236m0 = -2L;
        this.f6237n0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.Q = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(dVar);
        appLovinVideoView.setOnCompletionListener(dVar);
        appLovinVideoView.setOnErrorListener(dVar);
        bVar.i().putString("video_view_address", g8.a(appLovinVideoView));
        View view = new View(activity);
        this.P = view;
        boolean z10 = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) lVar.a(z4.f9324q1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(lVar, z4.f9215e0, activity, dVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(lVar, z4.f9215e0, activity, dVar));
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.i9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return c2.a(view2, motionEvent);
                }
            });
        }
        e eVar = new e(this, aVar);
        if (bVar.f0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.X(), activity);
            this.S = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        } else {
            this.S = null;
        }
        if (a(this.f6228e0, lVar)) {
            ImageView imageView = new ImageView(activity);
            this.U = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(eVar);
            f(this.f6228e0);
        } else {
            this.U = null;
        }
        if (zD0) {
            com.applovin.impl.a aVar2 = new com.applovin.impl.a(activity, ((Integer) lVar.a(z4.f9307o2)).intValue(), R.attr.progressBarStyleLarge);
            this.R = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.R = null;
        }
        int iC = c();
        if (((Boolean) lVar.a(z4.Y1)).booleanValue() && iC > 0) {
            z10 = true;
        }
        if (this.T == null && z10) {
            this.T = new k0(activity);
            int iT = bVar.t();
            this.T.setTextColor(iT);
            this.T.setTextSize(((Integer) lVar.a(z4.X1)).intValue());
            this.T.setFinishedStrokeColor(iT);
            this.T.setFinishedStrokeWidth(((Integer) lVar.a(z4.W1)).intValue());
            this.T.setMax(iC);
            this.T.setProgress(iC);
            c1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iC));
        }
        if (!bVar.m0()) {
            this.V = null;
            return;
        }
        Long l10 = (Long) lVar.a(z4.f9280l2);
        Integer num = (Integer) lVar.a(z4.f9289m2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.V = progressBar;
        a(progressBar, bVar.l0(), num.intValue());
        c1Var.a("PROGRESS_BAR", l10.longValue(), new b(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f9111r = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.f6232i0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f9095b.o0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.f6231h0 < 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.f6231h0 + "ms for MediaPlayer: " + this.O);
        }
        this.Q.seekTo(this.f6231h0);
        this.Q.start();
        this.f6225b0.b();
        this.f6231h0 = -1;
        a(new Runnable() { // from class: com.applovin.impl.e9
            @Override // java.lang.Runnable
            public final void run() {
                this.f6435a.I();
            }
        }, 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.f6235l0.compareAndSet(false, true)) {
            a(this.S, this.f9094a.f0(), new Runnable() { // from class: com.applovin.impl.k9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7005a.J();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void f(boolean z10) {
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f9097d.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
        if (animatedVectorDrawable == null) {
            ImageViewUtils.setImageUri(this.U, z10 ? this.f9094a.I() : this.f9094a.d0(), this.f9095b);
            return;
        }
        this.U.setScaleType(ImageView.ScaleType.FIT_XY);
        this.U.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
    }

    private void g(boolean z10) {
        this.f6230g0 = C();
        if (z10) {
            this.Q.pause();
        } else {
            this.Q.stopPlayback();
        }
    }

    @Override // com.applovin.impl.y1
    protected void A() {
        this.N.a(this.f9105l);
        this.f9111r = SystemClock.elapsedRealtime();
    }

    protected void N() {
        long jR;
        long millis;
        if (this.f9094a.Q() >= 0 || this.f9094a.R() >= 0) {
            if (this.f9094a.Q() >= 0) {
                jR = this.f9094a.Q();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f9094a;
                long j10 = this.f6229f0;
                long j11 = j10 > 0 ? j10 : 0L;
                if (aVar.W0()) {
                    int iI1 = (int) ((com.applovin.impl.sdk.ad.a) this.f9094a).i1();
                    if (iI1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iI1);
                    } else {
                        int iS = (int) aVar.s();
                        if (iS > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iS);
                        }
                    }
                    j11 += millis;
                }
                jR = (long) (j11 * (((double) this.f9094a.R()) / 100.0d));
            }
            c(jR);
        }
    }

    protected boolean P() {
        return (this.f9116w || this.f6232i0 || !this.Q.isPlaying()) ? false : true;
    }

    protected void Q() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.f9
            @Override // java.lang.Runnable
            public final void run() {
                this.f6589a.K();
            }
        });
    }

    public void R() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        g(this.f9094a.d1());
        long jO = this.f9094a.O();
        if (jO > 0) {
            this.f9112s = 0L;
            Long l10 = (Long) this.f9095b.a(z4.f9352t2);
            Integer num = (Integer) this.f9095b.a(z4.f9379w2);
            ProgressBar progressBar = new ProgressBar(this.f9097d, null, R.attr.progressBarStyleHorizontal);
            this.W = progressBar;
            a(progressBar, this.f9094a.N(), num.intValue());
            this.f6226c0.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), new c(jO, num, l10));
            this.f6226c0.b();
        }
        this.N.a(this.f9104k, this.f9103j, b(), this.W);
        a("javascript:al_onPoststitialShow(" + this.f9119z + "," + this.A + ");", this.f9094a.y());
        if (this.f9104k != null) {
            if (this.f9094a.s() >= 0) {
                a(this.f9104k, this.f9094a.s(), new Runnable() { // from class: com.applovin.impl.d9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6377a.L();
                    }
                });
            } else {
                this.f9104k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f9104k;
        if (gVar != null) {
            arrayList.add(new j4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f9103j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9103j;
            arrayList.add(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = this.W;
        if (progressBar2 != null) {
            arrayList.add(new j4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f9094a.getAdEventTracker().b(b(), arrayList);
        p();
        this.f6232i0 = true;
    }

    public void S() {
        this.f6236m0 = SystemClock.elapsedRealtime() - this.f6237n0;
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.f6236m0 + "ms");
        }
        D();
    }

    protected void T() {
        MediaPlayer mediaPlayer = this.O;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = this.f6228e0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            boolean z10 = !this.f6228e0;
            this.f6228e0 = z10;
            f(z10);
            a(this.f6228e0, 0L);
        } catch (Throwable unused) {
        }
    }

    protected void d(long j10) {
        this.f6229f0 = j10;
    }

    @Override // com.applovin.impl.y1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.y1
    protected void m() {
        super.a(C(), this.f6227d0, F(), this.f6236m0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f9094a.getAdIdNumber() && this.f6227d0) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !s0.a(i10)) || this.f6233j0 || this.Q.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.y1
    public void r() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.f6227d0) {
                AppLovinCommunicator.getInstance(this.f9097d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.Q;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.Q.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.O;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.r();
    }

    @Override // com.applovin.impl.y1
    public void v() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f6231h0 = this.Q.getCurrentPosition();
        this.Q.pause();
        this.f6225b0.c();
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Paused video at position " + this.f6231h0 + "ms");
        }
    }

    @Override // com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            aVar.a();
            final com.applovin.impl.a aVar2 = this.R;
            Objects.requireNonNull(aVar2);
            a(new Runnable() { // from class: com.applovin.impl.g9
                @Override // java.lang.Runnable
                public final void run() {
                    aVar2.b();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.f6236m0 = -1L;
        this.f6237n0 = SystemClock.elapsedRealtime();
    }

    protected int C() {
        long currentPosition = this.Q.getCurrentPosition();
        if (this.f6233j0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f6229f0) * 100.0f) : this.f6230g0;
    }

    public void D() {
        this.f9119z++;
        if (this.f9094a.v()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.a("AppLovinFullscreenActivity", cTJaRZ.IQEhZRLdRo);
            }
            R();
        }
    }

    protected void E() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.l9
            @Override // java.lang.Runnable
            public final void run() {
                this.f7072a.H();
            }
        });
    }

    protected boolean F() {
        if (this.K && this.f9094a.a1()) {
            return true;
        }
        return G();
    }

    protected boolean G() {
        return C() >= this.f9094a.h0();
    }

    @Override // com.applovin.impl.y1
    public void b(boolean z10) {
        super.b(z10);
        if (z10) {
            b(0L);
            if (this.f6232i0) {
                this.f6226c0.b();
                return;
            }
            return;
        }
        if (this.f6232i0) {
            this.f6226c0.c();
        } else {
            v();
        }
    }

    protected void g(String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f9094a);
        }
        if (this.f6234k0.compareAndSet(false, true)) {
            if (((Boolean) this.f9095b.a(z4.P0)).booleanValue()) {
                this.f9095b.I().d(this.f9094a, com.applovin.impl.sdk.l.p());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.G;
            if (appLovinAdDisplayListener instanceof n2) {
                ((n2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f9094a instanceof r7 ? "handleVastVideoError" : "handleVideoError";
            this.f9095b.E().a(str2, str, this.f9094a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f9095b.g().a(f2.G, this.f9094a, mapHashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        String str;
        this.N.a(this.U, this.S, this.R, this.V, this.T, this.Q, this.P, b(), this.f9103j, this.X, viewGroup);
        if (p0.e() && (str = this.f9095b.p0().getExtraParameters().get("audio_focus_request")) != null) {
            this.Q.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.f9095b.a(z4.f9212d6)).booleanValue() || !a(!this.f6227d0)) {
            this.Q.setVideoURI(this.f9094a.n0());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            com.applovin.impl.adview.k kVar = this.f9103j;
            if (kVar != null) {
                kVar.b();
            }
            this.Q.start();
            if (this.f6227d0) {
                Q();
            }
            b().renderAd(this.f9094a);
            if (this.S != null) {
                this.f9095b.s0().a(new u6(this.f9095b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.h9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6769a.O();
                    }
                }), f6.b.TIMEOUT, this.f9094a.g0(), true);
            }
            super.c(this.f6228e0);
        }
    }

    @Override // com.applovin.impl.y1
    public void f() {
        super.f();
        this.N.a((View) this.S);
        if (!h() || this.f6232i0) {
            A();
        }
    }

    @Override // com.applovin.impl.y1
    public void b(long j10) {
        a(new Runnable() { // from class: com.applovin.impl.j9
            @Override // java.lang.Runnable
            public final void run() {
                this.f6924a.M();
            }
        }, j10);
    }

    @Override // com.applovin.impl.y1
    protected void a(String str, long j10) {
        super.a(str, j10);
    }

    private void a(ProgressBar progressBar, int i10, int i11) {
        progressBar.setMax(i11);
        progressBar.setPadding(0, 0, 0, 0);
        progressBar.setProgressTintList(ColorStateList.valueOf(i10));
    }

    @Override // com.applovin.impl.y1
    public void a(String str) {
        this.f6225b0.a();
        this.f6226c0.a();
        this.Z.removeCallbacksAndMessages(null);
        this.f6224a0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f9095b.a(z4.T6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f9094a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        super.a(str);
    }

    protected void a(MotionEvent motionEvent) {
        Context context;
        if (this.f9094a.C0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriE0 = this.f9094a.e0();
            if (uriE0 != null) {
                if (!((Boolean) this.f9095b.a(z4.f9376w)).booleanValue() || (context = this.f9097d) == null) {
                    context = b() != null ? b().getContext() : com.applovin.impl.sdk.l.p();
                }
                this.f9095b.l().trackAndLaunchVideoClick(this.f9094a, uriE0, motionEvent, this, context);
                v2.a(this.F, this.f9094a);
                this.A++;
            }
        }
    }

    private static boolean a(boolean z10, com.applovin.impl.sdk.l lVar) {
        if (!((Boolean) lVar.a(z4.f9208d2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) lVar.a(z4.f9217e2)).booleanValue() || z10) {
            return true;
        }
        return ((Boolean) lVar.a(z4.f9235g2)).booleanValue();
    }
}
