package com.facebook.appevents.gps.topics;

import id.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GpsTopicsManager.kt */
/* JADX INFO: loaded from: classes.dex */
final class GpsTopicsManager$executor$2 extends u implements a<ExecutorService> {
    public static final GpsTopicsManager$executor$2 INSTANCE = new GpsTopicsManager$executor$2();

    GpsTopicsManager$executor$2() {
        super(0);
    }

    @Override // id.a
    public final ExecutorService invoke() {
        return Executors.newCachedThreadPool();
    }
}
