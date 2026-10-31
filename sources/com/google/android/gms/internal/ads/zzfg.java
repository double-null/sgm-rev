package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfg implements zzdz {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfg(Handler handler) {
        this.zzb = handler;
    }

    static /* synthetic */ void zzo(zzff zzffVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzffVar);
            }
        }
    }

    private static zzff zzp() {
        zzff zzffVar;
        List list = zza;
        synchronized (list) {
            zzffVar = list.isEmpty() ? new zzff(null) : (zzff) list.remove(list.size() - 1);
        }
        return zzffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzb(int i10) {
        return this.zzb.hasMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdy zzc(int i10) {
        Handler handler = this.zzb;
        zzff zzffVarZzp = zzp();
        zzffVarZzp.zzb(handler.obtainMessage(i10), this);
        return zzffVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdy zzd(int i10, Object obj) {
        Handler handler = this.zzb;
        zzff zzffVarZzp = zzp();
        zzffVarZzp.zzb(handler.obtainMessage(i10, obj), this);
        return zzffVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdy zze(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzff zzffVarZzp = zzp();
        zzffVarZzp.zzb(handler.obtainMessage(i10, i11, i12), this);
        return zzffVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdy zzf(int i10, int i11, int i12, Object obj) {
        Handler handler = this.zzb;
        zzff zzffVarZzp = zzp();
        zzffVarZzp.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzffVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzg(zzdy zzdyVar) {
        return ((zzff) zzdyVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzh(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzi(int i10, int i11) {
        return this.zzb.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzk(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzl(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzm(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzn(Runnable runnable, long j10) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
