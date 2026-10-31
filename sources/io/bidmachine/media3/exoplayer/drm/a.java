package io.bidmachine.media3.exoplayer.drm;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: ClearKeyUtil.java */
/* JADX INFO: loaded from: classes4.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return l0.f28136a >= 27 ? bArr : l0.u0(c(l0.H(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (l0.f28136a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(l0.H(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return l0.u0(sb2.toString());
        } catch (JSONException e10) {
            r.d("ClearKeyUtil", "Failed to adjust response data: " + l0.H(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
