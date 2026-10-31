package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m0;
import androidx.core.view.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: FragmentTransition.java */
/* JADX INFO: loaded from: classes.dex */
class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f2769a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final y f2770b = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final y f2771c = w();

    /* JADX INFO: compiled from: FragmentTransition.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f2772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f2773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.d f2774c;

        a(g gVar, Fragment fragment, androidx.core.os.d dVar) {
            this.f2772a = gVar;
            this.f2773b = fragment;
            this.f2774c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2772a.a(this.f2773b, this.f2774c);
        }
    }

    /* JADX INFO: compiled from: FragmentTransition.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f2775a;

        b(ArrayList arrayList) {
            this.f2775a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f2775a, 4);
        }
    }

    /* JADX INFO: compiled from: FragmentTransition.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f2776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f2777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.d f2778c;

        c(g gVar, Fragment fragment, androidx.core.os.d dVar) {
            this.f2776a = gVar;
            this.f2777b = fragment;
            this.f2778c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2776a.a(this.f2777b, this.f2778c);
        }
    }

    /* JADX INFO: compiled from: FragmentTransition.java */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f2780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f2782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f2783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f2784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f2785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f2786h;

        d(Object obj, y yVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2779a = obj;
            this.f2780b = yVar;
            this.f2781c = view;
            this.f2782d = fragment;
            this.f2783e = arrayList;
            this.f2784f = arrayList2;
            this.f2785g = arrayList3;
            this.f2786h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2779a;
            if (obj != null) {
                this.f2780b.p(obj, this.f2781c);
                this.f2784f.addAll(w.k(this.f2780b, this.f2779a, this.f2782d, this.f2783e, this.f2781c));
            }
            if (this.f2785g != null) {
                if (this.f2786h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f2781c);
                    this.f2780b.q(this.f2786h, this.f2785g, arrayList);
                }
                this.f2785g.clear();
                this.f2785g.add(this.f2781c);
            }
        }
    }

    /* JADX INFO: compiled from: FragmentTransition.java */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f2787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f2788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f2790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f2791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y f2792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Rect f2793g;

        e(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a aVar, View view, y yVar, Rect rect) {
            this.f2787a = fragment;
            this.f2788b = fragment2;
            this.f2789c = z10;
            this.f2790d = aVar;
            this.f2791e = view;
            this.f2792f = yVar;
            this.f2793g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f2787a, this.f2788b, this.f2789c, this.f2790d, false);
            View view = this.f2791e;
            if (view != null) {
                this.f2792f.k(view, this.f2793g);
            }
        }
    }

    /* JADX INFO: compiled from: FragmentTransition.java */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f2794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f2795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f2796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f2797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f2798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f2799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f2800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Fragment f2801h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f2802i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f2803j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f2804k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Rect f2805l;

        f(y yVar, androidx.collection.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2794a = yVar;
            this.f2795b = aVar;
            this.f2796c = obj;
            this.f2797d = hVar;
            this.f2798e = arrayList;
            this.f2799f = view;
            this.f2800g = fragment;
            this.f2801h = fragment2;
            this.f2802i = z10;
            this.f2803j = arrayList2;
            this.f2804k = obj2;
            this.f2805l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.collection.a<String, View> aVarH = w.h(this.f2794a, this.f2795b, this.f2796c, this.f2797d);
            if (aVarH != null) {
                this.f2798e.addAll(aVarH.values());
                this.f2798e.add(this.f2799f);
            }
            w.f(this.f2800g, this.f2801h, this.f2802i, aVarH, false);
            Object obj = this.f2796c;
            if (obj != null) {
                this.f2794a.A(obj, this.f2803j, this.f2798e);
                View viewS = w.s(aVarH, this.f2797d, this.f2804k, this.f2802i);
                if (viewS != null) {
                    this.f2794a.k(viewS, this.f2805l);
                }
            }
        }
    }

    /* JADX INFO: compiled from: FragmentTransition.java */
    interface g {
        void a(Fragment fragment, androidx.core.os.d dVar);

        void b(Fragment fragment, androidx.core.os.d dVar);
    }

    /* JADX INFO: compiled from: FragmentTransition.java */
    static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Fragment f2806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f2808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Fragment f2809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f2811f;

        h() {
        }
    }

    static void A(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    static void B(Context context, androidx.fragment.app.g gVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                e(aVar, sparseArray, z10);
            } else {
                c(aVar, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = sparseArray.keyAt(i13);
                androidx.collection.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (gVar.d() && (viewGroup = (ViewGroup) gVar.c(iKeyAt)) != null) {
                    if (z10) {
                        o(viewGroup, hVar, view, aVarD, gVar2);
                    } else {
                        n(viewGroup, hVar, view, aVarD, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, androidx.collection.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewN = aVar.n(size);
            if (collection.contains(z0.s(viewN))) {
                arrayList.add(viewN);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0058  */
    /* JADX WARN: Code duplicated, block: B:55:0x006f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0071  */
    /* JADX WARN: Code duplicated, block: B:63:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0082  */
    /* JADX WARN: Code duplicated, block: B:65:0x0085  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d  */
    /* JADX WARN: Code duplicated, block: B:70:0x008f  */
    private static void b(androidx.fragment.app.a aVar, v.a aVar2, SparseArray<h> sparseArray, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        View view;
        boolean z15;
        Fragment fragment = aVar2.f2762b;
        if (fragment == null || (i10 = fragment.mContainerId) == 0) {
            return;
        }
        int i11 = z10 ? f2769a[aVar2.f2761a] : aVar2.f2761a;
        boolean z16 = false;
        boolean z17 = true;
        if (i11 == 1) {
            if (z11) {
                z12 = fragment.mIsNewlyAdded;
            } else if (!fragment.mAdded || fragment.mHidden) {
                z12 = false;
            } else {
                z12 = true;
            }
            z13 = false;
            z16 = z12;
            z14 = false;
        } else if (i11 == 3) {
            if (z11 ? !fragment.mAdded || fragment.mHidden : fragment.mAdded || (view = fragment.mView) == null || view.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) {
                z15 = false;
            } else {
                z15 = true;
            }
            z13 = z15;
            z14 = true;
            z17 = false;
        } else if (i11 == 4) {
            if (!z11 ? !(!fragment.mAdded || fragment.mHidden) : fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden) {
                z15 = false;
            } else {
                z15 = true;
            }
            z13 = z15;
            z14 = true;
            z17 = false;
        } else if (i11 == 5) {
            if (!z11) {
                z12 = fragment.mHidden;
            } else if (fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = false;
            z16 = z12;
            z14 = false;
        } else if (i11 == 6) {
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            z13 = z15;
            z14 = true;
            z17 = false;
        } else if (i11 != 7) {
            z14 = false;
            z17 = false;
            z13 = false;
        } else {
            if (z11) {
                z12 = fragment.mIsNewlyAdded;
            } else {
                if (fragment.mAdded) {
                }
                z12 = false;
            }
            z13 = false;
            z16 = z12;
            z14 = false;
        }
        h hVarP = sparseArray.get(i10);
        if (z16) {
            hVarP = p(hVarP, sparseArray, i10);
            hVarP.f2806a = fragment;
            hVarP.f2807b = z10;
            hVarP.f2808c = aVar;
        }
        if (!z11 && z17) {
            if (hVarP != null && hVarP.f2809d == fragment) {
                hVarP.f2809d = null;
            }
            if (!aVar.f2759r) {
                n nVar = aVar.f2523t;
                nVar.q0().p(nVar.v(fragment));
                nVar.P0(fragment);
            }
        }
        if (z13 && (hVarP == null || hVarP.f2809d == null)) {
            hVarP = p(hVarP, sparseArray, i10);
            hVarP.f2809d = fragment;
            hVarP.f2810e = z10;
            hVarP.f2811f = aVar;
        }
        if (z11 || !z14 || hVarP == null || hVarP.f2806a != fragment) {
            return;
        }
        hVarP.f2806a = null;
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        int size = aVar.f2744c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, aVar.f2744c.get(i10), sparseArray, false, z10);
        }
    }

    private static androidx.collection.a<String, String> d(int i10, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        androidx.collection.a<String, String> aVar = new androidx.collection.a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i13);
            if (aVar2.v(i10)) {
                boolean zBooleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2757p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.f2757p;
                        arrayList4 = aVar2.f2758q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f2757p;
                        arrayList3 = aVar2.f2758q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        if (aVar.f2523t.n0().d()) {
            for (int size = aVar.f2744c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f2744c.get(size), sparseArray, true, z10);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private static boolean g(y yVar, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!yVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static androidx.collection.a<String, View> h(y yVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f2806a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        yVar.j(aVar2, view);
        androidx.fragment.app.a aVar3 = hVar.f2808c;
        if (hVar.f2807b) {
            fragment.getExitTransitionCallback();
            arrayList = aVar3.f2757p;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = aVar3.f2758q;
        }
        if (arrayList != null) {
            aVar2.p(arrayList);
            aVar2.p(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static androidx.collection.a<String, View> i(y yVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2809d;
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        yVar.j(aVar2, fragment.requireView());
        androidx.fragment.app.a aVar3 = hVar.f2811f;
        if (hVar.f2810e) {
            fragment.getEnterTransitionCallback();
            arrayList = aVar3.f2758q;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = aVar3.f2757p;
        }
        if (arrayList != null) {
            aVar2.p(arrayList);
        }
        aVar.p(aVar2.keySet());
        return aVar2;
    }

    private static y j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        y yVar = f2770b;
        if (yVar != null && g(yVar, arrayList)) {
            return yVar;
        }
        y yVar2 = f2771c;
        if (yVar2 != null && g(yVar2, arrayList)) {
            return yVar2;
        }
        if (yVar == null && yVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(y yVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            yVar.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        yVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(y yVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f2806a;
        Fragment fragment2 = hVar.f2809d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f2807b;
        Object objT = aVar.isEmpty() ? null : t(yVar, fragment, fragment2, z10);
        androidx.collection.a<String, View> aVarI = i(yVar, aVar, objT, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            yVar.z(obj3, view, arrayList);
            z(yVar, obj3, obj2, aVarI, hVar.f2810e, hVar.f2811f);
            if (obj != null) {
                yVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        m0.a(viewGroup, new f(yVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(y yVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f2806a;
        Fragment fragment2 = hVar.f2809d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f2807b;
        Object objT = aVar.isEmpty() ? null : t(yVar, fragment, fragment2, z10);
        androidx.collection.a<String, View> aVarI = i(yVar, aVar, objT, hVar);
        androidx.collection.a<String, View> aVarH = h(yVar, aVar, objT, hVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            yVar.z(obj3, view, arrayList);
            z(yVar, obj3, obj2, aVarI, hVar.f2810e, hVar.f2811f);
            Rect rect2 = new Rect();
            View viewS = s(aVarH, hVar, obj, z10);
            if (viewS != null) {
                yVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        m0.a(viewGroup, new e(fragment, fragment2, z10, aVarH, view2, yVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f2806a;
        Fragment fragment2 = hVar.f2809d;
        y yVarJ = j(fragment2, fragment);
        if (yVarJ == null) {
            return;
        }
        boolean z10 = hVar.f2807b;
        boolean z11 = hVar.f2810e;
        Object objQ = q(yVarJ, fragment, z10);
        Object objR = r(yVarJ, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(yVarJ, viewGroup, view, aVar, hVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(yVarJ, obj, fragment2, arrayList, view);
        if (arrayListK == null || arrayListK.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        yVarJ.a(objQ, view);
        Object objU = u(yVarJ, objQ, obj2, objL, fragment, hVar.f2807b);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList.size() > 0)) {
            androidx.core.os.d dVar = new androidx.core.os.d();
            gVar.b(fragment2, dVar);
            yVarJ.w(fragment2, objU, dVar, new c(gVar, fragment2, dVar));
        }
        if (objU != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            yVarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(yVarJ, viewGroup, fragment, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            yVarJ.x(viewGroup, arrayList2, aVar);
            yVarJ.c(viewGroup, objU);
            yVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f2806a;
        Fragment fragment2 = hVar.f2809d;
        y yVarJ = j(fragment2, fragment);
        if (yVarJ == null) {
            return;
        }
        boolean z10 = hVar.f2807b;
        boolean z11 = hVar.f2810e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objQ = q(yVarJ, fragment, z10);
        Object objR = r(yVarJ, fragment2, z11);
        Object objM = m(yVarJ, viewGroup, view, aVar, hVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(yVarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(yVarJ, objQ, fragment, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(yVarJ, objQ, obj, objM, fragment, z10);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList2.size() > 0)) {
            androidx.core.os.d dVar = new androidx.core.os.d();
            gVar.b(fragment2, dVar);
            yVarJ.w(fragment2, objU, dVar, new a(gVar, fragment2, dVar));
        }
        if (objU != null) {
            v(yVarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = yVarJ.o(arrayList);
            yVarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            yVarJ.c(viewGroup, objU);
            yVarJ.y(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            A(arrayListK2, 0);
            yVarJ.A(objM, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i10, hVar2);
        return hVar2;
    }

    private static Object q(y yVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z10 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    private static Object r(y yVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z10 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    static View s(androidx.collection.a<String, View> aVar, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.f2808c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2757p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get(z10 ? aVar2.f2757p.get(0) : aVar2.f2758q.get(0));
    }

    private static Object t(y yVar, Fragment fragment, Fragment fragment2, boolean z10) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return yVar.B(yVar.g(z10 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    private static Object u(y yVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        boolean allowReturnTransitionOverlap;
        if (obj == null || obj2 == null || fragment == null) {
            allowReturnTransitionOverlap = true;
        } else {
            allowReturnTransitionOverlap = z10 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        return allowReturnTransitionOverlap ? yVar.n(obj2, obj, obj3) : yVar.m(obj2, obj, obj3);
    }

    private static void v(y yVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            yVar.r(obj, fragment.getView(), arrayList);
            m0.a(fragment.mContainer, new b(arrayList));
        }
    }

    private static y w() {
        try {
            return (y) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void x(androidx.collection.a<String, String> aVar, androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.n(size))) {
                aVar.l(size);
            }
        }
    }

    private static void y(y yVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        m0.a(viewGroup, new d(obj, yVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(y yVar, Object obj, Object obj2, androidx.collection.a<String, View> aVar, boolean z10, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f2757p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get(z10 ? aVar2.f2758q.get(0) : aVar2.f2757p.get(0));
        yVar.v(obj, view);
        if (obj2 != null) {
            yVar.v(obj2, view);
        }
    }
}
