package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<c, a> f444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final MediaSessionCompat.Token f445d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f446a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f446a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f442a) {
                mediaControllerCompat$MediaControllerImplApi21.f445d.b(b.a.M(androidx.core.app.g.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f445d.c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    private static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void A(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void a(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void r() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void s(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void t(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void y(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f445d.a() == null) {
            return;
        }
        for (c cVar : this.f443b) {
            a aVar = new a(cVar);
            this.f444c.put(cVar, aVar);
            cVar.f478b = aVar;
            try {
                this.f445d.a().n(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        this.f443b.clear();
    }
}
