package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: BackStackRecord.java */
/* JADX INFO: loaded from: classes.dex */
final class a extends v implements n.InterfaceC0046n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final n f2523t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f2524u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f2525v;

    a(n nVar) {
        super(nVar.p0(), nVar.s0() != null ? nVar.s0().f().getClassLoader() : null);
        this.f2525v = -1;
        this.f2523t = nVar;
    }

    private static boolean x(v.a aVar) {
        Fragment fragment = aVar.f2762b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    void A(Fragment.k kVar) {
        for (int i10 = 0; i10 < this.f2744c.size(); i10++) {
            v.a aVar = this.f2744c.get(i10);
            if (x(aVar)) {
                aVar.f2762b.setOnStartEnterTransitionListener(kVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    Fragment B(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2744c.size() - 1; size >= 0; size--) {
            v.a aVar = this.f2744c.get(size);
            int i10 = aVar.f2761a;
            if (i10 == 1) {
                arrayList.remove(aVar.f2762b);
            } else if (i10 != 3) {
                switch (i10) {
                    case 6:
                        arrayList.add(aVar.f2762b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f2762b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f2762b;
                        break;
                    case 10:
                        aVar.f2768h = aVar.f2767g;
                        break;
                }
            } else {
                arrayList.add(aVar.f2762b);
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.n.InterfaceC0046n
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2750i) {
            return true;
        }
        this.f2523t.e(this);
        return true;
    }

    @Override // androidx.fragment.app.v
    public int f() {
        return o(false);
    }

    @Override // androidx.fragment.app.v
    public int g() {
        return o(true);
    }

    @Override // androidx.fragment.app.v
    public void h() {
        j();
        this.f2523t.b0(this, false);
    }

    @Override // androidx.fragment.app.v
    public void i() {
        j();
        this.f2523t.b0(this, true);
    }

    @Override // androidx.fragment.app.v
    void k(int i10, Fragment fragment, String str, int i11) {
        super.k(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f2523t;
    }

    @Override // androidx.fragment.app.v
    public v l(Fragment fragment) {
        n nVar = fragment.mFragmentManager;
        if (nVar == null || nVar == this.f2523t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void n(int i10) {
        if (this.f2750i) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2744c.size();
            for (int i11 = 0; i11 < size; i11++) {
                v.a aVar = this.f2744c.get(i11);
                Fragment fragment = aVar.f2762b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2762b + " to " + aVar.f2762b.mBackStackNesting);
                    }
                }
            }
        }
    }

    int o(boolean z10) {
        if (this.f2524u) {
            throw new IllegalStateException("commit already called");
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
            p("  ", printWriter);
            printWriter.close();
        }
        this.f2524u = true;
        if (this.f2750i) {
            this.f2525v = this.f2523t.j();
        } else {
            this.f2525v = -1;
        }
        this.f2523t.Y(this, z10);
        return this.f2525v;
    }

    public void p(String str, PrintWriter printWriter) {
        q(str, printWriter, true);
    }

    public void q(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2752k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2525v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2524u);
            if (this.f2749h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2749h));
            }
            if (this.f2745d != 0 || this.f2746e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2745d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2746e));
            }
            if (this.f2747f != 0 || this.f2748g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2747f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2748g));
            }
            if (this.f2753l != 0 || this.f2754m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2753l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2754m);
            }
            if (this.f2755n != 0 || this.f2756o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2755n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2756o);
            }
        }
        if (this.f2744c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2744c.size();
        for (int i10 = 0; i10 < size; i10++) {
            v.a aVar = this.f2744c.get(i10);
            switch (aVar.f2761a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2761a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2762b);
            if (z10) {
                if (aVar.f2763c != 0 || aVar.f2764d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2763c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2764d));
                }
                if (aVar.f2765e != 0 || aVar.f2766f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2765e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2766f));
                }
            }
        }
    }

    void r() {
        int size = this.f2744c.size();
        for (int i10 = 0; i10 < size; i10++) {
            v.a aVar = this.f2744c.get(i10);
            Fragment fragment = aVar.f2762b;
            if (fragment != null) {
                fragment.setNextTransition(this.f2749h);
                fragment.setSharedElementNames(this.f2757p, this.f2758q);
            }
            switch (aVar.f2761a) {
                case 1:
                    fragment.setNextAnim(aVar.f2763c);
                    this.f2523t.h1(fragment, false);
                    this.f2523t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2761a);
                case 3:
                    fragment.setNextAnim(aVar.f2764d);
                    this.f2523t.Z0(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2764d);
                    this.f2523t.B0(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f2763c);
                    this.f2523t.h1(fragment, false);
                    this.f2523t.l1(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f2764d);
                    this.f2523t.x(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f2763c);
                    this.f2523t.h1(fragment, false);
                    this.f2523t.l(fragment);
                    break;
                case 8:
                    this.f2523t.j1(fragment);
                    break;
                case 9:
                    this.f2523t.j1(null);
                    break;
                case 10:
                    this.f2523t.i1(fragment, aVar.f2768h);
                    break;
            }
            if (!this.f2759r && aVar.f2761a != 1 && fragment != null && !n.P) {
                this.f2523t.N0(fragment);
            }
        }
        if (this.f2759r || n.P) {
            return;
        }
        n nVar = this.f2523t;
        nVar.O0(nVar.f2669q, true);
    }

    void s(boolean z10) {
        for (int size = this.f2744c.size() - 1; size >= 0; size--) {
            v.a aVar = this.f2744c.get(size);
            Fragment fragment = aVar.f2762b;
            if (fragment != null) {
                fragment.setNextTransition(n.e1(this.f2749h));
                fragment.setSharedElementNames(this.f2758q, this.f2757p);
            }
            switch (aVar.f2761a) {
                case 1:
                    fragment.setNextAnim(aVar.f2766f);
                    this.f2523t.h1(fragment, true);
                    this.f2523t.Z0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2761a);
                case 3:
                    fragment.setNextAnim(aVar.f2765e);
                    this.f2523t.g(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2765e);
                    this.f2523t.l1(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f2766f);
                    this.f2523t.h1(fragment, true);
                    this.f2523t.B0(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f2765e);
                    this.f2523t.l(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f2766f);
                    this.f2523t.h1(fragment, true);
                    this.f2523t.x(fragment);
                    break;
                case 8:
                    this.f2523t.j1(null);
                    break;
                case 9:
                    this.f2523t.j1(fragment);
                    break;
                case 10:
                    this.f2523t.i1(fragment, aVar.f2767g);
                    break;
            }
            if (!this.f2759r && aVar.f2761a != 3 && fragment != null && !n.P) {
                this.f2523t.N0(fragment);
            }
        }
        if (this.f2759r || !z10 || n.P) {
            return;
        }
        n nVar = this.f2523t;
        nVar.O0(nVar.f2669q, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    Fragment t(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f2744c.size()) {
            v.a aVar = this.f2744c.get(i10);
            int i11 = aVar.f2761a;
            if (i11 == 1) {
                arrayList.add(aVar.f2762b);
            } else if (i11 == 2) {
                Fragment fragment3 = aVar.f2762b;
                int i12 = fragment3.mContainerId;
                boolean z10 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i12) {
                        if (fragment4 == fragment3) {
                            z10 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f2744c.add(i10, new v.a(9, fragment4));
                                i10++;
                                fragment2 = null;
                            }
                            v.a aVar2 = new v.a(3, fragment4);
                            aVar2.f2763c = aVar.f2763c;
                            aVar2.f2765e = aVar.f2765e;
                            aVar2.f2764d = aVar.f2764d;
                            aVar2.f2766f = aVar.f2766f;
                            this.f2744c.add(i10, aVar2);
                            arrayList.remove(fragment4);
                            i10++;
                        }
                    }
                }
                if (z10) {
                    this.f2744c.remove(i10);
                    i10--;
                } else {
                    aVar.f2761a = 1;
                    arrayList.add(fragment3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.f2762b);
                Fragment fragment5 = aVar.f2762b;
                if (fragment5 == fragment2) {
                    this.f2744c.add(i10, new v.a(9, fragment5));
                    i10++;
                    fragment2 = null;
                }
            } else if (i11 == 7) {
                arrayList.add(aVar.f2762b);
            } else if (i11 == 8) {
                this.f2744c.add(i10, new v.a(9, fragment2));
                i10++;
                fragment2 = aVar.f2762b;
            }
            i10++;
        }
        return fragment2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2525v >= 0) {
            sb2.append(" #");
            sb2.append(this.f2525v);
        }
        if (this.f2752k != null) {
            sb2.append(" ");
            sb2.append(this.f2752k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public String u() {
        return this.f2752k;
    }

    boolean v(int i10) {
        int size = this.f2744c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f2744c.get(i11).f2762b;
            int i12 = fragment != null ? fragment.mContainerId : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    boolean w(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f2744c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f2744c.get(i13).f2762b;
            int i14 = fragment != null ? fragment.mContainerId : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f2744c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f2744c.get(i16).f2762b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    boolean y() {
        for (int i10 = 0; i10 < this.f2744c.size(); i10++) {
            if (x(this.f2744c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void z() {
        if (this.f2760s != null) {
            for (int i10 = 0; i10 < this.f2760s.size(); i10++) {
                this.f2760s.get(i10).run();
            }
            this.f2760s = null;
        }
    }
}
