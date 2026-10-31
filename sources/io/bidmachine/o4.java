package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.protobuf.AdNetwork;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: NetworkConfigFactory.java */
/* JADX INFO: loaded from: classes4.dex */
class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f20376a = {"network", "format", "ad_units"};

    static NetworkConfig f(Context context, AdNetwork adNetwork) {
        NetworkConfig networkConfigG;
        if (context == null) {
            return null;
        }
        final String name = adNetwork.getName();
        if (TextUtils.isEmpty(name) || (networkConfigG = g(context, name, adNetwork.getCustomParamsMap())) == null) {
            return null;
        }
        for (AdNetwork.AdUnit adUnit : adNetwork.getAdUnitsList()) {
            AdFormat adFormatByRemoteName = AdFormat.byRemoteName(adUnit.getAdFormat());
            if (adFormatByRemoteName != null) {
                networkConfigG.withMediationConfig(adFormatByRemoteName, adUnit.getCustomParamsMap());
            } else {
                io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.j4
                    @Override // qc.b
                    public final Object get() {
                        return o4.j(name);
                    }
                });
            }
        }
        return networkConfigG;
    }

    private static NetworkConfig g(Context context, final String str, Map<String, String> map) {
        h4 h4VarD = g4.d(context, str);
        if (h4VarD == null) {
            return null;
        }
        try {
            return (NetworkConfig) Class.forName(h4VarD.b()).getConstructor(Map.class).newInstance(i(map));
        } catch (Throwable th) {
            io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.n4
                @Override // qc.b
                public final Object get() {
                    return o4.n(str);
                }
            });
            io.bidmachine.core.a.o(th);
            return null;
        }
    }

    static NetworkConfig h(Context context, JSONObject jSONObject) {
        final String string;
        if (context == null) {
            return null;
        }
        try {
            string = jSONObject.getString("network");
            try {
                final NetworkConfig networkConfigG = g(context, string, io.bidmachine.core.h.h0(jSONObject));
                if (networkConfigG == null) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("ad_units");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    AdFormat adFormatByRemoteName = AdFormat.byRemoteName(jSONObject2.getString("format"));
                    if (adFormatByRemoteName != null) {
                        networkConfigG.withMediationConfig(adFormatByRemoteName, i(io.bidmachine.core.h.h0(jSONObject2)));
                    } else {
                        io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.k4
                            @Override // qc.b
                            public final Object get() {
                                return o4.k(string);
                            }
                        });
                    }
                }
                io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.l4
                    @Override // qc.b
                    public final Object get() {
                        return o4.l(networkConfigG);
                    }
                });
                return networkConfigG;
            } catch (Throwable th) {
                th = th;
                io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.m4
                    @Override // qc.b
                    public final Object get() {
                        return o4.m(string);
                    }
                });
                io.bidmachine.core.a.o(th);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            string = null;
        }
    }

    private static Map<String, String> i(Map<String, String> map) {
        if (map != null) {
            try {
                for (String str : f20376a) {
                    map.remove(str);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(String str) {
        return String.format("Network (%s) adUnit register fail: %s not provided", str, "format");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(String str) {
        return String.format("Network (%s) adUnit register fail: %s not provided", str, "format");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(NetworkConfig networkConfig) {
        return String.format("Load network from json config completed successfully: %s", networkConfig.getNetworkKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(String str) {
        return String.format("Network (%s) load fail!", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(String str) {
        return String.format("Network (%s) load fail!", str);
    }
}
