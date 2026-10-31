package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfw implements zzao {
    public final int zza;

    public zzfw(int i10) {
        this.zza = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzfw) && this.zza == ((zzfw) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 19);
        sb2.append("Mp4AlternateGroup: ");
        sb2.append(i10);
        return sb2.toString();
    }
}
