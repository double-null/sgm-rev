package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import com.google.common.base.z;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzxg extends z {
    zzxg() {
    }

    @Override // com.google.common.base.z
    public final long read() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
