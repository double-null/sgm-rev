package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.AppEventsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbah implements zzbak {
    private static zzbah zzb;
    private final Context zzc;
    private final zzfyq zzd;
    private final zzfyx zze;
    private final zzfyz zzf;
    private final zzbbm zzg;
    private final zzfxg zzh;
    private final Executor zzi;
    private final zzbds zzj;
    private final zzfyw zzk;
    private final zzbcb zzm;
    private final zzbbt zzn;
    private final zzbbk zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzbah(Context context, zzfxg zzfxgVar, zzfyq zzfyqVar, zzfyx zzfyxVar, zzfyz zzfyzVar, zzbbm zzbbmVar, Executor executor, zzfxb zzfxbVar, zzbds zzbdsVar, zzbcb zzbcbVar, zzbbt zzbbtVar, zzbbk zzbbkVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfxgVar;
        this.zzd = zzfyqVar;
        this.zze = zzfyxVar;
        this.zzf = zzfyzVar;
        this.zzg = zzbbmVar;
        this.zzi = executor;
        this.zzj = zzbdsVar;
        this.zzm = zzbcbVar;
        this.zzn = zzbbtVar;
        this.zzo = zzbbkVar;
        this.zzr = false;
        this.zzk = new zzbaf(this, zzfxbVar);
    }

    public static synchronized zzbah zza(Context context, zzawo zzawoVar, boolean z10) {
        zzfxh zzfxhVarZzh;
        zzfxhVarZzh = zzfxi.zzh();
        zzfxhVarZzh.zza(zzawoVar.zza());
        zzfxhVarZzh.zzb(zzawoVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfxhVarZzh.zzh(), z10);
    }

    private static synchronized zzbah zzs(Context context, Executor executor, zzfxi zzfxiVar, boolean z10) {
        if (zzb == null) {
            zzfxg zzfxgVarZza = zzfxg.zza(context, executor, z10);
            zzbav zzbavVarZza = zzbav.zza(context);
            zzbcb zzbcbVarZza = zzbcb.zza(context, executor);
            zzbbt zzbbtVar = new zzbbt();
            zzbbk zzbbkVar = new zzbbk();
            zzfxw zzfxwVarZza = zzfxw.zza(context, executor, zzfxgVarZza, zzfxiVar);
            zzbbl zzbblVar = new zzbbl(context);
            zzbbm zzbbmVar = new zzbbm(zzfxiVar, zzfxwVarZza, new zzbbz(context, zzbblVar), zzbblVar, zzbavVarZza, zzbcbVarZza, zzbbtVar, zzbbkVar);
            zzbds zzbdsVarZzb = zzfyd.zzb(context, zzfxgVarZza);
            zzfxb zzfxbVar = new zzfxb();
            zzbah zzbahVar = new zzbah(context, zzfxgVarZza, new zzfyq(context, zzbdsVarZzb), new zzfyx(context, zzbdsVarZzb, new zzbae(zzfxgVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdl)).booleanValue()), new zzfyz(context, zzbbmVar, zzfxgVarZza, zzfxbVar, false), zzbbmVar, executor, zzfxbVar, zzbdsVarZzb, zzbcbVarZza, zzbbtVar, zzbbkVar);
            zzb = zzbahVar;
            zzbahVar.zzc();
            zzb.zzm();
        }
        return zzb;
    }

    private final zzfyp zzt(int i10) {
        if (zzfyd.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdj)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfyp zzfypVarZzt = zzt(1);
        if (zzfypVarZzt == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfypVarZzt)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzd(MotionEvent motionEvent) {
        zzfxj zzfxjVarZzb = this.zzf.zzb();
        if (zzfxjVarZzb != null) {
            try {
                zzfxjVarZzb.zzd(null, motionEvent);
            } catch (zzfyy e10) {
                this.zzh.zzc(e10.zza(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zze(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznv)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzf(Context context, String str, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzc();
        zzm();
        zzfxj zzfxjVarZzb = this.zzf.zzb();
        if (zzfxjVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfxjVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzo.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzj(Context context, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzb(context, view);
        zzm();
        zzfxj zzfxjVarZzb = this.zzf.zzb();
        if (zzfxjVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfxjVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final String zzl(Context context) {
        this.zzm.zzb();
        this.zzn.zza();
        zzm();
        zzfxj zzfxjVarZzb = this.zzf.zzb();
        if (zzfxjVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfxjVarZzb.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfyp zzfypVarZzc = this.zzf.zzc();
                if ((zzfypVarZzc == null || zzfypVarZzc.zze(3600L)) && zzfyd.zza(this.zzj)) {
                    this.zzi.execute(new zzbag(this));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[Catch: all -> 0x011d, zziet -> 0x011f, TryCatch #0 {zziet -> 0x011f, blocks: (B:6:0x0021, B:8:0x0033, B:12:0x0039, B:13:0x0045, B:15:0x0053, B:17:0x0061, B:20:0x006e, B:29:0x009f, B:33:0x00b8, B:39:0x00d1, B:40:0x00de, B:42:0x00e4, B:44:0x00ec, B:45:0x00ee, B:36:0x00c2, B:37:0x00c9, B:23:0x0075, B:25:0x007b, B:27:0x008d, B:46:0x00f8, B:47:0x0105, B:48:0x0112), top: B:58:0x0021, outer: #2 }] */
    final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzfyp zzfypVarZzt;
        zzbeb zzbebVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfyp zzfypVarZzt2 = zzt(1);
        if (zzfypVarZzt2 != null) {
            String strZza = zzfypVarZzt2.zza().zza();
            strZzb = zzfypVarZzt2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbds zzbdsVar = this.zzj;
                zzfxg zzfxgVar = this.zzh;
                zzfyu zzfyuVarZza = zzfxp.zza(context, 1, zzbdsVar, str, strZzb, AppEventsConstants.EVENT_PARAM_VALUE_YES, zzfxgVar);
                byte[] bArr = zzfyuVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfxgVar.zzb(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzbdu zzbduVarZzd = zzbdu.zzd(zzida.zzt(bArr, 0, length), zzido.zza());
                        if (zzbduVarZzd.zza().zza().isEmpty() || zzbduVarZzd.zza().zzb().isEmpty() || zzbduVarZzd.zzc().zzA().length == 0 || ((zzfypVarZzt = zzt(1)) != null && (zzbebVarZza = zzfypVarZzt.zza()) != null && zzbduVarZzd.zza().zza().equals(zzbebVarZza.zza()) && zzbduVarZzd.zza().zzb().equals(zzbebVarZza.zzb()))) {
                            this.zzh.zzb(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfyw zzfywVar = this.zzk;
                            int i10 = zzfyuVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdj)).booleanValue()) {
                                zZza = this.zzd.zza(zzbduVarZzd, zzfywVar);
                            } else if (i10 == 3) {
                                zZza = this.zze.zzb(zzbduVarZzd);
                            } else if (i10 == 4) {
                                zZza = this.zze.zza(zzbduVarZzd, zzfywVar);
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfyp zzfypVarZzt3 = zzt(1);
                                if (zzfypVarZzt3 != null) {
                                    if (this.zzf.zza(zzfypVarZzt3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zziet e10) {
                this.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            }
        } finally {
            this.zzl.countDown();
        }
    }

    final /* synthetic */ zzfxg zzo() {
        return this.zzh;
    }

    final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    final /* synthetic */ void zzr(boolean z10) {
        this.zzq = z10;
    }
}
