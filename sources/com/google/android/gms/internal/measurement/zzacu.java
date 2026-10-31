package com.google.android.gms.internal.measurement;

import g7.EinF.ZHgPsTG;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacu extends zzacv {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzacu(InputStream inputStream, int i10, byte[] bArr) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = inputStream;
        this.zzf = new byte[i10 < 8 ? 8 : i10];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final void zzB() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final void zzC(int i10) throws IOException {
        if (zzI(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzI(int i10) throws IOException {
        int i11 = this.zzi;
        int i12 = i11 + i10;
        int i13 = this.zzg;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 66);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i14 = this.zzk;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.zzl) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.zzk + i11;
            this.zzk = i14;
            i13 = this.zzg - i11;
            this.zzg = i13;
            this.zzi = 0;
        }
        InputStream inputStream = this.zze;
        byte[] bArr2 = this.zzf;
        try {
            int i15 = inputStream.read(bArr2, i13, Math.min(bArr2.length - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 != 0 && i15 >= -1 && i15 <= this.zzf.length) {
                if (i15 <= 0) {
                    return false;
                }
                this.zzg += i15;
                zzB();
                return this.zzg >= i10 || zzI(i10);
            }
            String strValueOf = String.valueOf(this.zze.getClass());
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 39 + String.valueOf(i15).length() + 41);
            sb3.append(strValueOf);
            sb3.append("#read(byte[]) returned invalid result: ");
            sb3.append(i15);
            sb3.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb3.toString());
        } catch (zzaeh e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzJ(int i10, boolean z10) throws IOException {
        byte[] bArrZzU = zzU(i10);
        if (bArrZzU != null) {
            return bArrZzU;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzV = zzV(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzU(int i10) throws IOException {
        if (i10 == 0) {
            return zzaed.zza;
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.zzl;
        if (i13 > i14) {
            zzL((i14 - i11) - i12);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.zzg - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zze.available()) {
                    return null;
                }
            } catch (zzaeh e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i15 < i10) {
            try {
                int i17 = this.zze.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i17;
                i15 += i17;
            } catch (zzaeh e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    private final List zzV(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                try {
                    int i12 = this.zze.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.zzk += i12;
                    i11 += i12;
                } catch (zzaeh e10) {
                    e10.zza();
                    throw e10;
                }
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final byte zzA() throws IOException {
        if (this.zzi == this.zzg) {
            zzC(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzD(int i10) throws zzaeh {
        if (i10 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.zzk + this.zzi;
        if (i11 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzl;
        if (i11 > i12) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i11;
        zzB();
        return i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzE(int i10) {
        this.zzl = i10;
        zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzF() {
        int i10 = this.zzl;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.zzk + this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzG() throws IOException {
        return this.zzi == this.zzg && !zzI(1);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzH() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzK(byte[] bArr, int i10, int i11) throws IOException {
        zzacv.zzT(bArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzg;
        int i13 = this.zzi;
        int i14 = i12 - i13;
        if (i14 > 0) {
            int iMin = Math.min(i11, i14);
            System.arraycopy(this.zzf, this.zzi, bArr, i10, iMin);
            this.zzi += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i11, (this.zzl - this.zzk) - i13);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i15 = this.zze.read(bArr, i10, iMin2);
            if (i15 != -1) {
                this.zzk += i15;
            }
            return i15;
        } catch (zzaeh e10) {
            e10.zza();
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzL(int i10) throws IOException {
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.zzk;
        int i15 = i14 + i12;
        int i16 = this.zzl;
        if (i15 + i10 > i16) {
            zzL((i16 - i14) - i12);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i15;
        this.zzg = 0;
        this.zzi = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.zze.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        String strValueOf = String.valueOf(this.zze.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzaeh e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th) {
                this.zzk += i13;
                zzB();
                throw th;
            }
        }
        this.zzk += i13;
        zzB();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzg;
        int i18 = i17 - this.zzi;
        this.zzi = i17;
        zzC(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.zzg;
            if (i19 <= i20) {
                this.zzi = i19;
                return;
            } else {
                i18 += i20;
                this.zzi = i20;
                zzC(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zza() throws IOException {
        if (zzG()) {
            this.zzj = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzj = iZzx;
        if ((iZzx >>> 3) != 0) {
            return iZzx;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzb(int i10) throws zzaeh {
        if (this.zzj != i10) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzc(int i10) throws IOException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zzA() < 0) {
                        i12++;
                    }
                }
                throw new zzaeh("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzf;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new zzaeh("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            zzL(8);
            return true;
        }
        if (i11 == 2) {
            zzL(zzx());
            return true;
        }
        if (i11 == 3) {
            zzQ();
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            zzP();
            return false;
        }
        if (i11 != 5) {
            throw new zzaeg("Protocol message tag had invalid wire type.");
        }
        zzL(4);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzf() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzg() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzh() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzj() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzk() throws IOException {
        return zzz() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzl() throws IOException {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzx <= i10 - i11) {
                String str = new String(this.zzf, i11, iZzx, StandardCharsets.UTF_8);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzx > this.zzg) {
            return new String(zzJ(iZzx, false), StandardCharsets.UTF_8);
        }
        zzC(iZzx);
        String str2 = new String(this.zzf, this.zzi, iZzx, StandardCharsets.UTF_8);
        this.zzi += iZzx;
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzm() throws IOException {
        byte[] bArrZzJ;
        int iZzx = zzx();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (iZzx <= i11 - i10 && iZzx > 0) {
            bArrZzJ = this.zzf;
            this.zzi = i10 + iZzx;
        } else {
            if (iZzx == 0) {
                return "";
            }
            if (iZzx < 0) {
                throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i10 = 0;
            if (iZzx <= i11) {
                zzC(iZzx);
                bArrZzJ = this.zzf;
                this.zzi = iZzx;
            } else {
                bArrZzJ = zzJ(iZzx, false);
            }
        }
        return zzagl.zzd(bArrZzJ, i10, iZzx);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacr zzn() throws IOException {
        int iZzx = zzx();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (iZzx <= i10 - i11 && iZzx > 0) {
            zzacr zzacrVarZzk = zzacr.zzk(this.zzf, i11, iZzx, false);
            this.zzi += iZzx;
            return zzacrVarZzk;
        }
        if (iZzx == 0) {
            return zzacr.zza;
        }
        if (iZzx < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzU = zzU(iZzx);
        if (bArrZzU != null) {
            return zzacr.zzk(bArrZzU, 0, bArrZzU.length, false);
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int i14 = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzV = zzV(iZzx - i14);
        byte[] bArr = new byte[iZzx];
        System.arraycopy(this.zzf, i12, bArr, 0, i14);
        for (byte[] bArr2 : listZzV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        try {
            return zzacr.zzl(bArr, false);
        } catch (zzaeh e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] zzo() throws IOException {
        int iZzx = zzx();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (iZzx > i10 - i11 || iZzx <= 0) {
            if (iZzx >= 0) {
                return zzJ(iZzx, false);
            }
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.zzf, i11, i11 + iZzx);
        this.zzi += iZzx;
        return bArrCopyOfRange;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzp() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzr() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzs() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzt() throws IOException {
        return zzacv.zzR(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzu() throws IOException {
        return zzacv.zzS(zzz());
    }

    final long zzv() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzA = zzA();
            j10 |= ((long) (bZzA & 127)) << i10;
            if ((bZzA & 128) == 0) {
                return j10;
            }
        }
        throw new zzaeh(ZHgPsTG.joUTPrOBpixI);
    }

    public final int zzw() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzC(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    @Override // com.google.android.gms.internal.measurement.zzacv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzx() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzi = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.zzi = r1
            return r0
        L6d:
            long r0 = r5.zzv()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzacu.zzx():int");
    }

    public final long zzy() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzC(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzz() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 < 0) {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = ((long) i18) ^ (((long) bArr[i14]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (((long) bArr[i19]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (((long) bArr[i16]) << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j14 = j15 ^ (((long) bArr[i19]) << 56);
                                            if (j14 >= 0) {
                                                j11 = 71499008037633920L;
                                            } else {
                                                i19 = i16 + 1;
                                                j15 = j14 ^ (((long) bArr[i16]) << 63);
                                                if (j15 >= 0) {
                                                    j10 = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                                i14 = i19;
                            }
                            j13 = j14 ^ j11;
                        }
                        this.zzi = i14;
                        return j12;
                    }
                    j13 = i17 ^ 16256;
                    i14 = i16;
                    j12 = j13;
                    this.zzi = i14;
                    return j12;
                }
                i10 = i15 ^ (-128);
                j12 = i10;
                this.zzi = i14;
                return j12;
            }
        }
        return zzv();
    }
}
