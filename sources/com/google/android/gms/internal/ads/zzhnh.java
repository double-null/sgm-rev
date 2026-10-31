package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhnh {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhnh(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnh)) {
            return false;
        }
        zzhnh zzhnhVar = (zzhnh) obj;
        return zzhnhVar.zza.equals(this.zza) && zzhnhVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 22 + simpleName2.length());
        sb2.append(simpleName);
        sb2.append(" with primitive type: ");
        sb2.append(simpleName2);
        return sb2.toString();
    }
}
