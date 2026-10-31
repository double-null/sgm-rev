package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f5883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f5884f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f5885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p f5886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h5 f5887c = new h5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f5888d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(l.p());
    }

    public void a(l lVar) {
        this.f5885a = lVar;
        this.f5886b = lVar.Q();
        a("Attached SDK instance: " + lVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f5888d;
    }

    public boolean hasSubscriber(String str) {
        return this.f5887c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f5885a.u().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f5885a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f5884f) {
            if (f5883e == null) {
                f5883e = new AppLovinCommunicator();
            }
        }
        return f5883e;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f5887c.a(appLovinCommunicatorSubscriber, str)) {
                this.f5888d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f5887c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f5886b == null || !p.a()) {
            return;
        }
        this.f5886b.a("AppLovinCommunicator", str);
    }
}
