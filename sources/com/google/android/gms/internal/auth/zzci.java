package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzci {
    private final h zza;

    zzci(h hVar) {
        this.zza = hVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        h hVar = (h) this.zza.get(uri.toString());
        if (hVar == null) {
            return null;
        }
        return (String) hVar.get("".concat(String.valueOf(str3)));
    }
}
