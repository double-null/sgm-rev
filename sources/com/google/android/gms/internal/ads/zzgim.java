package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgim extends zzgix {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    zzgim(zzaxm zzaxmVar, zzght zzghtVar, zzgqh zzgqhVar) {
        super("F5pwKdQUkBR2T28FTRLzecwttaHUl7VLDmgba7+ac24MPIR3NLD5sQMDLkLV832D", "Zvn3l46JDaJW0+pj8K/1DTe7U1wFUhv/KBF/UwuPk/A=", zzaxmVar, zzghtVar, zzgqhVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    Long l10 = (Long) method.invoke("", new Object[0]);
                    l10.getClass();
                    zza = l10;
                }
            }
        }
        synchronized (zzaxmVar) {
            if (zza != null) {
                zzaxmVar.zzm(zza.longValue());
            }
        }
    }
}
