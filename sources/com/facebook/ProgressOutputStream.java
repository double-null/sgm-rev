package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: ProgressOutputStream.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProgressOutputStream extends FilterOutputStream implements RequestOutputStream {
    private long batchProgress;
    private RequestProgress currentRequestProgress;
    private long lastReportedProgress;
    private final long maxProgress;
    private final Map<GraphRequest, RequestProgress> progressMap;
    private final GraphRequestBatch requests;
    private final long threshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressOutputStream(OutputStream out, GraphRequestBatch requests, Map<GraphRequest, RequestProgress> progressMap, long j10) {
        super(out);
        kotlin.jvm.internal.t.f(out, "out");
        kotlin.jvm.internal.t.f(requests, "requests");
        kotlin.jvm.internal.t.f(progressMap, "progressMap");
        this.requests = requests;
        this.progressMap = progressMap;
        this.maxProgress = j10;
        this.threshold = FacebookSdk.getOnProgressThreshold();
    }

    private final void addProgress(long j10) {
        RequestProgress requestProgress = this.currentRequestProgress;
        if (requestProgress != null) {
            requestProgress.addProgress(j10);
        }
        long j11 = this.batchProgress + j10;
        this.batchProgress = j11;
        if (j11 >= this.lastReportedProgress + this.threshold || j11 >= this.maxProgress) {
            reportBatchProgress();
        }
    }

    private final void reportBatchProgress() {
        if (this.batchProgress > this.lastReportedProgress) {
            for (final GraphRequestBatch.Callback callback : this.requests.getCallbacks()) {
                if (callback instanceof GraphRequestBatch.OnProgressCallback) {
                    Handler callbackHandler = this.requests.getCallbackHandler();
                    if (callbackHandler != null) {
                        callbackHandler.post(new Runnable() { // from class: com.facebook.x
                            @Override // java.lang.Runnable
                            public final void run() {
                                ProgressOutputStream.reportBatchProgress$lambda$0(callback, this);
                            }
                        });
                    } else {
                        ((GraphRequestBatch.OnProgressCallback) callback).onBatchProgress(this.requests, this.batchProgress, this.maxProgress);
                    }
                }
            }
            this.lastReportedProgress = this.batchProgress;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportBatchProgress$lambda$0(GraphRequestBatch.Callback callback, ProgressOutputStream this$0) {
        kotlin.jvm.internal.t.f(callback, "$callback");
        kotlin.jvm.internal.t.f(this$0, "this$0");
        ((GraphRequestBatch.OnProgressCallback) callback).onBatchProgress(this$0.requests, this$0.batchProgress, this$0.maxProgress);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<RequestProgress> it = this.progressMap.values().iterator();
        while (it.hasNext()) {
            it.next().reportProgress();
        }
        reportBatchProgress();
    }

    public final long getBatchProgress() {
        return this.batchProgress;
    }

    public final long getMaxProgress() {
        return this.maxProgress;
    }

    @Override // com.facebook.RequestOutputStream
    public void setCurrentRequest(GraphRequest graphRequest) {
        this.currentRequestProgress = graphRequest != null ? this.progressMap.get(graphRequest) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) throws IOException {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        addProgress(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) throws IOException {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        addProgress(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        addProgress(1L);
    }
}
