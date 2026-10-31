package com.google.android.gms.internal.measurement;

import com.google.common.base.p;
import com.google.common.util.concurrent.x;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zztx extends zzuw {
    private static final zzuw zza = new zztx();

    private zztx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzuw
    public final String zza(zzti zztiVar) {
        p.l(zztiVar);
        return "singleproc";
    }

    @Override // com.google.android.gms.internal.measurement.zzuw
    public final /* bridge */ /* synthetic */ zzuv zzb(zztr zztrVar, String str, Executor executor, zzru zzruVar, zzti zztiVar) {
        p.l(zztiVar);
        return new zzui(str, x.g(zztrVar.zza()), zzve.zzd(zztrVar.zzb(), zztrVar.zzf() ? zzadf.zzb() : zzadf.zza()), executor, zzruVar, zztrVar.zzc(), zzwb.zzb());
    }
}
