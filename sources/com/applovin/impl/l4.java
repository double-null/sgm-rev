package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import s.sBoZ.TwDPD;

/* JADX INFO: loaded from: classes2.dex */
public class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7047b = com.applovin.impl.sdk.l.p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7048c;

    public l4(com.applovin.impl.sdk.l lVar) {
        this.f7046a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f7047b);
        this.f7046a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.p pVarQ = this.f7046a.Q();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Init ");
            sb2.append(d() ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
            sb2.append(" and took ");
            sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb2.append("ms");
            pVarQ.a("OpenMeasurementService", sb2.toString());
        }
        h();
    }

    private void h() {
        this.f7046a.s0().a((k5) new u6(this.f7046a, "OpenMeasurementService", new Runnable() { // from class: com.applovin.impl.vb
            @Override // java.lang.Runnable
            public final void run() {
                this.f8962a.f();
            }
        }), f6.b.OTHER);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = this.f7046a.p0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f7046a.a(z4.f9180a0)).booleanValue()) {
            this.f7046a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7046a.Q().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ub
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8900a.g();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f7048c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f7047b.getResources().openRawResource(R.raw.omsdk_v1_6_2)));
            try {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f7048c = sb2.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb2.append(line);
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e11) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e11);
            }
        } catch (Throwable th3) {
            this.f7046a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7046a.Q().a("OpenMeasurementService", TwDPD.hFpLy, th3);
            }
        }
    }

    public String a() {
        return this.f7048c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.f7046a.a(z4.f9188b0), AppLovinSdk.VERSION);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public String a(String str, Map map) {
        String strInjectScriptContentIntoHtml;
        try {
            if (e()) {
                String strA = m4.a(this.f7046a, map);
                if (StringUtils.isValidString(strA)) {
                    strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(strA, str);
                } else {
                    strInjectScriptContentIntoHtml = str;
                }
            } else {
                strInjectScriptContentIntoHtml = str;
            }
            return ScriptInjector.injectScriptContentIntoHtml(this.f7048c, strInjectScriptContentIntoHtml);
        } catch (Throwable th) {
            this.f7046a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7046a.Q().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }
}
