package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {
    protected final zzeg zza;

    protected AbstractAdRequestBuilder() {
        zzeg zzegVar = new zzeg();
        this.zza = zzegVar;
        zzegVar.zze(AdRequest.DEVICE_ID_EMULATOR);
    }

    @Deprecated
    public T addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
        this.zza.zzd(cls, bundle);
        return (T) self();
    }

    public T addCustomTargeting(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 108);
            sb2.append("Value ");
            sb2.append(str2);
            sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            zzo.zzi(sb2.toString());
        }
        this.zza.zzl(str, str2);
        return (T) self();
    }

    public T addKeyword(String str) {
        this.zza.zza(str);
        return (T) self();
    }

    public T addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        zzeg zzegVar = this.zza;
        zzegVar.zzc(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzegVar.zzf(AdRequest.DEVICE_ID_EMULATOR);
        }
        return (T) self();
    }

    protected abstract T self();

    public T setAdString(String str) {
        this.zza.zzo(str);
        return (T) self();
    }

    public T setContentUrl(String str) {
        Preconditions.checkNotNull(str, "Content URL must be non-null.");
        Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.zza.zzg(str);
        return (T) self();
    }

    public T setHttpTimeoutMillis(int i10) {
        this.zza.zzp(i10);
        return (T) self();
    }

    public T setNeighboringContentUrls(List<String> list) {
        if (list == null) {
            zzo.zzi("neighboring content URLs list should not be null");
            return (T) self();
        }
        this.zza.zzh(list);
        return (T) self();
    }

    public T setPlacementId(long j10) {
        this.zza.zzq(j10);
        return (T) self();
    }

    public T setRequestAgent(String str) {
        this.zza.zzj(str);
        return (T) self();
    }

    public final AbstractAdRequestBuilder zza(Bundle bundle) {
        this.zza.zzb(bundle);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzb(String str) {
        this.zza.zze(str);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzc(boolean z10) {
        this.zza.zzk(z10);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzd(boolean z10) {
        this.zza.zzn(z10);
        return self();
    }

    public T addCustomTargeting(String str, List<String> list) {
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    StringBuilder sb2 = new StringBuilder(str2.length() + 108);
                    sb2.append("Value ");
                    sb2.append(str2);
                    sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                    zzo.zzi(sb2.toString());
                }
            }
            this.zza.zzl(str, TextUtils.join(",", list));
        }
        return (T) self();
    }
}
