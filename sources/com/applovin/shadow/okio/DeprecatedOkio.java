package com.applovin.shadow.okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedOkio.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    public final Sink appendingSink(File file) {
        kotlin.jvm.internal.t.f(file, "file");
        return Okio.appendingSink(file);
    }

    public final Sink blackhole() {
        return Okio.blackhole();
    }

    public final BufferedSink buffer(Sink sink) {
        kotlin.jvm.internal.t.f(sink, "sink");
        return Okio.buffer(sink);
    }

    public final Sink sink(File file) {
        kotlin.jvm.internal.t.f(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    public final Source source(File file) {
        kotlin.jvm.internal.t.f(file, "file");
        return Okio.source(file);
    }

    public final BufferedSource buffer(Source source) {
        kotlin.jvm.internal.t.f(source, "source");
        return Okio.buffer(source);
    }

    public final Sink sink(OutputStream outputStream) {
        kotlin.jvm.internal.t.f(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    public final Source source(InputStream inputStream) {
        kotlin.jvm.internal.t.f(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    public final Sink sink(java.nio.file.Path path, OpenOption... options) {
        kotlin.jvm.internal.t.f(path, "path");
        kotlin.jvm.internal.t.f(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    public final Source source(java.nio.file.Path path, OpenOption... options) {
        kotlin.jvm.internal.t.f(path, "path");
        kotlin.jvm.internal.t.f(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    public final Sink sink(Socket socket) {
        kotlin.jvm.internal.t.f(socket, "socket");
        return Okio.sink(socket);
    }

    public final Source source(Socket socket) {
        kotlin.jvm.internal.t.f(socket, "socket");
        return Okio.source(socket);
    }
}
