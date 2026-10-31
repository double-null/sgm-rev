package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzgs extends IOException {
    public zzgs(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzgs(String str) {
        super(str);
    }
}
