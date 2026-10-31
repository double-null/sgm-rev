package x6;

import android.content.Context;
import h7.g;
import h7.n;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import kotlin.jvm.internal.t;
import vb.h;
import vb.i;
import vb.j;
import vb.k;
import wc.g0;

/* JADX INFO: compiled from: VastFullScreenAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f28071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t7.d f28072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t7.a f28073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f28074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f28075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f28076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i7.a f28077g;

    public b(n videoType) {
        t.f(videoType, "videoType");
        this.f28071a = videoType;
    }

    private final void m() {
        i7.a aVar = this.f28077g;
        if (aVar != null) {
            aVar.f0();
        }
        this.f28077g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(b this$0) {
        t.f(this$0, "this$0");
        this$0.m();
    }

    @Override // vb.b
    public void d() {
        g0 g0Var;
        this.f28075e = null;
        this.f28076f = null;
        t7.d dVar = this.f28072b;
        if (dVar != null) {
            dVar.n();
        }
        this.f28072b = null;
        t7.a aVar = this.f28073c;
        if (aVar != null) {
            aVar.i(new Runnable() { // from class: x6.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.o(this.f28070a);
                }
            });
            g0Var = g0.f27756a;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            m();
        }
        this.f28073c = null;
        if (this.f28074d != null) {
            this.f28074d = null;
        }
    }

    @Override // vb.h
    public void k(ContextProvider contextProvider, i callback, RendererConfiguration rendererConfiguration) throws Throwable {
        t.f(contextProvider, "contextProvider");
        t.f(callback, "callback");
        g gVar = this.f28074d;
        boolean z10 = false;
        if (gVar != null && gVar.u()) {
            z10 = true;
        }
        if (!z10) {
            callback.b(oc.a.i("VAST fullscreen object is null or can not find video file"));
        } else {
            this.f28076f = new d(callback, this.f28072b, this.f28073c);
            gVar.x(contextProvider.getContext(), this.f28071a, this.f28076f, this.f28077g, this.f28072b, this.f28073c);
        }
    }

    @Override // vb.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, i callback, j requestParams, k unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        t.f(contextProvider, "contextProvider");
        t.f(callback, "callback");
        t.f(requestParams, "requestParams");
        t.f(unifiedMediationParams, "unifiedMediationParams");
        t.f(networkAdUnit, "networkAdUnit");
        e eVar = new e(unifiedMediationParams);
        if (eVar.h(callback)) {
            if (eVar.c() == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (eVar.d()) {
                this.f28072b = new t7.d();
                this.f28073c = new t7.a();
            }
            Context applicationContext = contextProvider.getApplicationContext();
            t.e(applicationContext, "contextProvider.getApplicationContext()");
            this.f28075e = new c(callback);
            this.f28077g = new i7.a(applicationContext);
            g gVarA = g.V().d(eVar.a()).f(eVar.e()).g(eVar.f()).e(eVar.b()).b(eVar.g()).c(this.f28072b).a();
            this.f28074d = gVarA;
            if (gVarA != null) {
                gVarA.T(applicationContext, eVar.c(), this.f28075e);
            }
        }
    }
}
