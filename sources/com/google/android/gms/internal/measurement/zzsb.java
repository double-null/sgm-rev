package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.common.collect.u;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsb {
    private final Uri.Builder zza = new Uri.Builder().scheme(ShareInternalUtility.STAGING_PARAM).authority("").path("/");
    private final u.a zzb = u.v();

    private zzsb() {
    }

    public final zzsb zza(File file) {
        this.zza.path(file.getAbsolutePath());
        return this;
    }

    public final Uri zzb() {
        return this.zza.encodedFragment(zzsp.zzb(this.zzb.m())).build();
    }

    /* synthetic */ zzsb(byte[] bArr) {
    }
}
