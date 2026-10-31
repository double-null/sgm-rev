package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1599cy implements View.OnTouchListener {
    public final /* synthetic */ C1600cz A00;

    public ViewOnTouchListenerC1599cy(C1600cz c1600cz) {
        this.A00 = c1600cz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1600cz.A00(this.A00);
            this.A00.A07.ABJ(this.A00.A04.A25(), new C1406Zp().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
