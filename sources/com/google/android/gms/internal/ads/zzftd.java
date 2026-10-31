package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzftd {
    private final zzdzl zza;

    zzftd(zzdzl zzdzlVar, Context context) {
        this.zza = zzdzlVar;
    }

    private final void zzv(String str, long j10, String str2, String str3, AdFormat adFormat, int i10, int i11, int i12, String str4) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", str);
        zzdzkVarZza.zzc("pat", Long.toString(j10));
        zzdzkVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdzkVarZza.zzc("max_ads", Integer.toString(i10));
        zzdzkVarZza.zzc("cache_size", Integer.toString(i11));
        zzdzkVarZza.zzc("pas", Integer.toString(i12));
        zzdzkVarZza.zzc("pv", "2");
        zzdzkVarZza.zzc("ad_unit_id", str3);
        zzdzkVarZza.zzc("pid", str2);
        zzdzkVarZza.zzd();
    }

    private final void zzw(String str, String str2, long j10, int i10, int i11, String str3, zzftk zzftkVar, String str4) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc(str2, Long.toString(j10));
        if (zzftkVar != null) {
            zzdzkVarZza.zzc("ad_unit_id", zzftkVar.zza());
            zzdzkVarZza.zzc("ad_format", zzftkVar.zzb());
            zzdzkVarZza.zzc("pid", zzftkVar.zzc());
        }
        zzdzkVarZza.zzc("action", str);
        if (str3 != null) {
            zzdzkVarZza.zzc("gqi", str3);
        }
        if (i10 >= 0) {
            zzdzkVarZza.zzc("max_ads", Integer.toString(i10));
        }
        if (i11 >= 0) {
            zzdzkVarZza.zzc("cache_size", Integer.toString(i11));
        }
        zzdzkVarZza.zzc("pv", str4);
        zzdzkVarZza.zzd();
    }

    private final void zzx(String str, long j10, String str2, String str3, AdFormat adFormat, int i10, int i11, int i12, int i13, int i14) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", str);
        zzdzkVarZza.zzc("pat", Long.toString(j10));
        zzdzkVarZza.zzc("pid", str2);
        zzdzkVarZza.zzc("ad_unit_id", str3);
        zzdzkVarZza.zzc("max_ads", Integer.toString(i10));
        zzdzkVarZza.zzc("cache_size", Integer.toString(i11));
        zzdzkVarZza.zzc("tpcnt", Integer.toString(i13));
        zzdzkVarZza.zzc("mpl", Integer.toString(i14));
        if (adFormat != null) {
            zzdzkVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i12 > 0) {
            zzdzkVarZza.zzc("nptr", Integer.toString(i12));
        }
        zzdzkVarZza.zzd();
    }

    public final void zza(int i10, long j10, zzftk zzftkVar, String str) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", "start_preload");
        zzdzkVarZza.zzc("sp_ts", Long.toString(j10));
        zzdzkVarZza.zzc("ad_format", zzftkVar.zzb());
        zzdzkVarZza.zzc("ad_unit_id", zzftkVar.zza());
        zzdzkVarZza.zzc("pid", zzftkVar.zzc());
        zzdzkVarZza.zzc("max_ads", Integer.toString(i10));
        zzdzkVarZza.zzc("pv", str);
        zzdzkVarZza.zzd();
    }

    public final void zzb(Map map, long j10, String str) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", "start_preload");
        zzdzkVarZza.zzc("sp_ts", Long.toString(j10));
        zzdzkVarZza.zzc("pv", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdzkVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdzkVarZza.zzd();
    }

    public final void zzc(int i10, int i11, long j10, zzftk zzftkVar) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", "cache_resize");
        zzdzkVarZza.zzc("cs_ts", Long.toString(j10));
        zzdzkVarZza.zzc("orig_ma", Integer.toString(i10));
        zzdzkVarZza.zzc("max_ads", Integer.toString(i11));
        zzdzkVarZza.zzc("ad_format", zzftkVar.zzb());
        zzdzkVarZza.zzc("ad_unit_id", zzftkVar.zza());
        zzdzkVarZza.zzc("pid", zzftkVar.zzc());
        zzdzkVarZza.zzc("pv", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzdzkVarZza.zzd();
    }

    public final void zzd(int i10, int i11, long j10, Long l10, String str, zzftk zzftkVar, String str2) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("plaac_ts", Long.toString(j10));
        zzdzkVarZza.zzc("max_ads", Integer.toString(i10));
        zzdzkVarZza.zzc("cache_size", Integer.toString(i11));
        zzdzkVarZza.zzc("action", "is_ad_available");
        if (zzftkVar != null) {
            zzdzkVarZza.zzc("ad_unit_id", zzftkVar.zza());
            zzdzkVarZza.zzc("pid", zzftkVar.zzc());
            zzdzkVarZza.zzc("ad_format", zzftkVar.zzb());
        }
        if (l10 != null) {
            zzdzkVarZza.zzc("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            zzdzkVarZza.zzc("gqi", str);
        }
        zzdzkVarZza.zzc("pv", str2);
        zzdzkVarZza.zzd();
    }

    public final void zze(long j10, String str) {
        zzw("poll_ad", "ppacwe_ts", j10, -1, -1, null, null, "2");
    }

    public final void zzf(long j10, zzftk zzftkVar, int i10, int i11, String str) {
        zzw("poll_ad", "ppac_ts", j10, i10, i11, null, zzftkVar, str);
    }

    public final void zzg(long j10, int i10, int i11, String str, zzftk zzftkVar, String str2) {
        zzw("poll_ad", "psvroc_ts", j10, i10, i11, str, zzftkVar, str2);
    }

    public final void zzh(long j10, int i10, int i11, String str, zzftk zzftkVar, String str2) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("ppla_ts", Long.toString(j10));
        zzdzkVarZza.zzc("ad_format", zzftkVar.zzb());
        zzdzkVarZza.zzc("ad_unit_id", zzftkVar.zza());
        zzdzkVarZza.zzc("pid", zzftkVar.zzc());
        zzdzkVarZza.zzc("max_ads", Integer.toString(i10));
        zzdzkVarZza.zzc("cache_size", Integer.toString(i11));
        zzdzkVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzdzkVarZza.zzc("gqi", str);
        }
        zzdzkVarZza.zzc("pv", str2);
        zzdzkVarZza.zzd();
    }

    public final void zzi(long j10, String str, zzftk zzftkVar, int i10, int i11, String str2) {
        zzw("paa", "pano_ts", j10, i10, i11, str, zzftkVar, str2);
    }

    public final void zzj(long j10, zzftk zzftkVar, int i10, String str) {
        zzw("pae", "paeo_ts", j10, i10, 0, null, zzftkVar, str);
    }

    public final void zzk(long j10, zzftk zzftkVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i10, int i11, String str) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", "pftla");
        zzdzkVarZza.zzc("pftlat_ts", Long.toString(j10));
        zzdzkVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdzkVarZza.zzc("ad_format", zzftkVar.zzb());
        zzdzkVarZza.zzc("max_ads", Integer.toString(i10));
        zzdzkVarZza.zzc("cache_size", Integer.toString(i11));
        zzdzkVarZza.zzc("ad_unit_id", zzftkVar.zza());
        zzdzkVarZza.zzc("pid", zzftkVar.zzc());
        zzdzkVarZza.zzc("pv", str);
        zzdzkVarZza.zzd();
    }

    public final void zzl(long j10, AdFormat adFormat, int i10) {
        zzv("pda", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzm(long j10, String str, String str2, AdFormat adFormat, int i10, int i11) {
        zzv("pd", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j10, int i10) {
        zzv("pgcs", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzo(long j10, String str, String str2, AdFormat adFormat, int i10, int i11) {
        zzv("pgc", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzp(int i10, long j10, String str, String str2, AdFormat adFormat, int i11) {
        zzv("pnav", j10, str, str2, adFormat, i11, i10, 1, "2");
    }

    public final void zzq(long j10, String str, String str2, AdFormat adFormat, int i10, int i11, int i12, int i13) {
        zzx("acmpa", j10, str, str2, adFormat, i10, i11, 0, i12, i13);
    }

    public final void zzr(long j10, String str, String str2, AdFormat adFormat, int i10, int i11, int i12, int i13, int i14) {
        zzx("acmpr", j10, str, str2, adFormat, i10, i11, i12, i13, i14);
    }

    public final void zzs(long j10, int i10, int i11) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", "acmlr");
        zzdzkVarZza.zzc("pat", Long.toString(j10));
        zzdzkVarZza.zzc("mpl", Integer.toString(i10));
        zzdzkVarZza.zzc("pas", Integer.toString(i11));
        zzdzkVarZza.zzd();
    }

    public final void zzt(long j10, AdFormat adFormat, String str, String str2) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", "poact");
        zzdzkVarZza.zzc("ad_unit_id", str2);
        zzdzkVarZza.zzc("pid", str);
        zzdzkVarZza.zzc("poact_ts", Long.toString(j10));
        if (adFormat != null) {
            zzdzkVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        zzdzkVarZza.zzd();
    }

    public final void zzu(long j10, AdFormat adFormat, String str, String str2) {
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", "poac");
        zzdzkVarZza.zzc("ad_unit_id", str2);
        zzdzkVarZza.zzc("pid", str);
        if (adFormat != null) {
            zzdzkVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        zzdzkVarZza.zzd();
    }
}
