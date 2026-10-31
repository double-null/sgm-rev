package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdae implements zzdfx, zzdlk {
    private zzcaw zza;
    private final Context zzc;
    private final zzfqj zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzdae(Context context, zzfqj zzfqjVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfqjVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzc() {
        zzcaw zzcawVar;
        int i10;
        zzbui zzbuiVarZzb;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzbkq.zzo.zze()).booleanValue()) {
                i10 = 2;
            } else {
                i10 = 3;
                if (!((Boolean) zzbkq.zzp.zze()).booleanValue()) {
                    if (((Boolean) zzbkq.zzn.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i10 = 2;
                            } else if (!TextUtils.equals(strOptString, "service")) {
                                i10 = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i10 = 1;
                    }
                }
            }
            int i11 = i10 - 1;
            if (i11 == 1) {
                zzbuiVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            } else if (i11 == 2) {
                zzbuiVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            }
            zzbuc zzbucVar = zzbuf.zza;
            this.zza = new zzcaz(this.zzc, zzbuiVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbucVar, zzbucVar), this.zze, this.zzf);
            this.zzg = true;
        }
        if (this.zzg && (zzcawVar = this.zza) != null) {
            ListenableFuture listenableFutureZzb = zzcawVar.zzb();
            if (!this.zzh && ((Boolean) zzbki.zzi.zze()).booleanValue()) {
                listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdad
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf();
                    }
                }, this.zzf);
            }
            zzcfu.zza(listenableFutureZzb, "persistFlagsClient", zzcfr.zzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(zzcbd zzcbdVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze(String str) {
        zzc();
    }

    final /* synthetic */ void zzf() {
        zzbib.zze(this.zzc);
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(zzfkq zzfkqVar) {
    }
}
