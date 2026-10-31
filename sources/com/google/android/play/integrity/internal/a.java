package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f11357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11358b;

    protected a(IBinder iBinder, String str) {
        this.f11357a = iBinder;
        this.f11358b = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f11358b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11357a;
    }

    protected final void b(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f11357a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
