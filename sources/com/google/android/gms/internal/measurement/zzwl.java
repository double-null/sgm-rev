package com.google.android.gms.internal.measurement;

import androidx.collection.h;
import com.google.common.base.p;
import com.google.common.collect.w;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzwl {
    private static final zzwj zza = zzwj.zza(Boolean.class);
    private final zzwl zzb;
    private final h zzc;
    private boolean zzd = false;

    /* synthetic */ zzwl(zzwl zzwlVar, h hVar, byte[] bArr) {
        if (zzwlVar != null) {
            p.d(zzwlVar.zzd);
        }
        this.zzb = zzwlVar;
        this.zzc = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static zzwl zza(zzwl zzwlVar, zzwl zzwlVar2) {
        if (zzwlVar.zzc()) {
            return zzwlVar2;
        }
        if (zzwlVar2.zzc()) {
            return zzwlVar;
        }
        w<zzwl> wVarG = w.G(zzwlVar, zzwlVar2);
        if (wVarG.isEmpty()) {
            return zzwk.zza;
        }
        if (wVarG.size() == 1) {
            return (zzwl) wVarG.iterator().next();
        }
        int size = 0;
        for (zzwl zzwlVar3 : wVarG) {
            do {
                size += zzwlVar3.zzc.size();
                zzwlVar3 = zzwlVar3.zzb;
            } while (zzwlVar3 != null);
        }
        if (size == 0) {
            return zzwk.zza;
        }
        h hVar = new h(size);
        for (zzwl zzwlVar4 : wVarG) {
            do {
                int i10 = 0;
                while (true) {
                    h hVar2 = zzwlVar4.zzc;
                    if (i10 >= hVar2.size()) {
                        break;
                    }
                    p.i(hVar.put((zzwj) hVar2.j(i10), hVar2.n(i10)) == null, "Duplicate bindings: %s", hVar2.j(i10));
                    i10++;
                }
                zzwlVar4 = zzwlVar4.zzb;
            } while (zzwlVar4 != null);
        }
        return new zzwk(null, hVar, 0 == true ? 1 : 0).zzb();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (zzwl zzwlVar = this; zzwlVar != null; zzwlVar = zzwlVar.zzb) {
            for (int i10 = 0; i10 < zzwlVar.zzc.size(); i10++) {
                sb2.append("[");
                sb2.append(this.zzc.n(i10));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }

    final zzwl zzb() {
        if (this.zzd) {
            throw new IllegalStateException("Already frozen");
        }
        this.zzd = true;
        zzwl zzwlVar = this.zzb;
        return (zzwlVar == null || !this.zzc.isEmpty()) ? this : zzwlVar;
    }

    public final boolean zzc() {
        return this == zzwk.zza;
    }

    final boolean zzd(zzwj zzwjVar) {
        if (this.zzc.containsKey(zzwjVar)) {
            return true;
        }
        zzwl zzwlVar = this.zzb;
        return zzwlVar != null && zzwlVar.zzd(zzwjVar);
    }

    final boolean zze() {
        return this.zzd;
    }

    final /* synthetic */ h zzg() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }
}
