package com.applovin.impl.mediation.ads;

import android.app.Activity;
import com.applovin.impl.a3;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected MaxAdExpirationListener expirationListener;
    protected final com.applovin.impl.sdk.p logger;
    protected MaxAdRequestListener requestListener;
    protected MaxAdRevenueListener revenueListener;
    protected final com.applovin.impl.sdk.l sdk;
    protected final String tag;
    protected final Map<String, Object> localExtraParameters = Collections.synchronizedMap(new HashMap());
    protected final Map<String, Object> extraParameters = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes.dex */
    public interface InterfaceC0112a extends MaxAdListener, MaxAdRevenueListener, MaxAdRequestListener {
    }

    protected a(String str, MaxAdFormat maxAdFormat, String str2, com.applovin.impl.sdk.l lVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = lVar;
        this.tag = str2;
        this.logger = lVar.Q();
    }

    private void a(final String str, final String str2, final String str3, final MaxAdFormat maxAdFormat, final String str4, final com.applovin.impl.sdk.l lVar) {
        lVar.s0().a((k5) new u6(lVar, "reportExtraParameter", new Runnable() { // from class: com.applovin.impl.mediation.ads.y
            @Override // java.lang.Runnable
            public final void run() {
                a.a(str, str2, maxAdFormat, str3, lVar, str4);
            }
        }), f6.b.OTHER);
    }

    protected void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.expirationListener = null;
        this.adReviewListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, str);
        }
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Setting expiration listener: " + maxAdExpirationListener);
        }
        this.expirationListener = maxAdExpirationListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (q7.c(this.sdk) && ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str))) {
            throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
        }
        if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
            int i10 = Integer.parseInt(str2);
            if (i10 > TimeUnit.MINUTES.toSeconds(2L)) {
                com.applovin.impl.sdk.p.h(this.tag, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + i10 + "s) - this will be ignored");
            }
        }
        a(str, str2, this.adUnitId, this.adFormat, "extraParameter", this.sdk);
        this.extraParameters.put(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (obj instanceof Activity) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.b(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
            }
        } else {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            a(str, String.valueOf(obj), this.adUnitId, this.adFormat, "localExtraParameter", this.sdk);
            this.localExtraParameters.put(str, obj);
        }
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }

    public static void logApiCall(String str, String str2) {
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar == null) {
            return;
        }
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.l.E0.Q().a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2, MaxAdFormat maxAdFormat, String str3, com.applovin.impl.sdk.l lVar, String str4) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str + ":" + str2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), mapHashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", str3, mapHashMap);
        lVar.R().a(f2.f6530y0, str4, mapHashMap);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, GEmOVMyH.JStJNyM + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    void a(a3 a3Var) {
        x2 x2Var = new x2();
        x2Var.a().a("MAX Ad").a(a3Var).a();
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, x2Var.toString());
        }
    }
}
