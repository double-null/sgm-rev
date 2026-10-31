package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1533bu {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1532bt>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1532bt>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1532bt A01(C1621dL c1621dL, AbstractC1896hy abstractC1896hy, int i10, InterfaceC1530br interfaceC1530br) {
        C1532bt c1532bt = new C1532bt(c1621dL, abstractC1896hy, c1621dL.A02().A0A(), i10);
        c1532bt.A0b(interfaceC1530br);
        c1532bt.A0X();
        A01.put(abstractC1896hy.A17(), new WeakReference<>(c1532bt));
        return c1532bt;
    }

    public static C1532bt A02(String str) {
        WeakReference<C1532bt> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1896hy abstractC1896hy, C1532bt c1532bt) {
        A01.put(abstractC1896hy.A17(), new WeakReference<>(c1532bt));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
