package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0904Fy extends FrameLayout implements InterfaceC1353Xo {
    public static byte[] A0L;
    public static String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final RelativeLayout.LayoutParams A0N;
    public static final int A0O;
    public static final int A0P;
    public int A00;
    public int A01;
    public int A02;
    public C1423a8 A03;
    public AbstractC0948Hr A04;
    public C1618dI A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1894hw A0A;
    public final R6 A0B;
    public final SF A0C;
    public final C1621dL A0D;
    public final US A0E;
    public final C1264Ua A0F;
    public final XC A0G;
    public final AbstractC1351Xm A0H;
    public final InterfaceC1352Xn A0I;
    public final YY A0J;
    public final ArrayList<C1566cR> A0K;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0G() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0G();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
        A0O = (int) (AbstractC1324Wl.A02 * 48.0f);
        A0P = (int) (AbstractC1324Wl.A02 * 64.0f);
    }

    public C0904Fy(C1621dL c1621dL, YY yy, US us, C1894hw c1894hw, SF sf, InterfaceC1352Xn interfaceC1352Xn) {
        FrameLayout.LayoutParams layoutParams;
        super(c1621dL);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new G1(this);
        this.A0D = c1621dL;
        this.A0J = yy;
        this.A0E = us;
        this.A0A = c1894hw;
        this.A0C = sf;
        this.A0I = interfaceC1352Xn;
        this.A0F = new C1264Ua(this.A0A.A1x(0).A25(), this.A0E);
        this.A0G = new XC(this);
        this.A0G.A05(XB.A02);
        this.A05 = new C1618dI(this.A0D, this.A0J, this.A0A.A1A(), interfaceC1352Xn);
        this.A0H = A05();
        if (this.A0A.A1U()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0P, A0O, 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, this.A0H.getToolbarHeight());
        }
        addView(this.A0H, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (r4.A1I() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        r6.A0H.setToolbarActionMode(0);
        r6.A0D.A0F().A4p();
        r6.A04.A1D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        if (r4.A1I() != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C0904Fy.A00():int");
    }

    private int A01(int i10) {
        if (this.A0A.A26()) {
            C1894hw c1894hw = this.A0A;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i10 < c1894hw.A21().size() && i10 >= 0) {
                return this.A0A.A21().get(i10).intValue();
            }
        }
        return this.A0A.A0m();
    }

    public static /* synthetic */ int A02(C0904Fy c0904Fy, int i10) {
        int i11 = c0904Fy.A01 + i10;
        c0904Fy.A01 = i11;
        return i11;
    }

    private AbstractC1351Xm A05() {
        AbstractC1351Xm c1103Nr;
        if (!this.A0A.A1U()) {
            c1103Nr = new FullScreenAdToolbar(this.A0D, this.A0I, this.A0F, 2, -1, false);
        } else {
            c1103Nr = new C1103Nr(this.A0D, this.A0I, this.A0F, 2);
        }
        c1103Nr.setFullscreen(true);
        c1103Nr.setToolbarListener(new C0905Fz(this));
        return c1103Nr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c1  */
    private AbstractC0948Hr A0A(boolean z10, int i10) {
        boolean z11;
        G0 g10 = new G0(this, i10);
        AbstractC1896hy abstractC1896hyA1x = this.A0A.A1x(this.A00);
        if (abstractC1896hyA1x.A2K()) {
            this.A0H.setOnClickListener(new ViewOnClickListenerC1567cS(this));
        }
        if (this.A0A.A25()) {
            int i11 = this.A00;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "c3gdOFv01Kz0ZnyucW";
            strArr2[1] = "uUEmXxf6IoafQfC48jcO";
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        boolean z12 = this.A0A.A24() && this.A00 > 0;
        String strA1z = this.A0A.A1z();
        if (A0Z(abstractC1896hyA1x)) {
            int iA01 = A01(this.A00);
            if (iA01 == 0) {
                setUnskippableSecondsComplete(true);
            }
            this.A0D.A0F().AJ9(LT.A06);
            this.A0D.A0F().AIb(this.A00);
            this.A0D.A0F().A4n(strA1z);
            return new AnonymousClass50(this.A0D, this.A0J, this.A00, this.A0E, abstractC1896hyA1x, this.A0I, this.A0H, this.A0F, z11, z12, g10, iA01, this.A0A.A1u());
        }
        if (abstractC1896hyA1x.A20().A0T()) {
            this.A0D.A0F().AJ9(LT.A07);
            this.A0D.A0F().AIb(this.A00);
            this.A0D.A0F().A4n(strA1z);
            if (this.A0A.A1U()) {
                return new C4K(this.A0D, this.A0E, this.A0H, abstractC1896hyA1x, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i10, z11, z12, g10, A01(this.A00), this.A0A.A1u());
            }
            return new C4Z(this.A0D, this.A0E, this.A0H, abstractC1896hyA1x, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i10, z11, z12, g10, A01(this.A00), this.A0A.A1u());
        }
        this.A0D.A0F().AJ9(LT.A07);
        this.A0D.A0F().AIb(this.A00);
        this.A0D.A0F().A4n(strA1z);
        return new C06234n(this.A0D, this.A0E, abstractC1896hyA1x, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, this.A0H, this.A0A.A0m(), i10, this.A0A.A1t(), z10, this.A0A.A1v(), this.A0A.A26(), z11, z12, g10, A01(this.A00), this.A0A.A1u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        int iA00 = A00();
        if (iA00 != 0) {
            this.A0D.A0F().A4q(iA00);
        }
    }

    private void A0D() {
        if (this.A00 > 0 && !TextUtils.isEmpty(this.A0A.A1x(this.A00 - 1).A25())) {
            US us = this.A0E;
            String strA25 = this.A0A.A1x(this.A00 - 1).A25();
            C1406Zp c1406ZpA03 = new C1406Zp().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            AbstractC0948Hr abstractC0948Hr = this.A04;
            String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            us.AAt(strA25, c1406ZpA03.A02(abstractC0948Hr != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A0H.getToolbarActionMode() == 8) {
            AbstractC1351Xm abstractC1351Xm = this.A0H;
            String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "ALooRHp0AOPErSNB2N5ax0GYeQeSWGkg";
            strArr2[4] = "Jojrpwo5bfgl2L1NDhbRQaPRUafbLI0W";
            abstractC1351Xm.setToolbarActionMode(2);
        }
        int i10 = this.A00 - 1;
        if (this.A0A.A27(i10)) {
            AbstractC1896hy abstractC1896hyA1x = this.A0A.A1x(i10);
            AbstractC1351Xm abstractC1351Xm2 = this.A0H;
            String[] strArr3 = A0M;
            String str = strArr3[2];
            String str2 = strArr3[4];
            int iCharAt = str.charAt(19);
            int index = str2.charAt(19);
            if (iCharAt == index) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0M;
            strArr4[0] = "SYmrADrPyc9xENaNAh";
            strArr4[1] = "82lRVJ32R9K27GgHKLOx";
            abstractC1351Xm2.setProgressSpinnerInvisible(!abstractC1896hyA1x.A2J());
            abstractC1896hyA1x.A2B(false);
            abstractC1896hyA1x.A20().A0M(-1);
        }
    }

    private void A0F() {
        this.A0D.A0F().A4o();
        this.A07 = true;
        this.A03 = new C1423a8(this.A0D, this.A0A, this.A0E, this.A0I, this.A0H.getToolbarHeight(), this.A02);
        C1566cR c1566cR = null;
        for (C1566cR c1566cR2 : this.A0K) {
            if (c1566cR2.A00 == C1566cR.A06) {
                c1566cR = c1566cR2;
                break;
            }
        }
        if (c1566cR != null) {
            A0L(this.A03, c1566cR);
        } else {
            boolean zIsEmpty = this.A0K.isEmpty();
            String[] strArr = A0M;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "8vyvfMLKM55zirtuKFzVGEL0IOO7sZ";
            strArr2[7] = "ODibu6eYSRbNQzGgUnvrLUj83p1fS4";
            if (!zIsEmpty) {
                A0L(this.A03, this.A0K.get(0));
            }
        }
        A0U(true);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
        }
        if (this.A04 != null) {
            XP.A0H(this.A04);
            this.A04.A1B();
            this.A04 = null;
        }
        XP.A0H(this.A03);
        XP.A0E(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0H() {
        this.A0G.A05(XB.A03);
    }

    private synchronized void A0I() {
        this.A0I.A4b(this.A0J.A6d());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(float f10) {
        float seenCurrentPosMS;
        float fA01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A26() ? 0 : this.A01) + f10;
        if (fA01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / fA01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A26()) {
            this.A06 = false;
            this.A0H.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0H.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            setUnskippableSecondsComplete(true);
            this.A0H.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i10) {
        this.A0D.A0F().A4l(i10);
        setUnskippableSecondsComplete(true);
        A0I();
        A0D();
        this.A0I.A4b(this.A0J.A7o());
    }

    private void A0L(ViewGroup viewGroup, C1566cR c1566cR) {
        if (c1566cR.A00 == C1566cR.A06 && c1566cR.A03 != null) {
            AbstractC1442aR.A00(this.A0D, viewGroup, c1566cR.A03);
        } else {
            int i10 = c1566cR.A01;
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            XP.A0K(viewGroup, i10);
        }
        this.A0H.setFullscreen(c1566cR.A05);
        this.A0H.A0A(c1566cR.A02, c1566cR.A04);
    }

    private void A0M(AbstractC1896hy abstractC1896hy) {
        if (this.A0H instanceof FullScreenAdToolbar) {
            if (A0Z(abstractC1896hy) && this.A02 == 2) {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(abstractC1896hy.A23());
            } else {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
            }
        }
    }

    private final void A0N(R0 r10) {
        r10.A0A(this.A0B);
        int i10 = r10.A05().getResources().getConfiguration().orientation;
        this.A02 = i10;
        A0V(this.A0A.A23(), i10);
        A0H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    public void A0U(boolean z10) {
        boolean z11;
        if (!A0X() || A0W()) {
            z11 = false;
        } else {
            boolean zA0Y = A0Y();
            String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "abX2oERzf98UggHhJlwc5xOu8ehA434Q";
            strArr2[4] = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE";
            if (zA0Y) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        boolean willShowCombinedEndCards = A0W();
        if (!willShowCombinedEndCards && !z11) {
            setUnskippableSecondsComplete(true);
            if (z10) {
                this.A0H.setToolbarActionMessage(A0B(0, 0, 85));
            }
            AbstractC1351Xm abstractC1351Xm = this.A0H;
            String[] strArr3 = A0M;
            if (strArr3[6].length() == strArr3[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0M;
            strArr4[0] = "6hDdRvQvhZI2wvmWyf";
            strArr4[1] = "dfELTL2TgrvtcbRt37j2";
            abstractC1351Xm.setToolbarActionMode(0);
            return;
        }
        AbstractC1351Xm abstractC1351Xm2 = this.A0H;
        String[] strArr5 = A0M;
        if (strArr5[0].length() != strArr5[1].length()) {
            String[] strArr6 = A0M;
            strArr6[2] = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ";
            strArr6[4] = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3";
            abstractC1351Xm2.setToolbarActionMode(1);
            return;
        }
        String[] strArr7 = A0M;
        strArr7[6] = "uCb48oA3";
        strArr7[3] = "eCwSqnipc7icS";
        abstractC1351Xm2.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V(boolean z10, int i10) {
        if (this.A04 != null) {
            this.A04.A1B();
            this.A04.removeAllViews();
            XP.A0H(this.A04);
        }
        if (this.A0A.A1U()) {
            XP.A0H(this.A0H);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0P, A0O, 0, 0);
            addView(this.A0H, layoutParams);
        }
        if (!A0W()) {
            setUnskippableSecondsComplete(true);
            if (A0X()) {
                A0F();
                return;
            }
            A0K(1);
            String[] strArr = A0M;
            if (strArr[6].length() != strArr[3].length()) {
                String[] strArr2 = A0M;
                strArr2[5] = "b6hirdpqFqEpTGRF7TvzfLNB23PEQW";
                strArr2[7] = "Y5Eb3FssofDa3ImZpKtnPvm2BrdUNN";
                return;
            }
        } else {
            if (this.A0A.A26()) {
                setUnskippableSecondsComplete(false);
                this.A0H.setProgressImmediate(0.0f);
            }
            SJ sjA01 = this.A0D.A01();
            AbstractC1896hy abstractC1896hyA1x = this.A0A.A1x(this.A00);
            String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                String[] strArr4 = A0M;
                strArr4[0] = "SeXhCWKDArfU2xbUHE";
                strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                boolean isLoaded = sjA01.AAD(abstractC1896hyA1x.A25(), this.A0A.A1y());
                if (!isLoaded) {
                    this.A0D.A0F().A4m();
                    A0K(2);
                    return;
                }
                AbstractC0948Hr abstractC0948HrA0A = A0A(z10, i10);
                this.A04 = abstractC0948HrA0A;
                AbstractC0948Hr abstractC0948Hr = this.A04;
                boolean isLoaded2 = this.A09;
                abstractC0948Hr.A1F(isLoaded2);
                setupToolbarForAd(abstractC0948HrA0A);
                addView(this.A04, 0, A0N);
                this.A00++;
                this.A04.A1E();
                return;
            }
        }
        throw new RuntimeException();
    }

    private boolean A0W() {
        return this.A00 < this.A0A.A1u();
    }

    private boolean A0X() {
        return this.A0A.A1t() == 2;
    }

    private final boolean A0Y() {
        return this.A07;
    }

    public static boolean A0Z(AbstractC1896hy abstractC1896hy) {
        return TextUtils.isEmpty(abstractC1896hy.A20().A0H().A09());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1353Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r10) {
        this.A0I.A3x(this, A0N);
        A0N(r10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1353Xo
    public final void AEV(boolean z10) {
        if (this.A04 != null) {
            this.A04.A1G(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1353Xo
    public final void AF0(boolean z10) {
        if (this.A04 != null) {
            this.A04.A1H(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1353Xo
    public final void AIB(Bundle bundle) {
    }

    public AbstractC0948Hr getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1353Xo
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1353Xo
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof AnonymousClass50) {
            A0L(this.A04, this.A04.getFullScreenAdStyle());
            A0M(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1353Xo
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A1B();
            this.A04 = null;
        }
        this.A0D.A01().A4r(this.A0A.A1y());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1352Xn interfaceC1352Xn) {
    }

    public void setServerSideRewardHandler(C1618dI c1618dI) {
        this.A05 = c1618dI;
    }

    public void setUnskippableSecondsComplete(boolean z10) {
        this.A09 = z10;
        if (this.A04 != null) {
            this.A04.A1F(this.A09);
        }
    }

    private void setupToolbarForAd(AbstractC0948Hr abstractC0948Hr) {
        if (this.A0H == null) {
            return;
        }
        this.A06 = true;
        AbstractC1896hy abstractC1896hyA1x = this.A0A.A1x(this.A00);
        int iA01 = A01(this.A00);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).A0D(this.A0D, abstractC1896hyA1x.A1t());
            ((FullScreenAdToolbar) this.A0H).A0C(abstractC1896hyA1x.A23(), abstractC1896hyA1x.A25(), iA01);
        } else if (this.A0H instanceof C1103Nr) {
            ((C1103Nr) this.A0H).setInitialUnskippableSeconds(iA01);
        }
        C1566cR fullScreenAdStyle = abstractC0948Hr.getFullScreenAdStyle();
        A0L(abstractC0948Hr, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0H.setToolbarActionMessage(A0B(4, 3, 90) + (this.A00 + 1) + A0B(0, 4, 21) + this.A0A.A1u());
        if (this.A08) {
            this.A0H.setToolbarActionMode(1);
        }
        A0M(abstractC1896hyA1x);
    }
}
