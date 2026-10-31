package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzclr implements zzbpq {
    final /* synthetic */ zzclx zza;

    zzclr(zzclx zzclxVar) {
        Objects.requireNonNull(zzclxVar);
        this.zza = zzclxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i10 = Integer.parseInt(str);
                zzclx zzclxVar = this.zza;
                synchronized (zzclxVar) {
                    if (zzclxVar.zzaX() != i10) {
                        zzclxVar.zzaY(i10);
                        zzclxVar.requestLayout();
                    }
                }
            } catch (Exception e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
