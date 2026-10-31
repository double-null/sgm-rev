package com.google.firebase.crashlytics.ndk;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class SessionMetadataJsonSerializer {
    private SessionMetadataJsonSerializer() {
    }

    private static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    static String serializeBeginSession(String str, String str2, long j10) {
        HashMap map = new HashMap();
        map.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, str);
        map.put("generator", str2);
        map.put("started_at_seconds", Long.valueOf(j10));
        return new JSONObject(map).toString();
    }

    static String serializeSessionApp(String str, String str2, String str3, String str4, int i10, String str5, String str6) {
        HashMap map = new HashMap();
        map.put("app_identifier", str);
        map.put("version_code", str2);
        map.put("version_name", str3);
        map.put("install_uuid", str4);
        map.put("delivery_mechanism", Integer.valueOf(i10));
        map.put("development_platform", emptyIfNull(str5));
        map.put("development_platform_version", emptyIfNull(str6));
        return new JSONObject(map).toString();
    }

    static String serializeSessionDevice(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("arch", Integer.valueOf(i10));
        map.put("build_model", str);
        map.put("available_processors", Integer.valueOf(i11));
        map.put("total_ram", Long.valueOf(j10));
        map.put("disk_space", Long.valueOf(j11));
        map.put("is_emulator", Boolean.valueOf(z10));
        map.put(ServerProtocol.DIALOG_PARAM_STATE, Integer.valueOf(i12));
        map.put("build_manufacturer", str2);
        map.put("build_product", str3);
        return new JSONObject(map).toString();
    }

    static String serializeSessionOs(String str, String str2, boolean z10) {
        HashMap map = new HashMap();
        map.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, str);
        map.put("build_version", str2);
        map.put("is_rooted", Boolean.valueOf(z10));
        return new JSONObject(map).toString();
    }
}
