package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwu implements zzze {
    private final zzgwm zza;
    private long zzb;

    public zzwu(List list, List list2) {
        int i10 = zzgwm.zzd;
        zzgwj zzgwjVar = new zzgwj();
        zzgtj.zza(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgwjVar.zzf(new zzwt((zzze) list.get(i11), (List) list2.get(i11)));
        }
        this.zza = zzgwjVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzg(long j10) {
        int i10 = 0;
        while (true) {
            zzgwm zzgwmVar = this.zza;
            if (i10 >= zzgwmVar.size()) {
                return;
            }
            ((zzwt) zzgwmVar.get(i10)).zzg(j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgwm zzgwmVar = this.zza;
            if (i10 >= zzgwmVar.size()) {
                break;
            }
            zzwt zzwtVar = (zzwt) zzgwmVar.get(i10);
            long jZzi = zzwtVar.zzi();
            if ((zzwtVar.zza().contains(1) || zzwtVar.zza().contains(2) || zzwtVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.zzb;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgwm zzgwmVar = this.zza;
            if (i10 >= zzgwmVar.size()) {
                break;
            }
            long jZzl = ((zzwt) zzgwmVar.get(i10)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final boolean zzm(zzma zzmaVar) {
        boolean zZzm;
        boolean z10 = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zZzm = false;
            while (true) {
                zzgwm zzgwmVar = this.zza;
                if (i10 >= zzgwmVar.size()) {
                    break;
                }
                long jZzl2 = ((zzwt) zzgwmVar.get(i10)).zzl();
                boolean z11 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzmaVar.zza;
                if (jZzl2 == jZzl || z11) {
                    zZzm |= ((zzwt) zzgwmVar.get(i10)).zzm(zzmaVar);
                }
                i10++;
            }
            z10 |= zZzm;
        } while (zZzm);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        int i10 = 0;
        while (true) {
            zzgwm zzgwmVar = this.zza;
            if (i10 >= zzgwmVar.size()) {
                return false;
            }
            if (((zzwt) zzgwmVar.get(i10)).zzn()) {
                return true;
            }
            i10++;
        }
    }
}
