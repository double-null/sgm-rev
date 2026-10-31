package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f6359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f6360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m3 f6361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f6362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f6363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f6364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MaxError f6365m;

    public d6(String str, List list, Map map, Map map2, MaxError maxError, m3 m3Var, com.applovin.impl.sdk.l lVar, boolean z10) {
        super("TaskFireMediationPostbacks", lVar);
        this.f6359g = str + "_urls";
        this.f6360h = list;
        this.f6362j = q7.a(map, lVar);
        this.f6363k = map2 == null ? new HashMap() : map2;
        this.f6365m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f6361i = m3Var;
        HashMap map3 = new HashMap(7);
        map3.put("AppLovin-Event-Type", str);
        if (z10 && m3Var != null) {
            map3.put("AppLovin-Ad-Network-Name", m3Var.c());
        }
        if (m3Var instanceof a3) {
            a3 a3Var = (a3) m3Var;
            map3.put("AppLovin-Ad-Unit-Id", a3Var.getAdUnitId());
            map3.put("AppLovin-Ad-Format", a3Var.getFormat().getLabel());
            if (z10) {
                map3.put("AppLovin-Third-Party-Ad-Placement-Id", a3Var.U());
            }
        }
        if (maxError != null) {
            map3.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map3.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f6364l = map3;
    }

    private void a(String str, Map map) {
        b().h0().e(com.applovin.impl.sdk.network.d.b().d(str).c("POST").a(this.f6364l).a(false).c(map).c(((Boolean) this.f6990a.a(t3.M8)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f6990a.a(t3.G7)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f6360h;
        if (list != null) {
            return list;
        }
        m3 m3Var = this.f6361i;
        if (m3Var != null) {
            return m3Var.b(this.f6359g);
        }
        return null;
    }

    private h g() {
        m3 m3Var = this.f6361i;
        if (m3Var instanceof a3) {
            return ((a3) m3Var).Q().f();
        }
        if (m3Var instanceof f5) {
            return ((f5) m3Var).u().f();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVarG;
        List listF = f();
        if (CollectionUtils.isEmpty(listF)) {
            return;
        }
        Map mapE = e();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(a(b((String) it.next(), this.f6362j), this.f6365m));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            HashMap map = new HashMap(this.f6363k);
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapE.containsKey(queryParameter)) {
                    m3 m3Var = this.f6361i;
                    if (m3Var != null) {
                        map.put(str, m3Var.a((String) mapE.get(queryParameter)));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            Map mapE2 = this.f6990a.B().e();
            for (String str2 : mapE2.keySet()) {
                if (map.containsKey(str2)) {
                    map.put(str2, mapE2.get(str2));
                }
            }
            if (((Boolean) this.f6990a.a(t3.E8)).booleanValue() && (hVarG = g()) != null) {
                map.put("arn_info", hVarG.e());
            }
            a(builderClearQuery.build().toString(), map);
        }
    }

    private String a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }
}
