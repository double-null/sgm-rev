package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1785g1 extends AbstractC1117Oh {
    public final AbstractC1117Oh A00 = new C1786g2(this);
    public final C06686g A01;

    public C1785g1(C06686g c06686g) {
        this.A01 = c06686g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1117Oh
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C06686g.class.getName());
        if ((view instanceof C06686g) && !A0B()) {
            C06686g c06686g = (C06686g) view;
            if (c06686g.getLayoutManager() != null) {
                c06686g.getLayoutManager().A1v(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1117Oh
    public final void A08(View view, PS ps) {
        super.A08(view, ps);
        ps.A0O(C06686g.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1H(ps);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1117Oh
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1X(i10, bundle);
        }
        return false;
    }

    public final AbstractC1117Oh A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
