package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.Context;
import com.facebook.appevents.AppEventsConstants;
import io.bidmachine.protobuf.RegsCcpaExtension;
import io.bidmachine.protobuf.sdk.User;
import java.util.List;

/* JADX INFO: compiled from: UserRestrictionParams.java */
/* JADX INFO: loaded from: classes4.dex */
final class w5 implements ga.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f20472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f20473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f20474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<Integer> f20477g;

    w5() {
    }

    private String i() {
        t3 t3VarK = b2.e().k();
        return (String) io.bidmachine.core.h.U(this.f20471a, t3VarK.f(), t3VarK.g());
    }

    private boolean o() {
        Boolean bool = this.f20474d;
        return bool != null && bool.booleanValue();
    }

    private boolean w() {
        t3 t3VarK = b2.e().k();
        Boolean bool = (Boolean) io.bidmachine.core.h.U(this.f20472b, t3VarK.e(), t3VarK.d());
        return bool != null && bool.booleanValue();
    }

    @Override // ga.d
    public boolean a() {
        return (o() || q()) ? false : true;
    }

    @Override // ga.d
    public boolean b() {
        return (o() || q()) ? false : true;
    }

    @Override // ga.d
    public boolean c() {
        return !o();
    }

    void d(Context.Regs.Builder builder) {
        builder.setCoppa(o());
        builder.setGdpr(w());
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            builder.addExtProto(Any.pack(RegsCcpaExtension.newBuilder().setUsPrivacy(strM).build()));
        }
        String strK = k();
        if (!TextUtils.isEmpty(strK)) {
            builder.setGpp(strK);
        }
        List<Integer> listJ = j();
        if (io.bidmachine.core.h.C(listJ)) {
            return;
        }
        builder.addAllGppSid(listJ);
    }

    void e(Context.User.Builder builder) {
        builder.setConsent(l());
    }

    public boolean f() {
        return !o();
    }

    public boolean g() {
        return (o() || q()) ? false : true;
    }

    void h(User.Builder builder) {
        builder.setCoppa(o());
        builder.setGdpr(w());
        builder.setConsent(l());
        String strM = m();
        if (!TextUtils.isEmpty(strM)) {
            builder.setCcpa(strM);
        }
        String strK = k();
        if (!TextUtils.isEmpty(strK)) {
            builder.setGpp(strK);
        }
        List<Integer> listJ = j();
        if (io.bidmachine.core.h.C(listJ)) {
            return;
        }
        builder.addAllGppSid(listJ);
    }

    public List<Integer> j() {
        return (List) io.bidmachine.core.h.T(this.f20477g, b2.e().k().h());
    }

    public String k() {
        return (String) io.bidmachine.core.h.T(this.f20476f, b2.e().k().b());
    }

    public String l() {
        String strI = i();
        if (TextUtils.isEmpty(strI)) {
            return n() ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        return strI;
    }

    public String m() {
        return (String) io.bidmachine.core.h.T(this.f20475e, b2.e().k().c());
    }

    public boolean n() {
        Boolean bool = this.f20473c;
        return bool != null && bool.booleanValue();
    }

    boolean p() {
        return n() || !TextUtils.isEmpty(i());
    }

    public boolean q() {
        return w() && !p();
    }

    public w5 r(boolean z10, String str) {
        this.f20471a = str;
        this.f20473c = Boolean.valueOf(z10);
        return this;
    }

    public w5 s(Boolean bool) {
        this.f20474d = bool;
        return this;
    }

    public w5 t(String str, List<Integer> list) {
        this.f20476f = str;
        this.f20477g = list;
        return this;
    }

    public w5 u(Boolean bool) {
        this.f20472b = bool;
        return this;
    }

    public w5 v(String str) {
        this.f20475e = str;
        return this;
    }
}
