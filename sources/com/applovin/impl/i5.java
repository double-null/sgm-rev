package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class i5 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f6811c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6809a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f6812d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f6813e = new Object();

    i5(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f6810b = str;
        this.f6811c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f6811c.get();
    }

    public String b() {
        return this.f6810b;
    }

    public boolean c() {
        return this.f6809a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f6811c.get();
        i5 i5Var = (i5) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) i5Var.f6811c.get();
        if (b().equals(i5Var.b())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f6810b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f6811c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z10;
        if (a() == null) {
            com.applovin.impl.sdk.p.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f6813e) {
            if (this.f6812d.contains(communicatorMessageImpl.getUniqueId())) {
                z10 = false;
            } else {
                this.f6812d.add(communicatorMessageImpl.getUniqueId());
                z10 = true;
            }
        }
        if (z10) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z10) {
        this.f6809a = z10;
    }
}
