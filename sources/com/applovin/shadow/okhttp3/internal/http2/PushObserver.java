package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okio.BufferedSource;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: PushObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    /* JADX INFO: compiled from: PushObserver.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: PushObserver.kt */
        private static final class PushObserverCancel implements PushObserver {
            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onData(int i10, BufferedSource source, int i11, boolean z10) throws IOException {
                t.f(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i10, List<Header> responseHeaders, boolean z10) {
                t.f(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i10, List<Header> requestHeaders) {
                t.f(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // com.applovin.shadow.okhttp3.internal.http2.PushObserver
            public void onReset(int i10, ErrorCode errorCode) {
                t.f(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i10, BufferedSource bufferedSource, int i11, boolean z10) throws IOException;

    boolean onHeaders(int i10, List<Header> list, boolean z10);

    boolean onRequest(int i10, List<Header> list);

    void onReset(int i10, ErrorCode errorCode);
}
