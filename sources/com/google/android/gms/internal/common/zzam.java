package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzam extends zzah implements List, RandomAccess {
    private static final zzaq zza = new zzaj(zzao.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzam() {
    }

    public static zzam zzj() {
        return zzao.zza;
    }

    public static zzam zzk(Object obj) {
        Object[] objArr = {obj};
        zzan.zza(objArr, 1);
        return zzq(objArr, 1);
    }

    public static zzam zzl(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzan.zza(objArr, 2);
        return zzq(objArr, 2);
    }

    public static zzam zzm(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzan.zza(objArr, 3);
        return zzq(objArr, 3);
    }

    public static zzam zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzan.zza(objArr, 6);
        return zzq(objArr, 6);
    }

    public static zzam zzo(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzp((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzao.zza;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzk(next);
        }
        zzai zzaiVar = new zzai(4);
        zzaiVar.zzb(next);
        zzaiVar.zzc(it);
        return zzaiVar.zzd();
    }

    public static zzam zzp(Collection collection) {
        if (!(collection instanceof zzah)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzan.zza(array, length);
            return zzq(array, length);
        }
        zzam zzamVarZze = ((zzah) collection).zze();
        if (!zzamVarZze.zzf()) {
            return zzamVarZze;
        }
        Object[] array2 = zzamVarZze.toArray();
        return zzq(array2, array2.length);
    }

    static zzam zzq(Object[] objArr, int i10) {
        return i10 == 0 ? zzao.zza : new zzao(objArr, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (Objects.equals(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && Objects.equals(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzah
    /* JADX INFO: renamed from: zza */
    public final zzap iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.common.zzah
    int zzg(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    public zzam zzh() {
        return size() <= 1 ? this : new zzak(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public zzam subList(int i10, int i11) {
        zzs.zzd(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? zzao.zza : new zzal(this, i10, i12);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzaq listIterator(int i10) {
        zzs.zzc(i10, size(), "index");
        return isEmpty() ? zza : new zzaj(this, i10);
    }

    @Override // com.google.android.gms.internal.common.zzah
    @Deprecated
    public final zzam zze() {
        return this;
    }
}
