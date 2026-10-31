package af;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f395c;

    public v(a0 sink) {
        kotlin.jvm.internal.t.f(sink, "sink");
        this.f393a = sink;
        this.f394b = new e();
    }

    @Override // af.f
    public f D(h byteString) {
        kotlin.jvm.internal.t.f(byteString, "byteString");
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f394b.D(byteString);
        return emitCompleteSegments();
    }

    @Override // af.f
    public long V(c0 source) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this.f394b, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            emitCompleteSegments();
        }
    }

    public f b(int i10) {
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f394b.U(i10);
        return emitCompleteSegments();
    }

    @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f395c) {
            return;
        }
        if (this.f394b.size() > 0) {
            a0 a0Var = this.f393a;
            e eVar = this.f394b;
            a0Var.y(eVar, eVar.size());
        }
        th = null;
        try {
            this.f393a.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f395c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // af.f
    public f emit() throws IOException {
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = this.f394b.size();
        if (size > 0) {
            this.f393a.y(this.f394b, size);
        }
        return this;
    }

    @Override // af.f
    public f emitCompleteSegments() throws IOException {
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jK = this.f394b.k();
        if (jK > 0) {
            this.f393a.y(this.f394b, jK);
        }
        return this;
    }

    @Override // af.f, af.a0, java.io.Flushable
    public void flush() throws IOException {
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f394b.size() > 0) {
            a0 a0Var = this.f393a;
            e eVar = this.f394b;
            a0Var.y(eVar, eVar.size());
        }
        this.f393a.flush();
    }

    @Override // af.f
    public e getBuffer() {
        return this.f394b;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f395c;
    }

    @Override // af.a0
    public d0 timeout() {
        return this.f393a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f393a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f394b.write(source);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // af.f
    public f writeByte(int i10) {
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f394b.writeByte(i10);
        return emitCompleteSegments();
    }

    @Override // af.f
    public f writeDecimalLong(long j10) {
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f394b.writeDecimalLong(j10);
        return emitCompleteSegments();
    }

    @Override // af.f
    public f writeHexadecimalUnsignedLong(long j10) {
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f394b.writeHexadecimalUnsignedLong(j10);
        return emitCompleteSegments();
    }

    @Override // af.f
    public f writeInt(int i10) {
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f394b.writeInt(i10);
        return emitCompleteSegments();
    }

    @Override // af.f
    public f writeShort(int i10) {
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f394b.writeShort(i10);
        return emitCompleteSegments();
    }

    @Override // af.f
    public f writeUtf8(String string) {
        kotlin.jvm.internal.t.f(string, "string");
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f394b.writeUtf8(string);
        return emitCompleteSegments();
    }

    @Override // af.a0
    public void y(e source, long j10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        if (!(!this.f395c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f394b.y(source, j10);
        emitCompleteSegments();
    }

    @Override // af.f
    public f write(byte[] source) {
        kotlin.jvm.internal.t.f(source, "source");
        if (!this.f395c) {
            this.f394b.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // af.f
    public f write(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.t.f(source, "source");
        if (!this.f395c) {
            this.f394b.write(source, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }
}
