package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcj {
    private static AudioManager zza;

    public static synchronized AudioManager zza(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            zza = null;
        }
        AudioManager audioManager = zza;
        if (audioManager != null) {
            return audioManager;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
            final zzds zzdsVar = new zzds(zzdo.zza);
            zzdh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzci
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcj.zzb(applicationContext, zzdsVar);
                }
            });
            zzdsVar.zzd();
            AudioManager audioManager2 = zza;
            audioManager2.getClass();
            return audioManager2;
        }
        AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
        zza = audioManager3;
        audioManager3.getClass();
        return audioManager3;
    }

    static /* synthetic */ void zzb(Context context, zzds zzdsVar) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdsVar.zza();
    }
}
