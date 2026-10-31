package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzado implements zzafa {
    private static final zzado zza = new zzado();

    private zzado() {
    }

    public static zzado zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public final boolean zzb(Class cls) {
        return zzadu.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public final zzaez zzc(Class cls) {
        if (!zzadu.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzaez) zzadu.zzcr(cls.asSubclass(zzadu.class)).zzg(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
