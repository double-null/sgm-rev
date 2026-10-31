package io.bidmachine.media3.common;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoFrameProcessingException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17932a;

    public VideoFrameProcessingException(Throwable th, long j10) {
        super(th);
        this.f17932a = j10;
    }

    public static VideoFrameProcessingException b(Exception exc) {
        return c(exc, -9223372036854775807L);
    }

    public static VideoFrameProcessingException c(Exception exc, long j10) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j10);
    }
}
