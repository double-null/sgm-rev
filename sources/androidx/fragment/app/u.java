package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import g7.EinF.ZHgPsTG;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FragmentStore.java */
/* JADX INFO: loaded from: classes2.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f2739a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, t> f2740b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f2741c;

    u() {
    }

    void a(Fragment fragment) {
        if (this.f2739a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2739a) {
            this.f2739a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f2740b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f2740b.get(str) != null;
    }

    void d(int i10) {
        for (t tVar : this.f2740b.values()) {
            if (tVar != null) {
                tVar.t(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2740b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (t tVar : this.f2740b.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    Fragment fragmentK = tVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2739a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f2739a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        t tVar = this.f2740b.get(str);
        if (tVar != null) {
            return tVar.k();
        }
        return null;
    }

    Fragment g(int i10) {
        for (int size = this.f2739a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2739a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (t tVar : this.f2740b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (fragmentK.mFragmentId == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f2739a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2739a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (t tVar : this.f2740b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (t tVar : this.f2740b.values()) {
            if (tVar != null && (fragmentFindFragmentByWho = tVar.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f2739a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f2739a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f2739a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f2739a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List<t> k() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f2740b.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f2740b.values()) {
            if (tVar != null) {
                arrayList.add(tVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    t m(String str) {
        return this.f2740b.get(str);
    }

    List<Fragment> n() {
        ArrayList arrayList;
        if (this.f2739a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2739a) {
            arrayList = new ArrayList(this.f2739a);
        }
        return arrayList;
    }

    q o() {
        return this.f2741c;
    }

    void p(t tVar) {
        Fragment fragmentK = tVar.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f2740b.put(fragmentK.mWho, tVar);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f2741c.f(fragmentK);
            } else {
                this.f2741c.n(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void q(t tVar) {
        Fragment fragmentK = tVar.k();
        if (fragmentK.mRetainInstance) {
            this.f2741c.n(fragmentK);
        }
        if (this.f2740b.put(fragmentK.mWho, null) != null && n.D0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void r() {
        Iterator<Fragment> it = this.f2739a.iterator();
        while (it.hasNext()) {
            t tVar = this.f2740b.get(it.next().mWho);
            if (tVar != null) {
                tVar.m();
            }
        }
        for (t tVar2 : this.f2740b.values()) {
            if (tVar2 != null) {
                tVar2.m();
                Fragment fragmentK = tVar2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    q(tVar2);
                }
            }
        }
    }

    void s(Fragment fragment) {
        synchronized (this.f2739a) {
            this.f2739a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void t() {
        this.f2740b.clear();
    }

    void u(List<String> list) {
        this.f2739a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (n.D0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    ArrayList<String> w() {
        synchronized (this.f2739a) {
            if (this.f2739a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2739a.size());
            for (Fragment fragment : this.f2739a) {
                arrayList.add(fragment.mWho);
                if (n.D0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                }
            }
            return arrayList;
        }
    }

    void x(q qVar) {
        this.f2741c = qVar;
    }

    ArrayList<s> v() {
        ArrayList<s> arrayList = new ArrayList<>(this.f2740b.size());
        for (t tVar : this.f2740b.values()) {
            if (tVar != null) {
                Fragment fragmentK = tVar.k();
                s sVarR = tVar.r();
                arrayList.add(sVarR);
                if (n.D0(2)) {
                    Log.v("FragmentManager", ZHgPsTG.lgaaCXAC + fragmentK + ": " + sVarR.f2730m);
                }
            }
        }
        return arrayList;
    }
}
