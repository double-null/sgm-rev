package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: ICustomTabsService.java */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    public static final String U8 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* JADX INFO: compiled from: ICustomTabsService.java */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: c.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ICustomTabsService.java */
        private static class C0090a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f4514a;

            C0090a(IBinder iBinder) {
                this.f4514a = iBinder;
            }

            @Override // c.b
            public boolean J(c.a aVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.U8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0091b.d(parcelObtain, uri, 0);
                    C0091b.d(parcelObtain, bundle, 0);
                    this.f4514a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4514a;
            }

            @Override // c.b
            public boolean c(c.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.U8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0091b.d(parcelObtain, bundle, 0);
                    this.f4514a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean f(c.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.U8);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f4514a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean j(c.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.U8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0091b.d(parcelObtain, uri, 0);
                    C0091b.d(parcelObtain, bundle, 0);
                    C0091b.c(parcelObtain, list, 0);
                    this.f4514a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public int k(c.a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.U8);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0091b.d(parcelObtain, bundle, 0);
                    this.f4514a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean o(c.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.U8);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i10);
                    C0091b.d(parcelObtain, uri, 0);
                    C0091b.d(parcelObtain, bundle, 0);
                    this.f4514a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean q(long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.U8);
                    parcelObtain.writeLong(j10);
                    this.f4514a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean u(c.a aVar, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.U8);
                    parcelObtain.writeStrongInterface(aVar);
                    C0091b.d(parcelObtain, uri, 0);
                    this.f4514a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
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
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.U8);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0090a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ICustomTabsService.java */
    public static class C0091b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, list.get(i11), i10);
            }
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

    boolean J(c.a aVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean c(c.a aVar, Bundle bundle) throws RemoteException;

    boolean f(c.a aVar) throws RemoteException;

    boolean j(c.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    int k(c.a aVar, String str, Bundle bundle) throws RemoteException;

    boolean o(c.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException;

    boolean q(long j10) throws RemoteException;

    boolean u(c.a aVar, Uri uri) throws RemoteException;
}
