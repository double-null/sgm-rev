package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zav {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zav() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, Api.Client client) {
        int iIsGooglePlayServicesAvailable;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i10 = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int iZab = zab(context, minApkVersion);
        if (iZab != -1) {
            return iZab;
        }
        SparseIntArray sparseIntArray = this.zaa;
        synchronized (sparseIntArray) {
            int i11 = 0;
            while (true) {
                if (i11 >= sparseIntArray.size()) {
                    i10 = -1;
                    break;
                }
                int iKeyAt = sparseIntArray.keyAt(i11);
                if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            }
            iIsGooglePlayServicesAvailable = i10 == -1 ? this.zab.isGooglePlayServicesAvailable(context, minApkVersion) : i10;
            sparseIntArray.put(minApkVersion, iIsGooglePlayServicesAvailable);
        }
        return iIsGooglePlayServicesAvailable;
    }

    public final int zab(Context context, int i10) {
        int i11;
        SparseIntArray sparseIntArray = this.zaa;
        synchronized (sparseIntArray) {
            i11 = sparseIntArray.get(i10, -1);
        }
        return i11;
    }

    public final void zac() {
        SparseIntArray sparseIntArray = this.zaa;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }

    public zav(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
