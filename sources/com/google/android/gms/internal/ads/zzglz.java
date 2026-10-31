package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzglz {
    private final zzaux zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzglz(zzaux zzauxVar, long j10, long j11, String str) {
        this.zza = zzauxVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = str;
    }

    static /* synthetic */ zzglz zza(zzaux zzauxVar, byte[] bArr, boolean z10) throws zzauv, zzauz {
        zzauxVar.zza();
        zzauxVar.zzb(bArr);
        List list = (List) zzauxVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzauxVar.zzd(jLongValue, Optional.empty());
        String strZza = zzgea.zza(zzava.zza(), false);
        int length = strZza.length();
        String str = true != z10 ? "" : "-s";
        StringBuilder sb2 = new StringBuilder(length + 12 + str.length());
        sb2.append("3.878096153.");
        sb2.append(strZza);
        sb2.append(str);
        return new zzglz(zzauxVar, jLongValue2, jLongValue3, sb2.toString());
    }

    final /* synthetic */ String zzb(Map map) {
        return zzgea.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    final /* synthetic */ void zzc(Map map) throws zzauv, zzauz {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    final /* synthetic */ String zzd() {
        return this.zzd;
    }
}
