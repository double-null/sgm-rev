package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.adjust.sdk.AdjustConfig;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes2.dex */
public class Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5819a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f5820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f5821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f5822d;

    public static String getVersion() {
        return "3.62.0";
    }

    public final synchronized void a() {
        if (this.f5819a) {
            return;
        }
        this.f5820b = new d();
        this.f5822d = new c(Build.VERSION.SDK_INT);
        this.f5821c = new NativeLibHelper();
        this.f5819a = true;
    }

    public synchronized void onResume() {
        a();
        d dVar = this.f5820b;
        a aVar = this.f5821c;
        dVar.getClass();
        if (!d.f5824a) {
            ((NativeLibHelper) aVar).a();
        }
    }

    public synchronized void sign(Context context, Map<String, String> map, String str, String str2) {
        a();
        d dVar = this.f5820b;
        c cVar = this.f5822d;
        a aVar = this.f5821c;
        dVar.getClass();
        d.a(context, cVar, aVar, map, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x018e A[Catch: all -> 0x01b8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:10:0x001b, B:12:0x0030, B:13:0x0050, B:15:0x007d, B:17:0x008a, B:19:0x0092, B:21:0x009a, B:23:0x00a2, B:26:0x00ac, B:27:0x0169, B:28:0x0171, B:30:0x018e, B:31:0x01af), top: B:37:0x0001 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x018e, please report this as an issue */
    public synchronized void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        a();
        d dVar = this.f5820b;
        c cVar = this.f5822d;
        a aVar = this.f5821c;
        dVar.getClass();
        if (map == null || map.size() == 0 || map2 == null || map3 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            boolean zEquals = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
            if (zEquals) {
                Log.v("SignerInstance", "SDKv5 Signing all the parameters begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
            }
            HashMap map4 = new HashMap();
            d.a(map.keySet(), map, map4);
            String str = map2.get(GEmOVMyH.DVORKWZjhVMKLs);
            String str2 = map2.get("client_sdk");
            if ("b".equals(map2.get("a"))) {
                d.a(map.keySet(), map, map3);
                d.a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                if (zEquals) {
                    Log.v("SignerInstance", "SDKv5 Signing all the parameters end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
                }
            } else {
                d.a(context, cVar, aVar, map4, str, str2);
                if (map4.containsKey("signature") && map4.containsKey("adj_signing_id") && map4.containsKey("headers_id") && map4.containsKey("algorithm") && map4.containsKey("native_version")) {
                    String str3 = (String) map4.get("adj_signing_id");
                    String str4 = (String) map4.get("headers_id");
                    String str5 = (String) map4.get("signature");
                    String str6 = (String) map4.get("algorithm");
                    String str7 = (String) map4.get("native_version");
                    Locale locale = Locale.US;
                    String str8 = "algorithm=\"" + str6 + "\"";
                    map3.put("authorization", "Signature " + ("signature=\"" + str5 + "\"") + "," + ("adj_signing_id=\"" + str3 + "\"") + "," + str8 + "," + ("headers_id=\"" + str4 + "\"") + "," + ("native_version=\"" + str7 + "\""));
                    d.a(map.keySet(), map, map3);
                    d.a(new HashSet(Arrays.asList("network_payload", "endpoint")), map2, map3);
                    if (zEquals) {
                        Log.v("SignerInstance", "SDKv5 Signing all the parameters end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
                    }
                } else {
                    Log.e("SignerInstance", "sign: Signature generation failed. Exiting...");
                }
            }
        }
    }
}
