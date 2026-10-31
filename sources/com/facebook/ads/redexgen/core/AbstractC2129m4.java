package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2129m4 {
    public static final AbstractC2129m4 A00 = new B0();
    public static final AbstractC2129m4 A02 = new C0769Aq(-1);
    public static final AbstractC2129m4 A01 = new C0769Aq(1);

    public abstract int A05();

    public abstract AbstractC2129m4 A06(int left, int right);

    public abstract AbstractC2129m4 A07(long left, long right);

    public abstract <T> AbstractC2129m4 A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC2129m4 A09(boolean left, boolean right);

    public abstract AbstractC2129m4 A0A(boolean left, boolean right);

    public AbstractC2129m4() {
    }

    public /* synthetic */ AbstractC2129m4(B0 b10) {
        this();
    }

    public static AbstractC2129m4 A01() {
        return A00;
    }
}
