package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzafv implements zzahk {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzahk
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i10));
        if (iZza != -1) {
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzd(zzet zzetVar, int i10, int i11) {
        zzetVar.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzA(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zze(long j10, int i10, int i11, int i12, zzahj zzahjVar) {
    }
}
