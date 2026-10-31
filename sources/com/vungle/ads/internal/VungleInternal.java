package com.vungle.ads.internal;

import android.content.Context;
import com.android.billingclient.gp.VRfCTjjLv;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Utils;
import kotlin.jvm.internal.t;
import wc.k;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: VungleInternal.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleInternal {
    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-0, reason: not valid java name */
    private static final BidTokenEncoder m248getAvailableBidTokensAsync$lambda0(k<BidTokenEncoder> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-1, reason: not valid java name */
    private static final SDKExecutors m249getAvailableBidTokensAsync$lambda1(k<SDKExecutors> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-2, reason: not valid java name */
    public static final void m250getAvailableBidTokensAsync$lambda2(BidTokenCallback callback, k bidTokenEncoder$delegate) {
        t.f(callback, "$callback");
        t.f(bidTokenEncoder$delegate, "$bidTokenEncoder$delegate");
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        timeIntervalMetric.markStart();
        BidTokenEncoder.BiddingTokenInfo biddingTokenInfoEncode = m248getAvailableBidTokensAsync$lambda0(bidTokenEncoder$delegate).encode();
        timeIntervalMetric.markEnd();
        if (biddingTokenInfoEncode.getBidToken().length() > 0) {
            callback.onBidTokenCollected(biddingTokenInfoEncode.getBidToken());
        } else {
            timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            timeIntervalMetric.setMeta(biddingTokenInfoEncode.getErrorMessage());
            callback.onBidTokenError(biddingTokenInfoEncode.getErrorMessage());
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, (LogEntry) null, (String) null, 6, (Object) null);
    }

    public final String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public final void getAvailableBidTokensAsync(Context context, final BidTokenCallback callback) {
        t.f(context, "context");
        t.f(callback, "callback");
        if (Utils.INSTANCE.isOSVersionInvalid()) {
            new SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            callback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!VungleAds.Companion.isInitialized()) {
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            t.e(applicationContext, VRfCTjjLv.OpOCf);
            privacyManager.init(applicationContext);
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVar = o.SYNCHRONIZED;
        final k kVarB = m.b(oVar, new VungleInternal$getAvailableBidTokensAsync$$inlined$inject$1(context));
        m249getAvailableBidTokensAsync$lambda1(m.b(oVar, new VungleInternal$getAvailableBidTokensAsync$$inlined$inject$2(context))).getApiExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.e
            @Override // java.lang.Runnable
            public final void run() {
                VungleInternal.m250getAvailableBidTokensAsync$lambda2(callback, kVarB);
            }
        });
    }
}
