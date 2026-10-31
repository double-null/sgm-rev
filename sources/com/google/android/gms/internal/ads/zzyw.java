package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyw {
    private final zzabl zza;
    private final zzet zzb = new zzet(32);
    private zzyv zzc;
    private zzyv zzd;
    private zzyv zze;
    private long zzf;

    public zzyw(zzabl zzablVar) {
        this.zza = zzablVar;
        zzyv zzyvVar = new zzyv(0L, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        this.zzc = zzyvVar;
        this.zzd = zzyvVar;
        this.zze = zzyvVar;
    }

    private final int zzi(int i10) {
        zzyv zzyvVar = this.zze;
        if (zzyvVar.zzc == null) {
            zzabj zzabjVarZza = this.zza.zza();
            zzyv zzyvVar2 = new zzyv(this.zze.zzb, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            zzyvVar.zzc = zzabjVarZza;
            zzyvVar.zzd = zzyvVar2;
        }
        return Math.min(i10, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i10) {
        long j10 = this.zzf + ((long) i10);
        this.zzf = j10;
        zzyv zzyvVar = this.zze;
        if (j10 == zzyvVar.zzb) {
            this.zze = zzyvVar.zzd;
        }
    }

    private static zzyv zzk(zzyv zzyvVar, zziv zzivVar, zzyx zzyxVar, zzet zzetVar) {
        zzyv zzyvVarZzm;
        if (zzivVar.zzk()) {
            long j10 = zzyxVar.zzb;
            int iZzt = 1;
            zzetVar.zza(1);
            zzyv zzyvVarZzm2 = zzm(zzyvVar, j10, zzetVar.zzi(), 1);
            long j11 = j10 + 1;
            byte b10 = zzetVar.zzi()[0];
            int i10 = b10 & 128;
            int i11 = b10 & 127;
            zzis zzisVar = zzivVar.zzb;
            byte[] bArr = zzisVar.zza;
            if (bArr == null) {
                zzisVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i10 != 0;
            zzyvVarZzm = zzm(zzyvVarZzm2, j11, zzisVar.zza, i11);
            long j12 = j11 + ((long) i11);
            if (z10) {
                zzetVar.zza(2);
                zzyvVarZzm = zzm(zzyvVarZzm, j12, zzetVar.zzi(), 2);
                j12 += 2;
                iZzt = zzetVar.zzt();
            }
            int i12 = iZzt;
            int[] iArr = zzisVar.zzd;
            if (iArr == null || iArr.length < i12) {
                iArr = new int[i12];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzisVar.zze;
            if (iArr3 == null || iArr3.length < i12) {
                iArr3 = new int[i12];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i13 = i12 * 6;
                zzetVar.zza(i13);
                zzyvVarZzm = zzm(zzyvVarZzm, j12, zzetVar.zzi(), i13);
                j12 += (long) i13;
                zzetVar.zzh(0);
                for (int i14 = 0; i14 < i12; i14++) {
                    iArr2[i14] = zzetVar.zzt();
                    iArr4[i14] = zzetVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzyxVar.zza - ((int) (j12 - zzyxVar.zzb));
            }
            zzahj zzahjVar = zzyxVar.zzc;
            String str = zzfl.zza;
            zzisVar.zza(i12, iArr2, iArr4, zzahjVar.zzb, zzisVar.zza, zzahjVar.zza, zzahjVar.zzc, zzahjVar.zzd);
            long j13 = zzyxVar.zzb;
            int i15 = (int) (j12 - j13);
            zzyxVar.zzb = j13 + ((long) i15);
            zzyxVar.zza -= i15;
        } else {
            zzyvVarZzm = zzyvVar;
        }
        if (!zzivVar.zze()) {
            zzivVar.zzj(zzyxVar.zza);
            return zzl(zzyvVarZzm, zzyxVar.zzb, zzivVar.zzc, zzyxVar.zza);
        }
        zzetVar.zza(4);
        zzyv zzyvVarZzm3 = zzm(zzyvVarZzm, zzyxVar.zzb, zzetVar.zzi(), 4);
        int iZzH = zzetVar.zzH();
        zzyxVar.zzb += 4;
        zzyxVar.zza -= 4;
        zzivVar.zzj(iZzH);
        zzyv zzyvVarZzl = zzl(zzyvVarZzm3, zzyxVar.zzb, zzivVar.zzc, iZzH);
        zzyxVar.zzb += (long) iZzH;
        int i16 = zzyxVar.zza - iZzH;
        zzyxVar.zza = i16;
        ByteBuffer byteBuffer = zzivVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            zzivVar.zzf = ByteBuffer.allocate(i16);
        } else {
            zzivVar.zzf.clear();
        }
        return zzl(zzyvVarZzl, zzyxVar.zzb, zzivVar.zzf, zzyxVar.zza);
    }

    private static zzyv zzl(zzyv zzyvVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzyv zzyvVarZzn = zzn(zzyvVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (zzyvVarZzn.zzb - j10));
            byteBuffer.put(zzyvVarZzn.zzc.zza, zzyvVarZzn.zzb(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == zzyvVarZzn.zzb) {
                zzyvVarZzn = zzyvVarZzn.zzd;
            }
        }
        return zzyvVarZzn;
    }

    private static zzyv zzm(zzyv zzyvVar, long j10, byte[] bArr, int i10) {
        zzyv zzyvVarZzn = zzn(zzyvVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (zzyvVarZzn.zzb - j10));
            System.arraycopy(zzyvVarZzn.zzc.zza, zzyvVarZzn.zzb(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == zzyvVarZzn.zzb) {
                zzyvVarZzn = zzyvVarZzn.zzd;
            }
        }
        return zzyvVarZzn;
    }

    private static zzyv zzn(zzyv zzyvVar, long j10) {
        while (j10 >= zzyvVar.zzb) {
            zzyvVar = zzyvVar.zzd;
        }
        return zzyvVar;
    }

    public final void zza() {
        zzyv zzyvVar = this.zzc;
        if (zzyvVar.zzc != null) {
            this.zza.zzc(zzyvVar);
            zzyvVar.zzc();
        }
        this.zzc.zza(0L, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        zzyv zzyvVar2 = this.zzc;
        this.zzd = zzyvVar2;
        this.zze = zzyvVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zziv zzivVar, zzyx zzyxVar) {
        this.zzd = zzk(this.zzd, zzivVar, zzyxVar, this.zzb);
    }

    public final void zzd(zziv zzivVar, zzyx zzyxVar) {
        zzk(this.zzd, zzivVar, zzyxVar, this.zzb);
    }

    public final void zze(long j10) {
        zzyv zzyvVar;
        if (j10 != -1) {
            while (true) {
                zzyvVar = this.zzc;
                if (j10 < zzyvVar.zzb) {
                    break;
                }
                this.zza.zzb(zzyvVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzyvVar.zza) {
                this.zzd = zzyvVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i10, boolean z10) throws IOException {
        int iZzi = zzi(i10);
        zzyv zzyvVar = this.zze;
        int iZza = zzjVar.zza(zzyvVar.zzc.zza, zzyvVar.zzb(this.zzf), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzet zzetVar, int i10) {
        while (i10 > 0) {
            int iZzi = zzi(i10);
            zzyv zzyvVar = this.zze;
            zzetVar.zzm(zzyvVar.zzc.zza, zzyvVar.zzb(this.zzf), iZzi);
            i10 -= iZzi;
            zzj(iZzi);
        }
    }
}
