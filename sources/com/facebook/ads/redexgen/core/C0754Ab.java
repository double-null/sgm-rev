package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0754Ab extends AbstractC2262oF<Object> {
    public final /* synthetic */ int A00;

    public C0754Ab(final int val$expectedKeys) {
        this.A00 = val$expectedKeys;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2262oF
    public final <K, V> Map<K, Collection<V>> A04() {
        return AbstractC2279oY.A00(this.A00);
    }
}
