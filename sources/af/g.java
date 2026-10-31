package af;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: BufferedSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface g extends c0, ReadableByteChannel {
    boolean exhausted() throws IOException;

    e getBuffer();

    InputStream inputStream();

    int l0(t tVar) throws IOException;

    long m(a0 a0Var) throws IOException;

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    byte[] readByteArray(long j10) throws IOException;

    h readByteString() throws IOException;

    h readByteString(long j10) throws IOException;

    long readDecimalLong() throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    String readString(Charset charset) throws IOException;

    String readUtf8LineStrict() throws IOException;

    String readUtf8LineStrict(long j10) throws IOException;

    void require(long j10) throws IOException;

    void skip(long j10) throws IOException;
}
