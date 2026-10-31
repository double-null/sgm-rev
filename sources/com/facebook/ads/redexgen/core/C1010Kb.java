package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1010Kb {
    public final int A00;
    public final String A01;
    public final List<C1009Ka> A02;
    public final byte[] A03;

    public C1010Kb(int i10, String str, List<C1009Ka> list, byte[] bArr) {
        List<C1009Ka> listUnmodifiableList;
        this.A00 = i10;
        this.A01 = str;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = listUnmodifiableList;
        this.A03 = bArr;
    }
}
