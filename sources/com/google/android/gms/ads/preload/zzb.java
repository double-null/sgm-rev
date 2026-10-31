package com.google.android.gms.ads.preload;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzb {
    protected final zzch zza;
    private final AdFormat zzb;
    private final Context zzc;

    protected zzb(Context context, AdFormat adFormat) {
        this.zza = com.google.android.gms.ads.zzb.zza(context);
        this.zzc = context.getApplicationContext();
        this.zzb = adFormat;
    }

    public final boolean zzb(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzm(str, zzf.zzu(this.zzc, preloadConfiguration, this.zzb), preloadCallbackV2 == null ? null : new zza(this, preloadCallbackV2));
        } catch (RemoteException e10) {
            StringBuilder sb2 = new StringBuilder(str.length() + 37);
            sb2.append("Failed to preload ad for preload ID ");
            sb2.append(str);
            sb2.append(".");
            zzo.zzj(sb2.toString(), e10);
            return false;
        }
    }

    public final boolean zzc(String str, PreloadConfiguration preloadConfiguration) {
        if (str == null) {
            return false;
        }
        try {
            return this.zza.zzm(str, zzf.zzu(this.zzc, preloadConfiguration, this.zzb), null);
        } catch (RemoteException e10) {
            StringBuilder sb2 = new StringBuilder(str.length() + 37);
            sb2.append("Failed to preload ad for preload ID ");
            sb2.append(str);
            sb2.append(".");
            zzo.zzj(sb2.toString(), e10);
            return false;
        }
    }

    public final boolean zzd(String str) {
        try {
            return this.zza.zzn(this.zzb.getValue(), str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final int zze(String str) {
        try {
            return this.zza.zzt(this.zzb.getValue(), str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return 0;
        }
    }

    public final boolean zzf(String str) {
        try {
            return this.zza.zzu(this.zzb.getValue(), str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final void zzg() {
        try {
            this.zza.zzv(this.zzb.getValue());
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final PreloadConfiguration zzi(String str) {
        try {
            zzfp zzfpVarZzr = this.zza.zzr(this.zzb.getValue(), str);
            if (zzfpVarZzr == null) {
                return null;
            }
            return zzf.zzs(zzfpVarZzr);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }

    protected final Context zzj() {
        return this.zzc;
    }

    public final Map zzh() {
        PreloadConfiguration preloadConfigurationZzs;
        try {
            Bundle bundleZzs = this.zza.zzs(this.zzb.getValue());
            HashMap map = new HashMap();
            for (String str : bundleZzs.keySet()) {
                byte[] byteArray = bundleZzs.getByteArray(str);
                if (byteArray != null && (preloadConfigurationZzs = zzf.zzs((zzfp) SafeParcelableSerializer.deserializeFromBytes(byteArray, zzfp.CREATOR))) != null) {
                    map.put(str, preloadConfigurationZzs);
                }
            }
            return map;
        } catch (RemoteException e10) {
            zzo.zzl(sRGQSqxgxlS.gPjkwkxixGjzMHE, e10);
            return new HashMap();
        }
    }
}
