package com.applovin.shadow.okio;

import java.io.Closeable;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Okio__OkioKt {
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSource buffer(Source source) {
        kotlin.jvm.internal.t.f(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final <T extends Closeable, R> R use(T t10, id.l<? super T, ? extends R> block) throws Throwable {
        R rInvoke;
        kotlin.jvm.internal.t.f(block, "block");
        Throwable th = null;
        try {
            rInvoke = block.invoke(t10);
            kotlin.jvm.internal.r.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.r.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.r.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th4) {
                    wc.f.a(th3, th4);
                }
            }
            kotlin.jvm.internal.r.a(1);
            th = th3;
            rInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.t.c(rInvoke);
        return rInvoke;
    }

    public static final BufferedSink buffer(Sink sink) {
        kotlin.jvm.internal.t.f(sink, "<this>");
        return new RealBufferedSink(sink);
    }
}
