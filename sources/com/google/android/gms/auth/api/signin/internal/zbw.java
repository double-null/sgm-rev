package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import androidx.loader.content.b;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zbw implements a.InterfaceC0053a {
    final /* synthetic */ SignInHubActivity zba;

    /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0053a
    public final b onCreateLoader(int i10, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.a.InterfaceC0053a
    public final /* bridge */ /* synthetic */ void onLoadFinished(b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
        this.zba.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0053a
    public final void onLoaderReset(b bVar) {
    }
}
