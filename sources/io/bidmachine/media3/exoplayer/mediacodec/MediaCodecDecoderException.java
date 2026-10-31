package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import io.bidmachine.media3.decoder.DecoderException;
import x7.l0;

/* JADX INFO: loaded from: classes4.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f19175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19177c;

    public MediaCodecDecoderException(Throwable th, j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(jVar == null ? null : jVar.f19288a);
        super(sb2.toString(), th);
        this.f19175a = jVar;
        String diagnosticInfo = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.f19176b = diagnosticInfo;
        this.f19177c = l0.f28136a >= 23 ? b(th) : l0.c0(diagnosticInfo);
    }

    private static int b(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
