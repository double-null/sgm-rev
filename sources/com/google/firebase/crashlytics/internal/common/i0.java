package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* JADX INFO: loaded from: classes4.dex */
class i0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f12153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SettingsProvider f12154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f12155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CrashlyticsNativeComponent f12156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f12157e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: CrashlyticsUncaughtExceptionHandler.java */
    interface a {
        void a(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public i0(a aVar, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.f12153a = aVar;
        this.f12154b = settingsProvider;
        this.f12155c = uncaughtExceptionHandler;
        this.f12156d = crashlyticsNativeComponent;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            z2.f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            z2.f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f12156d.hasCrashDataForCurrentSession()) {
            return true;
        }
        z2.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f12157e.get();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f12157e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f12153a.a(this.f12154b, thread, th);
                } else {
                    z2.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f12155c != null) {
                    z2.f.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f12155c.uncaughtException(thread, th);
                } else {
                    z2.f.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e10) {
                z2.f.f().e("An error occurred in the uncaught exception handler", e10);
                if (this.f12155c != null) {
                    z2.f.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f12155c.uncaughtException(thread, th);
                }
            }
            this.f12157e.set(false);
        } catch (Throwable th2) {
            if (this.f12155c != null) {
                z2.f.f().b("Completed exception processing. Invoking default exception handler.");
                this.f12155c.uncaughtException(thread, th);
            } else {
                z2.f.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f12157e.set(false);
            throw th2;
        }
    }
}
