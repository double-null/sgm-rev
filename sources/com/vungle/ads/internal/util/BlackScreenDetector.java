package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import id.l;
import id.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;
import wc.m;
import wc.o;
import wc.q;

/* JADX INFO: compiled from: BlackScreenDetector.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BlackScreenDetector {
    private static final int BLACK_PIXEL_THRESHOLD = 10;
    private static final double BLACK_SCREEN_MARGIN_PERCENTAGE = 0.1d;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BlackScreenDetector";
    private volatile p<? super Integer, ? super String, g0> callback;

    /* JADX INFO: compiled from: BlackScreenDetector.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithCanvas$1, reason: invalid class name */
    /* JADX INFO: compiled from: BlackScreenDetector.kt */
    static final class AnonymousClass1 extends u implements id.a<g0> {
        final /* synthetic */ l<Bitmap, g0> $onComplete;
        final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(View view, l<? super Bitmap, g0> lVar) {
            super(0);
            this.$view = view;
            this.$onComplete = lVar;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.$view.getWidth(), this.$view.getHeight(), Bitmap.Config.ARGB_8888);
                this.$view.draw(new Canvas(bitmapCreateBitmap));
                this.$onComplete.invoke(bitmapCreateBitmap);
            } catch (Throwable th) {
                Logger.Companion.e(BlackScreenDetector.TAG, "Bitmap capture failed", th);
                this.$onComplete.invoke(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BlackScreenDetector.kt */
    static final class C24331 extends u implements id.a<g0> {
        final /* synthetic */ wc.k<Executors> $executors$delegate;
        final /* synthetic */ l<Bitmap, g0> $onComplete;
        final /* synthetic */ View $view;
        final /* synthetic */ Window $window;
        final /* synthetic */ BlackScreenDetector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C24331(View view, wc.k<? extends Executors> kVar, BlackScreenDetector blackScreenDetector, Window window, l<? super Bitmap, g0> lVar) {
            super(0);
            this.$view = view;
            this.$executors$delegate = kVar;
            this.this$0 = blackScreenDetector;
            this.$window = window;
            this.$onComplete = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m315invoke$lambda0(int i10, int i11, BlackScreenDetector this$0, Window window, Rect rect, l onComplete) {
            Bitmap bitmapCreateBitmap;
            t.f(this$0, "this$0");
            t.f(rect, "$rect");
            t.f(onComplete, "$onComplete");
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                try {
                    this$0.executePixelCopyRequest(window, rect, bitmapCreateBitmap, onComplete);
                } catch (Throwable th) {
                    th = th;
                    Logger.Companion.e(BlackScreenDetector.TAG, "Bitmap creation failed", th);
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    onComplete.invoke(null);
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap = null;
            }
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            final int width = this.$view.getWidth();
            final int height = this.$view.getHeight();
            int[] iArr = new int[2];
            this.$view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            final Rect rect = new Rect(i10, i11, i10 + width, i11 + height);
            VungleThreadPoolExecutor jobExecutor = BlackScreenDetector.m313captureViewWithPixelCopy$lambda0(this.$executors$delegate).getJobExecutor();
            final BlackScreenDetector blackScreenDetector = this.this$0;
            final Window window = this.$window;
            final l<Bitmap, g0> lVar = this.$onComplete;
            jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.b
                @Override // java.lang.Runnable
                public final void run() {
                    BlackScreenDetector.C24331.m315invoke$lambda0(width, height, blackScreenDetector, window, rect, lVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.BlackScreenDetector$start$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BlackScreenDetector.kt */
    static final class C24341 extends u implements l<Bitmap, g0> {
        final /* synthetic */ int $samplingFactor;
        final /* synthetic */ View $view;
        final /* synthetic */ BlackScreenDetector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24341(View view, BlackScreenDetector blackScreenDetector, int i10) {
            super(1);
            this.$view = view;
            this.this$0 = blackScreenDetector;
            this.$samplingFactor = i10;
        }

        /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
        private static final Executors m316invoke$lambda0(wc.k<? extends Executors> kVar) {
            return kVar.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:13:0x0059 A[DONT_GENERATE] */
        /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
        public static final void m317invoke$lambda1(BlackScreenDetector this$0, Bitmap bitmap, int i10) {
            t.f(this$0, "this$0");
            try {
                q<Integer, String> qVarProcessBitmapForBlackScreen$vungle_ads_release = this$0.processBitmapForBlackScreen$vungle_ads_release(bitmap, i10);
                int iIntValue = qVarProcessBitmapForBlackScreen$vungle_ads_release.b().intValue();
                String strC = qVarProcessBitmapForBlackScreen$vungle_ads_release.c();
                p pVar = this$0.callback;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(iIntValue), strC);
                }
                if (bitmap != null) {
                }
            } catch (Throwable th) {
                try {
                    Logger.Companion.e(BlackScreenDetector.TAG, "Black screen detection failed", th);
                    p pVar2 = this$0.callback;
                    if (pVar2 != null) {
                        pVar2.invoke(-1, "Internal calculation error: " + th.getMessage());
                    }
                } finally {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this$0.callback = null;
                }
            }
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final Bitmap bitmap) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            Context context = this.$view.getContext();
            t.e(context, "view.context");
            VungleThreadPoolExecutor jobExecutor = m316invoke$lambda0(m.b(o.SYNCHRONIZED, new BlackScreenDetector$start$1$invoke$$inlined$inject$1(context))).getJobExecutor();
            final BlackScreenDetector blackScreenDetector = this.this$0;
            final int i10 = this.$samplingFactor;
            jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.c
                @Override // java.lang.Runnable
                public final void run() {
                    BlackScreenDetector.C24341.m317invoke$lambda1(blackScreenDetector, bitmap, i10);
                }
            });
        }
    }

    private final int calculateBlackScreenPercentageWithMargin(Bitmap bitmap, double d10, int i10, double d11) {
        int i11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = (int) (((double) width) * d10);
        int i13 = (int) (((double) height) * d10);
        int i14 = width - (i12 * 2);
        int i15 = height - (i13 * 2);
        if (i14 <= 0 || i15 <= 0) {
            return -1;
        }
        long j10 = ((long) i14) * ((long) i15);
        if (j10 > 2147483647L) {
            if (d10 >= d11) {
                return -1;
            }
            return calculateBlackScreenPercentageWithMargin(bitmap, d10 * ((double) 2), i10, d11);
        }
        int i16 = (int) j10;
        int[] iArr = new int[i16];
        bitmap.getPixels(iArr, 0, i14, i12, i13, i14, i15);
        int i17 = i16 - 1;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i10 + '.');
        }
        int iB = cd.c.b(0, i17, i10);
        int i18 = 0;
        if (iB >= 0) {
            int i19 = 0;
            i11 = 0;
            while (true) {
                i18++;
                int i20 = iArr[i19];
                int i21 = (i20 >> 24) & 255;
                int i22 = (i20 >> 16) & 255;
                int i23 = (i20 >> 8) & 255;
                int i24 = i20 & 255;
                if (i21 > 0 && i22 < 10 && i23 < 10 && i24 < 10) {
                    i11++;
                }
                if (i19 == iB) {
                    break;
                }
                i19 += i10;
            }
        } else {
            i11 = 0;
        }
        if (i18 > 0) {
            return (int) ((((long) i11) * ((long) 100)) / ((long) i18));
        }
        return 0;
    }

    static /* synthetic */ int calculateBlackScreenPercentageWithMargin$default(BlackScreenDetector blackScreenDetector, Bitmap bitmap, double d10, int i10, double d11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 100;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            d11 = 0.5d;
        }
        return blackScreenDetector.calculateBlackScreenPercentageWithMargin(bitmap, d10, i12, d11);
    }

    private final void captureViewWithCanvas(View view, l<? super Bitmap, g0> lVar) {
        ThreadUtil.INSTANCE.runOnUiThread(new AnonymousClass1(view, lVar));
    }

    private final void captureViewWithPixelCopy(View view, l<? super Bitmap, g0> lVar) {
        Activity activity = getActivity(view.getContext());
        Window window = activity != null ? activity.getWindow() : null;
        if (window == null) {
            Logger.Companion.w(TAG, "Activity/Window not found for PixelCopy");
            lVar.invoke(null);
        } else {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            Context context = view.getContext();
            t.e(context, "view.context");
            ThreadUtil.INSTANCE.runOnUiThread(new C24331(view, m.b(o.SYNCHRONIZED, new BlackScreenDetector$captureViewWithPixelCopy$$inlined$inject$1(context)), this, window, lVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: captureViewWithPixelCopy$lambda-0, reason: not valid java name */
    public static final Executors m313captureViewWithPixelCopy$lambda0(wc.k<? extends Executors> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executePixelCopyRequest(Window window, Rect rect, final Bitmap bitmap, final l<? super Bitmap, g0> lVar) {
        try {
            PixelCopy.request(window, rect, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.vungle.ads.internal.util.a
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    BlackScreenDetector.m314executePixelCopyRequest$lambda1(lVar, bitmap, i10);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            Logger.Companion.e(TAG, "PixelCopy request failed", th);
            bitmap.recycle();
            lVar.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executePixelCopyRequest$lambda-1, reason: not valid java name */
    public static final void m314executePixelCopyRequest$lambda1(l onComplete, Bitmap bitmap, int i10) {
        t.f(onComplete, "$onComplete");
        t.f(bitmap, "$bitmap");
        if (i10 == 0) {
            onComplete.invoke(bitmap);
            return;
        }
        Logger.Companion.w(TAG, "PixelCopy failed: " + i10);
        bitmap.recycle();
        onComplete.invoke(null);
    }

    private final Activity getActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final void captureViewBitmapAsync$vungle_ads_release(View view, l<? super Bitmap, g0> onComplete) {
        t.f(view, "view");
        t.f(onComplete, "onComplete");
        if (this.callback == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            captureViewWithPixelCopy(view, onComplete);
        } else {
            captureViewWithCanvas(view, onComplete);
        }
    }

    public final q<Integer, String> processBitmapForBlackScreen$vungle_ads_release(Bitmap bitmap, int i10) {
        if (bitmap != null) {
            int iCalculateBlackScreenPercentageWithMargin$default = calculateBlackScreenPercentageWithMargin$default(this, bitmap, 0.1d, i10, 0.0d, 8, null);
            return new q<>(Integer.valueOf(iCalculateBlackScreenPercentageWithMargin$default), iCalculateBlackScreenPercentageWithMargin$default == -1 ? "Internal calculation error" : "");
        }
        Logger.Companion.w(TAG, "Black screen detection failed: Snapshot capture failure");
        return new q<>(-1, "Snapshot capture failure");
    }

    public final void start(View view, int i10, p<? super Integer, ? super String, g0> callback) {
        t.f(callback, "callback");
        this.callback = callback;
        if (view != null) {
            captureViewBitmapAsync$vungle_ads_release(view, new C24341(view, this, i10));
            return;
        }
        Logger.Companion.w(TAG, "Black screen detection failed: View not available");
        p<? super Integer, ? super String, g0> pVar = this.callback;
        if (pVar != null) {
            pVar.invoke(-1, "View not available");
        }
        this.callback = null;
    }

    public final void stop() {
        this.callback = null;
    }
}
