package x5;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o5.o;
import org.json.JSONObject;
import s5.k;
import w5.f;
import w5.h;

/* JADX INFO: loaded from: classes4.dex */
public class a implements u5.a.InterfaceC0436a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static a f28038i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f28039j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f28040k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f28041l = new d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f28042m = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28044b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f28050h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b> f28043a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28045c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<z5.a> f28046d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x5.b f28048f = new x5.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u5.b f28047e = new u5.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x5.c f28049g = new x5.c(new y5.c());

    /* JADX INFO: renamed from: x5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0467a extends b {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface b {
        void onTreeProcessed(int i10, long j10);
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f28049g.c();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.p().u();
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f28040k != null) {
                a.f28040k.post(a.f28041l);
                a.f28040k.postDelayed(a.f28042m, 200L);
            }
        }
    }

    a() {
    }

    private void d(long j10) {
        if (this.f28043a.size() > 0) {
            for (b bVar : this.f28043a) {
                bVar.onTreeProcessed(this.f28044b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (bVar instanceof InterfaceC0467a) {
                    ((InterfaceC0467a) bVar).onTreeProcessedNano(this.f28044b, j10);
                }
            }
        }
    }

    private void e(View view, u5.a aVar, JSONObject jSONObject, x5.d dVar, boolean z10) {
        aVar.a(view, jSONObject, this, dVar == x5.d.PARENT_VIEW, z10);
    }

    private void f(String str, View view, JSONObject jSONObject) {
        u5.a aVarB = this.f28047e.b();
        String strG = this.f28048f.g(str);
        if (strG != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            w5.c.f(jSONObjectA, str);
            w5.c.o(jSONObjectA, strG);
            w5.c.i(jSONObject, jSONObjectA);
        }
    }

    private boolean g(View view, JSONObject jSONObject) {
        x5.b.a aVarI = this.f28048f.i(view);
        if (aVarI == null) {
            return false;
        }
        w5.c.j(jSONObject, aVarI);
        return true;
    }

    private boolean j(View view, JSONObject jSONObject) {
        String strJ = this.f28048f.j(view);
        if (strJ == null) {
            return false;
        }
        w5.c.f(jSONObject, strJ);
        w5.c.e(jSONObject, Boolean.valueOf(this.f28048f.p(view)));
        w5.c.n(jSONObject, Boolean.valueOf(this.f28048f.l(strJ)));
        this.f28048f.n();
        return true;
    }

    private void l() {
        d(f.b() - this.f28050h);
    }

    private void m() {
        this.f28044b = 0;
        this.f28046d.clear();
        this.f28045c = false;
        Iterator<o> it = s5.c.e().a().iterator();
        while (it.hasNext()) {
            if (it.next().o()) {
                this.f28045c = true;
                break;
            }
        }
        this.f28050h = f.b();
    }

    public static a p() {
        return f28038i;
    }

    private void r() {
        if (f28040k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f28040k = handler;
            handler.post(f28041l);
            f28040k.postDelayed(f28042m, 200L);
        }
    }

    private void t() {
        Handler handler = f28040k;
        if (handler != null) {
            handler.removeCallbacks(f28042m);
            f28040k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        m();
        n();
        l();
        k.f().a();
    }

    @Override // u5.a.InterfaceC0436a
    public void a(View view, u5.a aVar, JSONObject jSONObject, boolean z10) {
        x5.d dVarM;
        if (h.f(view) && (dVarM = this.f28048f.m(view)) != x5.d.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            w5.c.i(jSONObject, jSONObjectA);
            if (!j(view, jSONObjectA)) {
                boolean z11 = z10 || g(view, jSONObjectA);
                if (this.f28045c && dVarM == x5.d.OBSTRUCTION_VIEW && !z11) {
                    this.f28046d.add(new z5.a(view));
                }
                e(view, aVar, jSONObjectA, dVarM, z11);
            }
            this.f28044b++;
        }
    }

    void n() {
        this.f28048f.o();
        long jB = f.b();
        u5.a aVarA = this.f28047e.a();
        if (this.f28048f.h().size() > 0) {
            for (String str : this.f28048f.h()) {
                JSONObject jSONObjectA = aVarA.a(null);
                f(str, this.f28048f.a(str), jSONObjectA);
                w5.c.q(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f28049g.b(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f28048f.k().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            e(null, aVarA, jSONObjectA2, x5.d.PARENT_VIEW, false);
            w5.c.q(jSONObjectA2);
            this.f28049g.d(jSONObjectA2, this.f28048f.k(), jB);
            if (this.f28045c) {
                Iterator<o> it = s5.c.e().a().iterator();
                while (it.hasNext()) {
                    it.next().g(this.f28046d);
                }
            }
        } else {
            this.f28049g.c();
        }
        this.f28048f.d();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public void s() {
        o();
        this.f28043a.clear();
        f28039j.post(new c());
    }
}
