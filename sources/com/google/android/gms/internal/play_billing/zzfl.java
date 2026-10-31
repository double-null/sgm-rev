package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfl extends zzfo {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzfl(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzb(byte b10) throws IOException {
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
                throw new zzfm(i10, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zzc, this.zze, i11);
            this.zze += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfm(this.zze, this.zzd, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzd(int i10, boolean z10) throws IOException {
        zzu(i10 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zze(byte[] bArr, int i10, int i11) throws IOException {
        zzu(i11);
        zzc(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzf(int i10, zzfg zzfgVar) throws IOException {
        zzu((i10 << 3) | 2);
        zzg(zzfgVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzg(zzfg zzfgVar) throws IOException {
        zzu(zzfgVar.zzd());
        zzfgVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzh(int i10, int i11) throws IOException {
        zzu((i10 << 3) | 5);
        zzi(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzi(int i10) throws IOException {
        int i11 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zze = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfm(i11, this.zzd, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzj(int i10, long j10) throws IOException {
        zzu((i10 << 3) | 1);
        zzk(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzk(long j10) throws IOException {
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
            throw new zzfm(i10, this.zzd, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzl(int i10, int i11) throws IOException {
        zzu(i10 << 3);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzu(i10);
        } else {
            zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzn(zzhm zzhmVar) throws IOException {
        zzu(zzhmVar.zzn());
        zzhmVar.zzD(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzo(int i10, zzhm zzhmVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzu(26);
        zzn(zzhmVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzp(int i10, zzfg zzfgVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzf(3, zzfgVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzq(int i10, String str) throws IOException {
        zzu((i10 << 3) | 2);
        zzr(str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzr(String str) throws IOException {
        int i10 = this.zze;
        try {
            int iZzy = zzfo.zzy(str.length() * 3);
            int iZzy2 = zzfo.zzy(str.length());
            if (iZzy2 != iZzy) {
                int i11 = zzix.zza;
                zzu(zziu.zzb(str));
                byte[] bArr = this.zzc;
                int i12 = this.zze;
                this.zze = zzix.zza(str, bArr, i12, bArr.length - i12);
                return;
            }
            int i13 = i10 + iZzy2;
            this.zze = i13;
            byte[] bArr2 = this.zzc;
            int iZza = zzix.zza(str, bArr2, i13, bArr2.length - i13);
            this.zze = i10;
            zzu((iZza - i10) - iZzy2);
            this.zze = iZza;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzfm(e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzs(int i10, int i11) throws IOException {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzt(int i10, int i11) throws IOException {
        zzu(i10 << 3);
        zzu(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzu(int i10) throws IOException {
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
                    throw new zzfm(i12, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzfm(i12, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zzc[i12] = (byte) i10;
        this.zze = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzv(int i10, long j10) throws IOException {
        zzu(i10 << 3);
        zzw(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzw(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zze;
        if (!zzfo.zzc || this.zzd - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.zzc[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        i11 = i12;
                        indexOutOfBoundsException = e;
                        throw new zzfm(i11, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.zzc[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new zzfm(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                zzis.zzn(this.zzc, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            zzis.zzn(this.zzc, i11, (byte) j10);
        }
        this.zze = i10;
    }
}
