package com.facebook.appevents;

/* JADX INFO: compiled from: FlushStatistics.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FlushStatistics {
    private int numEvents;
    private FlushResult result = FlushResult.SUCCESS;

    public final int getNumEvents() {
        return this.numEvents;
    }

    public final FlushResult getResult() {
        return this.result;
    }

    public final void setNumEvents(int i10) {
        this.numEvents = i10;
    }

    public final void setResult(FlushResult flushResult) {
        kotlin.jvm.internal.t.f(flushResult, "<set-?>");
        this.result = flushResult;
    }
}
