package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzfpw {
    static zzfpw zzn(Context context, int i10) {
        boolean zBooleanValue;
        if (zzfqj.zza()) {
            int i11 = i10 - 2;
            if (i11 == 20 || i11 == 21) {
                zBooleanValue = ((Boolean) zzbkj.zze.zze()).booleanValue();
            } else if (i11 != 110) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbkj.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbkj.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbkj.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkk)).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfpy(context, i10);
            }
        }
        return new zzfqz();
    }

    static zzfpw zzo(Context context, int i10, int i11, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfpw zzfpwVarZzn = zzn(context, i10);
        if (zzfpwVarZzn instanceof zzfpy) {
            zzfpwVarZzn.zza();
            zzfpwVarZzn.zzp(i11);
            zzfpwVarZzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfqf.zza(str)) {
                zzfpwVarZzn.zze(str);
            }
        }
        return zzfpwVarZzn;
    }

    zzfpw zza();

    boolean zzb();

    zzfpw zzc();

    zzfpw zzd(boolean z10);

    zzfpw zze(String str);

    zzfpw zzf(zzfql zzfqlVar);

    zzfpw zzg(zzfkp zzfkpVar);

    zzfpw zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfpw zzi(String str);

    zzfpw zzj(Throwable th);

    zzfpw zzk(String str);

    boolean zzl();

    zzfpz zzm();

    zzfpw zzp(int i10);
}
