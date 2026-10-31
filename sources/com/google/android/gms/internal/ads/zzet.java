package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzet {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgww zzc = zzgww.zzm(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzet(byte[] bArr, int i10) {
        this.zze = bArr;
        this.zzg = i10;
    }

    private final char zzS(ByteOrder byteOrder, int i10) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i11 = this.zzf + i10;
            return zzhad.zza(bArr[i11], bArr[i11 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i12 = this.zzf + i10;
        return zzhad.zza(bArr2[i12 + 1], bArr2[i12]);
    }

    private final char zzT(Charset charset, char[] cArr) {
        int iZzU;
        if (zzd() >= zzV(charset) && (iZzU = zzU(charset)) != 0) {
            int i10 = iZzU >>> 8;
            if (!Character.isSupplementaryCodePoint(i10)) {
                long j10 = i10;
                char c10 = (char) j10;
                zzgtj.zze(((long) c10) == j10, "Out of range: %s", j10);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.zzf += zzhah.zza(iZzU & 255);
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    private final int zzU(Charset charset) {
        int codePoint;
        int i10;
        int iA;
        zzgtj.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i11 = this.zzf;
            int i12 = this.zzg;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 17 + String.valueOf(i12).length());
            sb2.append("position=");
            sb2.append(i11);
            sb2.append(", limit=");
            sb2.append(i12);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i13 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.zze[this.zzf];
            if ((b10 & 128) == 0) {
                codePoint = w.a(b10);
                return (codePoint << 8) | i13;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.zze[this.zzf];
            if ((b11 & 128) == 0) {
                i10 = 1;
            } else if ((b11 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i10 = 2;
            } else if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                byte[] bArr = this.zze;
                int i14 = this.zzf;
                if (zzX(bArr[i14 + 1]) && zzX(bArr[i14 + 2])) {
                    i10 = 3;
                } else if ((this.zze[this.zzf] & 248) == 240) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            } else if ((this.zze[this.zzf] & 248) == 240 || zzd() < 4) {
                i10 = 0;
            } else {
                byte[] bArr2 = this.zze;
                int i15 = this.zzf;
                if (zzX(bArr2[i15 + 1]) && zzX(bArr2[i15 + 2]) && zzX(bArr2[i15 + 3])) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            }
            if (i10 == 1) {
                iA = w.a(this.zze[this.zzf]);
            } else if (i10 == 2) {
                byte[] bArr3 = this.zze;
                int i16 = this.zzf;
                iA = zzY(0, 0, bArr3[i16], bArr3[i16 + 1]);
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        byte[] bArr4 = this.zze;
                        int i17 = this.zzf;
                        iA = zzY(bArr4[i17], bArr4[i17 + 1], bArr4[i17 + 2], bArr4[i17 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i18 = this.zzf;
                iA = zzY(0, bArr5[i18] & 15, bArr5[i18 + 1], bArr5[i18 + 2]);
            }
            i13 = i10;
            codePoint = iA;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzS) || zzd() < 4) {
                codePoint = cZzS;
                i13 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzS, zzS(byteOrder, 2));
                i13 = 4;
            }
        }
        return (codePoint << 8) | i13;
    }

    private static int zzV(Charset charset) {
        zzgtj.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i10) {
        if (!zzd.get() || zzd() >= i10) {
            return;
        }
        int iZzd = zzd();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25 + String.valueOf(iZzd).length());
        sb2.append("bytesNeeded= ");
        sb2.append(i10);
        sb2.append(", bytesLeft=");
        sb2.append(iZzd);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    private static boolean zzX(byte b10) {
        return (b10 & 192) == 128;
    }

    private static int zzY(int i10, int i11, int i12, int i13) {
        return zzhah.zze((byte) 0, zzhal.zza(((i10 & 7) << 2) | ((i11 & 48) >> 4)), zzhal.zza(((i12 & 60) >> 2) | ((i11 & 15) << 4)), zzhal.zza((i13 & 63) | ((i12 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        this.zzf = i13 + 1;
        return ((((long) bArr[i13]) & 255) << 24) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        int i15 = i13 + 1;
        int i16 = bArr[i13] & 255;
        this.zzf = i15 + 1;
        return (bArr[i15] & 255) | (i12 << 24) | (i14 << 16) | (i16 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        int i15 = i13 + 1;
        int i16 = bArr[i13] & 255;
        this.zzf = i15 + 1;
        return ((bArr[i15] & 255) << 24) | i12 | (i14 << 8) | (i16 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        long j15 = bArr[i15];
        int i17 = i16 + 1;
        long j16 = bArr[i16];
        this.zzf = i17 + 1;
        return ((j16 & 255) << 8) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | (((long) bArr[i17]) & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        int i15 = i14 + 1;
        long j14 = bArr[i14];
        int i16 = i15 + 1;
        long j15 = bArr[i15];
        int i17 = i16 + 1;
        long j16 = bArr[i16];
        this.zzf = i17 + 1;
        return ((j15 & 255) << 40) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j16 & 255) << 48) | ((((long) bArr[i17]) & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = bArr[i11] & 255;
        this.zzf = i11 + 1 + 2;
        return i13 | (i12 << 8);
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int iZzB = zzB();
        if (iZzB >= 0) {
            return iZzB;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(iZzB);
        throw new IllegalStateException(sb2.toString());
    }

    public final int zzI() {
        int iZzC = zzC();
        if (iZzC >= 0) {
            return iZzC;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzC).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(iZzC);
        throw new IllegalStateException(sb2.toString());
    }

    public final long zzJ() {
        long jZzD = zzD();
        if (jZzD >= 0) {
            return jZzD;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(jZzD).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(jZzD);
        throw new IllegalStateException(sb2.toString());
    }

    public final String zzK(int i10, Charset charset) {
        zzW(i10);
        byte[] bArr = this.zze;
        int i11 = this.zzf;
        String str = new String(bArr, i11, i10, charset);
        this.zzf = i11 + i10;
        return str;
    }

    public final String zzL(int i10) {
        zzW(i10);
        if (i10 == 0) {
            return "";
        }
        int i11 = this.zzf;
        int i12 = (i11 + i10) - 1;
        String strZzk = zzfl.zzk(this.zze, i11, (i12 >= this.zzg || this.zze[i12] != 0) ? i10 : i10 - 1);
        this.zzf += i10;
        return strZzk;
    }

    public final String zzM(char c10) {
        if (zzd() == 0) {
            return null;
        }
        int i10 = this.zzf;
        while (i10 < this.zzg && this.zze[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.zze;
        int i11 = this.zzf;
        String strZzk = zzfl.zzk(bArr, i11, i10 - i11);
        this.zzf = i10;
        if (i10 < this.zzg) {
            this.zzf = i10 + 1;
        }
        return strZzk;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7 A[SYNTHETIC] */
    public final String zzN(Charset charset) {
        byte[] bArr;
        zzgtj.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            zzR();
        }
        int i10 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            i10 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i11 = this.zzf;
        while (true) {
            int i12 = this.zzg;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzfl.zzl(this.zze[i11])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.zze;
                if (bArr2[i11] == 0 && zzfl.zzl(bArr2[i11 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zze;
                    if (bArr[i11 + 1] == 0 && zzfl.zzl(bArr[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.zze;
                    if (bArr[i11 + 1] == 0) {
                        continue;
                    }
                }
                i11 += i10;
            }
        }
        String strZzK = zzK(i11 - this.zzf, charset);
        if (this.zzf != this.zzg && zzT(charset, zza) == '\r') {
            zzT(charset, zzb);
        }
        return strZzK;
    }

    public final long zzO() {
        int i10;
        zzW(1);
        long j10 = this.zze[this.zzf];
        int i11 = 7;
        while (true) {
            i10 = 0;
            if (i11 < 0) {
                break;
            }
            int i12 = 1 << i11;
            if ((((long) i12) & j10) == 0) {
                if (i11 >= 6) {
                    if (i11 != 7) {
                        break;
                    }
                    i10 = 1;
                    break;
                }
                j10 &= (long) (i12 - 1);
                i10 = 7 - i11;
                break;
            }
            i11--;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("Invalid UTF-8 sequence first byte: ");
            sb2.append(j10);
            throw new NumberFormatException(sb2.toString());
        }
        zzW(i10);
        for (int i13 = 1; i13 < i10; i13++) {
            byte b10 = this.zze[this.zzf + i13];
            if ((b10 & 192) != 128) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 42);
                sb3.append("Invalid UTF-8 sequence continuation byte: ");
                sb3.append(j10);
                throw new NumberFormatException(sb3.toString());
            }
            j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
        }
        this.zzf += i10;
        return j10;
    }

    public final long zzP() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzs = zzs();
            j10 |= (127 & jZzs) << (i10 * 7);
            if ((jZzs & 128) == 0) {
                break;
            }
        }
        return j10;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i10 = this.zzf;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.zzf = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i11 = this.zzf;
        byte b10 = bArr2[i11];
        if (b10 == -2) {
            if (bArr2[i11 + 1] != -1) {
                return null;
            }
            this.zzf = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.zzf = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void zza(int i10) {
        byte[] bArr = this.zze;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        zzb(bArr, i10);
    }

    public final void zzb(byte[] bArr, int i10) {
        this.zze = bArr;
        this.zzg = i10;
        this.zzf = 0;
    }

    public final void zzc(int i10) {
        byte[] bArr = this.zze;
        if (i10 > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i10);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zze.length) {
            z10 = true;
        }
        zzgtj.zza(z10);
        this.zzg = i10;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzg) {
            z10 = true;
        }
        zzgtj.zza(z10);
        this.zzf = i10;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i10) {
        zzh(this.zzf + i10);
    }

    public final void zzl(zzes zzesVar, int i10) {
        zzm(zzesVar.zza, 0, i10);
        zzesVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i10, int i11) {
        zzW(i11);
        System.arraycopy(this.zze, this.zzf, bArr, i10, i11);
        this.zzf += i11;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & 255;
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(Charset charset) {
        int iZzU = zzU(charset);
        if (iZzU != 0) {
            return zzhah.zza(iZzU >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            int iZzx = zzx();
            this.zzf -= 3;
            return iZzx;
        }
        int i10 = this.zzf;
        int i11 = this.zzg;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length());
        sb2.append("position=");
        sb2.append(i10);
        sb2.append(", limit=");
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int zzr() {
        if (zzd() >= 4) {
            int iZzB = zzB();
            this.zzf -= 4;
            return iZzB;
        }
        int i10 = this.zzf;
        int i11 = this.zzg;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length());
        sb2.append("position=");
        sb2.append(i10);
        sb2.append(", limit=");
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        this.zzf = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.zzf = i11 + 1;
        return (bArr[i11] & 255) | (i12 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.zzf = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.zzf = i11 + 1;
        return (short) ((bArr[i11] & 255) | (i12 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.zzf = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        this.zzf = i13 + 1;
        return (bArr[i13] & 255) | (i12 << 16) | (i14 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        int i13 = i11 + 1;
        int i14 = bArr[i11] & 255;
        this.zzf = i13 + 1;
        return (bArr[i13] & 255) | ((i12 << 24) >> 8) | (i14 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i10 = this.zzf;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        this.zzf = i13 + 1;
        return (((long) bArr[i13]) & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public zzet() {
        this.zze = zzfl.zzb;
    }

    public zzet(int i10) {
        this.zze = new byte[i10];
        this.zzg = i10;
    }

    public zzet(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
