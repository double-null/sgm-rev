package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.z0;
import com.vungle.ads.internal.util.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ImpressionTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImpressionTracker {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, TrackingInfo> trackedViews;
    private final Handler visibilityHandler;
    private final VisibilityRunnable visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = ImpressionTracker.class.getSimpleName();

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    public interface ImpressionListener {
        void onImpression(View view);

        void onViewInvisible(View view);
    }

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    public static final class TrackingInfo {
        private ImpressionListener impressionListener;
        private int minViewablePercent;

        public final ImpressionListener getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(ImpressionListener impressionListener) {
            this.impressionListener = impressionListener;
        }

        public final void setMinViewablePercent(int i10) {
            this.minViewablePercent = i10;
        }
    }

    /* JADX INFO: compiled from: ImpressionTracker.kt */
    public final class VisibilityRunnable implements Runnable {
        private final ArrayList<View> visibleViews = new ArrayList<>();
        private final ArrayList<View> invisibleViews = new ArrayList<>();

        public VisibilityRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImpressionListener impressionListener;
            ImpressionListener impressionListener2;
            ImpressionTracker.this.isVisibilityScheduled = false;
            for (Map.Entry entry : ImpressionTracker.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (ImpressionTracker.this.isVisible(view, ((TrackingInfo) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                } else {
                    this.invisibleViews.add(view);
                }
            }
            for (View view2 : this.visibleViews) {
                TrackingInfo trackingInfo = (TrackingInfo) ImpressionTracker.this.trackedViews.get(view2);
                if (trackingInfo != null && (impressionListener2 = trackingInfo.getImpressionListener()) != null) {
                    impressionListener2.onImpression(view2);
                }
                ImpressionTracker impressionTracker = ImpressionTracker.this;
                t.e(view2, "view");
                impressionTracker.removeView(view2);
            }
            this.visibleViews.clear();
            for (View view3 : this.invisibleViews) {
                TrackingInfo trackingInfo2 = (TrackingInfo) ImpressionTracker.this.trackedViews.get(view3);
                if (trackingInfo2 != null && (impressionListener = trackingInfo2.getImpressionListener()) != null) {
                    impressionListener.onViewInvisible(view3);
                }
            }
            this.invisibleViews.clear();
            if (!(!ImpressionTracker.this.trackedViews.isEmpty()) || ImpressionTracker.this.setViewTreeObserverSucceed) {
                return;
            }
            ImpressionTracker.this.scheduleVisibilityCheck();
        }
    }

    public ImpressionTracker(Context context, Map<View, TrackingInfo> trackedViews, Handler visibilityHandler) {
        t.f(context, "context");
        t.f(trackedViews, "trackedViews");
        t.f(visibilityHandler, "visibilityHandler");
        this.trackedViews = trackedViews;
        this.visibilityHandler = visibilityHandler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new VisibilityRunnable();
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return ImpressionTracker.m240_init_$lambda0(this.f13038a);
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m240_init_$lambda0(ImpressionTracker this$0) {
        t.f(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }

    private final View getTopView(Context context, View view) {
        Window window;
        View decorView;
        View viewFindViewById = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindViewById = decorView.findViewById(R.id.content);
        }
        if (viewFindViewById != null || view == null) {
            return viewFindViewById;
        }
        if (!z0.x(view)) {
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            t.e(TAG2, "TAG");
            companion.w(TAG2, "Trying to call View#rootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView != null) {
            viewFindViewById = rootView.findViewById(R.id.content);
        }
        return viewFindViewById == null ? rootView : viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int i10) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getVisibility() != 0) {
                Logger.Companion.w("ImpressionTracker", "Parent visibility is not visible: " + parent);
                return false;
            }
            parent = viewGroup.getParent();
        }
        if (!view.getGlobalVisibleRect(this.clipRect)) {
            return false;
        }
        long jHeight = ((long) this.clipRect.height()) * ((long) this.clipRect.width());
        long height = ((long) view.getHeight()) * ((long) view.getWidth());
        return height > 0 && ((long) 100) * jHeight >= ((long) i10) * height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final boolean setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View topView = getTopView(context, view);
        if (topView == null) {
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            t.e(TAG2, "TAG");
            companion.d(TAG2, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
            return true;
        }
        Logger.Companion companion2 = Logger.Companion;
        String TAG3 = TAG;
        t.e(TAG3, "TAG");
        companion2.d(TAG3, "The root view tree observer was not alive");
        return false;
    }

    public final void addView(View view, ImpressionListener impressionListener) {
        t.f(view, "view");
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        TrackingInfo trackingInfo = this.trackedViews.get(view);
        if (trackingInfo == null) {
            trackingInfo = new TrackingInfo();
            this.trackedViews.put(view, trackingInfo);
            scheduleVisibilityCheck();
        }
        trackingInfo.setMinViewablePercent(1);
        trackingInfo.setImpressionListener(impressionListener);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    public final void removeView(View view) {
        t.f(view, "view");
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        t.f(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImpressionTracker(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        t.f(context, "context");
    }

    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }
}
