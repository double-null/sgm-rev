package com.iab.omid.library.applovin.messagelistener;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface b {
    String getListenerName();

    void onMessageReceived(String str, JSONObject jSONObject);

    void onWebMessageListenerUnsupported();
}
