package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzig extends zzie {
    public final int zzc;

    public zzig(int i10, String str, IOException iOException, Map map, zzht zzhtVar, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append("Response code: ");
        sb2.append(i10);
        super(sb2.toString(), iOException, zzhtVar, 2004, 1);
        this.zzc = i10;
    }
}
