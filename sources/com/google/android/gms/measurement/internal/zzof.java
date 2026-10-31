package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.common.collect.u;
import com.google.common.collect.v;
import com.google.common.collect.w;
import java.util.Map;
import k9.dW.xjwcmjDeOXR;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzof {
    static final u zza = u.a0("Version", "GoogleConsent", "VendorConsent", xjwcmjDeOXR.RDEQSOPZOS, "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:15:0x0077  */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0086  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x016b  */
    /* JADX WARN: Code duplicated, block: B:53:0x018f  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0200  */
    /* JADX WARN: Code duplicated, block: B:69:0x0235  */
    static final boolean zzc(zzabw zzabwVar, v vVar, v vVar2, w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        char c10;
        int i21;
        zzoe zzoeVar;
        int iOrdinal;
        char c11;
        int iZze = zze(zzabwVar, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (iZze > 0) {
            i16 = i12;
            i15 = i11;
            if (i16 == 1) {
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i18 = 1;
                    i17 = 1;
                }
                if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i14, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED) {
                    c11 = '3';
                } else {
                    if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                        i19 = i14;
                        i20 = 1;
                        if (i19 == 1) {
                            if (wVar.contains(str)) {
                                if (iZze > 0 && cArr[iZze] != '2') {
                                    cArr[iZze] = '1';
                                }
                                return true;
                            }
                            c10 = '2';
                            i21 = 1;
                        }
                        if (vVar.containsKey(zzabwVar) || (zzoeVar = (zzoe) vVar.get(zzabwVar)) == null) {
                            c11 = '0';
                        } else {
                            iOrdinal = zzoeVar.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != i20) {
                                    if (iOrdinal != 2) {
                                        return zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) : zzg(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                                    }
                                    if (iOrdinal == 3) {
                                        return zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) : zzh(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                                    }
                                    c11 = '0';
                                } else if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                    return zzh(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                                }
                            } else if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                return zzg(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                            }
                            c11 = '8';
                        }
                    } else {
                        i19 = i14;
                        i20 = 1;
                    }
                    c10 = '2';
                    i21 = i19;
                    if (vVar.containsKey(zzabwVar)) {
                        c11 = '0';
                    } else {
                        iOrdinal = zzoeVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != i20) {
                                if (iOrdinal != 2) {
                                    if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                    }
                                }
                                if (iOrdinal == 3) {
                                    if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                    }
                                }
                                c11 = '0';
                            } else if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                return zzh(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                            }
                        } else if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                            return zzg(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                        }
                        c11 = '8';
                    }
                }
                if (iZze <= 0 && cArr[iZze] != '2') {
                    cArr[iZze] = c11;
                    return false;
                }
            }
            cArr[iZze] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        i17 = i16;
        i18 = i15;
        if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i14, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c11 = '3';
        } else {
            if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                i19 = i14;
                i20 = 1;
                if (i19 == 1) {
                    if (wVar.contains(str)) {
                        if (iZze > 0) {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    c10 = '2';
                    i21 = 1;
                }
                if (vVar.containsKey(zzabwVar)) {
                    c11 = '0';
                } else {
                    iOrdinal = zzoeVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != i20) {
                            if (iOrdinal != 2) {
                                if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                }
                            }
                            if (iOrdinal == 3) {
                                if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                }
                            }
                            c11 = '0';
                        } else if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                            return zzh(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                        }
                    } else if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                        return zzg(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                    }
                    c11 = '8';
                }
            } else {
                i19 = i14;
                i20 = 1;
            }
            c10 = '2';
            i21 = i19;
            if (vVar.containsKey(zzabwVar)) {
                c11 = '0';
            } else {
                iOrdinal = zzoeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != i20) {
                        if (iOrdinal != 2) {
                            if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                            }
                        }
                        if (iOrdinal == 3) {
                            if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                            }
                        }
                        c11 = '0';
                    } else if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzh(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                    }
                } else if (zzi(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return zzg(zzabwVar, vVar, vVar2, wVar, cArr, i10, i18, i17, i13, i21, str, str2, str3, z10, z11, true);
                }
                c11 = '8';
            }
        }
        return iZze <= 0 ? false : false;
    }

    public static final Map zzd(v vVar, v vVar2, w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return v.t();
        }
        zzabw zzabwVar = zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzabx zzabxVar = (zzabx) vVar2.get(zzabwVar);
        zzabw zzabwVar2 = zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        zzabx zzabxVar2 = (zzabx) vVar2.get(zzabwVar2);
        zzabw zzabwVar3 = zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        zzabx zzabxVar3 = (zzabx) vVar2.get(zzabwVar3);
        zzabw zzabwVar4 = zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        zzabx zzabxVar4 = (zzabx) vVar2.get(zzabwVar4);
        v.a aVarG = v.b().g("Version", "2");
        String str4 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        v.a aVarJ = aVarG.g("VendorConsent", true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES).g("VendorLegitimateInterest", true != z11 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES).g("gdprApplies", i12 != 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES).g("EnableAdvertiserConsentMode", i11 != 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES).g("PolicyVersion", String.valueOf(i13)).g("CmpSdkID", String.valueOf(i10)).g("PurposeOneTreatment", i14 != 1 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES).g("PublisherCC", str).g("PublisherRestrictions1", String.valueOf(zzabxVar != null ? zzabxVar.zza() : zzabx.zzd.zza())).g("PublisherRestrictions3", String.valueOf(zzabxVar2 != null ? zzabxVar2.zza() : zzabx.zzd.zza())).g("PublisherRestrictions4", String.valueOf(zzabxVar3 != null ? zzabxVar3.zza() : zzabx.zzd.zza())).g("PublisherRestrictions7", String.valueOf(zzabxVar4 != null ? zzabxVar4.zza() : zzabx.zzd.zza())).j(v.v("Purpose1", zzf(zzabwVar, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", zzf(zzabwVar2, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", zzf(zzabwVar3, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", zzf(zzabwVar4, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true)));
        Object obj = true != zzc(zzabwVar, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES;
        Object obj2 = true != zzc(zzabwVar2, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES;
        Object obj3 = true != zzc(zzabwVar3, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES;
        if (true != zzc(zzabwVar4, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true)) {
            str4 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        return aVarJ.j(v.w("AuthorizePurpose1", obj, "AuthorizePurpose3", obj2, "AuthorizePurpose4", obj3, "AuthorizePurpose7", str4, "PurposeDiagnostics", new String(cArr))).d();
    }

    private static final int zze(zzabw zzabwVar, v vVar, v vVar2, w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzabwVar == zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(zzabw zzabwVar, v vVar, v vVar2, w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        String strValueOf = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        String strValueOf2 = (zIsEmpty || str2.length() < zzabwVar.zza()) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : String.valueOf(str2.charAt(zzabwVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzabwVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzabwVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean zzg(zzabw zzabwVar, v vVar, v vVar2, w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iZze = zze(zzabwVar, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= zzabwVar.zza()) {
                char cCharAt = str2.charAt(zzabwVar.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c10;
        }
        return false;
    }

    private static final boolean zzh(zzabw zzabwVar, v vVar, v vVar2, w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iZze = zze(zzabwVar, vVar, vVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= zzabwVar.zza()) {
                char cCharAt = str3.charAt(zzabwVar.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c10;
        }
        return false;
    }

    private static final zzabx zzi(zzabw zzabwVar, v vVar, v vVar2, w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (zzabx) vVar2.getOrDefault(zzabwVar, zzabx.zzd);
    }
}
