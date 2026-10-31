package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OC extends QT {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C05150h A00;

    public OC(C05150h c05150h) {
        this.A00 = c05150h;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0L(C06686g c06686g, int i10) {
        int iA25;
        InterfaceC1359Xu interfaceC1359Xu;
        super.A0L(c06686g, i10);
        C1801gI linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (iA25 = linearLayoutManager.A25()) >= 0) {
            C05150h c05150h = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c05150h.getAdapter() == null || iA25 >= this.A00.getAdapter().A0B() || (interfaceC1359Xu = (InterfaceC1359Xu) c06686g.A1F(iA25)) == null) {
                return;
            }
            interfaceC1359Xu.AIV();
        }
    }
}
