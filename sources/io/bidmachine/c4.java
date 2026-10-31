package io.bidmachine;

/* JADX INFO: compiled from: InitializationParamsImpl.java */
/* JADX INFO: loaded from: classes4.dex */
class c4 implements InitializationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ga.h f17525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ga.d f17526b;

    c4(TargetingParams targetingParams, ga.d dVar) {
        this.f17525a = new r5(dVar, targetingParams);
        this.f17526b = dVar;
    }

    @Override // io.bidmachine.GeneralParams
    public ga.d getDataRestrictions() {
        return this.f17526b;
    }

    @Override // io.bidmachine.GeneralParams
    public ga.h getTargetingInfo() {
        return this.f17525a;
    }

    @Override // io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return b2.e().E();
    }
}
