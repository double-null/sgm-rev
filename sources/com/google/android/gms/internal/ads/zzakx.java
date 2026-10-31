package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakx implements zzahf {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzakx(int i10, long j10, int i11) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = i11;
    }

    public final String toString() {
        String strZzz = zzfl.zzz(this.zza);
        int length = strZzz.length();
        long j10 = this.zzb;
        int length2 = String.valueOf(j10).length();
        int i10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i10).length() + 1);
        sb2.append("AtomSizeTooSmall{type=");
        sb2.append(strZzz);
        sb2.append(", size=");
        sb2.append(j10);
        sb2.append(", minHeaderSize=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }
}
