package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcf extends zzbx implements Set {
    private transient zzca zza;

    zzcf() {
    }

    static int zzh(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzcf zzk() {
        return zzcp.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcf zzm(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzcp.zza;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzcr(obj);
        }
        int iZzh = zzh(i10);
        Object[] objArr2 = new Object[iZzh];
        int i11 = iZzh - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            zzci.zza(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iZza = zzbu.zza(iHashCode);
            while (true) {
                int i15 = iZza & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzcr(obj4);
        }
        if (zzh(i13) < iZzh / 2) {
            return zzm(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zzcp(objArr, i12, objArr2, i11, i13);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcf) && zzl() && ((zzcf) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzcq.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public zzca zzd() {
        zzca zzcaVar = this.zza;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        zzca zzcaVarZzi = zzi();
        this.zza = zzcaVarZzi;
        return zzcaVarZzi;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public abstract zzcs iterator();

    zzca zzi() {
        Object[] array = toArray();
        int i10 = zzca.zzd;
        return zzca.zzi(array, array.length);
    }

    boolean zzl() {
        return false;
    }
}
