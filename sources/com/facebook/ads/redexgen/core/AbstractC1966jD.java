package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1966jD {
    public static byte[] A00;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> InterfaceC1964jB<T> A00(InterfaceC1964jB<? super T> first, InterfaceC1964jB<? super T> second) {
        return new BR(A04((InterfaceC1964jB) AbstractC1963jA.A04(first), (InterfaceC1964jB) AbstractC1963jA.A04(second)));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static String A02(String methodName, Iterable<?> components) {
        StringBuilder sbAppend = new StringBuilder(A01(0, 11, 124)).append(methodName).append('(');
        boolean z10 = true;
        for (Object obj : components) {
            if (!z10) {
                sbAppend.append(',');
            }
            sbAppend.append(obj);
            z10 = false;
        }
        return sbAppend.append(')').toString();
    }

    public static void A05() {
        A00 = new byte[]{59, 93, 80, 79, 84, 78, 76, 95, 80, 94, 25};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jB != com.google.common.base.Predicate<? super T> */
    public static <T> List<InterfaceC1964jB<? super T>> A04(InterfaceC1964jB<? super T> first, InterfaceC1964jB<? super T> second) {
        return Arrays.asList(first, second);
    }
}
