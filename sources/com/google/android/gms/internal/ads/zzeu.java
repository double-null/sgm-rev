package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeu {
    public static final zzeu zza = new zzeu(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzeu(0, 0);
        String str = zzfl.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzeu(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        zzgtj.zza(z10);
        this.zzb = i10;
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeu) {
            zzeu zzeuVar = (zzeu) obj;
            if (this.zzb == zzeuVar.zzb && this.zzc == zzeuVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.zzc;
    }

    public final String toString() {
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i11).length());
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }
}
