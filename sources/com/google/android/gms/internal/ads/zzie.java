package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzie extends zzhq {
    public final int zzb;

    public zzie(zzht zzhtVar, int i10, int i11) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzie zza(IOException iOException, zzht zzhtVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !zzgss.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new zzid(iOException, zzhtVar) : new zzie(iOException, zzhtVar, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        if (i10 == 2000) {
            return i11 != 1 ? 2000 : 2001;
        }
        return i10;
    }

    public zzie(IOException iOException, zzht zzhtVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzie(String str, zzht zzhtVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzie(String str, IOException iOException, zzht zzhtVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = i11;
    }
}
