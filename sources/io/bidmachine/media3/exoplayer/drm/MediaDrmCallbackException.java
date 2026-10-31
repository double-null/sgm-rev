package io.bidmachine.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.g f18559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f18560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f18561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18562d;

    public MediaDrmCallbackException(z7.g gVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f18559a = gVar;
        this.f18560b = uri;
        this.f18561c = map;
        this.f18562d = j10;
    }
}
