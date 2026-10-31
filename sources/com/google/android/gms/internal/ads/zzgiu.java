package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgiu extends zzgix {
    private static final Long zza = -1L;
    private final zzgec zzb;
    private final Context zzc;
    private final Map zzd;

    zzgiu(zzaxm zzaxmVar, zzght zzghtVar, zzgec zzgecVar, Context context, Map map, zzgqh zzgqhVar) {
        super("l+kgGKMz/Iv8su4g8cwY9wke7SfZsr0faZH/ngMWgPU8rl0NeXLqH/yGmwd3VO0X", "i+H002K9niN4AH5EysFvLiWEIE/4786FSVH14vFL1Is=", zzaxmVar, zzghtVar, zzgqhVar.zza(121));
        this.zzb = zzgecVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) throws IllegalAccessException, InvocationTargetException {
        zzgec zzgecVar = this.zzb;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(zzgecVar.ordinal()), this.zzc, zzgtg.zza(this.zzd.get("up"), Boolean.TRUE));
        objArr.getClass();
        synchronized (zzaxmVar) {
            if (zzgecVar == zzgec.QUERY) {
                Object obj = objArr[0];
                Long l10 = zza;
                zzaxmVar.zzq(((Long) zzgtg.zza(obj, l10)).longValue());
                zzaxmVar.zzr(((Long) zzgtg.zza(objArr[1], l10)).longValue());
            }
            zzaxmVar.zzg(((Long) objArr[2]).longValue());
            zzaxmVar.zzQ(((Long) objArr[3]).longValue());
        }
    }
}
