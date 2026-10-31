package af;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: BufferedSink.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface f extends a0, WritableByteChannel {
    f D(h hVar) throws IOException;

    long V(c0 c0Var) throws IOException;

    f emit() throws IOException;

    f emitCompleteSegments() throws IOException;

    @Override // af.a0, java.io.Flushable
    void flush() throws IOException;

    e getBuffer();

    f write(byte[] bArr) throws IOException;

    f write(byte[] bArr, int i10, int i11) throws IOException;

    f writeByte(int i10) throws IOException;

    f writeDecimalLong(long j10) throws IOException;

    f writeHexadecimalUnsignedLong(long j10) throws IOException;

    f writeInt(int i10) throws IOException;

    f writeShort(int i10) throws IOException;

    f writeUtf8(String str) throws IOException;
}
