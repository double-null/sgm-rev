package ub;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import java.util.List;

/* JADX INFO: compiled from: TrackingObject.java */
/* JADX INFO: loaded from: classes5.dex */
public interface k {
    void clearEvent(TrackEventType trackEventType);

    void eventFinish(TrackEventType trackEventType, AdsType adsType, a aVar, oc.a aVar2);

    default void eventStart(TrackEventType trackEventType) {
        eventStart(trackEventType, null);
    }

    void eventStart(TrackEventType trackEventType, j jVar);

    AdExtension.EventConfiguration getEventConfiguration();

    Object getTrackingKey();

    List<String> getTrackingUrls(TrackEventType trackEventType);
}
