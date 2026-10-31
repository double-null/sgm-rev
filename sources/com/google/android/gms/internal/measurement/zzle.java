package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzle {
    private final h zza;

    zzle(h hVar) {
        this.zza = hVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        h hVar = uri != null ? (h) this.zza.get(uri.toString()) : null;
        if (hVar == null) {
            return null;
        }
        return (String) hVar.get(str3);
    }
}
