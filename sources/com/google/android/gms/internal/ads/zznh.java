package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznh {
    public static final zznh zza = new zznh(new zzng());
    public final zzgww zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zznh(zzng zzngVar) {
        this.zzb = zzngVar.zza();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zznh) && this.zzb.equals(((zznh) obj).zzb);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.zzb, null, null, bool, bool, bool, bool, bool);
    }
}
