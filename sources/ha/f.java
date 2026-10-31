package ha;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import io.bidmachine.AdObjectImpl;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ContextProvider;
import io.bidmachine.Executable;
import io.bidmachine.ImageData;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.LabelData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.RendererConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import ka.o;
import oc.r;
import wb.g0;
import wb.u;
import wb.y;

/* JADX INFO: compiled from: NativeAdObject.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends AdObjectImpl<n, ga.b, vb.l, vb.m, vb.n> implements h, j, i, View.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final WeakHashMap<ViewGroup, WeakHashMap<View, View.OnClickListener>> f15775q = new WeakHashMap<>(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f15776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f15777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.bidmachine.nativead.view.a f15778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f15779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressDialog f15780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f15781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f15782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f15783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f15784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f15785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageDataImpl f15786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageDataImpl f15787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Uri f15788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h7.g f15789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f15790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final qc.a<la.g> f15791p;

    /* JADX INFO: compiled from: NativeAdObject.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.I();
        }
    }

    /* JADX INFO: compiled from: NativeAdObject.java */
    private static class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f15794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f15796c;

        public c(View view) {
            this.f15794a = new WeakReference<>(view);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            View view2;
            if (view == null) {
                return;
            }
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if ((i18 == this.f15795b && i19 == this.f15796c) || (view2 = this.f15794a.get()) == null) {
                return;
            }
            this.f15795b = i18;
            this.f15796c = i19;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                view2.setLayoutParams(new ViewGroup.LayoutParams(i18, i19));
                return;
            }
            layoutParams.width = i18;
            layoutParams.height = i19;
            view2.requestLayout();
        }
    }

    /* JADX INFO: compiled from: NativeAdObject.java */
    private class d implements u<Boolean> {
        private d() {
        }

        @Override // wb.u
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) throws Throwable {
            if (bool.booleanValue()) {
                f.this.getAdProcessCallback().processClickVerified();
            }
            f.this.I();
        }

        /* synthetic */ d(f fVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: NativeAdObject.java */
    private final class e extends o7.b implements vb.m {
        e(AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
        }

        @Override // vb.m
        public void e(l lVar) {
            try {
                f.this.Q(lVar);
                if (f.this.getAdRequest().getAdRequestParameters().c() && !lVar.l()) {
                    g().processLoadFail(oc.a.h("Native ad does not contain all required assets"));
                } else if (lVar.j()) {
                    g().processLoadSuccess();
                } else {
                    f fVar = f.this;
                    fVar.L(fVar.getApplicationContext(), lVar);
                }
            } catch (Exception e10) {
                io.bidmachine.core.a.l(f.this.f15776a, e10);
                g().processLoadFail(oc.a.l("Exception loading native ad assets", e10));
            }
        }
    }

    f(final ContextProvider contextProvider, AdProcessCallback adProcessCallback, n nVar, ga.b bVar, vb.l lVar) {
        super(contextProvider, adProcessCallback, nVar, bVar, lVar);
        this.f15776a = new y("NativeAdObject");
        this.f15791p = new qc.a<>(new qc.b() { // from class: ha.c
            @Override // qc.b
            public final Object get() {
                return f.K(contextProvider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        Handler handler;
        ProgressDialog progressDialog = this.f15780e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f15780e.dismiss();
            this.f15780e = null;
        }
        Runnable runnable = this.f15784i;
        if (runnable == null || (handler = this.f15783h) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f15783h = null;
        this.f15784i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ la.g K(ContextProvider contextProvider) {
        return la.f.f21923a.a(o7.d.b(contextProvider.getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(Context context, h hVar) {
        new ha.a(context, this.f15776a, getAdRequest().getAdRequestParameters(), getAdProcessCallback(), hVar, this).j(context);
    }

    private boolean M() {
        ProgressDialog progressDialog = this.f15780e;
        return progressDialog == null || !progressDialog.isShowing();
    }

    private void O() {
        View view = this.f15781f;
        if (view != null) {
            g0.h(view);
            this.f15781f = null;
        }
    }

    private void P(ViewGroup viewGroup) {
        c cVar = this.f15782g;
        if (cVar != null) {
            viewGroup.removeOnLayoutChangeListener(cVar);
            this.f15782g = null;
        }
    }

    private void R(Activity activity) {
        if (this.f15777b != null && M() && io.bidmachine.core.h.d(activity)) {
            this.f15777b.addOnAttachStateChangeListener(new a());
            ProgressDialog progressDialogShow = ProgressDialog.show(activity, "", "Loading...");
            this.f15780e = progressDialogShow;
            progressDialogShow.setProgressStyle(0);
            this.f15780e.setCancelable(false);
            this.f15784i = new b();
            Handler handler = new Handler(Looper.getMainLooper());
            this.f15783h = handler;
            handler.postDelayed(this.f15784i, 5000L);
        }
    }

    private void t(ViewGroup viewGroup, Set<View> set) {
        z(viewGroup);
        if (set == null || set.isEmpty()) {
            return;
        }
        WeakHashMap<View, View.OnClickListener> weakHashMap = new WeakHashMap<>();
        f15775q.put(viewGroup, weakHashMap);
        for (View view : set) {
            if (view != null) {
                view.setOnClickListener(this);
                weakHashMap.put(view, this);
            }
        }
    }

    private ImageView u(View view) {
        ImageView imageView;
        if (view instanceof ImageView) {
            imageView = (ImageView) view;
        } else if (view instanceof ViewGroup) {
            ImageView imageView2 = new ImageView(view.getContext());
            imageView2.setId(100);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            viewGroup.addView(imageView2, new ViewGroup.LayoutParams(-1, -1));
            imageView = imageView2;
        } else {
            imageView = null;
        }
        if (imageView != null && this.f15786k != null) {
            ja.a.d(imageView.getContext(), imageView, this.f15786k.getLocalUri(), this.f15786k.getImage());
        }
        return imageView;
    }

    private void v(o oVar) {
        if (oVar == null) {
            return;
        }
        View viewX = x(oVar.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        g0.b(oVar, viewX, layoutParams);
    }

    private void w(ViewGroup viewGroup, RendererConfiguration rendererConfiguration) {
        Drawable watermarkDrawable;
        P(viewGroup);
        O();
        if (rendererConfiguration == null || (watermarkDrawable = rendererConfiguration.getWatermarkDrawable(getApplicationContext())) == null) {
            return;
        }
        sb.d dVar = new sb.d(viewGroup.getContext().getApplicationContext());
        dVar.setLayoutParams(g0.c());
        dVar.setWatermark(watermarkDrawable);
        this.f15781f = dVar;
        c cVar = new c(dVar);
        this.f15782g = cVar;
        viewGroup.addOnLayoutChangeListener(cVar);
        viewGroup.addView(dVar);
    }

    private View x(Context context) {
        View viewA;
        l lVar = this.f15790o;
        if (lVar != null && (viewA = lVar.a(context)) != null) {
            return viewA;
        }
        io.bidmachine.nativead.view.a aVar = new io.bidmachine.nativead.view.a(context);
        aVar.setId(200);
        g adRequestParameters = getAdRequest().getAdRequestParameters();
        if (adRequestParameters.a(MediaAssetType.Image) || adRequestParameters.a(MediaAssetType.Video)) {
            aVar.setNativeAdObject(this);
        }
        this.f15778c = aVar;
        return aVar;
    }

    private void z(ViewGroup viewGroup) {
        WeakHashMap<View, View.OnClickListener> weakHashMap = f15775q.get(viewGroup);
        if (weakHashMap != null) {
            for (Map.Entry<View, View.OnClickListener> entry : weakHashMap.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    entry.getKey().setOnClickListener(null);
                }
            }
            f15775q.remove(viewGroup);
        }
    }

    public void A() {
        getAdProcessCallback().processClicked();
    }

    public void B() {
        getAdProcessCallback().processFillAd();
    }

    public String C() {
        l lVar = this.f15790o;
        String strF = lVar != null ? lVar.f() : null;
        return TextUtils.isEmpty(strF) ? "Install" : strF;
    }

    public String D() {
        l lVar = this.f15790o;
        if (lVar != null) {
            return lVar.g();
        }
        return null;
    }

    public String E() {
        l lVar = this.f15790o;
        if (lVar != null) {
            return lVar.h();
        }
        return null;
    }

    public View F(Context context) {
        l lVar;
        if (this.f15779d == null && (lVar = this.f15790o) != null) {
            this.f15779d = lVar.c(context);
        }
        return this.f15779d;
    }

    public y G() {
        return this.f15776a;
    }

    public String H() {
        l lVar = this.f15790o;
        if (lVar != null) {
            return lVar.i();
        }
        return null;
    }

    boolean J(ViewGroup viewGroup, View view, o oVar) {
        if (viewGroup == null) {
            io.bidmachine.core.a.a(this.f15776a, "NativeAdView cannot be null. NativeAd is NOT registered");
            return false;
        }
        if (view == null && oVar == null) {
            io.bidmachine.core.a.a(this.f15776a, "ImageView or NativeMediaView cannot be null. NativeAd is NOT registered");
            return false;
        }
        if (view != null && !r.a(viewGroup, view)) {
            io.bidmachine.core.a.a(this.f15776a, "ImageView should belong to NativeAdView");
        }
        if (oVar == null || r.a(viewGroup, oVar)) {
            return true;
        }
        io.bidmachine.core.a.a(this.f15776a, "NativeMediaView should belong to NativeAdView");
        return true;
    }

    void N(ViewGroup viewGroup, View view, o oVar, Set<View> set, RendererConfiguration rendererConfiguration) {
        try {
            if (!J(viewGroup, view, oVar)) {
                getAdProcessCallback().processShowFail(oc.a.i("Native ad views are invalid"));
                return;
            }
            t(viewGroup, set);
            ImageView imageViewU = u(view);
            v(oVar);
            this.f15777b = viewGroup;
            startViewabilityTracker(viewGroup);
            B();
            io.bidmachine.nativead.view.a aVar = this.f15778c;
            if (aVar != null) {
                aVar.P();
                this.f15778c.X();
            }
            l lVar = this.f15790o;
            if (lVar != null) {
                lVar.n(viewGroup, imageViewU, oVar, set);
            }
            w(viewGroup, rendererConfiguration);
            View view2 = this.f15781f;
            if (view2 != null) {
                view2.bringToFront();
            }
            this.f15785j = true;
        } catch (Throwable th) {
            io.bidmachine.core.a.l(this.f15776a, th);
            S();
            getAdProcessCallback().processShowFail(oc.a.l("Exception registering view for native ad object", th));
        }
    }

    public void Q(l lVar) {
        this.f15790o = lVar;
        if (lVar != null) {
            this.f15786k = new ImageDataImpl(lVar.getIcon());
            this.f15787l = new ImageDataImpl(lVar.getMainImage());
        }
    }

    public void S() {
        try {
            stopViewabilityTracker();
            ViewGroup viewGroup = this.f15777b;
            if (viewGroup != null) {
                P(viewGroup);
                z(this.f15777b);
                this.f15777b = null;
            }
            io.bidmachine.nativead.view.a aVar = this.f15778c;
            if (aVar != null) {
                aVar.Y();
                this.f15778c.V();
                this.f15778c = null;
            }
            l lVar = this.f15790o;
            if (lVar != null) {
                lVar.A();
            }
            O();
            this.f15785j = false;
        } catch (Throwable th) {
            io.bidmachine.core.a.l(this.f15776a, th);
        }
    }

    @Override // ha.j
    public void a(h7.g gVar) {
        this.f15789n = gVar;
    }

    @Override // ha.h
    public PrivacySheetData b() {
        l lVar = this.f15790o;
        if (lVar != null) {
            return lVar.b();
        }
        return null;
    }

    @Override // ha.k
    public Drawable c() {
        ImageDataImpl imageDataImpl = this.f15786k;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    @Override // ha.h
    public LabelData d() {
        l lVar = this.f15790o;
        if (lVar != null) {
            return lVar.d();
        }
        return null;
    }

    @Override // ha.k
    public Uri e() {
        ImageDataImpl imageDataImpl = this.f15787l;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    @Override // ha.j
    public h7.g f() {
        return this.f15789n;
    }

    @Override // ha.k
    public Drawable g() {
        ImageDataImpl imageDataImpl = this.f15787l;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    @Override // ha.m
    public ImageData getIcon() {
        return this.f15786k;
    }

    @Override // ha.k
    public Uri getIconUri() {
        ImageDataImpl imageDataImpl = this.f15786k;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    @Override // ha.m
    public ImageData getMainImage() {
        return this.f15787l;
    }

    @Override // ha.j
    public void h(Uri uri) {
        ImageDataImpl imageDataImpl = this.f15786k;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    @Override // ha.m
    public boolean hasVideo() {
        l lVar;
        return this.f15788m != null || ((lVar = this.f15790o) != null && lVar.hasVideo());
    }

    @Override // ha.k
    public Uri i() {
        return this.f15788m;
    }

    @Override // ha.j
    public void j(Uri uri) {
        ImageDataImpl imageDataImpl = this.f15787l;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    @Override // ha.h
    public String k() {
        l lVar = this.f15790o;
        if (lVar != null) {
            return lVar.k();
        }
        return null;
    }

    @Override // ha.h
    public String m() {
        l lVar = this.f15790o;
        if (lVar != null) {
            return lVar.m();
        }
        return null;
    }

    @Override // ha.j
    public void n(Uri uri) {
        this.f15788m = uri;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        A();
    }

    @Override // io.bidmachine.AdObjectImpl, ga.a
    public Boolean onClicked() {
        super.onClicked();
        String strD = D();
        if (TextUtils.isEmpty(strD)) {
            return Boolean.FALSE;
        }
        R(getActivity());
        qb.j.c(getApplicationContext(), strD, new d(this, null));
        return Boolean.TRUE;
    }

    @Override // io.bidmachine.AdObjectImpl, ga.a
    public void onDestroy() {
        try {
            super.onDestroy();
            S();
            io.bidmachine.core.h.B(this.f15786k, new Executable() { // from class: ha.d
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((ImageDataImpl) obj).destroy();
                }
            });
            io.bidmachine.core.h.B(this.f15787l, new Executable() { // from class: ha.d
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((ImageDataImpl) obj).destroy();
                }
            });
            io.bidmachine.core.h.B(this.f15790o, new Executable() { // from class: ha.e
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((l) obj).e();
                }
            });
            this.f15786k = null;
            this.f15787l = null;
        } catch (Throwable th) {
            try {
                io.bidmachine.core.a.l(this.f15776a, th);
            } finally {
                this.f15791p.get().e(this.f15776a);
            }
        }
    }

    @Override // io.bidmachine.AdObjectImpl
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public vb.m createUnifiedCallback(AdProcessCallback adProcessCallback) {
        return new e(adProcessCallback);
    }

    @Override // ha.i
    public void l() {
    }

    /* JADX INFO: compiled from: NativeAdObject.java */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            f.this.I();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
