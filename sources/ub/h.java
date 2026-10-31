package ub;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import java.util.UUID;

/* JADX INFO: compiled from: SessionTrackingObject.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends l {
    private final f sessionTracker;

    public h(f fVar) {
        this(UUID.randomUUID(), fVar);
    }

    public void clear() {
        this.sessionTracker.e(this);
    }

    @Override // ub.k
    public void clearEvent(TrackEventType trackEventType) {
        this.sessionTracker.c(this, trackEventType);
    }

    @Override // ub.k
    public void eventFinish(TrackEventType trackEventType, AdsType adsType, a aVar, oc.a aVar2) {
        this.sessionTracker.b(this, trackEventType, adsType, aVar2, aVar);
    }

    @Override // ub.k
    public void eventStart(TrackEventType trackEventType, j jVar) {
        this.sessionTracker.f(this, trackEventType, jVar);
    }

    public h(Object obj, f fVar) {
        super(obj);
        this.sessionTracker = fVar;
    }
}
