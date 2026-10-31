package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1313Vy {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C1313Vy> A02 = new ThreadLocal<>();
    public final C1296Vh A00 = new C1296Vh();

    public static C1296Vh A00() {
        return A02().A00;
    }

    public static C1296Vh A01(C1312Vx c1312Vx) {
        C1296Vh currentStackTraces = new C1296Vh(A00());
        currentStackTraces.add(c1312Vx);
        return currentStackTraces;
    }

    public static C1313Vy A02() {
        C1313Vy c1313Vy = A02.get();
        if (c1313Vy == null) {
            C1313Vy c1313Vy2 = new C1313Vy();
            A02.set(c1313Vy2);
            return c1313Vy2;
        }
        return c1313Vy;
    }

    public static void A03(AbstractRunnableC1308Vt abstractRunnableC1308Vt) {
        C1296Vh c1296VhA06 = abstractRunnableC1308Vt.A06();
        if (c1296VhA06 != null) {
            C1296Vh createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(c1296VhA06);
        }
    }

    public static void A04(AbstractRunnableC1308Vt abstractRunnableC1308Vt) {
        C1296Vh c1296VhA06 = abstractRunnableC1308Vt.A06();
        if (c1296VhA06 != null) {
            C1296Vh c1296Vh = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c1296Vh.removeAll(c1296VhA06);
        }
    }
}
