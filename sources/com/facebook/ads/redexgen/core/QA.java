package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QA implements Runnable {
    public final /* synthetic */ C06686g A00;

    public QA(C06686g c06686g) {
        this.A00 = c06686g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A05 != null) {
            this.A00.A05.A0I();
        }
        this.A00.A0K = false;
    }
}
