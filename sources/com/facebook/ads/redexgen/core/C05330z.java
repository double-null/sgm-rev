package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05330z extends C9Z implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"58lW15hp88fFpLaSxErp", "56QScXrV6I", "DwEmmtKo2ODeTiA17rxauXwet98Z4", "A4aLtxZMLOPLaVE6SeDzXnpOLTGefetw", "FhOKuZuvLBWd8lghoK1mwxVLtzQRZ", "h1d8vpIJ83Cnf8DVjx4Ui7av1xQxYsFL", "y1YT0hSXczs7bGZDGpuR", "alxZNjekiwxoo3ZSsAAxphzspQJfVEZr"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C2298or A05;
    public InterfaceC2037kN A06;
    public C06977j A07;
    public AbstractC06967i A08;
    public AbstractC06967i A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C6N A0E;
    public final InterfaceC0841Dn A0F;
    public final InterfaceC0844Dq A0G;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "1YRuRVntTKbD5w1SSS8awuyRss3tM";
            strArr2[4] = "HmFGzdsys3t1iPkkAdwtO8Q44Z9aJ";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 122);
            i13++;
        }
    }

    public static void A09() {
        A0H = new byte[]{89, 127, 104, 126, 99, 126, 102, 111, 42, 110, 111, 105, 101, 110, 99, 100, 109, 42, 108, 107, 99, 102, 111, 110, 36, 42, 121, 126, 120, 111, 107, 103, 76, 101, 120, 103, 107, 126, 55, 57, 8, 21, 25, Utf8.REPLACEMENT_BYTE, 8, 3, 9, 8, 31, 8, 31};
    }

    static {
        A09();
    }

    public C05330z(InterfaceC0844Dq interfaceC0844Dq, Looper looper, InterfaceC0841Dn interfaceC0841Dn) {
        super(3);
        this.A0G = (InterfaceC0844Dq) C3M.A01(interfaceC0844Dq);
        this.A0D = looper == null ? null : AbstractC06104a.A0c(looper, this);
        this.A0F = interfaceC0841Dn;
        this.A0E = new C6N();
        this.A02 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        C3M.A01(this.A09);
        if (this.A01 >= this.A09.A7w()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A7v(this.A01);
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long A01(long j10) {
        int iA8S = this.A09.A8S(j10);
        if (iA8S != 0) {
            int nextEventTimeIndex = this.A09.A7w();
            if (nextEventTimeIndex != 0) {
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[0];
                int length = str.length();
                int nextEventTimeIndex2 = str2.length();
                if (length != nextEventTimeIndex2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "dWbBH4lKinuUlTA8CpNFonpmnzuPl";
                strArr2[4] = "MDue3s6tkJ65MZJ0TxYFZvpfeIb1w";
                if (iA8S == -1) {
                    AbstractC06967i abstractC06967i = this.A09;
                    if (A0I[1].length() != 10) {
                        int nextEventTimeIndex3 = this.A09.A7w();
                        return abstractC06967i.A7v(nextEventTimeIndex3 - 1);
                    }
                    A0I[3] = "us0wUp64B7rq5nQeuQUWAOSOIfPFOl8I";
                    int nextEventTimeIndex4 = this.A09.A7w();
                    return abstractC06967i.A7v(nextEventTimeIndex4 - 1);
                }
                int nextEventTimeIndex5 = iA8S - 1;
                return this.A09.A7v(nextEventTimeIndex5);
            }
        }
        return ((AbstractC2219nX) this.A09).A01;
    }

    @SideEffectFree
    private long A02(long j10) {
        boolean z10 = true;
        C3M.A08(j10 != -9223372036854775807L);
        if (this.A04 == -9223372036854775807L) {
            z10 = false;
        }
        C3M.A08(z10);
        return j10 - this.A04;
    }

    private void A04() {
        A0B(new C2247o0(MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5C((C2298or) C3M.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((InterfaceC2037kN) C3M.A01(this.A06)).AGr();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(C2247o0 c2247o0) {
        this.A0G.ACw(c2247o0.A01);
        this.A0G.ACv(c2247o0);
    }

    private void A0B(C2247o0 c2247o0) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c2247o0).sendToTarget();
        } else {
            A0A(c2247o0);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0C(C0843Dp c0843Dp) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, c0843Dp).sendToTarget();
        }
    }

    private void A0D(C2036kM c2036kM) {
        AnonymousClass44.A08(A03(39, 12, 23), A03(0, 39, 112) + this.A05, c2036kM);
        A0C(new C0843Dp(this.A05, c2036kM));
        A04();
        A08();
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1Z() {
        this.A05 = null;
        this.A02 = -9223372036854775807L;
        A04();
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1a(long j10, boolean z10) {
        this.A03 = j10;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((InterfaceC2037kN) C3M.A01(this.A06)).flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C9Z
    public final void A1c(C2298or[] c2298orArr, long j10, long j11) {
        this.A04 = j11;
        this.A05 = c2298orArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2208nM
    public final boolean AAG() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2208nM
    public final boolean AAV() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2208nM
    public final void AHn(long j10, long j11) throws C5P {
        this.A03 = j10;
        if (AAE() && this.A02 != -9223372036854775807L && j10 >= this.A02) {
            A06();
            this.A0B = true;
        }
        if (this.A0B) {
            return;
        }
        if (this.A08 == null) {
            ((InterfaceC2037kN) C3M.A01(this.A06)).AIx(j10);
            try {
                this.A08 = ((InterfaceC2037kN) C3M.A01(this.A06)).A5l();
            } catch (C2036kM e10) {
                A0D(e10);
                return;
            }
        }
        if (A92() != 2) {
            return;
        }
        boolean z10 = false;
        if (this.A09 != null) {
            long jA00 = A00();
            while (jA00 <= j10) {
                this.A01++;
                jA00 = A00();
                z10 = true;
            }
        }
        if (this.A08 != null) {
            AbstractC06967i abstractC06967i = this.A08;
            boolean textRendererNeedsUpdate = abstractC06967i.A05();
            if (textRendererNeedsUpdate) {
                if (!z10 && A00() == Long.MAX_VALUE) {
                    if (this.A00 == 2) {
                        A08();
                    } else {
                        A06();
                        this.A0B = true;
                    }
                }
            } else if (((AbstractC2219nX) abstractC06967i).A01 <= j10) {
                AbstractC06967i abstractC06967i2 = this.A09;
                if (A0I[1].length() != 10) {
                    String[] strArr = A0I;
                    strArr[6] = "SM2l9fwyY7vSK8U9dCan";
                    strArr[0] = "PLBzRsO91bLUZoRphjDr";
                    if (abstractC06967i2 != null) {
                        this.A09.A0B();
                    }
                } else {
                    A0I[1] = "uDUYlaOON0";
                    if (abstractC06967i2 != null) {
                        this.A09.A0B();
                    }
                }
                this.A01 = abstractC06967i.A8S(j10);
                this.A09 = abstractC06967i;
                this.A08 = null;
                z10 = true;
            }
        }
        if (z10) {
            C3M.A01(this.A09);
            A0B(new C2247o0(this.A09.A7P(j10), A02(A01(j10))));
        }
        int i10 = this.A00;
        if (A0I[3].charAt(23) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[6] = "ML0YoWWFYnm1pIYkMDlj";
        strArr2[0] = "WzY2c9YM67lXJGPj7nnt";
        if (i10 == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A0A;
                if (!textRendererNeedsUpdate2) {
                    C06977j c06977jA5j = this.A07;
                    if (c06977jA5j == null) {
                        c06977jA5j = ((InterfaceC2037kN) C3M.A01(this.A06)).A5j();
                        if (c06977jA5j != null) {
                            this.A07 = c06977jA5j;
                        } else {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        c06977jA5j.A02(4);
                        ((InterfaceC2037kN) C3M.A01(this.A06)).AGZ(c06977jA5j);
                        this.A07 = null;
                        this.A00 = 2;
                        return;
                    }
                    int iA1R = A1R(this.A0E, c06977jA5j, 0);
                    if (iA1R == -4) {
                        boolean textRendererNeedsUpdate3 = c06977jA5j.A05();
                        if (textRendererNeedsUpdate3) {
                            this.A0A = true;
                            this.A0C = false;
                        } else {
                            C2298or c2298or = this.A0E.A00;
                            if (c2298or != null) {
                                c06977jA5j.A00 = c2298or.A0M;
                                c06977jA5j.A0B();
                                boolean z11 = this.A0C;
                                boolean textRendererNeedsUpdate4 = c06977jA5j.A07();
                                this.A0C = (textRendererNeedsUpdate4 ? false : true) & z11;
                            } else {
                                return;
                            }
                        }
                        boolean textRendererNeedsUpdate5 = this.A0C;
                        if (!textRendererNeedsUpdate5) {
                            ((InterfaceC2037kN) C3M.A01(this.A06)).AGZ(c06977jA5j);
                            this.A07 = null;
                        }
                    } else if (iA1R == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (C2036kM e11) {
                A0D(e11);
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C7D
    public final int AJb(C2298or c2298or) {
        if (this.A0F.AJc(c2298or)) {
            return AnonymousClass76.A00(4);
        }
        if (AbstractC05652h.A0E(c2298or.A0W)) {
            return AnonymousClass76.A00(1);
        }
        return AnonymousClass76.A00(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2208nM, com.facebook.ads.redexgen.core.C7D
    public final String getName() {
        return A03(39, 12, 23);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0A((C2247o0) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
