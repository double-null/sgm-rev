package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfuu implements d1.f.a {
    final /* synthetic */ zzfuw zza;

    zzfuu(zzfuw zzfuwVar) {
        Objects.requireNonNull(zzfuwVar);
        this.zza = zzfuwVar;
    }

    @Override // d1.f.a
    public final void onPostMessage(WebView webView, d1.d dVar, Uri uri, boolean z10, d1.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(dVar.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzfuh.zza.booleanValue();
            }
        } catch (JSONException e10) {
            zzfwf.zza("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}
