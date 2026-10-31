package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: CustomTabPrefetchHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CustomTabPrefetchHelper extends androidx.browser.customtabs.e {
    private static androidx.browser.customtabs.c client;
    private static androidx.browser.customtabs.f session;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: compiled from: CustomTabPrefetchHelper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void prepareSession() {
            androidx.browser.customtabs.c cVar;
            CustomTabPrefetchHelper.lock.lock();
            if (CustomTabPrefetchHelper.session == null && (cVar = CustomTabPrefetchHelper.client) != null) {
                CustomTabPrefetchHelper.session = cVar.f(null);
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        public final androidx.browser.customtabs.f getPreparedSessionOnce() {
            CustomTabPrefetchHelper.lock.lock();
            androidx.browser.customtabs.f fVar = CustomTabPrefetchHelper.session;
            CustomTabPrefetchHelper.session = null;
            CustomTabPrefetchHelper.lock.unlock();
            return fVar;
        }

        public final void mayLaunchUrl(Uri url) {
            kotlin.jvm.internal.t.f(url, "url");
            prepareSession();
            CustomTabPrefetchHelper.lock.lock();
            androidx.browser.customtabs.f fVar = CustomTabPrefetchHelper.session;
            if (fVar != null) {
                fVar.g(url, null, null);
            }
            CustomTabPrefetchHelper.lock.unlock();
        }
    }

    public static final androidx.browser.customtabs.f getPreparedSessionOnce() {
        return Companion.getPreparedSessionOnce();
    }

    public static final void mayLaunchUrl(Uri uri) {
        Companion.mayLaunchUrl(uri);
    }

    @Override // androidx.browser.customtabs.e
    public void onCustomTabsServiceConnected(ComponentName name, androidx.browser.customtabs.c newClient) {
        kotlin.jvm.internal.t.f(name, "name");
        kotlin.jvm.internal.t.f(newClient, "newClient");
        newClient.h(0L);
        client = newClient;
        Companion.prepareSession();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        kotlin.jvm.internal.t.f(componentName, "componentName");
    }
}
