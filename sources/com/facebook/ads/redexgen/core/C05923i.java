package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05923i extends C0830Dc {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C1624dO A01;
    public boolean A02;
    public final AbstractC1244Tf<C05873d> A03;
    public final AbstractC1244Tf<C3Y> A04;
    public final AbstractC1244Tf<DQ> A05;
    public final AbstractC1244Tf<C3Q> A06;
    public final AbstractC1244Tf<DL> A07;
    public final AbstractC1244Tf<DJ> A08;
    public final AbstractC1244Tf<DI> A09;
    public final AbstractC1244Tf<DD> A0A;
    public final AbstractC1244Tf<DC> A0B;
    public final E1 A0C;
    public final DN A0D;
    public final DE A0E;

    public C05923i(C1621dL c1621dL, US us, E1 e10, String str) {
        this(c1621dL, us, e10, str, 0, 0, false, null, null);
    }

    public C05923i(C1621dL c1621dL, US us, E1 e10, String str, int i10, int i11, boolean z10, Bundle bundle, Map<String, String> map) {
        super(c1621dL, us, e10, str, !e10.A0p(), i10, i11, z10, bundle, map, new C0829Db(c1621dL, e10));
        this.A0E = new DE() { // from class: com.facebook.ads.redexgen.X.3j
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1244Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DF df) {
                this.A00.A0f();
            }
        };
        this.A08 = new C0840Dm(this);
        this.A04 = new C0839Dl(this);
        this.A05 = new C0838Dk(this);
        this.A06 = new C0837Dj(this);
        this.A03 = new C0836Di(this);
        this.A07 = new C0835Dh(this);
        this.A0A = new C0834Dg(this);
        this.A0B = new C0833Df(this);
        this.A09 = new C0845Dr(this);
        this.A0D = new DN() { // from class: com.facebook.ads.redexgen.X.3k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1244Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r10) {
                this.A00.A00 = this.A00.A0C.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = e10;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (U7.A2m(c1621dL)) {
            this.A01 = new C1624dO(e10, str, z10, null);
        }
    }

    public C05923i(C1621dL c1621dL, US us, E1 e10, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c1621dL, us, e10, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.core.C0830Dc
    public final void A0n(EnumC1628dS enumC1628dS, Map<String, String> map) {
        super.A0n(enumC1628dS, map);
        if (this.A01 != null && enumC1628dS == EnumC1628dS.A09) {
            Map<String, String> params = this.A01.A06();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        C0842Do c0842Do = new C0842Do(this);
        if (this.A0C.A0t()) {
            XJ.A00(c0842Do);
            return;
        }
        E1 e10 = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        e10.getStateHandler().post(c0842Do);
    }
}
