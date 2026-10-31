package io.bidmachine.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: MediaCodecAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public interface h {

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f19281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f19282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u7.q f19283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f19284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f19285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final k8.c f19286f;

        private a(j jVar, MediaFormat mediaFormat, u7.q qVar, Surface surface, MediaCrypto mediaCrypto, k8.c cVar) {
            this.f19281a = jVar;
            this.f19282b = mediaFormat;
            this.f19283c = qVar;
            this.f19284d = surface;
            this.f19285e = mediaCrypto;
            this.f19286f = cVar;
        }

        public static a a(j jVar, MediaFormat mediaFormat, u7.q qVar, MediaCrypto mediaCrypto, k8.c cVar) {
            return new a(jVar, mediaFormat, qVar, null, mediaCrypto, cVar);
        }

        public static a b(j jVar, MediaFormat mediaFormat, u7.q qVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(jVar, mediaFormat, qVar, surface, mediaCrypto, null);
        }
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public static final b f19287a = new g();

        static b a(Context context) {
            return new g(context);
        }

        h b(a aVar) throws IOException;
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface d {
        void a(h hVar, long j10, long j11);
    }

    void a(int i10, int i11, a8.c cVar, long j10, int i12);

    void b(int i10, int i11, int i12, long j10, int i13);

    void c(Bundle bundle);

    default boolean d(c cVar) {
        return false;
    }

    MediaFormat e();

    void f();

    void flush();

    void g(int i10);

    void h(d dVar, Handler handler);

    ByteBuffer i(int i10);

    void j(Surface surface);

    boolean k();

    void l(int i10, long j10);

    int m();

    int n(MediaCodec.BufferInfo bufferInfo);

    void o(int i10, boolean z10);

    ByteBuffer p(int i10);

    void release();

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface c {
        default void a() {
        }

        default void b() {
        }
    }
}
