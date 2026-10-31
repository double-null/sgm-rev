package de;

import zd.e0;
import zd.h0;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f13541a = h0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f13542b = new e0("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e0 f13543c = new e0("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e0 f13544d = new e0("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e0 f13545e = new e0("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f13546f = h0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h(long j10, k kVar) {
        return new k(j10, kVar, 0);
    }
}
