package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzacc extends IOException {
    public zzacc(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 11 + strConcat.length());
        sb2.append("Unexpected ");
        sb2.append(simpleName);
        sb2.append(strConcat);
        super(sb2.toString(), th);
    }
}
