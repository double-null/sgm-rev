package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacz extends zzada {
    private final byte[] zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private final OutputStream zzg;

    zzacz(OutputStream outputStream, int i10) {
        super(null);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.zzc = bArr;
        this.zzd = bArr.length;
    }

    private final void zzJ(int i10) throws IOException {
        if (this.zzd - this.zze < i10) {
            zzK();
        }
    }

    private final void zzK() throws IOException {
        this.zzg.write(this.zzc, 0, this.zze);
        this.zze = 0;
    }

    final void zzA(long j10) {
        if (zzada.zzc) {
            long j11 = this.zze;
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr = this.zzc;
                    int i11 = this.zze;
                    this.zze = i11 + 1;
                    zzagg.zzo(bArr, i11, (byte) i10);
                    this.zzf += (int) (((long) this.zze) - j11);
                    return;
                }
                byte[] bArr2 = this.zzc;
                int i12 = this.zze;
                this.zze = i12 + 1;
                zzagg.zzo(bArr2, i12, (byte) (i10 | 128));
                j10 >>>= 7;
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr3 = this.zzc;
                    int i14 = this.zze;
                    this.zze = i14 + 1;
                    bArr3[i14] = (byte) i13;
                    this.zzf++;
                    return;
                }
                byte[] bArr4 = this.zzc;
                int i15 = this.zze;
                this.zze = i15 + 1;
                bArr4[i15] = (byte) (i13 | 128);
                this.zzf++;
                j10 >>>= 7;
            }
        }
    }

    final void zzB(int i10) {
        int i11 = this.zze;
        int i12 = i11 + 1;
        byte[] bArr = this.zzc;
        bArr[i11] = (byte) i10;
        bArr[i12] = (byte) (i10 >> 8);
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i10 >> 16);
        int i14 = i13 + 1;
        bArr[i14] = (byte) (i10 >> 24);
        this.zze = i14 + 1;
        this.zzf += 4;
    }

    final void zzC(long j10) {
        int i10 = this.zze;
        int i11 = i10 + 1;
        byte[] bArr = this.zzc;
        bArr[i10] = (byte) j10;
        bArr[i11] = (byte) (j10 >> 8);
        int i12 = i11 + 1;
        bArr[i12] = (byte) (j10 >> 16);
        int i13 = i12 + 1;
        bArr[i13] = (byte) (j10 >> 24);
        int i14 = i13 + 1;
        bArr[i14] = (byte) (j10 >> 32);
        int i15 = i14 + 1;
        bArr[i15] = (byte) (j10 >> 40);
        int i16 = i15 + 1;
        bArr[i16] = (byte) (j10 >> 48);
        int i17 = i16 + 1;
        bArr[i17] = (byte) (j10 >> 56);
        this.zze = i17 + 1;
        this.zzf += 8;
    }

    public final void zzD(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzd;
        int i13 = this.zze;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zzc, i13, i11);
            this.zze += i11;
            this.zzf += i11;
            return;
        }
        byte[] bArr2 = this.zzc;
        System.arraycopy(bArr, i10, bArr2, i13, i14);
        int i15 = i10 + i14;
        this.zze = i12;
        this.zzf += i14;
        zzK();
        int i16 = i11 - i14;
        if (i16 <= i12) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.zze = i16;
        } else {
            this.zzg.write(bArr, i15, i16);
        }
        this.zzf += i16;
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzD(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzb(int i10, int i11) throws IOException {
        zzr((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzc(int i10, int i11) throws IOException {
        zzJ(20);
        zzz(i10 << 3);
        if (i11 >= 0) {
            zzz(i11);
        } else {
            zzA(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzd(int i10, int i11) throws IOException {
        zzJ(20);
        zzz(i10 << 3);
        zzz(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zze(int i10, int i11) throws IOException {
        zzJ(14);
        zzz((i10 << 3) | 5);
        zzB(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzf(int i10, long j10) throws IOException {
        zzJ(20);
        zzz(i10 << 3);
        zzA(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzg(int i10, long j10) throws IOException {
        zzJ(18);
        zzz((i10 << 3) | 1);
        zzC(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzh(int i10, boolean z10) throws IOException {
        zzJ(11);
        zzz(i10 << 3);
        zzv(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzi(int i10, String str) throws IOException {
        zzr((i10 << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzj(int i10, zzacr zzacrVar) throws IOException {
        zzr((i10 << 3) | 2);
        zzk(zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzk(zzacr zzacrVar) throws IOException {
        zzr(zzacrVar.zzb());
        zzacrVar.zze(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzl(byte[] bArr, int i10, int i11) throws IOException {
        zzr(i11);
        zzD(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzm(int i10, zzafc zzafcVar) throws IOException {
        zzr(11);
        zzd(2, i10);
        zzr(26);
        zzo(zzafcVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzn(int i10, zzacr zzacrVar) throws IOException {
        zzr(11);
        zzd(2, i10);
        zzj(3, zzacrVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzo(zzafc zzafcVar) throws IOException {
        zzr(zzafcVar.zzcq());
        zzafcVar.zzcH(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzp(byte b10) throws IOException {
        if (this.zze == this.zzd) {
            zzK();
        }
        zzv(b10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzq(int i10) throws IOException {
        if (i10 >= 0) {
            zzr(i10);
        } else {
            zzt(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzr(int i10) throws IOException {
        zzJ(5);
        zzz(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzs(int i10) throws IOException {
        zzJ(4);
        zzB(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzt(long j10) throws IOException {
        zzJ(10);
        zzA(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzu(long j10) throws IOException {
        zzJ(8);
        zzC(j10);
    }

    final void zzv(byte b10) {
        byte[] bArr = this.zzc;
        int i10 = this.zze;
        bArr[i10] = b10;
        this.zze = i10 + 1;
        this.zzf++;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzw(String str) throws IOException {
        int iZzb;
        int length = str.length() * 3;
        int iZzE = zzada.zzE(length);
        int i10 = iZzE + length;
        int i11 = this.zzd;
        if (i10 > i11) {
            byte[] bArr = new byte[length];
            int iZzc = zzagl.zzc(str, bArr, 0, length);
            zzr(iZzc);
            zzD(bArr, 0, iZzc);
            return;
        }
        if (i10 > i11 - this.zze) {
            zzK();
        }
        int iZzE2 = zzada.zzE(str.length());
        int i12 = this.zze;
        try {
            if (iZzE2 == iZzE) {
                int i13 = i12 + iZzE2;
                this.zze = i13;
                int iZzc2 = zzagl.zzc(str, this.zzc, i13, i11 - i13);
                this.zze = i12;
                iZzb = (iZzc2 - i12) - iZzE2;
                zzz(iZzb);
                this.zze = iZzc2;
            } else {
                iZzb = zzagl.zzb(str);
                zzz(iZzb);
                this.zze = zzagl.zzc(str, this.zzc, this.zze, iZzb);
            }
            this.zzf += iZzb;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new zzacy(e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzx() throws IOException {
        if (this.zze > 0) {
            zzK();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int zzy() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void zzz(int i10) {
        if (!zzada.zzc) {
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                bArr[i11] = (byte) (i10 | 128);
                this.zzf++;
                i10 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i12 = this.zze;
            this.zze = i12 + 1;
            bArr2[i12] = (byte) i10;
            this.zzf++;
            return;
        }
        long j10 = this.zze;
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.zzc;
            int i13 = this.zze;
            this.zze = i13 + 1;
            zzagg.zzo(bArr3, i13, (byte) (i10 | 128));
            i10 >>>= 7;
        }
        byte[] bArr4 = this.zzc;
        int i14 = this.zze;
        this.zze = i14 + 1;
        zzagg.zzo(bArr4, i14, (byte) i10);
        this.zzf += (int) (((long) this.zze) - j10);
    }
}
