package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhu extends zzes implements RandomAccess {
    private static final Object[] zza;
    private static final zzhu zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzhu(objArr, 0, false);
    }

    zzhu() {
        this(zza, 0, true);
    }

    public static zzhu zze() {
        return zzb;
    }

    private static int zzg(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i10) {
        return "Index:" + i10 + ", Size:" + this.zzd;
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzes, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i10);
            System.arraycopy(this.zzc, i10, objArr2, i12, this.zzd - i10);
            this.zzc = objArr2;
        }
        this.zzc[i10] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzes, java.util.AbstractList, java.util.Collection, java.util.List
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
        if (!(obj instanceof zzhu)) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (!this.zzc[i11].equals(list.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        zzhu zzhuVar = (zzhu) obj;
        for (int i12 = 0; i12 < i10; i12++) {
            if (!this.zzc[i12].equals(zzhuVar.zzc[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzi(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzes, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = this.zzd;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + this.zzc[i11].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzes, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        zza();
        zzi(i10);
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

    @Override // com.google.android.gms.internal.play_billing.zzes, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        zza();
        zzi(i10);
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

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final /* bridge */ /* synthetic */ zzgl zzd(int i10) {
        if (i10 >= this.zzd) {
            return new zzhu(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzf(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = zzg(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzhu(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.zzc = objArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzes, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
