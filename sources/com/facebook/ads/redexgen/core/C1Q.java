package com.facebook.ads.redexgen.core;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.internal.NativeProtocol;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C1Q extends Binder {
    public static final int A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AbstractC0765Am<Bundle> A00(IBinder iBinder) {
        C05411h c05411hA01 = AbstractC0765Am.A01();
        int i10 = 0;
        int i11 = 1;
        while (i11 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i10);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i11 = parcelObtain2.readInt();
                        if (i11 == 1) {
                            c05411hA01.A04((Bundle) C3M.A01(parcelObtain2.readBundle()));
                            i10++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return c05411hA01.A05();
    }

    static {
        A00 = AbstractC06104a.A02 >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
    }
}
