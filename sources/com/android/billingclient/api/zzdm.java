package com.android.billingclient.api;

import android.content.Context;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.google.android.gms.internal.play_billing.zzje;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjv;
import com.google.android.gms.internal.play_billing.zzjy;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkj;
import com.google.android.gms.internal.play_billing.zzkp;
import com.google.android.gms.internal.play_billing.zzkr;
import com.google.android.gms.internal.play_billing.zzky;
import com.google.android.gms.internal.play_billing.zzlb;
import com.google.android.gms.internal.play_billing.zzlf;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdm implements zzcz {
    private zzkb zzb;
    private final zzdo zzc;

    zzdm(Context context, zzkb zzkbVar) {
        this.zzc = new zzdo(context);
        this.zzb = zzkbVar;
    }

    private final void zzo(zzjg zzjgVar, zzkb zzkbVar) {
        if (zzjgVar == null) {
            return;
        }
        try {
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp(zzkbVar);
            zzkpVarZza.zza(zzjgVar);
            this.zzc.zza((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    private final void zzp(zzjk zzjkVar, zzkb zzkbVar) {
        if (zzjkVar == null) {
            return;
        }
        try {
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp(zzkbVar);
            zzkpVarZza.zzb(zzjkVar);
            this.zzc.zza((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zza(zzjg zzjgVar) {
        try {
            zzo(zzjgVar, this.zzb);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzb(zzjg zzjgVar, int i10) {
        try {
            zzjz zzjzVar = (zzjz) this.zzb.zzq();
            zzjzVar.zzc(i10);
            this.zzb = (zzkb) zzjzVar.zzi();
            zza(zzjgVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzc(zzjg zzjgVar, int i10, long j10) {
        try {
            zzjz zzjzVar = (zzjz) this.zzb.zzq();
            zzjzVar.zzc(i10);
            zzkb zzkbVar = (zzkb) zzjzVar.zzi();
            this.zzb = zzkbVar;
            if (j10 != 0) {
                zzjz zzjzVar2 = (zzjz) zzkbVar.zzq();
                zzjzVar2.zze(j10);
                zzkbVar = (zzkb) zzjzVar2.zzi();
            }
            zzo(zzjgVar, zzkbVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzd(zzjg zzjgVar, long j10, boolean z10) {
        zzkb zzkbVar;
        try {
            zzje zzjeVar = (zzje) zzjgVar.zzq();
            zzkj zzkjVar = (zzkj) zzjgVar.zze().zzq();
            zzkjVar.zza(z10);
            zzjeVar.zzd(zzkjVar);
            zzjg zzjgVar2 = (zzjg) zzjeVar.zzi();
            if (j10 == 0) {
                zzkbVar = this.zzb;
            } else {
                zzjz zzjzVar = (zzjz) this.zzb.zzq();
                zzjzVar.zze(j10);
                zzkbVar = (zzkb) zzjzVar.zzi();
            }
            zzo(zzjgVar2, zzkbVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zze(zzjg zzjgVar, int i10, long j10, boolean z10) {
        zzkb zzkbVar;
        try {
            zzjz zzjzVar = (zzjz) this.zzb.zzq();
            zzjzVar.zzc(i10);
            this.zzb = (zzkb) zzjzVar.zzi();
            zzje zzjeVar = (zzje) zzjgVar.zzq();
            zzkj zzkjVar = (zzkj) zzjgVar.zze().zzq();
            zzkjVar.zza(z10);
            zzjeVar.zzd(zzkjVar);
            zzjg zzjgVar2 = (zzjg) zzjeVar.zzi();
            if (j10 == 0) {
                zzkbVar = this.zzb;
            } else {
                zzjz zzjzVar2 = (zzjz) this.zzb.zzq();
                zzjzVar2.zze(j10);
                zzkbVar = (zzkb) zzjzVar2.zzi();
            }
            zzo(zzjgVar2, zzkbVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzf(zzjk zzjkVar) {
        try {
            zzp(zzjkVar, this.zzb);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzg(zzjk zzjkVar, int i10) {
        try {
            zzjz zzjzVar = (zzjz) this.zzb.zzq();
            zzjzVar.zzc(i10);
            this.zzb = (zzkb) zzjzVar.zzi();
            zzf(zzjkVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzh(zzjk zzjkVar, long j10, boolean z10) {
        zzkb zzkbVar;
        try {
            zzji zzjiVar = (zzji) zzjkVar.zzq();
            zzkj zzkjVar = (zzkj) zzjkVar.zzc().zzq();
            zzkjVar.zza(z10);
            zzjiVar.zzc(zzkjVar);
            zzjk zzjkVar2 = (zzjk) zzjiVar.zzi();
            if (j10 == 0) {
                zzkbVar = this.zzb;
            } else {
                zzjz zzjzVar = (zzjz) this.zzb.zzq();
                zzjzVar.zze(j10);
                zzkbVar = (zzkb) zzjzVar.zzi();
            }
            zzp(zzjkVar2, zzkbVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzi(zzjs zzjsVar) {
        try {
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp(this.zzb);
            zzkpVarZza.zzc(zzjsVar);
            this.zzc.zza((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzj(BillingResult billingResult, long j10) {
        zzkb zzkbVar;
        try {
            zzjv zzjvVarZza = zzjy.zza();
            zzjvVarZza.zze(4);
            zzjvVarZza.zza(zzju.IN_APP_BILLING_RESULT_UPDATE_ACTION);
            if (billingResult != null) {
                zzjl zzjlVarZza = zzjp.zza();
                zzjlVarZza.zzp(billingResult.getResponseCode());
                zzjlVarZza.zzb(billingResult.getDebugMessage());
                zzjvVarZza.zzb(zzjlVarZza);
            }
            zzkp zzkpVarZza = zzkr.zza();
            if (j10 == 0) {
                zzkbVar = this.zzb;
            } else {
                zzjz zzjzVar = (zzjz) this.zzb.zzq();
                zzjzVar.zze(j10);
                zzkbVar = (zzkb) zzjzVar.zzi();
            }
            zzkpVarZza.zzp(zzkbVar);
            zzkpVarZza.zzd(zzjvVarZza);
            this.zzc.zza((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzk(long j10) {
        zzkb zzkbVar;
        try {
            zzjv zzjvVarZza = zzjy.zza();
            zzjvVarZza.zze(4);
            zzjvVarZza.zza(zzju.PLAY_BILLING_ACTIVITY_CREATED_ACTION);
            zzjy zzjyVar = (zzjy) zzjvVarZza.zzi();
            zzkp zzkpVarZza = zzkr.zza();
            if (j10 == 0) {
                zzkbVar = this.zzb;
            } else {
                zzjz zzjzVar = (zzjz) this.zzb.zzq();
                zzjzVar.zze(j10);
                zzkbVar = (zzkb) zzjzVar.zzi();
            }
            zzkpVarZza.zzp(zzkbVar);
            zzkpVarZza.zze(zzjyVar);
            this.zzc.zza((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzm(zzlb zzlbVar) {
        try {
            zzdo zzdoVar = this.zzc;
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp(this.zzb);
            zzkpVarZza.zzq(zzlbVar);
            zzdoVar.zza((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzn(zzlf zzlfVar) {
        if (zzlfVar == null) {
            return;
        }
        try {
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp(this.zzb);
            zzkpVarZza.zzr(zzlfVar);
            this.zzc.zza((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzl(zzky zzkyVar) {
        try {
            zzkp zzkpVarZza = zzkr.zza();
            zzkpVarZza.zzp(this.zzb);
            zzjv zzjvVarZza = zzjy.zza();
            zzjvVarZza.zzc("ProxyBillingBroadcastReceiver");
            zzjvVarZza.zze(2);
            zzjvVarZza.zzd(zzkyVar);
            zzkpVarZza.zzd(zzjvVarZza);
            this.zzc.zza((zzkr) zzkpVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", OgqfiHA.IxUrVXcNXHBANL, th);
        }
    }
}
