package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeui implements zzfci {
    final zzfky zza;
    private final long zzb;
    private final long zzc;

    public zzeui(zzfky zzfkyVar, long j10, long j11) {
        this.zza = zzfkyVar;
        this.zzb = j10;
        this.zzc = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfky zzfkyVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkyVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzfkyVar.zzg);
        int i10 = zzfkyVar.zzp.zza;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            bundle.putBoolean(KBBdKxoAiHo.lvPaCJTwZ, true);
        } else if (i11 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j10 = this.zzb;
        bundle.putLong("start_signals_timestamp", j10);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoX)).booleanValue()) {
            bundle.putLong("tsi", j10 - this.zzc);
        }
        zzfln.zzd(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfln.zzb(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j11 = zzmVar.zzb;
        zzfln.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j11)), j11 != -1);
        zzfln.zzf(bundle, "extras", zzmVar.zzc);
        int i12 = zzmVar.zzd;
        zzfln.zzc(bundle, "cust_gender", i12, i12 != -1);
        zzfln.zzg(bundle, "kw", zzmVar.zze);
        int i13 = zzmVar.zzg;
        zzfln.zzc(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i14 = zzmVar.zza;
        zzfln.zzc(bundle, "d_imp_hdr", 1, i14 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfln.zzb(bundle, "ppid", str, i14 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong(UyXgnuLGEkgnZE.vUl, (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfln.zze(bundle, "url", zzmVar.zzl);
        zzfln.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfln.zzf(bundle, "custom_targeting", zzmVar.zzn);
        zzfln.zzg(bundle, "category_exclusions", zzmVar.zzo);
        zzfln.zze(bundle, "request_agent", zzmVar.zzp);
        zzfln.zze(bundle, "request_pkg", zzmVar.zzq);
        zzfln.zzd(bundle, "is_designed_for_families", zzmVar.zzr, i14 >= 7);
        if (i14 >= 8) {
            int i15 = zzmVar.zzt;
            zzfln.zzc(bundle, "tag_for_under_age_of_consent", i15, i15 != -1);
            zzfln.zze(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
        Bundle bundle3 = zzfkyVar.zze;
        zzfln.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzfln.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzfln.zze(bundle, "plid", bundle3.getString("plid"));
        zzfln.zzc(bundle, "s2s_rr", 1, zzfkyVar.zzv && !(zzmVar.zzs == null && zzmVar.zzx == null));
    }
}
