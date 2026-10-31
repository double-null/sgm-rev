package com.applovin.shadow.okhttp3;

import id.l;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Interceptor.kt */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i10, TimeUnit timeUnit);

        Chain withReadTimeout(int i10, TimeUnit timeUnit);

        Chain withWriteTimeout(int i10, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* JADX INFO: compiled from: Interceptor.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final l<? super Chain, Response> block) {
            t.f(block, "block");
            return new Interceptor() { // from class: com.applovin.shadow.okhttp3.Interceptor$Companion$invoke$1
                @Override // com.applovin.shadow.okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain it) {
                    t.f(it, "it");
                    return block.invoke(it);
                }
            };
        }
    }

    Response intercept(Chain chain) throws IOException;
}
