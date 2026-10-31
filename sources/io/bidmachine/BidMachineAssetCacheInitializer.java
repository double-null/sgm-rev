package io.bidmachine;

import android.content.Context;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.sdk.AssetCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BidMachineAssetCacheInitializer.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BidMachineAssetCacheInitializer {
    private final xb.a.c getMediaFileCacheManagerConfiguration(InitResponse initResponse) {
        xb.a.c cVar = null;
        try {
            if (!initResponse.hasAssetCacheConfiguration()) {
                return null;
            }
            AssetCache.Configuration assetCacheConfiguration = initResponse.getAssetCacheConfiguration();
            AssetCache.CleanConfiguration cleanConfiguration = assetCacheConfiguration.getCleanConfiguration();
            xb.a.C0471a c0471a = new xb.a.C0471a(cleanConfiguration.getTriggerOnStartup(), cleanConfiguration.getTriggerOnCaching(), cleanConfiguration.getTriggerOnDiskIssue());
            AssetCache.ConnectionConfiguration connectionConfiguration = assetCacheConfiguration.getConnectionConfiguration();
            sd.a.C0418a c0418a = sd.a.f25407b;
            long headRequestTimeoutMs = connectionConfiguration.getHeadRequestTimeoutMs();
            sd.d dVar = sd.d.MILLISECONDS;
            xb.a.d dVar2 = new xb.a.d(sd.c.t(headRequestTimeoutMs, dVar), sd.c.t(connectionConfiguration.getDownloadRequestTimeoutMs(), dVar), null);
            AssetCache.PolicyConfiguration policyConfiguration = assetCacheConfiguration.getPolicyConfiguration();
            AssetCache.PolicyLimit maxPingTimeMs = policyConfiguration.getDownloadPolicy().getMaxPingTimeMs();
            kotlin.jvm.internal.t.e(maxPingTimeMs, "protobufPolicyConfig.downloadPolicy.maxPingTimeMs");
            xb.a.h policyLimit = toPolicyLimit(maxPingTimeMs);
            AssetCache.PolicyLimit maxFileSizeBytes = policyConfiguration.getDownloadPolicy().getMaxFileSizeBytes();
            kotlin.jvm.internal.t.e(maxFileSizeBytes, "protobufPolicyConfig.dow…adPolicy.maxFileSizeBytes");
            xb.a.e eVar = new xb.a.e(policyLimit, toPolicyLimit(maxFileSizeBytes));
            List<AssetCache.EvictionPolicy> evictionPoliciesList = policyConfiguration.getEvictionPoliciesList();
            kotlin.jvm.internal.t.e(evictionPoliciesList, "protobufPolicyConfig.evictionPoliciesList");
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(evictionPoliciesList, 10));
            Iterator it = evictionPoliciesList.iterator();
            while (it.hasNext()) {
                AssetCache.EvictionPolicy evictionPolicy = (AssetCache.EvictionPolicy) it.next();
                double score = evictionPolicy.getScore();
                double minDiskAppliedPercent = evictionPolicy.getMinDiskAppliedPercent();
                double maxDiskAppliedPercent = evictionPolicy.getMaxDiskAppliedPercent();
                sd.a.C0418a c0418a2 = sd.a.f25407b;
                Iterator it2 = it;
                try {
                    xb.a.h hVar = new xb.a.h(sd.a.p(sd.c.t(evictionPolicy.getMaxTtlSeconds().getThreshold(), sd.d.SECONDS)), evictionPolicy.getMaxTtlSeconds().getWeight());
                    AssetCache.PolicyLimit minFrequency = evictionPolicy.getMinFrequency();
                    kotlin.jvm.internal.t.e(minFrequency, "it.minFrequency");
                    xb.a.h policyLimit2 = toPolicyLimit(minFrequency);
                    AssetCache.PolicyLimit maxImageSizeBytes = evictionPolicy.getMaxImageSizeBytes();
                    kotlin.jvm.internal.t.e(maxImageSizeBytes, "it.maxImageSizeBytes");
                    xb.a.h policyLimit3 = toPolicyLimit(maxImageSizeBytes);
                    AssetCache.PolicyLimit maxVideoSizeBytes = evictionPolicy.getMaxVideoSizeBytes();
                    kotlin.jvm.internal.t.e(maxVideoSizeBytes, "it.maxVideoSizeBytes");
                    arrayList.add(new xb.a.f(score, minDiskAppliedPercent, maxDiskAppliedPercent, hVar, policyLimit2, policyLimit3, toPolicyLimit(maxVideoSizeBytes)));
                    it = it2;
                    cVar = null;
                } catch (Throwable unused) {
                    return null;
                }
            }
            return new xb.a.c(c0471a, dVar2, new xb.a.g(eVar, arrayList));
        } catch (Throwable unused2) {
            return cVar;
        }
    }

    private final xb.a.h toPolicyLimit(AssetCache.PolicyLimit policyLimit) {
        return new xb.a.h(policyLimit.getThreshold(), policyLimit.getWeight());
    }

    public final void configure(Context context, InitResponse initResponse) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(initResponse, "initResponse");
        o7.d dVar = o7.d.f23120a;
        dVar.d(context);
        xb.a.c mediaFileCacheManagerConfiguration = getMediaFileCacheManagerConfiguration(initResponse);
        if (mediaFileCacheManagerConfiguration != null) {
            dVar.a(context, mediaFileCacheManagerConfiguration);
        }
        dVar.e(context);
    }
}
