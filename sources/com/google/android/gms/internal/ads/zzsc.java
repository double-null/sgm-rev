package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsc extends Exception {
    public zzsc(long j10, long j11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j10).length());
        sb2.append("Unexpected audio track timestamp discontinuity: expected ");
        sb2.append(j11);
        sb2.append(", got ");
        sb2.append(j10);
        super(sb2.toString());
    }
}
