package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzcej;
import com.google.android.gms.internal.ads.zzceq;
import com.google.android.gms.internal.ads.zzfpw;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzy implements zzhbt {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzceq zzb;
    final /* synthetic */ zzcej zzc;
    final /* synthetic */ zzfpw zzd;
    final /* synthetic */ zzap zze;

    zzy(zzap zzapVar, ListenableFuture listenableFuture, zzceq zzceqVar, zzcej zzcejVar, zzfpw zzfpwVar) {
        this.zza = listenableFuture;
        this.zzb = zzceqVar;
        this.zzc = zzcejVar;
        this.zzd = zzfpwVar;
        Objects.requireNonNull(zzapVar);
        this.zze = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziG)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfqg zzfqgVarZzy = zzap.zzy(this.zza, this.zzb);
        if (((Boolean) zzbkj.zze.zze()).booleanValue() && zzfqgVarZzy != null) {
            zzfpw zzfpwVar = this.zzd;
            zzfpwVar.zzj(th);
            zzfpwVar.zzd(false);
            zzfqgVarZzy.zza(zzfpwVar);
            zzfqgVarZzy.zzh();
        }
        zzcej zzcejVar = this.zzc;
        if (zzcejVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                sb2.append("Internal error. ");
                sb2.append(message);
                message = sb2.toString();
            }
            zzcejVar.zzb(message);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ListenableFuture listenableFuture = this.zza;
        AtomicBoolean atomicBooleanZzN = this.zze.zzN();
        zzbc zzbcVar = (zzbc) obj;
        zzfqg zzfqgVarZzy = zzap.zzy(listenableFuture, this.zzb);
        atomicBooleanZzN.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziA)).booleanValue()) {
            try {
                zzcej zzcejVar = this.zzc;
                if (zzcejVar != null) {
                    zzcejVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e10) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e10.toString());
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
            }
            if (!((Boolean) zzbkj.zze.zze()).booleanValue() || zzfqgVarZzy == null) {
                return;
            }
            zzfpw zzfpwVar = this.zzd;
            zzfpwVar.zzk("QueryInfo generation has been disabled.");
            zzfpwVar.zzd(false);
            zzfqgVarZzy.zza(zzfpwVar);
            zzfqgVarZzy.zzh();
            return;
        }
        try {
            if (zzbcVar == null) {
                zzcej zzcejVar2 = this.zzc;
                if (zzcejVar2 != null) {
                    zzcejVar2.zzc(null, null, null);
                }
                zzfpw zzfpwVar2 = this.zzd;
                zzfpwVar2.zzd(true);
                if (!((Boolean) zzbkj.zze.zze()).booleanValue() || zzfqgVarZzy == null) {
                    return;
                }
                zzfqgVarZzy.zza(zzfpwVar2);
                zzfqgVarZzy.zzh();
                return;
            }
            try {
                if (TextUtils.isEmpty(new JSONObject(zzbcVar.zzb).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, ""))) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                    zzcej zzcejVar3 = this.zzc;
                    if (zzcejVar3 != null) {
                        zzcejVar3.zzb("Internal error: request ID is empty in request JSON.");
                    }
                    zzfpw zzfpwVar3 = this.zzd;
                    zzfpwVar3.zzk("Request ID empty");
                    zzfpwVar3.zzd(false);
                    if (!((Boolean) zzbkj.zze.zze()).booleanValue() || zzfqgVarZzy == null) {
                        return;
                    }
                    zzfqgVarZzy.zza(zzfpwVar3);
                    zzfqgVarZzy.zzh();
                    return;
                }
                Bundle bundle = zzbcVar.zzd;
                zzap zzapVar = this.zze;
                if (zzapVar.zzF() && bundle != null && bundle.getInt(zzapVar.zzH(), -1) == -1) {
                    bundle.putInt(zzapVar.zzH(), zzapVar.zzI().get());
                }
                if (zzapVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzapVar.zzG()))) {
                    if (TextUtils.isEmpty(zzapVar.zzK())) {
                        zzapVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzapVar.zzz(), zzapVar.zzJ().afmaVersion));
                    }
                    bundle.putString(zzapVar.zzG(), zzapVar.zzK());
                }
                zzcej zzcejVar4 = this.zzc;
                if (zzcejVar4 != null) {
                    zzcejVar4.zzc(zzbcVar.zza, zzbcVar.zzb, bundle);
                }
                this.zzd.zzd(true);
                if (!((Boolean) zzbkj.zze.zze()).booleanValue() || zzfqgVarZzy == null) {
                    return;
                }
                zzfqgVarZzy.zza(this.zzd);
                zzfqgVarZzy.zzh();
            } catch (JSONException e11) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                zzcej zzcejVar5 = this.zzc;
                if (zzcejVar5 != null) {
                    String string = e11.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 33);
                    sb2.append("Internal error for request JSON: ");
                    sb2.append(string);
                    zzcejVar5.zzb(sb2.toString());
                }
                zzfpw zzfpwVar4 = this.zzd;
                zzfpwVar4.zzj(e11);
                zzfpwVar4.zzd(false);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbkj.zze.zze()).booleanValue() || zzfqgVarZzy == null) {
                    return;
                }
                zzfqgVarZzy.zza(zzfpwVar4);
                zzfqgVarZzy.zzh();
            }
        } catch (RemoteException e12) {
            zzfpw zzfpwVar5 = this.zzd;
            zzfpwVar5.zzj(e12);
            zzfpwVar5.zzd(false);
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e12);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) zzbkj.zze.zze()).booleanValue() && zzfqgVarZzy != null) {
                zzfqgVarZzy.zza(this.zzd);
                zzfqgVarZzy.zzh();
            }
        }
    }
}
