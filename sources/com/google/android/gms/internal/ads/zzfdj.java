package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfdj implements zzfck {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcev zzg;

    zzfdj(zzcev zzcevVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        this.zzg = zzcevVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i10;
        this.zze = z10;
        this.zzf = z11;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        zzhbo zzhboVarZzw = zzhbo.zzw(this.zzg.zza(this.zza, this.zzd));
        zzgta zzgtaVar = new zzgta() { // from class: com.google.android.gms.internal.ads.zzfdi
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzhbo) zzhbw.zzg((zzhbo) zzhbw.zzi((zzhbo) zzhbw.zzk(zzhboVarZzw, zzgtaVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbH)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzgta() { // from class: com.google.android.gms.internal.ads.zzfdh
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ zzfdk zzc(AdvertisingIdClient.Info info) {
        zzgcg zzgcgVar = new zzgcg();
        if (this.zze) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzec)).booleanValue()) {
                Context context = this.zza;
                zzgck zzgckVarZzh = zzgck.zzh(context);
                Objects.requireNonNull(info);
                String id2 = info.getId();
                Objects.requireNonNull(id2);
                zzgcgVar = zzgckVarZzh.zzj(id2, context.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeh)).longValue(), this.zzf);
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeb)).booleanValue()) {
                try {
                    Context context2 = this.zza;
                    zzgck zzgckVarZzh2 = zzgck.zzh(context2);
                    Objects.requireNonNull(info);
                    String id3 = info.getId();
                    Objects.requireNonNull(id3);
                    zzgcgVar = zzgckVarZzh2.zzj(id3, context2.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeh)).longValue(), this.zzf);
                } catch (IOException | IllegalArgumentException e10) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdIdInfoSignalSource.getPaidV1");
                    zzgcgVar = new zzgcg();
                }
            }
        }
        return new zzfdk(info, null, zzgcgVar);
    }

    final /* synthetic */ zzfdk zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzfdk(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgcg());
    }
}
