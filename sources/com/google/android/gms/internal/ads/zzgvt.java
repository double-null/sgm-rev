package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgvt extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzgvt() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final Object[] zzm() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final Object[] zzn() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final void zzv(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objZza = zzgvu.zza(i11);
        if (i13 != 0) {
            zzgvu.zzc(objZza, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iZzb = zzgvu.zzb(obj, i15);
            while (iZzb != 0) {
                int i16 = iZzb - 1;
                int i17 = iArrZzl[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iZzb2 = zzgvu.zzb(objZza, i19);
                zzgvu.zzc(objZza, i19, iZzb);
                iArrZzl[i16] = ((~i14) & i18) | (iZzb2 & i14);
                iZzb = i17 & i10;
            }
        }
        this.zze = objZza;
        zzv(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(Object obj) {
        if (zzb()) {
            return -1;
        }
        int iZzb = zzgwf.zzb(obj);
        int iZzh = zzh();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzb2 = zzgvu.zzb(obj2, iZzb & iZzh);
        if (iZzb2 != 0) {
            int i10 = ~iZzh;
            int i11 = iZzb & i10;
            do {
                int i12 = iZzb2 - 1;
                int i13 = zzl()[i12];
                if ((i13 & i10) == i11 && Objects.equals(obj, zzm()[i12])) {
                    return i12;
                }
                iZzb2 = i13 & iZzh;
            } while (iZzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final Object zzj(Object obj) {
        if (!zzb()) {
            int iZzh = zzh();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZze = zzgvu.zze(obj, null, iZzh, obj2, zzl(), zzm(), null);
            if (iZze != -1) {
                Object obj3 = zzn()[iZze];
                zze(iZze, iZzh);
                this.zzg--;
                zzd();
                return obj3;
            }
        }
        return zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map mapZzc = zzc();
        if (mapZzc != null) {
            this.zzf = zzhah.zzc(size(), 3, 1073741823);
            mapZzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzm(), 0, this.zzg, (Object) null);
        Arrays.fill(zzn(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.containsKey(obj);
        }
        return zzi(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.zzg; i10++) {
            if (Objects.equals(obj, zzn()[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzgvo zzgvoVar = new zzgvo(this, null);
        this.zzi = zzgvoVar;
        return zzgvoVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.get(obj);
        }
        int iZzi = zzi(obj);
        if (iZzi == -1) {
            return null;
        }
        return zzn()[iZzi];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgvq zzgvqVar = new zzgvq(this, null);
        this.zzh = zzgvqVar;
        return zzgvqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (zzb()) {
            zzgtj.zzj(zzb(), "Arrays already allocated");
            int i10 = this.zzf;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzgvu.zza(iMax2);
            zzv(iMax2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.put(obj, obj2);
        }
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int iZzb = zzgwf.zzb(obj);
        int iZzh = zzh();
        int i13 = iZzb & iZzh;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzb2 = zzgvu.zzb(obj3, i13);
        if (iZzb2 != 0) {
            int i14 = ~iZzh;
            int i15 = iZzb & i14;
            int i16 = 0;
            while (true) {
                int i17 = iZzb2 - 1;
                int i18 = iArrZzl[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && Objects.equals(obj, objArrZzm[i17])) {
                    Object obj4 = objArrZzn[i17];
                    objArrZzn[i17] = obj2;
                    return obj4;
                }
                int i20 = i18 & iZzh;
                i16++;
                if (i20 == 0) {
                    if (i16 < 9) {
                        if (i12 <= iZzh) {
                            iArrZzl[i17] = (i12 & iZzh) | i19;
                            break;
                        }
                        iZzh = zzx(iZzh, zzgvu.zzd(iZzh), iZzb, i11);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzh() + 1, 1.0f);
                    int iZzf = zzf();
                    while (iZzf >= 0) {
                        linkedHashMap.put(zzm()[iZzf], zzn()[iZzf]);
                        iZzf = zzg(iZzf);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzd();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzb2 = i20;
            }
        } else if (i12 > iZzh) {
            iZzh = zzx(iZzh, zzgvu.zzd(iZzh), iZzb, i11);
        } else {
            Object obj5 = this.zze;
            Objects.requireNonNull(obj5);
            zzgvu.zzc(obj5, i13, i12);
        }
        int length = zzl().length;
        if (i12 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzl(), iMin);
            this.zzb = Arrays.copyOf(zzm(), iMin);
            this.zzc = Arrays.copyOf(zzn(), iMin);
        }
        zzl()[i11] = (~iZzh) & iZzb;
        zzm()[i11] = obj;
        zzn()[i11] = obj2;
        this.zzg = i12;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.remove(obj);
        }
        Object objZzj = zzj(obj);
        if (objZzj == zzd) {
            return null;
        }
        return objZzj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzc = zzc();
        return mapZzc != null ? mapZzc.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgvs zzgvsVar = new zzgvs(this, null);
        this.zzj = zzgvsVar;
        return zzgvsVar;
    }

    final void zza(int i10) {
        this.zzf = zzhah.zzc(i10, 1, 1073741823);
    }

    final boolean zzb() {
        return this.zze == null;
    }

    final Map zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzd() {
        this.zzf += 32;
    }

    final void zze(int i10, int i11) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int size = size() - 1;
        if (i10 >= size) {
            objArrZzm[i10] = null;
            objArrZzn[i10] = null;
            iArrZzl[i10] = 0;
            return;
        }
        int i12 = i10 + 1;
        Object obj2 = objArrZzm[size];
        objArrZzm[i10] = obj2;
        objArrZzn[i10] = objArrZzn[size];
        objArrZzm[size] = null;
        objArrZzn[size] = null;
        iArrZzl[i10] = iArrZzl[size];
        iArrZzl[size] = 0;
        int iZzb = zzgwf.zzb(obj2) & i11;
        int iZzb2 = zzgvu.zzb(obj, iZzb);
        int i13 = size + 1;
        if (iZzb2 == i13) {
            zzgvu.zzc(obj, iZzb, i12);
            return;
        }
        while (true) {
            int i14 = iZzb2 - 1;
            int i15 = iArrZzl[i14];
            int i16 = i15 & i11;
            if (i16 == i13) {
                iArrZzl[i14] = (i15 & (~i11)) | (i11 & i12);
                return;
            }
            iZzb2 = i16;
        }
    }

    final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    final int zzg(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.zzg) {
            return i11;
        }
        return -1;
    }

    final /* synthetic */ Object zzk() {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    final /* synthetic */ Object zzo(int i10) {
        return zzm()[i10];
    }

    final /* synthetic */ Object zzp(int i10) {
        return zzn()[i10];
    }

    final /* synthetic */ void zzq(int i10, Object obj) {
        zzn()[i10] = obj;
    }

    final /* synthetic */ int zzs() {
        return this.zzf;
    }

    final /* synthetic */ int zzt() {
        return this.zzg;
    }

    final /* synthetic */ void zzu(int i10) {
        this.zzg = i10;
    }

    zzgvt(int i10) {
        zza(8);
    }
}
