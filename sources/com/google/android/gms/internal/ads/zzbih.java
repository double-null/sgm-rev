package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbih {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    /* synthetic */ zzbih(int i10, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzba.zzb().zza(this);
    }

    public static zzbih zzh(int i10, String str, int i11, int i12) {
        return new zzbid(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzbih zzi(int i10, String str, long j10, long j11) {
        return new zzbie(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static zzbih zzj(int i10, String str, float f10, float f11) {
        return new zzbif(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbih zzk(int i10, String str) {
        zzbig zzbigVar = new zzbig(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzb(zzbigVar);
        return zzbigVar;
    }

    public static zzbih zzl(int i10, String str) {
        zzbig zzbigVar = new zzbig(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzc(zzbigVar);
        return zzbigVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    protected abstract Object zzc(JSONObject jSONObject);

    protected abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
