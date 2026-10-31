package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC06987k extends AbstractC2218nW<C06977j, AbstractC06967i, C2036kM> implements InterfaceC2037kN {
    public static byte[] A01;
    public static String[] A02 = {"gN8", "v0q6HziqC5r28rLi1ZsQmD2OK0fgspik", "XftI4eRfVNg33Op0jQPz8O6PbCkMHbWE", "SdzNGuU6dc81VqISrLBD", "AmzsDcSyCxTNGO", "BjhKb3Az99p878kvj1gxEmyEzdFIjRD", "VkdZ1nUYKY17rCLbk1Npuh3A0WHSXOLE", "WDjquUi0atGhsKhHWhKEDeyGOzHRt12i"};
    public final String A00;

    public static String A0L(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
            if (A02[0].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "7OO3CpMfw2stGNBOXFHDwltwdlKTQaUN";
            strArr[7] = "XdJDd6VP529P2X7c3MAKusUlyNrjc2WF";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        if (A02[0].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "V56IsTeJwH5mFHCmn3IS5snx7jCRlGG";
        strArr[4] = "owU73l6HwKvTqc";
        A01 = new byte[]{28, 53, 44, Utf8.REPLACEMENT_BYTE, 55, 44, 42, 59, 44, 43, -25, 43, 44, 42, 54, 43, 44, -25, 44, 57, 57, 54, 57};
    }

    public abstract J7 A0g(byte[] bArr, int i10, boolean z10) throws C2036kM;

    static {
        A0M();
    }

    public AbstractC06987k(String str) {
        super(new C06977j[2], new AbstractC06967i[2]);
        this.A00 = str;
        A0d(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0w] */
    @Override // com.facebook.ads.redexgen.core.AbstractC2218nW
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C05300w A0c() {
        return new AbstractC06967i(this) { // from class: com.facebook.ads.redexgen.X.0w
            public final AbstractC06987k A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC06967i, com.facebook.ads.redexgen.core.AbstractC2219nX
            public final void A0B() {
                this.A00.A0h(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2218nW
    /* JADX INFO: renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public final C2036kM A0Y(C06977j c06977j, AbstractC06967i abstractC06967i, boolean z10) {
        try {
            ByteBuffer inputData = (ByteBuffer) C3M.A01(c06977j.A02);
            abstractC06967i.A0C(c06977j.A01, A0g(inputData.array(), inputData.limit(), z10), c06977j.A00);
            abstractC06967i.A01(Integer.MIN_VALUE);
            return null;
        } catch (C2036kM e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2218nW
    /* JADX INFO: renamed from: A0J, reason: merged with bridge method [inline-methods] */
    public final C2036kM A0Z(Throwable th) {
        return new C2036kM(A0L(0, 23, 99), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2218nW
    /* JADX INFO: renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public final C06977j A0a() {
        return new C06977j();
    }

    public final void A0h(AbstractC06967i abstractC06967i) {
        super.A0f(abstractC06967i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2037kN
    public final void AIx(long j10) {
    }
}
