package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: FragmentManager.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private ActivityResultLauncher<androidx.activity.result.d> A;
    private ActivityResultLauncher<String[]> B;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<androidx.fragment.app.a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<p> L;
    private q M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2654b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f2656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<Fragment> f2657e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f2659g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<m> f2664l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private androidx.fragment.app.k<?> f2670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.fragment.app.g f2671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Fragment f2672t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Fragment f2673u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ActivityResultLauncher<Intent> f2678z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<InterfaceC0046n> f2653a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f2655c = new u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.fragment.app.l f2658f = new androidx.fragment.app.l(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.activity.b f2660h = new c(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f2661i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, Bundle> f2662j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f2663k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<Fragment, HashSet<androidx.core.os.d>> f2665m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w.g f2666n = new d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.fragment.app.m f2667o = new androidx.fragment.app.m(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final CopyOnWriteArrayList<r> f2668p = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f2669q = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.fragment.app.j f2674v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.fragment.app.j f2675w = new e();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c0 f2676x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private c0 f2677y = new f();
    ArrayDeque<l> C = new ArrayDeque<>();
    private Runnable N = new g();

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(androidx.activity.result.a aVar) {
            l lVarPollFirst = n.this.C.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVarPollFirst.f2693a;
            int i10 = lVarPollFirst.f2694b;
            Fragment fragmentI = n.this.f2655c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l lVarPollFirst = n.this.C.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVarPollFirst.f2693a;
            int i11 = lVarPollFirst.f2694b;
            Fragment fragmentI = n.this.f2655c.i(str);
            if (fragmentI != null) {
                fragmentI.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class c extends androidx.activity.b {
        c(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.b
        public void b() {
            n.this.A0();
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class d implements w.g {
        d() {
        }

        @Override // androidx.fragment.app.w.g
        public void a(Fragment fragment, androidx.core.os.d dVar) {
            if (dVar.b()) {
                return;
            }
            n.this.Y0(fragment, dVar);
        }

        @Override // androidx.fragment.app.w.g
        public void b(Fragment fragment, androidx.core.os.d dVar) {
            n.this.f(fragment, dVar);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class e extends androidx.fragment.app.j {
        e() {
        }

        @Override // androidx.fragment.app.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.s0().b(n.this.s0().f(), str, null);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class f implements c0 {
        f() {
        }

        @Override // androidx.fragment.app.c0
        public b0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.a0(true);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2688c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2686a = viewGroup;
            this.f2687b = view;
            this.f2688c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2686a.endViewTransition(this.f2687b);
            animator.removeListener(this);
            Fragment fragment = this.f2688c;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class i implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f2690a;

        i(Fragment fragment) {
            this.f2690a = fragment;
        }

        @Override // androidx.fragment.app.r
        public void a(n nVar, Fragment fragment) {
            this.f2690a.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(androidx.activity.result.a aVar) {
            l lVarPollFirst = n.this.C.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVarPollFirst.f2693a;
            int i10 = lVarPollFirst.f2694b;
            Fragment fragmentI = n.this.f2655c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    static class k extends f.a<androidx.activity.result.d, androidx.activity.result.a> {
        k() {
        }

        @Override // f.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, androidx.activity.result.d dVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = dVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    dVar = new androidx.activity.result.d.b(dVar.d()).b(null).c(dVar.c(), dVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", dVar);
            if (n.D0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a parseResult(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    public interface m {
        void onBackStackChanged();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.n$n, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    interface InterfaceC0046n {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    private class o implements InterfaceC0046n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f2695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f2696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f2697c;

        o(String str, int i10, int i11) {
            this.f2695a = str;
            this.f2696b = i10;
            this.f2697c = i11;
        }

        @Override // androidx.fragment.app.n.InterfaceC0046n
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.f2673u;
            if (fragment == null || this.f2696b >= 0 || this.f2695a != null || !fragment.getChildFragmentManager().U0()) {
                return n.this.W0(arrayList, arrayList2, this.f2695a, this.f2696b, this.f2697c);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    static class p implements Fragment.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f2699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f2700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2701c;

        p(androidx.fragment.app.a aVar, boolean z10) {
            this.f2699a = z10;
            this.f2700b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.k
        public void a() {
            this.f2701c++;
        }

        @Override // androidx.fragment.app.Fragment.k
        public void b() {
            int i10 = this.f2701c - 1;
            this.f2701c = i10;
            if (i10 != 0) {
                return;
            }
            this.f2700b.f2523t.g1();
        }

        void c() {
            androidx.fragment.app.a aVar = this.f2700b;
            aVar.f2523t.t(aVar, this.f2699a, false, false);
        }

        void d() {
            boolean z10 = this.f2701c > 0;
            for (Fragment fragment : this.f2700b.f2523t.r0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z10 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            androidx.fragment.app.a aVar = this.f2700b;
            aVar.f2523t.t(aVar, this.f2699a, !z10, true);
        }

        public boolean e() {
            return this.f2701c == 0;
        }
    }

    static boolean D0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    private boolean E0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.o();
    }

    private void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(f0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private void M0(androidx.collection.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragmentI = bVar.i(i10);
            if (!fragmentI.mAdded) {
                View viewRequireView = fragmentI.requireView();
                fragmentI.mPostponedAlpha = viewRequireView.getAlpha();
                viewRequireView.setAlpha(0.0f);
            }
        }
    }

    private void S(int i10) {
        try {
            this.f2654b = true;
            this.f2655c.d(i10);
            O0(i10, false);
            if (P) {
                Iterator<b0> it = r().iterator();
                while (it.hasNext()) {
                    it.next().j();
                }
            }
            this.f2654b = false;
            a0(true);
        } catch (Throwable th) {
            this.f2654b = false;
            throw th;
        }
    }

    private void V() {
        if (this.H) {
            this.H = false;
            m1();
        }
    }

    private boolean V0(String str, int i10, int i11) {
        a0(false);
        Z(true);
        Fragment fragment = this.f2673u;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().U0()) {
            return true;
        }
        boolean zW0 = W0(this.I, this.J, str, i10, i11);
        if (zW0) {
            this.f2654b = true;
            try {
                a1(this.I, this.J);
                q();
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        n1();
        V();
        this.f2655c.b();
        return zW0;
    }

    private void X() {
        if (P) {
            Iterator<b0> it = r().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        } else {
            if (this.f2665m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f2665m.keySet()) {
                n(fragment);
                P0(fragment);
            }
        }
    }

    private int X0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, androidx.collection.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            androidx.fragment.app.a aVar = arrayList.get(i13);
            boolean zBooleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.y() && !aVar.w(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                p pVar = new p(aVar, zBooleanValue);
                this.L.add(pVar);
                aVar.A(pVar);
                if (zBooleanValue) {
                    aVar.r();
                } else {
                    aVar.s(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                d(bVar);
            }
        }
        return i12;
    }

    private void Z(boolean z10) {
        if (this.f2654b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2670r == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2670r.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            p();
        }
        if (this.I == null) {
            this.I = new ArrayList<>();
            this.J = new ArrayList<>();
        }
        this.f2654b = true;
        try {
            e0(null, null);
        } finally {
            this.f2654b = false;
        }
    }

    private void a1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        e0(arrayList, arrayList2);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f2759r) {
                if (i11 != i10) {
                    d0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2759r) {
                        i11++;
                    }
                }
                d0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            d0(arrayList, arrayList2, i11, size);
        }
    }

    private static void c0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.n(-1);
                aVar.s(i10 == i11 + (-1));
            } else {
                aVar.n(1);
                aVar.r();
            }
            i10++;
        }
    }

    private void c1() {
        if (this.f2664l != null) {
            for (int i10 = 0; i10 < this.f2664l.size(); i10++) {
                this.f2664l.get(i10).onBackStackChanged();
            }
        }
    }

    private void d(androidx.collection.b<Fragment> bVar) {
        int i10 = this.f2669q;
        if (i10 < 1) {
            return;
        }
        int iMin = Math.min(i10, 5);
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment.mState < iMin) {
                Q0(fragment, iMin);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    bVar.add(fragment);
                }
            }
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r17v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 'this'  ??, new type: androidx.fragment.app.n
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r17v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 'this'  ??, new type: androidx.fragment.app.n
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private void d0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<p> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = this.L.get(i10);
            if (arrayList != null && !pVar.f2699a && (iIndexOf2 = arrayList.indexOf(pVar.f2700b)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf2).booleanValue()) {
                this.L.remove(i10);
                i10--;
                size--;
                pVar.c();
            } else if (pVar.e() || (arrayList != null && pVar.f2700b.w(arrayList, 0, arrayList.size()))) {
                this.L.remove(i10);
                i10--;
                size--;
                if (arrayList == null || pVar.f2699a || (iIndexOf = arrayList.indexOf(pVar.f2700b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                    pVar.d();
                } else {
                    pVar.c();
                }
            }
            i10++;
        }
    }

    static int e1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 4099) {
            return i10 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void j0() {
        if (P) {
            Iterator<b0> it = r().iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean k0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2653a) {
            if (this.f2653a.isEmpty()) {
                return false;
            }
            int size = this.f2653a.size();
            boolean zA = false;
            for (int i10 = 0; i10 < size; i10++) {
                zA |= this.f2653a.get(i10).a(arrayList, arrayList2);
            }
            this.f2653a.clear();
            this.f2670r.g().removeCallbacks(this.N);
            return zA;
        }
    }

    private void k1(Fragment fragment) {
        ViewGroup viewGroupO0 = o0(fragment);
        if (viewGroupO0 == null || fragment.getNextAnim() <= 0) {
            return;
        }
        int i10 = j0.b.f20526c;
        if (viewGroupO0.getTag(i10) == null) {
            viewGroupO0.setTag(i10, fragment);
        }
        ((Fragment) viewGroupO0.getTag(i10)).setNextAnim(fragment.getNextAnim());
    }

    private q m0(Fragment fragment) {
        return this.M.i(fragment);
    }

    private void m1() {
        Iterator<t> it = this.f2655c.k().iterator();
        while (it.hasNext()) {
            S0(it.next());
        }
    }

    private void n(Fragment fragment) {
        HashSet<androidx.core.os.d> hashSet = this.f2665m.get(fragment);
        if (hashSet != null) {
            Iterator<androidx.core.os.d> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            w(fragment);
            this.f2665m.remove(fragment);
        }
    }

    private void n1() {
        synchronized (this.f2653a) {
            if (this.f2653a.isEmpty()) {
                this.f2660h.f(l0() > 0 && G0(this.f2672t));
            } else {
                this.f2660h.f(true);
            }
        }
    }

    private ViewGroup o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f2671s.d()) {
            View viewC = this.f2671s.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private void p() {
        if (I0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void q() {
        this.f2654b = false;
        this.J.clear();
        this.I.clear();
    }

    private Set<b0> r() {
        HashSet hashSet = new HashSet();
        Iterator<t> it = this.f2655c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(b0.o(viewGroup, x0()));
            }
        }
        return hashSet;
    }

    private Set<b0> s(ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<v.a> it = arrayList.get(i10).f2744c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f2762b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(b0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void u(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            androidx.fragment.app.f.d dVarB = androidx.fragment.app.f.b(this.f2670r.f(), fragment, !fragment.mHidden);
            if (dVarB == null || (animator = dVarB.f2633b) == null) {
                if (dVarB != null) {
                    fragment.mView.startAnimation(dVarB.f2632a);
                    dVarB.f2632a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    dVarB.f2633b.addListener(new h(viewGroup, view, fragment));
                }
                dVarB.f2633b.start();
            }
        }
        if (fragment.mAdded && E0(fragment)) {
            this.D = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    private void w(Fragment fragment) {
        fragment.performDestroyView();
        this.f2667o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.n(null);
        fragment.mInLayout = false;
    }

    static Fragment y0(View view) {
        Object tag = view.getTag(j0.b.f20524a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    void A(Configuration configuration) {
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    void A0() {
        a0(true);
        if (this.f2660h.c()) {
            U0();
        } else {
            this.f2659g.c();
        }
    }

    boolean B(MenuItem menuItem) {
        if (this.f2669q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void B0(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        k1(fragment);
    }

    void C() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(1);
    }

    public boolean C0() {
        return this.G;
    }

    boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f2669q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null && F0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f2657e != null) {
            for (int i10 = 0; i10 < this.f2657e.size(); i10++) {
                Fragment fragment2 = this.f2657e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2657e = arrayList;
        return z10;
    }

    void E() {
        this.G = true;
        a0(true);
        X();
        S(-1);
        this.f2670r = null;
        this.f2671s = null;
        this.f2672t = null;
        if (this.f2659g != null) {
            this.f2660h.d();
            this.f2659g = null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.f2678z;
        if (activityResultLauncher != null) {
            activityResultLauncher.d();
            this.A.d();
            this.B.d();
        }
    }

    void F() {
        S(1);
    }

    boolean F0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    void G() {
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.mFragmentManager;
        return fragment.equals(nVar.w0()) && G0(nVar.f2672t);
    }

    void H(boolean z10) {
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
            }
        }
    }

    boolean H0(int i10) {
        return this.f2669q >= i10;
    }

    void I(Fragment fragment) {
        Iterator<r> it = this.f2668p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public boolean I0() {
        return this.E || this.F;
    }

    boolean J(MenuItem menuItem) {
        if (this.f2669q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void J0(Fragment fragment, String[] strArr, int i10) {
        if (this.B == null) {
            this.f2670r.j(fragment, strArr, i10);
            return;
        }
        this.C.addLast(new l(fragment.mWho, i10));
        this.B.b(strArr);
    }

    void K(Menu menu) {
        if (this.f2669q < 1) {
            return;
        }
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void K0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f2678z == null) {
            this.f2670r.m(fragment, intent, i10, bundle);
            return;
        }
        this.C.addLast(new l(fragment.mWho, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f2678z.b(intent);
    }

    void L0(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.A == null) {
            this.f2670r.n(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (D0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        androidx.activity.result.d dVarA = new androidx.activity.result.d.b(intentSender).b(intent2).c(i12, i11).a();
        this.C.addLast(new l(fragment.mWho, i10));
        if (D0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.A.b(dVarA);
    }

    void M() {
        S(5);
    }

    void N(boolean z10) {
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
            }
        }
    }

    void N0(Fragment fragment) {
        if (!this.f2655c.c(fragment.mWho)) {
            if (D0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2669q + "since it is not added to " + this);
                return;
            }
            return;
        }
        P0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f10 = fragment.mPostponedAlpha;
            if (f10 > 0.0f) {
                view.setAlpha(f10);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            androidx.fragment.app.f.d dVarB = androidx.fragment.app.f.b(this.f2670r.f(), fragment, true);
            if (dVarB != null) {
                Animation animation = dVarB.f2632a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    dVarB.f2633b.setTarget(fragment.mView);
                    dVarB.f2633b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            u(fragment);
        }
    }

    boolean O(Menu menu) {
        boolean z10 = false;
        if (this.f2669q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null && F0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    void O0(int i10, boolean z10) {
        androidx.fragment.app.k<?> kVar;
        if (this.f2670r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f2669q) {
            this.f2669q = i10;
            if (P) {
                this.f2655c.r();
            } else {
                Iterator<Fragment> it = this.f2655c.n().iterator();
                while (it.hasNext()) {
                    N0(it.next());
                }
                for (t tVar : this.f2655c.k()) {
                    Fragment fragmentK = tVar.k();
                    if (!fragmentK.mIsNewlyAdded) {
                        N0(fragmentK);
                    }
                    if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                        this.f2655c.q(tVar);
                    }
                }
            }
            m1();
            if (this.D && (kVar = this.f2670r) != null && this.f2669q == 7) {
                kVar.o();
                this.D = false;
            }
        }
    }

    void P() {
        n1();
        L(this.f2673u);
    }

    void P0(Fragment fragment) {
        Q0(fragment, this.f2669q);
    }

    void Q() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(7);
    }

    void R() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(5);
    }

    void R0() {
        if (this.f2670r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.o(false);
        for (Fragment fragment : this.f2655c.n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    void S0(t tVar) {
        Fragment fragmentK = tVar.k();
        if (fragmentK.mDeferStart) {
            if (this.f2654b) {
                this.H = true;
                return;
            }
            fragmentK.mDeferStart = false;
            if (P) {
                tVar.m();
            } else {
                P0(fragmentK);
            }
        }
    }

    void T() {
        this.F = true;
        this.M.o(true);
        S(4);
    }

    public void T0(int i10, int i11) {
        if (i10 >= 0) {
            Y(new o(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    void U() {
        S(2);
    }

    public boolean U0() {
        return V0(null, -1, 0);
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2655c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2657e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.f2657e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f2656d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f2656d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.p(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2661i.get());
        synchronized (this.f2653a) {
            int size3 = this.f2653a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    InterfaceC0046n interfaceC0046n = this.f2653a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(interfaceC0046n);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2670r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2671s);
        if (this.f2672t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2672t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2669q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    boolean W0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f2656d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2656d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f2656d.get(size2);
                    if ((str != null && str.equals(aVar.u())) || (i10 >= 0 && i10 == aVar.f2525v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f2656d.get(size2);
                        if (str == null || !str.equals(aVar2.u())) {
                            if (i10 < 0 || i10 != aVar2.f2525v) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f2656d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2656d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f2656d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    void Y(InterfaceC0046n interfaceC0046n, boolean z10) {
        if (!z10) {
            if (this.f2670r == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.f2653a) {
            if (this.f2670r == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f2653a.add(interfaceC0046n);
                g1();
            }
        }
    }

    void Y0(Fragment fragment, androidx.core.os.d dVar) {
        HashSet<androidx.core.os.d> hashSet = this.f2665m.get(fragment);
        if (hashSet != null && hashSet.remove(dVar) && hashSet.isEmpty()) {
            this.f2665m.remove(fragment);
            if (fragment.mState < 5) {
                w(fragment);
                P0(fragment);
            }
        }
    }

    void Z0(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            this.f2655c.s(fragment);
            if (E0(fragment)) {
                this.D = true;
            }
            fragment.mRemoving = true;
            k1(fragment);
        }
    }

    boolean a0(boolean z10) {
        Z(z10);
        boolean z11 = false;
        while (k0(this.I, this.J)) {
            z11 = true;
            this.f2654b = true;
            try {
                a1(this.I, this.J);
                q();
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        n1();
        V();
        this.f2655c.b();
        return z11;
    }

    void b0(InterfaceC0046n interfaceC0046n, boolean z10) {
        if (z10 && (this.f2670r == null || this.G)) {
            return;
        }
        Z(z10);
        if (interfaceC0046n.a(this.I, this.J)) {
            this.f2654b = true;
            try {
                a1(this.I, this.J);
                q();
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        n1();
        V();
        this.f2655c.b();
    }

    void b1(Fragment fragment) {
        this.M.n(fragment);
    }

    void d1(Parcelable parcelable) {
        t tVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.p pVar = (androidx.fragment.app.p) parcelable;
        if (pVar.f2702a == null) {
            return;
        }
        this.f2655c.t();
        for (s sVar : pVar.f2702a) {
            if (sVar != null) {
                Fragment fragmentH = this.M.h(sVar.f2719b);
                if (fragmentH != null) {
                    if (D0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentH);
                    }
                    tVar = new t(this.f2667o, this.f2655c, fragmentH, sVar);
                } else {
                    tVar = new t(this.f2667o, this.f2655c, this.f2670r.f().getClassLoader(), p0(), sVar);
                }
                Fragment fragmentK = tVar.k();
                fragmentK.mFragmentManager = this;
                if (D0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                tVar.o(this.f2670r.f().getClassLoader());
                this.f2655c.p(tVar);
                tVar.t(this.f2669q);
            }
        }
        for (Fragment fragment : this.M.k()) {
            if (!this.f2655c.c(fragment.mWho)) {
                if (D0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.f2702a);
                }
                this.M.n(fragment);
                fragment.mFragmentManager = this;
                t tVar2 = new t(this.f2667o, this.f2655c, fragment);
                tVar2.t(1);
                tVar2.m();
                fragment.mRemoving = true;
                tVar2.m();
            }
        }
        this.f2655c.u(pVar.f2703b);
        if (pVar.f2704c != null) {
            this.f2656d = new ArrayList<>(pVar.f2704c.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = pVar.f2704c;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarA = bVarArr[i10].a(this);
                if (D0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + aVarA.f2525v + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
                    aVarA.q("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2656d.add(aVarA);
                i10++;
            }
        } else {
            this.f2656d = null;
        }
        this.f2661i.set(pVar.f2705d);
        String str = pVar.f2706e;
        if (str != null) {
            Fragment fragmentF0 = f0(str);
            this.f2673u = fragmentF0;
            L(fragmentF0);
        }
        ArrayList<String> arrayList = pVar.f2707f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f2662j.put(arrayList.get(i11), pVar.f2708g.get(i11));
            }
        }
        this.C = new ArrayDeque<>(pVar.f2709h);
    }

    void e(androidx.fragment.app.a aVar) {
        if (this.f2656d == null) {
            this.f2656d = new ArrayList<>();
        }
        this.f2656d.add(aVar);
    }

    void f(Fragment fragment, androidx.core.os.d dVar) {
        if (this.f2665m.get(fragment) == null) {
            this.f2665m.put(fragment, new HashSet<>());
        }
        this.f2665m.get(fragment).add(dVar);
    }

    Fragment f0(String str) {
        return this.f2655c.f(str);
    }

    Parcelable f1() {
        int size;
        j0();
        X();
        a0(true);
        this.E = true;
        this.M.o(true);
        ArrayList<s> arrayListV = this.f2655c.v();
        androidx.fragment.app.b[] bVarArr = null;
        if (arrayListV.isEmpty()) {
            if (D0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> arrayListW = this.f2655c.w();
        ArrayList<androidx.fragment.app.a> arrayList = this.f2656d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new androidx.fragment.app.b(this.f2656d.get(i10));
                if (D0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f2656d.get(i10));
                }
            }
        }
        androidx.fragment.app.p pVar = new androidx.fragment.app.p();
        pVar.f2702a = arrayListV;
        pVar.f2703b = arrayListW;
        pVar.f2704c = bVarArr;
        pVar.f2705d = this.f2661i.get();
        Fragment fragment = this.f2673u;
        if (fragment != null) {
            pVar.f2706e = fragment.mWho;
        }
        pVar.f2707f.addAll(this.f2662j.keySet());
        pVar.f2708g.addAll(this.f2662j.values());
        pVar.f2709h = new ArrayList<>(this.C);
        return pVar;
    }

    void g(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        t tVarV = v(fragment);
        fragment.mFragmentManager = this;
        this.f2655c.p(tVarV);
        if (fragment.mDetached) {
            return;
        }
        this.f2655c.a(fragment);
        fragment.mRemoving = false;
        if (fragment.mView == null) {
            fragment.mHiddenChanged = false;
        }
        if (E0(fragment)) {
            this.D = true;
        }
    }

    public Fragment g0(int i10) {
        return this.f2655c.g(i10);
    }

    void g1() {
        synchronized (this.f2653a) {
            ArrayList<p> arrayList = this.L;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z11 = this.f2653a.size() == 1;
            if (z10 || z11) {
                this.f2670r.g().removeCallbacks(this.N);
                this.f2670r.g().post(this.N);
                n1();
            }
        }
    }

    public void h(r rVar) {
        this.f2668p.add(rVar);
    }

    public Fragment h0(String str) {
        return this.f2655c.h(str);
    }

    void h1(Fragment fragment, boolean z10) {
        ViewGroup viewGroupO0 = o0(fragment);
        if (viewGroupO0 == null || !(viewGroupO0 instanceof androidx.fragment.app.h)) {
            return;
        }
        ((androidx.fragment.app.h) viewGroupO0).setDrawDisappearingViewsLast(!z10);
    }

    void i(Fragment fragment) {
        this.M.f(fragment);
    }

    Fragment i0(String str) {
        return this.f2655c.i(str);
    }

    void i1(Fragment fragment, androidx.lifecycle.f.b bVar) {
        if (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    int j() {
        return this.f2661i.getAndIncrement();
    }

    void j1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f2673u;
            this.f2673u = fragment;
            L(fragment2);
            L(this.f2673u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void k(androidx.fragment.app.k<?> kVar, androidx.fragment.app.g gVar, Fragment fragment) {
        String str;
        androidx.lifecycle.j jVar;
        if (this.f2670r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2670r = kVar;
        this.f2671s = gVar;
        this.f2672t = fragment;
        if (fragment != null) {
            h(new i(fragment));
        } else if (kVar instanceof r) {
            h((r) kVar);
        }
        if (this.f2672t != null) {
            n1();
        }
        if (kVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) kVar;
            OnBackPressedDispatcher onBackPressedDispatcher = cVar.getOnBackPressedDispatcher();
            this.f2659g = onBackPressedDispatcher;
            if (fragment != null) {
                jVar = cVar;
                jVar = fragment;
            }
            jVar = cVar;
            onBackPressedDispatcher.a(jVar, this.f2660h);
        }
        if (fragment != null) {
            this.M = fragment.mFragmentManager.m0(fragment);
        } else if (kVar instanceof g0) {
            this.M = q.j(((g0) kVar).getViewModelStore());
        } else {
            this.M = new q(false);
        }
        this.M.o(I0());
        this.f2655c.x(this.M);
        Object obj = this.f2670r;
        if (obj instanceof androidx.activity.result.c) {
            ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.c) obj).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f2678z = activityResultRegistry.j(str2 + "StartActivityForResult", new f.c(), new j());
            this.A = activityResultRegistry.j(str2 + "StartIntentSenderForResult", new k(), new a());
            this.B = activityResultRegistry.j(str2 + "RequestPermissions", new f.b(), new b());
        }
    }

    void l(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f2655c.a(fragment);
            if (D0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (E0(fragment)) {
                this.D = true;
            }
        }
    }

    public int l0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f2656d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void l1(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public v m() {
        return new androidx.fragment.app.a(this);
    }

    androidx.fragment.app.g n0() {
        return this.f2671s;
    }

    boolean o() {
        boolean zE0 = false;
        for (Fragment fragment : this.f2655c.l()) {
            if (fragment != null) {
                zE0 = E0(fragment);
            }
            if (zE0) {
                return true;
            }
        }
        return false;
    }

    public androidx.fragment.app.j p0() {
        androidx.fragment.app.j jVar = this.f2674v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f2672t;
        return fragment != null ? fragment.mFragmentManager.p0() : this.f2675w;
    }

    u q0() {
        return this.f2655c;
    }

    public List<Fragment> r0() {
        return this.f2655c.n();
    }

    androidx.fragment.app.k<?> s0() {
        return this.f2670r;
    }

    void t(androidx.fragment.app.a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.s(z12);
        } else {
            aVar.r();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f2669q >= 1) {
            w.B(this.f2670r.f(), this.f2671s, arrayList, arrayList2, 0, 1, true, this.f2666n);
        }
        if (z12) {
            O0(this.f2669q, true);
        }
        for (Fragment fragment : this.f2655c.l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.v(fragment.mContainerId)) {
                float f10 = fragment.mPostponedAlpha;
                if (f10 > 0.0f) {
                    fragment.mView.setAlpha(f10);
                }
                if (z12) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    LayoutInflater.Factory2 t0() {
        return this.f2658f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f2672t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2672t)));
            sb2.append("}");
        } else {
            androidx.fragment.app.k<?> kVar = this.f2670r;
            if (kVar != null) {
                sb2.append(kVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2670r)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    androidx.fragment.app.m u0() {
        return this.f2667o;
    }

    t v(Fragment fragment) {
        t tVarM = this.f2655c.m(fragment.mWho);
        if (tVarM != null) {
            return tVarM;
        }
        t tVar = new t(this.f2667o, this.f2655c, fragment);
        tVar.o(this.f2670r.f().getClassLoader());
        tVar.t(this.f2669q);
        return tVar;
    }

    Fragment v0() {
        return this.f2672t;
    }

    public Fragment w0() {
        return this.f2673u;
    }

    void x(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (D0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f2655c.s(fragment);
            if (E0(fragment)) {
                this.D = true;
            }
            k1(fragment);
        }
    }

    c0 x0() {
        c0 c0Var = this.f2676x;
        if (c0Var != null) {
            return c0Var;
        }
        Fragment fragment = this.f2672t;
        return fragment != null ? fragment.mFragmentManager.x0() : this.f2677y;
    }

    void y() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(4);
    }

    void z() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(0);
    }

    f0 z0(Fragment fragment) {
        return this.M.l(fragment);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:98:0x015b  */
    void Q0(Fragment fragment, int i10) {
        ViewGroup viewGroup;
        t tVarM = this.f2655c.m(fragment.mWho);
        int i11 = 1;
        if (tVarM == null) {
            tVarM = new t(this.f2667o, this.f2655c, fragment);
            tVarM.t(1);
        }
        if (fragment.mFromLayout && fragment.mInLayout && fragment.mState == 2) {
            i10 = Math.max(i10, 2);
        }
        int iMin = Math.min(i10, tVarM.d());
        int i12 = fragment.mState;
        String str = OgqfiHA.jkShwmskUqag;
        if (i12 <= iMin) {
            if (i12 < iMin && !this.f2665m.isEmpty()) {
                n(fragment);
            }
            int i13 = fragment.mState;
            if (i13 != -1) {
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 4) {
                                if (i13 == 5) {
                                }
                            }
                            if (iMin > 5) {
                                tVarM.p();
                            }
                        }
                        if (iMin > 4) {
                            tVarM.u();
                        }
                        if (iMin > 5) {
                            tVarM.p();
                        }
                    }
                    if (iMin > 2) {
                        tVarM.a();
                    }
                    if (iMin > 4) {
                        tVarM.u();
                    }
                    if (iMin > 5) {
                        tVarM.p();
                    }
                }
                if (iMin > -1) {
                    tVarM.j();
                }
                if (iMin > 1) {
                    tVarM.f();
                }
                if (iMin > 2) {
                    tVarM.a();
                }
                if (iMin > 4) {
                    tVarM.u();
                }
                if (iMin > 5) {
                    tVarM.p();
                }
            } else if (iMin > -1) {
                tVarM.c();
            }
            if (iMin > 0) {
                tVarM.e();
            }
            if (iMin > -1) {
                tVarM.j();
            }
            if (iMin > 1) {
                tVarM.f();
            }
            if (iMin > 2) {
                tVarM.a();
            }
            if (iMin > 4) {
                tVarM.u();
            }
            if (iMin > 5) {
                tVarM.p();
            }
        } else if (i12 > iMin) {
            if (i12 == 0) {
                i11 = iMin;
                if (i11 < 0) {
                    tVarM.i();
                }
                iMin = i11;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                if (i12 == 7) {
                                    if (iMin < 7) {
                                        tVarM.n();
                                    }
                                }
                            }
                            if (iMin < 5) {
                                tVarM.v();
                            }
                        }
                        if (iMin < 4) {
                            if (D0(3)) {
                                Log.d(str, "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mView != null && this.f2670r.k(fragment) && fragment.mSavedViewState == null) {
                                tVarM.s();
                            }
                        }
                    }
                    if (iMin < 2) {
                        View view = fragment.mView;
                        if (view != null && (viewGroup = fragment.mContainer) != null) {
                            viewGroup.endViewTransition(view);
                            fragment.mView.clearAnimation();
                            if (!fragment.isRemovingParent()) {
                                androidx.fragment.app.f.d dVarB = (this.f2669q <= -1 || this.G || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) ? null : androidx.fragment.app.f.b(this.f2670r.f(), fragment, false);
                                fragment.mPostponedAlpha = 0.0f;
                                ViewGroup viewGroup2 = fragment.mContainer;
                                View view2 = fragment.mView;
                                if (dVarB != null) {
                                    androidx.fragment.app.f.a(fragment, dVarB, this.f2666n);
                                }
                                viewGroup2.removeView(view2);
                                if (D0(2)) {
                                    Log.v(str, "Removing view " + view2 + " for fragment " + fragment + " from container " + viewGroup2);
                                }
                                if (viewGroup2 != fragment.mContainer) {
                                    return;
                                }
                            }
                        }
                        if (this.f2665m.get(fragment) == null) {
                            tVarM.h();
                        }
                    }
                }
                if (iMin >= 1) {
                    i11 = iMin;
                } else if (this.f2665m.get(fragment) == null) {
                    tVarM.g();
                    i11 = iMin;
                }
                if (i11 < 0) {
                    tVarM.i();
                }
                iMin = i11;
            }
        }
        if (fragment.mState != iMin) {
            if (D0(3)) {
                Log.d(str, "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + iMin + " found " + fragment.mState);
            }
            fragment.mState = iMin;
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    /* JADX INFO: loaded from: classes.dex */
    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f2693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2694b;

        /* JADX INFO: compiled from: FragmentManager.java */
        class a implements Parcelable.Creator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        l(String str, int i10) {
            this.f2693a = str;
            this.f2694b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2693a);
            parcel.writeInt(this.f2694b);
        }

        l(Parcel parcel) {
            this.f2693a = parcel.readString();
            this.f2694b = parcel.readInt();
        }
    }
}
