package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaqu implements zzari {
    private final zzaqt zza;
    private final zzet zzb = new zzet(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaqu(zzaqt zzaqtVar) {
        this.zza = zzaqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zza(zzfi zzfiVar, zzagb zzagbVar, zzarh zzarhVar) {
        this.zza.zza(zzfiVar, zzagbVar, zzarhVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzc(zzet zzetVar, int i10) {
        int iZzg;
        int i11 = i10 & 1;
        if (i11 != 0) {
            iZzg = zzetVar.zzg() + zzetVar.zzs();
        } else {
            iZzg = -1;
        }
        if (this.zzf) {
            if (i11 == 0) {
                return;
            }
            this.zzf = false;
            zzetVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzetVar.zzd() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iZzs = zzetVar.zzs();
                    zzetVar.zzh(zzetVar.zzg() - 1);
                    if (iZzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzetVar.zzd(), 3 - this.zzd);
                zzet zzetVar2 = this.zzb;
                zzetVar.zzm(zzetVar2.zzi(), this.zzd, iMin);
                int i13 = this.zzd + iMin;
                this.zzd = i13;
                if (i13 == 3) {
                    zzetVar2.zzh(0);
                    zzetVar2.zzf(3);
                    zzetVar2.zzk(1);
                    int iZzs2 = zzetVar2.zzs();
                    boolean z10 = (iZzs2 & 128) != 0;
                    int iZzs3 = zzetVar2.zzs();
                    this.zze = z10;
                    this.zzc = (((iZzs2 & 15) << 8) | iZzs3) + 3;
                    int iZzj = zzetVar2.zzj();
                    int i14 = this.zzc;
                    if (iZzj < i14) {
                        int iZzj2 = zzetVar2.zzj();
                        zzetVar2.zzc(Math.min(4098, Math.max(i14, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzetVar.zzd(), this.zzc - this.zzd);
                zzet zzetVar3 = this.zzb;
                zzetVar.zzm(zzetVar3.zzi(), this.zzd, iMin2);
                int i15 = this.zzd + iMin2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzetVar3.zzf(i16);
                    } else {
                        if (zzfl.zzJ(zzetVar3.zzi(), 0, i16, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzetVar3.zzf(this.zzc - 4);
                    }
                    zzetVar3.zzh(0);
                    this.zza.zzb(zzetVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
