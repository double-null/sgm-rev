package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgjz extends RuntimeException {
    zzgjz(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 3);
        sb2.append("r: ");
        sb2.append(i10);
        super(sb2.toString());
    }
}
