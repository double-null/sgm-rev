package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgie extends zzgix {
    private final Map zza;
    private final Context zzb;
    private final zzgec zzc;
    private final long zzd;
    private final long zze;

    zzgie(zzaxm zzaxmVar, zzght zzghtVar, Map map, Context context, zzgec zzgecVar, zzgdf zzgdfVar, zzgqh zzgqhVar) {
        super("xY3gDYg3ehHtRa/OArDkyuYqE4ANbddC+yAYvnChUVnwqVQ4d5eLbYgJUUNK/LyJ", "Ni/EfqOeHVEZXBaAYj8opGVmmXN/Fcivd07F+tESqqU=", zzaxmVar, zzghtVar, zzgqhVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgecVar;
        this.zzd = zzgdfVar.zzl();
        this.zze = zzgdfVar.zzm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(Method method, zzaxm zzaxmVar) throws IllegalAccessException, InvocationTargetException {
        zzaym zzaymVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String strZzb = "E";
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzaymVar = (zzaym) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzaymVar.zzb().length() > 1)) {
                strZzb = zzaymVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.zza.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgua.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzaxmVar) {
            zzaxmVar.zzu(((Long) objArr[0]).longValue());
            zzaxmVar.zzt((String) objArr[1]);
            zzaxmVar.zzD((String) objArr[2]);
            zzaxmVar.zzE((String) objArr[3]);
            zzgzh zzgzhVarZzi = zzgzh.zzn().zzi();
            byte[] bArr = (byte[]) objArr[4];
            zzaxmVar.zzp(zzgzhVarZzi.zzj(bArr, 0, bArr.length));
            zzaxmVar.zzo(strZzb);
            if (bool != null) {
                zzaxmVar.zzai(true != bool.booleanValue() ? 1 : 2);
            }
        }
    }
}
