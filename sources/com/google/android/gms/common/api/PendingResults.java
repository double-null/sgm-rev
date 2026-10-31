package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class PendingResults {
    private PendingResults() {
    }

    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    public static <R extends Result> PendingResult<R> immediateFailedResult(R r10, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        Preconditions.checkArgument(!r10.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zad zadVar = new zad(googleApiClient, r10);
        zadVar.setResult(r10);
        return zadVar;
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r10) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        zae zaeVar = new zae(null);
        zaeVar.setResult(r10);
        return new OptionalPendingResultImpl(zaeVar);
    }

    public static <R extends Result> PendingResult<R> canceledPendingResult(R r10) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        Preconditions.checkArgument(r10.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        zac zacVar = new zac(r10);
        zacVar.cancel();
        return zacVar;
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r10, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        zae zaeVar = new zae(googleApiClient);
        zaeVar.setResult(r10);
        return new OptionalPendingResultImpl(zaeVar);
    }

    public static PendingResult<Status> immediatePendingResult(Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    public static PendingResult<Status> immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
