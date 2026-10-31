package j5;

import a5.p;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import e5.k;
import i5.f;
import i5.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a implements g5.a.InterfaceC0231a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static a f20612i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f20613j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f20614k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f20615l = new d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f20616m = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20618b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20624h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b> f20617a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20619c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<l5.a> f20620d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j5.b f20622f = new j5.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g5.b f20621e = new g5.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j5.c f20623g = new j5.c(new k5.c());

    /* JADX INFO: renamed from: j5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0334a extends b {
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
            a.this.f20623g.c();
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
            if (a.f20614k != null) {
                a.f20614k.post(a.f20615l);
                a.f20614k.postDelayed(a.f20616m, 200L);
            }
        }
    }

    a() {
    }

    private void d(long j10) {
        if (this.f20617a.size() > 0) {
            for (b bVar : this.f20617a) {
                bVar.onTreeProcessed(this.f20618b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (bVar instanceof InterfaceC0334a) {
                    ((InterfaceC0334a) bVar).onTreeProcessedNano(this.f20618b, j10);
                }
            }
        }
    }

    private void e(View view, g5.a aVar, JSONObject jSONObject, j5.d dVar, boolean z10) {
        aVar.a(view, jSONObject, this, dVar == j5.d.PARENT_VIEW, z10);
    }

    private void f(String str, View view, JSONObject jSONObject) {
        g5.a aVarB = this.f20621e.b();
        String strH = this.f20622f.h(str);
        if (strH != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            i5.c.h(jSONObjectA, str);
            i5.c.o(jSONObjectA, strH);
            i5.c.j(jSONObject, jSONObjectA);
        }
    }

    private boolean g(View view, JSONObject jSONObject) {
        j5.b.a aVarG = this.f20622f.g(view);
        if (aVarG == null) {
            return false;
        }
        i5.c.f(jSONObject, aVarG);
        return true;
    }

    private boolean j(View view, JSONObject jSONObject) {
        String strJ = this.f20622f.j(view);
        if (strJ == null) {
            return false;
        }
        i5.c.h(jSONObject, strJ);
        i5.c.g(jSONObject, Boolean.valueOf(this.f20622f.p(view)));
        i5.c.n(jSONObject, Boolean.valueOf(this.f20622f.l(strJ)));
        this.f20622f.n();
        return true;
    }

    private void l() {
        d(f.b() - this.f20624h);
    }

    private void m() {
        this.f20618b = 0;
        this.f20620d.clear();
        this.f20619c = false;
        Iterator<p> it = e5.c.e().a().iterator();
        while (it.hasNext()) {
            if (it.next().p()) {
                this.f20619c = true;
                break;
            }
        }
        this.f20624h = f.b();
    }

    public static a p() {
        return f20612i;
    }

    private void r() {
        if (f20614k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f20614k = handler;
            handler.post(f20615l);
            f20614k.postDelayed(f20616m, 200L);
        }
    }

    private void t() {
        Handler handler = f20614k;
        if (handler != null) {
            handler.removeCallbacks(f20616m);
            f20614k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        m();
        n();
        l();
        k.f().a();
    }

    @Override // g5.a.InterfaceC0231a
    public void a(View view, g5.a aVar, JSONObject jSONObject, boolean z10) {
        j5.d dVarM;
        if (h.f(view) && (dVarM = this.f20622f.m(view)) != j5.d.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            i5.c.j(jSONObject, jSONObjectA);
            if (!j(view, jSONObjectA)) {
                boolean z11 = z10 || g(view, jSONObjectA);
                if (this.f20619c && dVarM == j5.d.OBSTRUCTION_VIEW && !z11) {
                    this.f20620d.add(new l5.a(view));
                }
                e(view, aVar, jSONObjectA, dVarM, z11);
            }
            this.f20618b++;
        }
    }

    void n() {
        this.f20622f.o();
        long jB = f.b();
        g5.a aVarA = this.f20621e.a();
        if (this.f20622f.i().size() > 0) {
            for (String str : this.f20622f.i()) {
                JSONObject jSONObjectA = aVarA.a(null);
                f(str, this.f20622f.a(str), jSONObjectA);
                i5.c.q(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f20623g.b(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f20622f.k().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            e(null, aVarA, jSONObjectA2, j5.d.PARENT_VIEW, false);
            i5.c.q(jSONObjectA2);
            this.f20623g.d(jSONObjectA2, this.f20622f.k(), jB);
            if (this.f20619c) {
                Iterator<p> it = e5.c.e().a().iterator();
                while (it.hasNext()) {
                    it.next().h(this.f20620d);
                }
            }
        } else {
            this.f20623g.c();
        }
        this.f20622f.d();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public void s() {
        o();
        this.f20617a.clear();
        f20613j.post(new c());
    }
}
