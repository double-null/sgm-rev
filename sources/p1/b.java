package p1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import be.LNO.fzLzfW;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.facebook.internal.NativeProtocol;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ze.tmM.zKUlck;

/* JADX INFO: compiled from: MeasurementEvent.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f23430c;

    private b(Context context, String str, Bundle bundle) {
        this.f23428a = context.getApplicationContext();
        this.f23429b = str;
        this.f23430c = bundle;
    }

    private static String b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj.toString();
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj).toString();
            }
            return obj instanceof Map ? new JSONObject((Map) obj).toString() : obj.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private void c() {
        if (this.f23429b == null) {
            Log.d(getClass().getName(), "Event name is required");
        }
        try {
            int i10 = n0.a.f22654h;
            Method method = n0.a.class.getMethod("getInstance", Context.class);
            Method method2 = n0.a.class.getMethod("sendBroadcast", Intent.class);
            Object objInvoke = method.invoke(null, this.f23428a);
            Intent intent = new Intent("com.parse.bolts.measurement_event");
            intent.putExtra("event_name", this.f23429b);
            intent.putExtra("event_args", this.f23430c);
            method2.invoke(objInvoke, intent);
        } catch (Exception unused) {
            Log.d(getClass().getName(), "LocalBroadcastManager in android support library is required to raise bolts event.");
        }
    }

    static void d(Context context, String str, Intent intent, Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (intent != null) {
            Bundle bundleA = a.a(intent);
            if (bundleA != null) {
                bundle = a(context, str, bundleA, intent);
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    bundle.putString("intentData", data.toString());
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    for (String str2 : extras.keySet()) {
                        bundle.putString(str2, b(extras.get(str2)));
                    }
                }
            }
        }
        if (map != null) {
            for (String str3 : map.keySet()) {
                bundle.putString(str3, map.get(str3));
            }
        }
        new b(context, str, bundle).c();
    }

    private static Bundle a(Context context, String str, Bundle bundle, Intent intent) {
        Bundle bundle2 = new Bundle();
        ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity != null) {
            bundle2.putString("class", componentNameResolveActivity.getShortClassName());
        }
        boolean zEquals = "al_nav_out".equals(str);
        String str2 = sRGQSqxgxlS.BEoSAdPSVpbGuEr;
        if (zEquals) {
            if (componentNameResolveActivity != null) {
                bundle2.putString(str2, componentNameResolveActivity.getPackageName());
            }
            if (intent.getData() != null) {
                bundle2.putString(zKUlck.ZSFBNGubfcoHTi, intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("outputURLScheme", intent.getScheme());
            }
        } else if ("al_nav_in".equals(str)) {
            if (intent.getData() != null) {
                bundle2.putString("inputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("inputURLScheme", intent.getScheme());
            }
        }
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj instanceof Bundle) {
                Bundle bundle3 = (Bundle) obj;
                for (String str4 : bundle3.keySet()) {
                    String strB = b(bundle3.get(str4));
                    if (str3.equals("referer_app_link")) {
                        if (str4.equalsIgnoreCase("url")) {
                            bundle2.putString("refererURL", strB);
                        } else if (str4.equalsIgnoreCase(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING)) {
                            bundle2.putString(fzLzfW.ApYRKYDYpovLn, strB);
                        } else if (str4.equalsIgnoreCase(str2)) {
                            bundle2.putString("sourceApplication", strB);
                        }
                    }
                    bundle2.putString(str3 + "/" + str4, strB);
                }
            } else {
                String strB2 = b(obj);
                if (str3.equals("target_url")) {
                    Uri uri = Uri.parse(strB2);
                    bundle2.putString("targetURL", uri.toString());
                    bundle2.putString("targetURLHost", uri.getHost());
                } else {
                    bundle2.putString(str3, strB2);
                }
            }
        }
        return bundle2;
    }
}
