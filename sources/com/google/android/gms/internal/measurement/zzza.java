package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzza {
    private static final long zza;
    private static final zzza zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static {
        long jCharAt = 0;
        for (int i10 = 0; i10 < 7; i10++) {
            jCharAt |= (((long) i10) + 1) << ((int) (((long) (" #(+,-0".charAt(i10) - ' ')) * 3));
        }
        zza = jCharAt;
        zzb = new zzza(0, -1, -1);
    }

    private zzza(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
    }

    public static zzza zza() {
        return zzb;
    }

    public static zzza zzb(String str, int i10, int i11, boolean z10) throws zzabo {
        if (i10 == i11 && !z10) {
            return zzb;
        }
        int i12 = true != z10 ? 0 : 128;
        while (i10 != i11) {
            int i13 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ' || cCharAt > '0') {
                int i14 = i13 - 1;
                if (cCharAt > '9') {
                    throw zzabo.zzb("invalid flag", str, i14);
                }
                int i15 = cCharAt - '0';
                while (i13 != i11) {
                    int i16 = i13 + 1;
                    char cCharAt2 = str.charAt(i13);
                    if (cCharAt2 == '.') {
                        return new zzza(i12, i15, zzn(str, i16, i11));
                    }
                    char c10 = (char) (cCharAt2 - '0');
                    if (c10 >= '\n') {
                        throw zzabo.zzb("invalid width character", str, i16 - 1);
                    }
                    i15 = (i15 * 10) + c10;
                    if (i15 > 999999) {
                        throw zzabo.zza("width too large", str, i14, i11);
                    }
                    i13 = i16;
                }
                return new zzza(i12, i15, -1);
            }
            int iZzm = zzm(cCharAt);
            if (iZzm < 0) {
                if (cCharAt == '.') {
                    return new zzza(i12, -1, zzn(str, i13, i11));
                }
                throw zzabo.zzb("invalid flag", str, i13 - 1);
            }
            int i17 = 1 << iZzm;
            if ((i12 & i17) != 0) {
                throw zzabo.zzb("repeated flag", str, i13 - 1);
            }
            i12 |= i17;
            i10 = i13;
        }
        return new zzza(i12, -1, -1);
    }

    static int zzc(String str, boolean z10) {
        int i10 = true != z10 ? 0 : 128;
        for (int i11 = 0; i11 < str.length(); i11++) {
            int iZzm = zzm(str.charAt(i11));
            if (iZzm < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i10 |= 1 << iZzm;
        }
        return i10;
    }

    private static int zzm(char c10) {
        return ((int) ((zza >>> ((c10 - ' ') * 3)) & 7)) - 1;
    }

    private static int zzn(String str, int i10, int i11) throws zzabo {
        if (i10 == i11) {
            throw zzabo.zzb("missing precision", str, i10 - 1);
        }
        int i12 = 0;
        for (int i13 = i10; i13 < i11; i13++) {
            char cCharAt = (char) (str.charAt(i13) - '0');
            if (cCharAt >= '\n') {
                throw zzabo.zzb("invalid precision character", str, i13);
            }
            i12 = (i12 * 10) + cCharAt;
            if (i12 > 999999) {
                throw zzabo.zza("precision too large", str, i10, i11);
            }
        }
        if (i12 != 0) {
            return i12;
        }
        if (i11 == i10 + 1) {
            return 0;
        }
        throw zzabo.zza("invalid precision", str, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzza) {
            zzza zzzaVar = (zzza) obj;
            if (zzzaVar.zzc == this.zzc && zzzaVar.zzd == this.zzd && zzzaVar.zze == this.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzc * 31) + this.zzd) * 31) + this.zze;
    }

    public final zzza zzd(int i10, boolean z10, boolean z11) {
        if (!zze()) {
            int i11 = this.zzc;
            int i12 = i11 & 128;
            if (i12 == 0) {
                return zzb;
            }
            if (i12 != i11 || this.zzd != -1 || this.zze != -1) {
                return new zzza(i12, -1, -1);
            }
        }
        return this;
    }

    public final boolean zze() {
        return this == zzb;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final int zzg() {
        return this.zze;
    }

    public final boolean zzh(int i10, boolean z10) {
        int i11;
        if (zze()) {
            return true;
        }
        int i12 = this.zzc;
        if (((~i10) & i12) != 0) {
            return false;
        }
        if (z10 || this.zze == -1) {
            return ((i12 & 9) == 9 || (i11 = i12 & 96) == 96 || (i11 != 0 && this.zzd == -1)) ? false : true;
        }
        return false;
    }

    public final boolean zzi(zzyz zzyzVar) {
        return zzh(zzyzVar.zzd(), zzyzVar.zzc().zza());
    }

    public final int zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        return (this.zzc & 128) != 0;
    }

    public final StringBuilder zzl(StringBuilder sb2) {
        if (!zze()) {
            int i10 = this.zzc;
            int i11 = 0;
            while (true) {
                int i12 = i10 & (-129);
                int i13 = 1 << i11;
                if (i13 > i12) {
                    break;
                }
                if ((i12 & i13) != 0) {
                    sb2.append(" #(+,-0".charAt(i11));
                }
                i11++;
            }
            int i14 = this.zzd;
            if (i14 != -1) {
                sb2.append(i14);
            }
            int i15 = this.zze;
            if (i15 != -1) {
                sb2.append('.');
                sb2.append(i15);
            }
        }
        return sb2;
    }
}
