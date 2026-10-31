package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zac<R extends Result> extends BasePendingResult<R> {
    private final Result zae;

    public zac(Result result) {
        super(Looper.getMainLooper());
        this.zae = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final R createFailedResult(Status status) {
        R r10 = (R) this.zae;
        if (status.getStatusCode() == r10.getStatus().getStatusCode()) {
            return r10;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
