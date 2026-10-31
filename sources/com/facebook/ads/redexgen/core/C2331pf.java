package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2331pf {
    public final InterfaceC2336pk A00;
    public final String A01;
    public final Collection<C2345pu> A02;
    public final Collection<C2345pu> A03;
    public final List<Rect> A04;

    public C2331pf(String str, InterfaceC2336pk interfaceC2336pk, List<Rect> rects, Collection<C2345pu> collection, Collection<C2345pu> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2336pk;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
