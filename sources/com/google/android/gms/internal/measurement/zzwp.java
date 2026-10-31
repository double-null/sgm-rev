package com.google.android.gms.internal.measurement;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwp {
    private final int[] zza;
    private final zzwn zzb;
    private zzwn zzc;
    private int zzd;
    private int zze;
    private int zzf;

    private zzwp(int[] iArr) {
        this.zza = iArr;
        zzwn zzwnVar = new zzwn(-1, -1, null);
        this.zzb = zzwnVar;
        this.zzc = zzwnVar;
    }

    static zzwp zza(int[] iArr) {
        zzwp zzwpVar = new zzwp(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            zzwpVar.zzf++;
            int[] iArr2 = zzwpVar.zza;
            int i11 = iArr2[i10];
            while (true) {
                zzwn zzwnVar = null;
                while (true) {
                    if (zzwpVar.zzf <= 0) {
                        break;
                    }
                    if (zzwpVar.zze == 0) {
                        break;
                    }
                    int i12 = ((zzwn) zzwpVar.zzc.zzd.get(Integer.valueOf(iArr2[zzwpVar.zzd]))).zza;
                    int i13 = zzwpVar.zze;
                    if (iArr2[i12 + i13] == i11) {
                        if (zzwnVar != null) {
                            zzwnVar.zzc = zzwpVar.zzc;
                        }
                        zzwpVar.zze = i13 + 1;
                        zzwpVar.zzb();
                        break;
                    }
                    zzwn zzwnVar2 = (zzwn) zzwpVar.zzc.zzd.get(Integer.valueOf(iArr2[zzwpVar.zzd]));
                    int i14 = zzwnVar2.zza;
                    zzwn zzwnVar3 = new zzwn(i14, (zzwpVar.zze + i14) - 1, null);
                    zzwpVar.zzc.zzd.put(Integer.valueOf(iArr2[zzwpVar.zzd]), zzwnVar3);
                    Map map = zzwnVar3.zzd;
                    int i15 = zzwnVar3.zzb + 1;
                    map.put(Integer.valueOf(iArr2[i15]), zzwnVar2);
                    zzwnVar2.zza = i15;
                    if (zzwnVar != null) {
                        zzwnVar.zzc = zzwnVar3;
                    }
                    map.put(Integer.valueOf(i11), new zzwn(i10, 1073741824, null));
                    zzwpVar.zzf--;
                    zzwpVar.zzc();
                    zzwnVar = zzwnVar3;
                }
                Map map2 = zzwpVar.zzc.zzd;
                Integer numValueOf = Integer.valueOf(i11);
                if (map2.containsKey(numValueOf)) {
                    if (zzwnVar != null) {
                        zzwnVar.zzc = zzwpVar.zzc;
                    }
                    zzwpVar.zzd = i10;
                    zzwpVar.zze++;
                    zzwpVar.zzb();
                    break;
                }
                zzwpVar.zzc.zzd.put(numValueOf, new zzwn(i10, 1073741824, null));
                if (zzwnVar != null) {
                    zzwnVar.zzc = zzwpVar.zzc;
                }
                zzwpVar.zzf--;
                zzwpVar.zzc();
            }
        }
        return zzwpVar;
    }

    private final void zze(zzwn zzwnVar, StringBuilder sb2) {
        for (zzwn zzwnVar2 : zzwnVar.zzd.values()) {
            sb2.append("  ");
            sb2.append(zzwnVar);
            sb2.append(" -> ");
            sb2.append(zzwnVar2);
            sb2.append(" [label=\"");
            int[] iArr = this.zza;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, zzwnVar2.zza, Math.min(iArr.length, zzwnVar2.zzb + 1))));
            sb2.append("\"]\n");
            zze(zzwnVar2, sb2);
        }
    }

    private final boolean zzf(int i10, int i11, int i12, int i13) {
        if (i10 >= 0 && i12 >= 0) {
            int[] iArr = this.zza;
            int length = iArr.length;
            int iMin = Math.min(length, i11);
            if (iMin - i10 == Math.min(length, i13) - i12) {
                for (int i14 = i10; i14 <= iMin; i14++) {
                    if (iArr[i14] != iArr[(i12 + i14) - i10]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("digraph {\n");
        zze(this.zzb, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    final void zzb() {
        if (this.zze == 0) {
            return;
        }
        Map map = this.zzc.zzd;
        int[] iArr = this.zza;
        zzwn zzwnVar = (zzwn) map.get(Integer.valueOf(iArr[this.zzd]));
        while (true) {
            int i10 = (zzwnVar.zzb - zzwnVar.zza) + 1;
            int i11 = this.zze;
            if (i10 > i11) {
                return;
            }
            int i12 = this.zzd + i10;
            this.zzd = i12;
            this.zzc = zzwnVar;
            int i13 = i11 - i10;
            this.zze = i13;
            if (i13 > 0) {
                zzwnVar = (zzwn) zzwnVar.zzd.get(Integer.valueOf(iArr[i12]));
            }
        }
    }

    final void zzc() {
        zzwn zzwnVar = this.zzc.zzc;
        if (zzwnVar != null) {
            this.zzc = zzwnVar;
        } else {
            this.zzc = this.zzb;
            int i10 = this.zze;
            if (i10 > 0) {
                this.zze = i10 - 1;
            }
            if (this.zzf > 0) {
                this.zzd++;
            }
        }
        zzb();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    public final zzwo zzd() {
        int i10;
        int i11;
        zzwm zzwmVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        zzwn zzwnVar = this.zzb;
        zzwm zzwmVar2 = new zzwm(zzwnVar, 0, -1, -1, null);
        arrayDeque.push(zzwmVar2);
        while (!arrayDeque.isEmpty()) {
            zzwm zzwmVar3 = (zzwm) arrayDeque.pop();
            for (zzwn zzwnVar2 : zzwmVar3.zzd.zzd.values()) {
                int i12 = zzwmVar3.zzb;
                int i13 = zzwmVar3.zzc;
                int i14 = zzwnVar2.zza;
                int i15 = zzwnVar2.zzb;
                if (zzf(i12, i13, i14, i15)) {
                    zzwmVar = new zzwm(zzwnVar2, zzwmVar3.zza + 1, i12, i13, null);
                } else {
                    if (zzwnVar2.zzd.isEmpty()) {
                        int i16 = zzwnVar2.zza;
                        if (zzf(i12, i13, i16, (i16 + i13) - i12)) {
                            zzwmVar = new zzwm(zzwnVar2, zzwmVar3.zza + 1, i12, i13, null);
                        }
                    }
                    zzwmVar = new zzwm(zzwnVar2, 1, zzwnVar2.zza, i15, null);
                }
                if (zzwmVar2.zza < zzwmVar.zza) {
                    zzwmVar2 = zzwmVar;
                }
                arrayDeque.push(zzwmVar);
            }
        }
        int[] iArr = this.zza;
        int iMin = Math.min(iArr.length, zzwmVar2.zzc + 1);
        int i17 = 0;
        loop2: while (true) {
            i10 = zzwmVar2.zzb;
            i11 = iMin - i10;
            zzwnVar = (zzwn) zzwnVar.zzd.get(Integer.valueOf(iArr[(i17 % i11) + i10]));
            if (zzwnVar == null) {
                break;
            }
            for (int i18 = zzwnVar.zza; i18 < zzwnVar.zzb + 1 && i18 < iArr.length; i18++) {
                if (iArr[(i17 % i11) + i10] != iArr[i18]) {
                    break loop2;
                }
                i17++;
            }
        }
        return new zzwo(i10, iMin, i17 / i11);
    }
}
