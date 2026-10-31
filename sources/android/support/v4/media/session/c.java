package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: MediaControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f477a = e.a(new a(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.support.v4.media.session.a f478b;

    /* JADX INFO: compiled from: MediaControllerCompat.java */
    private static class a implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f479a;

        a(c cVar) {
            this.f479a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.e.a
        public void a(List<?> list) {
            c cVar = this.f479a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void b(Object obj) {
            c cVar = this.f479a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void c(Object obj) {
            c cVar = this.f479a.get();
            if (cVar == null || cVar.f478b != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(obj));
        }

        @Override // android.support.v4.media.session.e.a
        public void d(String str, Bundle bundle) {
            c cVar = this.f479a.get();
            if (cVar != null) {
                android.support.v4.media.session.a aVar = cVar.f478b;
                cVar.h(str, bundle);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void e(int i10, int i11, int i12, int i13, int i14) {
            c cVar = this.f479a.get();
            if (cVar != null) {
                cVar.a(new d(i10, i11, i12, i13, i14));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void r() {
            c cVar = this.f479a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void s(Bundle bundle) {
            c cVar = this.f479a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void t(CharSequence charSequence) {
            c cVar = this.f479a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: MediaControllerCompat.java */
    static class b extends android.support.v4.media.session.a.AbstractBinderC0009a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f480a;

        b(c cVar) {
            this.f480a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void B(boolean z10) throws RemoteException {
            c cVar = this.f480a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void L(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            c cVar = this.f480a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void b(String str, Bundle bundle) throws RemoteException {
            c cVar = this.f480a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void w(int i10) throws RemoteException {
            c cVar = this.f480a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void x() throws RemoteException {
            c cVar = this.f480a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void z(int i10) throws RemoteException {
            c cVar = this.f480a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void D(boolean z10) throws RemoteException {
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void h(String str, Bundle bundle) {
    }

    void i(int i10, Object obj, Bundle bundle) {
    }
}
