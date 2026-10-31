package io.bidmachine;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: NetworkAssetManager.java */
/* JADX INFO: loaded from: classes4.dex */
class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map<String, h4> f17582a = new ConcurrentHashMap();

    private static h4 a(AssetManager assetManager, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strF = f(assetManager, str);
            if (TextUtils.isEmpty(strF)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strF);
            String strOptString = jSONObject.optString("name");
            String strOptString2 = jSONObject.optString(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
            String strOptString3 = jSONObject.optString("classpath");
            String strOptString4 = jSONObject.optString("sdk_version");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4)) {
                return new h4(strOptString, strOptString2, strOptString3, strOptString4);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static h4 b(AssetManager assetManager, String str) {
        h4 h4VarA = a(assetManager, str);
        if (h4VarA != null) {
            f17582a.put(h4VarA.c(), h4VarA);
        }
        return h4VarA;
    }

    static void c(Context context) {
        String[] list;
        if (f17582a.isEmpty()) {
            try {
                AssetManager assets = context.getAssets();
                if (assets == null || (list = assets.list("bm_networks")) == null) {
                    return;
                }
                for (String str : list) {
                    b(assets, str);
                }
            } catch (Exception unused) {
            }
        }
    }

    static h4 d(Context context, String str) {
        Map<String, h4> map = f17582a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        try {
            AssetManager assets = context.getAssets();
            if (assets == null) {
                return null;
            }
            return b(assets, str + ".bmnetwork");
        } catch (Exception unused) {
            return null;
        }
    }

    static Map<String, h4> e(Context context) {
        Map<String, h4> map = f17582a;
        if (!map.isEmpty()) {
            return map;
        }
        c(context);
        return map;
    }

    private static String f(AssetManager assetManager, String str) {
        try {
            return io.bidmachine.core.h.g0(assetManager.open("bm_networks/" + str));
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            return null;
        }
    }
}
