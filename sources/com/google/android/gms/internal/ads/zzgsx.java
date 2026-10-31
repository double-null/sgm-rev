package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgsx implements zzgtk {
    protected zzgsx() {
    }

    public static zzgsx zzc(char c10) {
        return new zzgsu(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}
