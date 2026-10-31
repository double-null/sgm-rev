package io.bidmachine;

import io.bidmachine.AdRequestParameters;

/* JADX INFO: loaded from: classes4.dex */
public class UnifiedAdRequestParamsImpl<AdRequestParametersType extends AdRequestParameters> implements vb.d {
    private final AdRequestParametersType adRequestParameters;
    private final ga.d dataRestrictions;
    private final ga.e deviceInfo;
    private final ga.h targetingInfo;

    protected UnifiedAdRequestParamsImpl(AdRequestParametersType adrequestparameterstype, TargetingParams targetingParams, ga.d dVar) {
        this.adRequestParameters = adrequestparameterstype;
        this.targetingInfo = new r5(dVar, targetingParams);
        this.deviceInfo = new q2(dVar);
        this.dataRestrictions = dVar;
    }

    @Override // vb.d, vb.n
    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @Override // io.bidmachine.GeneralParams
    public ga.d getDataRestrictions() {
        return this.dataRestrictions;
    }

    public ga.e getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // io.bidmachine.GeneralParams
    public ga.h getTargetingInfo() {
        return this.targetingInfo;
    }

    @Override // io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return b2.e().E();
    }
}
