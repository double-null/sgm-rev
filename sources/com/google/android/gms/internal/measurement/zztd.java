package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.m;
import com.google.common.collect.u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zztd extends zztq {
    private Uri zza;
    private zzafc zzb;
    private m zzc = m.b();
    private u zzd;
    private zzuj zze;
    private boolean zzf;
    private byte zzg;

    zztd() {
    }

    @Override // com.google.android.gms.internal.measurement.zztq
    public final zztq zza(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.zza = uri;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zztq
    public final zztq zzb(zzafc zzafcVar) {
        if (zzafcVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.zzb = zzafcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zztq
    public final zztq zzc(zztf zztfVar) {
        this.zzc = m.f(zztfVar);
        return this;
    }

    public final zztq zzd(zzuj zzujVar) {
        this.zze = zzujVar;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zztq
    public final zztq zze(boolean z10) {
        this.zzf = true;
        this.zzg = (byte) (1 | this.zzg);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zztq
    public final zztq zzf(boolean z10) {
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zztq
    public final zztr zzg() {
        Uri uri;
        zzafc zzafcVar;
        zzuj zzujVar;
        if (this.zzd == null) {
            this.zzd = u.H();
        }
        if (this.zzg == 3 && (uri = this.zza) != null && (zzafcVar = this.zzb) != null && (zzujVar = this.zze) != null) {
            return new zzte(uri, zzafcVar, this.zzc, this.zzd, zzujVar, this.zzf, false, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" uri");
        }
        if (this.zzb == null) {
            sb2.append(" schema");
        }
        if (this.zze == null) {
            sb2.append(" variantConfig");
        }
        if ((this.zzg & 1) == 0) {
            sb2.append(" useGeneratedExtensionRegistry");
        }
        if ((this.zzg & 2) == 0) {
            sb2.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
