package hb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.t;
import rd.c0;
import rd.f0;
import wc.g0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f15815b;

    public a(List initial) {
        t.f(initial, "initial");
        this.f15814a = initial;
        this.f15815b = new HashSet(initial);
    }

    private final void b(String str) {
        if (this.f15815b.contains(str)) {
            return;
        }
        this.f15815b.add(str);
    }

    private final void c(String str) {
        if (c0.O(str, "&", false, 2, null)) {
            String strSubstring = str.substring(1);
            t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            b(strSubstring);
        } else if (c0.O(str, "!", false, 2, null)) {
            String strSubstring2 = str.substring(1);
            t.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            e(strSubstring2);
        }
    }

    private final void e(String str) {
        if (t.a(str, "default")) {
            return;
        }
        this.f15815b.remove(str);
    }

    @Override // hb.b
    public boolean a(List stateGroups) {
        boolean z10;
        t.f(stateGroups, "stateGroups");
        synchronized (this.f15815b) {
            if (stateGroups.isEmpty()) {
                z10 = true;
            } else {
                if (!stateGroups.isEmpty()) {
                    Iterator it = stateGroups.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (d((String) it.next())) {
                                z10 = true;
                            }
                        }
                    }
                }
                z10 = false;
            }
        }
        return z10;
    }

    public boolean d(String stateGroup) {
        boolean z10;
        t.f(stateGroup, "stateGroup");
        synchronized (this.f15815b) {
            z10 = t.a(stateGroup, "default") || this.f15815b.contains(stateGroup);
        }
        return z10;
    }

    @Override // hb.b
    public void a(String stateGroups) {
        t.f(stateGroups, "stateGroups");
        synchronized (this.f15815b) {
            List listK0 = f0.K0(stateGroups, new String[]{" "}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(u.u(listK0, 10));
            Iterator it = listK0.iterator();
            while (it.hasNext()) {
                arrayList.add(f0.d1((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!f0.k0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c((String) it2.next());
            }
            g0 g0Var = g0.f27756a;
        }
    }
}
