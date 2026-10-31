package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzain extends zzaim {
    private final zzet zzb;
    private final zzet zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzain(zzahk zzahkVar) {
        super(zzahkVar);
        this.zzb = new zzet(zzgp.zza);
        this.zzc = new zzet(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zza(zzet zzetVar) throws zzail {
        int iZzs = zzetVar.zzs();
        int i10 = iZzs >> 4;
        int i11 = iZzs & 15;
        if (i11 == 7) {
            this.zzg = i10;
            return i10 != 5;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 28);
        sb2.append("Video format not supported: ");
        sb2.append(i11);
        throw new zzail(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zzb(zzet zzetVar, long j10) throws zzat {
        int i10;
        int iZzs = zzetVar.zzs();
        long jZzy = zzetVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzet zzetVar2 = new zzet(new byte[zzetVar.zzd()]);
                zzetVar.zzm(zzetVar2.zzi(), 0, zzetVar.zzd());
                zzafd zzafdVarZza = zzafd.zza(zzetVar2);
                this.zzd = zzafdVarZza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("video/avc");
                zztVar.zzk(zzafdVarZza.zzl);
                zztVar.zzv(zzafdVarZza.zzc);
                zztVar.zzw(zzafdVarZza.zzd);
                zztVar.zzB(zzafdVarZza.zzk);
                zztVar.zzr(zzafdVarZza.zza);
                this.zza.zzA(zztVar.zzO());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            int i11 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i10 = i11;
            } else if (i11 != 0) {
                i10 = 1;
            }
            zzet zzetVar3 = this.zzc;
            byte[] bArrZzi = zzetVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i12 = 4 - this.zzd;
            int i13 = 0;
            while (zzetVar.zzd() > 0) {
                zzetVar.zzm(zzetVar3.zzi(), i12, this.zzd);
                zzetVar3.zzh(0);
                zzet zzetVar4 = this.zzb;
                int iZzH = zzetVar3.zzH();
                zzetVar4.zzh(0);
                zzahk zzahkVar = this.zza;
                zzahkVar.zzc(zzetVar4, 4);
                zzahkVar.zzc(zzetVar, iZzH);
                i13 = i13 + 4 + iZzH;
            }
            this.zza.zze(j10 + (jZzy * 1000), i10, i13, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
