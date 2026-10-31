package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcma extends com.google.android.gms.ads.internal.client.zzdz {
    private final zzchn zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzed zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbnj zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcma(zzchn zzchnVar, float f10, boolean z10, boolean z11) {
        this.zza = zzchnVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzcfr.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzt(map2);
            }
        });
    }

    private final void zzx(final int i10, final int i11, final boolean z10, final boolean z11) {
        zzcfr.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcly
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(i10, i11, z10, z11);
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        Object obj = this.zzb;
        boolean z10 = zzfwVar.zzb;
        boolean z11 = zzfwVar.zzc;
        synchronized (obj) {
            this.zzl = z10;
            this.zzm = z11;
        }
        boolean z12 = zzfwVar.zza;
        zzw("initialState", CollectionUtils.mapOf("muteStart", true != z12 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "customControlsRequested", true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "clickToExpandRequested", true != z11 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES));
    }

    public final void zzd(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() {
        zzw("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() {
        zzw("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z10) {
        zzw(true != z10 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        synchronized (this.zzb) {
            this.zzf = zzedVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final com.google.android.gms.ads.internal.client.zzed zzo() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        synchronized (this.zzb) {
            zzedVar = this.zzf;
        }
        return zzedVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() {
        boolean z10;
        Object obj = this.zzb;
        boolean zZzn = zzn();
        synchronized (obj) {
            z10 = false;
            if (!zZzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzx(i10, 3, z10, z10);
    }

    public final void zzs(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            z11 = true;
            if (f11 == this.zzi && f12 == this.zzk) {
                z11 = false;
            }
            this.zzi = f11;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzom)).booleanValue()) {
                this.zzj = f10;
            }
            z12 = this.zzh;
            this.zzh = z10;
            i11 = this.zze;
            this.zze = i10;
            float f13 = this.zzk;
            this.zzk = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.zza.zzE().invalidate();
            }
        }
        if (z11) {
            try {
                zzbnj zzbnjVar = this.zzn;
                if (zzbnjVar != null) {
                    zzbnjVar.zze();
                }
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzx(i11, i10, z12, z10);
    }

    final /* synthetic */ void zzt(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0055 A[Catch: RemoteException -> 0x003f, all -> 0x0072, TryCatch #1 {RemoteException -> 0x003f, blocks: (B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067), top: B:62:0x0037, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0059 A[Catch: RemoteException -> 0x003f, all -> 0x0072, TryCatch #1 {RemoteException -> 0x003f, blocks: (B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067), top: B:62:0x0037, outer: #0 }] */
    final /* synthetic */ void zzu(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        com.google.android.gms.ads.internal.client.zzed zzedVar2;
        com.google.android.gms.ads.internal.client.zzed zzedVar3;
        com.google.android.gms.ads.internal.client.zzed zzedVar4;
        synchronized (this.zzb) {
            boolean z14 = this.zzg;
            if (z14 || i11 != 1) {
                i12 = i11;
                z12 = false;
            } else {
                i11 = 1;
                i12 = 1;
                z12 = true;
            }
            boolean z15 = i10 != i11;
            if (z15 && i12 == 1) {
                z13 = true;
                i12 = 1;
            } else {
                z13 = false;
            }
            boolean z16 = z15 && i12 == 2;
            boolean z17 = z15 && i12 == 3;
            this.zzg = z14 || z12;
            if (z12) {
                try {
                    com.google.android.gms.ads.internal.client.zzed zzedVar5 = this.zzf;
                    if (zzedVar5 != null) {
                        zzedVar5.zze();
                    }
                    if (z13 && (zzedVar4 = this.zzf) != null) {
                        zzedVar4.zzf();
                    }
                    if (z16 && (zzedVar3 = this.zzf) != null) {
                        zzedVar3.zzg();
                    }
                    if (z17) {
                        zzedVar2 = this.zzf;
                        if (zzedVar2 != null) {
                            zzedVar2.zzh();
                        }
                        this.zza.zzz();
                    }
                    if (z10 != z11 && (zzedVar = this.zzf) != null) {
                        zzedVar.zzi(z11);
                    }
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                }
            } else {
                if (z13) {
                    zzedVar4.zzf();
                }
                if (z16) {
                    zzedVar3.zzg();
                }
                if (z17) {
                    zzedVar2 = this.zzf;
                    if (zzedVar2 != null) {
                        zzedVar2.zzh();
                    }
                    this.zza.zzz();
                }
                if (z10 != z11) {
                    zzedVar.zzi(z11);
                }
            }
            throw th;
        }
    }

    public final void zzv(zzbnj zzbnjVar) {
        synchronized (this.zzb) {
            this.zzn = zzbnjVar;
        }
    }
}
