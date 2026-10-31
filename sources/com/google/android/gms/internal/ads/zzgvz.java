package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgvz {
    private static final zzgvz zza = new zzgvx();
    private static final zzgvz zzb = new zzgvy(-1);
    private static final zzgvz zzc = new zzgvy(1);

    /* synthetic */ zzgvz(byte[] bArr) {
    }

    public static zzgvz zzg() {
        return zza;
    }

    public abstract zzgvz zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgvz zzb(int i10, int i11);

    public abstract zzgvz zzc(boolean z10, boolean z11);

    public abstract zzgvz zzd(boolean z10, boolean z11);

    public abstract int zze();
}
