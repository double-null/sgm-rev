package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2327pb {
    public static C2327pb A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2338pm A02;

    public C2327pb(ViewpointQeConfig viewpointQeConfig, AbstractC2343ps abstractC2343ps, C2338pm c2338pm, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2338pm;
        abstractC2343ps.A03(new A4(c2338pm));
    }

    public static C2327pb A00(ViewpointQeConfig viewpointQeConfig, AbstractC2343ps abstractC2343ps, InterfaceC2348px interfaceC2348px, A6 a10) {
        C2327pb localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C2327pb(viewpointQeConfig, abstractC2343ps, new C2338pm(viewpointQeConfig, interfaceC2348px, C0784Bg.A00, a10, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC2342pr interfaceC2342pr) {
        this.A02.A0E(interfaceC2342pr);
    }

    public final void A02(InterfaceC2340pp interfaceC2340pp) {
        this.A02.A0F(interfaceC2340pp);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C2349q0 c2349q0) {
        if (this.A00.A00 && c2349q0 != null) {
            this.A01.A06(dspViewableNode, c2349q0);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C2349q0 c2349q0, C2345pu c2345pu) {
        if (this.A00.A00 && c2349q0 != null) {
            this.A01.A07(dspViewableNode, c2349q0, c2345pu);
        } else {
            this.A01.A08(dspViewableNode, c2345pu);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, C2345pu c2345pu) {
        A05(dspViewableNode, null, c2345pu);
    }
}
