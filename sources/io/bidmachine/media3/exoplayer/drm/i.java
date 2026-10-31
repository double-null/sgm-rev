package io.bidmachine.media3.exoplayer.drm;

import android.os.Looper;
import c8.b2;
import com.facebook.ads.AdError;
import u7.q;

/* JADX INFO: compiled from: DrmSessionManager.java */
/* JADX INFO: loaded from: classes4.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f18581a = new a();

    void l(Looper looper, b2 b2Var);

    default b m(h.a aVar, q qVar) {
        return b.f18582a;
    }

    int n(q qVar);

    DrmSession o(h.a aVar, q qVar);

    /* JADX INFO: compiled from: DrmSessionManager.java */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18582a = new b() { // from class: g8.j
            @Override // io.bidmachine.media3.exoplayer.drm.i.b
            public final void release() {
                io.bidmachine.media3.exoplayer.drm.i.b.c();
            }
        };

        void release();

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void c() {
        }
    }

    default void k() {
    }

    default void release() {
    }

    /* JADX INFO: compiled from: DrmSessionManager.java */
    class a implements i {
        a() {
        }

        @Override // io.bidmachine.media3.exoplayer.drm.i
        public int n(q qVar) {
            return qVar.f26256s != null ? 1 : 0;
        }

        @Override // io.bidmachine.media3.exoplayer.drm.i
        public DrmSession o(h.a aVar, q qVar) {
            if (qVar.f26256s == null) {
                return null;
            }
            return new l(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // io.bidmachine.media3.exoplayer.drm.i
        public void l(Looper looper, b2 b2Var) {
        }
    }
}
