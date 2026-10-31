package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpt {
    final /* synthetic */ zzpu zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzxk zze;
    private boolean zzf;
    private boolean zzg;

    public zzpt(zzpu zzpuVar, String str, int i10, zzxk zzxkVar) {
        Objects.requireNonNull(zzpuVar);
        this.zza = zzpuVar;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zzxkVar == null ? -1L : zzxkVar.zzd;
        if (zzxkVar == null || !zzxkVar.zzb()) {
            return;
        }
        this.zze = zzxkVar;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i10 = this.zzc;
        if (i10 < zzbfVar.zza()) {
            zzpu zzpuVar = this.zza;
            zzbfVar.zzb(i10, zzpuVar.zzj(), 0L);
            int i11 = zzpuVar.zzj().zzn;
            while (true) {
                if (i11 > zzpuVar.zzj().zzo) {
                    i10 = -1;
                    break;
                }
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i11));
                if (iZze != -1) {
                    i10 = zzbfVar2.zzd(iZze, zzpuVar.zzk(), false).zzc;
                    break;
                }
                i11++;
            }
        } else if (i10 >= zzbfVar2.zza()) {
            i10 = -1;
            break;
        }
        this.zzc = i10;
        if (i10 == -1) {
            return false;
        }
        zzxk zzxkVar = this.zze;
        return zzxkVar == null || zzbfVar2.zze(zzxkVar.zza) != -1;
    }

    public final boolean zzb(int i10, zzxk zzxkVar) {
        if (zzxkVar != null) {
            long j10 = zzxkVar.zzd;
            if (j10 != -1) {
                zzxk zzxkVar2 = this.zze;
                if (zzxkVar2 == null) {
                    return !zzxkVar.zzb() && j10 == this.zzd;
                }
                return j10 == zzxkVar2.zzd && zzxkVar.zzb == zzxkVar2.zzb && zzxkVar.zzc == zzxkVar2.zzc;
            }
        }
        return i10 == this.zzc;
    }

    public final void zzc(int i10, zzxk zzxkVar) {
        if (this.zzd == -1 && i10 == this.zzc && zzxkVar != null) {
            zzpu zzpuVar = this.zza;
            long j10 = zzxkVar.zzd;
            if (j10 >= zzpuVar.zzi()) {
                this.zzd = j10;
            }
        }
    }

    public final boolean zzd(zznn zznnVar) {
        zzxk zzxkVar = zznnVar.zzd;
        if (zzxkVar == null) {
            return this.zzc != zznnVar.zzc;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        long j11 = zzxkVar.zzd;
        if (j11 > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zznnVar.zzb;
        int iZze = zzbfVar.zze(zzxkVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzxk zzxkVar2 = this.zze;
        if (j11 < zzxkVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzxkVar.zzb()) {
            int i10 = zzxkVar.zze;
            return i10 == -1 || i10 > zzxkVar2.zzb;
        }
        int i11 = zzxkVar.zzb;
        int i12 = zzxkVar.zzc;
        int i13 = zzxkVar2.zzb;
        if (i11 <= i13) {
            return i11 == i13 && i12 > zzxkVar2.zzc;
        }
        return true;
    }

    final /* synthetic */ String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzxk zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z10) {
        this.zzf = true;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(boolean z10) {
        this.zzg = true;
    }
}
