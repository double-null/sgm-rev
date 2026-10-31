package io.bidmachine;

/* JADX INFO: compiled from: BidMachineSessionTracker.java */
/* JADX INFO: loaded from: classes4.dex */
class c2 extends ub.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s1 f17523c;

    c2(ub.b bVar) {
        super(bVar);
        this.f17523c = new s1();
    }

    @Override // ub.g, ub.b
    public void d(ub.k kVar, TrackEventType trackEventType, ub.j jVar, AdsType adsType, oc.a aVar, ub.a aVar2) {
        super.d(kVar, trackEventType, jVar, adsType, aVar, aVar2);
        this.f17523c.d(kVar, trackEventType, jVar, adsType, aVar, aVar2);
    }
}
