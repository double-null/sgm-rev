package af;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f398c;

    public w(c0 source) {
        kotlin.jvm.internal.t.f(source, "source");
        this.f396a = source;
        this.f397b = new e();
    }

    @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f398c) {
            return;
        }
        this.f398c = true;
        this.f396a.close();
        this.f397b.b();
    }

    @Override // af.g
    public boolean exhausted() {
        if (!this.f398c) {
            return this.f397b.exhausted() && this.f396a.read(this.f397b, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // af.g, af.f
    public e getBuffer() {
        return this.f397b;
    }

    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // af.g
    public InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f398c;
    }

    @Override // af.g
    public int l0(t options) throws EOFException {
        kotlin.jvm.internal.t.f(options, "options");
        if (!(!this.f398c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iC = bf.a.c(this.f397b, options, true);
            if (iC != -2) {
                if (iC == -1) {
                    break;
                }
                this.f397b.skip(options.g()[iC].F());
                return iC;
            }
        } while (this.f396a.read(this.f397b, 8192L) != -1);
        return -1;
    }

    @Override // af.g
    public long m(a0 sink) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        long j10 = 0;
        while (this.f396a.read(this.f397b, 8192L) != -1) {
            long jK = this.f397b.k();
            if (jK > 0) {
                j10 += jK;
                sink.y(this.f397b, jK);
            }
        }
        if (this.f397b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f397b.size();
        e eVar = this.f397b;
        sink.y(eVar, eVar.size());
        return size;
    }

    @Override // af.c0
    public long read(e sink, long j10) {
        kotlin.jvm.internal.t.f(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f398c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f397b.size() == 0 && this.f396a.read(this.f397b, 8192L) == -1) {
            return -1L;
        }
        return this.f397b.read(sink, Math.min(j10, this.f397b.size()));
    }

    @Override // af.g
    public byte readByte() throws EOFException {
        require(1L);
        return this.f397b.readByte();
    }

    @Override // af.g
    public byte[] readByteArray() throws IOException {
        this.f397b.V(this.f396a);
        return this.f397b.readByteArray();
    }

    @Override // af.g
    public h readByteString() throws IOException {
        this.f397b.V(this.f396a);
        return this.f397b.readByteString();
    }

    @Override // af.g
    public long readDecimalLong() throws EOFException {
        require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            byte bT = this.f397b.t(j10);
            if ((bT < 48 || bT > 57) && !(j10 == 0 && bT == 45)) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bT, rd.b.a(rd.b.a(16)));
                kotlin.jvm.internal.t.e(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return this.f397b.readDecimalLong();
    }

    @Override // af.g
    public long readHexadecimalUnsignedLong() throws EOFException {
        require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            byte bT = this.f397b.t(i10);
            if ((bT < 48 || bT > 57) && ((bT < 97 || bT > 102) && (bT < 65 || bT > 70))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bT, rd.b.a(rd.b.a(16)));
                kotlin.jvm.internal.t.e(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i10 = i11;
        }
        return this.f397b.readHexadecimalUnsignedLong();
    }

    @Override // af.g
    public int readInt() throws EOFException {
        require(4L);
        return this.f397b.readInt();
    }

    public int readIntLe() throws EOFException {
        require(4L);
        return this.f397b.readIntLe();
    }

    @Override // af.g
    public short readShort() throws EOFException {
        require(2L);
        return this.f397b.readShort();
    }

    public short readShortLe() throws EOFException {
        require(2L);
        return this.f397b.readShortLe();
    }

    @Override // af.g
    public String readString(Charset charset) throws IOException {
        kotlin.jvm.internal.t.f(charset, "charset");
        this.f397b.V(this.f396a);
        return this.f397b.readString(charset);
    }

    @Override // af.g
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public boolean request(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f398c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f397b.size() < j10) {
            if (this.f396a.read(this.f397b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // af.g
    public void require(long j10) throws EOFException {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    @Override // af.g
    public void skip(long j10) throws EOFException {
        if (!(!this.f398c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (this.f397b.size() == 0 && this.f396a.read(this.f397b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f397b.size());
            this.f397b.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // af.c0
    public d0 timeout() {
        return this.f396a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f396a + ')';
    }

    public long indexOf(byte b10, long j10, long j11) {
        if (!(!this.f398c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j10 && j10 <= j11)) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (j10 < j11) {
            long jIndexOf = this.f397b.indexOf(b10, j10, j11);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.f397b.size();
            if (size >= j11 || this.f396a.read(this.f397b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
        return -1L;
    }

    @Override // af.g
    public String readUtf8LineStrict(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return bf.a.b(this.f397b, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && request(j11) && this.f397b.t(j11 - 1) == 13 && request(1 + j11) && this.f397b.t(j11) == 10) {
            return bf.a.b(this.f397b, j11);
        }
        e eVar = new e();
        e eVar2 = this.f397b;
        eVar2.o(eVar, 0L, Math.min(32, eVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f397b.size(), j10) + " content=" + eVar.readByteString().p() + (char) 8230);
    }

    @Override // af.g
    public byte[] readByteArray(long j10) throws EOFException {
        require(j10);
        return this.f397b.readByteArray(j10);
    }

    @Override // af.g
    public h readByteString(long j10) throws EOFException {
        require(j10);
        return this.f397b.readByteString(j10);
    }

    /* JADX INFO: compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            w wVar = w.this;
            if (wVar.f398c) {
                throw new IOException("closed");
            }
            return (int) Math.min(wVar.f397b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            w.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            w wVar = w.this;
            if (wVar.f398c) {
                throw new IOException("closed");
            }
            if (wVar.f397b.size() == 0) {
                w wVar2 = w.this;
                if (wVar2.f396a.read(wVar2.f397b, 8192L) == -1) {
                    return -1;
                }
            }
            return w.this.f397b.readByte() & 255;
        }

        public String toString() {
            return w.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            kotlin.jvm.internal.t.f(data, "data");
            if (!w.this.f398c) {
                b.b(data.length, i10, i11);
                if (w.this.f397b.size() == 0) {
                    w wVar = w.this;
                    if (wVar.f396a.read(wVar.f397b, 8192L) == -1) {
                        return -1;
                    }
                }
                return w.this.f397b.read(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.t.f(sink, "sink");
        if (this.f397b.size() == 0 && this.f396a.read(this.f397b, 8192L) == -1) {
            return -1;
        }
        return this.f397b.read(sink);
    }
}
