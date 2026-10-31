package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzatx {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzatx(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = list;
    }

    static zzatx zza(zzaty zzatyVar) throws IOException {
        if (zzaua.zzi(zzatyVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzaua.zzm(zzatyVar);
        String strZzm2 = zzaua.zzm(zzatyVar);
        long jZzk = zzaua.zzk(zzatyVar);
        long jZzk2 = zzaua.zzk(zzatyVar);
        long jZzk3 = zzaua.zzk(zzatyVar);
        long jZzk4 = zzaua.zzk(zzatyVar);
        int iZzi = zzaua.zzi(zzatyVar);
        if (iZzi < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzi).length() + 20);
            sb2.append("readHeaderList size=");
            sb2.append(iZzi);
            throw new IOException(sb2.toString());
        }
        List listEmptyList = iZzi == 0 ? Collections.emptyList() : new ArrayList();
        for (int i10 = 0; i10 < iZzi; i10++) {
            listEmptyList.add(new zzasw(zzaua.zzm(zzatyVar).intern(), zzaua.zzm(zzatyVar).intern()));
        }
        return new zzatx(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, listEmptyList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    zzatx(String str, zzasn zzasnVar) {
        String str2 = zzasnVar.zzb;
        long j10 = zzasnVar.zzc;
        long j11 = zzasnVar.zzd;
        long j12 = zzasnVar.zze;
        long j13 = zzasnVar.zzf;
        List arrayList = zzasnVar.zzh;
        if (arrayList == null) {
            Map map = zzasnVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzasw((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }
}
