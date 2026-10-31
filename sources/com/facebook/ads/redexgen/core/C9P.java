package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C9P {
    public final int A00;
    public final C2145mL A01;
    public final CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> A02;

    public C9P() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C9P(CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers, int i10, C2145mL c2145mL) {
        this.A02 = listenerAndHandlers;
        this.A00 = i10;
        this.A01 = c2145mL;
    }

    public final C9P A00(int i10, C2145mL c2145mL) {
        return new C9P(this.A02, i10, c2145mL);
    }
}
