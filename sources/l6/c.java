package l6;

import a5.h;
import android.os.Handler;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import oc.p;
import pb.b0;
import wb.d0;

/* JADX INFO: compiled from: OMMeasurer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c<AdView extends View> implements ob.f<AdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f21756a = new p("OMMeasurer");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f21757b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f21758c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a5.b f21759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a5.a f21760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected b5.b f21761f;

    /* JADX INFO: compiled from: OMMeasurer.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!c.this.g() || c.this.f21760e == null) {
                    return;
                }
                c.this.f21760e.b();
                c.this.h("onAdShown");
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMMeasurer.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b5.b bVar = c.this.f21761f;
                if (bVar != null) {
                    bVar.a(b5.a.CLICK);
                    c.this.h("onAdClicked");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: renamed from: l6.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OMMeasurer.java */
    class RunnableC0352c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f21764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f21765b;

        RunnableC0352c(Runnable runnable, Handler handler) {
            this.f21764a = runnable;
            this.f21765b = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c cVar = c.this;
                cVar.f21761f = null;
                cVar.f21760e = null;
                if (c.this.f21759d != null) {
                    c.this.f21759d.c();
                }
                c.this.h("destroy");
                Runnable runnable = this.f21764a;
                if (runnable != null) {
                    this.f21765b.postDelayed(runnable, c.this.f());
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMMeasurer.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!c.this.g() || c.this.f21760e == null) {
                    return;
                }
                c cVar = c.this;
                cVar.k(cVar.f21760e);
                c.this.h("onAdLoaded");
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMMeasurer.java */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f21768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21769b;

        e(h hVar, String str) {
            this.f21768a = hVar;
            this.f21769b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.f21759d != null) {
                    c.this.f21759d.b(this.f21768a, this.f21769b);
                    c.this.h("error");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    /* JADX INFO: compiled from: OMMeasurer.java */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f21771a;

        f(View view) {
            this.f21771a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.f21759d != null) {
                    c.this.f21759d.d(this.f21771a);
                    c.this.h("registerView");
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    private void p(h hVar, String str) {
        io.bidmachine.core.h.S(new e(hVar, str));
    }

    @Override // ob.f
    public void a(b0 b0Var) {
        s(b0Var.b());
    }

    protected long f() {
        return 0L;
    }

    protected boolean g() {
        return this.f21759d != null;
    }

    protected void h(String str) {
        io.bidmachine.core.a.a(this.f21756a, str);
    }

    @Override // ob.f
    public void i(Runnable runnable) {
        io.bidmachine.core.h.S(new RunnableC0352c(runnable, d0.c()));
    }

    protected abstract void k(a5.a aVar) throws Throwable;

    protected void n(a5.c cVar, a5.d dVar) {
        try {
            a5.b bVarA = a5.b.a(cVar, dVar);
            this.f21759d = bVarA;
            this.f21760e = a5.a.a(bVarA);
            if (cVar.c()) {
                this.f21761f = b5.b.e(this.f21759d);
            }
            this.f21759d.e();
            h("prepareAdSession");
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    protected void o(View view) {
        io.bidmachine.core.h.S(new f(view));
    }

    @Override // ob.f
    public void onClicked() {
        io.bidmachine.core.h.S(new b());
    }

    @Override // ob.f
    public void onShown() {
        if (this.f21758c.compareAndSet(false, true)) {
            io.bidmachine.core.h.S(new a());
        }
    }

    public void s(String str) {
        p(h.GENERIC, str);
    }

    protected void t() {
        if (this.f21757b.compareAndSet(false, true)) {
            io.bidmachine.core.h.S(new d());
        }
    }

    @Override // ob.f
    public void T(AdView adview) {
    }
}
