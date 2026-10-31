package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.nativead.NativeVideoContract;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: AdVideoView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdVideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final Companion Companion = new Companion(null);
    public static final int ERROR_VIDEO_PLAYBACK_FAILED = -2;
    public static final int ERROR_VIDEO_PREPARE_FAILED = -1;
    private static final long PROGRESS_INTERVAL_MS = 1000;
    private static final String TAG = "NativeAd-Video";
    private boolean autoVisibility;
    private NativeVideoContract.VideoLifecycleCallback callback;
    private int durationMs;
    private final Handler handler;
    private int lastPosMs;
    private int lastProgressSent;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private boolean looping;
    private id.a<? extends MediaPlayer> mediaPlayerFactory;
    private MediaPlayer mp;
    private boolean muted;
    private AtomicBoolean prepared;
    private AtomicBoolean preparing;
    private final ProgressUpdateRunnable progressUpdater;
    private final ViewTreeObserver.OnScrollChangedListener scrollListener;
    private Uri sourceUri;
    private Surface surface;
    private TextureView texture;
    private boolean videoCompleted;
    private int videoH;
    private boolean videoPaused;
    private VideoTransformCallback videoTransformCallback;
    private int videoW;
    private float visibilityThreshold;
    private boolean wantPlay;

    /* JADX INFO: compiled from: AdVideoView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AdVideoView.kt */
    private static final class ProgressUpdateRunnable implements Runnable {
        private final WeakReference<AdVideoView> weakRef;

        public ProgressUpdateRunnable(AdVideoView adVideoView) {
            t.f(adVideoView, "adVideoView");
            this.weakRef = new WeakReference<>(adVideoView);
        }

        @Override // java.lang.Runnable
        public void run() {
            AdVideoView adVideoView = this.weakRef.get();
            if (adVideoView == null) {
                return;
            }
            adVideoView.calculateAndNotifyProgress();
            if (adVideoView.prepared.get()) {
                MediaPlayer mediaPlayer = adVideoView.mp;
                boolean z10 = false;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    z10 = true;
                }
                if (!z10 || adVideoView.videoCompleted) {
                    return;
                }
                adVideoView.handler.postDelayed(this, AdVideoView.PROGRESS_INTERVAL_MS);
            }
        }
    }

    /* JADX INFO: compiled from: AdVideoView.kt */
    public interface VideoTransformCallback {
        void onVideoTransformed(float f10, float f11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdVideoView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        t.f(context, "context");
    }

    private final void applyMute() {
        float f10 = this.muted ? 0.0f : 1.0f;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f10, f10);
        }
    }

    private final void applyTransform() {
        if (this.videoW <= 0 || this.videoH <= 0) {
            return;
        }
        int width = this.texture.getWidth();
        int height = this.texture.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        float f13 = this.videoW / this.videoH;
        Matrix matrix = new Matrix();
        float f14 = f12 > f13 ? f11 / this.videoH : f10 / this.videoW;
        matrix.setScale((this.videoW * f14) / f10, (this.videoH * f14) / f11, f10 / 2.0f, f11 / 2.0f);
        this.texture.setTransform(matrix);
        this.texture.invalidate();
        float f15 = (f10 - (this.videoW * f14)) / 2.0f;
        float f16 = (f11 - (this.videoH * f14)) / 2.0f;
        VideoTransformCallback videoTransformCallback = this.videoTransformCallback;
        if (videoTransformCallback != null) {
            videoTransformCallback.onVideoTransformed(this.texture.getX() + f15, this.texture.getY() + f16);
        }
    }

    private final void beginProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        this.handler.post(this.progressUpdater);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateAndNotifyProgress() {
        int iJ;
        int i10 = this.durationMs;
        if (i10 <= 0 || !this.prepared.get() || (iJ = od.k.j((int) ((((long) getCurrentPositionMs()) * ((long) 100)) / ((long) i10)), 0, 100)) == this.lastProgressSent) {
            return;
        }
        this.lastProgressSent = iJ;
        notifyProgress(iJ);
    }

    private final void checkVisibility() {
        if (this.autoVisibility) {
            if (!isVisibleEnough() || !this.wantPlay || this.videoPaused) {
                if (this.prepared.get()) {
                    MediaPlayer mediaPlayer = this.mp;
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        Logger.Companion.d(TAG, "auto-pause: visibility NOT enough");
                        pauseInternal();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.prepared.get()) {
                Surface surface = this.surface;
                if (surface != null && surface.isValid()) {
                    MediaPlayer mediaPlayer2 = this.mp;
                    if ((mediaPlayer2 != null && mediaPlayer2.isPlaying()) || this.videoCompleted) {
                        return;
                    }
                    Logger.Companion companion = Logger.Companion;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("auto-resume: visibility OK, start() at pos=");
                    MediaPlayer mediaPlayer3 = this.mp;
                    sb2.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null);
                    sb2.append(" ms");
                    companion.d(TAG, sb2.toString());
                    MediaPlayer mediaPlayer4 = this.mp;
                    if (mediaPlayer4 != null) {
                        mediaPlayer4.start();
                    }
                    notifyPlay();
                    return;
                }
            }
            prepareIfNeeded();
        }
    }

    private final void detachSurface() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
    }

    private final void endProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        calculateAndNotifyProgress();
    }

    private final void ensurePlayer() {
        if (this.mp != null) {
            return;
        }
        MediaPlayer mediaPlayerInvoke = this.mediaPlayerFactory.invoke();
        mediaPlayerInvoke.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayerInvoke.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.vungle.ads.internal.ui.view.a
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                AdVideoView.m302ensurePlayer$lambda14$lambda10(this.f13111a, mediaPlayer);
            }
        });
        mediaPlayerInvoke.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.vungle.ads.internal.ui.view.b
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                AdVideoView.m303ensurePlayer$lambda14$lambda11(this.f13112a, mediaPlayer, i10, i11);
            }
        });
        mediaPlayerInvoke.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.vungle.ads.internal.ui.view.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                AdVideoView.m304ensurePlayer$lambda14$lambda12(this.f13113a, mediaPlayer);
            }
        });
        mediaPlayerInvoke.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.vungle.ads.internal.ui.view.d
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                return AdVideoView.m305ensurePlayer$lambda14$lambda13(this.f13114a, mediaPlayer, i10, i11);
            }
        });
        this.mp = mediaPlayerInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-10, reason: not valid java name */
    public static final void m302ensurePlayer$lambda14$lambda10(AdVideoView this$0, MediaPlayer mediaPlayer) {
        t.f(this$0, "this$0");
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this$0.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPrepared();
        }
        this$0.durationMs = mediaPlayer.getDuration();
        boolean z10 = false;
        this$0.preparing.set(false);
        this$0.prepared.set(true);
        int i10 = this$0.lastPosMs;
        if (i10 > 0) {
            mediaPlayer.seekTo(i10);
        }
        this$0.applyMute();
        Logger.Companion companion = Logger.Companion;
        companion.d(TAG, "onPrepared(): duration=" + this$0.durationMs + " ms lastPos=" + this$0.lastPosMs + " wantPlay=" + this$0.wantPlay);
        if (this$0.wantPlay) {
            Surface surface = this$0.surface;
            if (surface != null && surface.isValid()) {
                z10 = true;
            }
            if (z10) {
                companion.d(TAG, "start video on prepared.");
                mediaPlayer.start();
                this$0.notifyPlay();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-11, reason: not valid java name */
    public static final void m303ensurePlayer$lambda14$lambda11(AdVideoView this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        t.f(this$0, "this$0");
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this$0.videoW = i10;
        this$0.videoH = i11;
        SurfaceTexture surfaceTexture = this$0.texture.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
        this$0.applyTransform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-12, reason: not valid java name */
    public static final void m304ensurePlayer$lambda14$lambda12(AdVideoView this$0, MediaPlayer mediaPlayer) {
        t.f(this$0, "this$0");
        Logger.Companion.d(TAG, "onCompletion()");
        this$0.lastPosMs = this$0.durationMs;
        this$0.videoCompleted = true;
        this$0.endProgressUpdates();
        this$0.lastProgressSent = 100;
        this$0.notifyProgress(100);
        this$0.notifyCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensurePlayer$lambda-14$lambda-13, reason: not valid java name */
    public static final boolean m305ensurePlayer$lambda14$lambda13(AdVideoView this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        t.f(this$0, "this$0");
        Logger.Companion.w(TAG, "onError(): what=" + i10 + ", extra=" + i11);
        this$0.preparing.set(false);
        this$0.prepared.set(false);
        this$0.notifyError(i10, String.valueOf(i11));
        return true;
    }

    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }

    private final boolean isVisibleEnough() {
        if (!isShown()) {
            return false;
        }
        Rect rect = new Rect();
        if (!getGlobalVisibleRect(rect)) {
            return false;
        }
        long jHeight = ((long) rect.height()) * ((long) rect.width());
        long height = ((long) getHeight()) * ((long) getWidth());
        return height > 0 && ((float) jHeight) / ((float) height) >= this.visibilityThreshold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: layoutListener$lambda-1, reason: not valid java name */
    public static final void m306layoutListener$lambda1(AdVideoView this$0) {
        t.f(this$0, "this$0");
        this$0.checkVisibility();
    }

    private final void notifyCompleted() {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoCompleted();
        }
    }

    private final void notifyError(int i10, String str) {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoError(i10, str);
        }
    }

    private final void notifyMuted(boolean z10) {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoMuted(z10);
        }
    }

    private final void notifyPause() {
        endProgressUpdates();
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPause();
        }
    }

    private final void notifyPlay() {
        beginProgressUpdates();
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPlay();
        }
    }

    private final void notifyProgress(int i10) {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoProgress(i10);
        }
    }

    private final void pauseInternal() {
        Object objC;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null && this.prepared.get() && mediaPlayer.isPlaying()) {
            Logger.Companion.d(TAG, "pauseInternal(): pos=" + mediaPlayer.getCurrentPosition() + " ms");
            mediaPlayer.pause();
            notifyPause();
        } else {
            Logger.Companion.d(TAG, "pauseInternal(): no-op (not playing or no player)");
        }
        try {
            r.a aVar = r.f27774b;
            objC = r.c(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Integer numValueOf = Integer.valueOf(this.lastPosMs);
        if (r.k(objC)) {
            objC = numValueOf;
        }
        this.lastPosMs = ((Number) objC).intValue();
    }

    private final void prepareIfNeeded() {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            Uri uri = this.sourceUri;
            if (uri != null && !this.prepared.get() && !this.preparing.get()) {
                ensurePlayer();
                this.preparing.set(true);
                this.prepared.set(false);
                MediaPlayer mediaPlayer = this.mp;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                }
                MediaPlayer mediaPlayer2 = this.mp;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setLooping(this.looping);
                }
                MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.setSurface(this.surface);
                }
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setDataSource(getContext(), uri);
                }
                Logger.Companion companion = Logger.Companion;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("prepareAsync(): uri=");
                sb2.append(uri);
                sb2.append(", surfaceValid=");
                Surface surface = this.surface;
                g0 g0Var = null;
                sb2.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
                companion.d(TAG, sb2.toString());
                MediaPlayer mediaPlayer5 = this.mp;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.prepareAsync();
                    g0Var = g0.f27756a;
                }
                objC = r.c(g0Var);
                Throwable thG = r.g(objC);
                if (thG != null) {
                    notifyError(-1, String.valueOf(thG.getLocalizedMessage()));
                }
            }
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scrollListener$lambda-0, reason: not valid java name */
    public static final void m307scrollListener$lambda0(AdVideoView this$0) {
        t.f(this$0, "this$0");
        this$0.checkVisibility();
    }

    public static /* synthetic */ void setAutoVisibility$default(AdVideoView adVideoView, boolean z10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.8f;
        }
        adVideoView.setAutoVisibility(z10, f10);
    }

    public final int getCurrentPositionMs() {
        Object objC;
        if (!this.prepared.get()) {
            return od.k.d(this.lastPosMs, 0);
        }
        try {
            r.a aVar = r.f27774b;
            MediaPlayer mediaPlayer = this.mp;
            objC = r.c(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Integer numValueOf = Integer.valueOf(this.lastPosMs);
        if (r.k(objC)) {
            objC = numValueOf;
        }
        return od.k.d(((Number) objC).intValue(), 0);
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final id.a<MediaPlayer> getMediaPlayerFactory$vungle_ads_release() {
        return this.mediaPlayerFactory;
    }

    public final Surface getSurface$vungle_ads_release() {
        return this.surface;
    }

    public final TextureView getTexture$vungle_ads_release() {
        return this.texture;
    }

    public final boolean isMuted() {
        return this.muted;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Logger.Companion.d(TAG, "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        Logger.Companion.d(TAG, "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
        pauseInternal();
        detachSurface();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
        Object objC;
        t.f(st, "st");
        Logger.Companion.d(TAG, "onSurfaceTextureDestroyed()");
        pauseInternal();
        try {
            r.a aVar = r.f27774b;
            MediaPlayer mediaPlayer = this.mp;
            g0 g0Var = null;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                g0Var = g0.f27756a;
            }
            objC = r.c(g0Var);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "Failed to clear surface", thG);
        }
        detachSurface();
        endProgressUpdates();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture st, int i10, int i11) {
        t.f(st, "st");
        Logger.Companion.d(TAG, "onSurfaceTextureSizeChanged() width=" + i10 + " height=" + i11);
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture st) {
        t.f(st, "st");
    }

    public final void pause() {
        Logger.Companion companion = Logger.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("pause() at pos=");
        MediaPlayer mediaPlayer = this.mp;
        sb2.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null);
        sb2.append(" ms");
        companion.d(TAG, sb2.toString());
        this.videoPaused = true;
        this.wantPlay = false;
        pauseInternal();
    }

    public final void pauseOnActivityPaused$vungle_ads_release() {
        this.videoPaused = true;
        pauseInternal();
    }

    public final void play() {
        this.wantPlay = true;
        this.videoPaused = false;
        this.videoCompleted = false;
        Logger.Companion companion = Logger.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("play(): prepared=");
        sb2.append(this.prepared);
        sb2.append(", surfaceValid=");
        Surface surface = this.surface;
        sb2.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        sb2.append(", visible=");
        sb2.append(isVisibleEnough());
        companion.d(TAG, sb2.toString());
        if (this.prepared.get()) {
            Surface surface2 = this.surface;
            if ((surface2 != null && surface2.isValid()) && isVisibleEnough()) {
                MediaPlayer mediaPlayer = this.mp;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("play(): pos=");
                MediaPlayer mediaPlayer2 = this.mp;
                sb3.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null);
                sb3.append(" ms");
                companion.d(TAG, sb3.toString());
                MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.start();
                }
                notifyPlay();
                return;
            }
        }
        prepareIfNeeded();
    }

    public final void playOnActivityResumed$vungle_ads_release() {
        if (this.wantPlay && this.videoPaused && !this.videoCompleted) {
            play();
        }
    }

    public final void release() {
        Object objC;
        Object objC2;
        Object objC3;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        Logger.Companion.d(TAG, "release()");
        pause();
        this.handler.removeCallbacks(this.progressUpdater);
        try {
            r.a aVar = r.f27774b;
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(null);
                g0Var3 = g0.f27756a;
            } else {
                g0Var3 = null;
            }
            objC = r.c(g0Var3);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "Failed to clear Surface", thG);
        }
        try {
            MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
                g0Var2 = g0.f27756a;
            } else {
                g0Var2 = null;
            }
            objC2 = r.c(g0Var2);
        } catch (Throwable th2) {
            r.a aVar3 = r.f27774b;
            objC2 = r.c(s.a(th2));
        }
        Throwable thG2 = r.g(objC2);
        if (thG2 != null) {
            Logger.Companion.e(TAG, "Failed to stop MediaPlayer", thG2);
        }
        try {
            MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            objC3 = r.c(g0Var);
        } catch (Throwable th3) {
            r.a aVar4 = r.f27774b;
            objC3 = r.c(s.a(th3));
        }
        Throwable thG3 = r.g(objC3);
        if (thG3 != null) {
            Logger.Companion.e(TAG, "Failed to release MediaPlayer", thG3);
        }
        this.mp = null;
        detachSurface();
        this.prepared.set(false);
        this.preparing.set(false);
    }

    public final void seekTo(int i10) {
        this.lastPosMs = od.k.d(i10, 0);
        Logger.Companion.d(TAG, "seekTo " + this.lastPosMs);
        if (this.prepared.get()) {
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(this.lastPosMs);
            }
            calculateAndNotifyProgress();
        }
    }

    public final void setAutoVisibility(boolean z10, float f10) {
        Logger.Companion.d(TAG, "setAutoVisibility enabled=" + z10 + " threshold=" + f10);
        this.autoVisibility = z10;
        this.visibilityThreshold = od.k.i(f10, 0.0f, 1.0f);
        if (z10) {
            checkVisibility();
        }
    }

    public final void setLooping(boolean z10) {
        Logger.Companion.d(TAG, "setLooping to " + this.looping);
        this.looping = z10;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(z10);
    }

    public final void setMediaPlayerFactory$vungle_ads_release(id.a<? extends MediaPlayer> aVar) {
        t.f(aVar, "<set-?>");
        this.mediaPlayerFactory = aVar;
    }

    public final void setMuted(boolean z10) {
        Logger.Companion.d(TAG, "setMuted to " + z10);
        this.muted = z10;
        applyMute();
        notifyMuted(z10);
    }

    public final void setSource(Uri uri) {
        t.f(uri, "uri");
        this.sourceUri = uri;
        this.prepared.set(false);
        this.preparing.set(false);
        this.videoW = 0;
        this.videoH = 0;
        prepareIfNeeded();
    }

    public final void setSurface$vungle_ads_release(Surface surface) {
        this.surface = surface;
    }

    public final void setTexture$vungle_ads_release(TextureView textureView) {
        t.f(textureView, "<set-?>");
        this.texture = textureView;
    }

    public final void setVideoLifecycleCallback(NativeVideoContract.VideoLifecycleCallback lifecycleCallback) {
        t.f(lifecycleCallback, "lifecycleCallback");
        this.callback = lifecycleCallback;
    }

    public final void setVideoTransformCallback$vungle_ads_release(VideoTransformCallback videoTransformCallback) {
        this.videoTransformCallback = videoTransformCallback;
    }

    public final void stop() {
        boolean z10 = false;
        this.wantPlay = false;
        this.lastPosMs = 0;
        this.videoCompleted = false;
        MediaPlayer mediaPlayer = this.mp;
        Logger.Companion companion = Logger.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("stop(): prepared=");
        sb2.append(this.prepared);
        sb2.append(", surface=");
        Surface surface = this.surface;
        sb2.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        companion.d(TAG, sb2.toString());
        if (mediaPlayer != null && this.prepared.get()) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                notifyPause();
            }
            mediaPlayer.seekTo(0);
            Surface surface2 = this.surface;
            if (surface2 != null && surface2.isValid()) {
                z10 = true;
            }
            if (z10 && !mediaPlayer.isPlaying()) {
                mediaPlayer.start();
                mediaPlayer.pause();
            }
        }
        endProgressUpdates();
        this.lastProgressSent = -1;
    }

    public /* synthetic */ AdVideoView(Context context, AttributeSet attributeSet, int i10, k kVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture st, int i10, int i11) {
        Object objC;
        g0 g0Var;
        t.f(st, "st");
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(st);
        this.surface = surface2;
        try {
            r.a aVar = r.f27774b;
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface2);
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            objC = r.c(g0Var);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "Failed to set surface", thG);
        }
        boolean zN = r.n(objC);
        Logger.Companion companion = Logger.Companion;
        companion.d(TAG, "onSurfaceTextureAvailable(): " + i10 + " x " + i11 + ", prepared=" + this.prepared + ", wantPlay=" + this.wantPlay + ", surfaceRet=" + zN);
        if (zN && this.prepared.get() && this.wantPlay) {
            companion.d(TAG, EFLCCdIRcb.hfXKTIinD + this.videoCompleted);
            if (this.videoCompleted) {
                seekTo(this.durationMs);
                MediaPlayer mediaPlayer2 = this.mp;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.start();
                }
                MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.pause();
                }
            } else {
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
                notifyPlay();
            }
        } else {
            prepareIfNeeded();
        }
        applyTransform();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t.f(context, "context");
        this.scrollListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.vungle.ads.internal.ui.view.e
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AdVideoView.m307scrollListener$lambda0(this.f13115a);
            }
        };
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.vungle.ads.internal.ui.view.f
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AdVideoView.m306layoutListener$lambda1(this.f13116a);
            }
        };
        this.visibilityThreshold = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.texture = textureView;
        this.prepared = new AtomicBoolean(false);
        this.preparing = new AtomicBoolean(false);
        this.lastProgressSent = -1;
        this.handler = new Handler(Looper.getMainLooper());
        this.progressUpdater = new ProgressUpdateRunnable(this);
        this.mediaPlayerFactory = AdVideoView$mediaPlayerFactory$1.INSTANCE;
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.texture, new FrameLayout.LayoutParams(-1, -1));
    }
}
