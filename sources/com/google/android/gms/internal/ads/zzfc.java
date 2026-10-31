package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfc {
    private final zzbb zza;
    private final zzaz zzb;
    private final zzew zzc;
    private final zzbd zzd = new zzbd();
    private final zzdz zze;
    private final zzex zzf;
    private final zzez zzg;
    private final zzfa zzh;
    private final zzfb zzi;

    public zzfc(zzbb zzbbVar, zzew zzewVar, zzdo zzdoVar, int i10, int i11, int i12, int i13) {
        this.zza = zzbbVar;
        this.zzc = zzewVar;
        this.zze = zzdoVar.zzd(zzbbVar.zzd(), new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzey
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                return this.zza.zzb(message);
            }
        });
        this.zzf = new zzex(this, i10);
        this.zzg = new zzez(this, i11);
        this.zzh = new zzfa(this, i12);
        this.zzi = new zzfb(this, i13);
        zzev zzevVar = new zzev(this);
        this.zzb = zzevVar;
        zzbbVar.zze(zzevVar);
    }

    public final void zza() {
        this.zze.zzl(null);
        this.zza.zzf(this.zzb);
    }

    final /* synthetic */ boolean zzb(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            this.zzf.zza();
            return true;
        }
        if (i10 == 2) {
            this.zzg.zza();
            return true;
        }
        if (i10 == 3) {
            this.zzh.zza();
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        this.zzi.zza();
        return true;
    }

    final /* synthetic */ void zzc() {
        this.zzf.zza();
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
    }

    final /* synthetic */ zzbb zzd() {
        return this.zza;
    }

    final /* synthetic */ zzew zze() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzdz zzg() {
        return this.zze;
    }
}
