package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i3 extends u2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g3 f6795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f6796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f6797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f6798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f6799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f6800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SpannedString f6801k;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    i3(g3 g3Var, Context context) {
        super(context);
        this.f6795e = g3Var;
        if (g3Var.q() == g3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f6801k = new SpannedString(spannableString);
        } else {
            this.f6801k = new SpannedString("");
        }
        this.f6796f = g();
        this.f6797g = b(g3Var.n());
        this.f6798h = e();
        this.f6799i = a(g3Var.f());
        this.f6800j = j();
        notifyDataSetChanged();
    }

    private t2 f() {
        if (this.f6795e.H()) {
            return null;
        }
        return t2.a().d("Initialization Status").c(f(this.f6795e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private t2 i() {
        t2.b bVarC = t2.a().d("SDK").c(this.f6795e.p());
        if (TextUtils.isEmpty(this.f6795e.p())) {
            bVarC.a(a(this.f6795e.F())).b(b(this.f6795e.F()));
        }
        return bVarC.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f6795e.v())) {
            arrayList.add(t2.a(t2.c.DETAIL).d(this.f6795e.v()).a());
        }
        if (this.f6795e.y() == g3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f6795e.s() != null) {
            arrayList.add(c(this.f6795e.s()));
        }
        arrayList.add(a(this.f6795e.y()));
        return arrayList;
    }

    public boolean a(l2 l2Var) {
        return l2Var.b() == a.TEST_ADS.ordinal() && l2Var.a() == this.f6800j.size() - 1;
    }

    @Override // com.applovin.impl.u2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.u2
    protected List c(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f6796f;
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f6797g;
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f6798h;
        }
        return i10 == a.DEPENDENCIES.ordinal() ? this.f6799i : this.f6800j;
    }

    @Override // com.applovin.impl.u2
    protected int d(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f6796f.size();
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f6797g.size();
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f6798h.size();
        }
        return i10 == a.DEPENDENCIES.ordinal() ? this.f6799i.size() : this.f6800j.size();
    }

    @Override // com.applovin.impl.u2
    protected t2 e(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return new x4("INTEGRATIONS");
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return new x4("PERMISSIONS");
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return new x4("CONFIGURATION");
        }
        return i10 == a.DEPENDENCIES.ordinal() ? new x4("DEPENDENCIES") : new x4("TEST ADS");
    }

    public g3 h() {
        return this.f6795e;
    }

    public void k() {
        this.f6796f = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l1 l1Var = (l1) it.next();
                arrayList.add(a(l1Var.b(), l1Var.a(), l1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r4 r4Var = (r4) it.next();
                arrayList.add(a(r4Var.b(), r4Var.a(), r4Var.c(), true));
            }
        }
        return arrayList;
    }

    private String f(int i10) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i10 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i10 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i10) {
            return "Initialized";
        }
        if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10) {
            return "Failure";
        }
        return MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10 ? "Initializing..." : "Not Initialized";
    }

    private t2 a(g3.b bVar) {
        t2.b bVarA = t2.a();
        if (bVar == g3.b.READY) {
            bVarA.a(this.f8861a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z10) {
        Context context;
        int i10;
        if (z10) {
            context = this.f8861a;
            i10 = R.color.applovin_sdk_checkmarkColor;
        } else {
            context = this.f8861a;
            i10 = R.color.applovin_sdk_xmarkColor;
        }
        return context.getColor(i10);
    }

    private t2 c(List list) {
        return t2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private t2 d() {
        t2.b bVarC = t2.a().d("Adapter").c(this.f6795e.c());
        if (TextUtils.isEmpty(this.f6795e.c())) {
            bVarC.a(a(this.f6795e.z())).b(b(this.f6795e.z()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f6795e.D()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", com.applovin.impl.sdk.l.H0(), true));
        }
        return arrayList;
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z10) {
        Context context;
        int i10;
        if (z10) {
            context = this.f8861a;
            i10 = R.color.applovin_sdk_xmarkColor;
        } else {
            context = this.f8861a;
            i10 = R.color.applovin_sdk_warningColor;
        }
        return context.getColor(i10);
    }

    private t2 a(String str, String str2, boolean z10, boolean z11) {
        return t2.a(z10 ? t2.c.RIGHT_DETAIL : t2.c.DETAIL).d(str).a(z10 ? null : this.f6801k).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? this.f8861a.getColor(R.color.applovin_sdk_checkmarkColor) : d(z11)).a(!z10).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
