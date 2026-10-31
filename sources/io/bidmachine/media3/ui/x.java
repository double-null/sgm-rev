package io.bidmachine.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.media3.common.PlaybackException;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import x7.l0;

/* JADX INFO: compiled from: PlayerView.java */
/* JADX INFO: loaded from: classes4.dex */
public class x extends FrameLayout {
    private boolean A;
    private CharSequence B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f20292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f20293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f20294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f20295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f20297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImageView f20298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ImageView f20299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SubtitleView f20300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f20301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final TextView f20302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.bidmachine.media3.ui.d f20303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final FrameLayout f20304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f20305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f20306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Class<?> f20307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Method f20308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f20309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private u7.y f20310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f20311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f20312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private io.bidmachine.media3.ui.d.m f20313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f20315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f20316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f20317z;

    /* JADX INFO: compiled from: PlayerView.java */
    private static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    /* JADX INFO: compiled from: PlayerView.java */
    private final class c implements u7.y.d, View.OnClickListener, io.bidmachine.media3.ui.d.m, io.bidmachine.media3.ui.d.InterfaceC0331d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u7.d0.b f20318a = new u7.d0.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f20319b;

        public c() {
        }

        @Override // u7.y.d
        public void G(u7.h0 h0Var) {
            u7.y yVar = (u7.y) x7.a.e(x.this.f20310s);
            u7.d0 d0VarU = yVar.r(17) ? yVar.u() : u7.d0.f26009a;
            if (d0VarU.q()) {
                this.f20319b = null;
            } else if (!yVar.r(30) || yVar.m().b()) {
                Object obj = this.f20319b;
                if (obj != null) {
                    int iB = d0VarU.b(obj);
                    if (iB != -1) {
                        if (yVar.S() == d0VarU.f(iB, this.f20318a).f26020c) {
                            return;
                        }
                    }
                    this.f20319b = null;
                }
            } else {
                this.f20319b = d0VarU.g(yVar.H(), this.f20318a, true).f26019b;
            }
            x.this.d0(false);
        }

        @Override // u7.y.d
        public void I(int i10) {
            x.this.Z();
            x.this.c0();
            x.this.b0();
        }

        @Override // io.bidmachine.media3.ui.d.m
        public void J(int i10) {
            x.this.a0();
            if (x.this.f20312u != null) {
                x.this.f20312u.a(i10);
            }
        }

        @Override // io.bidmachine.media3.ui.d.InterfaceC0331d
        public void K(boolean z10) {
            x.p(x.this);
        }

        @Override // u7.y.d
        public void Q() {
            if (x.this.f20294c != null) {
                x.this.f20294c.setVisibility(4);
                if (x.this.C()) {
                    x.this.H();
                } else {
                    x.this.E();
                }
            }
        }

