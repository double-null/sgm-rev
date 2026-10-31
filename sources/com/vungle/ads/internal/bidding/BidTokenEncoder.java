package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.RtbRequest;
import com.vungle.ads.internal.model.RtbToken;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.InputOutputUtils;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import fe.d;
import fe.u;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.v;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: BidTokenEncoder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BidTokenEncoder {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BidTokenEncoder";
    public static final int TOKEN_VERSION = 6;
    private SingleValueMetric bidTokenRequestedMetric;
    private final Context context;
    private long enterBackgroundTime;
    private final b json;
    private int ordinalView;

    /* JADX INFO: compiled from: BidTokenEncoder.kt */
    public static final class BiddingTokenInfo {
        private final String bidToken;
        private final String errorMessage;

        public BiddingTokenInfo(String bidToken, String errorMessage) {
            t.f(bidToken, "bidToken");
            t.f(errorMessage, "errorMessage");
            this.bidToken = bidToken;
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ BiddingTokenInfo copy$default(BiddingTokenInfo biddingTokenInfo, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = biddingTokenInfo.bidToken;
            }
            if ((i10 & 2) != 0) {
                str2 = biddingTokenInfo.errorMessage;
            }
            return biddingTokenInfo.copy(str, str2);
        }

        public final String component1() {
            return this.bidToken;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final BiddingTokenInfo copy(String bidToken, String errorMessage) {
            t.f(bidToken, "bidToken");
            t.f(errorMessage, "errorMessage");
            return new BiddingTokenInfo(bidToken, errorMessage);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BiddingTokenInfo)) {
                return false;
            }
            BiddingTokenInfo biddingTokenInfo = (BiddingTokenInfo) obj;
            return t.a(this.bidToken, biddingTokenInfo.bidToken) && t.a(this.errorMessage, biddingTokenInfo.errorMessage);
        }

        public final String getBidToken() {
            return this.bidToken;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return (this.bidToken.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public String toString() {
            return "BiddingTokenInfo(bidToken=" + this.bidToken + ", errorMessage=" + this.errorMessage + ')';
        }
    }

    /* JADX INFO: compiled from: BidTokenEncoder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public BidTokenEncoder(Context context) {
        t.f(context, "context");
        this.context = context;
        this.bidTokenRequestedMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
        this.json = v.b(null, BidTokenEncoder$json$1.INSTANCE, 1, null);
        ActivityManager.Companion.addLifecycleListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder.1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onBackground() {
                BidTokenEncoder.this.onPause$vungle_ads_release();
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onForeground() {
                BidTokenEncoder.this.onResume$vungle_ads_release();
            }
        });
    }

    /* JADX INFO: renamed from: constructV6Token$lambda-0, reason: not valid java name */
    private static final VungleApiClient m251constructV6Token$lambda0(wc.k<VungleApiClient> kVar) {
        return kVar.getValue();
    }

    private final BiddingTokenInfo generateBidToken() {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.bidTokenRequestedMetric, (LogEntry) null, (String) null, 6, (Object) null);
        try {
            String strConstructV6Token$vungle_ads_release = constructV6Token$vungle_ads_release();
            Logger.Companion companion = Logger.Companion;
            companion.d(TAG, "BidToken: " + strConstructV6Token$vungle_ads_release);
            try {
                String str = "6:" + InputOutputUtils.INSTANCE.convertForSending(strConstructV6Token$vungle_ads_release);
                companion.d(TAG, "After conversion: " + str);
                return new BiddingTokenInfo(str, "");
            } catch (Throwable th) {
                String str2 = "Fail to gzip token data. " + th.getLocalizedMessage();
                new GzipEncodeError(str2).logErrorNoReturnValue$vungle_ads_release();
                return new BiddingTokenInfo("", str2);
            }
        } catch (Throwable th2) {
            String str3 = "Failed to encode TokenParameters. " + th2.getLocalizedMessage();
            new JsonEncodeError(str3).logErrorNoReturnValue$vungle_ads_release();
            return new BiddingTokenInfo("", str3);
        }
    }

    public final String constructV6Token$vungle_ads_release() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        VungleApiClient vungleApiClientM251constructV6Token$lambda0 = m251constructV6Token$lambda0(m.b(o.SYNCHRONIZED, new BidTokenEncoder$constructV6Token$$inlined$inject$1(this.context)));
        ConfigManager configManager = ConfigManager.INSTANCE;
        CommonRequestBody commonRequestBodyRequestBody = vungleApiClientM251constructV6Token$lambda0.requestBody(!configManager.signalsDisabled(), configManager.fpdEnabled());
        RtbToken rtbToken = new RtbToken(commonRequestBodyRequestBody.getDevice(), commonRequestBodyRequestBody.getUser(), commonRequestBodyRequestBody.getExt(), new RtbRequest(VungleHeader.INSTANCE.getHeaderUa()), this.ordinalView);
        b bVar = this.json;
        d<Object> dVarB = u.b(bVar.a(), i0.j(RtbToken.class));
        t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return bVar.b(dVarB, rtbToken);
    }

    public final BiddingTokenInfo encode() {
        this.ordinalView++;
        return generateBidToken();
    }

    public final long getEnterBackgroundTime$vungle_ads_release() {
        return this.enterBackgroundTime;
    }

    public final int getOrdinalView$vungle_ads_release() {
        return this.ordinalView;
    }

    public final void onPause$vungle_ads_release() {
        Logger.Companion.d(TAG, "BidTokenEncoder#onBackground()");
        this.enterBackgroundTime = System.currentTimeMillis();
    }

    public final void onResume$vungle_ads_release() {
        Logger.Companion.d(TAG, "BidTokenEncoder#onForeground()");
        if (System.currentTimeMillis() > this.enterBackgroundTime + ConfigManager.INSTANCE.getSessionTimeout()) {
            this.ordinalView = 0;
            this.enterBackgroundTime = 0L;
        }
    }

    public final void setEnterBackgroundTime$vungle_ads_release(long j10) {
        this.enterBackgroundTime = j10;
    }

    public final void setOrdinalView$vungle_ads_release(int i10) {
        this.ordinalView = i10;
    }

    public static /* synthetic */ void getEnterBackgroundTime$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    public static /* synthetic */ void getOrdinalView$vungle_ads_release$annotations() {
    }
}
