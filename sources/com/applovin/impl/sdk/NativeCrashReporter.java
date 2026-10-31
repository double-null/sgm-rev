package com.applovin.impl.sdk;

import com.applovin.impl.f2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NativeCrashReporter implements c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f8242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f8243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final NativeCrashReporter f8244d = new NativeCrashReporter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f8245a = new HashMap();

    private NativeCrashReporter() {
    }

    public static void a(l lVar) {
        if (lVar == null) {
            return;
        }
        if (!((Boolean) lVar.a(z4.f9381w4)).booleanValue() && !q7.k(l.p())) {
            if (f8243c) {
                try {
                    c cVarH = lVar.h();
                    NativeCrashReporter nativeCrashReporter = f8244d;
                    cVarH.b((c.a) nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th) {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    lVar.E().a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List listC = lVar.c(z4.f9390x4);
            int[] iArr = new int[listC.size()];
            for (int i10 = 0; i10 < listC.size(); i10++) {
                try {
                    iArr[i10] = Integer.parseInt((String) listC.get(i10));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(l.p().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, lVar);
            } else if (!file.mkdir()) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f8244d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) lVar.a(z4.f9398y4)).booleanValue());
                if (((Boolean) lVar.a(z4.f9406z4)).booleanValue()) {
                    lVar.h().a((c.a) nativeCrashReporter2);
                }
            } catch (Throwable th2) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                lVar.E().a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z10);

    private native void updateAdInfo(String str);

    private static boolean a() {
        if (!f8242b) {
            f8242b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f8243c = true;
            } catch (Throwable th) {
                p.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return f8243c;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00a5, please report this as an issue */
    private static void a(File file, l lVar) throws Throwable {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            String strF = lVar.I().f(file2);
            if (StringUtils.isValidString(strF)) {
                String[] strArrSplit = strF.split("@@@@@");
                if (strArrSplit.length == 3) {
                    try {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[1];
                        JSONArray jSONArray = new JSONArray(strArrSplit[2]);
                        if (jSONArray.length() == 0) {
                            lVar.E().a(f2.f6481e1, str2, CollectionUtils.hashMap("error_message", str));
                        } else {
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
                                if (jSONObject != null) {
                                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
                                    mapHashMap.put(ShareConstants.FEED_SOURCE_PARAM, str2);
                                    mapHashMap.putAll(JsonUtils.toStringMap(jSONObject));
                                    arrayList.add(mapHashMap);
                                }
                            }
                            lVar.E().a(f2.f6481e1, arrayList, 0L);
                        }
                    } catch (Throwable th) {
                        lVar.Q();
                        if (p.a()) {
                            lVar.Q().a("NativeCrashReporter", "Failed to symbolicate native crash report", th);
                        }
                    }
                } else {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                    }
                }
            } else {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                }
            }
            try {
                if (!file2.delete()) {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().b("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath());
                    }
                }
            } catch (Throwable th2) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().a("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath(), th2);
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.c.a
    public void a(List list) {
        try {
            updateAdInfo(new JSONArray((Collection) list).toString());
        } catch (Throwable unused) {
        }
    }
}
