package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("DoNotStrip")
public final class C2061kl implements GX {
    public static byte[] A0K;
    public static String[] A0L = {"", "XN01ItT2bHY64Udo8U0rv5VGSzBxMc17", "LZob5GHcOm1BKJQ2vQEKg44UBdoAB", "Ux8BYUlKxCzUFwXHW791pvzO", "", "EYpHAHesBPuZwNRi93BVygfvwpQNuwRz", "BndnCdJGei78P0VEYjqxuWcWalVGolEJ", "FxTwI"};
    public static final InterfaceC0907Gb A0M;
    public static final InterfaceC0934Hc A0N;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Metadata A06;
    public GY A07;
    public H1 A08;
    public H1 A09;
    public InterfaceC2060kk A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final C4J A0F;
    public final C0914Gi A0G;
    public final C0916Gk A0H;
    public final C0917Gl A0I;
    public final H1 A0J;

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0K = new byte[]{-78, -60, -64, -47, -62, -57, -60, -61, 127, -45, -50, -50, 127, -52, -64, -51, -40, 127, -63, -40, -45, -60, -46, -115, -27, -35, -42, -33};
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "rBULd6kp2sYKxjbrN7jKkVDhSodb4v28";
        strArr[6] = "gBWiztBtWh7JHxCzKYVaG6CraVXBuCHm";
    }

    static {
        A0B();
        A0M = new InterfaceC0907Gb() { // from class: com.facebook.ads.redexgen.X.kn
            @Override // com.facebook.ads.redexgen.core.InterfaceC0907Gb
            public final GX[] A5F() {
                return C2061kl.A0G();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC0907Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC0906Ga.A01(this, uri, map);
            }
        };
        A0N = new InterfaceC0934Hc() { // from class: com.facebook.ads.redexgen.X.km
            @Override // com.facebook.ads.redexgen.core.InterfaceC0934Hc
            public final boolean A6I(int i10, int i11, int i12, int i13, int i14) {
                return C2061kl.A0C(i10, i11, i12, i13, i14);
            }
        };
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C2061kl() {
        this(0);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C2061kl(int i10) {
        this(i10, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C2061kl(int i10, long j10) {
        this.A0D = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.A0E = j10;
        this.A0F = new C4J(10);
        this.A0I = new C0917Gl();
        this.A0G = new C0914Gi();
        this.A02 = -9223372036854775807L;
        this.A0H = new C0916Gk();
        this.A0J = new C2088lO();
        this.A08 = this.A0J;
    }

    public static int A00(C4J c4j, int i10) {
        if (c4j.A0A() >= i10 + 4) {
            c4j.A0f(i10);
            if (A0L[5].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A0L[3] = "hnNDf1WGfP5HptxyzX0WY3yEy4CiO";
            int iA0C = c4j.A0C();
            if (iA0C == 1483304551 || iA0C == 1231971951) {
                return iA0C;
            }
        }
        if (c4j.A0A() >= 40) {
            c4j.A0f(36);
            return c4j.A0C() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int A01(InterfaceC2087lN interfaceC2087lN) throws IOException {
        if (this.A01 == 0) {
            try {
                A0F(interfaceC2087lN, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A0A == null) {
            this.A0A = A07(interfaceC2087lN);
            this.A07.AIN(this.A0A);
            this.A08.A6W(new C2D().A11(this.A0I.A06).A0h(4096).A0b(this.A0I.A01).A0m(this.A0I.A03).A0d(this.A0G.A00).A0e(this.A0G.A01).A0v((this.A0D & 8) != 0 ? null : this.A06).A14());
            this.A03 = interfaceC2087lN.A8f();
        } else if (this.A03 != 0) {
            long jA8f = interfaceC2087lN.A8f();
            if (jA8f < this.A03) {
                interfaceC2087lN.AJJ((int) (this.A03 - jA8f));
            }
        }
        return A02(interfaceC2087lN);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int A02(InterfaceC2087lN interfaceC2087lN) throws IOException {
        if (this.A00 == 0) {
            interfaceC2087lN.AI1();
            if (A0E(interfaceC2087lN)) {
                return -1;
            }
            this.A0F.A0f(0);
            int iA0C = this.A0F.A0C();
            int sampleHeaderData = this.A01;
            if (A0D(iA0C, sampleHeaderData)) {
                int sampleHeaderData2 = AbstractC0918Gm.A00(iA0C);
                if (sampleHeaderData2 != -1) {
                    this.A0I.A00(iA0C);
                    if (this.A02 == -9223372036854775807L) {
                        this.A02 = this.A0A.A99(interfaceC2087lN.A8f());
                        if (this.A0E != -9223372036854775807L) {
                            this.A02 += this.A0E - this.A0A.A99(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0I.A02;
                    this.A00 = sampleHeaderData3;
                    if (this.A0A instanceof C07077t) {
                        C07077t c07077t = (C07077t) this.A0A;
                        long j10 = this.A04;
                        int sampleHeaderData4 = this.A0I.A04;
                        long jA03 = A03(j10 + ((long) sampleHeaderData4));
                        long jA8f = interfaceC2087lN.A8f();
                        int sampleHeaderData5 = this.A0I.A02;
                        c07077t.A01(jA03, jA8f + ((long) sampleHeaderData5));
                        if (this.A0C && c07077t.A02(this.A05)) {
                            this.A0C = false;
                            this.A08 = this.A09;
                        }
                    }
                }
            }
            interfaceC2087lN.AJJ(1);
            this.A01 = 0;
            return 0;
        }
        int iAI5 = this.A08.AI5(interfaceC2087lN, this.A00, true);
        if (iAI5 == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - iAI5;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A08.AIA(A03(this.A04), 1, this.A0I.A02, 0, null);
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        A0L[3] = "39D9RtME66Nzc4lHdRGQvnw";
        long j11 = this.A04;
        int bytesAppended3 = this.A0I.A04;
        this.A04 = j11 + ((long) bytesAppended3);
        this.A00 = 0;
        return 0;
    }

    private long A03(long j10) {
        return this.A02 + ((1000000 * j10) / ((long) this.A0I.A03));
    }

    public static long A04(Metadata metadata) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i10 = 0; i10 < iA02; i10++) {
                Metadata.Entry entryA03 = metadata.A03(i10);
                if ((entryA03 instanceof TextInformationFrame) && ((Id3Frame) ((TextInformationFrame) entryA03)).A00.equals(A09(24, 4, 101))) {
                    return AbstractC06104a.A0O(Long.parseLong(((TextInformationFrame) entryA03).A02.get(0)));
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private C07087u A05(InterfaceC2087lN interfaceC2087lN, boolean z10) throws IOException {
        interfaceC2087lN.AG9(this.A0F.A0l(), 0, 4);
        this.A0F.A0f(0);
        this.A0I.A00(this.A0F.A0C());
        return new C07087u(interfaceC2087lN.A8G(), interfaceC2087lN.A8f(), this.A0I, z10);
    }

    public static C07067s A06(Metadata metadata, long j10) {
        if (metadata != null) {
            int iA02 = metadata.A02();
            for (int i10 = 0; i10 < iA02; i10++) {
                Metadata.Entry entry = metadata.A03(i10);
                if (entry instanceof MlltFrame) {
                    return C07067s.A01(j10, (MlltFrame) entry, A04(metadata));
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    private InterfaceC2060kk A07(InterfaceC2087lN interfaceC2087lN) throws IOException {
        long durationUs;
        InterfaceC2060kk interfaceC2060kkA08 = A08(interfaceC2087lN);
        InterfaceC2060kk seekFrameSeeker = A06(this.A06, interfaceC2087lN.A8f());
        if (this.A0B) {
            return new C07057r();
        }
        InterfaceC2060kk c07077t = null;
        if ((this.A0D & 4) != 0) {
            long jA7b = -1;
            if (seekFrameSeeker != null) {
                durationUs = seekFrameSeeker.A7l();
                jA7b = seekFrameSeeker.A7b();
            } else if (interfaceC2060kkA08 != null) {
                durationUs = interfaceC2060kkA08.A7l();
                jA7b = interfaceC2060kkA08.A7b();
            } else {
                durationUs = A04(this.A06);
            }
            c07077t = new C07077t(durationUs, interfaceC2087lN.A8f(), jA7b);
        } else if (seekFrameSeeker != null) {
            c07077t = seekFrameSeeker;
        } else if (interfaceC2060kkA08 != null) {
            c07077t = interfaceC2060kkA08;
        }
        boolean z10 = true;
        String[] strArr = A0L;
        if (strArr[1].charAt(10) == strArr[6].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[7] = "puIT5";
        strArr2[4] = "";
        if (c07077t == null || (!c07077t.AAa() && (this.A0D & 1) != 0)) {
            int i10 = this.A0D;
            if (A0L[5].charAt(24) != 'i') {
                String[] strArr3 = A0L;
                strArr3[7] = "yAfIM";
                strArr3[4] = "";
                if ((i10 & 2) == 0) {
                    z10 = false;
                }
            } else {
                A0L[5] = "MGo95V6JQFDSGlQkmGWT48KfEqhrmySi";
                if ((i10 & 2) == 0) {
                    z10 = false;
                }
            }
            return A05(interfaceC2087lN, z10);
        }
        return c07077t;
    }

    private InterfaceC2060kk A08(InterfaceC2087lN interfaceC2087lN) throws IOException {
        C4J c4j = new C4J(this.A0I.A02);
        interfaceC2087lN.AG9(c4j.A0l(), 0, this.A0I.A02);
        int i10 = 21;
        if ((this.A0I.A05 & 1) != 0) {
            if (this.A0I.A01 != 1) {
                i10 = 36;
            }
        } else if (this.A0I.A01 == 1) {
            i10 = 13;
        }
        int iA00 = A00(c4j, i10);
        if (iA00 == 1483304551 || iA00 == 1231971951) {
            C07017n c07017nA01 = C07017n.A01(interfaceC2087lN.A8G(), interfaceC2087lN.A8f(), this.A0I, c4j);
            if (c07017nA01 != null && !this.A0G.A03()) {
                interfaceC2087lN.AI1();
                interfaceC2087lN.A3z(i10 + 141);
                C4J frame = this.A0F;
                interfaceC2087lN.AG9(frame.A0l(), 0, 3);
                C4J frame2 = this.A0F;
                frame2.A0f(0);
                C0914Gi c0914Gi = this.A0G;
                C4J frame3 = this.A0F;
                c0914Gi.A04(frame3.A0K());
            }
            interfaceC2087lN.AJJ(this.A0I.A02);
            if (c07017nA01 != null && !c07017nA01.AAa() && iA00 == 1231971951) {
                C07087u c07087uA05 = A05(interfaceC2087lN, false);
                String[] strArr = A0L;
                String str = strArr[7];
                String str2 = strArr[4];
                int xingBase = str.length();
                if (xingBase == str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[1] = "bGvlWKvJjPQrySHefRGmEijHbVzYOxUK";
                strArr2[6] = "fU58RXvZc6f3KsNNOCISAUQgLzoCeDCK";
                return c07087uA05;
            }
            return c07017nA01;
        }
        if (iA00 == 1447187017) {
            C07047q c07047qA00 = C07047q.A00(interfaceC2087lN.A8G(), interfaceC2087lN.A8f(), this.A0I, c4j);
            interfaceC2087lN.AJJ(this.A0I.A02);
            return c07047qA00;
        }
        interfaceC2087lN.AI1();
        return null;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void A0A() {
        C3M.A02(this.A09);
    }

    public static /* synthetic */ boolean A0C(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 == 77) {
                if (A0L[5].charAt(24) == 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[2] = "NxAl2v4obD3CfxY1bwrYNdaYMjSl6";
                strArr[0] = "";
                if (i12 != 76 || i13 != 76 || (i14 != 84 && i10 != 2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0D(int i10, long j10) {
        return ((long) ((-128000) & i10)) == ((-128000) & j10);
    }

    private boolean A0E(InterfaceC2087lN interfaceC2087lN) throws IOException {
        if (this.A0A != null) {
            long jA7b = this.A0A.A7b();
            if (jA7b != -1) {
                long dataEndPosition = interfaceC2087lN.A8a();
                if (dataEndPosition > jA7b - 4) {
                    return true;
                }
            }
        }
        try {
            return !interfaceC2087lN.AGA(this.A0F.A0l(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A0F(InterfaceC2087lN interfaceC2087lN, boolean z10) throws IOException {
        int candidateSynchronizedHeaderData;
        int i10 = 0;
        int i11 = 0;
        int iA8a = 0;
        int searchedBytes = 0;
        int headerData = z10 ? 32768 : 131072;
        interfaceC2087lN.AI1();
        if (interfaceC2087lN.A8f() == 0) {
            int validFrameCount = this.A0D;
            int validFrameCount2 = (validFrameCount & 8) == 0 ? 1 : 0;
            this.A06 = this.A0H.A00(interfaceC2087lN, validFrameCount2 != 0 ? null : A0N);
            if (this.A06 != null) {
                this.A0G.A05(this.A06);
            }
            iA8a = (int) interfaceC2087lN.A8a();
            if (!z10) {
                interfaceC2087lN.AJJ(iA8a);
            }
        }
        while (true) {
            if (A0E(interfaceC2087lN)) {
                if (i10 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.A0F.A0f(0);
            int iA0C = this.A0F.A0C();
            if ((i11 != 0 && !A0D(iA0C, i11)) || (candidateSynchronizedHeaderData = AbstractC0918Gm.A00(iA0C)) == -1) {
                int candidateSynchronizedHeaderData2 = searchedBytes + 1;
                if (searchedBytes == headerData) {
                    if (z10) {
                        return false;
                    }
                    throw C05662i.A01(A09(0, 24, 51), null);
                }
                i10 = 0;
                i11 = 0;
                if (z10) {
                    interfaceC2087lN.AI1();
                    int validFrameCount3 = iA8a + candidateSynchronizedHeaderData2;
                    interfaceC2087lN.A3z(validFrameCount3);
                } else {
                    interfaceC2087lN.AJJ(1);
                }
                searchedBytes = candidateSynchronizedHeaderData2;
            } else {
                i10++;
                if (i10 == 1) {
                    this.A0I.A00(iA0C);
                    i11 = iA0C;
                } else if (i10 == 4) {
                    break;
                }
                int validFrameCount4 = candidateSynchronizedHeaderData - 4;
                interfaceC2087lN.A3z(validFrameCount4);
            }
        }
        if (z10) {
            interfaceC2087lN.AJJ(iA8a + searchedBytes);
        } else {
            interfaceC2087lN.AI1();
        }
        this.A01 = i11;
        if (A0L[5].charAt(24) == 105) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[7] = "Yv6sT";
        strArr[4] = "";
        return true;
    }

    public static /* synthetic */ GX[] A0G() {
        return new GX[]{new C2061kl()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A07 = gy;
        this.A09 = this.A07.AJh(0, 1);
        this.A08 = this.A09;
        this.A07.A6G();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2087lN interfaceC2087lN, C0925Gt c0925Gt) throws IOException {
        A0A();
        int iA01 = A01(interfaceC2087lN);
        if (iA01 == -1 && (this.A0A instanceof C07077t)) {
            long jA03 = A03(this.A04);
            long durationUs = this.A0A.A7l();
            if (durationUs != jA03) {
                ((C07077t) this.A0A).A00(jA03);
                this.A07.AIN(this.A0A);
            }
        }
        return iA01;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j11;
        if ((this.A0A instanceof C07077t) && !((C07077t) this.A0A).A02(j11)) {
            this.A0C = true;
            this.A08 = this.A0J;
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2087lN interfaceC2087lN) throws IOException {
        return A0F(interfaceC2087lN, true);
    }
}
