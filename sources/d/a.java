package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: IResultReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    public static final String V8 = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* JADX INFO: compiled from: IResultReceiver.java */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void m(int i10, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IResultReceiver.java */
    public static abstract class AbstractBinderC0169a extends Binder implements a {

        /* JADX INFO: renamed from: d.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IResultReceiver.java */
        private static class C0170a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f13136a;

            C0170a(IBinder iBinder) {
                this.f13136a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13136a;
            }
        }

        public AbstractBinderC0169a() {
            attachInterface(this, a.V8);
        }

        public static a M(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.V8);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0170a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.V8;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            m(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
