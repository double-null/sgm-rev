package j8;

import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.image.ImageDecoderException;
import u7.q;

/* JADX INFO: compiled from: ImageDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public interface c extends a8.d<DecoderInputBuffer, d, ImageDecoderException> {

    /* JADX INFO: compiled from: ImageDecoder.java */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20679a = new j8.a.c();

        int a(q qVar);

        c b();
    }

    @Override // a8.d
    d a() throws ImageDecoderException;

    void f(DecoderInputBuffer decoderInputBuffer) throws ImageDecoderException;
}
