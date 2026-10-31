package io.bidmachine;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: AdRequestExecutor.java */
/* JADX INFO: loaded from: classes4.dex */
class m extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile m f17909a;

    m(int i10) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static m b() {
        if (f17909a == null) {
            synchronized (m.class) {
                if (f17909a == null) {
                    f17909a = new m(Runtime.getRuntime().availableProcessors() * 2);
                }
            }
        }
        return f17909a;
    }
}
