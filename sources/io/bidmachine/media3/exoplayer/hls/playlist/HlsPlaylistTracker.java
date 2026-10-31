package io.bidmachine.media3.exoplayer.hls.playlist;

import android.net.Uri;
import i8.e;
import io.bidmachine.media3.exoplayer.source.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f18886a;

        public PlaylistResetException(Uri uri) {
            this.f18886a = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f18887a;

        public PlaylistStuckException(Uri uri) {
            this.f18887a = uri;
        }
    }

    public interface a {
        HlsPlaylistTracker a(h8.d dVar, io.bidmachine.media3.exoplayer.upstream.b bVar, e eVar, r8.e eVar2);
    }

    public interface b {
        void a();

        boolean e(Uri uri, io.bidmachine.media3.exoplayer.upstream.b.c cVar, boolean z10);
    }

    public interface c {
        void d(io.bidmachine.media3.exoplayer.hls.playlist.c cVar);
    }

    void b(Uri uri) throws IOException;

    void c(b bVar);

    long d();

    void e(Uri uri, s.a aVar, c cVar);

    d f();

    void g(Uri uri);

    boolean h(Uri uri);

    void i(b bVar);

    boolean j();

    boolean k(Uri uri, long j10);

    void l() throws IOException;

    io.bidmachine.media3.exoplayer.hls.playlist.c p(Uri uri, boolean z10);

    void stop();

    default void a(Uri uri) {
    }
}
