package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzepk implements zzhbe {
    private final zzfpk zza;
    private final zzdct zzb;
    private final zzfry zzc;
    private final zzfsc zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcxw zzg;
    private final zzepd zzh;
    private final zzelx zzi;
    private final Context zzj;
    private final zzfqg zzk;
    private final zzeon zzl;
    private final zzdzg zzm;

    zzepk(Context context, zzfpk zzfpkVar, zzepd zzepdVar, zzdct zzdctVar, zzfry zzfryVar, zzfsc zzfscVar, zzcxw zzcxwVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzelx zzelxVar, zzfqg zzfqgVar, zzeon zzeonVar, zzdzg zzdzgVar) {
        this.zzj = context;
        this.zza = zzfpkVar;
        this.zzh = zzepdVar;
        this.zzb = zzdctVar;
        this.zzc = zzfryVar;
        this.zzd = zzfscVar;
        this.zzg = zzcxwVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzelxVar;
        this.zzk = zzfqgVar;
        this.zzl = zzeonVar;
        this.zzm = zzdzgVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    static String zzb(zzfkq zzfkqVar) {
        String string = "No fill.";
        String str = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgB)).booleanValue() ? "No ad config." : "No fill.";
        zzfki zzfkiVar = zzfkqVar.zzb.zzb;
        int i10 = zzfkiVar.zzf;
        if (i10 == 0) {
            string = str;
        } else if (i10 >= 200 && i10 < 300) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgA)).booleanValue()) {
                string = str;
            }
        } else if (i10 < 300 || i10 >= 400) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 35);
            sb2.append("Received error HTTP response code: ");
            sb2.append(i10);
            string = sb2.toString();
        } else {
            string = "No location header to follow redirect or too many redirects.";
        }
        zzfkh zzfkhVar = zzfkiVar.zzj;
        return zzfkhVar != null ? zzfkhVar.zza() : string;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        boolean z10;
        int i10;
        Bundle bundle;
        final zzfkq zzfkqVar = (zzfkq) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcN)).booleanValue() && (bundle = zzfkqVar.zzb.zzd) != null) {
            this.zzm.zzg(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcO)).booleanValue()) {
            this.zzm.zzf(zzdyu.zzu.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String strZzb = zzb(zzfkqVar);
        zzelx zzelxVar = this.zzi;
        zzfkp zzfkpVar = zzfkqVar.zzb;
        zzfki zzfkiVar = zzfkpVar.zzb;
        zzelxVar.zza(zzfkiVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjC)).booleanValue() && (i10 = zzfkiVar.zzf) != 0 && (i10 < 200 || i10 >= 300)) {
            return zzhbw.zzc(new zzeph(3, strZzb));
        }
        String str = zzfkiVar.zzq;
        int i11 = 0;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzew)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfkf zzfkfVar : zzfkpVar.zza) {
                zzelxVar.zzb(zzfkfVar);
                Iterator it = zzfkfVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    zzels zzelsVarZza = this.zzg.zza(zzfkfVar.zzb, (String) it.next());
                    if (zzelsVarZza != null && zzelsVarZza.zza(zzfkqVar, zzfkfVar)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    zzelxVar.zze(zzfkfVar, 0L, zzfma.zzd(1, null, null));
                }
            }
        } else {
            zzelxVar.zzc(str, zzfkpVar.zza);
        }
        zzdct zzdctVar = this.zzb;
        zzctn zzctnVar = new zzctn(zzfkqVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdctVar.zzq(zzctnVar, executor);
        if (zzfkiVar.zzr > 1) {
            return this.zzl.zza(zzfkqVar);
        }
        String strZzb2 = zzb(zzfkqVar);
        zzfpk zzfpkVar = this.zza;
        zzfpe zzfpeVar = zzfpe.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfpkVar);
        zzfor zzforVarZzi = zzfov.zza(zzhbw.zzc(new zzeph(3, strZzb2)), zzfpeVar, zzfpkVar).zzi();
        final zzepd zzepdVar = this.zzh;
        zzepdVar.zza();
        for (final zzfkf zzfkfVar2 : zzfkpVar.zza) {
            for (String str2 : zzfkfVar2.zza) {
                final zzels zzelsVarZza2 = this.zzg.zza(zzfkfVar2.zzb, str2);
                if (zzelsVarZza2 != null && zzelsVarZza2.zza(zzfkqVar, zzfkfVar2)) {
                    zzfpb zzfpbVarZza = zzfpkVar.zza(zzfpe.RENDER_CONFIG_WATERFALL, zzforVarZzi);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(str2).length());
                    sb2.append("render-config-");
                    sb2.append(i11);
                    sb2.append("-");
                    sb2.append(str2);
                    zzforVarZzi = zzfpbVarZza.zza(sb2.toString()).zzg(Throwable.class, new zzhbe() { // from class: com.google.android.gms.internal.ads.zzepj
                        @Override // com.google.android.gms.internal.ads.zzhbe
                        public final /* synthetic */ ListenableFuture zza(Object obj2) {
                            return this.zza.zzc(zzfkfVar2, zzfkqVar, zzelsVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i11++;
        }
        zzforVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzepdVar.zzb();
            }
        }, executor);
        return zzforVarZzi;
    }

    final /* synthetic */ ListenableFuture zzc(zzfkf zzfkfVar, zzfkq zzfkqVar, zzels zzelsVar, Throwable th) {
        zzfpw zzfpwVarZzn = zzfpw.zzn(this.zzj, 12);
        zzfpwVarZzn.zzi(zzfkfVar.zzE);
        zzfpwVarZzn.zza();
        ListenableFuture listenableFutureZzi = zzhbw.zzi(zzelsVar.zzb(zzfkqVar, zzfkfVar), zzfkfVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfkqVar, zzfkfVar, listenableFutureZzi, this.zzc);
        zzfqf.zzd(listenableFutureZzi, this.zzk, zzfpwVarZzn);
        return listenableFutureZzi;
    }
}
