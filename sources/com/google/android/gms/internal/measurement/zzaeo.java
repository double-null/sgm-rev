package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaeo {
    zzaeo() {
    }

    public static final List zza(Object obj, long j10) {
        zzaef zzaefVar = (zzaef) zzagg.zzm(obj, j10);
        if (zzaefVar.zza()) {
            return zzaefVar;
        }
        int size = zzaefVar.size();
        zzaef zzaefVarZzg = zzaefVar.zzg(size == 0 ? 10 : size + size);
        zzagg.zzn(obj, j10, zzaefVarZzg);
        return zzaefVarZzg;
    }
}
