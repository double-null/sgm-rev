package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzach {
    private static final Comparator zza = zzacg.zza;
    private static final Comparator zzb = zzacf.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzace[] zzd = new zzace[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzach(int i10) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i10, float f10) {
        zzace zzaceVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzace[] zzaceVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzaceVar = zzaceVarArr[i12];
        } else {
            zzaceVar = new zzace(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzaceVar.zza = i13;
        zzaceVar.zzb = i10;
        zzaceVar.zzc = f10;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzaceVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            zzace zzaceVar2 = (zzace) arrayList.get(0);
            int i16 = zzaceVar2.zzb;
            if (i16 <= i15) {
                this.zzg -= i16;
                arrayList.remove(0);
                int i17 = this.zzh;
                if (i17 < 5) {
                    zzace[] zzaceVarArr2 = this.zzd;
                    this.zzh = i17 + 1;
                    zzaceVarArr2[i17] = zzaceVar2;
                }
            } else {
                zzaceVar2.zzb = i16 - i15;
                this.zzg -= i15;
            }
        }
    }

    public final float zzc(float f10) {
        int i10 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i10 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzace) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f12 = 0.5f * f11;
            zzace zzaceVar = (zzace) arrayList.get(i10);
            i11 += zzaceVar.zzb;
            if (i11 >= f12) {
                return zzaceVar.zzc;
            }
            i10++;
        }
    }
}
