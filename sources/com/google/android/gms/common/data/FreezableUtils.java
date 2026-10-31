package com.google.android.gms.common.data;

import io.bidmachine.ads.networks.gam_dynamic.d0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        d0.a aVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            aVar.add(arrayList.get(i10).freeze());
        }
        return aVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        d0.a aVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            aVar.add(it.next().freeze());
        }
        return aVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        d0.a aVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            aVar.add(e10.freeze());
        }
        return aVar;
    }
}
