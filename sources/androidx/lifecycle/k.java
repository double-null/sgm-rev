package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: LifecycleRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public class k extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f2916j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n.a<i, b> f2918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f.b f2919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference<j> f2920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<f.b> f2924i;

    /* JADX INFO: compiled from: LifecycleRegistry.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final f.b a(f.b state1, f.b bVar) {
            kotlin.jvm.internal.t.f(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f.b f2925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f2926b;

        public b(i iVar, f.b initialState) {
            kotlin.jvm.internal.t.f(initialState, "initialState");
            kotlin.jvm.internal.t.c(iVar);
            this.f2926b = n.f(iVar);
            this.f2925a = initialState;
        }

        public final void a(j jVar, f.a event) {
            kotlin.jvm.internal.t.f(event, "event");
            f.b bVarC = event.c();
            this.f2925a = k.f2916j.a(this.f2925a, bVarC);
            h hVar = this.f2926b;
            kotlin.jvm.internal.t.c(jVar);
            hVar.b(jVar, event);
            this.f2925a = bVarC;
        }

        public final f.b b() {
            return this.f2925a;
        }
    }

    private k(j jVar, boolean z10) {
        this.f2917b = z10;
        this.f2918c = new n.a<>();
        this.f2919d = f.b.INITIALIZED;
        this.f2924i = new ArrayList<>();
        this.f2920e = new WeakReference<>(jVar);
    }

    private final void d(j jVar) {
        Iterator<Map.Entry<i, b>> itDescendingIterator = this.f2918c.descendingIterator();
        kotlin.jvm.internal.t.e(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f2923h) {
            Map.Entry<i, b> next = itDescendingIterator.next();
            kotlin.jvm.internal.t.e(next, "next()");
            i key = next.getKey();
            b value = next.getValue();
            while (value.b().compareTo(this.f2919d) > 0 && !this.f2923h && this.f2918c.contains(key)) {
                f.a aVarA = f.a.Companion.a(value.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.b());
                }
                l(aVarA.c());
                value.a(jVar, aVarA);
                k();
            }
        }
    }

    private final f.b e(i iVar) {
        b value;
        Map.Entry<i, b> entryI = this.f2918c.i(iVar);
        f.b bVar = null;
        f.b bVarB = (entryI == null || (value = entryI.getValue()) == null) ? null : value.b();
        if (!this.f2924i.isEmpty()) {
            ArrayList<f.b> arrayList = this.f2924i;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        a aVar = f2916j;
        return aVar.a(aVar.a(this.f2919d, bVarB), bVar);
    }

    private final void f(String str) {
        if (!this.f2917b || m.c.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(j jVar) {
        n.b<i, b>.d dVarD = this.f2918c.d();
        kotlin.jvm.internal.t.e(dVarD, "observerMap.iteratorWithAdditions()");
        while (dVarD.hasNext() && !this.f2923h) {
            Map.Entry next = dVarD.next();
            i iVar = (i) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f2919d) < 0 && !this.f2923h && this.f2918c.contains(iVar)) {
                l(bVar.b());
                f.a aVarB = f.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(jVar, aVarB);
                k();
            }
        }
    }

    private final boolean i() {
        if (this.f2918c.size() == 0) {
            return true;
        }
        Map.Entry<i, b> entryA = this.f2918c.a();
        kotlin.jvm.internal.t.c(entryA);
        f.b bVarB = entryA.getValue().b();
        Map.Entry<i, b> entryE = this.f2918c.e();
        kotlin.jvm.internal.t.c(entryE);
        f.b bVarB2 = entryE.getValue().b();
        return bVarB == bVarB2 && this.f2919d == bVarB2;
    }

    private final void j(f.b bVar) {
        f.b bVar2 = this.f2919d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == f.b.INITIALIZED && bVar == f.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f2919d + " in component " + this.f2920e.get()).toString());
        }
        this.f2919d = bVar;
        if (this.f2922g || this.f2921f != 0) {
            this.f2923h = true;
            return;
        }
        this.f2922g = true;
        n();
        this.f2922g = false;
        if (this.f2919d == f.b.DESTROYED) {
            this.f2918c = new n.a<>();
        }
    }

    private final void k() {
        ArrayList<f.b> arrayList = this.f2924i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void l(f.b bVar) {
        this.f2924i.add(bVar);
    }

    private final void n() {
        j jVar = this.f2920e.get();
        if (jVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.f2923h = false;
            f.b bVar = this.f2919d;
            Map.Entry<i, b> entryA = this.f2918c.a();
            kotlin.jvm.internal.t.c(entryA);
            if (bVar.compareTo(entryA.getValue().b()) < 0) {
                d(jVar);
            }
            Map.Entry<i, b> entryE = this.f2918c.e();
            if (!this.f2923h && entryE != null && this.f2919d.compareTo(entryE.getValue().b()) > 0) {
                g(jVar);
            }
        }
        this.f2923h = false;
    }

    @Override // androidx.lifecycle.f
    public void a(i observer) {
        j jVar;
        kotlin.jvm.internal.t.f(observer, "observer");
        f("addObserver");
        f.b bVar = this.f2919d;
        f.b bVar2 = f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = f.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.f2918c.g(observer, bVar3) == null && (jVar = this.f2920e.get()) != null) {
            boolean z10 = this.f2921f != 0 || this.f2922g;
            f.b bVarE = e(observer);
            this.f2921f++;
            while (bVar3.b().compareTo(bVarE) < 0 && this.f2918c.contains(observer)) {
                l(bVar3.b());
                f.a aVarB = f.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(jVar, aVarB);
                k();
                bVarE = e(observer);
            }
            if (!z10) {
                n();
            }
            this.f2921f--;
        }
    }

    @Override // androidx.lifecycle.f
    public f.b b() {
        return this.f2919d;
    }

    @Override // androidx.lifecycle.f
    public void c(i observer) {
        kotlin.jvm.internal.t.f(observer, "observer");
        f("removeObserver");
        this.f2918c.h(observer);
    }

    public void h(f.a event) {
        kotlin.jvm.internal.t.f(event, "event");
        f("handleLifecycleEvent");
        j(event.c());
    }

    public void m(f.b state) {
        kotlin.jvm.internal.t.f(state, "state");
        f("setCurrentState");
        j(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(j provider) {
        this(provider, true);
        kotlin.jvm.internal.t.f(provider, "provider");
    }
}
