package com.applovin.impl.mediation;

import com.applovin.impl.a3;
import com.applovin.impl.c3;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3 f7146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f7149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f7150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c3 f7151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f7152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f7153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f7154i;

    public MaxAdWaterfallInfoImpl(a3 a3Var, long j10, List<MaxNetworkResponseInfo> list, String str) {
        this(a3Var, a3Var.X(), a3Var.Y(), j10, list, a3Var.Q(), a3Var.W(), str, a3Var.T());
    }

    public String getEventId() {
        return this.f7154i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f7150e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f7146a;
    }

    public String getMCode() {
        return this.f7153h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f7147b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f7149d;
    }

    public List<String> getPostbackUrls() {
        return this.f7152g;
    }

    public c3 getRequestParameters() {
        return this.f7151f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f7148c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f7147b + ", testName=" + this.f7148c + vgmm.jhhMxfDpYq + this.f7149d + ", latencyMillis=" + this.f7150e + '}';
    }

    public MaxAdWaterfallInfoImpl(a3 a3Var, String str, String str2, long j10, List<MaxNetworkResponseInfo> list, c3 c3Var, List<String> list2, String str3, String str4) {
        this.f7146a = a3Var;
        this.f7147b = str;
        this.f7148c = str2;
        this.f7150e = j10;
        this.f7149d = list;
        this.f7151f = c3Var;
        this.f7152g = list2;
        this.f7153h = str3;
        this.f7154i = str4;
    }
}
