package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaet {
    private static final zzafa zzb = new zzaer();
    private final zzafa zza;

    public zzaet() {
        zzafa zzafaVar = zzb;
        int i10 = zzacf.zza;
        this.zza = new zzaes(zzado.zza(), zzafaVar);
    }

    public final zzafp zza(Class cls) {
        int i10 = zzafq.zza;
        if (!zzadu.class.isAssignableFrom(cls)) {
            int i11 = zzacf.zza;
        }
        zzaez zzaezVarZzc = this.zza.zzc(cls);
        if (zzaezVarZzc.zza()) {
            int i12 = zzacf.zza;
            return zzafg.zzh(zzafq.zzB(), zzadi.zza(), zzaezVarZzc.zzb());
        }
        int i13 = zzacf.zza;
        return zzaff.zzm(cls, zzaezVarZzc, zzafi.zza(), zzaep.zza(), zzafq.zzB(), zzaezVarZzc.zzc() + (-1) != 1 ? zzadi.zza() : null, zzaey.zza());
    }
}
