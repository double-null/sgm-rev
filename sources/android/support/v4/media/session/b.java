package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IMediaSession.java */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: compiled from: IMediaSession.java */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMediaSession.java */
        private static class C0010a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f476a;

            C0010a(IBinder iBinder) {
                this.f476a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f476a;
            }

            @Override // android.support.v4.media.session.b
            public void n(android.support.v4.media.session.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f476a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static b M(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0010a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    void n(android.support.v4.media.session.a aVar) throws RemoteException;
}
