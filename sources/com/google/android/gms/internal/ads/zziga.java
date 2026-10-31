package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zziga extends zzicm implements RandomAccess {
    private static final Object[] zza;
    private static final zziga zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zziga(objArr, 0, false);
    }

    zziga() {
        this(zza, 0, true);
    }

    public static zziga zzd() {
        return zzb;
    }

    private static int zzf(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void zzg(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
    }

    private final String zzi(int i10) {
        int i11 = this.zzd;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length());
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zzdW();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i10);
            System.arraycopy(this.zzc, i10, objArr2, i12, this.zzd - i10);
            this.zzc = objArr2;
        }
        this.zzc[i10] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i10 = this.zzd;
        if (i10 != list.size()) {
            return false;
        }
        if (!(obj instanceof zziga)) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (!this.zzc[i11].equals(list.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        zziga zzigaVar = (zziga) obj;
        for (int i12 = 0; i12 < i10; i12++) {
            if (!this.zzc[i12].equals(zzigaVar.zzc[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzg(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = this.zzd;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + this.zzc[i11].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        zzdW();
        zzg(i10);
        Object[] objArr = this.zzc;
        Object obj = objArr[i10];
        int i11 = this.zzd;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        zzdW();
        zzg(i10);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    final void zze(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.ads.zzieq, com.google.android.gms.internal.ads.zzieg
    public final /* bridge */ /* synthetic */ zzieq zzh(int i10) {
        if (i10 >= this.zzd) {
            return new zziga(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zziga(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.zzc = objArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzdW();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
