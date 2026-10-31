package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import be.LNO.fzLzfW;
import com.facebook.internal.ServerProtocol;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzdzq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzj {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzdzq zzd;
    private final ExecutorService zze;

    zzj(Context context, zzdzq zzdzqVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdzqVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z10) {
        Map map = this.zzb;
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze(boolean z10, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        bundle.putBoolean("accept_3p_cookie", z10);
        Map map = this.zza;
        Boolean boolValueOf = Boolean.valueOf(z10);
        zzl zzlVar = (zzl) map.get(boolValueOf);
        int iZzd = 0;
        if (z11 && zzlVar != null) {
            iZzd = zzlVar.zzd() + 1;
        }
        zzl zzlVar2 = (zzl) map.get(boolValueOf);
        final zzk zzkVar = new zzk(this, z10, iZzd, zzlVar2 == null ? null : Boolean.valueOf(zzlVar2.zze()), this.zzd);
        final AdRequest adRequestBuild = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmy)).booleanValue()) {
            this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzg(adRequestBuild, zzkVar);
                }
            });
        } else {
            QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequestBuild, zzkVar);
        }
    }

    public final synchronized void zza() {
        zzh(true);
        zzh(false);
    }

    public final synchronized void zzb(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        zzcfr.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(obj, pair);
            }
        });
    }

    final synchronized void zzc(final boolean z10, zzl zzlVar) {
        Map map = this.zza;
        Boolean boolValueOf = Boolean.valueOf(z10);
        zzl zzlVar2 = (zzl) map.get(boolValueOf);
        if (zzlVar2 == null || zzlVar2.zzc() || zzlVar2.zza() == null || zzlVar.zza() != null) {
            map.put(boolValueOf, zzlVar);
        }
        long jLongValue = (zzlVar.zza() != null ? (Long) zzbkv.zzf.zze() : (Long) zzbkv.zzg.zze()).longValue();
        final boolean z11 = zzlVar.zza() == null;
        zzcfr.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(z10, z11);
            }
        }, jLongValue, TimeUnit.SECONDS);
        Map map2 = this.zzb;
        List list = (List) map2.get(boolValueOf);
        map2.put(boolValueOf, new ArrayList());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj(zzlVar, (Pair) it.next(), false);
            }
        }
    }

    final /* synthetic */ void zzd(Object obj, Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzc);
            if (cookieManagerZza != null) {
                zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        zzl zzlVar = (zzl) map.get(boolValueOf);
        if (zzlVar != null && !zzlVar.zzc()) {
            zzj(zzlVar, pair, true);
            return;
        }
        Map map2 = this.zzb;
        List arrayList = (List) map2.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    final /* synthetic */ void zzf(boolean z10) {
        zze(z10, false);
    }

    final /* synthetic */ Object zzg(AdRequest adRequest, zzk zzkVar) {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzkVar);
        return Boolean.TRUE;
    }

    private final void zzj(zzl zzlVar, Pair pair, boolean z10) {
        zzlVar.zzf();
        QueryInfo queryInfoZza = zzlVar.zza();
        if (queryInfoZza != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(queryInfoZza);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzlVar.zzb());
        }
        zzdzq zzdzqVar = this.zzd;
        Pair[] pairArr = new Pair[7];
        boolean z11 = false;
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        pairArr[4] = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((Long) pair.second).longValue()));
        pairArr[5] = new Pair("sgpc_h", Boolean.toString(z10));
        if (zzlVar.zza() != null) {
            z11 = true;
        }
        pairArr[6] = new Pair("sgpc_rs", Boolean.toString(z11));
        zzv.zze(zzdzqVar, null, fzLzfW.cqccSEpGjrXiBgv, pairArr);
    }
}
