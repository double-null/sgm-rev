package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.m0;
import androidx.core.view.s2;
import androidx.core.view.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes.dex */
class c extends b0 {

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2571a;

        static {
            int[] iArr = new int[b0.e.c.values().length];
            f2571a = iArr;
            try {
                iArr[b0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2571a[b0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2571a[b0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2571a[b0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f2572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0.e f2573b;

        b(List list, b0.e eVar) {
            this.f2572a = list;
            this.f2573b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2572a.contains(this.f2573b)) {
                this.f2572a.remove(this.f2573b);
                c.this.s(this.f2573b);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class C0044c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0.e f2578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f2579e;

        C0044c(ViewGroup viewGroup, View view, boolean z10, b0.e eVar, k kVar) {
            this.f2575a = viewGroup;
            this.f2576b = view;
            this.f2577c = z10;
            this.f2578d = eVar;
            this.f2579e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2575a.endViewTransition(this.f2576b);
            if (this.f2577c) {
                this.f2578d.e().b(this.f2576b);
            }
            this.f2579e.a();
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class d implements androidx.core.os.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f2581a;

        d(Animator animator) {
            this.f2581a = animator;
        }

        @Override // androidx.core.os.d.a
        public void onCancel() {
            this.f2581a.end();
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class f implements androidx.core.os.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f2590c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f2588a = view;
            this.f2589b = viewGroup;
            this.f2590c = kVar;
        }

        @Override // androidx.core.os.d.a
        public void onCancel() {
            this.f2588a.clearAnimation();
            this.f2589b.endViewTransition(this.f2588a);
            this.f2590c.a();
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0.e f2592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0.e f2593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f2595d;

        g(b0.e eVar, b0.e eVar2, boolean z10, androidx.collection.a aVar) {
            this.f2592a = eVar;
            this.f2593b = eVar2;
            this.f2594c = z10;
            this.f2595d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f2592a.f(), this.f2593b.f(), this.f2594c, this.f2595d, false);
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f2597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f2599c;

        h(y yVar, View view, Rect rect) {
            this.f2597a = yVar;
            this.f2598b = view;
            this.f2599c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2597a.k(this.f2598b, this.f2599c);
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f2601a;

        i(ArrayList arrayList) {
            this.f2601a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f2601a, 4);
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f2603a;

        j(m mVar) {
            this.f2603a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2603a.a();
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    private static class k extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.fragment.app.f.d f2606d;

        k(b0.e eVar, androidx.core.os.d dVar) {
            super(eVar, dVar);
            this.f2605c = false;
        }

        androidx.fragment.app.f.d e(Context context) {
            if (this.f2605c) {
                return this.f2606d;
            }
            androidx.fragment.app.f.d dVarB = androidx.fragment.app.f.b(context, b().f(), b().e() == b0.e.c.VISIBLE);
            this.f2606d = dVarB;
            this.f2605c = true;
            return dVarB;
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    private static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0.e f2607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.os.d f2608b;

        l(b0.e eVar, androidx.core.os.d dVar) {
            this.f2607a = eVar;
            this.f2608b = dVar;
        }

        void a() {
            this.f2607a.d(this.f2608b);
        }

        b0.e b() {
            return this.f2607a;
        }

        androidx.core.os.d c() {
            return this.f2608b;
        }

        boolean d() {
            b0.e.c cVar;
            b0.e.c cVarE = b0.e.c.e(this.f2607a.f().mView);
            b0.e.c cVarE2 = this.f2607a.e();
            return cVarE == cVarE2 || !(cVarE == (cVar = b0.e.c.VISIBLE) || cVarE2 == cVar);
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    private static class m extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f2609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f2610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f2611e;

        m(b0.e eVar, androidx.core.os.d dVar, boolean z10, boolean z11) {
            super(eVar, dVar);
            if (eVar.e() == b0.e.c.VISIBLE) {
                this.f2609c = z10 ? eVar.f().getReenterTransition() : eVar.f().getEnterTransition();
                this.f2610d = z10 ? eVar.f().getAllowReturnTransitionOverlap() : eVar.f().getAllowEnterTransitionOverlap();
            } else {
                this.f2609c = z10 ? eVar.f().getReturnTransition() : eVar.f().getExitTransition();
                this.f2610d = true;
            }
            if (!z11) {
                this.f2611e = null;
            } else if (z10) {
                this.f2611e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.f2611e = eVar.f().getSharedElementEnterTransition();
            }
        }

        private y f(Object obj) {
            if (obj == null) {
                return null;
            }
            y yVar = w.f2770b;
            if (yVar != null && yVar.e(obj)) {
                return yVar;
            }
            y yVar2 = w.f2771c;
            if (yVar2 != null && yVar2.e(obj)) {
                return yVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        y e() {
            y yVarF = f(this.f2609c);
            y yVarF2 = f(this.f2611e);
            if (yVarF == null || yVarF2 == null || yVarF == yVarF2) {
                return yVarF != null ? yVarF : yVarF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f2609c + " which uses a different Transition  type than its shared element transition " + this.f2611e);
        }

        public Object g() {
            return this.f2611e;
        }

        Object h() {
            return this.f2609c;
        }

        public boolean i() {
            return this.f2611e != null;
        }

        boolean j() {
            return this.f2610d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<b0.e> list2, boolean z10, Map<b0.e, Boolean> map) {
        ViewGroup viewGroupM = m();
        Context context = viewGroupM.getContext();
        ArrayList<k> arrayList = new ArrayList();
        boolean z11 = false;
        for (k kVar : list) {
            if (kVar.d()) {
                kVar.a();
            } else {
                androidx.fragment.app.f.d dVarE = kVar.e(context);
                if (dVarE == null) {
                    kVar.a();
                } else {
                    Animator animator = dVarE.f2633b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        b0.e eVarB = kVar.b();
                        Fragment fragmentF = eVarB.f();
                        if (Boolean.TRUE.equals(map.get(eVarB))) {
                            if (n.D0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                            }
                            kVar.a();
                        } else {
                            boolean z12 = eVarB.e() == b0.e.c.GONE;
                            if (z12) {
                                list2.remove(eVarB);
                            }
                            View view = fragmentF.mView;
                            viewGroupM.startViewTransition(view);
                            animator.addListener(new C0044c(viewGroupM, view, z12, eVarB, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.c().c(new d(animator));
                            z11 = true;
                        }
                    }
                }
            }
        }
        for (k kVar2 : arrayList) {
            b0.e eVarB2 = kVar2.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z10) {
                if (n.D0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentF2 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.a();
            } else if (z11) {
                if (n.D0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragmentF2 + " as Animations cannot run alongside Animators.");
                }
                kVar2.a();
            } else {
                View view2 = fragmentF2.mView;
                Animation animation = (Animation) w.h.c(((androidx.fragment.app.f.d) w.h.c(kVar2.e(context))).f2632a);
                if (eVarB2.e() != b0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    viewGroupM.startViewTransition(view2);
                    androidx.fragment.app.f.e eVar = new androidx.fragment.app.f.e(animation, viewGroupM, view2);
                    eVar.setAnimationListener(new e(viewGroupM, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(view2, viewGroupM, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<b0.e, Boolean> x(List<m> list, boolean z10, b0.e eVar, b0.e eVar2) {
        View view;
        Object obj;
        b0.e eVar3;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        b0.e eVar4;
        View view2;
        ArrayList<View> arrayList3;
        b0.e eVar5;
        b0.e eVar6;
        View view3;
        b0.e eVar7 = eVar;
        b0.e eVar8 = eVar2;
        HashMap map = new HashMap();
        y yVar = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                y yVarE = mVar.e();
                if (yVar == null) {
                    yVar = yVarE;
                } else if (yVarE != null && yVar != yVarE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (yVar == null) {
            for (m mVar2 : list) {
                map.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map;
        }
        View view4 = new View(m().getContext());
        Rect rect = new Rect();
        ArrayList<View> arrayList4 = new ArrayList<>();
        ArrayList<View> arrayList5 = new ArrayList<>();
        androidx.collection.a aVar = new androidx.collection.a();
        Object obj3 = null;
        View view5 = null;
        boolean z11 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                arrayList3 = arrayList5;
                eVar5 = eVar7;
                eVar6 = eVar8;
                view5 = view5;
            } else {
                Object objB = yVar.B(yVar.g(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view6 = view5;
                int i10 = 0;
                while (i10 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                    ArrayList<String> arrayList6 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i10));
                    }
                    i10++;
                    sharedElementTargetNames = arrayList6;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (z10 == 0) {
                    eVar.f().getExitTransitionCallback();
                    eVar2.f().getEnterTransitionCallback();
                } else {
                    eVar.f().getEnterTransitionCallback();
                    eVar2.f().getExitTransitionCallback();
                }
                int i11 = 0;
                for (int size = sharedElementSourceNames.size(); i11 < size; size = size) {
                    aVar.put(sharedElementSourceNames.get(i11), sharedElementTargetNames2.get(i11));
                    i11++;
                }
                androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
                u(aVar2, eVar.f().mView);
                aVar2.p(sharedElementSourceNames);
                aVar.p(aVar2.keySet());
                androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
                u(aVar3, eVar2.f().mView);
                aVar3.p(sharedElementTargetNames2);
                aVar3.p(aVar.values());
                w.x(aVar, aVar3);
                v(aVar2, aVar.keySet());
                v(aVar3, aVar.values());
                if (aVar.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    arrayList3 = arrayList5;
                    eVar5 = eVar7;
                    view5 = view6;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    w.f(eVar2.f(), eVar.f(), z10, aVar2, true);
                    ArrayList<View> arrayList7 = arrayList5;
                    m0.a(m(), new g(eVar2, eVar, z10, aVar3));
                    Iterator<View> it = aVar2.values().iterator();
                    while (it.hasNext()) {
                        t(arrayList4, it.next());
                    }
                    if (sharedElementSourceNames.isEmpty()) {
                        view5 = view6;
                    } else {
                        View view7 = (View) aVar2.get(sharedElementSourceNames.get(0));
                        yVar.v(objB, view7);
                        view5 = view7;
                    }
                    Iterator<View> it2 = aVar3.values().iterator();
                    while (it2.hasNext()) {
                        t(arrayList7, it2.next());
                    }
                    arrayList3 = arrayList7;
                    if (!sharedElementTargetNames2.isEmpty() && (view3 = (View) aVar3.get(sharedElementTargetNames2.get(0))) != null) {
                        m0.a(m(), new h(yVar, view3, rect));
                        z11 = true;
                    }
                    yVar.z(objB, view4, arrayList4);
                    yVar.t(objB, null, null, null, null, objB, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    map.put(eVar5, bool);
                    eVar6 = eVar2;
                    map.put(eVar6, bool);
                    obj3 = objB;
                }
            }
            eVar7 = eVar5;
            arrayList4 = arrayList4;
            rect = rect;
            view4 = view4;
            eVar8 = eVar6;
            aVar = aVar;
            arrayList5 = arrayList3;
            yVar = yVar;
        }
        View view8 = view5;
        androidx.collection.a aVar4 = aVar;
        ArrayList<View> arrayList8 = arrayList5;
        b0.e eVar9 = eVar7;
        ArrayList<View> arrayList9 = arrayList4;
        Rect rect2 = rect;
        View view9 = view4;
        y yVar2 = yVar;
        boolean z12 = false;
        b0.e eVar10 = eVar8;
        ArrayList arrayList10 = new ArrayList();
        Object objN = null;
        Object objN2 = null;
        for (m mVar4 : list) {
            if (mVar4.d()) {
                map.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object objG = yVar2.g(mVar4.h());
                b0.e eVarB = mVar4.b();
                boolean z13 = (obj3 == null || !(eVarB == eVar9 || eVarB == eVar10)) ? z12 : true;
                if (objG == null) {
                    if (!z13) {
                        map.put(eVarB, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList8;
                    arrayList = arrayList9;
                    view = view9;
                    eVar4 = eVar10;
                    view2 = view8;
                } else {
                    ArrayList<View> arrayList11 = new ArrayList<>();
                    Object obj4 = objN;
                    t(arrayList11, eVarB.f().mView);
                    if (z13) {
                        if (eVarB == eVar9) {
                            arrayList11.removeAll(arrayList9);
                        } else {
                            arrayList11.removeAll(arrayList8);
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        yVar2.a(objG, view9);
                        arrayList2 = arrayList8;
                        arrayList = arrayList9;
                        view = view9;
                        obj2 = objN2;
                        eVar4 = eVar10;
                        obj = obj4;
                        eVar3 = eVarB;
                    } else {
                        yVar2.b(objG, arrayList11);
                        view = view9;
                        obj = obj4;
                        eVar3 = eVarB;
                        arrayList = arrayList9;
                        obj2 = objN2;
                        arrayList2 = arrayList8;
                        eVar4 = eVar10;
                        yVar2.t(objG, objG, arrayList11, null, null, null, null);
                        if (eVar3.e() == b0.e.c.GONE) {
                            yVar2.r(objG, eVar3.f().mView, arrayList11);
                            m0.a(m(), new i(arrayList11));
                        }
                    }
                    if (eVar3.e() == b0.e.c.VISIBLE) {
                        arrayList10.addAll(arrayList11);
                        if (z11) {
                            yVar2.u(objG, rect2);
                        }
                        view2 = view8;
                    } else {
                        view2 = view8;
                        yVar2.v(objG, view2);
                    }
                    map.put(eVar3, Boolean.TRUE);
                    if (mVar4.j()) {
                        objN2 = yVar2.n(obj2, objG, null);
                        objN = obj;
                    } else {
                        objN = yVar2.n(obj, objG, null);
                        objN2 = obj2;
                    }
                }
                eVar10 = eVar4;
                view8 = view2;
                view9 = view;
                arrayList9 = arrayList;
                arrayList8 = arrayList2;
                z12 = false;
            }
        }
        ArrayList<View> arrayList12 = arrayList8;
        ArrayList<View> arrayList13 = arrayList9;
        b0.e eVar11 = eVar10;
        Object objM = yVar2.m(objN2, objN, obj3);
        for (m mVar5 : list) {
            if (!mVar5.d()) {
                Object objH = mVar5.h();
                b0.e eVarB2 = mVar5.b();
                boolean z14 = obj3 != null && (eVarB2 == eVar9 || eVarB2 == eVar11);
                if (objH != null || z14) {
                    yVar2.w(mVar5.b().f(), objM, mVar5.c(), new j(mVar5));
                }
            }
        }
        w.A(arrayList10, 4);
        ArrayList<String> arrayListO = yVar2.o(arrayList12);
        yVar2.c(m(), objM);
        yVar2.y(m(), arrayList13, arrayList12, arrayListO, aVar4);
        w.A(arrayList10, 0);
        yVar2.A(obj3, arrayList13, arrayList12);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    @Override // androidx.fragment.app.b0
    void f(List<b0.e> list, boolean z10) {
        b0.e eVar = null;
        b0.e eVar2 = null;
        for (b0.e eVar3 : list) {
            b0.e.c cVarE = b0.e.c.e(eVar3.f().mView);
            int i10 = a.f2571a[eVar3.e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (cVarE == b0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i10 == 4 && cVarE != b0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (b0.e eVar4 : list) {
            androidx.core.os.d dVar = new androidx.core.os.d();
            eVar4.j(dVar);
            arrayList.add(new k(eVar4, dVar));
            androidx.core.os.d dVar2 = new androidx.core.os.d();
            eVar4.j(dVar2);
            boolean z11 = false;
            if (z10) {
                if (eVar4 == eVar) {
                    z11 = true;
                }
            } else if (eVar4 == eVar2) {
                z11 = true;
            }
            arrayList2.add(new m(eVar4, dVar2, z10, z11));
            eVar4.a(new b(arrayList3, eVar4));
        }
        Map<b0.e, Boolean> mapX = x(arrayList2, z10, eVar, eVar2);
        w(arrayList, arrayList3, mapX.containsValue(Boolean.TRUE), mapX);
        Iterator<b0.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        arrayList3.clear();
    }

    void s(b0.e eVar) {
        eVar.e().b(eVar.f().mView);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (s2.a(viewGroup)) {
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map<String, View> map, View view) {
        String strS = z0.s(view);
        if (strS != null) {
            map.put(strS, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(z0.s(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f2585c;

        /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f2583a.endViewTransition(eVar.f2584b);
                e.this.f2585c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f2583a = viewGroup;
            this.f2584b = view;
            this.f2585c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2583a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
