package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzckj extends zzcgt {
    private final zzcho zzc;
    private zzckk zzd;
    private Uri zze;
    private zzcgs zzf;
    private boolean zzg;
    private int zzh;

    public zzckj(Context context, zzcho zzchoVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzchoVar;
        zzchoVar.zza(this);
    }

    private final boolean zzu() {
        int i10 = this.zzh;
        return (i10 == 1 || i10 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i10) {
        if (i10 == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i10;
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzckj.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb2.append(name);
        sb2.append("@");
        sb2.append(hexString);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzb(zzcgs zzcgsVar) {
        this.zzf = zzcgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzc(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzckk(uri.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcki
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzckk zzckkVar = this.zzd;
        if (zzckkVar != null) {
            zzckkVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzi(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("AdImmersivePlayerView seek ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgt, com.google.android.gms.internal.ads.zzchq
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    final /* synthetic */ void zzr() {
        zzcgs zzcgsVar = this.zzf;
        if (zzcgsVar != null) {
            zzcgsVar.zzb();
        }
    }

    final /* synthetic */ void zzs() {
        zzcgs zzcgsVar = this.zzf;
        if (zzcgsVar != null) {
            if (!this.zzg) {
                zzcgsVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    final /* synthetic */ void zzt() {
        zzcgs zzcgsVar = this.zzf;
        if (zzcgsVar != null) {
            zzcgsVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final void zzj(float f10, float f11) {
    }
}
