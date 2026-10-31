package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.collect.u;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzod {
    private final Map zza;

    zzod(Map map) {
        HashMap map2 = new HashMap();
        this.zza = map2;
        map2.putAll(map);
    }

    private final int zzf() {
        try {
            String str = (String) this.zza.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzod) {
            return zza().equalsIgnoreCase(((zzod) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String zza() {
        StringBuilder sb2 = new StringBuilder();
        u uVar = zzof.zza;
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) uVar.get(i10);
            Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    public final Bundle zzb() {
        Map map = this.zza;
        if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("gdprApplies")) && AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (map.get("Version") == null) {
                if (!AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int iZzf = zzf();
                if (iZzf < 0) {
                    return Bundle.EMPTY;
                }
                String str2 = (String) map.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle = new Bundle();
                if (str2.length() > 0) {
                    bundle.putString(zzjk.AD_STORAGE.zze, str2.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str2.length() > 3) {
                    bundle.putString(zzjk.AD_PERSONALIZATION.zze, (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str2.length() > 6 && iZzf >= 4) {
                    String str3 = zzjk.AD_USER_DATA.zze;
                    if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                }
                return bundle;
            }
            if (zzf() >= 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(zzjk.AD_STORAGE.zze, true != Objects.equals(map.get("AuthorizePurpose1"), AppEventsConstants.EVENT_PARAM_VALUE_YES) ? "denied" : "granted");
                bundle2.putString(zzjk.AD_PERSONALIZATION.zze, (Objects.equals(map.get("AuthorizePurpose3"), AppEventsConstants.EVENT_PARAM_VALUE_YES) && Objects.equals(map.get("AuthorizePurpose4"), AppEventsConstants.EVENT_PARAM_VALUE_YES)) ? "granted" : "denied");
                if (zzf() >= 4) {
                    String str4 = zzjk.AD_USER_DATA.zze;
                    if (Objects.equals(map.get("AuthorizePurpose1"), AppEventsConstants.EVENT_PARAM_VALUE_YES) && Objects.equals(map.get("AuthorizePurpose7"), AppEventsConstants.EVENT_PARAM_VALUE_YES)) {
                        str = "granted";
                    }
                    bundle2.putString(str4, str);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    public final String zzc() {
        String str = (String) this.zza.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String zzd(zzod zzodVar) {
        Map map = zzodVar.zza;
        boolean zIsEmpty = map.isEmpty();
        String str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        String str2 = (zIsEmpty || ((String) map.get("Version")) != null) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES;
        Bundle bundleZzb = zzb();
        Bundle bundleZzb2 = zzodVar.zzb();
        if (true != ((bundleZzb.size() == bundleZzb2.size() && Objects.equals(bundleZzb.getString("ad_storage"), bundleZzb2.getString("ad_storage")) && Objects.equals(bundleZzb.getString("ad_personalization"), bundleZzb2.getString("ad_personalization")) && Objects.equals(bundleZzb.getString("ad_user_data"), bundleZzb2.getString("ad_user_data"))) ? false : true)) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        return str2.concat(str);
    }

    public final String zze() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AppEventsConstants.EVENT_PARAM_VALUE_YES);
        int i10 = -1;
        try {
            String str = (String) this.zza.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 < 0 || i10 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        }
        int iZzf = zzf();
        if (iZzf < 0 || iZzf > 63) {
            sb2.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzf));
        }
        Preconditions.checkArgument(true);
        Map map = this.zza;
        int i11 = (true != AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("gdprApplies")) ? 0 : 2) | 4;
        if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("EnableAdvertiserConsentMode"))) {
            i11 |= 8;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11));
        return sb2.toString();
    }
}
