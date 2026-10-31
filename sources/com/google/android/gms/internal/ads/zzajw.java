package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajw implements zzao {
    public final List zza;

    public zzajw(List list) {
        this.zza = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = ((zzajv) list.get(0)).zzb;
            for (int i10 = 1; i10 < list.size(); i10++) {
                if (((zzajv) list.get(i10)).zza < j10) {
                    z10 = true;
                    break;
                }
                j10 = ((zzajv) list.get(i10)).zzb;
            }
        }
        zzgtj.zza(!z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajw.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzajw) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }
}
