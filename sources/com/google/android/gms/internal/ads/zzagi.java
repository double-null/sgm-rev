package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagi {
    public static zzap zza(zzafz zzafzVar, boolean z10) throws IOException {
        zzap zzapVarZza = new zzagt().zza(zzafzVar, z10 ? null : zzajn.zza, 0);
        if (zzapVarZza == null || zzapVarZza.zza() == 0) {
            return null;
        }
        return zzapVarZza;
    }

    public static boolean zzb(zzafz zzafzVar, zzagh zzaghVar) throws IOException {
        zzafzVar.zzl();
        zzes zzesVar = new zzes(new byte[4], 4);
        zzafzVar.zzi(zzesVar.zza, 0, 4);
        boolean zZzi = zzesVar.zzi();
        int iZzj = zzesVar.zzj(7);
        int iZzj2 = zzesVar.zzj(24) + 4;
        if (iZzj == 0) {
            byte[] bArr = new byte[38];
            zzafzVar.zzc(bArr, 0, 38);
            zzaghVar.zza = new zzagl(bArr, 4);
        } else {
            zzagl zzaglVar = zzaghVar.zza;
            if (zzaglVar == null) {
                throw new IllegalArgumentException();
            }
            if (iZzj == 3) {
                zzet zzetVar = new zzet(iZzj2);
                zzafzVar.zzc(zzetVar.zzi(), 0, iZzj2);
                zzaghVar.zza = zzaglVar.zze(zzc(zzetVar));
            } else if (iZzj == 4) {
                zzet zzetVar2 = new zzet(iZzj2);
                zzafzVar.zzc(zzetVar2.zzi(), 0, iZzj2);
                zzetVar2.zzk(4);
                zzaghVar.zza = new zzagl(zzaglVar.zza, zzaglVar.zzb, zzaglVar.zzc, zzaglVar.zzd, zzaglVar.zze, zzaglVar.zzg, zzaglVar.zzh, zzaglVar.zzj, zzaglVar.zzk, zzaglVar.zzd(zzahm.zzb(Arrays.asList(zzhe.zzb(zzetVar2, false, false).zza))));
            } else if (iZzj == 6) {
                zzet zzetVar3 = new zzet(iZzj2);
                zzafzVar.zzc(zzetVar3.zzi(), 0, iZzj2);
                zzetVar3.zzk(4);
                zzaghVar.zza = new zzagl(zzaglVar.zza, zzaglVar.zzb, zzaglVar.zzc, zzaglVar.zzd, zzaglVar.zze, zzaglVar.zzg, zzaglVar.zzh, zzaglVar.zzj, zzaglVar.zzk, zzaglVar.zzd(new zzap(zzgwm.zzj(zzajc.zzb(zzetVar3)))));
            } else {
                zzafzVar.zzf(iZzj2);
            }
        }
        return zZzi;
    }

    public static zzagk zzc(zzet zzetVar) {
        zzetVar.zzk(1);
        int iZzx = zzetVar.zzx();
        long jZzg = zzetVar.zzg();
        long j10 = iZzx;
        int i10 = iZzx / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jZzD = zzetVar.zzD();
            if (jZzD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jZzD;
            jArrCopyOf2[i11] = zzetVar.zzD();
            zzetVar.zzk(2);
        }
        zzetVar.zzk((int) ((jZzg + j10) - ((long) zzetVar.zzg())));
        return new zzagk(jArrCopyOf, jArrCopyOf2);
    }
}
