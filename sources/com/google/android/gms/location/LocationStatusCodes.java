package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class LocationStatusCodes {
    public static final int ERROR = 1;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
    public static final int SUCCESS = 0;

    private LocationStatusCodes() {
    }

    public static int zza(int i10) {
        if ((i10 < 0 || i10 > 1) && (i10 < 1000 || i10 >= 1006)) {
            return 1;
        }
        return i10;
    }

    public static Status zzb(int i10) {
        if (i10 == 1) {
            i10 = 13;
        }
        return new Status(i10);
    }
}
