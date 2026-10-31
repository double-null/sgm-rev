package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzidx implements zzifn {
    private static final zzidx zza = new zzidx();

    private zzidx() {
    }

    public static zzidx zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifn
    public final boolean zzb(Class cls) {
        return zziee.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzifn
    public final zzifm zzc(Class cls) {
        if (!zziee.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzifm) zziee.zzbt(cls.asSubclass(zziee.class)).zzbs();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
