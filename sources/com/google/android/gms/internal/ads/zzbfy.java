package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbfy {
    final long zza;
    final String zzb;
    final int zzc;

    zzbfy(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbfy)) {
            return false;
        }
        zzbfy zzbfyVar = (zzbfy) obj;
        return zzbfyVar.zza == this.zza && zzbfyVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
