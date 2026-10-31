package io.bidmachine.media3.exoplayer.drm;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: ErrorStateDrmSession.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DrmSession.DrmSessionException f18583a;

    public l(DrmSession.DrmSessionException drmSessionException) {
        this.f18583a = (DrmSession.DrmSessionException) x7.a.e(drmSessionException);
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        return u7.f.f26059a;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public boolean b() {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public a8.b d() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public Map<String, String> e() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public DrmSession.DrmSessionException getError() {
        return this.f18583a;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public boolean h(String str) {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public int k() {
        return 1;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public void f(h.a aVar) {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.DrmSession
    public void g(h.a aVar) {
    }
}
