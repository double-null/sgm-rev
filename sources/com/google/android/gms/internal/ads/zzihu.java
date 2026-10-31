package com.google.android.gms.internal.ads;

import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzihu implements zziek {
    static final zziek zza = new zzihu();

    private zzihu() {
    }

    @Override // com.google.android.gms.internal.ads.zziek
    public final boolean zza(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case 1000:
                case 1001:
                case 1002:
                case ErrorCodes.MALFORMED_URL_EXCEPTION /* 1003 */:
                case 1004:
                case 1005:
                case ErrorCodes.SSL_HANDSHAKE_EXCEPTION /* 1006 */:
                case ErrorCodes.IO_EXCEPTION /* 1007 */:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
