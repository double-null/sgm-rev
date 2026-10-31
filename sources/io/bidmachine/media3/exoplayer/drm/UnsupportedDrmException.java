package io.bidmachine.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes4.dex */
public final class UnsupportedDrmException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18563a;

    public UnsupportedDrmException(int i10) {
        this.f18563a = i10;
    }

    public UnsupportedDrmException(int i10, Exception exc) {
        super(exc);
        this.f18563a = i10;
    }
}
