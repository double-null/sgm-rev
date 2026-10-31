package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzahn;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzac extends zzab {
    final /* synthetic */ zzad zza;
    private final com.google.android.gms.internal.measurement.zzfn zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzad zzadVar, String str, int i10, com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        super(str, i10);
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzh = zzfnVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzc() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean zzd(Long l10, Long l11, com.google.android.gms.internal.measurement.zziu zziuVar, boolean z10) {
        zzahn.zza();
        zzic zzicVar = this.zza.zzu;
        boolean zZzp = zzicVar.zzc().zzp(this.zzb, zzfy.zzaD);
        com.google.android.gms.internal.measurement.zzfn zzfnVar = this.zzh;
        boolean zZze = zzfnVar.zze();
        boolean zZzf = zzfnVar.zzf();
        boolean zZzi = zzfnVar.zzi();
        Object[] objArr = zZze || zZzf || zZzi;
        Boolean boolZze = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        boolZze = null;
        if (z10 && objArr != true) {
            zzicVar.zzaW().zzk().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzfh zzfhVarZzd = zzfnVar.zzd();
        boolean zZzf2 = zzfhVarZzd.zzf();
        if (zziuVar.zzf()) {
            if (zzfhVarZzd.zzc()) {
                boolZze = zzab.zze(zzab.zzg(zziuVar.zzh(), zzfhVarZzd.zzd()), zZzf2);
            } else {
                zzicVar.zzaW().zze().zzb("No number filter for long property. property", zzicVar.zzl().zzc(zziuVar.zzc()));
            }
        } else if (zziuVar.zzk()) {
            if (zzfhVarZzd.zzc()) {
                boolZze = zzab.zze(zzab.zzh(zziuVar.zzl(), zzfhVarZzd.zzd()), zZzf2);
            } else {
                zzicVar.zzaW().zze().zzb("No number filter for double property. property", zzicVar.zzl().zzc(zziuVar.zzc()));
            }
        } else if (!zziuVar.zzd()) {
            zzicVar.zzaW().zze().zzb("User property has no value, property", zzicVar.zzl().zzc(zziuVar.zzc()));
        } else if (zzfhVarZzd.zza()) {
            boolZze = zzab.zze(zzab.zzf(zziuVar.zze(), zzfhVarZzd.zzb(), zzicVar.zzaW()), zZzf2);
        } else if (!zzfhVarZzd.zzc()) {
            zzicVar.zzaW().zze().zzb("No string or number filter defined. property", zzicVar.zzl().zzc(zziuVar.zzc()));
        } else if (zzpk.zzm(zziuVar.zze())) {
            boolZze = zzab.zze(zzab.zzi(zziuVar.zze(), zzfhVarZzd.zzd()), zZzf2);
        } else {
            zzicVar.zzaW().zze().zzc("Invalid user property value for Numeric number filter. property, value", zzicVar.zzl().zzc(zziuVar.zzc()), zziuVar.zze());
        }
        zzicVar.zzaW().zzk().zzb("Property filter result", boolZze == null ? "null" : boolZze);
        if (boolZze == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (zZzi && !boolZze.booleanValue()) {
            return true;
        }
        if (!z10 || zzfnVar.zze()) {
            this.zze = boolZze;
        }
        if (boolZze.booleanValue() && objArr != false && zziuVar.zza()) {
            long jZzb = zziuVar.zzb();
            if (l10 != null) {
                jZzb = l10.longValue();
            }
            if (zZzp && zzfnVar.zze() && !zzfnVar.zzf() && l11 != null) {
                jZzb = l11.longValue();
            }
            if (zzfnVar.zzf()) {
                this.zzg = Long.valueOf(jZzb);
            } else {
                this.zzf = Long.valueOf(jZzb);
            }
        }
        return true;
    }
}
