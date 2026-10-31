package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05732p extends AbstractC0828Da {
    public static String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final ImageView A00;
    public final C1621dL A01;
    public final AbstractC1244Tf<C05873d> A02;
    public final AbstractC1244Tf<DQ> A03;

    public C05732p(C1621dL c1621dL) {
        this(c1621dL, false);
    }

    public C05732p(C1621dL c1621dL, boolean z10) {
        ImageView.ScaleType scaleType;
        int color;
        super(c1621dL);
        this.A03 = new C0827Cz(this);
        this.A02 = new C0826Cy(this);
        this.A01 = c1621dL;
        this.A00 = new ImageView(c1621dL);
        if (!z10) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
            color = -16777216;
        } else {
            scaleType = ImageView.ScaleType.FIT_START;
            color = 0;
        }
        this.A00.setScaleType(scaleType);
        XP.A0K(this.A00, color);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0828Da
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            C1243Te<AbstractC1244Tf, C1242Td> eventBus = getVideoView().getEventBus();
            AbstractC1244Tf[] abstractC1244TfArr = new AbstractC1244Tf[2];
            String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            abstractC1244TfArr[0] = this.A03;
            abstractC1244TfArr[1] = this.A02;
            eventBus.A03(abstractC1244TfArr);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0828Da
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.A00.layout(0, 0, i12 - i10, i13 - i11);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, InterfaceC1405Zo interfaceC1405Zo) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        KZ downloadImageTask = new KZ(this.A00, this.A01).A04();
        if (interfaceC1405Zo != null) {
            downloadImageTask.A06(interfaceC1405Zo);
        }
        downloadImageTask.A07(str);
    }
}
