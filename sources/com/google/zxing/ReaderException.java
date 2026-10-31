package com.google.zxing;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final boolean f12462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f12463b;

    static {
        f12462a = System.getProperty("surefire.test.class.path") != null;
        f12463b = new StackTraceElement[0];
    }

    ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
