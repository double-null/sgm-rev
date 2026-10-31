package ub;

import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: TrackingObjectImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l implements k {
    private final Object trackingKey;

    public l() {
        this(UUID.randomUUID());
    }

    @Override // ub.k
    public AdExtension.EventConfiguration getEventConfiguration() {
        return null;
    }

    @Override // ub.k
    public Object getTrackingKey() {
        return this.trackingKey;
    }

    @Override // ub.k
    public List<String> getTrackingUrls(TrackEventType trackEventType) {
        return null;
    }

    public l(Object obj) {
        this.trackingKey = obj;
    }
}
