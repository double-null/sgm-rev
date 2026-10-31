package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwn implements zzzc {
    public final zzzc zza;
    final /* synthetic */ zzwo zzb;
    private boolean zzc;

    public zzwn(zzwo zzwoVar, zzzc zzzcVar) {
        Objects.requireNonNull(zzwoVar);
        this.zzb = zzwoVar;
        this.zza = zzzcVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zzd(zzlw zzlwVar, zziv zzivVar, int i10) {
        zzwo zzwoVar = this.zzb;
        if (zzwoVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzivVar.zzg(4);
            return -4;
        }
        zzzc zzzcVar = this.zza;
        long jZzi = zzwoVar.zzi();
        int iZzd = zzzcVar.zzd(zzlwVar, zzivVar, i10);
        if (zzwoVar.zzq() != -9223372036854775807L && iZzd != -3) {
            zzwoVar.zzr(-9223372036854775807L);
        }
        if (iZzd != -5) {
            long j10 = zzwoVar.zzb;
            if (j10 == Long.MIN_VALUE || ((iZzd != -4 || zzivVar.zze < j10) && !(iZzd == -3 && jZzi == Long.MIN_VALUE && !zzivVar.zzd))) {
                return iZzd;
            }
            zzivVar.zza();
            zzivVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        long j11 = zzwoVar.zzb;
        zzv zzvVar = zzlwVar.zzb;
        zzvVar.getClass();
        int i11 = zzvVar.zzK;
        if (i11 != 0) {
            int i12 = j11 == Long.MIN_VALUE ? zzvVar.zzL : 0;
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzJ(i11);
            zztVarZza.zzK(i12);
            zzlwVar.zzb = zztVarZza.zzO();
        } else if (zzvVar.zzL != 0) {
            i11 = 0;
            if (j11 == Long.MIN_VALUE) {
            }
            zzt zztVarZza2 = zzvVar.zza();
            zztVarZza2.zzJ(i11);
            zztVarZza2.zzK(i12);
            zzlwVar.zzb = zztVarZza2.zzO();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zze(long j10) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j10);
    }
}
