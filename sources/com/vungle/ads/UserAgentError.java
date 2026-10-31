package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UserAgentError extends VungleError {
    public UserAgentError() {
        super(Sdk.SDKError.Reason.USER_AGENT_ERROR, "Fail to get user agent.", null);
    }
}
