package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbhz;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final zzbhz adapterSettingsInternal = zzba.zzd();

    AdapterSettings() {
    }

    private boolean getBoolean(String str, boolean z10) {
        return this.adapterSettingsInternal.zzf(str, z10);
    }

    private float getFloat(String str, float f10) {
        return this.adapterSettingsInternal.zze(str, f10);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                if (instance == null) {
                    instance = new AdapterSettings();
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i10) {
        return this.adapterSettingsInternal.zzd(str, i10);
    }

    private long getLong(String str, long j10) {
        return this.adapterSettingsInternal.zzc(str, j10);
    }

    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
