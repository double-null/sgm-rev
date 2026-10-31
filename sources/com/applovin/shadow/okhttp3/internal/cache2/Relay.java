package com.applovin.shadow.okhttp3.internal.cache2;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: Relay.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private Source upstream;
    private final Buffer upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* JADX INFO: compiled from: Relay.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Relay edit(File file, Source upstream, ByteString metadata, long j10) throws IOException {
            t.f(file, "file");
            t.f(upstream, "upstream");
            t.f(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, j10, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            t.f(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            t.e(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            Buffer buffer = new Buffer();
            fileOperator.read(0L, buffer, Relay.FILE_HEADER_SIZE);
            ByteString byteString = Relay.PREFIX_CLEAN;
            if (!t.a(buffer.readByteString(byteString.size()), byteString)) {
                throw new IOException("unreadable cache file");
            }
            long j10 = buffer.readLong();
            long j11 = buffer.readLong();
            Buffer buffer2 = new Buffer();
            fileOperator.read(j10 + Relay.FILE_HEADER_SIZE, buffer2, j11);
            return new Relay(randomAccessFile, null, j10, buffer2.readByteString(), 0L, null);
        }
    }

    /* JADX INFO: compiled from: Relay.kt */
    public final class RelaySource implements Source {
        private FileOperator fileOperator;
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            t.c(file);
            FileChannel channel = file.getChannel();
            t.e(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
                g0 g0Var = g0.f27756a;
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        @Override // com.applovin.shadow.okio.Source
        public long read(Buffer sink, long j10) throws IOException {
            t.f(sink, "sink");
            char c10 = 1;
            if (!(this.fileOperator != null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    if (this.sourcePos != relay.getUpstreamPos()) {
                        long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                        if (this.sourcePos < upstreamPos) {
                            c10 = 2;
                            break;
                        }
                        long jMin = Math.min(j10, relay.getUpstreamPos() - this.sourcePos);
                        relay.getBuffer().copyTo(sink, this.sourcePos - upstreamPos, jMin);
                        this.sourcePos += jMin;
                        return jMin;
                    }
                    if (!relay.getComplete()) {
                        if (relay.getUpstreamReader() == null) {
                            relay.setUpstreamReader(Thread.currentThread());
                            break;
                        }
                        this.timeout.waitUntilNotified(relay);
                    } else {
                        return -1L;
                    }
                }
                if (c10 == 2) {
                    long jMin2 = Math.min(j10, Relay.this.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    t.c(fileOperator);
                    fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, sink, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    Source upstream = Relay.this.getUpstream();
                    t.c(upstream);
                    long j11 = upstream.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (j11 == -1) {
                        Relay relay2 = Relay.this;
                        relay2.commit(relay2.getUpstreamPos());
                        Relay relay3 = Relay.this;
                        synchronized (relay3) {
                            relay3.setUpstreamReader(null);
                            t.d(relay3, "null cannot be cast to non-null type java.lang.Object");
                            relay3.notifyAll();
                            g0 g0Var = g0.f27756a;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j11, j10);
                    Relay.this.getUpstreamBuffer().copyTo(sink, 0L, jMin3);
                    this.sourcePos += jMin3;
                    FileOperator fileOperator2 = this.fileOperator;
                    t.c(fileOperator2);
                    fileOperator2.write(Relay.this.getUpstreamPos() + Relay.FILE_HEADER_SIZE, Relay.this.getUpstreamBuffer().m141clone(), j11);
                    Relay relay4 = Relay.this;
                    synchronized (relay4) {
                        relay4.getBuffer().write(relay4.getUpstreamBuffer(), j11);
                        if (relay4.getBuffer().size() > relay4.getBufferMaxSize()) {
                            relay4.getBuffer().skip(relay4.getBuffer().size() - relay4.getBufferMaxSize());
                        }
                        relay4.setUpstreamPos(relay4.getUpstreamPos() + j11);
                        g0 g0Var2 = g0.f27756a;
                    }
                    Relay relay5 = Relay.this;
                    synchronized (relay5) {
                        relay5.setUpstreamReader(null);
                        t.d(relay5, "null cannot be cast to non-null type java.lang.Object");
                        relay5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th) {
                    Relay relay6 = Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        t.d(relay6, "null cannot be cast to non-null type java.lang.Object");
                        relay6.notifyAll();
                        g0 g0Var3 = g0.f27756a;
                        throw th;
                    }
                }
            }
        }

        @Override // com.applovin.shadow.okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    static {
        ByteString.Companion companion = ByteString.Companion;
        PREFIX_CLEAN = companion.encodeUtf8("OkHttp cache v1\n");
        PREFIX_DIRTY = companion.encodeUtf8("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j10, ByteString byteString, long j11, k kVar) {
        this(randomAccessFile, source, j10, byteString, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(ByteString byteString, long j10, long j11) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.writeLong(j10);
        buffer.writeLong(j11);
        if (!(buffer.size() == FILE_HEADER_SIZE)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.file;
        t.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        t.e(channel, "file!!.channel");
        new FileOperator(channel).write(0L, buffer, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long j10) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        t.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        t.e(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + j10, buffer, this.metadata.size());
    }

    public final void commit(long j10) throws IOException {
        writeMetadata(j10);
        RandomAccessFile randomAccessFile = this.file;
        t.c(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j10, this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        t.c(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            g0 g0Var = g0.f27756a;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    public final Buffer getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final Source getUpstream() {
        return this.upstream;
    }

    public final Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final ByteString metadata() {
        return this.metadata;
    }

    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z10) {
        this.complete = z10;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i10) {
        this.sourceCount = i10;
    }

    public final void setUpstream(Source source) {
        this.upstream = source;
    }

    public final void setUpstreamPos(long j10) {
        this.upstreamPos = j10;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j10, ByteString byteString, long j11) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j10;
        this.metadata = byteString;
        this.bufferMaxSize = j11;
        this.upstreamBuffer = new Buffer();
        this.complete = this.upstream == null;
        this.buffer = new Buffer();
    }
}
