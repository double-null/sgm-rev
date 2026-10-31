package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaax extends zzaaq {
    private final boolean zze;
    private final zzaam zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Code duplicated, block: B:119:0x017d  */
    /* JADX WARN: Code duplicated, block: B:25:0x003e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0064  */
    /* JADX WARN: Code duplicated, block: B:87:0x0123  */
    public zzaax(int i10, zzbg zzbgVar, int i11, zzaam zzaamVar, int i12, String str, int i13, boolean z10) {
        boolean z11;
        boolean z12;
        int i14;
        int iZzj;
        int i15;
        byte b10;
        boolean z13;
        zzv zzvVar;
        int i16;
        int i17;
        int i18;
        zzv zzvVar2;
        int i19;
        int i20;
        int i21;
        super(i10, zzbgVar, i11);
        this.zzf = zzaamVar;
        int i22 = 1;
        int i23 = true != zzaamVar.zzM ? 16 : 24;
        if (!z10 || (((i19 = (zzvVar2 = this.zzd).zzw) != -1 && i19 > zzaamVar.zza) || ((i20 = zzvVar2.zzx) != -1 && i20 > zzaamVar.zzb))) {
            z11 = false;
        } else {
            float f10 = zzvVar2.zzA;
            if ((f10 == -1.0f || f10 <= zzaamVar.zzc) && ((i21 = zzvVar2.zzj) == -1 || i21 <= zzaamVar.zzd)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.zze = z11;
        if (!z10 || (((i16 = (zzvVar = this.zzd).zzw) != -1 && i16 < 0) || ((i17 = zzvVar.zzx) != -1 && i17 < 0))) {
            z12 = false;
        } else {
            float f11 = zzvVar.zzA;
            if ((f11 == -1.0f || f11 >= 0.0f) && ((i18 = zzvVar.zzj) == -1 || i18 >= 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        this.zzg = z12;
        this.zzh = zznc.zzac(i12, false);
        zzv zzvVar3 = this.zzd;
        float f12 = zzvVar3.zzA;
        this.zzi = f12 != -1.0f && f12 >= 10.0f;
        this.zzj = zzvVar3.zzj;
        this.zzk = zzvVar3.zzc();
        int i24 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i24 >= zzaamVar.zzo.size()) {
                iZzj = 0;
                i24 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaay.zzj(this.zzd, (String) zzaamVar.zzo.get(i24), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        this.zzm = i24;
        this.zzn = iZzj;
        this.zzo = zzaay.zzm(this.zzd.zzf, 0);
        int i25 = this.zzd.zzf;
        this.zzq = i25 == 0 || (i25 & 1) != 0;
        this.zzr = zzaay.zzj(this.zzd, str, zzaay.zzi(str) == null);
        for (int i26 = 0; i26 < zzaamVar.zzm.size(); i26++) {
            String str2 = this.zzd.zzp;
            if (str2 != null && str2.equals(zzaamVar.zzm.get(i26))) {
                i14 = i26;
                break;
            }
        }
        this.zzl = i14;
        this.zzp = zzaay.zzn(this.zzd, zzaamVar.zzn);
        this.zzt = (i12 & 384) == 128;
        this.zzu = (i12 & 64) == 64;
        zzv zzvVar4 = this.zzd;
        String str3 = zzvVar4.zzp;
        if (str3 == null) {
            i15 = 0;
        } else {
            i15 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b10 = 0;
                    break;
                case "video/av01":
                    b10 = 1;
                    break;
                case "video/hevc":
                    b10 = 2;
                    break;
                case "video/avc":
                    b10 = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                i15 = 5;
            } else if (b10 != 1) {
                if (b10 == 2) {
                    i15 = 3;
                } else if (b10 == 3) {
                    i15 = 2;
                } else if (b10 != 4) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
            }
        }
        this.zzv = i15;
        if ((zzvVar4.zzf & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            i22 = 0;
        } else {
            zzaam zzaamVar2 = this.zzf;
            if (!zznc.zzac(i12, zzaamVar2.zzV) || (!(z13 = this.zze) && !zzaamVar2.zzK)) {
                i22 = 0;
            } else if (zznc.zzac(i12, false) && this.zzg && z13 && zzvVar4.zzj != -1 && (i23 & i12) != 0) {
                i22 = 2;
            }
        }
        this.zzs = i22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzaax zzaaxVar, zzaax zzaaxVar2) {
        zzgvz zzgvzVarZza = zzgvz.zzg().zzd(zzaaxVar.zzh, zzaaxVar2.zzh).zza(Integer.valueOf(zzaaxVar.zzm), Integer.valueOf(zzaaxVar2.zzm), zzgyg.zzb().zza()).zzb(zzaaxVar.zzn, zzaaxVar2.zzn).zzb(zzaaxVar.zzo, zzaaxVar2.zzo).zza(Integer.valueOf(zzaaxVar.zzp), Integer.valueOf(zzaaxVar2.zzp), zzgyg.zzb().zza()).zzd(zzaaxVar.zzq, zzaaxVar2.zzq).zzb(zzaaxVar.zzr, zzaaxVar2.zzr).zzd(zzaaxVar.zzi, zzaaxVar2.zzi).zzd(zzaaxVar.zze, zzaaxVar2.zze).zzd(zzaaxVar.zzg, zzaaxVar2.zzg).zza(Integer.valueOf(zzaaxVar.zzl), Integer.valueOf(zzaaxVar2.zzl), zzgyg.zzb().zza());
        boolean z10 = zzaaxVar.zzt;
        zzgvz zzgvzVarZzd = zzgvzVarZza.zzd(z10, zzaaxVar2.zzt);
        boolean z11 = zzaaxVar.zzu;
        zzgvz zzgvzVarZzd2 = zzgvzVarZzd.zzd(z11, zzaaxVar2.zzu);
        if (z10 && z11) {
            zzgvzVarZzd2 = zzgvzVarZzd2.zzb(zzaaxVar.zzv, zzaaxVar2.zzv);
        }
        return zzgvzVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzaax zzaaxVar, zzaax zzaaxVar2) {
        zzgyg zzgygVarZza = (zzaaxVar.zze && zzaaxVar.zzh) ? zzaay.zzc : zzaay.zzc.zza();
        zzgvz zzgvzVarZzg = zzgvz.zzg();
        boolean z10 = zzaaxVar.zzf.zzF;
        return zzgvzVarZzg.zza(Integer.valueOf(zzaaxVar.zzk), Integer.valueOf(zzaaxVar2.zzk), zzgygVarZza).zza(Integer.valueOf(zzaaxVar.zzj), Integer.valueOf(zzaaxVar2.zzj), zzgygVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(zzaaq zzaaqVar) {
        zzaax zzaaxVar = (zzaax) zzaaqVar;
        if (!Objects.equals(this.zzd.zzp, zzaaxVar.zzd.zzp)) {
            return false;
        }
        boolean z10 = this.zzf.zzN;
        return this.zzt == zzaaxVar.zzt && this.zzu == zzaaxVar.zzu;
    }
}
