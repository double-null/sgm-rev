package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.a3;
import com.applovin.impl.f5;
import com.applovin.impl.m3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f7156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f7157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f7158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f7159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f7160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f7163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f7165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxAdFormat f7166l;

    private MaxAdapterParametersImpl() {
    }

    static MaxAdapterParametersImpl a(a3 a3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((m3) a3Var);
        maxAdapterParametersImplA.f7163i = a3Var.U();
        maxAdapterParametersImplA.f7164j = a3Var.E();
        maxAdapterParametersImplA.f7165k = a3Var.D();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f7166l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f7155a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f7165k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f7164j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f7161g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f7158d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f7156b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f7157c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f7163i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f7159e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f7160f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f7162h;
    }

    static MaxAdapterParametersImpl a(f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(f5Var);
        maxAdapterParametersImplA.f7155a = str;
        maxAdapterParametersImplA.f7166l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    static MaxAdapterParametersImpl a(m3 m3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f7155a = m3Var.getAdUnitId();
        maxAdapterParametersImpl.f7159e = m3Var.n();
        maxAdapterParametersImpl.f7160f = m3Var.o();
        maxAdapterParametersImpl.f7161g = m3Var.d();
        maxAdapterParametersImpl.f7156b = m3Var.i();
        maxAdapterParametersImpl.f7157c = m3Var.l();
        maxAdapterParametersImpl.f7158d = m3Var.f();
        maxAdapterParametersImpl.f7162h = m3Var.p();
        return maxAdapterParametersImpl;
    }
}
