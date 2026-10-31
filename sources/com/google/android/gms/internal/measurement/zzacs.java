package com.google.android.gms.internal.measurement;

import d5.LXP.wcAlQCOdREZdI;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzacs extends zzacv {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    /* synthetic */ zzacs(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzU() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzg = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzg = i12;
        this.zzf = i10 - i12;
    }

    final long zzA() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzI = zzI();
            j10 |= ((long) (bZzI & 127)) << i10;
            if ((bZzI & 128) == 0) {
                return j10;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
    }

    public final int zzB() throws IOException {
        int i10 = this.zzh;
        if (this.zzf - i10 < 4) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final long zzC() throws IOException {
        int i10 = this.zzh;
        if (this.zzf - i10 < 8) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzD(int i10) throws zzaeh {
        if (i10 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.zzh;
        if (i11 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzj;
        if (i11 > i12) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = i11;
        zzU();
        return i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzE(int i10) {
        this.zzj = i10;
        zzU();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzF() {
        int i10 = this.zzj;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzG() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzH() {
        return this.zzh;
    }

    public final byte zzI() throws IOException {
        int i10 = this.zzh;
        if (i10 == this.zzf) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 1;
        return bArr[i10];
    }

    public final byte[] zzJ(int i10) throws IOException {
        if (i10 > 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                int i13 = i10 + i12;
                this.zzh = i13;
                return Arrays.copyOfRange(this.zze, i12, i13);
            }
        }
        if (i10 > 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            return zzaed.zza;
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzK(byte[] bArr, int i10, int i11) throws IOException {
        zzacv.zzT(bArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, this.zzf - this.zzh);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.zze, this.zzh, bArr, i10, iMin);
        this.zzh += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzL(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zza() throws IOException {
        if (zzG()) {
            this.zzi = 0;
            return 0;
        }
        int iZzv = zzv();
        this.zzi = iZzv;
        if ((iZzv >>> 3) != 0) {
            return iZzv;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzb(int i10) throws zzaeh {
        if (this.zzi != i10) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzc(int i10) throws IOException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i12 < 10) {
                    if (zzI() < 0) {
                        i12++;
                    }
                }
                throw new zzaeh("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zze;
                int i13 = this.zzh;
                this.zzh = i13 + 1;
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
            zzL(zzv());
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
        return Double.longBitsToDouble(zzC());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzB());
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
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzi() throws IOException {
        return zzC();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzj() throws IOException {
        return zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzk() throws IOException {
        return zzz() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzm() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzv <= i10 - i11) {
                String strZzd = zzagl.zzd(this.zze, i11, iZzv);
                this.zzh += iZzv;
                return strZzd;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv <= 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacr zzn() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzv <= i10 - i11) {
                zzacr zzacrVarZzk = zzacr.zzk(this.zze, i11, iZzv, false);
                this.zzh += iZzv;
                return zzacrVarZzk;
            }
        }
        return iZzv == 0 ? zzacr.zza : zzacr.zzl(zzJ(iZzv), false);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] zzo() throws IOException {
        return zzJ(zzv());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzp() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzq() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzr() throws IOException {
        return zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzs() throws IOException {
        return zzC();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzt() throws IOException {
        return zzacv.zzR(zzv());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzu() throws IOException {
        return zzacv.zzS(zzz());
    }

    protected abstract int zzv() throws IOException;

    protected abstract int zzw() throws IOException;

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzx() throws IOException {
        return zzw();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int zzy() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzh = r3
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
            r5.zzh = r1
            return r0
        L6d:
            long r0 = r5.zzA()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzacs.zzy():int");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzz() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzh = i13;
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
                        this.zzh = i14;
                        return j12;
                    }
                    j13 = i17 ^ 16256;
                    i14 = i16;
                    j12 = j13;
                    this.zzh = i14;
                    return j12;
                }
                i10 = i15 ^ (-128);
                j12 = i10;
                this.zzh = i14;
                return j12;
            }
        }
        return zzA();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzl() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzv <= i10 - i11) {
                String str = new String(this.zze, i11, iZzv, StandardCharsets.UTF_8);
                this.zzh += iZzv;
                return str;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv < 0) {
            throw new zzaeh(wcAlQCOdREZdI.lWzgNMDzYy);
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