        @Override // u7.y.d
        public void V(int i10, int i11) {
            if (l0.f28136a == 34 && (x.this.f20295d instanceof SurfaceView) && x.this.G) {
                f fVar = (f) x7.a.e(x.this.f20297f);
                Handler handler = x.this.f20306o;
                SurfaceView surfaceView = (SurfaceView) x.this.f20295d;
                final x xVar = x.this;
                fVar.f(handler, surfaceView, new Runnable() { // from class: fa.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        xVar.invalidate();
                    }
                });
            }
        }

        @Override // u7.y.d
        public void Y(u7.y.e eVar, u7.y.e eVar2, int i10) {
            if (x.this.K() && x.this.E) {
                x.this.G();
            }
        }

        @Override // u7.y.d
        public void c(u7.l0 l0Var) {
            if (l0Var.equals(u7.l0.f26202e) || x.this.f20310s == null || x.this.f20310s.R() == 1) {
                return;
            }
            x.this.Y();
        }

        @Override // u7.y.d
        public void n0(boolean z10, int i10) {
            x.this.Z();
            x.this.b0();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x.this.X();
        }

        @Override // u7.y.d
        public void s(w7.b bVar) {
            if (x.this.f20300i != null) {
                x.this.f20300i.setCues(bVar.f27580a);
            }
        }
    }

    /* JADX INFO: compiled from: PlayerView.java */
    public interface d {
        void a(int i10);
    }

    /* JADX INFO: compiled from: PlayerView.java */
    public interface e {
    }

    public x(Context context) {
        this(context, null);
    }

    private static void A(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(l0.a0(context, resources, fa.p.f14782a));
        imageView.setBackgroundColor(resources.getColor(fa.n.f14777a, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        u7.y yVar = this.f20310s;
        return yVar != null && this.f20309r != null && yVar.r(30) && yVar.m().c(4);
    }

    private boolean D() {
        u7.y yVar = this.f20310s;
        return yVar != null && yVar.r(30) && yVar.m().c(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        H();
        ImageView imageView = this.f20298g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private void F() {
        ImageView imageView = this.f20299h;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f20299h.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        ImageView imageView = this.f20298g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private boolean I(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    private boolean J() {
        Drawable drawable;
        ImageView imageView = this.f20298g;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        u7.y yVar = this.f20310s;
        return yVar != null && yVar.r(16) && this.f20310s.b() && this.f20310s.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object L(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        P((Bitmap) objArr[1]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        if (D()) {
            return;
        }
        W();
        y();
    }

    private void N(boolean z10) {
        if (!(K() && this.E) && g0()) {
            boolean z11 = this.f20303l.c0() && this.f20303l.getShowTimeoutMs() <= 0;
            boolean zT = T();
            if (z10 || z11 || zT) {
                V(zT);
            }
        }
    }

    private void P(final Bitmap bitmap) {
        this.f20306o.post(new Runnable() { // from class: fa.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f14773a.M(bitmap);
            }
        });
    }

    private boolean Q(u7.y yVar) {
        byte[] bArr;
        if (yVar == null || !yVar.r(18) || (bArr = yVar.a0().f26462i) == null) {
            return false;
        }
        return R(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean R(Drawable drawable) {
        if (this.f20299h != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f20314w == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                O(this.f20293b, width);
                this.f20299h.setScaleType(scaleType);
                this.f20299h.setImageDrawable(drawable);
                this.f20299h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void S(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean T() {
        u7.y yVar = this.f20310s;
        if (yVar == null) {
            return true;
        }
        int iR = yVar.R();
        return this.D && !(this.f20310s.r(17) && this.f20310s.u().q()) && (iR == 1 || iR == 4 || !((u7.y) x7.a.e(this.f20310s)).D());
    }

    private void V(boolean z10) {
        if (g0()) {
            this.f20303l.setShowTimeoutMs(z10 ? 0 : this.C);
            this.f20303l.m0();
        }
    }

    private void W() {
        ImageView imageView = this.f20298g;
        if (imageView != null) {
            imageView.setVisibility(0);
            e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        if (!g0() || this.f20310s == null) {
            return;
        }
        if (!this.f20303l.c0()) {
            N(true);
        } else if (this.F) {
            this.f20303l.Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        u7.y yVar = this.f20310s;
        u7.l0 l0VarJ = yVar != null ? yVar.J() : u7.l0.f26202e;
        int i10 = l0VarJ.f26206a;
        int i11 = l0VarJ.f26207b;
        O(this.f20293b, this.f20296e ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * l0VarJ.f26209d) / i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public void Z() {
        boolean z10;
        if (this.f20301j != null) {
            u7.y yVar = this.f20310s;
            if (yVar == null || yVar.R() != 2) {
                z10 = false;
            } else {
                int i10 = this.f20317z;
                z10 = true;
                if (i10 != 2 && (i10 != 1 || !this.f20310s.D())) {
                    z10 = false;
                }
            }
            this.f20301j.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        io.bidmachine.media3.ui.d dVar = this.f20303l;
        if (dVar == null || !this.f20311t) {
            setContentDescription(null);
        } else if (dVar.c0()) {
            setContentDescription(this.F ? getResources().getString(fa.v.f14842e) : null);
        } else {
            setContentDescription(getResources().getString(fa.v.f14849l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        if (K() && this.E) {
            G();
        } else {
            N(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        TextView textView = this.f20302k;
        if (textView != null) {
            CharSequence charSequence = this.B;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f20302k.setVisibility(0);
            } else {
                u7.y yVar = this.f20310s;
                if (yVar != null) {
                    yVar.a();
                }
                this.f20302k.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(boolean z10) {
        u7.y yVar = this.f20310s;
        boolean z11 = (yVar == null || !yVar.r(30) || yVar.m().b()) ? false : true;
        if (!this.A && (!z11 || z10)) {
            F();
            y();
            E();
        }
        if (z11) {
            boolean zD = D();
            boolean zC = C();
            if (!zD && !zC) {
                y();
                E();
            }
            View view = this.f20294c;
            boolean z12 = view != null && view.getVisibility() == 4 && J();
            if (zC && !zD && z12) {
                y();
                W();
            } else if (zD && !zC && z12) {
                E();
            }
            if (((zD || zC || !f0()) ? false : true) && (Q(yVar) || R(this.f20316y))) {
                return;
            }
            F();
        }
    }

    private void e0() {
        Drawable drawable;
        ImageView imageView = this.f20298g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f20315x == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f20298g.getVisibility() == 0) {
            O(this.f20293b, width);
        }
        this.f20298g.setScaleType(scaleType);
    }

    private boolean f0() {
        if (this.f20314w == 0) {
            return false;
        }
        x7.a.i(this.f20299h);
        return true;
    }

    private boolean g0() {
        if (!this.f20311t) {
            return false;
        }
        x7.a.i(this.f20303l);
        return true;
    }

    static /* synthetic */ e p(x xVar) {
        xVar.getClass();
        return null;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f20298g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        e0();
    }

    private void setImageOutput(u7.y yVar) {
        Class<?> cls = this.f20307p;
        if (cls == null || !cls.isAssignableFrom(yVar.getClass())) {
            return;
        }
        try {
            ((Method) x7.a.e(this.f20308q)).invoke(yVar, x7.a.e(this.f20309r));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void x(u7.y yVar) {
        Class<?> cls = this.f20307p;
        if (cls == null || !cls.isAssignableFrom(yVar.getClass())) {
            return;
        }
        try {
            ((Method) x7.a.e(this.f20308q)).invoke(yVar, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void y() {
        View view = this.f20294c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(l0.a0(context, resources, fa.p.f14782a));
        imageView.setBackgroundColor(resources.getColor(fa.n.f14777a));
    }

    public boolean B(KeyEvent keyEvent) {
        return g0() && this.f20303l.U(keyEvent);
    }

    public void G() {
        io.bidmachine.media3.ui.d dVar = this.f20303l;
        if (dVar != null) {
            dVar.Y();
        }
    }

    protected void O(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public void U() {
        V(T());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        f fVar;
        super.dispatchDraw(canvas);
        if (l0.f28136a == 34 && (fVar = this.f20297f) != null && this.G) {
            fVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        u7.y yVar = this.f20310s;
        if (yVar != null && yVar.r(16) && this.f20310s.b()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zI = I(keyEvent.getKeyCode());
        if (zI && g0() && !this.f20303l.c0()) {
            N(true);
            return true;
        }
        if (B(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            N(true);
            return true;
        }
        if (zI && g0()) {
            N(true);
        }
        return false;
    }

    public List<u7.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f20305n;
        if (frameLayout != null) {
            arrayList.add(new u7.a.C0439a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        io.bidmachine.media3.ui.d dVar = this.f20303l;
        if (dVar != null) {
            arrayList.add(new u7.a.C0439a(dVar, 1).a());
        }
        return com.google.common.collect.u.B(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) x7.a.j(this.f20304m, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f20314w;
    }

    public boolean getControllerAutoShow() {
        return this.D;
    }

    public boolean getControllerHideOnTouch() {
        return this.F;
    }

    public int getControllerShowTimeoutMs() {
        return this.C;
    }

    public Drawable getDefaultArtwork() {
        return this.f20316y;
    }

    public int getImageDisplayMode() {
        return this.f20315x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f20305n;
    }

    public u7.y getPlayer() {
        return this.f20310s;
    }

    public int getResizeMode() {
        x7.a.i(this.f20293b);
        return this.f20293b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f20300i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f20314w != 0;
    }

    public boolean getUseController() {
        return this.f20311t;
    }

    public View getVideoSurfaceView() {
        return this.f20295d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!g0() || this.f20310s == null) {
            return false;
        }
        N(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        X();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        x7.a.g(i10 == 0 || this.f20299h != null);
        if (this.f20314w != i10) {
            this.f20314w = i10;
            d0(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        x7.a.i(this.f20293b);
        this.f20293b.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.D = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.E = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        x7.a.i(this.f20303l);
        this.F = z10;
        a0();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(io.bidmachine.media3.ui.d.InterfaceC0331d interfaceC0331d) {
        x7.a.i(this.f20303l);
        this.f20303l.setOnFullScreenModeChangedListener(interfaceC0331d);
    }

    public void setControllerShowTimeoutMs(int i10) {
        x7.a.i(this.f20303l);
        this.C = i10;
        if (this.f20303l.c0()) {
            U();
        }
    }

    public void setControllerVisibilityListener(d dVar) {
        this.f20312u = dVar;
        if (dVar != null) {
            setControllerVisibilityListener((io.bidmachine.media3.ui.d.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        x7.a.g(this.f20302k != null);
        this.B = charSequence;
        c0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f20316y != drawable) {
            this.f20316y = drawable;
            d0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.G = z10;
    }

    public void setErrorMessageProvider(u7.m<? super PlaybackException> mVar) {
        if (mVar != null) {
            c0();
        }
    }

    public void setFullscreenButtonClickListener(e eVar) {
        x7.a.i(this.f20303l);
        this.f20303l.setOnFullScreenModeChangedListener(this.f20292a);
    }

    public void setFullscreenButtonState(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.s0(z10);
    }

    public void setImageDisplayMode(int i10) {
        x7.a.g(this.f20298g != null);
        if (this.f20315x != i10) {
            this.f20315x = i10;
            e0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            d0(false);
        }
    }

    public void setPlayer(u7.y yVar) {
        x7.a.g(Looper.myLooper() == Looper.getMainLooper());
        x7.a.a(yVar == null || yVar.v() == Looper.getMainLooper());
        u7.y yVar2 = this.f20310s;
        if (yVar2 == yVar) {
            return;
        }
        if (yVar2 != null) {
            yVar2.A(this.f20292a);
            if (yVar2.r(27)) {
                View view = this.f20295d;
                if (view instanceof TextureView) {
                    yVar2.I((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    yVar2.U((SurfaceView) view);
                }
            }
            x(yVar2);
        }
        SubtitleView subtitleView = this.f20300i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f20310s = yVar;
        if (g0()) {
            this.f20303l.setPlayer(yVar);
        }
        Z();
        c0();
        d0(true);
        if (yVar == null) {
            G();
            return;
        }
        if (yVar.r(27)) {
            View view2 = this.f20295d;
            if (view2 instanceof TextureView) {
                yVar.z((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                yVar.h((SurfaceView) view2);
            }
            if (!yVar.r(30) || yVar.m().d(2)) {
                Y();
            }
        }
        if (this.f20300i != null && yVar.r(28)) {
            this.f20300i.setCues(yVar.p().f27580a);
        }
        yVar.i(this.f20292a);
        setImageOutput(yVar);
        N(false);
    }

    public void setRepeatToggleModes(int i10) {
        x7.a.i(this.f20303l);
        this.f20303l.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        x7.a.i(this.f20293b);
        this.f20293b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f20317z != i10) {
            this.f20317z = i10;
            Z();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        x7.a.i(this.f20303l);
        this.f20303l.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f20294c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        x7.a.g((z10 && this.f20303l == null) ? false : true);
        setClickable(z10 || hasOnClickListeners());
        if (this.f20311t == z10) {
            return;
        }
        this.f20311t = z10;
        if (g0()) {
            this.f20303l.setPlayer(this.f20310s);
        } else {
            io.bidmachine.media3.ui.d dVar = this.f20303l;
            if (dVar != null) {
                dVar.Y();
                this.f20303l.setPlayer(null);
            }
        }
        a0();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f20295d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z12;
        boolean z13;
        int i19;
        boolean z14;
        boolean z15;
        a aVar;
        boolean z16;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i20;
        super(context, attributeSet, i10);
        c cVar = new c();
        this.f20292a = cVar;
        this.f20306o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f20293b = null;
            this.f20294c = null;
            this.f20295d = null;
            this.f20296e = false;
            this.f20297f = null;
            this.f20298g = null;
            this.f20299h = null;
            this.f20300i = null;
            this.f20301j = null;
            this.f20302k = null;
            this.f20303l = null;
            this.f20304m = null;
            this.f20305n = null;
            this.f20307p = null;
            this.f20308q = null;
            this.f20309r = null;
            ImageView imageView = new ImageView(context);
            if (l0.f28136a >= 23) {
                A(context, getResources(), imageView);
            } else {
                z(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i21 = fa.t.f14832c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, fa.x.f14868b0, i10, 0);
            try {
                int i22 = fa.x.f14892n0;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i22);
                int color = typedArrayObtainStyledAttributes.getColor(i22, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(fa.x.f14884j0, i21);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(fa.x.f14896p0, true);
                int i23 = typedArrayObtainStyledAttributes.getInt(fa.x.f14870c0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(fa.x.f14874e0, 0);
                int i24 = typedArrayObtainStyledAttributes.getInt(fa.x.f14880h0, 0);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(fa.x.f14898q0, true);
                int i25 = typedArrayObtainStyledAttributes.getInt(fa.x.f14894o0, 1);
                int i26 = typedArrayObtainStyledAttributes.getInt(fa.x.f14886k0, 0);
                i11 = typedArrayObtainStyledAttributes.getInt(fa.x.f14890m0, Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(fa.x.f14878g0, true);
                z15 = typedArrayObtainStyledAttributes.getBoolean(fa.x.f14872d0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(fa.x.f14888l0, 0);
                this.A = typedArrayObtainStyledAttributes.getBoolean(fa.x.f14882i0, this.A);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(fa.x.f14876f0, true);
                typedArrayObtainStyledAttributes.recycle();
                i15 = resourceId2;
                z11 = z19;
                z14 = z20;
                z13 = z17;
                i12 = resourceId;
                z10 = z18;
                i18 = color;
                i16 = i26;
                i13 = i24;
                i19 = i23;
                z12 = zHasValue;
                i17 = i25;
                i14 = integer;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = 5000;
            i12 = i21;
            z10 = true;
            z11 = true;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 1;
            i18 = 0;
            z12 = false;
            z13 = true;
            i19 = 1;
            z14 = true;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(fa.r.f14810i);
        this.f20293b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            S(aspectRatioFrameLayout, i16);
        }
        View viewFindViewById = findViewById(fa.r.N);
        this.f20294c = viewFindViewById;
        if (viewFindViewById != null && z12) {
            viewFindViewById.setBackgroundColor(i18);
        }
        if (aspectRatioFrameLayout != null && i17 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i17 == 2) {
                this.f20295d = new TextureView(context);
            } else {
                if (i17 == 3) {
                    try {
                        int i27 = u8.l.f26603m;
                        this.f20295d = (View) u8.l.class.getConstructor(Context.class).newInstance(context);
                        z16 = true;
                    } catch (Exception e10) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                } else if (i17 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (l0.f28136a >= 34) {
                        b.a(surfaceView);
                    }
                    this.f20295d = surfaceView;
                } else {
                    try {
                        int i28 = t8.f.f25632b;
                        this.f20295d = (View) t8.f.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e11) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
                this.f20295d.setLayoutParams(layoutParams);
                this.f20295d.setOnClickListener(cVar);
                this.f20295d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f20295d, 0);
                aVar = null;
            }
            z16 = false;
            this.f20295d.setLayoutParams(layoutParams);
            this.f20295d.setOnClickListener(cVar);
            this.f20295d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f20295d, 0);
            aVar = null;
        } else {
            aVar = null;
            this.f20295d = null;
            z16 = false;
        }
        this.f20296e = z16;
        this.f20297f = l0.f28136a == 34 ? new f() : null;
        this.f20304m = (FrameLayout) findViewById(fa.r.f14802a);
        this.f20305n = (FrameLayout) findViewById(fa.r.B);
        this.f20298g = (ImageView) findViewById(fa.r.f14822u);
        this.f20315x = i13;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f19085a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: fa.h
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return this.f14772a.L(obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f20307p = cls;
        this.f20308q = method;
        this.f20309r = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(fa.r.f14803b);
        this.f20299h = imageView2;
        this.f20314w = z13 && i19 != 0 && imageView2 != null ? i19 : 0;
        if (i15 != 0) {
            this.f20316y = androidx.core.content.a.e(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(fa.r.Q);
        this.f20300i = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(fa.r.f14807f);
        this.f20301j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f20317z = i14;
        TextView textView = (TextView) findViewById(fa.r.f14815n);
        this.f20302k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i29 = fa.r.f14811j;
        io.bidmachine.media3.ui.d dVar = (io.bidmachine.media3.ui.d) findViewById(i29);
        View viewFindViewById3 = findViewById(fa.r.f14812k);
        if (dVar != null) {
            this.f20303l = dVar;
            i20 = 0;
        } else if (viewFindViewById3 != null) {
            i20 = 0;
            io.bidmachine.media3.ui.d dVar2 = new io.bidmachine.media3.ui.d(context, null, 0, attributeSet);
            this.f20303l = dVar2;
            dVar2.setId(i29);
            dVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(dVar2, iIndexOfChild);
        } else {
            i20 = 0;
            this.f20303l = null;
        }
        io.bidmachine.media3.ui.d dVar3 = this.f20303l;
        this.C = dVar3 != null ? i11 : i20;
        this.F = z11;
        this.D = z15;
        this.E = z14;
        this.f20311t = (!z10 || dVar3 == null) ? i20 : 1;
        if (dVar3 != null) {
            dVar3.Z();
            this.f20303l.S(this.f20292a);
        }
        if (z10) {
            setClickable(true);
        }
        a0();
    }

    @Deprecated
    public void setControllerVisibilityListener(io.bidmachine.media3.ui.d.m mVar) {
        x7.a.i(this.f20303l);
        io.bidmachine.media3.ui.d.m mVar2 = this.f20313v;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f20303l.j0(mVar2);
        }
        this.f20313v = mVar;
        if (mVar != null) {
            this.f20303l.S(mVar);
            setControllerVisibilityListener((d) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: PlayerView.java */
    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SurfaceSyncGroup f20321a;

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(SurfaceView surfaceView, Runnable runnable) {
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            this.f20321a = surfaceSyncGroup;
            x7.a.g(surfaceSyncGroup.add(rootSurfaceControl, new Runnable() { // from class: io.bidmachine.media3.ui.z
                @Override // java.lang.Runnable
                public final void run() {
                    x.f.c();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
        }

        public void e() {
            SurfaceSyncGroup surfaceSyncGroup = this.f20321a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f20321a = null;
            }
        }

        public void f(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: io.bidmachine.media3.ui.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20322a.d(surfaceView, runnable);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c() {
        }
    }
}
