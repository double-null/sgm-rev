package io.bidmachine.util.network;

import java.io.IOException;

/* JADX INFO: compiled from: IllegalResponseException.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class IllegalResponseException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20453a;

    public IllegalResponseException(int i10) {
        super("Server returned " + i10 + " code");
        this.f20453a = i10;
    }
}
