package t6;

import android.text.TextUtils;
import com.explorestack.protobuf.DoubleValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.UInt32Value;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import io.bidmachine.protobuf.Waterfall;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
abstract class o {
    static AdManagerAdRequest a(Waterfall.Configuration.AdUnit adUnit) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        String requestAgent = adUnit.getRequestAgent();
        if (!TextUtils.isEmpty(requestAgent)) {
            builder.setRequestAgent(requestAgent);
        }
        for (Map.Entry<String, String> entry : adUnit.getCustomTargetingMap().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                builder.addCustomTargeting(key, value);
            }
        }
        return builder.build();
    }

    static Waterfall.Result.EstimatedPrice b(AdValue adValue) {
        return Waterfall.Result.EstimatedPrice.newBuilder().setValue(DoubleValue.newBuilder().setValue(adValue.getValueMicros()).build()).setCurrency(StringValue.newBuilder().setValue(adValue.getCurrencyCode()).build()).setPrecision(UInt32Value.newBuilder().setValue(adValue.getPrecisionType()).build()).build();
    }

    static Waterfall.Result.EstimatedPrice c(Object obj, String[] strArr) {
        try {
            Object objC = oc.n.c(obj, strArr);
            if (objC == null) {
                return null;
            }
            Integer num = (Integer) oc.n.b(objC, "b");
            String str = (String) oc.n.b(objC, "c");
            Number number = (Number) oc.n.b(objC, "d");
            Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            if (num == null && str == null && dValueOf == null) {
                return null;
            }
            Waterfall.Result.EstimatedPrice.Builder builderNewBuilder = Waterfall.Result.EstimatedPrice.newBuilder();
            if (dValueOf != null) {
                builderNewBuilder.setValue(DoubleValue.newBuilder().setValue(dValueOf.doubleValue()).build());
            }
            if (str != null) {
                builderNewBuilder.setCurrency(StringValue.newBuilder().setValue(str).build());
            }
            if (num != null) {
                builderNewBuilder.setPrecision(UInt32Value.newBuilder().setValue(num.intValue()).build());
            }
            return builderNewBuilder.build();
        } catch (Throwable unused) {
            return null;
        }
    }

    static oc.a d(oc.a aVar, AdError adError) {
        return new oc.a(aVar, adError.getCode(), adError.getMessage());
    }

    static q6.l e(BaseAdView baseAdView) {
        if (baseAdView == null) {
            return null;
        }
        Waterfall.Result.EstimatedPrice estimatedPriceC = c(baseAdView, new String[]{"zza", "zzj", "zza", "a", "a", "k", "ae"});
        ResponseInfo responseInfo = baseAdView.getResponseInfo();
        String string = responseInfo != null ? responseInfo.toString() : null;
        if (estimatedPriceC == null && string == null) {
            return null;
        }
        return new q6.l(estimatedPriceC, string);
    }

    static q6.l f(InterstitialAd interstitialAd) {
        if (interstitialAd == null) {
            return null;
        }
        return new q6.l(c(interstitialAd, new String[]{"zzc", "zza", "a", "a", "k", "ae"}), interstitialAd.getResponseInfo().toString());
    }

    static q6.l g(RewardedAd rewardedAd) {
        if (rewardedAd == null) {
            return null;
        }
        return new q6.l(c(rewardedAd, new String[]{"zzb", "zza", "b", "k", "ae"}), rewardedAd.getResponseInfo().toString());
    }
}
