package io.bidmachine;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface HeaderBiddingCollectParamsCallback {
    void onCollectFail(oc.a aVar);

    void onCollectFinished(Map<String, String> map);
}
