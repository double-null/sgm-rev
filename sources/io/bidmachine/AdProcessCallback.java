package io.bidmachine;

import java.util.Map;

/* JADX INFO: compiled from: AdProcessCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface AdProcessCallback {
    void onBrokenCreativeEvent(Map<String, ? extends Object> map);

    void onNetworkViewabilityEvent(mc.a aVar, oc.a aVar2);

    void onVisibilityTrackerViewabilityEvent(mc.a aVar, oc.a aVar2);

    void processClickVerified();

    void processClicked();

    void processClosed();

    void processDestroy();

    void processExpired();

    void processFillAd();

    void processFinished();

    void processLoadFail(oc.a aVar);

    void processLoadSuccess();

    void processShowFail(oc.a aVar);

    void processShown();

    void processVisibilityTrackerShown();

    void setVisibilitySource(io.bidmachine.core.j jVar);
}
