package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zach;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ResultTransform<R extends Result, S extends Result> {
    public final PendingResult<S> createFailedResult(Status status) {
        return new zach(status);
    }

    public abstract PendingResult<S> onSuccess(R r10);

    public Status onFailure(Status status) {
        return status;
    }
}
