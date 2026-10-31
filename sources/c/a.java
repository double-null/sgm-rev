package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: ICustomTabsCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    public static final String T8 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* JADX INFO: compiled from: ICustomTabsCallback.java */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void C(Bundle bundle) throws RemoteException;

    void E(int i10, int i11, Bundle bundle) throws RemoteException;

    void F(int i10, Bundle bundle) throws RemoteException;

    void G(String str, Bundle bundle) throws RemoteException;

    void H(Bundle bundle) throws RemoteException;

    void I(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;

    void d(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException;

    Bundle g(String str, Bundle bundle) throws RemoteException;

    void h(String str, Bundle bundle) throws RemoteException;

    void i(Bundle bundle) throws RemoteException;

    void v(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: c.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ICustomTabsCallback.java */
    public static abstract class AbstractBinderC0089a extends Binder implements a {
        public AbstractBinderC0089a() {
            attachInterface(this, a.T8);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.T8;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    F(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    h(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    H((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    G(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    I(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleG = g(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, bundleG, 1);
                    return true;
                case 8:
                    E(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    i((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    d(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    v((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    C((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
