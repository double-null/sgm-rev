package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcja implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcja(zzchn zzchnVar) {
        Context context = zzchnVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzchnVar.zzs().afmaVersion);
        this.zzc = new WeakReference(zzchnVar);
    }

    public abstract boolean zze(String str);

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzcis zzcisVar) {
        return zze(str);
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzciv(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzciw(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    protected final void zzo(String str, String str2, int i10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcix(this, str, str2, i10));
    }

    public final void zzp(String str, String str2, long j10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzciy(this, str, str2, j10));
    }

    public final void zzq(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzciz(this, str, str2, str3, str4));
    }

    final /* synthetic */ void zzw(String str, Map map) {
        zzchn zzchnVar = (zzchn) this.zzc.get();
        if (zzchnVar != null) {
            zzchnVar.zze("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    protected void zzh(int i10) {
    }

    protected void zzi(int i10) {
    }

    protected void zzj(int i10) {
    }

    protected void zzk(int i10) {
    }
}
