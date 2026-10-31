package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzigu {
    private static final zzigu zza = new zzigu(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzigu(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzigu zza() {
        return zza;
    }

    static zzigu zzb() {
        return new zzigu();
    }

    static zzigu zzc(zzigu zziguVar, zzigu zziguVar2) {
        int i10 = zziguVar.zzb + zziguVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zziguVar.zzc, i10);
        System.arraycopy(zziguVar2.zzc, 0, iArrCopyOf, zziguVar.zzb, zziguVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zziguVar.zzd, i10);
        System.arraycopy(zziguVar2.zzd, 0, objArrCopyOf, zziguVar.zzb, zziguVar2.zzb);
        return new zzigu(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i10) {
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
        if (obj == null || !(obj instanceof zzigu)) {
            return false;
        }
        zzigu zziguVar = (zzigu) obj;
        int i10 = this.zzb;
        if (i10 == zziguVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziguVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zziguVar.zzd;
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

    final void zzf(zzihi zzihiVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzihiVar.zzv(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzg(zzihi zzihiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzihiVar.zzc(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzihiVar.zzj(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzihiVar.zzn(i13, (zzida) obj);
                } else if (i12 == 3) {
                    zzihiVar.zzt(i13);
                    ((zzigu) obj).zzg(zzihiVar);
                    zzihiVar.zzu(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzies("Protocol message tag had invalid wire type."));
                    }
                    zzihiVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzF = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzida zzidaVar = (zzida) this.zzd[i11];
            int iZzF2 = zzidj.zzF(8);
            int iZzF3 = zzidj.zzF(16) + zzidj.zzF(i12);
            int iZzF4 = zzidj.zzF(24);
            int iZzb = zzidaVar.zzb();
            iZzF += iZzF2 + iZzF2 + iZzF3 + iZzF4 + zzidj.zzF(iZzb) + iZzb;
        }
        this.zze = iZzF;
        return iZzF;
    }

    public final int zzi() {
        int iZzF;
        int iZzG;
        int iZzF2;
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
                    iZzF2 = zzidj.zzF(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    zzida zzidaVar = (zzida) this.zzd[i12];
                    int iZzF3 = zzidj.zzF(i16);
                    int iZzb = zzidaVar.zzb();
                    iZzF2 = iZzF3 + zzidj.zzF(iZzb) + iZzb;
                } else if (i15 == 3) {
                    int iZzF4 = zzidj.zzF(i14 << 3);
                    iZzF = iZzF4 + iZzF4;
                    iZzG = ((zzigu) this.zzd[i12]).zzi();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzies("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i12]).intValue();
                    iZzF2 = zzidj.zzF(i14 << 3) + 4;
                }
                i11 += iZzF2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.zzd[i12]).longValue();
                iZzF = zzidj.zzF(i17);
                iZzG = zzidj.zzG(jLongValue);
            }
            iZzF2 = iZzF + iZzG;
            i11 += iZzF2;
        }
        this.zze = i11;
        return i11;
    }

    final void zzj(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzifr.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    final void zzk(int i10, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    final boolean zzl(int i10, zzide zzideVar) throws IOException {
        int iZza;
        zze();
        int i11 = i10 & 7;
        if (i11 == 0) {
            zzk(i10, Long.valueOf(zzideVar.zzg()));
            return true;
        }
        if (i11 == 1) {
            zzk(i10, Long.valueOf(zzideVar.zzi()));
            return true;
        }
        if (i11 == 2) {
            zzk(i10, zzideVar.zzn());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                zzideVar.zzK();
                return false;
            }
            if (i11 != 5) {
                throw new zzies("Protocol message tag had invalid wire type.");
            }
            zzk(i10, Integer.valueOf(zzideVar.zzj()));
            return true;
        }
        zzigu zziguVar = new zzigu();
        do {
            iZza = zzideVar.zza();
            if (iZza == 0) {
                break;
            }
        } while (zziguVar.zzl(iZza, zzideVar));
        zzideVar.zzb(4 | ((i10 >>> 3) << 3));
        zzk(i10, zziguVar);
        return true;
    }

    final zzigu zzm(zzigu zziguVar) {
        if (zziguVar.equals(zza)) {
            return this;
        }
        zze();
        int i10 = this.zzb + zziguVar.zzb;
        zzn(i10);
        System.arraycopy(zziguVar.zzc, 0, this.zzc, this.zzb, zziguVar.zzb);
        System.arraycopy(zziguVar.zzd, 0, this.zzd, this.zzb, zziguVar.zzb);
        this.zzb = i10;
        return this;
    }

    private zzigu() {
        this(0, new int[8], new Object[8], true);
    }
}
