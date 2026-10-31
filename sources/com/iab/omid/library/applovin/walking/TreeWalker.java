package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.internal.k;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TreeWalker implements com.iab.omid.library.applovin.processor.a.InterfaceC0162a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f12622i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f12623j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f12624k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f12625l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f12626m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12628b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f12634h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f12627a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12629c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f12630d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f12632f = new com.iab.omid.library.applovin.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f12631e = new com.iab.omid.library.applovin.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f12633g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f12633g.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f12624k != null) {
                TreeWalker.f12624k.post(TreeWalker.f12625l);
                TreeWalker.f12624k.postDelayed(TreeWalker.f12626m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f12634h);
    }

    private void e() {
        this.f12628b = 0;
        this.f12630d.clear();
        this.f12629c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                this.f12629c = true;
                break;
            }
        }
        this.f12634h = f.b();
    }

    public static TreeWalker getInstance() {
        return f12622i;
    }

    private void i() {
        if (f12624k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f12624k = handler;
            handler.post(f12625l);
            f12624k.postDelayed(f12626m, 200L);
        }
    }

    private void k() {
        Handler handler = f12624k;
        if (handler != null) {
            handler.removeCallbacks(f12626m);
            f12624k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        k.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f12627a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f12627a.add(treeWalkerTimeLogger);
    }

    void f() {
        this.f12632f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f12631e.a();
        if (this.f12632f.b().size() > 0) {
            for (String str : this.f12632f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f12632f.a(str), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.c(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f12633g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f12632f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.c(jSONObjectA2);
            this.f12633g.b(jSONObjectA2, this.f12632f.c(), jB);
            if (this.f12629c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f12630d);
                }
            }
        } else {
            this.f12633g.b();
        }
        this.f12632f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f12627a.clear();
        f12623j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f12627a.contains(treeWalkerTimeLogger)) {
            this.f12627a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f12627a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f12627a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f12628b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f12628b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f12632f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f12632f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f12632f.c(strC)));
        this.f12632f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0162a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.applovin.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f12632f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f12629c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f12630d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f12628b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a aVarB = this.f12631e.b();
        String strB = this.f12632f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.walking.a.C0164a c0164aB = this.f12632f.b(view);
        if (c0164aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0164aB);
        return true;
    }
}
