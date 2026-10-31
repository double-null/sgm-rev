package io.bidmachine.media3.exoplayer.drm;

import java.util.UUID;

/* JADX INFO: compiled from: MediaDrmCallback.java */
/* JADX INFO: loaded from: classes4.dex */
public interface p {
    byte[] a(UUID uuid, m.d dVar) throws MediaDrmCallbackException;

    byte[] b(UUID uuid, m.a aVar) throws MediaDrmCallbackException;
}
