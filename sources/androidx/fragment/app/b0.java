package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.z0;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: SpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f2542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<e> f2543b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<e> f2544c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f2545d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f2546e = false;

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    /* JADX INFO: loaded from: classes.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f2547a;

        a(d dVar) {
            this.f2547a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b0.this.f2543b.contains(this.f2547a)) {
                this.f2547a.e().b(this.f2547a.f().mView);
            }
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    /* JADX INFO: loaded from: classes.dex */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f2549a;

        b(d dVar) {
            this.f2549a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f2543b.remove(this.f2549a);
            b0.this.f2544c.remove(this.f2549a);
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    /* JADX INFO: loaded from: classes.dex */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2552b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2552b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2552b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2552b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f2551a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2551a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2551a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2551a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    /* JADX INFO: loaded from: classes.dex */
    private static class d extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final t f2553h;

        d(e.c cVar, e.b bVar, t tVar, androidx.core.os.d dVar) {
            super(cVar, bVar, tVar.k(), dVar);
            this.f2553h = tVar;
        }

        @Override // androidx.fragment.app.b0.e
        public void c() {
            super.c();
            this.f2553h.m();
        }

        @Override // androidx.fragment.app.b0.e
        void l() {
            Fragment fragmentK = this.f2553h.k();
            View viewFindFocus = fragmentK.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK.setFocusedView(viewFindFocus);
                if (n.D0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK);
                }
            }
            if (g() == e.b.ADDING) {
                View viewRequireView = f().requireView();
                if (viewRequireView.getParent() == null) {
                    this.f2553h.b();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentK.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f2554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f2555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Fragment f2556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<Runnable> f2557d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final HashSet<androidx.core.os.d> f2558e = new HashSet<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f2559f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f2560g = false;

        /* JADX INFO: compiled from: SpecialEffectsController.java */
        /* JADX INFO: loaded from: classes.dex */
        class a implements androidx.core.os.d.a {
            a() {
            }

            @Override // androidx.core.os.d.a
            public void onCancel() {
                e.this.b();
            }
        }

        /* JADX INFO: compiled from: SpecialEffectsController.java */
        /* JADX INFO: loaded from: classes.dex */
        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: compiled from: SpecialEffectsController.java */
        /* JADX INFO: loaded from: classes.dex */
        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c c(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            static c e(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : c(view.getVisibility());
            }

            void b(View view) {
                int i10 = c.f2551a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (n.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.d dVar) {
            this.f2554a = cVar;
            this.f2555b = bVar;
            this.f2556c = fragment;
            dVar.c(new a());
        }

        final void a(Runnable runnable) {
            this.f2557d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f2559f = true;
            if (this.f2558e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f2558e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.d) it.next()).a();
            }
        }

        public final void d(androidx.core.os.d dVar) {
            if (this.f2558e.remove(dVar) && this.f2558e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f2554a;
        }

        public final Fragment f() {
            return this.f2556c;
        }

        b g() {
            return this.f2555b;
        }

        final boolean h() {
            return this.f2559f;
        }

        final boolean i() {
            return this.f2560g;
        }

        public final void j(androidx.core.os.d dVar) {
            l();
            this.f2558e.add(dVar);
        }

        final void k(c cVar, b bVar) {
            int i10 = c.f2552b[bVar.ordinal()];
            if (i10 == 1) {
                if (this.f2554a == c.REMOVED) {
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2556c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2555b + " to ADDING.");
                    }
                    this.f2554a = c.VISIBLE;
                    this.f2555b = b.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (n.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2556c + " mFinalState = " + this.f2554a + " -> REMOVED. mLifecycleImpact  = " + this.f2555b + " to REMOVING.");
                }
                this.f2554a = c.REMOVED;
                this.f2555b = b.REMOVING;
                return;
            }
            if (i10 == 3 && this.f2554a != c.REMOVED) {
                if (n.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2556c + " mFinalState = " + this.f2554a + " -> " + cVar + ". ");
                }
                this.f2554a = cVar;
            }
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2554a + "} {mLifecycleImpact = " + this.f2555b + "} {mFragment = " + this.f2556c + "}";
        }

        public void c() {
            if (this.f2560g) {
                return;
            }
            if (n.D0(2)) {
                Log.v(cNMUz.ZsinVYiqVSav, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2560g = true;
            Iterator<Runnable> it = this.f2557d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    b0(ViewGroup viewGroup) {
        this.f2542a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, t tVar) {
        synchronized (this.f2543b) {
            androidx.core.os.d dVar = new androidx.core.os.d();
            e eVarH = h(tVar.k());
            if (eVarH != null) {
                eVarH.k(cVar, bVar);
                return;
            }
            d dVar2 = new d(cVar, bVar, tVar, dVar);
            this.f2543b.add(dVar2);
            dVar2.a(new a(dVar2));
            dVar2.a(new b(dVar2));
        }
    }

    private e h(Fragment fragment) {
        for (e eVar : this.f2543b) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        for (e eVar : this.f2544c) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static b0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.x0());
    }

    static b0 o(ViewGroup viewGroup, c0 c0Var) {
        int i10 = j0.b.f20525b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof b0) {
            return (b0) tag;
        }
        b0 b0VarA = c0Var.a(viewGroup);
        viewGroup.setTag(i10, b0VarA);
        return b0VarA;
    }

    private void q() {
        for (e eVar : this.f2543b) {
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.c(eVar.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + tVar.k());
        }
        a(cVar, e.b.ADDING, tVar);
    }

    void c(t tVar) {
        if (n.D0(2)) {
            Log.v(yhXxbqGRMeI.tBQneqDII, "SpecialEffectsController: Enqueuing hide operation for fragment " + tVar.k());
        }
        a(e.c.GONE, e.b.NONE, tVar);
    }

    void d(t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + tVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, tVar);
    }

    void e(t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + tVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, tVar);
    }

    abstract void f(List<e> list, boolean z10);

    void g() {
        if (this.f2546e) {
            return;
        }
        if (!z0.x(this.f2542a)) {
            j();
            this.f2545d = false;
            return;
        }
        synchronized (this.f2543b) {
            if (!this.f2543b.isEmpty()) {
                ArrayList<e> arrayList = new ArrayList(this.f2544c);
                this.f2544c.clear();
                for (e eVar : arrayList) {
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f2544c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f2543b);
                this.f2543b.clear();
                this.f2544c.addAll(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                f(arrayList2, this.f2545d);
                this.f2545d = false;
            }
        }
    }

    void k() {
        if (this.f2546e) {
            this.f2546e = false;
            g();
        }
    }

    e.b l(t tVar) {
        e eVarH = h(tVar.k());
        if (eVarH != null) {
            return eVarH.g();
        }
        e eVarI = i(tVar.k());
        if (eVarI != null) {
            return eVarI.g();
        }
        return null;
    }

    public ViewGroup m() {
        return this.f2542a;
    }

    void p() {
        synchronized (this.f2543b) {
            q();
            this.f2546e = false;
            for (int size = this.f2543b.size() - 1; size >= 0; size--) {
                e eVar = this.f2543b.get(size);
                e.c cVarE = e.c.e(eVar.f().mView);
                e.c cVarE2 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (cVarE2 == cVar && cVarE != cVar) {
                    this.f2546e = eVar.f().isPostponed();
                    break;
                }
            }
        }
    }

    void r(boolean z10) {
        this.f2545d = z10;
    }

    void j() {
        boolean zX = z0.x(this.f2542a);
        synchronized (this.f2543b) {
            q();
            Iterator<e> it = this.f2543b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            for (e eVar : new ArrayList(this.f2544c)) {
                if (n.D0(2)) {
                    String str = CwEo.YnO;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zX ? "" : "Container " + this.f2542a + " is not attached to window. ");
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v(str, sb2.toString());
                }
                eVar.b();
            }
            for (e eVar2 : new ArrayList(this.f2543b)) {
                if (n.D0(2)) {
                    String str2 = CwEo.YnO;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    sb3.append(zX ? "" : "Container " + this.f2542a + " is not attached to window. ");
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v(str2, sb3.toString());
                }
                eVar2.b();
            }
        }
    }
}
