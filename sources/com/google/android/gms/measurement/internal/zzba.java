package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import com.vungle.ads.internal.protos.Sdk;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzba {
    public static final zzba zza = new zzba((Boolean) null, 100, (Boolean) null, (String) null);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap zzf;

    zzba(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.zzf = enumMap;
        enumMap.put(zzjk.AD_USER_DATA, zzjl.zzh(bool));
        this.zzb = i10;
        this.zzc = zzl();
        this.zzd = bool2;
        this.zze = str;
    }

    static zzba zza(zzji zzjiVar, int i10) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        enumMap.put(zzjk.AD_USER_DATA, zzjiVar);
        return new zzba(enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzba zzg(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArrZza = zzjj.DMA.zza();
        int length = zzjkVarArrZza.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(zzjkVarArrZza[i12], zzjl.zzj(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new zzba(enumMap, i10, (Boolean) null, (String) null);
    }

    public static zzba zzh(Bundle bundle, int i10) {
        if (bundle == null) {
            return new zzba((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            enumMap.put(zzjkVar, zzjl.zzg(bundle.getString(zzjkVar.zze)));
        }
        return new zzba(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean zzi(Bundle bundle) {
        zzji zzjiVarZzg;
        if (bundle == null || (zzjiVarZzg = zzjl.zzg(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjiVarZzg.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String zzl() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb2.append(":");
            sb2.append(zzjl.zzm((zzji) this.zzf.get(zzjkVar)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzba)) {
            return false;
        }
        zzba zzbaVar = (zzba) obj;
        if (this.zzc.equalsIgnoreCase(zzbaVar.zzc) && Objects.equals(this.zzd, zzbaVar.zzd)) {
            return Objects.equals(this.zze, zzbaVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.zzd;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.zze;
        return this.zzc.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzji zzc() {
        zzji zzjiVar = (zzji) this.zzf.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final boolean zzd() {
        Iterator it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (((zzji) it.next()) != zzji.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String zze() {
        return this.zzc;
    }

    public final Bundle zzf() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzf.entrySet()) {
            String strZzi = zzjl.zzi((zzji) entry.getValue());
            if (strZzi != null) {
                bundle.putString(((zzjk) entry.getKey()).zze, strZzi);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final Boolean zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zze;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(zzjl.zzd(this.zzb));
        for (zzjk zzjkVar : zzjj.DMA.zza()) {
            sb2.append(",");
            sb2.append(zzjkVar.zze);
            sb2.append("=");
            zzji zzjiVar = (zzji) this.zzf.get(zzjkVar);
            if (zzjiVar == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = zzjiVar.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            sb2.append(yhXxbqGRMeI.phNCPmFj);
            sb2.append(bool);
        }
        String str = this.zze;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    private zzba(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i10;
        this.zzc = zzl();
        this.zzd = bool;
        this.zze = str;
    }
}
