package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F4 extends QC<C0875Ev> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1351Xm A04;
    public InterfaceC1352Xn A05;
    public String A06;
    public List<C1588cn> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1896hy A0A;
    public final SF A0B;
    public final C1621dL A0C;
    public final US A0D;
    public final XH A0E;
    public final FH A0F;
    public final C1694eX A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public F4(C1621dL c1621dL, List<C1588cn> list, AbstractC1896hy abstractC1896hy, US us, SF sf, C1694eX c1694eX, XH xh, InterfaceC1352Xn interfaceC1352Xn, String str, int i10, int i11, int i12, int i13, FH fh, AbstractC1351Xm abstractC1351Xm) {
        this.A0C = c1621dL;
        this.A0D = us;
        this.A0B = sf;
        this.A0G = c1694eX;
        this.A0E = xh;
        this.A05 = interfaceC1352Xn;
        this.A0A = abstractC1896hy;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = fh;
        this.A04 = abstractC1351Xm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0875Ev A0F(ViewGroup viewGroup, int i10) {
        return new C0875Ev(AbstractC1518bf.A00(new C1458ah(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0R(this.A04).A0W(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0875Ev c0875Ev, int i10) {
        c0875Ev.A0q(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            c0875Ev.AIV();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A07.size();
    }
}
