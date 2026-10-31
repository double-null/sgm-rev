package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import c8.b2;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ProgressiveMediaExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public interface w {

    /* JADX INFO: compiled from: ProgressiveMediaExtractor.java */
    public interface a {
        w a(b2 b2Var);
    }

    void a(long j10, long j11);

    void b();

    void c(u7.h hVar, Uri uri, Map<String, List<String>> map, long j10, long j11, v8.r rVar) throws IOException;

    long d();

    int e(v8.i0 i0Var) throws IOException;

    void release();
}
