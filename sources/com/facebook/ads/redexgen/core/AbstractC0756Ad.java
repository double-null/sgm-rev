package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0756Ad<K, V> extends AbstractC2297oq<Map.Entry<K, V>> {
    public abstract Map<K, V> A00();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC2297oq, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c10) {
        try {
            return super.removeAll((Collection) AbstractC1963jA.A04(c10));
        } catch (UnsupportedOperationException unused) {
            return AbstractC2301ou.A0B(this, c10.iterator());
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC2297oq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c10) {
        try {
            return super.retainAll((Collection) AbstractC1963jA.A04(c10));
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetA06 = AbstractC2301ou.A06(c10.size());
            for (Object obj : c10) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetA06.add(((Map.Entry) obj).getKey());
                }
            }
            return A00().keySet().retainAll(hashSetA06);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ad != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ad != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return A00().isEmpty();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ad != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return A00().size();
    }
}
