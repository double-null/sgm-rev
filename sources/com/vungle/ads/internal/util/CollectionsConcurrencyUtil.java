package com.vungle.ads.internal.util;

import java.util.HashSet;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CollectionsConcurrencyUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CollectionsConcurrencyUtil {
    public static final CollectionsConcurrencyUtil INSTANCE = new CollectionsConcurrencyUtil();

    private CollectionsConcurrencyUtil() {
    }

    public static final synchronized void addToSet(HashSet<String> hashset, String set) {
        t.f(hashset, "hashset");
        t.f(set, "set");
        hashset.add(set);
    }

    public static final synchronized HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        return new HashSet<>(hashSet);
    }
}
