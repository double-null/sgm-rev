package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class O implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f12767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f12768b;

    public O(long j10, long j11) {
        this.f12767a = j10;
        this.f12768b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (ReflectionHelper.beginProxyCall(this.f12767a)) {
            try {
                ReflectionHelper.nativeProxyFinalize(this.f12768b);
            } finally {
                ReflectionHelper.endProxyCall();
            }
        }
    }
}
