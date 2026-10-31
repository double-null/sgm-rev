package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzps extends IOException {
    zzps() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzps(long j10, long j11, int i10, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)))), th);
    }

    zzps(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
