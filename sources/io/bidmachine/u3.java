package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.vungle.ads.internal.model.Cookie;
import java.util.ArrayList;
import java.util.List;
import k9.dW.xjwcmjDeOXR;

/* JADX INFO: compiled from: IABSharedPreferenceImpl.java */
/* JADX INFO: loaded from: classes4.dex */
class u3 implements t3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f20440b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f20441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f20442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f20445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f20446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Integer> f20447i;

    /* JADX INFO: compiled from: IABSharedPreferenceImpl.java */
    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            u3.this.n(sharedPreferences, str);
        }
    }

    u3() {
    }

    private void j(SharedPreferences sharedPreferences) {
        this.f20443e = wb.x.e(sharedPreferences, "IABConsent_ConsentString", null);
    }

    private void k(SharedPreferences sharedPreferences) {
        String strE = wb.x.e(sharedPreferences, "IABConsent_SubjectToGDPR", null);
        this.f20441c = strE != null ? Boolean.valueOf(strE.equals(AppEventsConstants.EVENT_PARAM_VALUE_YES)) : null;
    }

    private void m(SharedPreferences sharedPreferences) {
        this.f20446h = wb.x.e(sharedPreferences, "IABGPP_HDR_GppString", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(SharedPreferences sharedPreferences, String str) {
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "IABTCF_gdprApplies":
                o(sharedPreferences);
                break;
            case "IABGPP_GppSID":
                l(sharedPreferences);
                break;
            case "IABUSPrivacy_String":
                q(sharedPreferences);
                break;
            case "IABConsent_ConsentString":
                j(sharedPreferences);
                break;
            case "IABTCF_TCString":
                p(sharedPreferences);
                break;
            case "IABConsent_SubjectToGDPR":
                k(sharedPreferences);
                break;
            case "IABGPP_HDR_GppString":
                m(sharedPreferences);
                break;
        }
    }

    private void o(SharedPreferences sharedPreferences) {
        int iC = wb.x.c(sharedPreferences, Cookie.IABTCF_GDPR_APPLIES, -1);
        if (iC == 1) {
            this.f20442d = Boolean.TRUE;
        } else if (iC == 0) {
            this.f20442d = Boolean.FALSE;
        } else {
            this.f20442d = null;
        }
    }

    private void p(SharedPreferences sharedPreferences) {
        this.f20444f = wb.x.e(sharedPreferences, Cookie.IABTCF_TC_STRING, null);
    }

    private void q(SharedPreferences sharedPreferences) {
        this.f20445g = wb.x.e(sharedPreferences, "IABUSPrivacy_String", null);
    }

    @Override // io.bidmachine.t3
    public void a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.f20440b);
        for (String str : t3.f20423a) {
            n(defaultSharedPreferences, str);
        }
    }

    @Override // io.bidmachine.t3
    public String b() {
        return this.f20446h;
    }

    @Override // io.bidmachine.t3
    public String c() {
        return this.f20445g;
    }

    @Override // io.bidmachine.t3
    public Boolean d() {
        return this.f20441c;
    }

    @Override // io.bidmachine.t3
    public Boolean e() {
        return this.f20442d;
    }

    @Override // io.bidmachine.t3
    public String f() {
        return this.f20444f;
    }

    @Override // io.bidmachine.t3
    public String g() {
        return this.f20443e;
    }

    @Override // io.bidmachine.t3
    public List<Integer> h() {
        return this.f20447i;
    }

    private void l(SharedPreferences sharedPreferences) {
        String strE = wb.x.e(sharedPreferences, "IABGPP_GppSID", null);
        if (TextUtils.isEmpty(strE)) {
            this.f20447i = null;
            return;
        }
        try {
            String[] strArrSplit = strE.split(xjwcmjDeOXR.zQsFRoWHvXdOi);
            if (strArrSplit.length == 0) {
                this.f20447i = null;
                return;
            }
            this.f20447i = new ArrayList();
            for (String str : strArrSplit) {
                Integer numY = io.bidmachine.core.h.Y(str, null);
                if (numY != null) {
                    this.f20447i.add(numY);
                }
            }
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            this.f20447i = null;
        }
    }
}
