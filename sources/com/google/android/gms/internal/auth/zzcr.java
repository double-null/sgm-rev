package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.a;
import d5.LXP.wcAlQCOdREZdI;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcr {
    private static final a zza = new a();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        a aVar = zza;
        Uri uri = (Uri) aVar.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse(wcAlQCOdREZdI.TUiTzkwEeSH.concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        aVar.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
