package t7;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: OMSDKAdMeasurer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b<AdView extends View> implements e7.a<AdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f25566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f25567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a5.b f25568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a5.a f25569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b5.b f25570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<View> f25571g;

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25570f != null) {
                    b.this.f25570f.i();
                    b.this.t("onMediaResumed");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: renamed from: t7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class RunnableC0424b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f25573a;

        RunnableC0424b(float f10) {
            this.f25573a = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25570f != null) {
                    b.this.f25570f.m(this.f25573a);
                    b.this.t("onMediaVolumeChanged");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25570f != null) {
                    b.this.f25570f.j();
                    b.this.t("onMediaSkipped");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.f25570f = null;
                b.this.f25569e = null;
                if (b.this.f25568d != null) {
                    b.this.f25568d.c();
                }
                b.this.t("destroy");
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a5.h f25577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25578b;

        e(a5.h hVar, String str) {
            this.f25577a = hVar;
            this.f25578b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25568d != null) {
                    b.this.f25568d.b(this.f25577a, this.f25578b);
                    b.this.t("error");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f25580a;

        f(ViewGroup viewGroup) {
            this.f25580a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25568d != null) {
                    b bVar = b.this;
                    bVar.x(bVar.f25568d, this.f25580a);
                } else {
                    b.this.f25571g = new WeakReference(this.f25580a);
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25569e != null) {
                    b.this.f25569e.b();
                    b.this.t("onAdShown");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25570f != null) {
                    b.this.f25570f.a(b5.a.CLICK);
                    b.this.t("onAdClicked");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f25584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f25585b;

        i(float f10, float f11) {
            this.f25584a = f10;
            this.f25585b = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25570f != null) {
                    b.this.f25570f.k(this.f25584a / 1000.0f, this.f25585b);
                    b.this.t("onMediaStarted");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25570f != null) {
                    b.this.f25570f.f();
                    b.this.t("onMediaFirstQuartile");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25570f != null) {
                    b.this.f25570f.g();
                    b.this.t("onMediaMidpoint");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25570f != null) {
                    b.this.f25570f.l();
                    b.this.t("onMediaThirdQuartile");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.J();
                if (b.this.f25570f != null) {
                    b.this.f25570f.b();
                    b.this.t("onMediaCompleted");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMSDKAdMeasurer.java */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.this.f25570f != null) {
                    b.this.f25570f.h();
                    b.this.t("onMediaPaused");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    public b() {
        this(false);
    }

    private void o(a5.h hVar, String str) {
        io.bidmachine.core.h.S(new e(hVar, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(a5.b bVar, View view) throws Throwable {
        bVar.d(view);
        t("registerAdView");
    }

    private void z(a5.b bVar) throws Throwable {
        WeakReference<View> weakReference = this.f25571g;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            x(bVar, view);
        }
        this.f25571g = null;
    }

    @Override // e7.a
    public void A(ViewGroup viewGroup) {
        io.bidmachine.core.h.S(new f(viewGroup));
    }

    public void B() {
        if (this.f25566b.compareAndSet(false, true)) {
            io.bidmachine.core.h.S(new g());
        }
    }

    public void E() {
        io.bidmachine.core.h.S(new l());
    }

    public void J() {
        if (this.f25567c.compareAndSet(false, true)) {
            io.bidmachine.core.h.S(new c());
        }
    }

    public void L() {
        io.bidmachine.core.h.S(new m());
    }

    public void S(float f10, float f11) {
        io.bidmachine.core.h.S(new i(f10, f11));
    }

    public void W() {
        io.bidmachine.core.h.S(new a());
    }

    public void b0(float f10) {
        io.bidmachine.core.h.S(new RunnableC0424b(f10));
    }

    public void c0() {
        io.bidmachine.core.h.S(new k());
    }

    @Override // e7.a
    public void j() {
        if (this.f25565a) {
            return;
        }
        B();
    }

    @Override // e7.a
    public void l(c7.b bVar) {
        p(bVar.d());
    }

    public void n() {
        io.bidmachine.core.h.S(new d());
    }

    @Override // e7.a
    public void onAdClicked() {
        io.bidmachine.core.h.S(new h());
    }

    public void p(String str) {
        o(a5.h.GENERIC, str);
    }

    public void q() {
        io.bidmachine.core.h.S(new j());
    }

    public void r() {
        io.bidmachine.core.h.S(new n());
    }

    protected boolean s() {
        return this.f25568d != null;
    }

    protected void t(String str) {
        io.bidmachine.core.a.a("AdMeasurer", str);
    }

    protected abstract void v(a5.a aVar) throws Throwable;

    protected void w(a5.c cVar, a5.d dVar) {
        try {
            a5.b bVarA = a5.b.a(cVar, dVar);
            this.f25568d = bVarA;
            this.f25569e = a5.a.a(bVarA);
            if (cVar.c()) {
                this.f25570f = b5.b.e(this.f25568d);
            }
            z(this.f25568d);
            this.f25568d.e();
            v(this.f25569e);
            t("prepareAdSession");
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    public b(boolean z10) {
        this.f25565a = z10;
        this.f25566b = new AtomicBoolean(false);
        this.f25567c = new AtomicBoolean(false);
    }

    @Override // e7.a
    public void M(AdView adview) {
    }

    @Override // e7.a
    public void P(AdView adview) {
    }
}
