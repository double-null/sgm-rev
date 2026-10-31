package com.google.android.gms.internal.measurement;

import androidx.collection.h;
import com.google.common.base.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwk extends zzwl {
    static final zzwl zza;
    static final zzwl zzb;

    static {
        zzwl zzwlVarZzb = new zzwk(null, new h(0)).zzb();
        zza = zzwlVarZzb;
        zzwk zzwkVar = new zzwk(zzwlVarZzb, new h(), null);
        boolean z10 = !zzwkVar.zzh();
        Boolean bool = Boolean.TRUE;
        p.s(z10, "Can't mutate after handing to trace");
        p.l(bool);
        zzwj zzwjVar = zzwl.zza;
        p.s(!zzwkVar.zzd(zzwjVar), "Key already present");
        zzwkVar.zzg().put(zzwjVar, bool);
        zzb = zzwkVar.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzwk(zzwl zzwlVar, h hVar) {
        super(null, hVar, 0 == true ? 1 : 0);
    }

    /* synthetic */ zzwk(zzwl zzwlVar, h hVar, byte[] bArr) {
        super(zzwlVar, hVar, null);
    }
}
