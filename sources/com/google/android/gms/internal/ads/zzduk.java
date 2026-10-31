package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzduk implements zzbpq {
    private final zzbnf zza;
    private final zzdux zzb;
    private final zzimo zzc;

    public zzduk(zzdqd zzdqdVar, zzdpt zzdptVar, zzdux zzduxVar, zzimo zzimoVar) {
        this.zza = zzdqdVar.zzg(zzdptVar.zzS());
        this.zzb = zzduxVar;
        this.zzc = zzimoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbmv) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
            sb2.append("Failed to call onCustomClick for asset ");
            sb2.append(str);
            sb2.append(".");
            String string = sb2.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(string, e10);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
