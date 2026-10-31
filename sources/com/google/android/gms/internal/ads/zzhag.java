package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhag extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    zzhag(int[] iArr, int i10, int i11) {
        this.zza = iArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzhah.zzi(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhag)) {
            return super.equals(obj);
        }
        zzhag zzhagVar = (zzhag) obj;
        int i10 = this.zzc;
        int i11 = this.zzb;
        int i12 = zzhagVar.zzc;
        int i13 = zzhagVar.zzb;
        int i14 = i10 - i11;
        if (i12 - i13 != i14) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.zza[i11 + i15] != zzhagVar.zza[i13 + i15]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11 = this.zzc;
        int i12 = this.zzb;
        zzgtj.zzm(i10, i11 - i12, "index");
        return Integer.valueOf(this.zza[i12 + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.zzb; i10 < this.zzc; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zza[i10]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.zzb;
        int iZzi = zzhah.zzi(iArr, iIntValue, i10, this.zzc);
        if (iZzi >= 0) {
            return iZzi - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.zzb;
            int i11 = this.zzc - 1;
            while (i11 >= i10) {
                if (iArr[i11] != iIntValue) {
                    i11--;
                } else if (i11 >= 0) {
                    return i11 - i10;
                }
            }
            i11 = -1;
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int i11 = this.zzc;
        int i12 = this.zzb;
        Integer num = (Integer) obj;
        zzgtj.zzm(i10, i11 - i12, "index");
        int[] iArr = this.zza;
        int i13 = i12 + i10;
        int i14 = iArr[i13];
        num.getClass();
        iArr[i13] = num.intValue();
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.zzc;
        int i13 = this.zzb;
        zzgtj.zzo(i10, i11, i12 - i13);
        return i10 == i11 ? Collections.emptyList() : new zzhag(this.zza, i10 + i13, i13 + i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i10 = this.zzc;
        int i11 = this.zzb;
        StringBuilder sb2 = new StringBuilder((i10 - i11) * 5);
        sb2.append('[');
        int[] iArr = this.zza;
        sb2.append(iArr[i11]);
        while (true) {
            i11++;
            if (i11 >= i10) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
    }
}
