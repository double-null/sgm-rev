package com.facebook.ads.redexgen.core;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0788Bk implements InterfaceC1701ee {
    public final /* synthetic */ C05511r A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C0788Bk(C05511r c05511r, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c05511r;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1701ee
    public final void ACo(InterfaceC1699ec interfaceC1699ec) {
        C05511r.A06(interfaceC1699ec.A6v(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1701ee
    public final void ADC(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
