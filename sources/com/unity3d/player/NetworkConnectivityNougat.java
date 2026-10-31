package com.unity3d.player;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkConnectivityNougat extends NetworkConnectivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConnectivityManager.NetworkCallback f12766c;

    public NetworkConnectivityNougat(Context context) {
        super(context);
        this.f12765b = 0;
        A a10 = new A(this);
        this.f12766c = a10;
        if (this.f12764a == null) {
            return;
        }
        this.f12765b = super.b();
        this.f12764a.registerDefaultNetworkCallback(a10);
    }

    @Override // com.unity3d.player.NetworkConnectivity
    public final void a() {
        ConnectivityManager connectivityManager = this.f12764a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.f12766c);
    }

    @Override // com.unity3d.player.NetworkConnectivity
    public final int b() {
        return this.f12765b;
    }
}
