package j7;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import g7.y;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l7.m;
import l7.n;

/* JADX INFO: loaded from: classes4.dex */
public class a extends c<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20651b;

    private class b implements Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair pair, Pair pair2) {
            int iV0 = ((n) pair.second).v0() * ((n) pair.second).t0();
            int iV1 = ((n) pair2.second).v0() * ((n) pair2.second).t0();
            int iAbs = Math.abs(iV0 - a.this.f20650a);
            int iAbs2 = Math.abs(iV1 - a.this.f20650a);
            h7.e.a("DefaultMediaPicker", "AreaComparator: obj1 - %d, obj2 - %d", Integer.valueOf(iAbs), Integer.valueOf(iAbs2));
            if (iAbs < iAbs2) {
                return -1;
            }
            return iAbs > iAbs2 ? 1 : 0;
        }
    }

    public a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f20651b = y.k(context);
    }

    private Pair e(List list) {
        h7.e.a("DefaultMediaPicker", "getBestMatch", new Object[0]);
        Iterator it = list.iterator();
        Pair pair = null;
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            if (g((n) pair2.second)) {
                if (h((n) pair2.second)) {
                    return pair2;
                }
                if (pair == null) {
                    pair = pair2;
                }
            }
        }
        return pair;
    }

    private void f(int i10, int i11) {
        this.f20650a = i10 * i11;
    }

    @Override // j7.c
    public Pair<m, n> b(List<Pair<m, n>> list) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, new b());
        return e(list);
    }

    protected boolean g(n nVar) {
        String strU0 = nVar.u0();
        return strU0 != null && strU0.matches("video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)");
    }

    protected boolean h(n nVar) {
        return (nVar.v0() > nVar.t0()) == this.f20651b;
    }
}
