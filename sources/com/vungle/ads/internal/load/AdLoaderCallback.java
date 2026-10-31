package com.vungle.ads.internal.load;

import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;

/* JADX INFO: compiled from: AdLoaderCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface AdLoaderCallback {
    void onFailure(VungleError vungleError);

    void onSuccess(AdPayload adPayload);
}
