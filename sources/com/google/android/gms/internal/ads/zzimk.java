package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzimk implements Iterator {
    int zza = 0;
    final /* synthetic */ zziml zzb;

    zzimk(zziml zzimlVar) {
        this.zzb = zzimlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zza;
        zziml zzimlVar = this.zzb;
        return i10 < zzimlVar.zza.size() || zzimlVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zza;
        zziml zzimlVar = this.zzb;
        List list = zzimlVar.zza;
        if (i10 >= list.size()) {
            list.add(zzimlVar.zzb.next());
            return next();
        }
        int i11 = this.zza;
        this.zza = i11 + 1;
        return list.get(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
