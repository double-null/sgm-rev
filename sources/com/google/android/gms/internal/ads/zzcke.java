package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcke extends zzie {
    public zzcke(int i10, Map map, zzht zzhtVar, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append("Response code: ");
        sb2.append(i10);
        super(sb2.toString(), zzhtVar, 2000, i11);
    }
}
