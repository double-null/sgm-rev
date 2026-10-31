package io.bidmachine.util.network;

/* JADX INFO: compiled from: RequestInDestroyedStateException.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RequestInDestroyedStateException extends IllegalStateException {
    public RequestInDestroyedStateException() {
        super("Request has already been destroyed");
    }
}
