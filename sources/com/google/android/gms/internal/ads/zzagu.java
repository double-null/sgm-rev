package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagu implements zzahb {
    private final zzeh zza;
    private final zzeh zzb;
    private long zzc;

    public zzagu(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzgtj.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzeh(length2);
            this.zzb = new zzeh(length2);
        } else {
            int i10 = length2 + 1;
            zzeh zzehVar = new zzeh(i10);
            this.zza = zzehVar;
            zzeh zzehVar2 = new zzeh(i10);
            this.zzb = zzehVar2;
            zzehVar.zza(0L);
            zzehVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        zzeh zzehVar = this.zzb;
        if (zzehVar.zzd() == 0) {
            zzahc zzahcVar = zzahc.zza;
            return new zzagz(zzahcVar, zzahcVar);
        }
        int iZzp = zzfl.zzp(zzehVar, j10, true, true);
        long jZzc = zzehVar.zzc(iZzp);
        zzeh zzehVar2 = this.zza;
        zzahc zzahcVar2 = new zzahc(jZzc, zzehVar2.zzc(iZzp));
        if (zzahcVar2.zzb == j10 || iZzp == zzehVar.zzd() - 1) {
            return new zzagz(zzahcVar2, zzahcVar2);
        }
        int i10 = iZzp + 1;
        return new zzagz(zzahcVar2, new zzahc(zzehVar.zzc(i10), zzehVar2.zzc(i10)));
    }
}
