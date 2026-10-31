package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    void e(String[] strArr) throws RemoteException;

    /* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
        private static class C0067a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f3463a;

            C0067a(IBinder iBinder) {
                this.f3463a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3463a;
            }

            @Override // androidx.room.b
            public void e(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    this.f3463a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static b M(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0067a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                e(parcel.createStringArray());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
