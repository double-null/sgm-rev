package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzam;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaa {
    private String zza = null;
    private long zzb = -1;
    private zzam zzc = zzam.zzj();
    private zzam zzd = zzam.zzj();

    zzaa() {
    }

    final zzaa zza(String str) {
        this.zza = str;
        return this;
    }

    final zzaa zzb(long j10) {
        this.zzb = j10;
        return this;
    }

    final zzaa zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = zzam.zzp(list);
        return this;
    }

    final zzaa zzd(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = zzam.zzp(list);
        return this;
    }

    final zzab zze() {
        if (this.zza == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.zzb < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
