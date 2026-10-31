package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabj extends zzabh {
    private static final Map zza;
    private final zzyz zzb;

    static {
        EnumMap enumMap = new EnumMap(zzyz.class);
        for (zzyz zzyzVar : zzyz.values()) {
            zzabj[] zzabjVarArr = new zzabj[10];
            for (int i10 = 0; i10 < 10; i10++) {
                zzabjVarArr[i10] = new zzabj(i10, zzyzVar, zzza.zza());
            }
            enumMap.put(zzyzVar, zzabjVarArr);
        }
        zza = Collections.unmodifiableMap(enumMap);
    }

    private zzabj(int i10, zzyz zzyzVar, zzza zzzaVar) {
        super(zzzaVar, i10);
        zzabr.zza(zzyzVar, "format char");
        this.zzb = zzyzVar;
        if (zzzaVar.zze()) {
            zzyzVar.zze();
            return;
        }
        int iZzb = zzyzVar.zzb();
        iZzb = zzzaVar.zzk() ? iZzb & 65503 : iZzb;
        StringBuilder sb2 = new StringBuilder("%");
        zzzaVar.zzl(sb2);
        sb2.append((char) iZzb);
    }

    public static zzabj zza(int i10, zzyz zzyzVar, zzza zzzaVar) {
        if (i10 >= 10 || !zzzaVar.zze()) {
            return new zzabj(i10, zzyzVar, zzzaVar);
        }
        zzabj[] zzabjVarArr = (zzabj[]) zza.get(zzyzVar);
        zzabr.zza(zzabjVarArr, "default parameter");
        return zzabjVarArr[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    protected final void zzb(zzabi zzabiVar, Object obj) {
        zzabiVar.zzc(obj, this.zzb, zzd());
    }
}
