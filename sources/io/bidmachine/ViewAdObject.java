package io.bidmachine;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.bidmachine.AdRequest;
import java.lang.ref.WeakReference;
import oc.r;
import vb.d;
import vb.p;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewAdObject<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdType extends vb.p<vb.f, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends vb.d> extends AdObjectImpl<AdRequestType, ga.b, UnifiedAdType, vb.f, UnifiedAdRequestParamsType> {
    View adView;
    private int height;
    private MeasureMode heightMeasureMode;
    private int width;
    private MeasureMode widthMeasureMode;

    public enum MeasureMode {
        Match,
        Wrap,
        Direct;

        int getSize(Context context, int i10) {
            int i11 = a.f16489a[ordinal()];
            if (i11 != 1) {
                return i11 != 2 ? -1 : -2;
            }
            return Math.round(i10 * io.bidmachine.core.h.x(context));
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16489a;

        static {
            int[] iArr = new int[MeasureMode.values().length];
            f16489a = iArr;
            try {
                iArr[MeasureMode.Direct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16489a[MeasureMode.Wrap.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class b extends o7.b implements vb.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<ViewAdObject<?, ?, ?>> f16490b;

        b(ViewAdObject<?, ?, ?> viewAdObject, AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
            this.f16490b = new WeakReference<>(viewAdObject);
        }

        @Override // vb.f
        public void onAdLoaded(View view) {
            ViewAdObject<?, ?, ?> viewAdObject = this.f16490b.get();
            if (viewAdObject == null) {
                g().processLoadFail(oc.a.i("ViewAdObject is null"));
            } else {
                viewAdObject.setAdView(view);
                g().processLoadSuccess();
            }
        }
    }

    public ViewAdObject(ContextProvider contextProvider, AdProcessCallback adProcessCallback, AdRequestType adrequesttype, ga.b bVar, UnifiedAdType unifiedadtype) {
        super(contextProvider, adProcessCallback, adrequesttype, bVar, unifiedadtype);
        MeasureMode measureMode = MeasureMode.Direct;
        this.widthMeasureMode = measureMode;
        this.heightMeasureMode = measureMode;
    }

    private int getScaledHeight(Context context) {
        return this.heightMeasureMode.getSize(context, getHeight());
    }

    private int getScaledWidth(Context context) {
        return this.widthMeasureMode.getSize(context, getWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdView(View view) {
        hide();
        this.adView = view;
    }

    public int getHeight() {
        return this.height;
    }

    public MeasureMode getHeightMeasureMode() {
        return this.heightMeasureMode;
    }

    public int getWidth() {
        return this.width;
    }

    public MeasureMode getWidthMeasureMode() {
        return this.widthMeasureMode;
    }

    @Override // io.bidmachine.AdObjectImpl, ga.a
    public void hide() {
        super.hide();
        stopViewabilityTracker();
        r.b(this.adView);
    }

    @Override // io.bidmachine.AdObjectImpl, ga.a
    public void onDestroy() {
        hide();
        super.onDestroy();
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setHeightMeasureMode(MeasureMode measureMode) {
        this.heightMeasureMode = measureMode;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public void setWidthMeasureMode(MeasureMode measureMode) {
        this.widthMeasureMode = measureMode;
    }

    void show(ViewGroup viewGroup, RendererConfiguration rendererConfiguration) {
        if (viewGroup == null) {
            getUnifiedAdCallback().b(oc.a.k("Target container"));
            return;
        }
        View view = this.adView;
        if (view == null) {
            getUnifiedAdCallback().b(oc.a.i("Ad view is null"));
            return;
        }
        MeasureMode widthMeasureMode = getWidthMeasureMode();
        MeasureMode measureMode = MeasureMode.Direct;
        if ((widthMeasureMode == measureMode && getWidth() == 0) || (getHeightMeasureMode() == measureMode && getHeight() == 0)) {
            getUnifiedAdCallback().b(oc.a.h("Width or height are not provided"));
            return;
        }
        Context context = viewGroup.getContext();
        ViewGroup.LayoutParams layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(getScaledWidth(context), getScaledHeight(context), 17) : new ViewGroup.LayoutParams(getScaledWidth(context), getScaledHeight(context));
        startViewabilityTracker(view);
        r.c(viewGroup, view, layoutParams);
        getAdProcessCallback().processFillAd();
        try {
            getUnifiedAd().i(rendererConfiguration);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    @Override // io.bidmachine.AdObjectImpl
    public vb.f createUnifiedCallback(AdProcessCallback adProcessCallback) {
        return new b(this, adProcessCallback);
    }
}
