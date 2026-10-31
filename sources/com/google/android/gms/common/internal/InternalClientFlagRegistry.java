package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class InternalClientFlagRegistry {
    private static final InternalClientFlags zza = zzag.zza();

    private InternalClientFlagRegistry() {
    }

    public static InternalClientFlags getClientFlags() {
        return zza;
    }
}
