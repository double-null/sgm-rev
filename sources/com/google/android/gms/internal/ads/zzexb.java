package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzexb implements zzfci {
    private final long zza;

    public zzexb(long j10) {
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putLong("cldut", this.zza);
    }
}
