package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhla {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    zzhla(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    static zzhla zza(zzhla zzhlaVar, zzhkz zzhkzVar) {
        zzhla zzhlaVar2 = zzhkzVar.zza;
        long[] jArr = zzhlaVar.zza;
        long[] jArr2 = zzhlaVar2.zza;
        long[] jArr3 = zzhkzVar.zzb;
        zzhlj.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhlaVar.zzb;
        long[] jArr5 = zzhlaVar2.zzb;
        long[] jArr6 = zzhlaVar2.zzc;
        zzhlj.zze(jArr4, jArr5, jArr6);
        zzhlj.zze(zzhlaVar.zzc, jArr6, jArr3);
        return zzhlaVar;
    }

    final byte[] zzb() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        int i10 = zzhlj.zza;
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.zzc;
        zzhlj.zzf(jArr4, jArr14);
        zzhlj.zzf(jArr13, jArr4);
        zzhlj.zzf(jArr12, jArr13);
        zzhlj.zze(jArr5, jArr12, jArr14);
        zzhlj.zze(jArr6, jArr5, jArr4);
        zzhlj.zzf(jArr12, jArr6);
        zzhlj.zze(jArr7, jArr12, jArr5);
        zzhlj.zzf(jArr12, jArr7);
        zzhlj.zzf(jArr13, jArr12);
        zzhlj.zzf(jArr12, jArr13);
        zzhlj.zzf(jArr13, jArr12);
        zzhlj.zzf(jArr12, jArr13);
        zzhlj.zze(jArr8, jArr12, jArr7);
        zzhlj.zzf(jArr12, jArr8);
        zzhlj.zzf(jArr13, jArr12);
        for (int i11 = 2; i11 < 10; i11 += 2) {
            zzhlj.zzf(jArr12, jArr13);
            zzhlj.zzf(jArr13, jArr12);
        }
        zzhlj.zze(jArr9, jArr13, jArr8);
        zzhlj.zzf(jArr12, jArr9);
        zzhlj.zzf(jArr13, jArr12);
        for (int i12 = 2; i12 < 20; i12 += 2) {
            zzhlj.zzf(jArr12, jArr13);
            zzhlj.zzf(jArr13, jArr12);
        }
        zzhlj.zze(jArr12, jArr13, jArr9);
        zzhlj.zzf(jArr13, jArr12);
        zzhlj.zzf(jArr12, jArr13);
        for (int i13 = 2; i13 < 10; i13 += 2) {
            zzhlj.zzf(jArr13, jArr12);
            zzhlj.zzf(jArr12, jArr13);
        }
        zzhlj.zze(jArr10, jArr12, jArr8);
        zzhlj.zzf(jArr12, jArr10);
        zzhlj.zzf(jArr13, jArr12);
        for (int i14 = 2; i14 < 50; i14 += 2) {
            zzhlj.zzf(jArr12, jArr13);
            zzhlj.zzf(jArr13, jArr12);
        }
        zzhlj.zze(jArr11, jArr13, jArr10);
        zzhlj.zzf(jArr13, jArr11);
        zzhlj.zzf(jArr12, jArr13);
        for (int i15 = 2; i15 < 100; i15 += 2) {
            zzhlj.zzf(jArr13, jArr12);
            zzhlj.zzf(jArr12, jArr13);
        }
        zzhlj.zze(jArr13, jArr12, jArr11);
        zzhlj.zzf(jArr12, jArr13);
        zzhlj.zzf(jArr13, jArr12);
        for (int i16 = 2; i16 < 50; i16 += 2) {
            zzhlj.zzf(jArr12, jArr13);
            zzhlj.zzf(jArr13, jArr12);
        }
        zzhlj.zze(jArr12, jArr13, jArr10);
        zzhlj.zzf(jArr13, jArr12);
        zzhlj.zzf(jArr12, jArr13);
        zzhlj.zzf(jArr13, jArr12);
        zzhlj.zzf(jArr12, jArr13);
        zzhlj.zzf(jArr13, jArr12);
        zzhlj.zze(jArr, jArr13, jArr6);
        zzhlj.zze(jArr2, this.zza, jArr);
        zzhlj.zze(jArr3, this.zzb, jArr);
        byte[] bArrZzh = zzhlj.zzh(jArr3);
        bArrZzh[31] = (byte) ((zzhlc.zzf(jArr2) << 7) ^ bArrZzh[31]);
        return bArrZzh;
    }

    zzhla() {
        this(new long[10], new long[10], new long[10]);
    }

    zzhla(zzhkz zzhkzVar) {
        this();
        zza(this, zzhkzVar);
    }

    zzhla(zzhla zzhlaVar) {
        this.zza = Arrays.copyOf(zzhlaVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhlaVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhlaVar.zzc, 10);
    }
}
