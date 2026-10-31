package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcn {
    public String zza;
    public String zzb;
    public String zzc;
    public String zzf;
    public int zzg = 1;
    public List zzd = Collections.emptyList();
    public List zze = Collections.emptyList();
    public int zzh = 1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x015d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0117  */
    public static zzcn zza(JsonReader jsonReader) throws IOException {
        byte b10;
        byte b11;
        int i10;
        zzcn zzcnVar = new zzcn();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int i11 = 4;
            int i12 = 3;
            switch (jsonReader.nextName()) {
                case "consent_signal":
                    String strNextString = jsonReader.nextString();
                    switch (strNextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i11 = 1;
                            zzcnVar.zzg = i11;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i11 = 2;
                            zzcnVar.zzg = i11;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i11 = 3;
                            zzcnVar.zzg = i11;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            zzcnVar.zzg = i11;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i11 = 5;
                            zzcnVar.zzg = i11;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            i11 = 6;
                            zzcnVar.zzg = i11;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            i11 = 7;
                            zzcnVar.zzg = i11;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i11 = 8;
                            zzcnVar.zzg = i11;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                    }
                    break;
                case "consent_form_payload":
                    zzcnVar.zza = jsonReader.nextString();
                    break;
                case "consent_form_base_url":
                    zzcnVar.zzb = jsonReader.nextString();
                    break;
                case "error_message":
                    zzcnVar.zzc = jsonReader.nextString();
                    break;
                case "request_info_keys":
                    zzcnVar.zzd = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzcnVar.zzd.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case "actions":
                    zzcnVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzcm zzcmVar = new zzcm();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            int iHashCode = strNextName.hashCode();
                            if (iHashCode != -2105551094) {
                                if (iHashCode == 1583758243 && strNextName.equals(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strNextName.equals("args_json")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            if (b10 == 0) {
                                String strNextString2 = jsonReader.nextString();
                                int iHashCode2 = strNextString2.hashCode();
                                if (iHashCode2 != 64208429) {
                                    if (iHashCode2 != 82862015) {
                                        if (iHashCode2 == 1856333582 && strNextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                            b11 = 0;
                                        } else {
                                            b11 = -1;
                                        }
                                    } else if (strNextString2.equals("WRITE")) {
                                        b11 = 1;
                                    } else {
                                        b11 = -1;
                                    }
                                } else if (strNextString2.equals("CLEAR")) {
                                    b11 = 2;
                                } else {
                                    b11 = -1;
                                }
                                if (b11 == 0) {
                                    i10 = 1;
                                } else if (b11 == 1) {
                                    i10 = 2;
                                } else {
                                    if (b11 != 2) {
                                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString2));
                                    }
                                    i10 = 3;
                                }
                                zzcmVar.zzb = i10;
                            } else if (b10 != 1) {
                                jsonReader.skipValue();
                            } else {
                                zzcmVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzcnVar.zze.add(zzcmVar);
                    }
                    jsonReader.endArray();
                    break;
                case "privacy_options_required":
                    String strNextString3 = jsonReader.nextString();
                    int iHashCode3 = strNextString3.hashCode();
                    if (iHashCode3 != -1888946261) {
                        if (iHashCode3 != 389487519) {
                            if (iHashCode3 != 433141802 || !strNextString3.equals("UNKNOWN")) {
                            }
                        } else if (strNextString3.equals("REQUIRED")) {
                        }
                    } else if (strNextString3.equals("NOT_REQUIRED")) {
                    }
                    if (r8 == 0) {
                        i12 = 1;
                    } else if (r8 == 1) {
                        i12 = 2;
                    } else if (r8 != 2) {
                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString3));
                    }
                    zzcnVar.zzh = i12;
                    break;
                case "client_side_pingback_url":
                    zzcnVar.zzf = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzcnVar;
    }
}
