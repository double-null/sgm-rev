package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbum implements zzbty {
    private final zzbua zza;
    private final zzbub zzb;
    private final zzbtu zzc;
    private final String zzd;

    zzbum(zzbtu zzbtuVar, String str, zzbub zzbubVar, zzbua zzbuaVar) {
        this.zzc = zzbtuVar;
        this.zzd = str;
        this.zzb = zzbubVar;
        this.zza = zzbuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbty
    public final ListenableFuture zzb(Object obj) {
        zzcfw zzcfwVar = new zzcfw();
        zzbto zzbtoVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbtoVarZzb.zze(new zzbuj(this, zzbtoVarZzb, obj, zzcfwVar), new zzbuk(this, zzcfwVar, zzbtoVarZzb));
        return zzcfwVar;
    }

    final /* synthetic */ zzbua zzd() {
        return this.zza;
    }

    final /* synthetic */ void zzc(zzbto zzbtoVar, zzbtv zzbtvVar, Object obj, zzcfw zzcfwVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String string = UUID.randomUUID().toString();
            zzbpp.zzo.zzb(string, new zzbul(this, zzbtoVar, zzcfwVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbtvVar.zzb(this.zzd, jSONObject);
        } catch (Exception e10) {
            try {
                zzcfwVar.zzd(e10);
                String str = XDucgbzInpQa.vfUfRbZTvsM;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg(str, e10);
            } finally {
                zzbtoVar.zza();
            }
        }
    }
}
