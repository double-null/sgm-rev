package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhlc {
    private static final zzhkx zzb = new zzhkx(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzhkz zzc = new zzhkz(new zzhla(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] zza(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[64];
        int i11 = 0;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = i11 + i11;
            bArr2[i12] = (byte) (bArr[i11] & 15);
            bArr2[i12 + 1] = (byte) ((bArr[i11] & 255) >> 4);
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < 63) {
            byte b10 = (byte) (bArr2[i13] + i14);
            bArr2[i13] = b10;
            int i15 = (b10 + 8) >> 4;
            bArr2[i13] = (byte) (b10 - (i15 << 4));
            i13++;
            i14 = i15;
        }
        bArr2[63] = (byte) (bArr2[63] + i14);
        zzhkz zzhkzVar = new zzhkz(zzc);
        zzhlb zzhlbVar = new zzhlb();
        for (i10 = 1; i10 < 64; i10 += 2) {
            zzhkx zzhkxVar = new zzhkx(zzb);
            zzk(zzhkxVar, i10 / 2, bArr2[i10]);
            zzhlb.zza(zzhlbVar, zzhkzVar);
            zzg(zzhkzVar, zzhlbVar, zzhkxVar);
        }
        zzhla zzhlaVar = new zzhla();
        zzhla.zza(zzhlaVar, zzhkzVar);
        zzi(zzhkzVar, zzhlaVar);
        zzhla.zza(zzhlaVar, zzhkzVar);
        zzi(zzhkzVar, zzhlaVar);
        zzhla.zza(zzhlaVar, zzhkzVar);
        zzi(zzhkzVar, zzhlaVar);
        zzhla.zza(zzhlaVar, zzhkzVar);
        zzi(zzhkzVar, zzhlaVar);
        for (int i16 = 0; i16 < 64; i16 += 2) {
            zzhkx zzhkxVar2 = new zzhkx(zzb);
            zzk(zzhkxVar2, i16 / 2, bArr2[i16]);
            zzhlb.zza(zzhlbVar, zzhkzVar);
            zzg(zzhkzVar, zzhlbVar, zzhkxVar2);
        }
        zzhla zzhlaVar2 = new zzhla(zzhkzVar);
        long[] jArr = new long[10];
        zzhlj.zzf(jArr, zzhlaVar2.zza);
        long[] jArr2 = new long[10];
        zzhlj.zzf(jArr2, zzhlaVar2.zzb);
        long[] jArr3 = new long[10];
        zzhlj.zzf(jArr3, zzhlaVar2.zzc);
        long[] jArr4 = new long[10];
        zzhlj.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhlj.zzb(jArr5, jArr2, jArr);
        zzhlj.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhlj.zze(jArr6, jArr, jArr2);
        zzhlj.zze(jArr6, jArr6, zzhle.zza);
        zzhlj.zza(jArr6, jArr6, jArr4);
        zzhlj.zzc(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhlj.zzh(jArr5), zzhlj.zzh(jArr6))) {
            return zzhlaVar2.zzb();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        MessageDigest messageDigest = (MessageDigest) zzhzz.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i10 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i10;
        bArrDigest[31] = (byte) (i10 | 64);
        return bArrDigest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        char c10;
        byte b10;
        int i10;
        byte b11;
        byte[] bArr4 = bArr2;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i11 = 31;
        while (i11 >= 0) {
            int i12 = bArrCopyOfRange[i11] & 255;
            int i13 = zza[i11] & 255;
            if (i12 != i13) {
                if (i12 >= i13) {
                    break;
                }
                MessageDigest messageDigest = (MessageDigest) zzhzz.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr3);
                messageDigest.update(bArr);
                byte[] bArrDigest = messageDigest.digest();
                long jZzn = zzn(bArrDigest, 0) & 2097151;
                long jZzo = zzo(bArrDigest, 2) >> 5;
                long jZzn2 = zzn(bArrDigest, 5) >> 2;
                long jZzo2 = zzo(bArrDigest, 7) >> 7;
                long jZzo3 = zzo(bArrDigest, 10) >> 4;
                long jZzn3 = zzn(bArrDigest, 13) >> 1;
                long jZzo4 = zzo(bArrDigest, 15) >> 6;
                long jZzn4 = zzn(bArrDigest, 18) >> 3;
                long jZzn5 = zzn(bArrDigest, 21) & 2097151;
                long jZzo5 = zzo(bArrDigest, 23) >> 5;
                long jZzn6 = zzn(bArrDigest, 26) >> 2;
                long jZzo6 = zzo(bArrDigest, 28) >> 7;
                long jZzo7 = zzo(bArrDigest, 31) >> 4;
                long jZzn7 = zzn(bArrDigest, 34) >> 1;
                long jZzo8 = zzo(bArrDigest, 36) >> 6;
                long jZzn8 = zzn(bArrDigest, 39) >> 3;
                long jZzn9 = zzn(bArrDigest, 42) & 2097151;
                long jZzo9 = zzo(bArrDigest, 44) >> 5;
                long jZzn10 = (zzn(bArrDigest, 47) >> 2) & 2097151;
                long jZzo10 = (zzo(bArrDigest, 49) >> 7) & 2097151;
                long jZzo11 = (zzo(bArrDigest, 52) >> 4) & 2097151;
                long jZzn11 = (zzn(bArrDigest, 55) >> 1) & 2097151;
                long jZzo12 = (zzo(bArrDigest, 57) >> 6) & 2097151;
                long jZzo13 = zzo(bArrDigest, 60) >> 3;
                long j10 = (jZzo4 & 2097151) + (jZzn10 * 666643);
                long j11 = (j10 + 1048576) >> 21;
                long j12 = j11 << 21;
                long j13 = jZzn5 + (jZzo11 * 666643) + (jZzo10 * 470296) + (jZzn10 * 654183);
                long j14 = (j13 + 1048576) >> 21;
                long j15 = j14 << 21;
                long j16 = (((((jZzn6 & 2097151) + (jZzo12 * 666643)) + (jZzn11 * 470296)) + (jZzo11 * 654183)) - (jZzo10 * 997805)) + (jZzn10 * 136657);
                long j17 = (j16 + 1048576) >> 21;
                long j18 = j17 << 21;
                long j19 = (((((jZzo7 & 2097151) + (jZzo13 * 470296)) + (jZzo12 * 654183)) - (jZzn11 * 997805)) + (jZzo11 * 136657)) - (jZzo10 * 683901);
                long j20 = (j19 + 1048576) >> 21;
                long j21 = (((jZzo8 & 2097151) - (jZzo13 * 997805)) + (jZzo12 * 136657)) - (jZzn11 * 683901);
                long j22 = (j21 + 1048576) >> 21;
                long j23 = jZzn9 - (jZzo13 * 683901);
                long j24 = (j23 + 1048576) >> 21;
                long j25 = jZzn4 + (jZzo10 * 666643) + (jZzn10 * 470296) + j11;
                long j26 = (j25 + 1048576) >> 21;
                long j27 = j26 << 21;
                long j28 = (((((jZzo5 & 2097151) + (jZzn11 * 666643)) + (jZzo11 * 470296)) + (jZzo10 * 654183)) - (jZzn10 * 997805)) + j14;
                long j29 = (j28 + 1048576) >> 21;
                long j30 = j29 << 21;
                long j31 = (((((((jZzo6 & 2097151) + (jZzo13 * 666643)) + (jZzo12 * 470296)) + (jZzn11 * 654183)) - (jZzo11 * 997805)) + (jZzo10 * 136657)) - (jZzn10 * 683901)) + j17;
                long j32 = (j31 + 1048576) >> 21;
                long j33 = j32 << 21;
                long j34 = (((((jZzn7 & 2097151) + (jZzo13 * 654183)) - (jZzo12 * 997805)) + (jZzn11 * 136657)) - (jZzo11 * 683901)) + j20;
                long j35 = (j34 + 1048576) >> 21;
                long j36 = ((jZzn8 + (jZzo13 * 136657)) - (jZzo12 * 683901)) + j22;
                long j37 = (j36 + 1048576) >> 21;
                long j38 = (j19 - (j20 << 21)) + j32;
                long j39 = jZzn + (j38 * 666643);
                long j40 = (j39 + 1048576) >> 21;
                long j41 = j40 << 21;
                long j42 = (j21 - (j22 << 21)) + j35;
                long j43 = j34 - (j35 << 21);
                long j44 = (jZzn2 & 2097151) + (j42 * 666643) + (j43 * 470296) + (j38 * 654183);
                long j45 = (j44 + 1048576) >> 21;
                long j46 = j45 << 21;
                long j47 = (j23 - (j24 << 21)) + j37;
                long j48 = j36 - (j37 << 21);
                long j49 = (((((jZzo3 & 2097151) + (j47 * 666643)) + (j48 * 470296)) + (j42 * 654183)) - (j43 * 997805)) + (j38 * 136657);
                long j50 = (j49 + 1048576) >> 21;
                long j51 = j50 << 21;
                long j52 = (jZzo9 & 2097151) + j24;
                long j53 = (((((j10 - j12) + (j52 * 470296)) + (j47 * 654183)) - (j48 * 997805)) + (j42 * 136657)) - (j43 * 683901);
                long j54 = (j53 + 1048576) >> 21;
                long j55 = j54 << 21;
                long j56 = ((((j13 - j15) + j26) - (j52 * 997805)) + (j47 * 136657)) - (j48 * 683901);
                long j57 = (j56 + 1048576) >> 21;
                long j58 = j57 << 21;
                long j59 = ((j16 - j18) + j29) - (j52 * 683901);
                long j60 = (j59 + 1048576) >> 21;
                long j61 = (jZzo & 2097151) + (j43 * 666643) + (j38 * 470296) + j40;
                long j62 = (j61 + 1048576) >> 21;
                long j63 = (((((jZzo2 & 2097151) + (j48 * 666643)) + (j42 * 470296)) + (j43 * 654183)) - (j38 * 997805)) + j45;
                long j64 = (j63 + 1048576) >> 21;
                long j65 = (((((((jZzn3 & 2097151) + (j52 * 666643)) + (j47 * 470296)) + (j48 * 654183)) - (j42 * 997805)) + (j43 * 136657)) - (j38 * 683901)) + j50;
                long j66 = (j65 + 1048576) >> 21;
                long j67 = (((((j25 - j27) + (j52 * 654183)) - (j47 * 997805)) + (j48 * 136657)) - (j42 * 683901)) + j54;
                long j68 = (j67 + 1048576) >> 21;
                long j69 = (((j28 - j30) + (j52 * 136657)) - (j47 * 683901)) + j57;
                long j70 = (j69 + 1048576) >> 21;
                long j71 = (j31 - j33) + j60;
                long j72 = (j71 + 1048576) >> 21;
                long j73 = j72 << 21;
                long j74 = (j39 - j41) + (j72 * 666643);
                long j75 = j74 >> 21;
                long j76 = j75 << 21;
                long j77 = (j61 - (j62 << 21)) + (j72 * 470296) + j75;
                long j78 = j77 >> 21;
                long j79 = j78 << 21;
                long j80 = (j44 - j46) + j62 + (j72 * 654183) + j78;
                long j81 = j80 >> 21;
                long j82 = j81 << 21;
                long j83 = ((j63 - (j64 << 21)) - (j72 * 997805)) + j81;
                long j84 = j83 >> 21;
                long j85 = j84 << 21;
                long j86 = (j49 - j51) + j64 + (j72 * 136657) + j84;
                long j87 = j86 >> 21;
                long j88 = j87 << 21;
                long j89 = ((j65 - (j66 << 21)) - (j72 * 683901)) + j87;
                long j90 = j89 >> 21;
                long j91 = j90 << 21;
                long j92 = (j53 - j55) + j66 + j90;
                long j93 = j92 >> 21;
                long j94 = j93 << 21;
                long j95 = (j67 - (j68 << 21)) + j93;
                long j96 = j95 >> 21;
                long j97 = j96 << 21;
                long j98 = (j56 - j58) + j68 + j96;
                long j99 = j98 >> 21;
                long j100 = j99 << 21;
                long j101 = (j69 - (j70 << 21)) + j99;
                long j102 = j101 >> 21;
                long j103 = j102 << 21;
                long j104 = (j59 - (j60 << 21)) + j70 + j102;
                long j105 = j104 >> 21;
                long j106 = j105 << 21;
                long j107 = (j71 - j73) + j105;
                long j108 = j107 >> 21;
                long j109 = j108 << 21;
                long j110 = (j74 - j76) + (666643 * j108);
                long j111 = j110 >> 21;
                long j112 = j111 << 21;
                long j113 = (j77 - j79) + (470296 * j108) + j111;
                long j114 = j113 >> 21;
                long j115 = j114 << 21;
                long j116 = (j80 - j82) + (654183 * j108) + j114;
                long j117 = j116 >> 21;
                long j118 = j117 << 21;
                long j119 = ((j83 - j85) - (997805 * j108)) + j117;
                long j120 = j119 >> 21;
                long j121 = j120 << 21;
                long j122 = (j86 - j88) + (136657 * j108) + j120;
                long j123 = j122 >> 21;
                long j124 = ((j89 - j91) - (j108 * 683901)) + j123;
                long j125 = j124 >> 21;
                long j126 = j125 << 21;
                long j127 = (j92 - j94) + j125;
                long j128 = j127 >> 21;
                long j129 = j128 << 21;
                long j130 = (j95 - j97) + j128;
                long j131 = j130 >> 21;
                long j132 = j131 << 21;
                long j133 = (j98 - j100) + j131;
                long j134 = j133 >> 21;
                long j135 = j134 << 21;
                long j136 = (j101 - j103) + j134;
                long j137 = j136 >> 21;
                long j138 = j137 << 21;
                long j139 = (j104 - j106) + j137;
                long j140 = j139 >> 21;
                long j141 = j110 - j112;
                bArrDigest[0] = (byte) j141;
                long j142 = j130 - j132;
                long j143 = j127 - j129;
                long j144 = j124 - j126;
                long j145 = j122 - (j123 << 21);
                long j146 = j119 - j121;
                long j147 = j116 - j118;
                long j148 = j113 - j115;
                bArrDigest[1] = (byte) (j141 >> 8);
                bArrDigest[2] = (byte) ((j141 >> 16) | (j148 << 5));
                bArrDigest[3] = (byte) (j148 >> 3);
                bArrDigest[4] = (byte) (j148 >> 11);
                bArrDigest[5] = (byte) ((j148 >> 19) | (j147 << 2));
                bArrDigest[6] = (byte) (j147 >> 6);
                bArrDigest[7] = (byte) ((j147 >> 14) | (j146 << 7));
                bArrDigest[8] = (byte) (j146 >> 1);
                bArrDigest[9] = (byte) (j146 >> 9);
                bArrDigest[10] = (byte) ((j146 >> 17) | (j145 << 4));
                bArrDigest[11] = (byte) (j145 >> 4);
                bArrDigest[12] = (byte) (j145 >> 12);
                bArrDigest[13] = (byte) ((j145 >> 20) | (j144 + j144));
                bArrDigest[14] = (byte) (j144 >> 7);
                bArrDigest[15] = (byte) ((j144 >> 15) | (j143 << 6));
                bArrDigest[16] = (byte) (j143 >> 2);
                bArrDigest[17] = (byte) (j143 >> 10);
                bArrDigest[18] = (byte) ((j143 >> 18) | (j142 << 3));
                long j149 = j139 - (j140 << 21);
                long j150 = (j107 - j109) + j140;
                long j151 = j136 - j138;
                long j152 = j133 - j135;
                bArrDigest[19] = (byte) (j142 >> 5);
                bArrDigest[20] = (byte) (j142 >> 13);
                bArrDigest[21] = (byte) j152;
                bArrDigest[22] = (byte) (j152 >> 8);
                bArrDigest[23] = (byte) ((j152 >> 16) | (j151 << 5));
                bArrDigest[24] = (byte) (j151 >> 3);
                bArrDigest[25] = (byte) (j151 >> 11);
                bArrDigest[26] = (byte) ((j151 >> 19) | (j149 << 2));
                bArrDigest[27] = (byte) (j149 >> 6);
                bArrDigest[28] = (byte) ((j149 >> 14) | (j150 << 7));
                bArrDigest[29] = (byte) (j150 >> 1);
                bArrDigest[30] = (byte) (j150 >> 9);
                bArrDigest[31] = (byte) (j150 >> 17);
                long[] jArr = new long[10];
                long[] jArrZzg = zzhlj.zzg(bArr3);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzhlj.zzf(jArr4, jArrZzg);
                zzhlj.zze(jArr5, jArr4, zzhle.zza);
                zzhlj.zzb(jArr4, jArr4, jArr2);
                zzhlj.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzhlj.zzf(jArr8, jArr5);
                zzhlj.zze(jArr8, jArr8, jArr5);
                zzhlj.zzf(jArr, jArr8);
                zzhlj.zze(jArr, jArr, jArr5);
                zzhlj.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzhlj.zzf(jArr9, jArr);
                zzhlj.zzf(jArr10, jArr9);
                zzhlj.zzf(jArr10, jArr10);
                zzhlj.zze(jArr10, jArr, jArr10);
                zzhlj.zze(jArr9, jArr9, jArr10);
                zzhlj.zzf(jArr9, jArr9);
                zzhlj.zze(jArr9, jArr10, jArr9);
                zzhlj.zzf(jArr10, jArr9);
                byte[] bArr5 = bArrCopyOfRange;
                for (int i14 = 1; i14 < 5; i14++) {
                    zzhlj.zzf(jArr10, jArr10);
                }
                zzhlj.zze(jArr9, jArr10, jArr9);
                zzhlj.zzf(jArr10, jArr9);
                for (int i15 = 1; i15 < 10; i15++) {
                    zzhlj.zzf(jArr10, jArr10);
                }
                zzhlj.zze(jArr10, jArr10, jArr9);
                zzhlj.zzf(jArr11, jArr10);
                for (int i16 = 1; i16 < 20; i16++) {
                    zzhlj.zzf(jArr11, jArr11);
                }
                zzhlj.zze(jArr10, jArr11, jArr10);
                zzhlj.zzf(jArr10, jArr10);
                for (int i17 = 1; i17 < 10; i17++) {
                    zzhlj.zzf(jArr10, jArr10);
                }
                zzhlj.zze(jArr9, jArr10, jArr9);
                zzhlj.zzf(jArr10, jArr9);
                for (int i18 = 1; i18 < 50; i18++) {
                    zzhlj.zzf(jArr10, jArr10);
                }
                zzhlj.zze(jArr10, jArr10, jArr9);
                zzhlj.zzf(jArr11, jArr10);
                for (int i19 = 1; i19 < 100; i19++) {
                    zzhlj.zzf(jArr11, jArr11);
                }
                zzhlj.zze(jArr10, jArr11, jArr10);
                zzhlj.zzf(jArr10, jArr10);
                for (int i20 = 1; i20 < 50; i20++) {
                    zzhlj.zzf(jArr10, jArr10);
                }
                zzhlj.zze(jArr9, jArr10, jArr9);
                zzhlj.zzf(jArr9, jArr9);
                zzhlj.zzf(jArr9, jArr9);
                zzhlj.zze(jArr, jArr9, jArr);
                zzhlj.zze(jArr, jArr, jArr8);
                zzhlj.zze(jArr, jArr, jArr4);
                zzhlj.zzf(jArr6, jArr);
                zzhlj.zze(jArr6, jArr6, jArr5);
                zzhlj.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    zzhlj.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    zzhlj.zze(jArr, jArr, zzhle.zzc);
                }
                if (zze(jArr)) {
                    c10 = 31;
                    b10 = 255;
                    i10 = 7;
                } else {
                    c10 = 31;
                    b10 = 255;
                    i10 = 7;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[c10] & b10) >> i10)) {
                    zzm(jArr, jArr);
                }
                zzhlj.zze(jArr3, jArr, jArrZzg);
                zzhlb zzhlbVar = new zzhlb(new zzhla(jArr, jArrZzg, jArr2), jArr3);
                zzhky[] zzhkyVarArr = new zzhky[8];
                zzhkyVarArr[0] = new zzhky(zzhlbVar);
                zzhkz zzhkzVar = new zzhkz(new zzhla(), new long[10]);
                zzi(zzhkzVar, zzhlbVar.zza);
                zzhlb zzhlbVar2 = new zzhlb(zzhkzVar);
                for (int i21 = 1; i21 < 8; i21++) {
                    zzg(zzhkzVar, zzhlbVar2, zzhkyVarArr[i21 - 1]);
                    zzhkyVarArr[i21] = new zzhky(new zzhlb(zzhkzVar));
                }
                byte[] bArrZzl = zzl(bArrDigest);
                byte[] bArrZzl2 = zzl(bArr5);
                zzhkz zzhkzVar2 = new zzhkz(zzc);
                zzhlb zzhlbVar3 = new zzhlb();
                int i22 = b10;
                while (i22 >= 0 && bArrZzl[i22] == 0 && bArrZzl2[i22] == 0) {
                    i22--;
                }
                while (i22 >= 0) {
                    zzi(zzhkzVar2, new zzhla(zzhkzVar2));
                    byte b12 = bArrZzl[i22];
                    if (b12 > 0) {
                        zzhlb.zza(zzhlbVar3, zzhkzVar2);
                        b11 = 2;
                        zzg(zzhkzVar2, zzhlbVar3, zzhkyVarArr[bArrZzl[i22] / 2]);
                    } else {
                        b11 = 2;
                        if (b12 < 0) {
                            zzhlb.zza(zzhlbVar3, zzhkzVar2);
                            zzh(zzhkzVar2, zzhlbVar3, zzhkyVarArr[(-bArrZzl[i22]) / 2]);
                        }
                    }
                    byte b13 = bArrZzl2[i22];
                    if (b13 > 0) {
                        zzhlb.zza(zzhlbVar3, zzhkzVar2);
                        zzg(zzhkzVar2, zzhlbVar3, zzhle.zze[bArrZzl2[i22] / b11]);
                    } else if (b13 < 0) {
                        zzhlb.zza(zzhlbVar3, zzhkzVar2);
                        zzh(zzhkzVar2, zzhlbVar3, zzhle.zze[(-bArrZzl2[i22]) / b11]);
                    }
                    i22--;
                }
                byte[] bArrZzb = new zzhla(zzhkzVar2).zzb();
                for (int i23 = 0; i23 < 32; i23++) {
                    if (bArrZzb[i23] != bArr2[i23]) {
                        return false;
                    }
                }
                return true;
            }
            i11--;
            bArrCopyOfRange = bArrCopyOfRange;
            bArr4 = bArr2;
        }
        return false;
    }

    public static void zzd() {
        if (zzhle.zza == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhlj.zzd(jArr2);
        byte[] bArrZzh = zzhlj.zzh(jArr2);
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrZzh[i10] != 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ int zzf(long[] jArr) {
        return zzhlj.zzh(jArr)[0] & 1;
    }

    private static void zzg(zzhkz zzhkzVar, zzhlb zzhlbVar, zzhkx zzhkxVar) {
        zzhla zzhlaVar = zzhlbVar.zza;
        zzhla zzhlaVar2 = zzhkzVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhlaVar2.zza;
        long[] jArr3 = zzhlaVar.zzb;
        long[] jArr4 = zzhlaVar.zza;
        zzhlj.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhlaVar2.zzb;
        zzhlj.zzb(jArr5, jArr3, jArr4);
        zzhlj.zze(jArr5, jArr5, zzhkxVar.zzb);
        long[] jArr6 = zzhkxVar.zza;
        long[] jArr7 = zzhlaVar2.zzc;
        zzhlj.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhkzVar.zzb;
        zzhlj.zze(jArr8, zzhlbVar.zzb, zzhkxVar.zzc);
        zzhkxVar.zza(jArr2, zzhlaVar.zzc);
        zzhlj.zza(jArr, jArr2, jArr2);
        zzhlj.zzb(jArr2, jArr7, jArr5);
        zzhlj.zza(jArr5, jArr7, jArr5);
        zzhlj.zza(jArr7, jArr, jArr8);
        zzhlj.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(zzhkz zzhkzVar, zzhlb zzhlbVar, zzhkx zzhkxVar) {
        zzhla zzhlaVar = zzhlbVar.zza;
        zzhla zzhlaVar2 = zzhkzVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhlaVar2.zza;
        long[] jArr3 = zzhlaVar.zzb;
        long[] jArr4 = zzhlaVar.zza;
        zzhlj.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhlaVar2.zzb;
        zzhlj.zzb(jArr5, jArr3, jArr4);
        zzhlj.zze(jArr5, jArr5, zzhkxVar.zza);
        long[] jArr6 = zzhkxVar.zzb;
        long[] jArr7 = zzhlaVar2.zzc;
        zzhlj.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhkzVar.zzb;
        zzhlj.zze(jArr8, zzhlbVar.zzb, zzhkxVar.zzc);
        zzhkxVar.zza(jArr2, zzhlaVar.zzc);
        zzhlj.zza(jArr, jArr2, jArr2);
        zzhlj.zzb(jArr2, jArr7, jArr5);
        zzhlj.zza(jArr5, jArr7, jArr5);
        zzhlj.zzb(jArr7, jArr, jArr8);
        zzhlj.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(zzhkz zzhkzVar, zzhla zzhlaVar) {
        zzhla zzhlaVar2 = zzhkzVar.zza;
        long[] jArr = zzhlaVar2.zza;
        long[] jArr2 = zzhlaVar.zza;
        long[] jArr3 = new long[10];
        zzhlj.zzf(jArr, jArr2);
        long[] jArr4 = zzhlaVar2.zzc;
        long[] jArr5 = zzhlaVar.zzb;
        zzhlj.zzf(jArr4, jArr5);
        long[] jArr6 = zzhkzVar.zzb;
        zzhlj.zzf(jArr6, zzhlaVar.zzc);
        zzhlj.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhlaVar2.zzb;
        zzhlj.zza(jArr7, jArr2, jArr5);
        zzhlj.zzf(jArr3, jArr7);
        zzhlj.zza(jArr7, jArr4, jArr);
        zzhlj.zzb(jArr4, jArr4, jArr);
        zzhlj.zzb(jArr, jArr3, jArr7);
        zzhlj.zzb(jArr6, jArr6, jArr4);
    }

    private static int zzj(int i10, int i11) {
        int i12 = (~(i10 ^ i11)) & 255;
        int i13 = i12 & (i12 << 4);
        int i14 = i13 & (i13 << 2);
        return (i14 & (i14 + i14)) >> 7;
    }

    private static void zzk(zzhkx zzhkxVar, int i10, byte b10) {
        zzhkx[][] zzhkxVarArr = zzhle.zzd;
        int i11 = (b10 & 255) >> 7;
        int i12 = (-i11) & b10;
        int i13 = b10 - (i12 + i12);
        zzhkxVar.zzb(zzhkxVarArr[i10][0], zzj(i13, 1));
        zzhkxVar.zzb(zzhkxVarArr[i10][1], zzj(i13, 2));
        zzhkxVar.zzb(zzhkxVarArr[i10][2], zzj(i13, 3));
        zzhkxVar.zzb(zzhkxVarArr[i10][3], zzj(i13, 4));
        zzhkxVar.zzb(zzhkxVarArr[i10][4], zzj(i13, 5));
        zzhkxVar.zzb(zzhkxVarArr[i10][5], zzj(i13, 6));
        zzhkxVar.zzb(zzhkxVarArr[i10][6], zzj(i13, 7));
        zzhkxVar.zzb(zzhkxVarArr[i10][7], zzj(i13, 8));
        long[] jArr = zzhkxVar.zzc;
        long[] jArr2 = zzhkxVar.zza;
        long[] jArrCopyOf = Arrays.copyOf(zzhkxVar.zzb, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        zzm(jArrCopyOf3, jArrCopyOf3);
        zzhkxVar.zzb(new zzhkx(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i11);
    }

    private static byte[] zzl(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        int i14 = b10 << i13;
                        int i15 = b11 + i14;
                        if (i15 > 15) {
                            int i16 = b11 - i14;
                            if (i16 < -15) {
                                break;
                            }
                            bArr2[i12] = (byte) i16;
                            while (i10 < 256) {
                                if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                }
                                bArr2[i10] = 0;
                                i10++;
                            }
                        } else {
                            bArr2[i12] = (byte) i15;
                            bArr2[i10] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            jArr[i10] = -jArr2[i10];
        }
    }

    private static long zzn(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (bArr[i10] & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    private static long zzo(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | zzn(bArr, i10);
    }
}
