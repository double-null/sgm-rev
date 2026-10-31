package a8;

import io.bidmachine.media3.decoder.DecoderException;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes4.dex */
public interface d<I, O, E extends DecoderException> {
    O a() throws DecoderException;

    void c(I i10) throws DecoderException;

    void d(long j10);

    I e() throws DecoderException;

    void flush();

    void release();
}
