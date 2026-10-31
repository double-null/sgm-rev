package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzx extends zzaaq implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzaam zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    public zzzx(int i10, zzbg zzbgVar, int i11, zzaam zzaamVar, int i12, boolean z10, zzgtk zzgtkVar, int i13) {
        int i14;
        int iZzj;
        byte b10;
        boolean z11;
        int iZzj2;
        boolean z12;
        super(i10, zzbgVar, i11);
        this.zzh = zzaamVar;
        int i15 = 1;
        int i16 = true != zzaamVar.zzT ? 16 : 24;
        this.zzg = zzaay.zzi(this.zzd.zzd);
        this.zzi = zznc.zzac(i12, false);
        int i17 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i17 >= zzaamVar.zzq.size()) {
                iZzj = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaay.zzj(this.zzd, (String) zzaamVar.zzq.get(i17), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.zzk = i17;
        this.zzj = iZzj;
        this.zzl = zzaay.zzm(this.zzd.zzf, 0);
        this.zzm = zzaay.zzn(this.zzd, zzaamVar.zzr);
        zzv zzvVar = this.zzd;
        int i18 = zzvVar.zzf;
        this.zzn = i18 == 0 || (i18 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzp;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("audio/eac3-joc")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 == 0 || b10 == 1 || b10 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.zzx = z11;
        int i19 = zzvVar.zzH;
        this.zzr = i19;
        this.zzs = zzvVar.zzI;
        int i20 = zzvVar.zzj;
        this.zzt = i20;
        this.zzf = (i20 == -1 || i20 <= zzaamVar.zzu) && (i19 == -1 || i19 <= zzaamVar.zzt) && zzgtkVar.zza(zzvVar);
        String str2 = zzfl.zza;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            strArrSplit[i21] = zzfl.zzi(strArrSplit[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= strArrSplit.length) {
                iZzj2 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj2 = zzaay.zzj(this.zzd, strArrSplit[i22], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.zzo = i22;
        this.zzp = iZzj2;
        for (int i23 = 0; i23 < zzaamVar.zzv.size(); i23++) {
            String str3 = this.zzd.zzp;
            if (str3 != null && str3.equals(zzaamVar.zzv.get(i23))) {
                i14 = i23;
                break;
            }
        }
        this.zzu = i14;
        this.zzv = (i12 & 384) == 128;
        this.zzw = (i12 & 64) == 64;
        zzaam zzaamVar2 = this.zzh;
        if (zznc.zzac(i12, zzaamVar2.zzV) && ((z12 = this.zzf) || zzaamVar2.zzO)) {
            int i24 = zzaamVar2.zzw.zzb;
            if (zznc.zzac(i12, false) && z12 && this.zzd.zzj != -1 && ((zzaamVar2.zzX || !z10) && (i16 & i12) != 0)) {
                i15 = 2;
            }
        } else {
            i15 = 0;
        }
        this.zze = i15;
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzx zzzxVar) {
        boolean z10 = this.zzf;
        zzgyg zzgygVarZza = (z10 && this.zzi) ? zzaay.zzc : zzaay.zzc.zza();
        zzgvz zzgvzVarZza = zzgvz.zzg().zzd(this.zzi, zzzxVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzzxVar.zzk), zzgyg.zzb().zza()).zzb(this.zzj, zzzxVar.zzj).zzb(this.zzl, zzzxVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzzxVar.zzm), zzgyg.zzb().zza()).zzd(this.zzq, zzzxVar.zzq).zzd(this.zzn, zzzxVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzzxVar.zzo), zzgyg.zzb().zza()).zzb(this.zzp, zzzxVar.zzp).zzd(z10, zzzxVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzzxVar.zzu), zzgyg.zzb().zza());
        boolean z11 = this.zzh.zzF;
        zzgvz zzgvzVarZza2 = zzgvzVarZza.zzd(this.zzv, zzzxVar.zzv).zzd(this.zzw, zzzxVar.zzw).zzd(this.zzx, zzzxVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzzxVar.zzr), zzgygVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzzxVar.zzs), zzgygVarZza);
        if (Objects.equals(this.zzg, zzzxVar.zzg)) {
            zzgvzVarZza2 = zzgvzVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzzxVar.zzt), zzgygVarZza);
        }
        return zzgvzVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(zzaaq zzaaqVar) {
        String str;
        int i10;
        zzzx zzzxVar = (zzzx) zzaaqVar;
        boolean z10 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i11 = zzvVar.zzH;
        if (i11 == -1) {
            return false;
        }
        zzv zzvVar2 = zzzxVar.zzd;
        return i11 == zzvVar2.zzH && (str = zzvVar.zzp) != null && TextUtils.equals(str, zzvVar2.zzp) && (i10 = zzvVar.zzI) != -1 && i10 == zzvVar2.zzI && this.zzv == zzzxVar.zzv && this.zzw == zzzxVar.zzw;
    }
}
