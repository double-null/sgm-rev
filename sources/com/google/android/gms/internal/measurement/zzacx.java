package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacx extends zzada {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzacx(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzv(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzb(int i10, int i11) throws IOException {
        zzr((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzc(int i10, int i11) throws IOException {
        zzr(i10 << 3);
        zzq(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzd(int i10, int i11) throws IOException {
        zzr(i10 << 3);
        zzr(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zze(int i10, int i11) throws IOException {
        zzr((i10 << 3) | 5);
        zzs(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzf(int i10, long j10) throws IOException {
        zzr(i10 << 3);
        zzt(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzg(int i10, long j10) throws IOException {
        zzr((i10 << 3) | 1);
        zzu(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzh(int i10, boolean z10) throws IOException {
        zzr(i10 << 3);
        zzp(z10 ? (byte) 1 : (byte) 0);
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
        zzv(bArr, 0, i11);
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
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.zze;
        try {
            int i11 = i10 + 1;
            try {
                this.zzc[i10] = b10;
                this.zze = i11;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i10 = i11;
                throw new zzacy(i10, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
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
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.zze;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.zzc[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new zzacy(i12, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzacy(i12, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zzc[i12] = (byte) i10;
        this.zze = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzs(int i10) throws IOException {
        int i11 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zze = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacy(i11, this.zzd, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzt(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = zzada.zzc;
        int i11 = this.zze;
        if (!z10 || this.zzd - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.zzc[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new zzacy(i11, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.zzc[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new zzacy(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                zzagg.zzo(this.zzc, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            zzagg.zzo(this.zzc, i11, (byte) j10);
        }
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzu(long j10) throws IOException {
        int i10 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.zze = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacy(i10, this.zzd, 8, e10);
        }
    }

    public final void zzv(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zzc, this.zze, i11);
            this.zze += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacy(this.zze, this.zzd, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzw(String str) throws IOException {
        int i10 = this.zze;
        try {
            int iZzE = zzada.zzE(str.length() * 3);
            int iZzE2 = zzada.zzE(str.length());
            if (iZzE2 != iZzE) {
                zzr(zzagl.zzb(str));
                byte[] bArr = this.zzc;
                int i11 = this.zze;
                this.zze = zzagl.zzc(str, bArr, i11, bArr.length - i11);
                return;
            }
            int i12 = i10 + iZzE2;
            this.zze = i12;
            byte[] bArr2 = this.zzc;
            int iZzc = zzagl.zzc(str, bArr2, i12, bArr2.length - i12);
            this.zze = i10;
            zzr((iZzc - i10) - iZzE2);
            this.zze = iZzc;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacy(e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int zzy() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzx() {
    }
}
