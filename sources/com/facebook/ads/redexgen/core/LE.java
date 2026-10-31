package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LE extends QC<FD> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1352Xn A03;
    public C1694eX A04;
    public String A05;
    public List<C1588cn> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1896hy A08;
    public final SF A09;
    public final C1621dL A0A;
    public final US A0B;
    public final C1164Qc A0C;
    public final XH A0D;
    public final C06545s A0E;
    public final C0824Cw A0F;

    public LE(C1621dL c1621dL, List<C1588cn> list, AbstractC1896hy abstractC1896hy, US us, C1164Qc c1164Qc, InterfaceC1352Xn interfaceC1352Xn, String str, C06545s c06545s, C0824Cw c0824Cw) {
        this.A0A = c1621dL;
        this.A0B = us;
        this.A0C = c1164Qc;
        this.A09 = c1164Qc.A11();
        this.A04 = c1164Qc.A1B();
        this.A0D = c1164Qc.A1A();
        this.A03 = interfaceC1352Xn;
        this.A08 = abstractC1896hy;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c06545s;
        this.A0F = c0824Cw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FD A0F(ViewGroup viewGroup, int i10) {
        return new FD(AbstractC1422a6.A00(new C1458ah(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0T(this.A0F).A0O(this.A0C).A0W(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FD fd2, int i10) {
        C1588cn c1588cn = this.A06.get(i10);
        fd2.A0q(this.A04);
        fd2.A0p(c1588cn, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1694eX c1694eX) {
        this.A04 = c1694eX;
    }
}
