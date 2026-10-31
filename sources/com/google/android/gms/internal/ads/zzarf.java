package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzarf {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzarf(int i10, String str, int i11, List list, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
        this.zzd = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i10 = this.zzc;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
