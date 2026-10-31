package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzan extends zzav implements zzao {
    public zzan() {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    protected final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzaw.zza(parcel, Bundle.CREATOR);
        enforceNoDataAvail(parcel);
        zza(bundle);
        return true;
    }
}
