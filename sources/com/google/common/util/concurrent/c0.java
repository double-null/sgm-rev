package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: compiled from: LazyLogger.java */
/* JADX INFO: loaded from: classes4.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11807a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f11809c;

    c0(Class<?> cls) {
        this.f11808b = cls.getName();
    }

    Logger a() {
        Logger logger = this.f11809c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f11807a) {
            Logger logger2 = this.f11809c;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f11808b);
            this.f11809c = logger3;
            return logger3;
        }
    }
}
