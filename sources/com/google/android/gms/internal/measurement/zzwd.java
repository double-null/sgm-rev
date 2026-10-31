package com.google.android.gms.internal.measurement;

import com.google.common.collect.w;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwd extends zzvn implements zzvs {
    static final zzvq zza = new zzvr();
    public static final /* synthetic */ int zzb = 0;
    private final Exception zzc;

    private zzwd(UUID uuid, String str, Exception exc, boolean z10, zzwq zzwqVar) {
        super("<missing root>", uuid, str, zzwqVar);
        this.zzc = exc;
    }

    public static zzwd zzi(zzwq zzwqVar) {
        final UUID uuidZzc = zzvz.zza().zzc();
        String strZzcL = zzvn.zzcL(uuidZzc);
        w wVarZza = zzvy.zza();
        if (!wVarZza.isEmpty()) {
            final Exception exc = null;
            wVarZza.forEach(new Consumer(uuidZzc, exc) { // from class: com.google.android.gms.internal.measurement.zzwc
                @Override // java.util.function.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    int i10 = zzwd.zzb;
                    ((zzwu) obj).zza();
                }
            });
        }
        return new zzwd(uuidZzc, strZzcL, zza, false, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final Exception zzf() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final zzws zzg(String str, zzwl zzwlVar, boolean z10, zzwq zzwqVar) {
        if (z10) {
            int i10 = zzvy.zzb;
        }
        return new zzwf(str, this, zzwlVar, z10, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwk.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzj(String str, String str2, String str3, int i10, zzwl zzwlVar, zzwq zzwqVar) {
        int i11 = zzvy.zzb;
        return zzg(str, zzwlVar, true, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final long zzk() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        throw null;
    }
}
