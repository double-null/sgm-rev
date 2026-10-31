package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfxn {
    public static zzaym zza(Context context, String str, String str2) {
        return new zzfxm(context, str, str2).zza(Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
    }
}
