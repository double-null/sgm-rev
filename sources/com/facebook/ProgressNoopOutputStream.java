package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ProgressNoopOutputStream.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProgressNoopOutputStream extends OutputStream implements RequestOutputStream {
    private final Handler callbackHandler;
    private GraphRequest currentRequest;
    private RequestProgress currentRequestProgress;
    private int maxProgress;
    private final Map<GraphRequest, RequestProgress> progressMap = new HashMap();

    public ProgressNoopOutputStream(Handler handler) {
        this.callbackHandler = handler;
    }

    public final void addProgress(long j10) {
        GraphRequest graphRequest = this.currentRequest;
        if (graphRequest == null) {
            return;
        }
        if (this.currentRequestProgress == null) {
            RequestProgress requestProgress = new RequestProgress(this.callbackHandler, graphRequest);
            this.currentRequestProgress = requestProgress;
            this.progressMap.put(graphRequest, requestProgress);
        }
        RequestProgress requestProgress2 = this.currentRequestProgress;
        if (requestProgress2 != null) {
            requestProgress2.addToMax(j10);
        }
        this.maxProgress += (int) j10;
    }

    public final int getMaxProgress() {
        return this.maxProgress;
    }

    public final Map<GraphRequest, RequestProgress> getProgressMap() {
        return this.progressMap;
    }

    @Override // com.facebook.RequestOutputStream
    public void setCurrentRequest(GraphRequest graphRequest) {
        this.currentRequest = graphRequest;
        this.currentRequestProgress = graphRequest != null ? this.progressMap.get(graphRequest) : null;
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        addProgress(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        addProgress(i11);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        addProgress(1L);
    }
}
