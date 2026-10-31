package ic;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import jc.c;
import kotlin.jvm.internal.t;
import nc.d;
import wb.h;

/* JADX INFO: compiled from: ViewabilityHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ic.b f16367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jc.a f16368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nc.b f16369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f16370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f16371e;

    /* JADX INFO: renamed from: ic.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewabilityHandler.kt */
    public final class C0264a implements c {
        public C0264a() {
        }

        @Override // jc.c
        public void a(mc.a actionEvent, h error) {
            t.f(actionEvent, "actionEvent");
            t.f(error, "error");
            a.this.d(actionEvent, error);
        }

        @Override // jc.c
        public void b(mc.a actionEvent) {
            t.f(actionEvent, "actionEvent");
            a.this.i(actionEvent);
        }
    }

    /* JADX INFO: compiled from: ViewabilityHandler.kt */
    public final class b implements d {
        public b() {
        }

        @Override // nc.d
        public void a() {
            a.this.e(false);
        }

        @Override // nc.d
        public void b() {
            a.this.h();
        }
    }

    public a(mc.d dVar, nc.a visibilityParams, ic.b viewabilityHandlerListener) {
        t.f(visibilityParams, "visibilityParams");
        t.f(viewabilityHandlerListener, "viewabilityHandlerListener");
        this.f16367a = viewabilityHandlerListener;
        this.f16368b = dVar != null ? new jc.b(dVar, new C0264a()) : null;
        this.f16369c = new nc.c(visibilityParams, new b());
        this.f16370d = new AtomicBoolean(false);
        this.f16371e = new AtomicBoolean(false);
    }

    public final void a() {
        jc.a aVar = this.f16368b;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f16369c.destroy();
    }

    public final boolean b() {
        return this.f16370d.get();
    }

    public final boolean c() {
        return this.f16371e.get();
    }

    public final void d(mc.a actionEvent, h error) {
        t.f(actionEvent, "actionEvent");
        t.f(error, "error");
        this.f16367a.c(actionEvent, error);
    }

    public final void e(boolean z10) {
        if (this.f16370d.get() && this.f16371e.compareAndSet(!z10, z10)) {
            this.f16367a.a(z10);
        }
    }

    public final void f(mc.a actionEvent) {
        t.f(actionEvent, "actionEvent");
        this.f16367a.b(actionEvent);
    }

    public final void g() {
        if (this.f16370d.compareAndSet(false, true)) {
            this.f16367a.d();
        }
    }

    public final void h() {
        if (this.f16368b == null) {
            g();
        }
        e(true);
    }

    public final void i(mc.a actionEvent) {
        t.f(actionEvent, "actionEvent");
        f(actionEvent);
        if (actionEvent.b()) {
            g();
            e(true);
        }
    }

    public final void j(View view) {
        t.f(view, "view");
        jc.a aVar = this.f16368b;
        if (aVar != null) {
            aVar.a(view);
        }
        this.f16369c.a(view);
    }

    public final void k() {
        jc.a aVar = this.f16368b;
        if (aVar != null) {
            aVar.stop();
        }
        this.f16369c.stop();
        this.f16371e.set(false);
    }
}
