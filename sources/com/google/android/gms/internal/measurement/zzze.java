package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzze {
    public static /* synthetic */ boolean zza(int i10, zzyc zzycVar, StringBuilder sb2) {
        if (i10 - 1 != 0 || zzycVar == zzyc.zza) {
            return false;
        }
        sb2.append(zzycVar.zza());
        sb2.append('.');
        sb2.append(zzycVar.zzb());
        sb2.append(':');
        sb2.append(zzycVar.zzc());
        return true;
    }
}
