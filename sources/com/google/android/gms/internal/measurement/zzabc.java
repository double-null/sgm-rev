package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzabc extends AbstractMap {
    private static final Comparator zza = new zzaaz();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd = new zzabb(this, -1);
    private Integer zze = null;
    private String zzf = null;

    zzabc(zzabc zzabcVar, zzabc zzabcVar2) {
        Object objZza;
        Object[] objArr;
        int size = zzabcVar.size() + zzabcVar2.size();
        int i10 = zzabcVar.zzc[zzabcVar.size()] + zzabcVar2.zzc[zzabcVar2.size()];
        int i11 = size + 1;
        Object[] objArr2 = new Object[i10];
        int[] iArr = new int[i11];
        int i12 = 0;
        iArr[0] = size;
        int i13 = size;
        Map.Entry entryZzg = zzabcVar.zzg(0);
        Map.Entry entryZzg2 = zzabcVar2.zzg(0);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (entryZzg == null && entryZzg2 == null) {
                break;
            }
            i14++;
            if (entryZzg != null) {
                if (entryZzg2 != null) {
                    int iCompareTo = ((String) entryZzg.getKey()).compareTo((String) entryZzg2.getKey());
                    if (iCompareTo == 0) {
                        int i17 = i15 + 1;
                        int i18 = i16 + 1;
                        objArr2[i14] = zzf((String) entryZzg.getKey(), i14);
                        zzabb zzabbVar = (zzabb) entryZzg.getValue();
                        zzabb zzabbVar2 = (zzabb) entryZzg2.getValue();
                        int i19 = i12;
                        int i20 = i19;
                        while (true) {
                            if (i20 >= zzabbVar.zzc() - zzabbVar.zzb() && i19 >= zzabbVar2.zzc() - zzabbVar2.zzb()) {
                                break;
                            }
                            int iCompare = i20 == zzabbVar.zzc() - zzabbVar.zzb() ? 1 : i19 == zzabbVar2.zzc() - zzabbVar2.zzb() ? -1 : i12;
                            if (iCompare == 0) {
                                int i21 = zzabe.zza;
                                iCompare = zzabe.zzb.compare(zzabbVar.zza(i20), zzabbVar2.zza(i19));
                            }
                            if (iCompare < 0) {
                                objZza = zzabbVar.zza(i20);
                                i20++;
                            } else {
                                int i22 = i19 + 1;
                                Object objZza2 = zzabbVar2.zza(i19);
                                i20 = iCompare == 0 ? i20 + 1 : i20;
                                objZza = objZza2;
                                i19 = i22;
                            }
                            objArr2[i13] = objZza;
                            i13++;
                            i17 = i17;
                            i12 = 0;
                        }
                        iArr[i14] = i13;
                        entryZzg = zzabcVar.zzg(i18);
                        entryZzg2 = zzabcVar2.zzg(i17);
                        i15 = i17;
                        i16 = i18;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i12 = 0;
                    }
                }
                int i23 = i16 + 1;
                int iZzd = zzd(entryZzg, i14, i13, objArr2, iArr);
                entryZzg = zzabcVar.zzg(i23);
                i13 = iZzd;
                i16 = i23;
                i12 = 0;
            }
            int i24 = i15 + 1;
            int iZzd2 = zzd(entryZzg2, i14, i13, objArr2, iArr);
            entryZzg2 = zzabcVar2.zzg(i24);
            i13 = iZzd2;
            i15 = i24;
            i12 = 0;
        }
        int i25 = iArr[i12];
        int i26 = i25 - i14;
        if (i26 != 0) {
            for (int i27 = i12; i27 <= i14; i27++) {
                iArr[i27] = iArr[i27] - i26;
            }
            int i28 = iArr[i14];
            int i29 = i28 - i14;
            if (zze(i10, i28)) {
                objArr = new Object[i28];
                System.arraycopy(objArr2, i12, objArr, i12, i14);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i25, objArr, i14, i29);
            objArr2 = objArr;
        }
        this.zzb = objArr2;
        int i30 = iArr[i12] + 1;
        this.zzc = zze(i11, i30) ? Arrays.copyOf(iArr, i30) : iArr;
    }

    private final int zzd(Map.Entry entry, int i10, int i11, Object[] objArr, int[] iArr) {
        zzabb zzabbVar = (zzabb) entry.getValue();
        int iZzc = zzabbVar.zzc() - zzabbVar.zzb();
        System.arraycopy(zzabbVar.zzb.zzb, zzabbVar.zzb(), objArr, i11, iZzc);
        objArr[i10] = zzf((String) entry.getKey(), i10);
        int i12 = i11 + iZzc;
        iArr[i10 + 1] = i12;
        return i12;
    }

    private static boolean zze(int i10, int i11) {
        return i10 > 16 && i10 * 9 > i11 * 10;
    }

    private final Map.Entry zzf(String str, int i10) {
        return new AbstractMap.SimpleImmutableEntry(str, new zzabb(this, i10));
    }

    private final Map.Entry zzg(int i10) {
        if (i10 < this.zzc[0]) {
            return (Map.Entry) this.zzb[i10];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }

    final /* synthetic */ Object[] zzb() {
        return this.zzb;
    }

    final /* synthetic */ int[] zzc() {
        return this.zzc;
    }

    zzabc(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            int[] iArr = new int[1];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                iArr[0] = 0;
                this.zzb = zze(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.zzc = iArr;
                return;
            }
            throw null;
        }
        throw null;
    }
}
