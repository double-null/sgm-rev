package io.bidmachine;

import java.util.Map;

/* JADX INFO: compiled from: SimpleAdProcessCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
public class SimpleAdProcessCallback implements AdProcessCallback {
    @Override // io.bidmachine.AdProcessCallback
    public void onNetworkViewabilityEvent(mc.a actionEvent, oc.a aVar) {
        kotlin.jvm.internal.t.f(actionEvent, "actionEvent");
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onVisibilityTrackerViewabilityEvent(mc.a actionEvent, oc.a aVar) {
        kotlin.jvm.internal.t.f(actionEvent, "actionEvent");
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadFail(oc.a bmError) {
        kotlin.jvm.internal.t.f(bmError, "bmError");
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShowFail(oc.a bmError) {
        kotlin.jvm.internal.t.f(bmError, "bmError");
    }

    @Override // io.bidmachine.AdProcessCallback
    public void setVisibilitySource(io.bidmachine.core.j visibilitySource) {
        kotlin.jvm.internal.t.f(visibilitySource, "visibilitySource");
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClickVerified() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClicked() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClosed() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processDestroy() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processExpired() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFillAd() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFinished() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadSuccess() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShown() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processVisibilityTrackerShown() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onBrokenCreativeEvent(Map<String, ? extends Object> map) {
    }
}
