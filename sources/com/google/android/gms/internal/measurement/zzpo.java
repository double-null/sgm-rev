package com.google.android.gms.internal.measurement;

import com.google.common.base.p;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpo {
    private final AtomicReferenceArray zza;
    private final zzog zzb;

    public zzpo(zzog zzogVar, int i10) {
        this.zzb = zzogVar;
        this.zza = new AtomicReferenceArray(i10);
    }

    public final zzom zza(int i10, String str, boolean z10) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVarZza = (zzom) atomicReferenceArray.get(i10);
        if (zzomVarZza == null) {
            zzomVarZza = this.zzb.zza(str, z10);
            if (!a.a(atomicReferenceArray, i10, null, zzomVarZza)) {
                return (zzom) p.l((zzom) atomicReferenceArray.get(i10));
            }
        }
        return zzomVarZza;
    }

    public final zzom zzb(int i10, String str, long j10) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVarZzb = (zzom) atomicReferenceArray.get(i10);
        if (zzomVarZzb == null) {
            zzomVarZzb = this.zzb.zzb(str, j10);
            if (!a.a(atomicReferenceArray, i10, null, zzomVarZzb)) {
                return (zzom) p.l((zzom) atomicReferenceArray.get(i10));
            }
        }
        return zzomVarZzb;
    }

    public final zzom zzc(int i10, String str, double d10) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVarZzc = (zzom) atomicReferenceArray.get(2);
        if (zzomVarZzc == null) {
            zzomVarZzc = this.zzb.zzc("measurement.test.double_flag", -3.0d);
            if (!a.a(atomicReferenceArray, 2, null, zzomVarZzc)) {
                return (zzom) p.l((zzom) atomicReferenceArray.get(2));
            }
        }
        return zzomVarZzc;
    }

    public final zzom zzd(int i10, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVarZzd = (zzom) atomicReferenceArray.get(i10);
        if (zzomVarZzd == null) {
            zzomVarZzd = this.zzb.zzd(str, str2);
            if (!a.a(atomicReferenceArray, i10, null, zzomVarZzd)) {
                return (zzom) p.l((zzom) atomicReferenceArray.get(i10));
            }
        }
        return zzomVarZzd;
    }
}
