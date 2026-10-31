package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagt {
    private final zzet zza = new zzet(10);

    private final boolean zzb(zzafz zzafzVar, int i10) throws IOException {
        int i11;
        int i12 = 0;
        do {
            int i13 = i12 % 10;
            if (i13 == 0) {
                if (i12 != 0) {
                    zzet zzetVar = this.zza;
                    System.arraycopy(zzetVar.zzi(), 10, zzetVar.zzi(), 0, 9);
                }
                i11 = 0;
            } else {
                i11 = i13;
            }
            int i14 = i12 != 0 ? 1 : 10;
            try {
                zzet zzetVar2 = this.zza;
                int i15 = i13 + 10;
                zzafzVar.zzi(zzetVar2.zzi(), i15 - i14, i14);
                zzetVar2.zzh(i11);
                zzetVar2.zzf(i15);
                if (zzetVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzagw.zza(zzetVar2.zzr()) != -1) {
                    return false;
                }
                if (i12 == 0) {
                    zzetVar2.zzc(20);
                }
                i12++;
            } catch (EOFException unused) {
            }
        } while (i12 <= i10);
        return false;
    }

    public final zzap zza(zzafz zzafzVar, zzajk zzajkVar, int i10) throws IOException {
        zzap zzapVarZza = null;
        int i11 = 0;
        while (zzb(zzafzVar, i10)) {
            zzet zzetVar = this.zza;
            int iZzg = zzetVar.zzg();
            zzetVar.zzk(6);
            int iZzG = zzetVar.zzG();
            int i12 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i12];
                System.arraycopy(zzetVar.zzi(), iZzg, bArr, 0, 10);
                zzafzVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzajn.zza(bArr, i12, zzajkVar, new zzaiy());
            } else {
                zzafzVar.zzk(iZzG);
            }
            i11 += i12;
        }
        zzafzVar.zzl();
        zzafzVar.zzk(i11);
        return zzapVarZza;
    }
}
