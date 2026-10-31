package com.vungle.ads.internal.network;

import af.g;
import af.q;
import com.vungle.ads.internal.network.converters.Converter;
import com.vungle.ads.internal.util.Logger;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.b0;
import me.c0;
import me.e;
import me.f;
import me.w;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: OkHttpCall.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class OkHttpCall<T> implements Call<T> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;
    private final e rawCall;
    private final Converter<c0, T> responseConverter;

    /* JADX INFO: compiled from: OkHttpCall.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(Throwable th) throws Throwable {
            if ((th instanceof ThreadDeath) || (th instanceof LinkageError)) {
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.kt */
    public static final class ExceptionCatchingResponseBody extends c0 {
        private final c0 delegate;
        private final g delegateSource;
        private IOException thrownException;

        public ExceptionCatchingResponseBody(c0 delegate) {
            t.f(delegate, "delegate");
            this.delegate = delegate;
            this.delegateSource = q.d(new af.k(delegate.source()) { // from class: com.vungle.ads.internal.network.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // af.k, af.c0
                public long read(af.e sink, long j10) throws IOException {
                    t.f(sink, "sink");
                    try {
                        return super.read(sink, j10);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.setThrownException(e10);
                        throw e10;
                    }
                }
            });
        }

        @Override // me.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // me.c0
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // me.c0
        public w contentType() {
            return this.delegate.contentType();
        }

        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // me.c0
        public g source() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.kt */
    public static final class NoContentResponseBody extends c0 {
        private final long contentLength;
        private final w contentType;

        public NoContentResponseBody(w wVar, long j10) {
            this.contentType = wVar;
            this.contentLength = j10;
        }

        @Override // me.c0
        public long contentLength() {
            return this.contentLength;
        }

        @Override // me.c0
        public w contentType() {
            return this.contentType;
        }

        @Override // me.c0
        public g source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(e rawCall, Converter<c0, T> responseConverter) {
        t.f(rawCall, "rawCall");
        t.f(responseConverter, "responseConverter");
        this.rawCall = rawCall;
        this.responseConverter = responseConverter;
    }

    private final c0 buffer(c0 c0Var) throws IOException {
        af.e eVar = new af.e();
        c0Var.source().m(eVar);
        return c0.Companion.a(eVar, c0Var.contentType(), c0Var.contentLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Response<T> parseResponse(b0 b0Var) throws IOException {
        c0 c0VarB = b0Var.b();
        if (c0VarB == null) {
            return null;
        }
        b0 b0VarC = b0Var.z().b(new NoContentResponseBody(c0VarB.contentType(), c0VarB.contentLength())).c();
        int iH = b0VarC.h();
        if (iH < 200 || iH >= 300) {
            try {
                Response<T> responseError = Response.Companion.error(buffer(c0VarB), b0VarC);
                fd.b.a(c0VarB, null);
                return responseError;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(c0VarB, th);
                    throw th2;
                }
            }
        }
        if (iH == 204 || iH == 205) {
            c0VarB.close();
            return Response.Companion.success(null, b0VarC);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(c0VarB);
        try {
            return Response.Companion.success(this.responseConverter.convert(exceptionCatchingResponseBody), b0VarC);
        } catch (Throwable th3) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw th3;
        }
    }

    @Override // com.vungle.ads.internal.network.Call
    public void cancel() {
        e eVar;
        this.canceled = true;
        synchronized (this) {
            eVar = this.rawCall;
            g0 g0Var = g0.f27756a;
        }
        eVar.cancel();
    }

    @Override // com.vungle.ads.internal.network.Call
    public void enqueue(final Callback<T> callback) {
        e eVar;
        t.f(callback, "callback");
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            eVar = this.rawCall;
            g0 g0Var = g0.f27756a;
        }
        if (this.canceled) {
            eVar.cancel();
        }
        eVar.f(new f(this) { // from class: com.vungle.ads.internal.network.OkHttpCall.enqueue.2
            final /* synthetic */ OkHttpCall<T> this$0;

            {
                this.this$0 = this;
            }

            private final void callFailure(Throwable th) throws Throwable {
                try {
                    callback.onFailure(this.this$0, th);
                } catch (Throwable th2) {
                    OkHttpCall.Companion.throwIfFatal(th2);
                    Logger.Companion.e(OkHttpCall.TAG, "Cannot pass failure to callback", th2);
                }
            }

            @Override // me.f
            public void onFailure(e call, IOException e10) throws Throwable {
                t.f(call, "call");
                t.f(e10, "e");
                callFailure(e10);
            }

            @Override // me.f
            public void onResponse(e call, b0 response) throws Throwable {
                t.f(call, "call");
                t.f(response, "response");
                try {
                    try {
                        callback.onResponse(this.this$0, this.this$0.parseResponse(response));
                    } catch (Throwable th) {
                        OkHttpCall.Companion.throwIfFatal(th);
                        Logger.Companion.e(OkHttpCall.TAG, "Cannot pass response to callback", th);
                    }
                } catch (Throwable th2) {
                    Logger.Companion.e(OkHttpCall.TAG, "[enqueue] Failed to parse response: " + th2.getLocalizedMessage());
                    OkHttpCall.Companion.throwIfFatal(th2);
                    callFailure(th2);
                }
            }
        });
    }

    @Override // com.vungle.ads.internal.network.Call
    public Response<T> execute() {
        e eVar;
        Object objC;
        synchronized (this) {
            eVar = this.rawCall;
            g0 g0Var = g0.f27756a;
        }
        if (this.canceled) {
            eVar.cancel();
        }
        try {
            r.a aVar = r.f27774b;
            objC = r.c(parseResponse(eVar.execute()));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "[execute] Failed to parse response:  " + thG.getLocalizedMessage());
        }
        if (r.k(objC)) {
            objC = null;
        }
        return (Response) objC;
    }

    @Override // com.vungle.ads.internal.network.Call
    public boolean isCanceled() {
        boolean zIsCanceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            zIsCanceled = this.rawCall.isCanceled();
        }
        return zIsCanceled;
    }
}
