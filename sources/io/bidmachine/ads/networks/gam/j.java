package io.bidmachine.ads.networks.gam;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: GAMLoader.java */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oc.p f16546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f16547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m6.b f16548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16549d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f16552g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<AdsFormat, r> f16550e = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f16553h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List<c0> f16554i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Map<NetworkAdUnit, c0> f16555j = new WeakHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f16556k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f16557l = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: GAMLoader.java */
    static class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f16558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f16559e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScheduledExecutorService f16560a = Executors.newScheduledThreadPool(f16559e);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<AdsFormat, Map<String, Future<?>>> f16561b = new EnumMap(AdsFormat.class);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f16562c = new Object();

        static {
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            f16558d = iAvailableProcessors;
            f16559e = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(c cVar, AdsFormat adsFormat) {
            cVar.run();
            e(adsFormat, cVar.f16563a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(final AdsFormat adsFormat, final c cVar) {
            try {
                synchronized (this.f16562c) {
                    Map<String, Future<?>> map = this.f16561b.get(adsFormat);
                    if (map == null || map.isEmpty()) {
                        Future<?> futureSubmit = this.f16560a.submit(new Runnable() { // from class: io.bidmachine.ads.networks.gam.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f16568a.c(cVar, adsFormat);
                            }
                        });
                        if (map == null) {
                            map = new HashMap<>();
                            this.f16561b.put(adsFormat, map);
                        }
                        map.put(cVar.f16563a, futureSubmit);
                    }
                }
            } catch (Throwable unused) {
            }
        }

        private void e(AdsFormat adsFormat, String str) {
            synchronized (this.f16562c) {
                Map<String, Future<?>> map = this.f16561b.get(adsFormat);
                if (map != null) {
                    map.remove(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: GAMLoader.java */
    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j f16564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final r f16565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f16566d;

        /* JADX INFO: compiled from: GAMLoader.java */
        private static class a implements o0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CountDownLatch f16567a;

            @Override // io.bidmachine.ads.networks.gam.o0
            public void a(c0 c0Var, oc.a aVar) {
                this.f16567a.countDown();
            }

            @Override // io.bidmachine.ads.networks.gam.o0
            public void d(c0 c0Var) {
                this.f16567a.countDown();
            }

            private a(CountDownLatch countDownLatch) {
                this.f16567a = countDownLatch;
            }
        }

        private boolean c(c0 c0Var) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                c0Var.A(this.f16564b.f16547b, new a(countDownLatch));
                countDownLatch.await();
            } catch (Throwable unused) {
                countDownLatch.countDown();
            }
            if (c0Var.r()) {
                this.f16564b.D(c0Var);
                return true;
            }
            this.f16564b.i(c0Var);
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Iterator it = new ArrayList(this.f16565c.c()).iterator();
                while (it.hasNext()) {
                    c0 c0VarE = this.f16564b.f16548c.e(this.f16564b, this.f16565c.a(), (t) it.next());
                    if (c0VarE != null) {
                        if (c(c0VarE)) {
                            return;
                        } else {
                            Thread.sleep(this.f16566d);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        private c(j jVar, r rVar, int i10) {
            this.f16563a = UUID.randomUUID().toString();
            this.f16564b = jVar;
            this.f16565c = rVar;
            this.f16566d = i10;
        }
    }

    j(Context context, m6.b bVar, String str, Map<AdsFormat, r> map, String str2, long j10) {
        this.f16546a = new oc.p(str + "Loader");
        this.f16547b = context;
        this.f16548c = bVar;
        this.f16549d = str;
        this.f16551f = str2;
        this.f16552g = j10;
        for (AdsFormat adsFormat : AdsFormat.values()) {
            r rVar = map.get(adsFormat);
            if (rVar != null && !rVar.c().isEmpty()) {
                C(rVar.c());
                this.f16550e.put(rVar.a(), rVar);
            }
        }
    }

    private void C(List<t> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j.r((t) obj, (t) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(c0 c0Var) {
        try {
            c0Var.h();
        } catch (Throwable unused) {
        }
        z(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(c0 c0Var) {
        return String.format("removeFromCaches (%s)", c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(NetworkAdUnit networkAdUnit, c0 c0Var) {
        return String.format("reserveGAMAd (networkAdUnitId - %s, %s)", networkAdUnit.getId(), c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int r(t tVar, t tVar2) {
        return -Float.compare(tVar.d(), tVar2.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int s(c0 c0Var, c0 c0Var2) {
        return -Float.compare(c0Var.p(), c0Var2.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t(NetworkAdUnit networkAdUnit) {
        return String.format("unReserveGAMAd (networkAdUnitId - %s)", networkAdUnit.getId());
    }

    private int w(r rVar) {
        int i10;
        synchronized (this.f16556k) {
            Iterator<c0> it = this.f16554i.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (it.next().m() == rVar.a()) {
                    i10++;
                }
            }
        }
        return i10;
    }

    private void z(final c0 c0Var) {
        synchronized (this.f16556k) {
            if (this.f16554i.remove(c0Var)) {
                io.bidmachine.core.a.b(this.f16546a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.f
                    @Override // qc.b
                    public final Object get() {
                        return j.p(c0Var);
                    }
                });
            }
            F(c0Var);
        }
    }

    void A(final NetworkAdUnit networkAdUnit, final c0 c0Var) {
        synchronized (this.f16557l) {
            io.bidmachine.core.a.b(this.f16546a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.i
                @Override // qc.b
                public final Object get() {
                    return j.q(networkAdUnit, c0Var);
                }
            });
            this.f16555j.put(networkAdUnit, c0Var);
        }
    }

    t B(NetworkAdUnit networkAdUnit, String str) {
        synchronized (this.f16556k) {
            c0 c0VarJ = j(str);
            if (c0VarJ == null) {
                return null;
            }
            A(networkAdUnit, c0VarJ);
            return c0VarJ.o();
        }
    }

    void D(c0 c0Var) {
        synchronized (this.f16556k) {
            if (this.f16554i.contains(c0Var)) {
                return;
            }
            this.f16554i.add(c0Var);
            Collections.sort(this.f16554i, new Comparator() { // from class: io.bidmachine.ads.networks.gam.h
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return j.s((c0) obj, (c0) obj2);
                }
            });
        }
    }

    void E(final NetworkAdUnit networkAdUnit) {
        synchronized (this.f16557l) {
            io.bidmachine.core.a.b(this.f16546a, new qc.b() { // from class: io.bidmachine.ads.networks.gam.e
                @Override // qc.b
                public final Object get() {
                    return j.t(networkAdUnit);
                }
            });
            this.f16555j.remove(networkAdUnit);
        }
    }

    void F(c0 c0Var) {
        synchronized (this.f16557l) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<NetworkAdUnit, c0> entry : this.f16555j.entrySet()) {
                if (entry.getValue().equals(c0Var)) {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                E((NetworkAdUnit) it.next());
            }
        }
    }

    c0 j(String str) {
        synchronized (this.f16556k) {
            for (c0 c0Var : this.f16554i) {
                if (c0Var.l().equals(str) && !o(c0Var)) {
                    return c0Var;
                }
            }
            return null;
        }
    }

    public long k() {
        return this.f16552g;
    }

    public String l() {
        return this.f16549d;
    }

    public String m() {
        return this.f16551f;
    }

    c0 n(NetworkAdUnit networkAdUnit) {
        c0 c0Var;
        synchronized (this.f16557l) {
            c0Var = this.f16555j.get(networkAdUnit);
        }
        return c0Var;
    }

    boolean o(c0 c0Var) {
        boolean zContainsValue;
        synchronized (this.f16557l) {
            zContainsValue = this.f16555j.containsValue(c0Var);
        }
        return zContainsValue;
    }

    void u() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            v(adsFormat);
        }
    }

    boolean v(AdsFormat adsFormat) {
        r rVar = this.f16550e.get(adsFormat);
        if (rVar == null || w(rVar) >= rVar.b()) {
            return false;
        }
        this.f16553h.d(adsFormat, new c(rVar, 500));
        return true;
    }

    void x(c0 c0Var, boolean z10) {
        if (!z10) {
            F(c0Var);
        } else {
            c0Var.E();
            z(c0Var);
        }
    }

    void y(c0 c0Var) {
        z(c0Var);
    }
}
