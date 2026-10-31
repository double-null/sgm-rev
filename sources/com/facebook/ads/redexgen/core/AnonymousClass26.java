package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.26, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass26 extends AbstractC1127Or<C1694eX> implements SM {
    public C1621dL A00;
    public boolean A01;

    public AnonymousClass26(C1694eX c1694eX, C1621dL c1621dL) {
        super(c1694eX);
        this.A00 = c1621dL;
        this.A01 = false;
    }

    private void A00(int i10) {
        if (!this.A01) {
            this.A00.A0F().A3n(i10);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        C1694eX c1694eXA08 = A08();
        int iIntValue = 0;
        if (c1694eXA08 == null) {
            A00(0);
            return;
        }
        View view = c1694eXA08.A0C;
        AbstractC1693eW abstractC1693eW = (AbstractC1693eW) c1694eXA08.A0E.get();
        int i10 = 1;
        boolean z10 = view == null;
        if (!z10 && abstractC1693eW != null) {
            C1695eY c1695eYA0E = C1694eX.A0E(view, c1694eXA08.A0A, this.A00);
            if (c1695eYA0E.A04()) {
                C1694eX.A05(c1694eXA08);
            } else {
                c1694eXA08.A00 = 0;
            }
            boolean z11 = c1694eXA08.A00 > c1694eXA08.A09;
            boolean wasViewable = c1694eXA08.A05 != null && c1694eXA08.A05.A04();
            if (z11 || !c1695eYA0E.A04()) {
                c1694eXA08.A05 = c1695eYA0E;
            }
            String strValueOf = String.valueOf(c1695eYA0E.A01());
            synchronized (c1694eXA08) {
                if (c1694eXA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c1694eXA08.A06.get(strValueOf)).intValue();
                }
                c1694eXA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z11 && !wasViewable) {
                this.A01 = true;
                c1694eXA08.A03 = System.currentTimeMillis();
                if (c1694eXA08.A07) {
                    this.A00.A0F().A3o();
                }
                abstractC1693eW.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c1694eXA08.A0F) {
                    return;
                }
            } else if (!z11 && wasViewable) {
                this.A01 = true;
                if (c1694eXA08.A07) {
                    this.A00.A0F().A3K(c1695eYA0E.A02());
                }
                abstractC1693eW.A00();
            } else {
                abstractC1693eW.A02();
                if (!this.A01 && c1694eXA08.A07) {
                    this.A00.A0F().A3m(c1695eYA0E.A02());
                }
                this.A01 = true;
            }
            if (!c1694eXA08.A08 && c1694eXA08.A04 != null) {
                c1694eXA08.A0B.postDelayed(c1694eXA08.A04, c1694eXA08.A02);
                return;
            }
            return;
        }
        if (c1694eXA08.A07) {
            if (!z10) {
                i10 = 2;
            }
            A00(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final C1621dL A6e() {
        return this.A00;
    }
}
