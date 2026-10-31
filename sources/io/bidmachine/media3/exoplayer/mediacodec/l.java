package io.bidmachine.media3.exoplayer.mediacodec;

import io.bidmachine.media3.exoplayer.mediacodec.MediaCodecUtil;
import io.bidmachine.media3.exoplayer.mediacodec.l;
import java.util.List;

/* JADX INFO: compiled from: MediaCodecSelector.java */
/* JADX INFO: loaded from: classes4.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f19301a = new l() { // from class: k8.e
        @Override // io.bidmachine.media3.exoplayer.mediacodec.l
        public final List b(String str, boolean z10, boolean z11) {
            return MediaCodecUtil.k(str, z10, z11);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f19302b = new l() { // from class: k8.f
        @Override // io.bidmachine.media3.exoplayer.mediacodec.l
        public final List b(String str, boolean z10, boolean z11) {
            return l.c(str, z10, z11);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List c(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.o(f19301a.b(str, z10, z11));
    }

    List<j> b(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException;
}
