package com.google.android.gms.libs.throttling;

import android.util.LongSparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class InFlightThrottler implements GmsThrottler {
    private long zza = 0;
    private final LongSparseArray zzb = new LongSparseArray(2000);

    InFlightThrottler() {
    }

    @Override // com.google.android.gms.libs.throttling.GmsThrottler
    public void release(long j10) {
        LongSparseArray longSparseArray = this.zzb;
        synchronized (longSparseArray) {
            long[] jArr = (long[]) longSparseArray.get(j10);
            if (jArr == null) {
                return;
            }
            long j11 = jArr[0] - 1;
            jArr[0] = j11;
            if (j11 <= 0) {
                longSparseArray.delete(j10);
            } else {
                long j12 = this.zza + 1;
                this.zza = j12;
                jArr[1] = j12;
            }
        }
    }

    @Override // com.google.android.gms.libs.throttling.GmsThrottler
    public boolean tryAcquire(long j10, ThrottlingLimits throttlingLimits) {
        int maxInflight = throttlingLimits.getMaxInflight();
        if (maxInflight <= 0) {
            return false;
        }
        LongSparseArray longSparseArray = this.zzb;
        synchronized (longSparseArray) {
            long[] jArr = (long[]) longSparseArray.get(j10);
            if (jArr != null) {
                long j11 = jArr[0];
                long j12 = this.zza + 1;
                this.zza = j12;
                jArr[1] = j12;
                if (j11 >= maxInflight) {
                    return false;
                }
                jArr[0] = j11 + 1;
                return true;
            }
            if (longSparseArray.size() >= 2000) {
                int size = longSparseArray.size();
                long j13 = Long.MAX_VALUE;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long j14 = ((long[]) longSparseArray.valueAt(i11))[1];
                    if (j14 < j13) {
                        j13 = j14;
                    }
                    if (j14 < j13) {
                        i10 = i11;
                    }
                }
                longSparseArray.removeAt(i10);
            }
            long j15 = this.zza + 1;
            this.zza = j15;
            longSparseArray.put(j10, new long[]{1, j15});
            return true;
        }
    }
}
