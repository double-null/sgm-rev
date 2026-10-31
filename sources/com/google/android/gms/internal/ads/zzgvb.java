package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzgvb extends zzguz implements List {
    final /* synthetic */ zzgvc zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvb(zzgvc zzgvcVar, Object obj, List list, zzguz zzguzVar) {
        super(zzgvcVar, obj, list, zzguzVar);
        Objects.requireNonNull(zzgvcVar);
        this.zzf = zzgvcVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i10, obj);
        zzgvc zzgvcVar = this.zzf;
        zzgvcVar.zzq(zzgvcVar.zzp() + 1);
        if (zIsEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i10, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgvc zzgvcVar = this.zzf;
        zzgvcVar.zzq(zzgvcVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zza();
        return ((List) this.zzb).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgva(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zza();
        Object objRemove = ((List) this.zzb).remove(i10);
        zzgvc zzgvcVar = this.zzf;
        zzgvcVar.zzq(zzgvcVar.zzp() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zza();
        return ((List) this.zzb).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zza();
        List listSubList = ((List) this.zzb).subList(i10, i11);
        zzguz zzguzVar = this.zzc;
        if (zzguzVar == null) {
            zzguzVar = this;
        }
        return this.zzf.zzg(this.zza, listSubList, zzguzVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zza();
        return new zzgva(this, i10);
    }
}
