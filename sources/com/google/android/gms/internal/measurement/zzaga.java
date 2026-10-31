package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaga {
    private static final zzaga zza = new zzaga(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzaga(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzaga zza() {
        return zza;
    }

    static zzaga zzb() {
        return new zzaga(0, new int[8], new Object[8], true);
    }

    static zzaga zzc(zzaga zzagaVar, zzaga zzagaVar2) {
        int i10 = zzagaVar.zzb + zzagaVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzagaVar.zzc, i10);
        System.arraycopy(zzagaVar2.zzc, 0, iArrCopyOf, zzagaVar.zzb, zzagaVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzagaVar.zzd, i10);
        System.arraycopy(zzagaVar2.zzd, 0, objArrCopyOf, zzagaVar.zzb, zzagaVar2.zzb);
        return new zzaga(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaga)) {
            return false;
        }
        zzaga zzagaVar = (zzaga) obj;
        int i10 = this.zzb;
        if (i10 == zzagaVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzagaVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzagaVar.zzd;
            int i12 = this.zzb;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzf(zzago zzagoVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzagoVar.zzv(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzg(zzago zzagoVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzagoVar.zzc(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzagoVar.zzj(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzagoVar.zzn(i13, (zzacr) obj);
                } else if (i12 == 3) {
                    zzagoVar.zzt(i13);
                    ((zzaga) obj).zzg(zzagoVar);
                    zzagoVar.zzu(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzaeg("Protocol message tag had invalid wire type."));
                    }
                    zzagoVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzE = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzacr zzacrVar = (zzacr) this.zzd[i11];
            int iZzE2 = zzada.zzE(8);
            int iZzE3 = zzada.zzE(16) + zzada.zzE(i12);
            int iZzE4 = zzada.zzE(24);
            int iZzb = zzacrVar.zzb();
            iZzE += iZzE2 + iZzE2 + iZzE3 + iZzE4 + zzada.zzE(iZzb) + iZzb;
        }
        this.zze = iZzE;
        return iZzE;
    }

    public final int zzi() {
        int iZzE;
        int iZzF;
        int iZzE2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.zzd[i12]).longValue();
                    iZzE2 = zzada.zzE(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    zzacr zzacrVar = (zzacr) this.zzd[i12];
                    int iZzE3 = zzada.zzE(i16);
                    int iZzb = zzacrVar.zzb();
                    iZzE2 = iZzE3 + zzada.zzE(iZzb) + iZzb;
                } else if (i15 == 3) {
                    int iZzE4 = zzada.zzE(i14 << 3);
                    iZzE = iZzE4 + iZzE4;
                    iZzF = ((zzaga) this.zzd[i12]).zzi();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzaeg("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i12]).intValue();
                    iZzE2 = zzada.zzE(i14 << 3) + 4;
                }
                i11 += iZzE2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.zzd[i12]).longValue();
                iZzE = zzada.zzE(i17);
                iZzF = zzada.zzF(jLongValue);
            }
            iZzE2 = iZzE + iZzF;
            i11 += iZzE2;
        }
        this.zze = i11;
        return i11;
    }

    final void zzj(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzafe.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    final void zzk(int i10, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    final zzaga zzl(zzaga zzagaVar) {
        if (zzagaVar.equals(zza)) {
            return this;
        }
        zze();
        int i10 = this.zzb + zzagaVar.zzb;
        zzm(i10);
        System.arraycopy(zzagaVar.zzc, 0, this.zzc, this.zzb, zzagaVar.zzb);
        System.arraycopy(zzagaVar.zzd, 0, this.zzd, this.zzb, zzagaVar.zzb);
        this.zzb = i10;
        return this;
    }

    private zzaga() {
        this(0, new int[8], new Object[8], true);
    }
}
