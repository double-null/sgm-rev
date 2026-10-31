package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzxb {
    private static final AtomicLong zza = new AtomicLong();

    public zzxb(long j10, zzht zzhtVar, Uri uri, Map map, long j11, long j12, long j13) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
