package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzazk implements PackageManager.OnChecksumsReadyListener {
    final zzhcp zza = zzhcp.zze();

    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i10);
                if (apkChecksum.getType() == 8) {
                    zzhcp zzhcpVar = this.zza;
                    zzgzh zzgzhVarZzi = zzgzh.zzn().zzi();
                    byte[] value = apkChecksum.getValue();
                    zzhcpVar.zza(zzgzhVarZzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
