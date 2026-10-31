package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcjq implements zzhp {
    private final zzhp zza;
    private final long zzb;
    private final zzhp zzc;
    private long zzd;
    private Uri zze;

    zzcjq(zzhp zzhpVar, int i10, zzhp zzhpVar2) {
        this.zza = zzhpVar;
        this.zzb = i10;
        this.zzc = zzhpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int iZza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + ((long) iZza);
            this.zzd = j12;
            i12 = iZza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < j11) {
            return i12;
        }
        int iZza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZza2;
        this.zzd += (long) iZza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(zzht zzhtVar) throws IOException {
        zzht zzhtVar2;
        Uri uri = zzhtVar.zza;
        this.zze = uri;
        long j10 = zzhtVar.zze;
        long j11 = this.zzb;
        zzht zzhtVar3 = null;
        if (j10 >= j11) {
            zzhtVar2 = null;
        } else {
            long j12 = zzhtVar.zzf;
            long j13 = j11 - j10;
            zzhtVar2 = new zzht(uri, j10, j12 != -1 ? Math.min(j12, j13) : j13, null);
        }
        long j14 = zzhtVar.zzf;
        if (j14 == -1 || j10 + j14 > j11) {
            zzhtVar3 = new zzht(uri, Math.max(j11, j10), j14 != -1 ? Math.min(j14, (j10 + j14) - j11) : -1L, null);
        }
        long jZzb = zzhtVar2 != null ? this.zza.zzb(zzhtVar2) : 0L;
        long jZzb2 = zzhtVar3 != null ? this.zzc.zzb(zzhtVar3) : 0L;
        this.zzd = j10;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzii
    public final Map zzj() {
        return zzgwp.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zze(zzin zzinVar) {
    }
}
