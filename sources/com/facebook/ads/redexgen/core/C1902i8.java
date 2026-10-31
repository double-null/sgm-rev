package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1902i8 implements InterfaceC1405Zo {
    public static String[] A03 = {"JSPFN54Hhto2krin5AXlvtsoUga8f3VN", "TJUa2zQB5Sn7m4BW7AASunbvdXy8BM9T", "6VrbDJWlH8cGoKCi2T6pLfOeL4USL1Zo", "WDYRHsse8CkpPKHQRRahwXj8yQt26EEK", "k2HMJqY12uG3JOOYcYA0rukTMokxTs2q", "JFWFpGWs655aVrqtTe7kn6NDgYp0Sw9v", "lGCVru2Pt3eCAyGNCmn4MueAiTs1TFsk", "y56t9BBTSrVMdPLNMlUp"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1900i6 A01;
    public final /* synthetic */ C1164Qc A02;

    public C1902i8(AbstractC1900i6 abstractC1900i6, int i10, C1164Qc c1164Qc) {
        this.A01 = abstractC1900i6;
        this.A00 = i10;
        this.A02 = c1164Qc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1405Zo
    public final void ADT(C1404Zn c1404Zn) {
        if (this.A00 == 0) {
            this.A02.A1c(this.A01.A04);
        }
        this.A02.A1f(c1404Zn.A00() != null, true);
        if (A03[0].charAt(15) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "iRqOIqAZ6TOb0gQaJ743l8NrEMVcYXI5";
        strArr[4] = "jzrwvLgYYMFr4hfD5uj52ory38hy0fYg";
    }
}
