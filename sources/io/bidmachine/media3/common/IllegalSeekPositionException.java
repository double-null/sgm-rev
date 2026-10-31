package io.bidmachine.media3.common;

import u7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class IllegalSeekPositionException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f17915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17917c;

    public IllegalSeekPositionException(d0 d0Var, int i10, long j10) {
        this.f17915a = d0Var;
        this.f17916b = i10;
        this.f17917c = j10;
    }
}
