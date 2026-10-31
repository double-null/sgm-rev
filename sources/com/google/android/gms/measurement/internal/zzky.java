package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzky implements Application.ActivityLifecycleCallbacks, zzkw {
    final /* synthetic */ zzlj zza;

    zzky(zzlj zzljVar) {
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(com.google.android.gms.internal.measurement.zzdd.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzdd.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzdd.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzd(com.google.android.gms.internal.measurement.zzdd.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zze(com.google.android.gms.internal.measurement.zzdd.zza(activity), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zza(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle) {
        zzic zzicVar;
        Uri uri;
        try {
            try {
                zzlj zzljVar = this.zza;
                zzic zzicVar2 = zzljVar.zzu;
                zzicVar2.zzaW().zzk().zza("onActivityCreated");
                Intent intent = zzddVar.zzc;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        uri = null;
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        zzicVar2.zzaX().zzj(new zzkx(this, bundle == null, uri, zzicVar2.zzk().zzj(intent) ? "gs" : "auto", uri.getQueryParameter(Constants.REFERRER)));
                        zzicVar = this.zza.zzu;
                    }
                    zzmb zzmbVarZzs = zzicVar.zzs();
                }
                zzicVar = zzljVar.zzu;
            } catch (RuntimeException e10) {
                this.zza.zzu.zzaW().zzb().zzb("Throwable caught in onActivityCreated", e10);
            }
            zzmb zzmbVarZzs2 = zzicVar.zzs();
        } finally {
            this.zza.zzu.zzs().zzn(zzddVar, bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zzb(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        this.zza.zzu.zzs().zzt(zzddVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zzc(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        zzic zzicVar = this.zza.zzu;
        zzicVar.zzs().zzq(zzddVar);
        zzoc zzocVarZzh = zzicVar.zzh();
        zzic zzicVar2 = zzocVarZzh.zzu;
        zzicVar2.zzaX().zzj(new zznv(zzocVarZzh, zzicVar2.zzba().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zzd(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        zzic zzicVar = this.zza.zzu;
        zzoc zzocVarZzh = zzicVar.zzh();
        zzic zzicVar2 = zzocVarZzh.zzu;
        zzicVar2.zzaX().zzj(new zznu(zzocVarZzh, zzicVar2.zzba().elapsedRealtime()));
        zzicVar.zzs().zzp(zzddVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public final void zze(com.google.android.gms.internal.measurement.zzdd zzddVar, Bundle bundle) {
        this.zza.zzu.zzs().zzs(zzddVar, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
