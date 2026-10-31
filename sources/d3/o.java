package d3;

import com.applovin.impl.sdk.i0;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import e3.h0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: UserMetadata.java */
/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f13305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CrashlyticsWorkers f13306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f13308d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f13309e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f13310f = new k(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference<String> f13311g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: UserMetadata.java */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference<e> f13312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference<Runnable> f13313b = new AtomicReference<>(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f13314c;

        public a(boolean z10) {
            this.f13314c = z10;
            this.f13312a = new AtomicMarkableReference<>(new e(64, z10 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() throws Throwable {
            this.f13313b.set(null);
            e();
        }

        private void d() {
            Runnable runnable = new Runnable() { // from class: d3.n
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f13304a.c();
                }
            };
            if (i0.a(this.f13313b, null, runnable)) {
                o.this.f13306b.f12213b.f(runnable);
            }
        }

        private void e() throws Throwable {
            Map<String, String> mapA;
            synchronized (this) {
                if (this.f13312a.isMarked()) {
                    mapA = this.f13312a.getReference().a();
                    AtomicMarkableReference<e> atomicMarkableReference = this.f13312a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    mapA = null;
                }
            }
            if (mapA != null) {
                o.this.f13305a.r(o.this.f13307c, mapA, this.f13314c);
            }
        }

        public Map<String, String> b() {
            return this.f13312a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                if (!this.f13312a.getReference().d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<e> atomicMarkableReference = this.f13312a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                d();
                return true;
            }
        }

        public void g(Map<String, String> map) {
            synchronized (this) {
                this.f13312a.getReference().e(map);
                AtomicMarkableReference<e> atomicMarkableReference = this.f13312a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            d();
        }
    }

    public o(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.f13307c = str;
        this.f13305a = new g(fileStore);
        this.f13306b = crashlyticsWorkers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str, Map map, List list) throws Throwable {
        if (i() != null) {
            this.f13305a.t(str, i());
        }
        if (!map.isEmpty()) {
            this.f13305a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.f13305a.s(str, list);
    }

    public static o k(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        g gVar = new g(fileStore);
        o oVar = new o(str, fileStore, crashlyticsWorkers);
        oVar.f13308d.f13312a.getReference().e(gVar.i(str, false));
        oVar.f13309e.f13312a.getReference().e(gVar.i(str, true));
        oVar.f13311g.set(gVar.k(str), false);
        oVar.f13310f.c(gVar.j(str));
        return oVar;
    }

    public static String l(String str, FileStore fileStore) {
        return new g(fileStore).k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws Throwable {
        boolean z10;
        String strI;
        synchronized (this.f13311g) {
            z10 = false;
            if (this.f13311g.isMarked()) {
                strI = i();
                this.f13311g.set(strI, false);
                z10 = true;
            } else {
                strI = null;
            }
        }
        if (z10) {
            this.f13305a.t(this.f13307c, strI);
        }
    }

    public Map<String, String> f(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f13308d.b();
        }
        HashMap map2 = new HashMap(this.f13308d.b());
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strC = e.c(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strC)) {
                map2.put(strC, e.c(entry.getValue(), 1024));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            z2.f.f().k("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> g() {
        return this.f13309e.b();
    }

    public List<h0.f.d.e> h() {
        return this.f13310f.a();
    }

    public String i() {
        return this.f13311g.getReference();
    }

    public boolean n(String str, String str2) {
        return this.f13308d.f(str, str2);
    }

    public void o(Map<String, String> map) {
        this.f13308d.g(map);
    }

    public boolean p(String str, String str2) {
        return this.f13309e.f(str, str2);
    }

    public void q(final String str) {
        synchronized (this.f13307c) {
            this.f13307c = str;
            final Map<String, String> mapB = this.f13308d.b();
            final List<j> listB = this.f13310f.b();
            this.f13306b.f12213b.f(new Runnable() { // from class: d3.m
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f13300a.j(str, mapB, listB);
                }
            });
        }
    }

    public void r(String str) {
        String strC = e.c(str, 1024);
        synchronized (this.f13311g) {
            if (com.google.firebase.crashlytics.internal.common.h.z(strC, this.f13311g.getReference())) {
                return;
            }
            this.f13311g.set(strC, true);
            this.f13306b.f12213b.f(new Runnable() { // from class: d3.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f13299a.m();
                }
            });
        }
    }
}
