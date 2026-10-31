package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabg extends zzabh {
    private final zzabf zza;

    private zzabg(zzza zzzaVar, int i10, zzabf zzabfVar) {
        super(zzzaVar, i10);
        this.zza = zzabfVar;
        StringBuilder sb2 = new StringBuilder("%");
        zzzaVar.zzl(sb2);
        sb2.append(true != zzzaVar.zzk() ? 't' : 'T');
        sb2.append(zzabfVar.zzb());
    }

    public static zzabh zza(zzabf zzabfVar, zzza zzzaVar, int i10) {
        return new zzabg(zzzaVar, i10, zzabfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    protected final void zzb(zzabi zzabiVar, Object obj) {
        zzabiVar.zzd(obj, this.zza, zzd());
    }
}
