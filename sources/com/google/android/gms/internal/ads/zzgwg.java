package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzgwg extends zzgwh {
    Object[] zza;
    int zzb;
    boolean zzc;

    zzgwg(int i10) {
        zzgvi.zzb(i10, "initialCapacity");
        this.zza = new Object[i10];
        this.zzb = 0;
    }

    private final void zzf(int i10) {
        int length = this.zza.length;
        int iZze = zzgwh.zze(length, this.zzb + i10);
        if (iZze > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZze);
            this.zzc = false;
        }
    }

    public final zzgwg zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    final void zzb(Object[] objArr, int i10) {
        zzgyf.zza(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    public final zzgwh zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzgwi) {
                this.zzb = ((zzgwi) collection).zzg(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzd(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgwh
    public /* bridge */ /* synthetic */ zzgwh zzd(Object obj) {
        throw null;
    }
}
