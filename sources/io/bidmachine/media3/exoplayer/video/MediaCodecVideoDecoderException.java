package io.bidmachine.media3.exoplayer.video;

import android.view.Surface;
import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecDecoderException;

/* JADX INFO: loaded from: classes4.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19833e;

    public MediaCodecVideoDecoderException(Throwable th, io.bidmachine.media3.exoplayer.mediacodec.j jVar, Surface surface) {
        super(th, jVar);
        this.f19832d = System.identityHashCode(surface);
        this.f19833e = surface == null || surface.isValid();
    }
}
