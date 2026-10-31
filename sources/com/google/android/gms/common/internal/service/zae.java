package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zae extends zah {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zae(zag zagVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        Objects.requireNonNull(zagVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zap) ((zaj) anyClient).getService()).zae(new zaf(this));
    }
}
