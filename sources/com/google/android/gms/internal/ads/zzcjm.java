package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcjm implements zzly {
    private final zzabr zza = new zzabr(true, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcjm() {
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zza(zzqf zzqfVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzb(zzlx zzlxVar, zzzn zzznVar, zzaba[] zzabaVarArr) {
        int i10;
        this.zzf = 0;
        for (zzaba zzabaVar : zzabaVarArr) {
            if (zzabaVar != null) {
                int i11 = this.zzf;
                int i12 = zzabaVar.zza().zzc;
                if (i12 == 0) {
                    i10 = 144310272;
                } else if (i12 == 1) {
                    i10 = 13107200;
                } else if (i12 != 2) {
                    i10 = 131072;
                    if (i12 != 3 && i12 != 5 && i12 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i10 = 131072000;
                }
                this.zzf = i11 + i10;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzc(zzqf zzqfVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzd(zzqf zzqfVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final zzabl zze(zzqf zzqfVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final long zzf(zzqf zzqfVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzg(zzqf zzqfVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzh(zzlx zzlxVar) {
        char c10;
        long j10 = zzlxVar.zze;
        boolean z10 = true;
        if (j10 > this.zzc) {
            c10 = 0;
        } else {
            c10 = j10 < this.zzb ? (char) 2 : (char) 1;
        }
        int iZzg = this.zza.zzg();
        int i10 = this.zzf;
        if (c10 != 2 && (c10 != 1 || !this.zzg || iZzg >= i10)) {
            z10 = false;
        }
        this.zzg = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzi(zzlx zzlxVar) {
        long j10 = zzlxVar.zzg ? this.zze : this.zzd;
        return j10 <= 0 || zzlxVar.zze >= j10;
    }

    public final synchronized void zzk(int i10) {
        this.zzb = ((long) i10) * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zzc = ((long) i10) * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzd = ((long) i10) * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zze = ((long) i10) * 1000;
    }

    final void zzo(boolean z10) {
        this.zzf = 0;
        this.zzg = false;
        if (z10) {
            this.zza.zze();
        }
    }
}
