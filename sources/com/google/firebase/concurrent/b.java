package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: CustomThreadFactory.java */
/* JADX INFO: loaded from: classes4.dex */
class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f11972e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f11973a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f11976d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f11974b = str;
        this.f11975c = i10;
        this.f11976d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f11975c);
        StrictMode.ThreadPolicy threadPolicy = this.f11976d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f11972e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f11970a.b(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f11974b, Long.valueOf(this.f11973a.getAndIncrement())));
        return threadNewThread;
    }
}
