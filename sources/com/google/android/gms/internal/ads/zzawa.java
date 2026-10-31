package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzawa {
    public final ArrayDeque zza = new ArrayDeque();

    public zzawa(int i10) {
    }

    public final void zza(long j10, long j11, long j12) throws zzavy {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        zzavx zzavxVar = new zzavx(j10, j11, j12);
        ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= ((i17 % 452867621) ^ i18)) {
            throw new zzavy();
        }
        arrayDeque.push(zzavxVar);
    }

    public final zzavx zzb() throws zzavz {
        return (zzavx) Optional.ofNullable((zzavx) this.zza.peek()).orElseThrow(zzavw.zza);
    }
}
