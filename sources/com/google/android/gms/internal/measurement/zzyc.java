package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzyc implements zzyd {
    public static final zzyc zza = new zzya();

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LogSite{ class=");
        sb2.append(zza());
        sb2.append(", method=");
        sb2.append(zzb());
        sb2.append(", line=");
        sb2.append(zzc());
        if (zzd() != null) {
            sb2.append(", file=");
            sb2.append(zzd());
        }
        if (zze() != null) {
            sb2.append(", filePath=");
            sb2.append(zze());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public abstract String zza();

    public abstract String zzb();

    public abstract int zzc();

    public abstract String zzd();

    public String zze() {
        return null;
    }
}
