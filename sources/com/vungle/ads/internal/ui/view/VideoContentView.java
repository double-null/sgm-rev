package com.vungle.ads.internal.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.NativeVideoPlaybackError;
import com.vungle.ads.R;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.OnSilentModeChangeListener;
import com.vungle.ads.internal.util.RingerModeReceiver;
import com.vungle.ads.nativead.NativeVideoContract;
import com.vungle.ads.nativead.NativeVideoListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.o0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.r;
import wc.s;
import wc.w;

/* JADX INFO: compiled from: VideoContentView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoContentView extends BaseContentView implements NativeVideoContract.VideoControl, NativeVideoContract.VideoLifecycleCallback, OnSilentModeChangeListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "NativeAd-VideoContentView";
    private final VideoContentView$activityLifecycle$1 activityLifecycle;
    private WeakReference<Activity> adActivity;
    private final AtomicBoolean cp100Fired;
    private final AtomicBoolean cp25Fired;
    private final AtomicBoolean cp50Fired;
    private final AtomicBoolean cp75Fired;
    private final AtomicBoolean ignoredFirst;
    private final AtomicBoolean isReceiverRegistered;
    private ImageView muteView;
    private final TimeIntervalMetric preparedDurationMetric;
    private final RingerModeReceiver ringerModeReceiver;
    private final AtomicBoolean startFired;
    private final AtomicBoolean videoErrorHandled;
    private AdVideoView videoView;

    /* JADX INFO: compiled from: VideoContentView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.vungle.ads.internal.ui.view.VideoContentView$activityLifecycle$1] */
    public VideoContentView(Context context, NativeAdInternal internal) {
        super(context, internal);
        t.f(context, "context");
        t.f(internal, "internal");
        this.startFired = new AtomicBoolean(false);
        this.cp25Fired = new AtomicBoolean(false);
        this.cp50Fired = new AtomicBoolean(false);
        this.cp75Fired = new AtomicBoolean(false);
        this.cp100Fired = new AtomicBoolean(false);
        this.videoErrorHandled = new AtomicBoolean(false);
        this.preparedDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.NATIVE_VIDEO_PREPARE_DURATION_MS);
        this.ringerModeReceiver = new RingerModeReceiver();
        this.isReceiverRegistered = new AtomicBoolean(false);
        this.ignoredFirst = new AtomicBoolean(false);
        this.activityLifecycle = new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.ui.view.VideoContentView$activityLifecycle$1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onActivityPaused(Activity activity) {
                t.f(activity, "activity");
                WeakReference weakReference = this.this$0.adActivity;
                if (t.a(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
                    Logger.Companion.d("NativeAd-VideoContentView", "onActivityPaused and pause video");
                    AdVideoView videoView = this.this$0.getVideoView();
                    if (videoView != null) {
                        videoView.pauseOnActivityPaused$vungle_ads_release();
                    }
                }
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onActivityResumed(Activity activity) {
                t.f(activity, "activity");
                WeakReference weakReference = this.this$0.adActivity;
                if (t.a(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
                    Logger.Companion.d("NativeAd-VideoContentView", "onActivityResumed and try to play video");
                    AdVideoView videoView = this.this$0.getVideoView();
                    if (videoView != null) {
                        videoView.playOnActivityResumed$vungle_ads_release();
                    }
                }
            }
        };
    }

    private final Activity getAdActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            t.e(context, "ctx.baseContext");
        }
        return null;
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }

    private final void onMuteUpdateUI(boolean z10) {
        if (z10) {
            ImageView imageView = this.muteView;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.liftoff_icon_mute);
                return;
            }
            return;
        }
        ImageView imageView2 = this.muteView;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.liftoff_icon_unmute);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: render$lambda-5, reason: not valid java name */
    public static final void m310render$lambda5(VideoContentView this$0, float f10, float f11) {
        t.f(this$0, "this$0");
        ImageView imageView = this$0.muteView;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        ImageView imageView2 = this$0.muteView;
        if (imageView2 == null) {
            return;
        }
        imageView2.setTranslationY(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: render$lambda-6, reason: not valid java name */
    public static final void m311render$lambda6(VideoContentView this$0, View view) {
        t.f(this$0, "this$0");
        this$0.toggleMute();
    }

    private final void showImageViewAsFallback() {
        Context context = getContext();
        t.e(context, "context");
        super.render(context);
        ImageView imageView$vungle_ads_release = getImageView$vungle_ads_release();
        if (imageView$vungle_ads_release != null) {
            imageView$vungle_ads_release.setVisibility(0);
        }
        ImageView imageView = this.muteView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        AdVideoView adVideoView = this.videoView;
        if (adVideoView == null) {
            return;
        }
        adVideoView.setVisibility(8);
    }

    private final void toggleMute() {
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            boolean z10 = !adVideoView.isMuted();
            adVideoView.setMuted(z10);
            onMuteUpdateUI(z10);
        }
    }

    private final void unRegisterRingerMode() {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            if (this.isReceiverRegistered.getAndSet(false)) {
                Logger.Companion.d(TAG, "unregisterReceiver()");
                this.ringerModeReceiver.setListener(null);
                getContext().unregisterReceiver(this.ringerModeReceiver);
            }
            objC = r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "unregisterReceiver", thG);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.BaseContentView
    public void destroy$vungle_ads_release() {
        Logger.Companion.d(TAG, "destroy()");
        unRegisterRingerMode();
        WeakReference<Activity> weakReference = this.adActivity;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.adActivity = null;
        ActivityManager.Companion.removeLifecycleListener(this.activityLifecycle);
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            adVideoView.release();
        }
        this.videoView = null;
        super.destroy$vungle_ads_release();
    }

    @Override // com.vungle.ads.nativead.NativeVideoContract.VideoControl
    public int getCurrentTime() {
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            return adVideoView.getCurrentPositionMs();
        }
        return 0;
    }

    @Override // com.vungle.ads.nativead.NativeVideoContract.VideoControl
    public int getDuration() {
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            return adVideoView.getDurationMs();
        }
        return 0;
    }

    public final AdVideoView getVideoView() {
        return this.videoView;
    }

    public final Boolean isMuted$vungle_ads_release() {
        AdVideoView adVideoView = this.videoView;
        if (adVideoView != null) {
            return Boolean.valueOf(adVideoView.isMuted());
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Object objC;
        super.onAttachedToWindow();
        try {
            r.a aVar = r.f27774b;
            if (!this.isReceiverRegistered.getAndSet(true)) {
                Logger.Companion.d(TAG, "registerReceiver()");
                this.ignoredFirst.set(false);
                this.ringerModeReceiver.setListener(this);
                getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            }
            objC = r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "registerReceiver", thG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unRegisterRingerMode();
    }

    @Override // com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback
    public void onVideoCompleted() {
        NativeAdInternal.trackTpatEvent$default(getInternal(), Constants.TPAT_VIDEO_CLOSE, null, 2, null);
        NativeAdInternal.trackOMEvent$default(getInternal(), 3, null, 2, null);
        NativeVideoListener nativeVideoListener = getNativeVideoListener();
        if (nativeVideoListener != null) {
            nativeVideoListener.onVideoEnd();
        }
    }

    @Override // com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback
    public void onVideoError(int i10, String extra) {
        t.f(extra, "extra");
        if (this.videoErrorHandled.getAndSet(true)) {
            return;
        }
        showImageViewAsFallback();
        new NativeVideoPlaybackError("w=" + i10 + " e=" + extra + " url=" + getInternal().getOriginalVideoUrl$vungle_ads_release()).setLogEntry$vungle_ads_release(getInternal().getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback
    public void onVideoMuted(boolean z10) {
        if (z10) {
            NativeAdInternal.trackTpatEvent$default(getInternal(), Constants.TPAT_VIDEO_MUTE, null, 2, null);
            NativeAdInternal.trackOMEvent$default(getInternal(), 9, null, 2, null);
            NativeVideoListener nativeVideoListener = getNativeVideoListener();
            if (nativeVideoListener != null) {
                nativeVideoListener.onVideoMute();
                return;
            }
            return;
        }
        NativeAdInternal.trackTpatEvent$default(getInternal(), Constants.TPAT_VIDEO_UNMUTE, null, 2, null);
        NativeAdInternal.trackOMEvent$default(getInternal(), 10, null, 2, null);
        NativeVideoListener nativeVideoListener2 = getNativeVideoListener();
        if (nativeVideoListener2 != null) {
            nativeVideoListener2.onVideoUnmute();
        }
    }

    @Override // com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback
    public void onVideoPause() {
        NativeVideoListener nativeVideoListener = getNativeVideoListener();
        if (nativeVideoListener != null) {
            nativeVideoListener.onVideoPause();
        }
    }

    @Override // com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback
    public void onVideoPlay() {
        NativeVideoListener nativeVideoListener = getNativeVideoListener();
        if (nativeVideoListener != null) {
            nativeVideoListener.onVideoPlay();
        }
    }

    @Override // com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback
    public void onVideoPrepared() {
        this.preparedDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.preparedDurationMetric, getInternal().getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // com.vungle.ads.nativead.NativeVideoContract.VideoLifecycleCallback
    public void onVideoProgress(int i10) {
        if ((1 <= i10 && i10 < 25) == true) {
            if (this.startFired.compareAndSet(false, true)) {
                int duration = getDuration();
                Map<String, ? extends Object> mapK = o0.k(w.a(NativeAdInternal.QUARTILE_START_KEY_DURATION, Integer.valueOf(duration)), w.a(NativeAdInternal.QUARTILE_START_KEY_VOLUME, Integer.valueOf(!t.a(isMuted$vungle_ads_release(), Boolean.TRUE) ? 1 : 0)));
                getInternal().trackTpatEvent(Constants.VIDEO_LENGTH_TPAT, String.valueOf(duration));
                getInternal().trackOMEvent(4, mapK);
                return;
            }
            return;
        }
        if ((25 <= i10 && i10 < 50) == true) {
            if (this.cp25Fired.compareAndSet(false, true)) {
                NativeAdInternal.trackTpatEvent$default(getInternal(), Constants.TPAT_CHECKPOINT_25, null, 2, null);
                NativeAdInternal.trackOMEvent$default(getInternal(), 5, null, 2, null);
                return;
            }
            return;
        }
        if ((50 <= i10 && i10 < 75) == true) {
            if (this.cp50Fired.compareAndSet(false, true)) {
                NativeAdInternal.trackTpatEvent$default(getInternal(), Constants.TPAT_CHECKPOINT_50, null, 2, null);
                NativeAdInternal.trackOMEvent$default(getInternal(), 6, null, 2, null);
                return;
            }
            return;
        }
        if ((75 <= i10 && i10 < 100) == true) {
            if (this.cp75Fired.compareAndSet(false, true)) {
                NativeAdInternal.trackTpatEvent$default(getInternal(), Constants.TPAT_CHECKPOINT_75, null, 2, null);
                NativeAdInternal.trackOMEvent$default(getInternal(), 7, null, 2, null);
                return;
            }
            return;
        }
        if (i10 < 100 || !this.cp100Fired.compareAndSet(false, true)) {
            return;
        }
        NativeAdInternal.trackTpatEvent$default(getInternal(), Constants.TPAT_CHECKPOINT_100, null, 2, null);
    }

    @Override // com.vungle.ads.internal.ui.view.BaseContentView
    public void render(Context context) {
        Object objC;
        t.f(context, "context");
        Logger.Companion companion = Logger.Companion;
        companion.d(TAG, "initView");
        ImageView imageView$vungle_ads_release = getImageView$vungle_ads_release();
        if (imageView$vungle_ads_release != null) {
            imageView$vungle_ads_release.setVisibility(8);
        }
        ActivityManager.Companion.addLifecycleListener(this.activityLifecycle);
        boolean zIsStartMuted$vungle_ads_release = getInternal().isStartMuted$vungle_ads_release();
        companion.d(TAG, "startMuted=" + zIsStartMuted$vungle_ads_release);
        g0 g0Var = null;
        AdVideoView adVideoView = new AdVideoView(context, null, 2, null);
        this.videoView = adVideoView;
        adVideoView.setMuted(zIsStartMuted$vungle_ads_release);
        AdVideoView adVideoView2 = this.videoView;
        if (adVideoView2 != null) {
            adVideoView2.setLooping(false);
        }
        AdVideoView adVideoView3 = this.videoView;
        if (adVideoView3 != null) {
            adVideoView3.setAutoVisibility(true, 0.01f);
        }
        AdVideoView adVideoView4 = this.videoView;
        if (adVideoView4 != null) {
            adVideoView4.setVideoLifecycleCallback(this);
        }
        AdVideoView adVideoView5 = this.videoView;
        if (adVideoView5 != null) {
            adVideoView5.setVideoTransformCallback$vungle_ads_release(new AdVideoView.VideoTransformCallback() { // from class: com.vungle.ads.internal.ui.view.i
                @Override // com.vungle.ads.internal.ui.view.AdVideoView.VideoTransformCallback
                public final void onVideoTransformed(float f10, float f11) {
                    VideoContentView.m310render$lambda5(this.f13119a, f10, f11);
                }
            });
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        AdVideoView adVideoView6 = this.videoView;
        if (adVideoView6 != null) {
            adVideoView6.setLayoutParams(layoutParams);
        }
        addView(this.videoView);
        this.muteView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(5);
        layoutParams2.addRule(6);
        ImageView imageView = this.muteView;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams2);
        }
        ImageView imageView2 = this.muteView;
        if (imageView2 != null) {
            imageView2.setClickable(true);
        }
        ImageView imageView3 = this.muteView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.internal.ui.view.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoContentView.m311render$lambda6(this.f13120a, view);
                }
            });
        }
        onMuteUpdateUI(zIsStartMuted$vungle_ads_release);
        addView(this.muteView);
        ImageView imageView4 = this.muteView;
        if (imageView4 != null) {
            imageView4.bringToFront();
        }
        requestLayout();
        try {
            r.a aVar = r.f27774b;
            Activity adActivity = getAdActivity(context);
            if (adActivity != null) {
                this.adActivity = new WeakReference<>(adActivity);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("adActivity=");
            WeakReference<Activity> weakReference = this.adActivity;
            sb2.append(weakReference != null ? weakReference.get() : null);
            r.c(Integer.valueOf(companion.d(TAG, sb2.toString())));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(s.a(th));
        }
        this.preparedDurationMetric.markStart();
        try {
            Uri uri = Uri.parse(getInternal().getMainVideoPath$vungle_ads_release());
            t.e(uri, "parse(this)");
            AdVideoView adVideoView7 = this.videoView;
            if (adVideoView7 != null) {
                adVideoView7.setSource(uri);
            }
            AdVideoView adVideoView8 = this.videoView;
            if (adVideoView8 != null) {
                adVideoView8.play();
                g0Var = g0.f27756a;
            }
            objC = r.c(g0Var);
        } catch (Throwable th2) {
            r.a aVar3 = r.f27774b;
            objC = r.c(s.a(th2));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            onVideoError(-2, String.valueOf(thG.getLocalizedMessage()));
        }
    }

    public final void setVideoView(AdVideoView adVideoView) {
        this.videoView = adVideoView;
    }

    @Override // com.vungle.ads.internal.util.OnSilentModeChangeListener
    public void notifySilentModeChange(boolean z10) {
        Boolean boolIsMuted$vungle_ads_release = isMuted$vungle_ads_release();
        Logger.Companion.d(TAG, "silentModeEnabled=" + z10 + ykDFMuXDQMaR.xrh + boolIsMuted$vungle_ads_release);
        if (this.ignoredFirst.getAndSet(true) && boolIsMuted$vungle_ads_release != null && !t.a(Boolean.valueOf(z10), boolIsMuted$vungle_ads_release)) {
            toggleMute();
        }
    }
}
