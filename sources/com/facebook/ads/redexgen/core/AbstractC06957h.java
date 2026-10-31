package com.facebook.ads.redexgen.core;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC06957h implements InterfaceC2037kN {
    public static String[] A06 = {"A1ZwXb6JdBVxSPYV1ZzpyUVQy2gRfJA9", "vkvPFBYHwcZnb4NzphHjmgFJFbjiYwSo", "W7sj7Up3ABI8RZFTAAZOEHe7srfTkl57", "fls3PiASqtk6GqNgTZFqwBZFoYeyHn2V", "1yDmXHBn42mad7W8CPx8A7RWKYn1BqT7", "CjPJSc8sfbO2R56Y3Yx9Z137FYjSqvlb", "2KSypf5DjPiLYF3nQ7brfSsHONTUzR5A", "k5ePLg8NJJ"};
    public long A00;
    public long A01;
    public C05270t A02;
    public final ArrayDeque<C05270t> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC06967i> A04;
    public final PriorityQueue<C05270t> A05;

    public abstract C2032kI A0Z();

    public abstract void A0b(C06977j c06977j);

    public abstract boolean A0d();

    public AbstractC06957h() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new C05270t());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque<AbstractC06967i> arrayDeque = this.A04;
            final C5S c5s = new C5S() { // from class: com.facebook.ads.redexgen.X.kL
                @Override // com.facebook.ads.redexgen.core.C5S
                public final void AGz(AbstractC2219nX abstractC2219nX) {
                    this.A00.A0c((C05260s) abstractC2219nX);
                }
            };
            arrayDeque.add(new AbstractC06967i(c5s) { // from class: com.facebook.ads.redexgen.X.0s
                public C5S<C05260s> A00;

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5S != com.facebook.ads.androidx.media3.decoder.DecoderOutputBuffer$Owner<com.facebook.ads.androidx.media3.extractor.text.cea.CeaDecoder$CeaOutputBuffer> */
                {
                    this.A00 = c5s;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC06967i, com.facebook.ads.redexgen.core.AbstractC2219nX
                public final void A0B() {
                    this.A00.AGz(this);
                }
            });
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0U(C05270t c05270t) {
        c05270t.A0A();
        this.A03.add(c05270t);
    }

    public final long A0V() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    /* JADX INFO: renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public C06977j A5j() throws C2036kM {
        C3M.A08(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    /* JADX INFO: renamed from: A0X */
    public AbstractC06967i A5l() throws C2036kM {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (true) {
            boolean zIsEmpty = this.A05.isEmpty();
            if (A06[5].charAt(7) != 's') {
                throw new RuntimeException();
            }
            A06[6] = "DOprmnWJZ9SCRw8WSrP7EOY5DTOSvJmV";
            if (!zIsEmpty) {
                C05270t c05270tPeek = this.A05.peek();
                if (A06[7].length() != 10) {
                    throw new RuntimeException();
                }
                A06[2] = "urX0HrInINzEpwrp6LaPdmgGjQDQJQna";
                if (((C05270t) AbstractC06104a.A0f(c05270tPeek)).A01 <= this.A00) {
                    C05270t c05270t = (C05270t) AbstractC06104a.A0f(this.A05.poll());
                    if (c05270t.A05()) {
                        AbstractC06967i abstractC06967i = (AbstractC06967i) AbstractC06104a.A0f(this.A04.pollFirst());
                        abstractC06967i.A00(4);
                        A0U(c05270t);
                        String[] strArr = A06;
                        if (strArr[4].charAt(25) != strArr[3].charAt(25)) {
                            return abstractC06967i;
                        }
                        String[] strArr2 = A06;
                        strArr2[4] = "oxl05cpa7UEpdlHPP7s3uyaLsYMYJfaH";
                        strArr2[3] = "7KvbtL7fQFgbKwZtHueu0Zl9fYEN12Vy";
                        return abstractC06967i;
                    }
                    A0b(c05270t);
                    if (A0d()) {
                        C2032kI c2032kIA0Z = A0Z();
                        AbstractC06967i abstractC06967i2 = (AbstractC06967i) AbstractC06104a.A0f(this.A04.pollFirst());
                        long j10 = c05270t.A01;
                        String[] strArr3 = A06;
                        if (strArr3[4].charAt(25) != strArr3[3].charAt(25)) {
                            throw new RuntimeException();
                        }
                        A06[5] = "oIgvRTusAdocLQHm4RFtRlwv19XF7U3W";
                        abstractC06967i2.A0C(j10, c2032kIA0Z, Long.MAX_VALUE);
                        A0U(c05270t);
                        return abstractC06967i2;
                    }
                    A0U(c05270t);
                }
            }
            return null;
        }
    }

    public final AbstractC06967i A0Y() {
        return this.A04.pollFirst();
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    /* JADX INFO: renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public void AGZ(C06977j c06977j) throws C2036kM {
        C3M.A07(c06977j == this.A02);
        C05270t c05270t = (C05270t) c06977j;
        if (c05270t.A04()) {
            A0U(c05270t);
        } else {
            long j10 = this.A01;
            this.A01 = 1 + j10;
            c05270t.A00 = j10;
            this.A05.add(c05270t);
        }
        if (A06[7].length() != 10) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "rj1eyhsOe6SuoM1rYy40tvsoNCkJE80J";
        strArr[1] = "ibYLffFAaVDMN4cD1vowu1tbJEM8Lkom";
        this.A02 = null;
    }

    public final void A0c(AbstractC06967i abstractC06967i) {
        abstractC06967i.A0A();
        this.A04.add(abstractC06967i);
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    public void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2037kN
    public void AIx(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0U((C05270t) AbstractC06104a.A0f(this.A05.poll()));
        }
        if (this.A02 != null) {
            A0U(this.A02);
            this.A02 = null;
        }
    }
}
