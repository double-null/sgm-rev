package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.m;
import com.google.common.collect.u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzte extends zztr {
    private final Uri zza;
    private final zzafc zzb;
    private final m zzc;
    private final u zzd;
    private final zzuj zze;
    private final boolean zzf;

    /* synthetic */ zzte(Uri uri, zzafc zzafcVar, m mVar, u uVar, zzuj zzujVar, boolean z10, boolean z11, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzafcVar;
        this.zzc = mVar;
        this.zzd = uVar;
        this.zze = zzujVar;
        this.zzf = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztr) {
            zztr zztrVar = (zztr) obj;
            if (this.zza.equals(zztrVar.zza()) && this.zzb.equals(zztrVar.zzb()) && this.zzc.equals(zztrVar.zzc()) && this.zzd.equals(zztrVar.zzd()) && this.zze.equals(zztrVar.zze()) && this.zzf == zztrVar.zzf()) {
                zztrVar.zzg();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ (true != this.zzf ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        zzuj zzujVar = this.zze;
        u uVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(uVar);
        String string3 = zzujVar.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        int length5 = string3.length();
        boolean z10 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + length5 + 32 + String.valueOf(z10).length() + 22);
        sb2.append("ProtoDataStoreConfig{uri=");
        sb2.append(string);
        sb2.append(", schema=");
        sb2.append(string2);
        sb2.append(", handler=");
        sb2.append(strValueOf);
        sb2.append(", migrations=");
        sb2.append(strValueOf2);
        sb2.append(", variantConfig=");
        sb2.append(string3);
        sb2.append(", useGeneratedExtensionRegistry=");
        sb2.append(z10);
        sb2.append(", enableTracing=false}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final Uri zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final zzafc zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final m zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final u zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final zzuj zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final boolean zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    final boolean zzg() {
        return false;
    }
}
