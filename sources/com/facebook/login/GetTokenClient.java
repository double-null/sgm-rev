package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;

/* JADX INFO: compiled from: GetTokenClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetTokenClient extends PlatformServiceClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenClient(Context context, LoginClient.Request request) {
        super(context, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY, NativeProtocol.PROTOCOL_VERSION_20121101, request.getApplicationId(), String.valueOf(request.getRedirectURI()), request.getNonce());
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(request, "request");
    }

    @Override // com.facebook.internal.PlatformServiceClient
    protected void populateRequestBundle(Bundle data) {
        kotlin.jvm.internal.t.f(data, "data");
    }
}
