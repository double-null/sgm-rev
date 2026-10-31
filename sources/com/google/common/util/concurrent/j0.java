package com.google.common.util.concurrent;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes4.dex */
final class j0 {
    static boolean a(Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }

    static void b(Throwable th) {
        com.google.common.base.p.l(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
