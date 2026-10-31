package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgwo {
    Object[] zza;
    int zzb;
    zzgwn zzc;

    public zzgwo() {
        this(4);
    }

    private final void zze(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzgwh.zze(length, i11));
        }
    }

    private final zzgwp zzf(boolean z10) {
        zzgwn zzgwnVar;
        zzgwn zzgwnVar2;
        if (z10 && (zzgwnVar2 = this.zzc) != null) {
            throw zzgwnVar2.zza();
        }
        zzgym zzgymVarZzk = zzgym.zzk(this.zzb, this.zza, this);
        if (!z10 || (zzgwnVar = this.zzc) == null) {
            return zzgymVarZzk;
        }
        throw zzgwnVar.zza();
    }

    public final zzgwo zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgvi.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    public final zzgwo zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgwp zzc() {
        return zzf(true);
    }

    public final zzgwp zzd() {
        return zzf(false);
    }

    zzgwo(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}
