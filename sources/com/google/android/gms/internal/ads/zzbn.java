package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzgwm.zzi());
    private final zzgwm zzb;

    static {
        String str = zzfl.zza;
        Integer.toString(0, 36);
    }

    public zzbn(List list) {
        this.zzb = zzgwm.zzq(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgwm zza() {
        return this.zzb;
    }

    public final boolean zzb(int i10) {
        int i11 = 0;
        while (true) {
            zzgwm zzgwmVar = this.zzb;
            if (i11 >= zzgwmVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgwmVar.get(i11);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i10) {
                return true;
            }
            i11++;
        }
    }
}
