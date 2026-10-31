package com.google.android.gms.internal.base;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zad {
    public static final Feature zaa;
    public static final Feature zab;
    public static final Feature zac;
    public static final Feature[] zad;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", 1L, true);
        zaa = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", 1L, true);
        zab = feature2;
        Feature feature3 = new Feature("CLIENT_THROTTLING_TELEMETRY", 1L, true);
        zac = feature3;
        zad = new Feature[]{feature, feature2, feature3};
    }
}
