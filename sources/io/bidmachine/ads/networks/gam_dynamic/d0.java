package io.bidmachine.ads.networks.gam_dynamic;

import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: VersionManager.java */
/* JADX INFO: loaded from: classes4.dex */
class d0 {

    /* JADX INFO: compiled from: VersionManager.java */
    class a extends ArrayList<r6.b> {
        a() {
            add(new s6.a());
            add(new t6.a());
            add(new u6.a());
        }
    }

    static uc.a b(List<Pair<uc.b, r6.b>> list) {
        uc.a aVarF;
        Iterator<Pair<uc.b, r6.b>> it = list.iterator();
        while (it.hasNext()) {
            r6.b bVar = (r6.b) it.next().second;
            if (Build.VERSION.SDK_INT >= bVar.b() && (aVarF = f(bVar)) != null) {
                return aVarF;
            }
        }
        return null;
    }

    static r6.b c(String str) {
        List<Pair<uc.b, r6.b>> listD;
        uc.a aVarB;
        uc.b bVarD = uc.b.d(str);
        if (bVarD == null || (aVarB = b((listD = d()))) == null || !bVarD.a(aVarB)) {
            return null;
        }
        for (Pair<uc.b, r6.b> pair : listD) {
            if (((uc.b) pair.first).a(aVarB)) {
                return (r6.b) pair.second;
            }
        }
        return null;
    }

    static List<Pair<uc.b, r6.b>> d() {
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        Collections.sort(aVar, new Comparator() { // from class: io.bidmachine.ads.networks.gam_dynamic.c0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d0.e((r6.b) obj, (r6.b) obj2);
            }
        });
        int size = aVar.size();
        int i10 = 0;
        while (i10 < size) {
            r6.b bVar = aVar.get(i10);
            uc.a aVarC = null;
            r6.b bVar2 = i10 < size + (-1) ? aVar.get(i10 + 1) : null;
            uc.a aVarC2 = bVar.c();
            if (bVar2 != null) {
                aVarC = bVar2.c();
            }
            arrayList.add(new Pair(new uc.b(aVarC2, aVarC, true, false), bVar));
            i10++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(r6.b bVar, r6.b bVar2) {
        return bVar.c().compareTo(bVar2.c());
    }

    static uc.a f(r6.b bVar) {
        try {
            return bVar.getVersion();
        } catch (Throwable unused) {
            return null;
        }
    }
}
