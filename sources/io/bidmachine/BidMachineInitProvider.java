package io.bidmachine;

import android.content.Context;

/* JADX INFO: compiled from: BidMachineInitProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BidMachineInitProvider extends o7.a {
    private final p7.c startupWatcherThread;

    public BidMachineInitProvider() {
        p7.c cVar = new p7.c(System.currentTimeMillis(), null, null, null, 14, null);
        this.startupWatcherThread = cVar;
        cVar.start();
    }

    @Override // o7.a, android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            this.startupWatcherThread.a(context);
        }
        this.startupWatcherThread.g();
        boolean zOnCreate = super.onCreate();
        this.startupWatcherThread.f();
        return zOnCreate;
    }

    @Override // o7.a
    public void preInitialize(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        b2.M(context);
    }
}
