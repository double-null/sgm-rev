package io.bidmachine.ads.networks.gam;

import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: VersionManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final List<Pair<uc.b, m6.b>> f16586a = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new n6.a());
        arrayList.add(new o6.a());
        arrayList.add(new p6.a());
        Collections.sort(arrayList, new Comparator() { // from class: io.bidmachine.ads.networks.gam.p0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return q0.d((m6.b) obj, (m6.b) obj2);
            }
        });
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            m6.b bVar = (m6.b) arrayList.get(i10);
            uc.a aVarC = null;
            m6.b bVar2 = i10 < size + (-1) ? (m6.b) arrayList.get(i10 + 1) : null;
            uc.a aVarC2 = bVar.c();
            if (bVar2 != null) {
                aVarC = bVar2.c();
            }
            f16586a.add(new Pair<>(new uc.b(aVarC2, aVarC, true, false), bVar));
            i10++;
        }
    }

    static uc.a b() {
        uc.a aVarE;
        Iterator<Pair<uc.b, m6.b>> it = f16586a.iterator();
        while (it.hasNext()) {
            m6.b bVar = (m6.b) it.next().second;
            if (Build.VERSION.SDK_INT >= bVar.b() && (aVarE = e(bVar)) != null) {
                return aVarE;
            }
        }
        return null;
    }

    public static m6.b c(String str) {
        uc.a aVarB;
        uc.b bVarD = uc.b.d(str);
        if (bVarD == null || (aVarB = b()) == null || !bVarD.a(aVarB)) {
            return null;
        }
        for (Pair<uc.b, m6.b> pair : f16586a) {
            if (((uc.b) pair.first).a(aVarB)) {
                return (m6.b) pair.second;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(m6.b bVar, m6.b bVar2) {
        return bVar.c().compareTo(bVar2.c());
    }

    static uc.a e(m6.b bVar) {
        try {
            return bVar.getVersion();
        } catch (Throwable unused) {
            return null;
        }
    }
}
