package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzatc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzate zzc;

    zzatc(zzate zzateVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        Objects.requireNonNull(zzateVar);
        this.zzc = zzateVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzate zzateVar = this.zzc;
        zzateVar.zzx().zza(this.zza, this.zzb);
        zzateVar.zzx().zzb(zzateVar.toString());
    }
}
