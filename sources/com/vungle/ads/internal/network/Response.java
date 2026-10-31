package com.vungle.ads.internal.network;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.b0;
import me.c0;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Response<T> {
    public static final Companion Companion = new Companion(null);
    private final T body;
    private final c0 errorBody;
    private final b0 rawResponse;

    /* JADX INFO: compiled from: Response.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final <T> Response<T> error(c0 c0Var, b0 rawResponse) {
            t.f(rawResponse, "rawResponse");
            if (!(!rawResponse.t())) {
                throw new IllegalArgumentException("rawResponse should not be successful response".toString());
            }
            k kVar = null;
            return new Response<>(rawResponse, kVar, c0Var, kVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> Response<T> success(T t10, b0 rawResponse) {
            t.f(rawResponse, "rawResponse");
            if (rawResponse.t()) {
                return new Response<>(rawResponse, t10, null, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("rawResponse must be successful response".toString());
        }
    }

    public /* synthetic */ Response(b0 b0Var, Object obj, c0 c0Var, k kVar) {
        this(b0Var, obj, c0Var);
    }

    public final T body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.h();
    }

    public final c0 errorBody() {
        return this.errorBody;
    }

    public final me.t headers() {
        return this.rawResponse.s();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.t();
    }

    public final String message() {
        return this.rawResponse.u();
    }

    public final b0 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private Response(b0 b0Var, T t10, c0 c0Var) {
        this.rawResponse = b0Var;
        this.body = t10;
        this.errorBody = c0Var;
    }
}
