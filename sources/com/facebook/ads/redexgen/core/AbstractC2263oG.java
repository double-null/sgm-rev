package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2263oG<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oG != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC2263oG() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oG != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC2263oG(C0754Ab c0754Ab) {
        this();
    }

    public static AbstractC2262oF<Object> A00(int expectedKeys) {
        AbstractC2110ll.A00(expectedKeys, A03(0, 12, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
        return new C0754Ab(expectedKeys);
    }

    public static <K0> AbstractC2262oF<K0> A01(Comparator<K0> comparator) {
        AbstractC1963jA.A04(comparator);
        return new AZ(comparator);
    }

    public static AbstractC2262oF<Comparable> A02() {
        return A01(AbstractC2277oV.A03());
    }
}
