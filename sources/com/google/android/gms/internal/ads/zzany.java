package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzany {
    private final zzet zza = new zzet();
    private final int[] zzb = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final zzcx zza() {
        int i10;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzet zzetVar = this.zza;
        if (zzetVar.zze() == 0 || zzetVar.zzg() != zzetVar.zze() || !this.zzc) {
            return null;
        }
        zzetVar.zzh(0);
        int i11 = this.zzh * this.zzi;
        int[] iArr = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            int iZzs = zzetVar.zzs();
            if (iZzs != 0) {
                i10 = i12 + 1;
                iArr[i12] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzetVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzetVar.zzs();
                    }
                    i10 = iZzs3 + i12;
                    Arrays.fill(iArr, i12, i10, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzetVar.zzs()]);
                }
            }
            i12 = i10;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(bitmapCreateBitmap);
        zzcwVar.zzi(this.zzf / this.zzd);
        zzcwVar.zzj(0);
        zzcwVar.zzf(this.zzg / this.zze, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(this.zzh / this.zzd);
        zzcwVar.zzn(this.zzi / this.zze);
        return zzcwVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    final /* synthetic */ void zzc(zzet zzetVar, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        zzetVar.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i11 = 0;
        for (int i12 = i10 / 5; i11 < i12; i12 = i12) {
            int iZzs = zzetVar.zzs();
            int iZzs2 = zzetVar.zzs();
            int iZzs3 = zzetVar.zzs();
            int iZzs4 = zzetVar.zzs();
            double d10 = iZzs2;
            int iZzs5 = zzetVar.zzs() << 24;
            String str = zzfl.zza;
            double d11 = iZzs3 - 128;
            double d12 = iZzs4 - 128;
            iArr[iZzs] = (Math.max(0, Math.min((int) (d10 + (1.402d * d11)), 255)) << 16) | iZzs5 | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255));
            i11++;
        }
        this.zzc = true;
    }

    final /* synthetic */ void zzd(zzet zzetVar, int i10) {
        int iZzx;
        if (i10 < 4) {
            return;
        }
        zzetVar.zzk(3);
        int i11 = i10 - 4;
        if ((zzetVar.zzs() & 128) != 0) {
            if (i11 < 7 || (iZzx = zzetVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzetVar.zzt();
            this.zzi = zzetVar.zzt();
            this.zza.zza(iZzx - 4);
            i11 -= 7;
        }
        zzet zzetVar2 = this.zza;
        int iZzg = zzetVar2.zzg();
        int iZze = zzetVar2.zze();
        if (iZzg >= iZze || i11 <= 0) {
            return;
        }
        int iMin = Math.min(i11, iZze - iZzg);
        zzetVar.zzm(zzetVar2.zzi(), iZzg, iMin);
        zzetVar2.zzh(iZzg + iMin);
    }

    final /* synthetic */ void zze(zzet zzetVar, int i10) {
        if (i10 < 19) {
            return;
        }
        this.zzd = zzetVar.zzt();
        this.zze = zzetVar.zzt();
        zzetVar.zzk(11);
        this.zzf = zzetVar.zzt();
        this.zzg = zzetVar.zzt();
    }
}
