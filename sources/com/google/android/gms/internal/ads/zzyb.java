package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzyb extends zzws {
    private static final zzak zza;
    private final zzxm[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzxz zzh;
    private final zzwv zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzyb(boolean z10, boolean z11, zzwv zzwvVar, zzxm... zzxmVarArr) {
        this.zzb = zzxmVarArr;
        this.zzi = zzwvVar;
        this.zze = new ArrayList(Arrays.asList(zzxmVarArr));
        this.zzc = new ArrayList(zzxmVarArr.length);
        int i10 = 0;
        while (true) {
            int length = zzxmVarArr.length;
            if (i10 >= length) {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgyb.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzA(zzak zzakVar) {
        this.zzb[0].zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzD(zzxi zzxiVar) {
        zzxy zzxyVar = (zzxy) zzxiVar;
        int i10 = 0;
        while (true) {
            zzxm[] zzxmVarArr = this.zzb;
            if (i10 >= zzxmVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i10);
            zzxi zzxiVarZza = zzxyVar.zza(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (((zzya) list.get(i11)).zzb().equals(zzxiVarZza)) {
                    list.remove(i11);
                    break;
                }
            }
            zzxmVarArr[i10].zzD(zzxyVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzxi zzG(zzxk zzxkVar, zzabl zzablVar, long j10) {
        zzbf[] zzbfVarArr = this.zzd;
        zzxm[] zzxmVarArr = this.zzb;
        int length = zzxmVarArr.length;
        zzxi[] zzxiVarArr = new zzxi[length];
        int iZze = zzbfVarArr[0].zze(zzxkVar.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zzxk zzxkVarZza = zzxkVar.zza(zzbfVarArr[i10].zzf(iZze));
            zzxiVarArr[i10] = zzxmVarArr[i10].zzG(zzxkVarZza, zzablVar, j10 - this.zzg[iZze][i10]);
            ((List) this.zzc.get(i10)).add(new zzya(zzxkVarZza, zzxiVarArr[i10], null));
        }
        return new zzxy(this.zzi, this.zzg[iZze], zzxiVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzak zzJ() {
        zzxm[] zzxmVarArr = this.zzb;
        return zzxmVarArr.length > 0 ? zzxmVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzwj
    protected final void zza(zzin zzinVar) {
        super.zza(zzinVar);
        int i10 = 0;
        while (true) {
            zzxm[] zzxmVarArr = this.zzb;
            if (i10 >= zzxmVarArr.length) {
                return;
            }
            zzv(Integer.valueOf(i10), zzxmVarArr[i10]);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzwj
    protected final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzxm
    public final void zzt() throws IOException {
        zzxz zzxzVar = this.zzh;
        if (zzxzVar != null) {
            throw zzxzVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzws
    protected final /* bridge */ /* synthetic */ void zzu(Object obj, zzxm zzxmVar, zzbf zzbfVar) {
        int iZzc;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzc = zzbfVar.zzc();
            this.zzf = iZzc;
        } else {
            int iZzc2 = zzbfVar.zzc();
            int i10 = this.zzf;
            if (iZzc2 != i10) {
                this.zzh = new zzxz(0);
                return;
            }
            iZzc = i10;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzc, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzxmVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzws
    protected final /* bridge */ /* synthetic */ zzxk zzx(Object obj, zzxk zzxkVar) {
        int iIntValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(iIntValue);
        for (int i10 = 0; i10 < list2.size(); i10++) {
            if (((zzya) list2.get(i10)).zza().equals(zzxkVar)) {
                return ((zzya) ((List) list.get(0)).get(i10)).zza();
            }
        }
        return null;
    }
}
