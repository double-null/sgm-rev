package p2;

import a2.b;
import a2.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IGetInstallReferrerService.java */
/* JADX INFO: loaded from: classes3.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: p2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IGetInstallReferrerService.java */
    public static abstract class AbstractBinderC0387a extends b implements a {

        /* JADX INFO: renamed from: p2.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IGetInstallReferrerService.java */
        public static class C0388a extends a2.a implements a {
            C0388a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // p2.a
            public final Bundle c(Bundle bundle) throws RemoteException {
                Parcel parcelM = M();
                c.b(parcelM, bundle);
                Parcel parcelN = N(parcelM);
                Bundle bundle2 = (Bundle) c.a(parcelN, Bundle.CREATOR);
                parcelN.recycle();
                return bundle2;
            }
        }

        public static a M(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0388a(iBinder);
        }
    }

    Bundle c(Bundle bundle) throws RemoteException;
}
