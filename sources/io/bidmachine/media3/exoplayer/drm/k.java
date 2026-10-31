package io.bidmachine.media3.exoplayer.drm;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DummyExoMediaDrm.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements m {
    @Override // io.bidmachine.media3.exoplayer.drm.m
    public Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public m.d b() {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void e(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public int f() {
        return 1;
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public a8.b h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public boolean i(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public byte[] l(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public m.a m(byte[] bArr, List<u7.l.b> list, int i10, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void release() {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void j(byte[] bArr) {
    }

    @Override // io.bidmachine.media3.exoplayer.drm.m
    public void k(m.b bVar) {
    }
}
