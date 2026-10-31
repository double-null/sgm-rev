package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvz {
    private static final zzvz zza;
    private final UUID zzb;
    private final AtomicLong zzc;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zza = new zzvz(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    zzvz(UUID uuid, long j10) {
        this.zzb = uuid;
        this.zzc = new AtomicLong((j10 ^ 25214903917L) & 281474976710655L);
    }

    static zzvz zza() {
        return zza;
    }

    final long zzb() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        long j12;
        do {
            atomicLong = this.zzc;
            j10 = atomicLong.get();
            j11 = ((j10 * 25214903917L) + 11) & 281474976710655L;
            j12 = ((25214903917L * j11) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j10, j12));
        return (((long) ((int) (j11 >>> 16))) << 32) + ((long) ((int) (j12 >>> 16)));
    }

    public final UUID zzc() {
        long jZzb = zzb() & (-61441);
        long jZzb2 = zzb() >>> 2;
        UUID uuid = this.zzb;
        return new UUID(jZzb ^ uuid.getMostSignificantBits(), jZzb2 ^ uuid.getLeastSignificantBits());
    }
}
