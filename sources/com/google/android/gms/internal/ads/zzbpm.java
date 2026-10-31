package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzbpm implements zzbpq {
    static final /* synthetic */ zzbpm zza = new zzbpm();

    private /* synthetic */ zzbpm() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmn zzcmnVar = (zzcmn) obj;
        zzbpq zzbpqVar = zzbpp.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i10 = Integer.parseInt(str);
            int i11 = Integer.parseInt(str2);
            int i12 = Integer.parseInt(str3);
            zzbap zzbapVarZzS = zzcmnVar.zzS();
            if (zzbapVarZzS != null) {
                zzbapVarZzS.zzb().zze(i10, i11, i12);
            }
        } catch (NumberFormatException unused) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
