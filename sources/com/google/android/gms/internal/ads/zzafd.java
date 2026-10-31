package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzafd {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzafd(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = i18;
        this.zzk = f10;
        this.zzl = str;
    }

    public static zzafd zza(zzet zzetVar) throws zzat {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String strZzb;
        float f10;
        try {
            zzetVar.zzk(4);
            int iZzs = (zzetVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzetVar.zzs() & 31;
            for (int i18 = 0; i18 < iZzs2; i18++) {
                arrayList.add(zzb(zzetVar));
            }
            int iZzs3 = zzetVar.zzs();
            for (int i19 = 0; i19 < iZzs3; i19++) {
                arrayList.add(zzb(zzetVar));
            }
            if (iZzs2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = zzgp.zza;
                zzgo zzgoVarZze = zzgp.zze(bArr2, 5, bArr.length);
                int i20 = zzgoVarZze.zze;
                int i21 = zzgoVarZze.zzf;
                int i22 = zzgoVarZze.zzh + 8;
                int i23 = zzgoVarZze.zzi + 8;
                int i24 = zzgoVarZze.zzj;
                int i25 = zzgoVarZze.zzk;
                int i26 = zzgoVarZze.zzl;
                int i27 = zzgoVarZze.zzm;
                float f11 = zzgoVarZze.zzg;
                strZzb = zzdq.zzb(zzgoVarZze.zza, zzgoVarZze.zzb, zzgoVarZze.zzc);
                i16 = i26;
                i17 = i27;
                f10 = f11;
                i13 = i23;
                i14 = i24;
                i15 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                i17 = 16;
                strZzb = null;
                f10 = 1.0f;
            }
            return new zzafd(arrayList, iZzs, i10, i11, i12, i13, i14, i15, i16, i17, f10, strZzb);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzat.zzb("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzet zzetVar) {
        int iZzt = zzetVar.zzt();
        int iZzg = zzetVar.zzg();
        zzetVar.zzk(iZzt);
        return zzdq.zzh(zzetVar.zzi(), iZzg, iZzt);
    }
}
