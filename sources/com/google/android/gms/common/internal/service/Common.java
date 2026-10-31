package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Common {
    public static final Api<Api.ApiOptions.NoOptions> API;
    public static final Api.ClientKey<zaj> CLIENT_KEY;
    public static final zag zaa;
    private static final Api.AbstractClientBuilder zab;

    static {
        Api.ClientKey<zaj> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zad zadVar = new zad();
        zab = zadVar;
        API = new Api<>("Common.API", zadVar, clientKey);
        zaa = new zag();
    }
}
