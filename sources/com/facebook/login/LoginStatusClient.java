package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;

/* JADX INFO: compiled from: LoginStatusClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginStatusClient extends PlatformServiceClient {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_TOAST_DURATION_MS = 5000;
    private final String graphApiVersion;
    private final String loggerRef;
    private final long toastDurationMs;

    /* JADX INFO: compiled from: LoginStatusClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final LoginStatusClient newInstance$facebook_common_release(Context context, String applicationId, String redirectURI, String loggerRef, String graphApiVersion, long j10, String str) {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(redirectURI, "redirectURI");
            kotlin.jvm.internal.t.f(loggerRef, "loggerRef");
            kotlin.jvm.internal.t.f(graphApiVersion, "graphApiVersion");
            return new LoginStatusClient(context, applicationId, redirectURI, loggerRef, graphApiVersion, j10, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginStatusClient(Context context, String applicationId, String redirectURI, String loggerRef, String graphApiVersion, long j10, String str) {
        super(context, NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REQUEST, NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REPLY, NativeProtocol.PROTOCOL_VERSION_20170411, applicationId, redirectURI, str);
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(applicationId, "applicationId");
        kotlin.jvm.internal.t.f(redirectURI, "redirectURI");
        kotlin.jvm.internal.t.f(loggerRef, "loggerRef");
        kotlin.jvm.internal.t.f(graphApiVersion, "graphApiVersion");
        this.loggerRef = loggerRef;
        this.graphApiVersion = graphApiVersion;
        this.toastDurationMs = j10;
    }

    @Override // com.facebook.internal.PlatformServiceClient
    protected void populateRequestBundle(Bundle data) {
        kotlin.jvm.internal.t.f(data, "data");
        data.putString(NativeProtocol.EXTRA_LOGGER_REF, this.loggerRef);
        data.putString(NativeProtocol.EXTRA_GRAPH_API_VERSION, this.graphApiVersion);
        data.putLong(NativeProtocol.EXTRA_TOAST_DURATION_MS, this.toastDurationMs);
    }
}
