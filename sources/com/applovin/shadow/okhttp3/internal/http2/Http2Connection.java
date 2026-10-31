package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.concurrent.Task;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskQueue;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.facebook.share.internal.ShareConstants;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import id.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* JADX INFO: compiled from: Http2Connection.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public BufferedSink sink;
        public Socket socket;
        public BufferedSource source;
        private final TaskRunner taskRunner;

        public Builder(boolean z10, TaskRunner taskRunner) {
            t.f(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i10, Object obj) throws IOException {
            if ((i10 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i10 & 4) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket));
            }
            if ((i10 & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            t.u("connectionName");
            return null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            t.u("sink");
            return null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            t.u("socket");
            return null;
        }

        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            t.u(ShareConstants.FEED_SOURCE_PARAM);
            return null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            t.f(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int i10) {
            this.pingIntervalMillis = i10;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            t.f(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z10) {
            this.client = z10;
        }

        public final void setConnectionName$okhttp(String str) {
            t.f(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            t.f(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i10) {
            this.pingIntervalMillis = i10;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            t.f(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(BufferedSink bufferedSink) {
            t.f(bufferedSink, "<set-?>");
            this.sink = bufferedSink;
        }

        public final void setSocket$okhttp(Socket socket) {
            t.f(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(BufferedSource bufferedSource) {
            t.f(bufferedSource, "<set-?>");
            this.source = bufferedSource;
        }

        public final Builder socket(Socket socket) throws IOException {
            t.f(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String peerName) throws IOException {
            t.f(socket, "socket");
            t.f(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String peerName, BufferedSource source) throws IOException {
            t.f(socket, "socket");
            t.f(peerName, "peerName");
            t.f(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        public final Builder socket(Socket socket, String peerName, BufferedSource source, BufferedSink sink) throws IOException {
            String str;
            t.f(socket, "socket");
            t.f(peerName, "peerName");
            t.f(source, "source");
            t.f(sink, "sink");
            setSocket$okhttp(socket);
            if (this.client) {
                str = Util.okHttpName + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            setConnectionName$okhttp(str);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream stream) throws IOException {
                t.f(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        /* JADX INFO: compiled from: Http2Connection.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }
        }

        public void onSettings(Http2Connection connection, Settings settings) {
            t.f(connection, "connection");
            t.f(settings, "settings");
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    /* JADX INFO: loaded from: classes.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, a<g0> {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader reader) {
            t.f(reader, "reader");
            this.this$0 = http2Connection;
            this.reader = reader;
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i10, String origin, ByteString protocol, String host, int i11, long j10) {
            t.f(origin, "origin");
            t.f(protocol, "protocol");
            t.f(host, "host");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, com.applovin.shadow.okhttp3.internal.http2.Settings] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void applyAndAckSettings(boolean z10, Settings settings) {
            ?? r13;
            long initialWindowSize;
            int i10;
            Http2Stream[] http2StreamArr;
            t.f(settings, "settings");
            final h0 h0Var = new h0();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    Settings peerSettings = http2Connection.getPeerSettings();
                    if (z10) {
                        r13 = settings;
                    } else {
                        Settings settings2 = new Settings();
                        settings2.merge(peerSettings);
                        settings2.merge(settings);
                        r13 = settings2;
                    }
                    h0Var.f21514a = r13;
                    initialWindowSize = ((long) r13.getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                    http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                    http2Connection.setPeerSettings((Settings) h0Var.f21514a);
                    TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                    final String str = http2Connection.getConnectionName$okhttp() + " onSettings";
                    final boolean z11 = true;
                    taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            http2Connection.getListener$okhttp().onSettings(http2Connection, (Settings) h0Var.f21514a);
                            return -1L;
                        }
                    }, 0L);
                    g0 g0Var = g0.f27756a;
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) h0Var.f21514a);
                } catch (IOException e10) {
                    http2Connection.failConnection(e10);
                }
                g0 g0Var2 = g0.f27756a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        g0 g0Var3 = g0.f27756a;
                    }
                }
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z10, int i10, BufferedSource source, int i11) throws IOException {
            t.f(source, "source");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushDataLater$okhttp(i10, source, i11, z10);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i10);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i10, ErrorCode.PROTOCOL_ERROR);
                long j10 = i11;
                this.this$0.updateConnectionFlowControl$okhttp(j10);
                source.skip(j10);
                return;
            }
            stream.receiveData(source, i11);
            if (z10) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i10, ErrorCode errorCode, ByteString debugData) {
            int i11;
            Object[] array;
            t.f(errorCode, "errorCode");
            t.f(debugData, "debugData");
            debugData.size();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
                g0 g0Var = g0.f27756a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i10 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z10, int i10, int i11, List<Header> headerBlock) {
            t.f(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushHeadersLater$okhttp(i10, headerBlock, z10);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i10);
                if (stream != null) {
                    g0 g0Var = g0.f27756a;
                    stream.receiveHeaders(Util.toHeaders(headerBlock), z10);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (i10 <= http2Connection.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i10 % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i10, http2Connection, false, z10, Util.toHeaders(headerBlock));
                http2Connection.setLastGoodStreamId$okhttp(i10);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(i10), http2Stream);
                TaskQueue taskQueueNewQueue = http2Connection.taskRunner.newQueue();
                final String str = http2Connection.getConnectionName$okhttp() + '[' + i10 + "] onStream";
                final boolean z11 = true;
                taskQueueNewQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            http2Connection.getListener$okhttp().onStream(http2Stream);
                            return -1L;
                        } catch (IOException e10) {
                            Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName$okhttp(), 4, e10);
                            try {
                                http2Stream.close(ErrorCode.PROTOCOL_ERROR, e10);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() throws Throwable {
            invoke2();
            return g0.f27756a;
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z10, final int i10, final int i11) {
            if (!z10) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                final String str = this.this$0.getConnectionName$okhttp() + " ping";
                final Http2Connection http2Connection = this.this$0;
                final boolean z11 = true;
                taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        http2Connection.writePing(true, i10, i11);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (i10 == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            http2Connection2.awaitPongsReceived++;
                            t.d(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection2.notifyAll();
                        }
                        g0 g0Var = g0.f27756a;
                    } else {
                        http2Connection2.degradedPongsReceived++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i10, int i11, List<Header> requestHeaders) {
            t.f(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i11, requestHeaders);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i10, ErrorCode errorCode) {
            t.f(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushResetLater$okhttp(i10, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(i10);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z10, final Settings settings) {
            t.f(settings, "settings");
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String str = this.this$0.getConnectionName$okhttp() + " applyAndAckSettings";
            final boolean z11 = true;
            taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z10, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i10, long j10) {
            if (i10 == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j10;
                    t.d(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    g0 g0Var = g0.f27756a;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i10);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j10);
                    g0 g0Var2 = g0.f27756a;
                }
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                this.reader.readConnectionPreface(this);
                while (this.reader.nextFrame(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    try {
                        this.this$0.close$okhttp(errorCode, ErrorCode.CANCEL, null);
                    } catch (IOException e11) {
                        e10 = e11;
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        this.this$0.close$okhttp(errorCode3, errorCode3, e10);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(errorCode, errorCode2, e10);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
                errorCode = errorCode2;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e10);
                Util.closeQuietly(this.reader);
                throw th;
            }
            Util.closeQuietly(this.reader);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i10, int i11, int i12, boolean z10) {
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        t.f(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue taskQueueNewQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        Settings settings2 = DEFAULT_SETTINGS;
        this.peerSettings = settings2;
        this.writeBytesMaximum = settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            final String str = connectionName$okhttp + " ping";
            taskQueueNewQueue.schedule(new Task(str) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z10;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z10 = true;
                        } else {
                            this.intervalPingsSent++;
                            z10 = false;
                        }
                    }
                    if (z10) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z10, TaskRunner taskRunner, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z10, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            t.d(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i10;
        Object[] array;
        t.f(connectionCode, "connectionCode");
        t.f(streamCode, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                array = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            } else {
                array = null;
            }
            g0 g0Var = g0.f27756a;
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i10) {
        return this.streams.get(Integer.valueOf(i10));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j10) {
        if (this.isShutdown) {
            return false;
        }
        return this.degradedPongsReceived >= this.degradedPingsSent || j10 < this.degradedPongDeadlineNs;
    }

    public final Http2Stream newStream(List<Header> requestHeaders, boolean z10) throws IOException {
        t.f(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, z10);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int i10, BufferedSource source, final int i11, final boolean z10) throws IOException {
        t.f(source, "source");
        final Buffer buffer = new Buffer();
        long j10 = i11;
        source.require(j10);
        source.read(buffer, j10);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i10 + "] onData";
        final boolean z11 = true;
        taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.pushObserver.onData(i10, buffer, i11, z10);
                    if (zOnData) {
                        this.getWriter().rstStream(i10, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !z10) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(Integer.valueOf(i10));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i10, final List<Header> requestHeaders, final boolean z10) {
        t.f(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i10 + "] onHeaders";
        final boolean z11 = true;
        taskQueue.schedule(new Task(str, z11) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.pushObserver.onHeaders(i10, requestHeaders, z10);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(i10, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !z10) {
                    return -1L;
                }
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i10));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i10, final List<Header> requestHeaders) {
        t.f(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i10))) {
                writeSynResetLater$okhttp(i10, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i10));
            TaskQueue taskQueue = this.pushQueue;
            final String str = this.connectionName + '[' + i10 + "] onRequest";
            final boolean z10 = true;
            taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() {
                    if (!this.pushObserver.onRequest(i10, requestHeaders)) {
                        return -1L;
                    }
                    try {
                        this.getWriter().rstStream(i10, ErrorCode.CANCEL);
                        synchronized (this) {
                            this.currentPushRequests.remove(Integer.valueOf(i10));
                        }
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(final int i10, final ErrorCode errorCode) {
        t.f(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i10 + "] onReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.pushObserver.onReset(i10, errorCode);
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i10));
                    g0 g0Var = g0.f27756a;
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i10, List<Header> requestHeaders, boolean z10) throws IOException {
        t.f(requestHeaders, "requestHeaders");
        if (!this.client) {
            return newStream(i10, requestHeaders, z10);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i10) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(Integer.valueOf(i10));
        t.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2StreamRemove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j10 = this.degradedPongsReceived;
            long j11 = this.degradedPingsSent;
            if (j10 < j11) {
                return;
            }
            this.degradedPingsSent = j11 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) DEGRADED_PONG_TIMEOUT_NS);
            g0 g0Var = g0.f27756a;
            TaskQueue taskQueue = this.writerQueue;
            final String str = this.connectionName + " ping";
            final boolean z10 = true;
            taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i10) {
        this.lastGoodStreamId = i10;
    }

    public final void setNextStreamId$okhttp(int i10) {
        this.nextStreamId = i10;
    }

    public final void setPeerSettings(Settings settings) {
        t.f(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) throws IOException {
        t.f(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                g0 g0Var = g0.f27756a;
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode statusCode) throws IOException {
        t.f(statusCode, "statusCode");
        synchronized (this.writer) {
            f0 f0Var = new f0();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i10 = this.lastGoodStreamId;
                f0Var.f21511a = i10;
                g0 g0Var = g0.f27756a;
                this.writer.goAway(i10, statusCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j10) {
        long j11 = this.readBytesTotal + j10;
        this.readBytesTotal = j11;
        long j12 = j11 - this.readBytesAcknowledged;
        if (j12 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j12);
            this.readBytesAcknowledged += j12;
        }
    }

    public final void writeData(int i10, boolean z10, Buffer buffer, long j10) throws IOException {
        long j11;
        long j12;
        int iMin;
        long j13;
        if (j10 == 0) {
            this.writer.data(z10, i10, buffer, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j11 = this.writeBytesTotal;
                        j12 = this.writeBytesMaximum;
                        if (j11 >= j12) {
                            if (!this.streams.containsKey(Integer.valueOf(i10))) {
                                throw new IOException("stream closed");
                            }
                            t.d(this, "null cannot be cast to non-null type java.lang.Object");
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j10, j12 - j11), this.writer.maxDataLength());
                j13 = iMin;
                this.writeBytesTotal += j13;
                g0 g0Var = g0.f27756a;
            }
            j10 -= j13;
            this.writer.data(z10 && j10 == 0, i10, buffer, iMin);
        }
    }

    public final void writeHeaders$okhttp(int i10, boolean z10, List<Header> alternating) throws IOException {
        t.f(alternating, "alternating");
        this.writer.headers(z10, i10, alternating);
    }

    public final void writePing(boolean z10, int i10, int i11) {
        try {
            this.writer.ping(z10, i10, i11);
        } catch (IOException e10) {
            failConnection(e10);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i10, ErrorCode statusCode) throws IOException {
        t.f(statusCode, "statusCode");
        this.writer.rstStream(i10, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int i10, final ErrorCode errorCode) {
        t.f(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i10 + "] writeSynReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(i10, errorCode);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i10, final long j10) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i10 + "] windowUpdate";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(i10, j10);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    private final Http2Stream newStream(int i10, List<Header> list, boolean z10) throws IOException {
        int i11;
        Http2Stream http2Stream;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.writer) {
            synchronized (this) {
                if (this.nextStreamId > 1073741823) {
                    shutdown(ErrorCode.REFUSED_STREAM);
                }
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                i11 = this.nextStreamId;
                this.nextStreamId = i11 + 2;
                http2Stream = new Http2Stream(i11, this, z12, false, null);
                z11 = !z10 || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                if (http2Stream.isOpen()) {
                    this.streams.put(Integer.valueOf(i11), http2Stream);
                }
                g0 g0Var = g0.f27756a;
            }
            if (i10 == 0) {
                this.writer.headers(z12, i11, list);
            } else {
                if (!(true ^ this.client)) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.writer.pushPromise(i10, i11, list);
            }
        }
        if (z11) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void start(boolean z10) throws IOException {
        start$default(this, z10, null, 2, null);
    }

    public final void start(boolean z10, TaskRunner taskRunner) throws IOException {
        t.f(taskRunner, vgmm.xTiosOOJu);
        if (z10) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, initialWindowSize - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue.AnonymousClass1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
