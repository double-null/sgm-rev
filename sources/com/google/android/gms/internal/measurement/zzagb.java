package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzagb extends zzafz {
    zzagb() {
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final /* bridge */ /* synthetic */ void zza(Object obj, int i10, long j10) {
        ((zzaga) obj).zzk(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i10, int i11) {
        ((zzaga) obj).zzk((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i10, long j10) {
        ((zzaga) obj).zzk((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, zzacr zzacrVar) {
        ((zzaga) obj).zzk((i10 << 3) | 2, zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final /* bridge */ /* synthetic */ void zze(Object obj, int i10, Object obj2) {
        ((zzaga) obj).zzk((i10 << 3) | 3, (zzaga) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final /* synthetic */ Object zzf() {
        return zzaga.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final /* synthetic */ Object zzg(Object obj) {
        zzaga zzagaVar = (zzaga) obj;
        zzagaVar.zzd();
        return zzagaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.zza()) {
            return zzagaVar;
        }
        zzaga zzagaVarZzb = zzaga.zzb();
        zzaduVar.zzc = zzagaVarZzb;
        return zzagaVarZzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzadu) obj).zzc = (zzaga) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzafz
    final void zzj(Object obj) {
        ((zzadu) obj).zzc.zzd();
    }
}
