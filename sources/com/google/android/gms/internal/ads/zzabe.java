package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzabe extends zzabh {
    protected abstract Pair zzh(zzabd zzabdVar, int[][][] iArr, int[] iArr2, zzxk zzxkVar, zzbf zzbfVar) throws zzjk;

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzq(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final zzabi zzr(zznc[] zzncVarArr, zzzn zzznVar, zzxk zzxkVar, zzbf zzbfVar) throws zzjk {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzznVar.zzb;
            zzbgVarArr[i10] = new zzbg[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzncVarArr[i13].zzu();
        }
        int i14 = 0;
        while (i14 < zzznVar.zzb) {
            zzbg zzbgVarZza = zzznVar.zza(i14);
            int i15 = zzbgVarZza.zzc;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z10 = true;
            while (i17 < i12) {
                zznc zzncVar = zzncVarArr[i17];
                int iMax = 0;
                for (int i19 = 0; i19 < zzbgVarZza.zza; i19++) {
                    iMax = Math.max(iMax, zzncVar.zzad(zzbgVarZza.zza(i19)) & 7);
                }
                boolean z11 = iArr2[i17] == 0;
                if (iMax > i18) {
                    z10 = z11;
                    i16 = i17;
                    i18 = iMax;
                } else if (iMax == i18 && i15 == 5 && !z10 && z11) {
                    i16 = i17;
                    i18 = iMax;
                    z10 = true;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[zzbgVarZza.zza];
            } else {
                zznc zzncVar2 = zzncVarArr[i16];
                int i20 = zzbgVarZza.zza;
                int[] iArr5 = new int[i20];
                for (int i21 = 0; i21 < i20; i21++) {
                    iArr5[i21] = zzncVar2.zzad(zzbgVarZza.zza(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i16];
            zzbgVarArr[i16][i22] = zzbgVarZza;
            iArr3[i16][i22] = iArr;
            iArr2[i16] = i22 + 1;
            i14++;
            i12 = 2;
        }
        int i23 = i12;
        boolean z12 = true;
        zzzn[] zzznVarArr = new zzzn[i23];
        String[] strArr = new String[i23];
        int[] iArr6 = new int[i23];
        int i24 = 0;
        while (i24 < i23) {
            int i25 = iArr2[i24];
            zzznVarArr[i24] = new zzzn((zzbg[]) zzfl.zzb(zzbgVarArr[i24], i25));
            iArr3[i24] = (int[][]) zzfl.zzb(iArr3[i24], i25);
            strArr[i24] = zzncVarArr[i24].zzU();
            iArr6[i24] = zzncVarArr[i24].zza();
            i24++;
            i23 = 2;
        }
        int i26 = i23;
        zzabd zzabdVar = new zzabd(strArr, iArr6, zzznVarArr, iArr4, iArr3, new zzzn((zzbg[]) zzfl.zzb(zzbgVarArr[i26], iArr2[i26])));
        Pair pairZzh = zzh(zzabdVar, iArr3, iArr4, zzxkVar, zzbfVar);
        zzabf[] zzabfVarArr = (zzabf[]) pairZzh.second;
        int length = zzabfVarArr.length;
        List[] listArr = new List[length];
        for (int i27 = 0; i27 < zzabfVarArr.length; i27++) {
            zzabf zzabfVar = zzabfVarArr[i27];
            listArr[i27] = zzabfVar != null ? zzgwm.zzj(zzabfVar) : zzgwm.zzi();
        }
        zzgwj zzgwjVar = new zzgwj();
        int i28 = 0;
        while (i28 < 2) {
            zzzn zzznVarZzb = zzabdVar.zzb(i28);
            int i29 = 0;
            while (i29 < zzznVarZzb.zzb) {
                zzbg zzbgVarZza2 = zzznVarZzb.zza(i29);
                boolean z13 = zzabdVar.zzd(i28, i29, false) != 0 ? z12 : false;
                int i30 = zzbgVarZza2.zza;
                int[] iArr7 = new int[i30];
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 < i30; i31++) {
                    iArr7[i31] = zzabdVar.zzc(i28, i29, i31) & 7;
                    int i32 = 0;
                    boolean z14 = false;
                    while (i32 < length) {
                        List list = listArr[i32];
                        int i33 = length;
                        List[] listArr2 = listArr;
                        int i34 = 0;
                        while (i34 < list.size()) {
                            zzabf zzabfVar2 = (zzabf) list.get(i34);
                            List list2 = list;
                            if (zzabfVar2.zza().equals(zzbgVarZza2) && zzabfVar2.zzg(i31) != -1) {
                                z14 = true;
                                break;
                            }
                            i34++;
                            list = list2;
                        }
                        i32++;
                        length = i33;
                        listArr = listArr2;
                    }
                    zArr[i31] = z14;
                }
                zzgwjVar.zzf(new zzbm(zzbgVarZza2, z13, iArr7, zArr));
                i29++;
                z12 = true;
            }
            i28++;
            z12 = true;
        }
        zzzn zzznVarZze = zzabdVar.zze();
        for (int i35 = 0; i35 < zzznVarZze.zzb; i35++) {
            zzbg zzbgVarZza3 = zzznVarZze.zza(i35);
            int i36 = zzbgVarZza3.zza;
            int[] iArr8 = new int[i36];
            Arrays.fill(iArr8, 0);
            zzgwjVar.zzf(new zzbm(zzbgVarZza3, false, iArr8, new boolean[i36]));
        }
        return new zzabi((zznd[]) pairZzh.first, (zzaba[]) pairZzh.second, new zzbn(zzgwjVar.zzi()), zzabdVar);
    }
}
