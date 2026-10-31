package x7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BundleCollectionUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static <T> com.google.common.collect.u<T> a(com.google.common.base.g<Bundle, T> gVar, List<Bundle> list) {
        com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarV.a(gVar.apply((Bundle) a.e(list.get(i10))));
        }
        return aVarV.m();
    }

    public static <T> ArrayList<Bundle> b(Collection<T> collection, com.google.common.base.g<T, Bundle> gVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.apply(it.next()));
        }
        return arrayList;
    }
}
