package io.bidmachine.media3.exoplayer.drm;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18558a;

        public DrmSessionException(Throwable th, int i10) {
            super(th);
            this.f18558a = i10;
        }
    }

    static void c(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.g(null);
        }
        if (drmSession != null) {
            drmSession.f(null);
        }
    }

    UUID a();

    default boolean b() {
        return false;
    }

    a8.b d();

    Map<String, String> e();

    void f(h.a aVar);

    void g(h.a aVar);

    DrmSessionException getError();

    boolean h(String str);

    int k();
}
