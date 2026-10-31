package com.facebook;

import android.os.Handler;

/* JADX INFO: compiled from: RequestProgress.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RequestProgress {
    private final Handler callbackHandler;
    private long lastReportedProgress;
    private long maxProgress;
    private long progress;
    private final GraphRequest request;
    private final long threshold;

    public RequestProgress(Handler handler, GraphRequest request) {
        kotlin.jvm.internal.t.f(request, "request");
        this.callbackHandler = handler;
        this.request = request;
        this.threshold = FacebookSdk.getOnProgressThreshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportProgress$lambda$0(GraphRequest.Callback callback, long j10, long j11) {
        ((GraphRequest.OnProgressCallback) callback).onProgress(j10, j11);
    }

    public final void addProgress(long j10) {
        long j11 = this.progress + j10;
        this.progress = j11;
        if (j11 >= this.lastReportedProgress + this.threshold || j11 >= this.maxProgress) {
            reportProgress();
        }
    }

    public final void addToMax(long j10) {
        this.maxProgress += j10;
    }

    public final long getMaxProgress() {
        return this.maxProgress;
    }

    public final long getProgress() {
        return this.progress;
    }

    public final void reportProgress() {
        if (this.progress > this.lastReportedProgress) {
            final GraphRequest.Callback callback = this.request.getCallback();
            final long j10 = this.maxProgress;
            if (j10 <= 0 || !(callback instanceof GraphRequest.OnProgressCallback)) {
                return;
            }
            final long j11 = this.progress;
            Handler handler = this.callbackHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.facebook.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        RequestProgress.reportProgress$lambda$0(callback, j11, j10);
                    }
                });
            } else {
                ((GraphRequest.OnProgressCallback) callback).onProgress(j11, j10);
            }
            this.lastReportedProgress = this.progress;
        }
    }
}
