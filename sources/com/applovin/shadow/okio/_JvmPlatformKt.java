package com.applovin.shadow.okio;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: -JvmPlatform.kt */
/* JADX INFO: loaded from: classes.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        byte[] bytes = str.getBytes(rd.d.f24999b);
        kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        return new String(bArr, rd.d.f24999b);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, id.a<? extends T> action) {
        kotlin.jvm.internal.t.f(reentrantLock, "<this>");
        kotlin.jvm.internal.t.f(action, "action");
        reentrantLock.lock();
        try {
            return action.invoke();
        } finally {
            kotlin.jvm.internal.r.b(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.r.a(1);
        }
    }
}
