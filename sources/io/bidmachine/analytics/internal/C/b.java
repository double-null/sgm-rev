package io.bidmachine.analytics.internal.C;

import java.util.Date;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[io.bidmachine.analytics.internal.g.a.values().length];
            try {
                iArr[io.bidmachine.analytics.internal.g.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[io.bidmachine.analytics.internal.g.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[io.bidmachine.analytics.internal.g.a.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[io.bidmachine.analytics.internal.g.a.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[io.bidmachine.analytics.internal.g.g.values().length];
            try {
                iArr2[io.bidmachine.analytics.internal.g.g.PRECISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[io.bidmachine.analytics.internal.g.g.ESTIMATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final long a(io.bidmachine.analytics.internal.g.c cVar) {
        return (cVar.c() - (cVar.c() % ((long) 1000))) - kd.c.c(cVar.d() * 1000000000000L);
    }

    public static final io.bidmachine.analytics.internal.C.a b(io.bidmachine.analytics.internal.g.c cVar) {
        return new io.bidmachine.analytics.internal.C.a(cVar.b(), cVar.f(), io.bidmachine.analytics.internal.E.e.a(new Date(cVar.c())), a(cVar.a()), a(cVar), a(cVar.e()));
    }

    private static final int a(io.bidmachine.analytics.internal.g.a aVar) {
        int i10 = a.$EnumSwitchMapping$0[aVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i11;
    }

    private static final int a(io.bidmachine.analytics.internal.g.g gVar) {
        int i10 = a.$EnumSwitchMapping$1[gVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i11;
    }
}
