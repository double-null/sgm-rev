package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzsu {
    private static final AtomicLong zza = new AtomicLong();

    static Uri zza(Uri uri) {
        int iMyPid = Process.myPid();
        long id2 = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = zza.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        int length2 = String.valueOf(id2).length();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb2.append(".mobstore_tmp-");
        sb2.append(iMyPid);
        sb2.append("-");
        sb2.append(id2);
        sb2.append("-");
        sb2.append(jCurrentTimeMillis);
        sb2.append("-");
        sb2.append(andIncrement);
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb2.toString())).build();
    }
}
