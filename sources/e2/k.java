package e2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MetadataBackendRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f13946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f13947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, m> f13948c;

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // e2.e
    public synchronized m a(String str) {
        if (this.f13948c.containsKey(str)) {
            return this.f13948c.get(str);
        }
        d dVarB = this.f13946a.b(str);
        if (dVarB == null) {
            return null;
        }
        m mVarCreate = dVarB.create(this.f13947b.a(str));
        this.f13948c.put(str, mVarCreate);
        return mVarCreate;
    }

    /* JADX INFO: compiled from: MetadataBackendRegistry.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f13949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, String> f13950b = null;

        a(Context context) {
            this.f13949a = context;
        }

        private Map<String, String> c() {
            if (this.f13950b == null) {
                this.f13950b = a(this.f13949a);
            }
            return this.f13950b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }

        private Map<String, String> a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith(WKirgUEJJ.mRJAMzv)) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }
    }

    k(a aVar, i iVar) {
        this.f13948c = new HashMap();
        this.f13946a = aVar;
        this.f13947b = iVar;
    }
}
