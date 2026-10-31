package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Pair;
import com.facebook.share.internal.ShareConstants;
import com.google.common.base.p;
import com.google.common.base.v;
import com.google.common.collect.u;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.x;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zztt {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final Executor zzb;
    private final zzru zzc;
    private final j zzd;
    private final Map zze;
    private final zzvc zzf;

    zztt(Executor executor, zzru zzruVar, zzvc zzvcVar, Map map, zzvf zzvfVar) {
        this.zzb = (Executor) p.l(executor);
        this.zzc = (zzru) p.l(zzruVar);
        this.zzf = (zzvc) p.l(zzvcVar);
        Map map2 = (Map) p.l(map);
        this.zze = map2;
        p.d(!map2.isEmpty());
        this.zzd = zzts.zza;
    }

    public final zztp zza(zztr zztrVar) {
        ConcurrentMap concurrentMap = this.zza;
        Uri uriZza = zztrVar.zza();
        Pair pairCreate = (Pair) concurrentMap.get(uriZza);
        if (pairCreate == null) {
            Uri uriZza2 = zztrVar.zza();
            p.i(uriZza2.isHierarchical(), "Uri must be hierarchical: %s", uriZza2);
            String strE = v.e(uriZza2.getLastPathSegment());
            int iLastIndexOf = strE.lastIndexOf(46);
            p.i((iLastIndexOf == -1 ? "" : strE.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriZza2);
            p.e(true, "Proto schema cannot be null");
            p.e(zztrVar.zzc() != null, "Handler cannot be null");
            zzuw zzuwVar = (zzuw) this.zze.get("singleproc");
            p.i(zzuwVar != null, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String strE2 = v.e(zztrVar.zza().getLastPathSegment());
            int iLastIndexOf2 = strE2.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strE2 = strE2.substring(0, iLastIndexOf2);
            }
            ListenableFuture listenableFutureM = x.m(x.g(zztrVar.zza()), this.zzd, g0.a());
            Executor executor = this.zzb;
            zzru zzruVar = this.zzc;
            zzti zztiVar = zzti.ALLOWED;
            zztp zztpVar = new zztp(zzuwVar.zzb(zztrVar, strE2, executor, zzruVar, zztiVar), this.zzf, listenableFutureM, false, zzuwVar.zza(zztiVar));
            u uVarZzd = zztrVar.zzd();
            if (!uVarZzd.isEmpty()) {
                zztpVar.zza(zzto.zza(uVarZzd, executor));
            }
            pairCreate = Pair.create(zztpVar, zztrVar);
            Pair pair = (Pair) concurrentMap.putIfAbsent(uriZza, pairCreate);
            if (pair != null) {
                pairCreate = pair;
            }
        }
        zztp zztpVar2 = (zztp) pairCreate.first;
        zztr zztrVar2 = (zztr) pairCreate.second;
        if (zztrVar.equals(zztrVar2)) {
            return zztpVar2;
        }
        String strC = v.c("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", zztrVar.zzb().getClass().getSimpleName(), zztrVar.zza());
        p.i(zztrVar.zza().equals(zztrVar2.zza()), strC, ShareConstants.MEDIA_URI);
        p.i(zztrVar.zzb().equals(zztrVar2.zzb()), strC, "schema");
        p.i(zztrVar.zzc().equals(zztrVar2.zzc()), strC, "handler");
        p.i(zztrVar.zzd().equals(zztrVar2.zzd()), strC, "migrations");
        p.i(zztrVar.zze().equals(zztrVar2.zze()), strC, "variantConfig");
        p.i(zztrVar.zzf() == zztrVar2.zzf(), strC, "useGeneratedExtensionRegistry");
        zztrVar2.zzg();
        p.i(true, strC, "enableTracing");
        throw new IllegalArgumentException(v.c(strC, "unknown"));
    }
}
